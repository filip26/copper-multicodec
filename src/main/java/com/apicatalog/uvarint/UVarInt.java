package com.apicatalog.uvarint;

public class UVarInt {

    /** Maximum encoded var length in bytes */
    public static final int MAX_VAR_LENGTH = 9;

    public static final int SEGMENT_BITS = 0x7F;
    public static final int CONTINUE_BIT = 0x80;
    public static final int INT_OVERFLOW_BITS = 0x70;
}
