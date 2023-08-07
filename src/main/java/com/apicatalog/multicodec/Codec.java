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
        return 31 * Arrays.hashCode(code);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(code, ((Codec) obj).code);
    }

    @Override
    public String toString() {
        return "Codec [name=" + name + ", tag=" + tag + ", code=" + Arrays.toString(code) + "]";
    }
}
