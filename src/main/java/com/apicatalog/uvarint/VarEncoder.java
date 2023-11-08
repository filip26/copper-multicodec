package com.apicatalog.uvarint;

import java.util.Arrays;

public class VarEncoder {

    public static final byte[] encode(final long value) {
    
        byte[] buffer = new byte[UVarInt.MAX_VAR_LENGTH];
        int offset = 0;
        long bytes = value;
        
        boolean next = false;
        do {
            if (offset >= UVarInt.MAX_VAR_LENGTH) {
                throw new IllegalArgumentException("A var longer than " + UVarInt.MAX_VAR_LENGTH + " has been found. Only vars up to " + UVarInt.MAX_VAR_LENGTH + " are supported.");                
            }
            
            
            buffer[offset] = (byte)(bytes & UVarInt.SEGMENT_BITS);
            
            bytes >>>= 7;
                
            next = bytes != 0;
            
            if (next) {
                buffer[offset] |= UVarInt.CONTINUE_BIT;
            }
            
            offset++;
            
        } while (next);
        
        return offset == UVarInt.MAX_VAR_LENGTH
                ? buffer
                : Arrays.copyOfRange(buffer, 0, offset);
    }
        
}
