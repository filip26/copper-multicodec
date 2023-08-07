package com.apicatalog.multicodec;

import java.math.BigInteger;
import java.util.Arrays;

public class Codec {

    /**
     * Recognized multicodec tags
     */
    public enum Tag {
        Key,
        MultiHash,
        MultiAddr,
        Hash,
        Cid,
        Namespace,
        MultiFormat,
        Serialization,
        Transport,
        VarSig,
    }
    
    public static Codec IDENTITY = new Codec("identity", Tag.MultiHash, new byte[] { (byte) 0x00 });
    
    private final String name;
    private final byte[] code;
    private final Tag tag;

    public Codec(String name, Tag tag, byte[] code) {
        this.tag = tag;
        this.name = name;
        this.code = code;
    }

    public int length() {
        return code.length;
    }

    public int asInteger() {
        return new BigInteger(code).intValue();
    }

    public byte[] code() {
        return code;
    }

    public Tag tag() {
        return tag;
    }
    
    public String name() {
        return name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(code);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Codec other = (Codec) obj;
        return Arrays.equals(code, other.code);
    }

    @Override
    public String toString() {
        return "MultiCodec [name=" + name + ", tag=" + tag  + ", code=" + Arrays.toString(code) + "]";
    }    
}
