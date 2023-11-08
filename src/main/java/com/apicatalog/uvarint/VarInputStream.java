package com.apicatalog.uvarint;

import java.io.ByteArrayInputStream;
import java.util.Arrays;

/**
 * Decodes unsigned var[int|long] byte array into ints and longs.
 */
public class VarInputStream {

    final ByteArrayInputStream is;

    byte[] variant;
    int varLength;
    long value;

    public VarInputStream(ByteArrayInputStream is) {
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
System.out.println("NEXT" + next + "," + offset);
        } while (next);

        value = v;
        varLength = offset;

        return true;
    }

    public boolean isVarInt() {
        return varLength > 0 &&
                ((varLength < 5)
                        || (varLength == 5 &&
                                ((variant[4] & UVarInt.INT_OVERFLOW_BITS) == 0)));
    }

    /**
     * Get last read var.
     * 
     * @return encoded var representation
     */
    public byte[] getVar() {
        return varLength < 0
                ? null
                : (varLength == UVarInt.MAX_VAR_LENGTH
                        ? variant
                        : Arrays.copyOfRange(variant, 0, varLength));
    }

    public long getVarLong() {
        if (varLength <= 0) {
            throw new IllegalStateException("No value has been read. Call read before getVar method.");
        }
        return value;
    }
    
    public int getVarInt() {
        if (varLength <= 0) {
            throw new IllegalStateException("No value has been read. Call read before getVar method.");
        }        
        return (int)value;
    }
    
    public static long readVarLong(byte[] varlong) {

        final VarInputStream reader = new VarInputStream(new ByteArrayInputStream(varlong));

        if (!reader.read()) {
            throw new IllegalArgumentException("Nothing to read.");
        }

        return reader.getVarLong();
    }

    public static void main(String[] args) {

        VarInputStream reader = new VarInputStream(new ByteArrayInputStream(new byte[]{
                (byte)0x88,
                0x26,
//                0x13,
  //              0x08,
                }));
        
        System.out.println("read" + reader.read());
        
        System.out.println(">> " + String.format("%04X", reader.getVarLong()));
        System.out.println("> " + reader.getVar().length);
    }

}