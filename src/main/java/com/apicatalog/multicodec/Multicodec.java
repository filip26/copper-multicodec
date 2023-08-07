package com.apicatalog.multicodec;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @see <a href=
 *      "https://github.com/multiformats/multicodec/blob/master/table.csv">Codes
 *      Table</a>
 *
 */
public final class Multicodec {

    /**
     * Recognized multicodec types
     */
    public enum Type {
        Key,
        Multihash,
    }

    /**
     * Recognized codecs
     */
    public enum Codec {
        Identity(Type.Multihash, new byte[] { (byte) 0x00 }),

        Ed25519PublicKey(Type.Key, new byte[] { (byte) 0xed, (byte) 0x01 }),
        Ed25519PrivateKey(Type.Key, new byte[] { (byte) 0x13, (byte) 0x00 }),

        X25519PublicKey(Type.Key, new byte[] { (byte) 0xec }),

        P256PublicKey(Type.Key, new byte[] { (byte) 0x80, (byte) 0x24 }),
        P256PrivateKey(Type.Key, new byte[] { (byte) 0x86, (byte) 0x26 }),

        P384PublicKey(Type.Key, new byte[] { (byte) 0x81, (byte) 0x24 }),
        P384PrivateKey(Type.Key, new byte[] { (byte) 0x87, (byte) 0x24 }),

        P512PublicKey(Type.Key, new byte[] { (byte) 0x82, (byte) 0x26 }),
        P512PrivateKey(Type.Key, new byte[] { (byte) 0x88, (byte) 0x26 });

        private final byte[] code;
        private final Type type;

        Codec(Type type, byte[] code) {
            this.type = type;
            this.code = code;
        }

        public int length() {
            return code.length;
        }

        public int asInteger() {
            return new BigInteger(code).intValue();
        }

        public byte[] code() {
            return code;
        }

        public Type type() {
            return type;
        }
    }

    static Map<Integer, Codec> KEY_REGISTRY = new HashMap<>();

    static {
        add(Codec.Identity);
        add(Codec.Ed25519PublicKey);
        add(Codec.Ed25519PrivateKey);
        add(Codec.X25519PublicKey);
        add(Codec.P256PrivateKey);
        add(Codec.P256PrivateKey);
        add(Codec.P256PublicKey);
        add(Codec.P256PublicKey);
        add(Codec.P384PrivateKey);
        add(Codec.P384PublicKey);
        add(Codec.P384PublicKey);
        add(Codec.P512PrivateKey);
        add(Codec.P512PublicKey);
    }

    /**
     * Adds a new code to the registry.
     * 
     * @param codec a new codec to add
     */
    static void add(final Codec codec) {
        KEY_REGISTRY.put(codec.asInteger(), codec);
    }

    /**
     * Finds key codec in the registry if exists
     * 
     * @param code a byte array identifying a multicodec
     * @return key codec or an empty {@link Optional} if the multicodec does not
     *         exist
     */
    static Optional<Codec> findKey(byte[] code) {
        return Optional.ofNullable(KEY_REGISTRY.get(new BigInteger(code).intValue()));
    }

    /**
     * Finds a codec in the registry if exists
     * 
     * @param type    a multicodec type
     * @param encoded a byte array identifying a multicodec
     * @return a codec or an empty {@link Optional} if the multicodec does not exist
     */
    public static Optional<Codec> codec(Type type, final byte[] encoded) {

        switch (type) {
        case Key:
            return Optional.ofNullable(findKey(Arrays.copyOf(encoded, 4)) // try first 4 bytes
                    .orElseGet(() -> findKey(Arrays.copyOf(encoded, 2)) // try first 2 bytes
                            .orElseGet(() -> findKey(Arrays.copyOf(encoded, 1)) // try the first byte
                                    .orElse(null))));

        default:
            break;
        }

        throw new IllegalArgumentException("Unsupported type [" + type + "].");
    }

    /**
     * Encode a value with a codec.
     * 
     * @param codec to encode the value
     * @param value a value to encode
     * @return an encoded value
     */
    public static byte[] encode(Codec codec, byte[] value) {

        final byte[] encoded = new byte[codec.length() + value.length];

        System.arraycopy(codec.code, 0, encoded, 0, codec.length());
        System.arraycopy(value, 0, encoded, codec.length(), value.length);

        return encoded;
    }

    /**
     * Decode an encoded value
     * 
     * @param codec   used to encode the value
     * @param encoded value to decode
     * @return a decoded value
     */
    public static byte[] decode(final Codec codec, final byte[] encoded) {
        return Arrays.copyOfRange(encoded, codec.length(), encoded.length);
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
    public static byte[] decode(final Type type, final byte[] encoded) throws IllegalArgumentException {
        return codec(type, encoded)
                .map(codec -> decode(codec, encoded))
                .orElseThrow(() -> new IllegalArgumentException("Unsupported multicode encoding [" + String.format("0x%hh, 0x%hh, ...", encoded[0], encoded[1]) + "]."));
    }
}
