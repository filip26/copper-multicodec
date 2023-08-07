package com.apicatalog.multicodec;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.apicatalog.multicodec.Codec.Tag;

/**
 *
 * @see <a href=
 *      "https://github.com/multiformats/multicodec/blob/master/table.csv">Codes
 *      Table</a>
 *
 */
public final class Multicodec {

    public static Codec IDENTITY = new Codec("identity", Tag.MultiHash, new byte[] { (byte) 0x00 });
    
    public static Codec Ed25519_PUBLIC_KEY = new Codec("ed25519-pub", Tag.Key, new byte[] { (byte) 0xed, (byte) 0x01 });
    public static Codec Ed25519_PRIVATE_KEY = new Codec("ed25519-priv", Tag.Key, new byte[] { (byte) 0x13, (byte) 0x00 });
    
    public static Codec X25519_PUBLIC_KEY = new Codec("x25519-pub", Tag.Key, new byte[] { (byte) 0xec });
    public static Codec X25519_PRIVATE_KEY = new Codec("x25519-priv", Tag.Key, new byte[] { (byte) 0x13, (byte)0x02 });
    
    public static Codec P256PublicKey = new Codec("p256-pub", Tag.Key, new byte[] { (byte) 0x80, (byte) 0x24 });
    public static Codec P256PrivateKey = new Codec("p256-priv", Tag.Key, new byte[] { (byte) 0x86, (byte) 0x26 });
    
    public static Codec P384PublicKey = new Codec("p384-pub", Tag.Key, new byte[] { (byte) 0x81, (byte) 0x24 });
    public static Codec P384PrivateKey = new Codec("p384-priv", Tag.Key, new byte[] { (byte) 0x87, (byte) 0x24 });
    
    public static Codec P521PublicKey = new Codec("p521-pub", Tag.Key, new byte[] { (byte) 0x82, (byte) 0x26 });
    public static Codec P521PrivateKey = new Codec("p521-priv", Tag.Key, new byte[] { (byte) 0x88, (byte) 0x26 });

    private final Map<Integer, Codec> codecs;

    protected Multicodec(Map<Integer, Codec> codecs) {
        this.codecs = codecs;
    }

    public static Multicodec getInstance() {
        return new Multicodec(new HashMap<>());
    }

    /**
     * Adds a new code to the registry.
     * 
     * @param codec a new codec to add
     */
    public Multicodec add(final Codec codec) {
        codecs.put(codec.asInteger(), codec);
        return this;
    }

    /**
     * Finds key codec in the registry if exists
     * 
     * @param code a byte array identifying a multicodec
     * @return key codec or an empty {@link Optional} if the multicodec does not
     *         exist
     */
    public Optional<Codec> findKey(byte[] code) {
        return Optional.ofNullable(codecs.get(new BigInteger(code).intValue()));
    }

    /**
     * Finds a codec in the registry if exists
     * 
     * @param type    a multicodec type
     * @param encoded a byte array identifying a multicodec
     * @return a codec or an empty {@link Optional} if the multicodec does not exist
     */
    public Optional<Codec> codec(Tag type, final byte[] encoded) {

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
    public byte[] encode(Codec codec, byte[] value) {

        final byte[] encoded = new byte[codec.length() + value.length];

        System.arraycopy(codec.code(), 0, encoded, 0, codec.length());
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
    public byte[] decode(final Codec codec, final byte[] encoded) {
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
    public byte[] decode(final Tag type, final byte[] encoded) throws IllegalArgumentException {
        return codec(type, encoded)
                .map(codec -> decode(codec, encoded))
                .orElseThrow(() -> new IllegalArgumentException("Unsupported multicode encoding [" + String.format("0x%hh, 0x%hh, ...", encoded[0], encoded[1]) + "]."));
    }
}
