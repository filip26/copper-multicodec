package com.apicatalog.multicodec;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.apicatalog.uvarint.UVarIntInputStream;

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

    public static Multicoder getEmptyInstance() {
        return new Multicoder(new HashMap<>());
    }

    /**
     * Adds a new code to the registry.
     * 
     * @param codec a new codec to add
     */
    public Multicoder add(final Multicodec codec) {
        codecs.put(codec.code(), codec);
        return this;
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

        final long code = UVarIntInputStream.readLong(encoded);
        
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
