package com.apicatalog.multicodec;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.apicatalog.multicodec.Multicodec.Tag;
import com.apicatalog.uvarint.UVarInt;

/**
 *
 * @see <a href=
 *      "https://github.com/multiformats/multicodec/blob/master/table.csv">Codes
 *      Table</a>
 *
 */
public final class Multicoder {

    private final Map<Long, Multicodec> codecs;

    protected Multicoder(Map<Long, Multicodec> codecs) {
        this.codecs = codecs;
    }

    public static Multicoder getInstance(Multicodec... codecs) {
        return new Multicoder(
                Arrays.stream(codecs)
                        .collect(Collectors.toMap(Multicodec::code, Function.identity())));
    }

    /**
     * Creates a new instance initialized with codecs matching the provided tags.
     * See {@link MulticodecRegistry} for the complete list of included codecs.
     * 
     * @param tags a tag or a list of tags to match
     * @return a new instance
     */
    public static Multicoder getInstance(Tag... tags) {
        return new Multicoder(
                new TreeMap<>(
                        MulticodecRegistry.CODECS.values().stream()
                                .filter(codec -> tags.length == 1
                                        ? tags[0] == codec.tag()
                                        : Arrays.stream(tags).anyMatch(tag -> tag == codec.tag()))
                                .collect(Collectors.toMap(Multicodec::code, Function.identity()))));
    }

    /**
     * Creates a new instance initialized with all codecs listed in
     * {@link MulticodecRegistry}.
     * 
     * @return a new instance
     */
    public static Multicoder getInstance() {
        return new Multicoder(MulticodecRegistry.CODECS);
    }

    /**
     * Finds a codec in the registry if exists
     * 
     * @param encoded a byte array identifying a multicodec
     * 
     * @return a codec or an empty {@link Optional} if the multicodec does not exist
     */
    public Optional<Multicodec> getCodec(final byte[] encoded) {

        if (encoded == null) {
            throw new IllegalArgumentException("The encoded value must not be null.");
        }

        if (encoded.length == 0) {
            throw new IllegalArgumentException("The encoded value be non empty byte array.");
        }

        final long code = UVarInt.decode(encoded);

        return Optional.ofNullable(codecs.get(code));
    }

    /**
     * Decode an encoded value
     * 
     * @param encoded to decode
     * @return a decoded value
     * 
     * @throws IllegalArgumentException if the value cannot be decoded
     */
    public byte[] decode(final byte[] encoded) throws IllegalArgumentException {
        return getCodec(encoded)
                .map(codec -> codec.decode(encoded))
                .orElseThrow(() -> new IllegalArgumentException("Unsupported multicode encoding [" + String.format("0x%hh, 0x%hh, ...", encoded[0], encoded[1]) + "]."));
    }
}
