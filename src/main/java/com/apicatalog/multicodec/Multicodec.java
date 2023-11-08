package com.apicatalog.multicodec;

import java.util.Arrays;

public class Multicodec {

    /**
     * Recognized multicodec tags
     */
    public enum Tag {
        Key,
        Multihash,
        Multiaddr,
        Hash,
        Cid,
        Namespace,
        Multiformat,
        Serialization,
        Transport,
        Varsig,
    }

//    public static Multicodec IDENTITY = new Multicodec("identity", Tag.Multihash, new byte[] { (byte) 0x00 });
//
//    public static Multicodec Ed25519_PUBLIC_KEY = new Multicodec("ed25519-pub", Tag.Key, new byte[] { (byte) 0xed, (byte) 0x01 });
//    public static Multicodec Ed25519_PRIVATE_KEY = new Multicodec("ed25519-priv", Tag.Key, new byte[] { (byte) 0x13, (byte) 0x00 });
//
//    public static Multicodec X25519_PUBLIC_KEY = new Multicodec("x25519-pub", Tag.Key, new byte[] { (byte) 0xec });
//    public static Multicodec X25519_PRIVATE_KEY = new Multicodec("x25519-priv", Tag.Key, new byte[] { (byte) 0x13, (byte) 0x02 });
//
//    public static Multicodec P256_PUBLIC_KEY = new Multicodec("p256-pub", Tag.Key, new byte[] { (byte) 0x80, (byte) 0x24 });
//    public static Multicodec P256_PRIVATE_KEY = new Multicodec("p256-priv", Tag.Key, new byte[] { (byte) 0x86, (byte) 0x26 });
//
//    public static Multicodec P384_PUBLIC_KEY = new Multicodec("p384-pub", Tag.Key, new byte[] { (byte) 0x81, (byte) 0x24 });
//    public static Multicodec P384_PRIVATE_KEY = new Multicodec("p384-priv", Tag.Key, new byte[] { (byte) 0x87, (byte) 0x24 });
//
//    public static Multicodec P521_PUBLIC_KEY = new Multicodec("p521-pub", Tag.Key, new byte[] { (byte) 0x82, (byte) 0x26 });
//    public static Multicodec P521_PRIVATE_KEY = new Multicodec("p521-priv", Tag.Key, new byte[] { (byte) 0x88, (byte) 0x26 });
//
    private final String name;
    private final byte[] varint;
    private final long code;
    private final Tag tag;

    public Multicodec(String name, Tag tag, long code, byte[] varint) {
        this.tag = tag;
        this.name = name;
        this.code = code;
        this.varint = varint;
    }

    public int length() {
        return varint.length;
    }

    public byte[] varint() {
        return varint;
    }

    public Tag tag() {
        return tag;
    }

    public String name() {
        return name;
    }
    
    public long code() {
        return code;
    }

    /**
     * Encode a value with a codec.
     * 
     * @param value a value to encode
     * @return an encoded value
     */
    public byte[] encode(final byte[] value) {

        if (value == null) {
            throw new IllegalArgumentException("The value to encdode must not be null.");
        }
        if (value.length == 0) {
            throw new IllegalArgumentException("The value to encode must be non empty byte array.");
        }

        final byte[] encoded = new byte[varint.length + value.length];

        System.arraycopy(varint, 0, encoded, 0, varint.length);
        System.arraycopy(value, 0, encoded, varint.length, value.length);

        return encoded;
    }

    /**
     * Decode an encoded value
     * 
     * @param encoded value to decode
     * @return a decoded value
     */
    public byte[] decode(final byte[] encoded) {
        if (encoded == null) {
            throw new IllegalArgumentException("The value to decode must not be null.");
        }
        if (encoded.length == 0) {
            throw new IllegalArgumentException("The value to decode must be non empty byte array.");
        }

        return Arrays.copyOfRange(encoded, varint.length, encoded.length);
    }

    @Override
    public int hashCode() {
        return 31 * Arrays.hashCode(varint);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(varint, ((Multicodec) obj).varint);
    }

    @Override
    public String toString() {
        return "Multicodec [name=" + name + ", tag=" + tag + ", varint=" + Arrays.toString(varint) + "]";
    }
}
