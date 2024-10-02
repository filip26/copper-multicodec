package com.apicatalog.uvarint;

public final class UVarInt {

    /** Maximum encoded var length in bytes */
    public static final int MAX_VAR_LENGTH = 9;

    public static final int SEGMENT_BITS = 0x7F;
    public static final int CONTINUE_BIT = 0x80;
    public static final int INT_OVERFLOW_BITS = 0x70;

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

    protected UVarInt() {
        /* protected */
    }

    public static final byte[] encode(final long value) {

        final int length = byteLength(value);

        if (length == 1) {
            return new byte[] { (byte) value };
        }

        byte[] uvarint = new byte[length];

        write(value, uvarint, 0);

        return uvarint;
    }

    public static final void write(final long value, final byte[] uvarint, final int index) {

        int offset = 0;
        long bytes = value;

        boolean next = false;
        do {
            if (next) {
                uvarint[offset + index - 1] |= UVarInt.CONTINUE_BIT;
            }

            uvarint[offset + index] = (byte) (bytes & UVarInt.SEGMENT_BITS);

            bytes >>>= 7;

            next = bytes != 0;

            offset++;

        } while (next);

    }

    public static final long decode(final byte[] uvarint) {
        return decode(uvarint, 0);
    }

    public static final long decode(final byte[] uvarint, int index) {

        int offset = 0;

        boolean next = false;
        long value = 0;

        do {
            if (offset >= UVarInt.MAX_VAR_LENGTH) {
                throw new IllegalArgumentException("uintvar longer than " + UVarInt.MAX_VAR_LENGTH + " has been found. Only uintvar up to " + UVarInt.MAX_VAR_LENGTH + " are supported.");
            }
            if (offset >= uvarint.length) {
                throw new IllegalArgumentException("The input stream has ended unexpectedly, a next byte is expected.");
            }

            int b = uvarint[offset + index];

            value |= (long) (b & UVarInt.SEGMENT_BITS) << (offset * 7);

            next = ((b & UVarInt.CONTINUE_BIT) != 0);

            offset++;

        } while (next);

        return value;
    }

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

        throw new IllegalArgumentException("A var longer than " + UVarInt.MAX_VAR_LENGTH + " has been found. Only vars up to " + UVarInt.MAX_VAR_LENGTH + " are supported.");
    }
}
