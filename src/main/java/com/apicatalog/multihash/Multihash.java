package com.apicatalog.multihash;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;

import com.apicatalog.multicodec.Multicodec;
import com.apicatalog.uvarint.UVarInt;

/**
 * Represents a <a href="https://multiformats.io/multihash/">multihash</a>
 * codec, which encodes values by prefixing them with a multicodec code,
 * followed by the length of the hash digest, and finally the digest bytes.
 *
 * <p>
 * This class extends {@link Multicodec} and overrides the
 * {@link #encode(byte[])} and {@link #decode(byte[], int)} methods to handle
 * the additional digest length prefix required by the multihash format.
 * </p>
 *
 * <p>
 * Instances of this class are immutable and thread-safe.
 * </p>
 */
public class Multihash extends Multicodec {

    /**
     * Creates a new {@code Multihash} instance.
     *
     * @param name    the multihash name (e.g., "sha2-256")
     * @param code    the multicodec code
     * @param uvarint the varint-encoded code
     * @param status  the registration status
     */
    protected Multihash(String name, long code, byte[] uvarint, Status status) {
        super(name, Tag.Multihash, code, uvarint, status);
    }

    /**
     * Creates a new {@code Multihash} with no explicit status.
     *
     * @param name the multihash name
     * @param code the multicodec code
     * @return a new {@code Multihash} instance
     */
    public static Multihash of(String name, long code) {
        return of(name, code, null);
    }

    /**
     * Creates a new {@code Multihash}.
     *
     * @param name   the multihash name
     * @param code   the multicodec code
     * @param status the registration status
     * @return a new {@code Multihash} instance
     */
    public static Multihash of(String name, long code, Status status) {
        return new Multihash(name, code, UVarInt.encode(code), status);
    }

    /**
     * Encodes a value as a multihash.
     *
     * <p>
     * The resulting byte array consists of:
     * <ol>
     * <li>the varint-encoded multicodec code,</li>
     * <li>the varint-encoded digest length,</li>
     * <li>the hash digest bytes.</li>
     * </ol>
     *
     * @param value the hash digest to encode
     * @return the encoded multihash
     * @throws NullPointerException     if {@code value} is {@code null}
     * @throws IllegalArgumentException if {@code value} is empty
     */
    @Override
    public byte[] encode(final byte[] value) {

        Objects.requireNonNull(value);

        if (value.length == 0) {
            throw new IllegalArgumentException("The value to encode must be a non-empty byte array.");
        }

        final byte[] sizeVarint = UVarInt.encode(value.length);

        final byte[] encoded = new byte[codeVarint.length + sizeVarint.length + value.length];

        System.arraycopy(codeVarint, 0, encoded, 0, codeVarint.length);
        System.arraycopy(sizeVarint, 0, encoded, codeVarint.length, sizeVarint.length);
        System.arraycopy(value, 0, encoded, codeVarint.length + sizeVarint.length, value.length);

        return encoded;
    }

    /**
     * Decodes a multihash value starting from the given index.
     *
     * <p>
     * Validates that the encoded data matches this multihash's code, then reads the
     * declared digest length and verifies it matches the actual remaining data
     * length before returning the digest bytes.
     * </p>
     *
     * @param encoded the multihash-encoded byte array
     * @param index   the starting index (inclusive)
     * @return the decoded hash digest bytes
     * @throws NullPointerException     if {@code encoded} is {@code null}
     * @throws IllegalArgumentException if the encoded data is too short, not
     *                                  encoded with this multihash's code, or the
     *                                  declared digest length does not match the
     *                                  actual data length
     */
    @Override
    public byte[] decode(byte[] encoded, int index) {

        Objects.requireNonNull(encoded);

        if ((encoded.length - index) < (codeVarint.length + 2)) {
            throw new IllegalArgumentException(
                    "The value to decode must be a non-empty byte array with a minimum length of "
                            + (codeVarint.length + 2) + " bytes, but the actual length is " + encoded.length + " bytes.");
        }

        if (!IntStream.range(0, codeVarint.length).allMatch(i -> codeVarint[i] == encoded[i + index])) {
            throw new IllegalArgumentException(
                    "The provided value is not encoded with this multihash: " + toString() + ".");
        }

        // Get digest size
        long size = UVarInt.decode(encoded, index + codeVarint.length);
        int sizeVarintLength = UVarInt.byteLength(size);

        if (size != (encoded.length - index - codeVarint.length - sizeVarintLength)) {
            throw new IllegalArgumentException(
                    "Digest size mismatch: declared size is " + size + " bytes, but the actual digest size is " +
                            (encoded.length - index - codeVarint.length - sizeVarintLength) + " bytes.");
        }

        // Extract digest
        return Arrays.copyOfRange(encoded, index + codeVarint.length + sizeVarintLength, encoded.length - index);
    }

    @Override
    public String toString() {
        return "Multihash [name=" + name + ", tag=" + tag + ", code=" + code + "]";
    }
}
