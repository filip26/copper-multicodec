package com.apicatalog.multihash;

import java.util.Optional;

import com.apicatalog.uvarint.UVarInt;

public class MultihashDecoder {

    private final MultihashRegistry registry;

    protected MultihashDecoder(MultihashRegistry registry) {
        this.registry = registry;
    }

    public static MultihashDecoder getInstance(Multihash... codecs) {
        return new MultihashDecoder(MultihashRegistry.getInstance(codecs));
    }

    /**
     * Creates a new instance initialized with all supported codecs.
     * 
     * @return a new instance
     */
    public static MultihashDecoder getInstance() {
        return new MultihashDecoder(MultihashRegistry.getInstance());
    }

    /**
     * Finds multihash in the registry if exists
     * 
     * @param encoded a byte array encoded as multihash
     * 
     * @return multihash or an empty {@link Optional} if the multihash does not
     *         exist
     */
    public Optional<Multihash> get(final byte[] encoded) {

        if (encoded == null) {
            throw new IllegalArgumentException("The encoded value must not be null.");
        }

        if (encoded.length == 0) {
            throw new IllegalArgumentException("The encoded value be non empty byte array.");
        }

        final long code = UVarInt.decode(encoded);

        return registry.get(code);
    }

    public MultihashRegistry getRegistry() {
        return registry;
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
        return get(encoded)
                .map(codec -> codec.decode(encoded))
                .orElseThrow(() -> new IllegalArgumentException("Unsupported multicode encoding [" + String.format("0x%hh, 0x%hh, ...", encoded[0], encoded[1]) + "]."));
    }
}
