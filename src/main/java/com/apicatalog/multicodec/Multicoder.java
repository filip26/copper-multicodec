package com.apicatalog.multicodec;

import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.apicatalog.multicodec.Multicodec.Tag;

/**
 *
 * @see <a href=
 *      "https://github.com/multiformats/multicodec/blob/master/table.csv">Codes
 *      Table</a>
 *
 */
public final class Multicoder {

    private final Map<String, Multicodec> codecs;

    protected Multicoder(Map<String, Multicodec> codecs) {
        this.codecs = codecs;
    }

    public static Multicoder getEmptyInstance() {
        return new Multicoder(new HashMap<>());
    }

    /**
     * Adds a new code to the registry.
     * 
     * @param codec a new codec to add
     */
    public Multicoder add(final Multicodec codec) {
        codecs.put(varintToKey(codec.varint()), codec);
        return this;
    }

    /**
     * Finds key codec in the registry if exists
     * 
     * @param code a byte array identifying a multicodec
     * @return key codec or an empty {@link Optional} if the multicodec does not
     *         exist
     */
    private Optional<Multicodec> findKey(byte[] code) {
        return Optional.ofNullable(codecs.get(varintToKey(code)));
    }

    /**
     * Finds a codec in the registry if exists
     * 
     * @param type    a multicodec type
     * @param encoded a byte array identifying a multicodec
     * @return a codec or an empty {@link Optional} if the multicodec does not exist
     */
    public Optional<Multicodec> getCodec(final Tag type, final byte[] encoded) {

        if (encoded == null) {
            throw new IllegalArgumentException("The encoded value must not be null.");
        }

        if (encoded.length == 0) {
            throw new IllegalArgumentException("The encoded value be non empty byte array.");
        }

        switch (type) {
        case Key:
            if (encoded.length >= 4) {
                return Optional.ofNullable(findKey(Arrays.copyOf(encoded, 4)) // try first 4 bytes
                        .orElseGet(() -> findKey(Arrays.copyOf(encoded, 2)) // try first 2 bytes
                                .orElseGet(() -> findKey(Arrays.copyOf(encoded, 1)) // try the first byte
                                        .orElse(null))));
            }
            if (encoded.length >= 2) {
                return Optional.ofNullable(
                        findKey(Arrays.copyOf(encoded, 2)) // try first 2 bytes
                                .orElseGet(() -> findKey(Arrays.copyOf(encoded, 1)) // try the first byte
                                        .orElse(null)));

            }

            return findKey(Arrays.copyOf(encoded, 1));

        default:
            break;
        }

        throw new IllegalArgumentException("Unsupported type [" + type + "].");
    }

    /**
     * Decode an encoded value
     * 
     * @param type    multicodec type used to encode the value
     * @param encoded to decode
     * @return a decoded value
     * 
     * @throws IllegalArgumentException if the value cannot be decoded
     */
    public byte[] decode(final Tag type, final byte[] encoded) throws IllegalArgumentException {
        return getCodec(type, encoded)
                .map(codec -> codec.decode(encoded))
                .orElseThrow(() -> new IllegalArgumentException("Unsupported multicode encoding [" + String.format("0x%hh, 0x%hh, ...", encoded[0], encoded[1]) + "]."));
    }

    public final static String varintToKey(byte[] varint) {
        final StringWriter writer = new StringWriter(varint.length * 2);
        for (int i = 0; i < varint.length; i++) {
            writer.write(String.format("%02x", varint[i]));
        }
        return writer.toString();
    }
}
