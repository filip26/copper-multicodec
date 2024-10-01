package com.apicatalog.multicodec;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;

import com.apicatalog.uvarint.UVarInt;

/**
 * Represents a multicodec definition and encoder/decoder instance.
 */
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

    protected final String name;
    protected final byte[] codeVarint;
    protected final long code;
    protected final Tag tag;

    protected Multicodec(String name, Tag tag, long code, byte[] uvarint) {
        this.tag = tag;
        this.name = name;
        this.code = code;
        this.codeVarint = uvarint;
    }

    public static Multicodec of(String name, Tag tag, long code) {
        return new Multicodec(name, tag, code, UVarInt.encode(code));
    }

    public int length() {
        return codeVarint.length;
    }

    public byte[] varint() {
        return codeVarint;
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
     * 
     * @throws IllegalArgumentException if the value cannot be encoded
     */
    public byte[] encode(final byte[] value) {

        if (value == null) {
            throw new IllegalArgumentException("The value to encdode must not be null.");
        }

        if (value.length == 0) {
            throw new IllegalArgumentException("The value to encode must be non empty byte array.");
        }

        final byte[] encoded = new byte[codeVarint.length + value.length];

        System.arraycopy(codeVarint, 0, encoded, 0, codeVarint.length);
        System.arraycopy(value, 0, encoded, codeVarint.length, value.length);

        return encoded;
    }

    /**
     * Checks if the given value is encoded with the codec.
     * 
     * @param encoded an encoded value to test
     * @return <code>true</code> is the given value is encoded with the codec,
     *         <code>false</code> otherwise
     */
    public boolean isEncoded(final byte[] encoded) {
        return encoded != null
                && encoded.length >= codeVarint.length
                && IntStream.range(0, codeVarint.length).allMatch(i -> codeVarint[i] == encoded[i]);
    }

    /**
     * Decode an encoded value
     * 
     * @param encoded value to decode
     * @return a decoded value
     * 
     * @throws IllegalArgumentException if the encoded value cannot be decoded
     */
    public byte[] decode(final byte[] encoded) {

        Objects.requireNonNull(encoded);

        if (encoded.length < (codeVarint.length + 1)) {
            throw new IllegalArgumentException("The value to decode must be non empty byte array, min length = " + (codeVarint.length + 1) + ", actual = " + encoded.length + ".");
        }

        if (!IntStream.range(0, codeVarint.length).allMatch(i -> codeVarint[i] == encoded[i])) {
            throw new IllegalArgumentException("The value to decode is not encoded with " + toString() + ".");
        }

        return Arrays.copyOfRange(encoded, codeVarint.length, encoded.length);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Multicodec other = (Multicodec) obj;
        return code == other.code;
    }

    @Override
    public String toString() {
        return "Multicodec [name=" + name + ", tag=" + tag + ", code=" + code + ", varint=" + Arrays.toString(codeVarint) + "]";
    }
}
