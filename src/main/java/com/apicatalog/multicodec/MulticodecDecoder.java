package com.apicatalog.multicodec;

import java.util.Objects;
import java.util.Optional;

import com.apicatalog.multicodec.Multicodec.Tag;
import com.apicatalog.multicodec.codec.MulticodecRegistry;
import com.apicatalog.uvarint.UVarInt;

/**
 *
 * @see <a href=
 *      "https://github.com/multiformats/multicodec/blob/master/table.csv">Codes
 *      Table</a>
 *
 */
public class MulticodecDecoder {

    private final MulticodecRegistry registry;

    protected MulticodecDecoder(MulticodecRegistry registry) {
        this.registry = registry;
    }

    public static MulticodecDecoder getInstance(Multicodec... codecs) {
        return new MulticodecDecoder(MulticodecRegistry.getInstance(codecs));
    }

    /**
     * Creates a new instance initialized with codecs matching the provided tags.
     * See <code>codec</code> package for the complete list of included codecs.
     * 
     * @param tags a tag or a list of tags to match
     * @return a new instance
     */
    public static MulticodecDecoder getInstance(Tag... tags) {
        return new MulticodecDecoder(MulticodecRegistry.getInstance(tags));
    }

    /**
     * Creates a new instance initialized with all supported codecs.
     * 
     * @return a new instance
     */
    public static MulticodecDecoder getInstance() {
        return new MulticodecDecoder(MulticodecRegistry.getInstance());
    }

    /**
     * Finds a codec in the registry if exists
     * 
     * @param encoded a byte array encoded as multicodec
     * 
     * @return codec or an empty {@link Optional} if the multicodec does not exist
     */
    public Optional<Multicodec> getCodec(final byte[] encoded) {

        Objects.requireNonNull(encoded);

        if (encoded.length == 0) {
            throw new IllegalArgumentException("The encoded value be non empty byte array.");
        }

        final long code = UVarInt.decode(encoded);

        return registry.getCodec(code);
    }

    public MulticodecRegistry getRegistry() {
        return registry;
    }

    /**
     * Decode an encoded value
     * 
     * @param encoded to decode
     * @return decoded value
     * 
     * @throws IllegalArgumentException if the value cannot be decoded
     */
    public byte[] decode(final byte[] encoded) throws IllegalArgumentException {
        return getCodec(encoded)
                .map(codec -> codec.decode(encoded))
                .orElseThrow(() -> new IllegalArgumentException("Unsupported multicode encoding [" + String.format("0x%hh, 0x%hh, ...", encoded[0], encoded[1]) + "]."));
    }
}
