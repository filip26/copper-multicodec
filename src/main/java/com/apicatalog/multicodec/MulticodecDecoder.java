package com.apicatalog.multicodec;

import java.util.Objects;
import java.util.Optional;

import com.apicatalog.multicodec.Multicodec.Tag;
import com.apicatalog.multicodec.codec.MulticodecRegistry;
import com.apicatalog.uvarint.UVarInt;

/**
 * A decoder for data encoded using the
 * <a href="https://github.com/multiformats/multicodec">multicodec</a> format.
 * 
 * <p>
 * This class uses a {@link MulticodecRegistry} to look up codecs by their
 * identifiers, and can decode encoded byte arrays back to their original data.
 * </p>
 *
 * @see <a href=
 *      "https://github.com/multiformats/multicodec/blob/master/table.csv">
 *      Multicodec Codes Table</a>
 */
public class MulticodecDecoder {

    protected final MulticodecRegistry registry;

    /**
     * Creates a new decoder backed by the given registry.
     *
     * @param registry the multicodec registry
     */
    protected MulticodecDecoder(MulticodecRegistry registry) {
        this.registry = registry;
    }

    /**
     * Creates a new {@code MulticodecDecoder} instance initialized with all
     * supported codecs.
     * 
     * @return a new decoder instance containing all known codecs
     */
    public static MulticodecDecoder getInstance() {
        return new MulticodecDecoder(MulticodecRegistry.getInstance());
    }

    /**
     * Creates a new {@code MulticodecDecoder} instance initialized with codecs
     * matching the provided tags.
     * 
     * <p>
     * See the {@code codec} package for the complete list of included codecs.
     * </p>
     * 
     * @param tags one or more codec tags to match
     * @return a new decoder instance containing only codecs with matching tags
     */
    public static MulticodecDecoder getInstance(Tag... tags) {
        return new MulticodecDecoder(MulticodecRegistry.getInstance(tags));
    }

    /**
     * Creates a new {@code MulticodecDecoder} instance initialized with the given
     * codecs.
     * 
     * @param codecs one or more codecs to register
     * @return a new decoder instance containing only the provided codecs
     */
    public static MulticodecDecoder getInstance(Multicodec... codecs) {
        return new MulticodecDecoder(MulticodecRegistry.getInstance(codecs));
    }

    /**
     * Finds the codec in the registry corresponding to the given encoded value.
     * 
     * @param encoded a byte array encoded as a multicodec value
     * @return an {@link Optional} containing the matching codec, or an empty
     *         Optional if no match exists
     * @throws NullPointerException     if {@code encoded} is {@code null}
     * @throws IllegalArgumentException if {@code encoded} is empty
     */
    public Optional<Multicodec> getCodec(final byte[] encoded) {

        Objects.requireNonNull(encoded);

        if (encoded.length == 0) {
            throw new IllegalArgumentException("The encoded value be non empty byte array.");
        }

        final long code = UVarInt.decode(encoded);

        return registry.getCodec(code);
    }

    /**
     * Decodes the given encoded value by first determining its codec from the
     * registry, then removing its multicodec prefix.
     * 
     * @param encoded the encoded byte array to decode
     * @return the decoded (original) byte array
     * @throws NullPointerException     if {@code encoded} is {@code null}
     * @throws IllegalArgumentException if no codec can decode the value
     */
    public byte[] decode(final byte[] encoded) throws IllegalArgumentException {
        return getCodec(encoded)
                .map(codec -> codec.decode(encoded))
                .orElseThrow(() -> new IllegalArgumentException("Unsupported multicode encoding [" + String.format("0x%hh, 0x%hh, ...", encoded[0], encoded[1]) + "]."));
    }

    /**
     * Returns the underlying codec registry used by this decoder.
     * 
     * @return the codec registry
     */
    public MulticodecRegistry getRegistry() {
        return registry;
    }
}
