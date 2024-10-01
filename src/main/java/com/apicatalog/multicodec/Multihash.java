package com.apicatalog.multicodec;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;

import com.apicatalog.uvarint.UVarInt;

/**
 * Multihash API. Overrides {@link Multicodec#decode(byte[])} and
 * {@link Multicodec#encode(byte[])} methods.
 */
public class Multihash extends Multicodec {

    protected Multihash(String name, long code, byte[] uvarint) {
        super(name, Tag.Multihash, code, uvarint);
    }

    @Override
    public byte[] decode(byte[] encoded) {

        Objects.requireNonNull(encoded);

        if (encoded.length < (codeVarint.length + 2)) {
            throw new IllegalArgumentException("The value to decode must be non empty byte array, min length = " + (codeVarint.length + 2) + ", actual = " + encoded.length + ".");
        }

        if (!IntStream.range(0, codeVarint.length).allMatch(i -> codeVarint[i] == encoded[i])) {
            throw new IllegalArgumentException("The value to decode is not encoded with " + toString() + ".");
        }

        // digest size
        long size = UVarInt.decode(encoded, codeVarint.length);
        int sizeVarintLength = UVarInt.byteLength(size);

        if (size != (encoded.length - codeVarint.length - sizeVarintLength)) {
            throw new IllegalArgumentException(
                    "The declared digest size = " + size + " and the actual hash digest size = " + (encoded.length - codeVarint.length - sizeVarintLength) + " do not match.");
        }

        // digest
        return Arrays.copyOfRange(encoded, codeVarint.length + sizeVarintLength, encoded.length);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Multihash other = (Multihash) obj;
        return code == other.code;
    }

    @Override
    public String toString() {
        return "Multihash [name=" + name + ", code=" + code + ", varint=" + Arrays.toString(codeVarint) + "]";
    }
    
}
