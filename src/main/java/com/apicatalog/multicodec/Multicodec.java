package com.apicatalog.multicodec;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;

import com.apicatalog.uvarint.UVarInt;

/**
 * Represents a
 * <a href="https://github.com/multiformats/multicodec">multicodec</a>
 * definition and provides encoding/decoding operations using its varint code.
 * 
 * <p>
 * A multicodec is a self-describing format where the encoded data is prefixed
 * with a varint code identifying the format. This class stores metadata about
 * the codec, including its name, tag, status, and binary varint code, and can
 * be used to:
 * <ul>
 * <li>Encode raw byte arrays with the codec prefix</li>
 * <li>Check if a value is encoded with this codec</li>
 * <li>Decode a previously encoded value</li>
 * </ul>
 * 
 * <p>
 * Instances of this class are immutable and thread-safe.
 */
public class Multicodec {

    /**
     * Categories of recognized multicodec tags.
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

    /**
     * Registration status of the codec.
     */
    public enum Status {
        Deprecated,
        Draft,
        Permanent,
    }

    protected final String name;
    protected final byte[] codeVarint;
    protected final long code;
    protected final Tag tag;
    protected final Status status;

    /**
     * Constructs a new {@code Multicodec}.
     *
     * @param name    the codec name
     * @param tag     the codec category tag
     * @param code    the codec numeric code
     * @param uvarint the varint-encoded form of the code
     * @param status  the registration status
     */
    protected Multicodec(String name, Tag tag, long code, byte[] uvarint, Status status) {
        this.tag = tag;
        this.name = name;
        this.code = code;
        this.codeVarint = uvarint;
        this.status = status;
    }

    /**
     * Creates a new {@code Multicodec} with no explicit status.
     *
     * @param name the codec name
     * @param tag  the codec category tag
     * @param code the codec numeric code
     * @return a new {@code Multicodec} instance
     */
    public static Multicodec of(String name, Tag tag, long code) {
        return of(name, tag, code, null);
    }

    /**
     * Creates a new {@code Multicodec}.
     *
     * @param name   the codec name
     * @param tag    the codec category tag
     * @param code   the codec numeric code
     * @param status the codec registration status
     * @return a new {@code Multicodec} instance
     */
    public static Multicodec of(String name, Tag tag, long code, Status status) {
        return new Multicodec(name, tag, code, UVarInt.encode(code), status);
    }

    /**
     * Encodes the given value by prefixing it with this codec's varint code.
     * 
     * @param value the non-empty byte array to encode
     * @return the encoded byte array (varint prefix + original value)
     * @throws NullPointerException     if {@code value} is {@code null}
     * @throws IllegalArgumentException if {@code value} is empty
     */
    public byte[] encode(final byte[] value) {

        Objects.requireNonNull(value);

        if (value.length == 0) {
            throw new IllegalArgumentException("The value to encode must be a non-empty byte array.");
        }

        final byte[] encoded = new byte[codeVarint.length + value.length];

        System.arraycopy(codeVarint, 0, encoded, 0, codeVarint.length);
        System.arraycopy(value, 0, encoded, codeVarint.length, value.length);

        return encoded;
    }

    /**
     * Checks if the given encoded byte array starts with this codec's varint code.
     * 
     * @param encoded the byte array to test
     * @return {@code true} if {@code encoded} starts with this codec's varint
     *         prefix, {@code false} otherwise
     */
    public boolean isEncoded(final byte[] encoded) {
        return encoded != null
                && encoded.length >= codeVarint.length
                && IntStream.range(0, codeVarint.length).allMatch(i -> codeVarint[i] == encoded[i]);
    }

    /**
     * Decodes an encoded value by removing this codec's varint prefix.
     * 
     * @param encoded the encoded value
     * @return the decoded (original) byte array
     * @throws NullPointerException     if {@code encoded} is {@code null}
     * @throws IllegalArgumentException if {@code encoded} is too short or does not
     *                                  begin with this codec's varint prefix
     */
    public byte[] decode(final byte[] encoded) {
        return decode(encoded, 0);
    }

    /**
     * Decodes an encoded value starting from a given index.
     * 
     * @param encoded the encoded value
     * @param index   the starting index (inclusive)
     * @return the decoded (original) byte array
     * @throws NullPointerException     if {@code encoded} is {@code null}
     * @throws IllegalArgumentException if the value is too short from {@code index}
     *                                  onward or does not begin with this codec's
     *                                  varint prefix
     */
    public byte[] decode(final byte[] encoded, final int index) {

        Objects.requireNonNull(encoded);

        if ((encoded.length - index) < (codeVarint.length + 1)) {
            throw new IllegalArgumentException(
                    "The value to decode must be a non-empty byte array with a minimum length of "
                            + (codeVarint.length + 1) + " bytes, but the actual length is " + encoded.length + " bytes.");
        }

        if (!IntStream.range(0, codeVarint.length).allMatch(i -> codeVarint[i] == encoded[i + index])) {
            throw new IllegalArgumentException(
                    "The provided value is not encoded with this codec: " + toString() + ".");
        }

        return Arrays.copyOfRange(encoded, index + codeVarint.length, encoded.length - index);
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
        return "Multicodec [name=" + name + ", tag=" + tag + ", code=" + code + "]";
    }

    /**
     * Returns the length of this codec's varint code in bytes.
     * 
     * @return varint length
     */
    public int length() {
        return codeVarint.length;
    }

    /**
     * Returns the varint-encoded form of this codec's code.
     * 
     * @return varint byte array
     */
    public byte[] varint() {
        return codeVarint;
    }

    /**
     * Returns this codec's category tag.
     * 
     * @return the tag
     */
    public Tag tag() {
        return tag;
    }

    /**
     * Returns this codec's name.
     * 
     * @return the name
     */
    public String name() {
        return name;
    }

    /**
     * Returns this codec's numeric code.
     * 
     * @return the numeric code
     */
    public long code() {
        return code;
    }

    /**
     * Returns this codec's registration status.
     * 
     * @return the status, or {@code null} if unspecified
     */
    public Status status() {
        return status;
    }
}
