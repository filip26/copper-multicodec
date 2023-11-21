package com.apicatalog.multicodec;

import java.util.Arrays;

public final class Multicodec {

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
        return code == ((Multicodec) obj).code;
    }

    @Override
    public String toString() {
        return "Multicodec [name=" + name + ", tag=" + tag + ", code=" + code + ", varint=" + Arrays.toString(varint) + "]";
    }
}
