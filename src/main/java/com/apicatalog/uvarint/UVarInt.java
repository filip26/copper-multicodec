package com.apicatalog.uvarint;

import java.util.Arrays;

public class UVarInt {

    /** Maximum encoded var length in bytes */
    public static final int MAX_VAR_LENGTH = 9;

    public static final int SEGMENT_BITS = 0x7F;
    public static final int CONTINUE_BIT = 0x80;
    public static final int INT_OVERFLOW_BITS = 0x70;
    
    public static final byte[] encode(final long value) {

        byte[] buffer = new byte[UVarInt.MAX_VAR_LENGTH];
        int offset = 0;
        long bytes = value;

        boolean next = false;
        do {
            if (offset >= UVarInt.MAX_VAR_LENGTH) {
                throw new IllegalArgumentException("A var longer than " + UVarInt.MAX_VAR_LENGTH + " has been found. Only vars up to " + UVarInt.MAX_VAR_LENGTH + " are supported.");
            }

            if (next) {
                buffer[offset - 1] |= UVarInt.CONTINUE_BIT;
            }

            buffer[offset] = (byte) (bytes & UVarInt.SEGMENT_BITS);

            bytes >>>= 7;

            next = bytes != 0;

            offset++;

        } while (next);

        return offset == UVarInt.MAX_VAR_LENGTH
                ? buffer
                : Arrays.copyOfRange(buffer, 0, offset);
    }
    
    public static final long decode(final byte[] uvarint) {
        
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

            int b = uvarint[offset];

            value |= (b & UVarInt.SEGMENT_BITS) << (offset * 7);

            offset++;

            next = ((b & UVarInt.CONTINUE_BIT) != 0);

        } while (next);

        return value;
    }
}
