package com.apicatalog.uvarint;

import java.io.ByteArrayInputStream;
import java.util.Arrays;

/**
 * Decodes unsigned var[int|long] byte array into ints and longs.
 */
public class UVarIntInputStream {

    final ByteArrayInputStream is;

    byte[] variant;
    int varLength;
    long value;

    public UVarIntInputStream(final ByteArrayInputStream is) {
        this.is = is;
        this.variant = new byte[UVarInt.MAX_VAR_LENGTH];
        this.varLength = -1;
        this.value = -1;
    }

    /**
     * 
     * @return <code>true</code> if next var has been decoded or <code>false</code>
     *         if there is nothing else.
     */
    public boolean read() {

        int offset = 0;

        boolean next = false;
        long v = 0;

        do {
            if (offset >= UVarInt.MAX_VAR_LENGTH) {
                throw new IllegalArgumentException("A var longer than " + UVarInt.MAX_VAR_LENGTH + " has been found. Only vars up to " + UVarInt.MAX_VAR_LENGTH + " are supported.");
            }

            int b = is.read();

            if (b == -1) {
                if (next) {
                    throw new IllegalArgumentException("The input stream has ended unexpectedly, a next byte is expected.");
                }
                return false;
            }

            variant[offset] = (byte) b;
            v |= (b & UVarInt.SEGMENT_BITS) << (offset * 7);

            offset++;

            next = ((b & UVarInt.CONTINUE_BIT) != 0);

        } while (next);

        value = v;
        varLength = offset;

        return true;
    }

    public boolean isInteger() {
        return varLength > 0 &&
                ((varLength < 5)
                        || (varLength == 5 &&
                                ((variant[4] & UVarInt.INT_OVERFLOW_BITS) == 0)));
    }

    /**
     * Get last read unsigned varint.
     * 
     * @return encoded unsigned varubt representation
     */
    public byte[] getValue() {
        return varLength < 0
                ? null
                : (varLength == UVarInt.MAX_VAR_LENGTH
                        ? variant
                        : Arrays.copyOfRange(variant, 0, varLength));
    }

    public long getLong() {
        if (varLength <= 0) {
            throw new IllegalStateException("No value has been read. Call read before getVar method.");
        }
        return value;
    }

    public int getInt() {
        if (varLength <= 0) {
            throw new IllegalStateException("No value has been read. Call read before getVar method.");
        }
        return (int) value;
    }

    public static long readLong(byte[] varlong) {

        final UVarIntInputStream reader = new UVarIntInputStream(new ByteArrayInputStream(varlong));

        if (!reader.read()) {
            throw new IllegalArgumentException("Nothing to read.");
        }

        return reader.getLong();
    }
}
