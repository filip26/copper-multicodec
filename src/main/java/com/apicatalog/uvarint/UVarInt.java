package com.apicatalog.uvarint;

import java.util.Objects;

/**
 * Utility class for encoding and decoding
 * <a href="https://en.wikipedia.org/wiki/LEB128">unsigned variable-length
 * integers (UVarInt)</a>.
 *
 * <p>
 * A UVarInt encodes a non-negative integer into one or more bytes. Each byte
 * contributes 7 bits of information, and the most significant bit (MSB)
 * indicates whether more bytes follow. This encoding is commonly used in
 * <a href="https://multiformats.io/">multiformats</a> specifications, including
 * multicodec and multihash.
 * </p>
 *
 * <p>
 * This class is {@code final} and contains only static methods.
 * </p>
 */
public final class UVarInt {

    /** Maximum encoded varint length in bytes. */
    public static final int MAX_VAR_LENGTH = 9;

    /** Mask for the 7 value bits within a varint byte. */
    public static final int SEGMENT_BITS = 0x7F;

    /** Continuation bit (MSB) indicating more bytes follow. */
    public static final int CONTINUE_BIT = 0x80;

    /** Mask used for detecting overflow conditions. */
    public static final int INT_OVERFLOW_BITS = 0x70;

    /** Precomputed maximum values for each encoded length. */
    protected static long[] MAX_VALUES = {
            0x7FL,
            0x3FFFL,
            0x1FFFFFL,
            0xFFFFFFFL,
            0x7FFFFFFFFL,
            0x3FFFFFFFFFFL,
            0x1FFFFFFFFFFFFL,
            0xFFFFFFFFFFFFFFL,
            0x7FFFFFFFFFFFFFFFL
    };

    /** Prevent instantiation. */
    protected UVarInt() {
        /* no-op */
    }

    /**
     * Encodes the given value into a UVarInt byte array.
     *
     * @param value the value to encode (must be non-negative)
     * @return a newly allocated byte array containing the encoded value
     * @throws IllegalArgumentException if {@code value} cannot be encoded within
     *                                  {@link #MAX_VAR_LENGTH} bytes
     */
    public static final byte[] encode(final long value) {
        final int length = byteLength(value);

        if (length == 1) {
            return new byte[] { (byte) value };
        }

        byte[] uvarint = new byte[length];
        write(value, uvarint, 0);
        return uvarint;
    }

    /**
     * Writes the UVarInt-encoded form of the given non-negative value into the
     * target array starting at the specified index.
     *
     * <p>
     * The encoding uses seven data bits per byte. The most significant bit (MSB) of
     * each byte is set if more bytes follow. The method returns the number of bytes
     * written.
     * </p>
     *
     * @param value   the value to encode (must be {@code >= 0})
     * @param uvarint the destination byte array
     * @param index   the starting index in {@code uvarint}
     * @return the number of bytes written
     *
     * @throws NullPointerException      if {@code uvarint} is {@code null}
     * @throws IllegalArgumentException  if {@code value} is negative
     * @throws IndexOutOfBoundsException if {@code index} is negative, or if the
     *                                   destination array does not have enough
     *                                   space to hold the encoding
     */
    public static final int write(final long value, final byte[] uvarint, final int index) {

        Objects.requireNonNull(uvarint, "Target array must not be null.");

        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative.");
        }

        if (index < 0) {
            throw new IndexOutOfBoundsException("Index must be non-negative: " + index + ".");
        }

        int offset = 0;
        long bytes = value;
        boolean next = false;

        do {
            if (next) {
                uvarint[offset + index - 1] |= CONTINUE_BIT;
            }

            if ((index + offset) >= uvarint.length) {
                throw new IndexOutOfBoundsException(
                        "Insufficient space at position " + (index + offset) +
                                " (array length: " + uvarint.length + ").");
            }

            uvarint[offset + index] = (byte) (bytes & SEGMENT_BITS);

            bytes >>>= 7;
            next = bytes != 0;
            offset++;
        } while (next);

        return offset;
    }

    /**
     * Decodes a UVarInt from the given byte array starting at index {@code 0}.
     *
     * @param uvarint the encoded byte array
     * @return the decoded value
     * @throws IllegalArgumentException if the encoding is invalid or too long
     * @throws NullPointerException     if {@code uvarint} is {@code null}
     */
    public static final long decode(final byte[] uvarint) {
        return decode(uvarint, 0);
    }

    /**
     * Decodes a UVarInt from the given byte array starting at the specified index.
     *
     * @param uvarint the encoded byte array
     * @param index   the starting index
     * @return the decoded value
     * @throws IllegalArgumentException if the encoding is invalid or too long
     * @throws NullPointerException     if {@code uvarint} is {@code null}
     */
    public static final long decode(final byte[] uvarint, int index) {
        int offset = 0;
        boolean next = false;
        long value = 0;

        do {
            if (offset >= MAX_VAR_LENGTH) {
                throw new IllegalArgumentException(
                        "UVarInt longer than " + MAX_VAR_LENGTH + " bytes is not supported.");
            }
            if (offset >= uvarint.length) {
                throw new IllegalArgumentException(
                        "Unexpected end of input: next byte is required.");
            }

            int b = uvarint[offset + index];
            value |= (long) (b & SEGMENT_BITS) << (offset * 7);
            next = ((b & CONTINUE_BIT) != 0);
            offset++;
        } while (next);

        return value;
    }

    /**
     * Returns the number of bytes required to encode the given value as a UVarInt.
     *
     * @param value the value to measure
     * @return the number of bytes required
     * @throws IllegalArgumentException if {@code value} cannot be encoded within
     *                                  {@link #MAX_VAR_LENGTH} bytes
     */
    public static final int byteLength(long value) {
        if (value <= MAX_VALUES[0]) {
            return 1;
        }
        if (value <= MAX_VALUES[2]) {
            return (value <= MAX_VALUES[1]) ? 2 : 3;
        }
        if (value <= MAX_VALUES[4]) {
            return (value <= MAX_VALUES[3]) ? 4 : 5;
        }
        if (value <= MAX_VALUES[6]) {
            return (value <= MAX_VALUES[5]) ? 6 : 7;
        }
        if (value <= MAX_VALUES[8]) {
            return (value <= MAX_VALUES[7]) ? 8 : MAX_VAR_LENGTH;
        }

        throw new IllegalArgumentException(
                "Value exceeds maximum encodable length of " + MAX_VAR_LENGTH + " bytes.");
    }
}
