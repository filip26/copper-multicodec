package com.apicatalog.multihash;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;

import com.apicatalog.multicodec.Multicodec;
import com.apicatalog.uvarint.UVarInt;

/**
 * Multihash API. Overrides {@link Multicodec#decode(byte[])} and
 * {@link Multicodec#encode(byte[])} methods.
 */
public class Multihash extends Multicodec {

    protected Multihash(String name, long code, byte[] uvarint, Status status) {
        super(name, Tag.Multihash, code, uvarint, status);
    }

    public static Multihash of(String name, long code) {
        return of(name, code, null);
    }

    public static Multihash of(String name, long code, Status status) {
        return new Multihash(name, code, UVarInt.encode(code), status);
    }

    /**
     * Encode a value with multihash.
     * 
     * @param value a value to encode
     * @return an encoded value
     * 
     * @throws IllegalArgumentException if the value cannot be encoded
     */
    @Override
    public byte[] encode(final byte[] value) {

        Objects.requireNonNull(value);

        if (value.length == 0) {
            throw new IllegalArgumentException("The value to encode must be non empty byte array.");
        }

        final byte[] sizeVarint = UVarInt.encode(value.length);

        final byte[] encoded = new byte[codeVarint.length + sizeVarint.length + value.length];

        System.arraycopy(codeVarint, 0, encoded, 0, codeVarint.length);
        System.arraycopy(sizeVarint, 0, encoded, codeVarint.length, sizeVarint.length);
        System.arraycopy(value, 0, encoded, codeVarint.length + sizeVarint.length, value.length);

        return encoded;
    }

    @Override
    public byte[] decode(byte[] encoded, int index) {

        Objects.requireNonNull(encoded);

        if ((encoded.length - index) < (codeVarint.length + 2)) {
            throw new IllegalArgumentException("The value to decode must be non empty byte array, min length = " + (codeVarint.length + 2) + ", actual = " + encoded.length + ".");
        }

        if (!IntStream.range(0, codeVarint.length).allMatch(i -> codeVarint[i] == encoded[i + index])) {
            throw new IllegalArgumentException("The value to decode is not encoded with " + toString() + ".");
        }

        // digest size
        long size = UVarInt.decode(encoded, index + codeVarint.length);
        int sizeVarintLength = UVarInt.byteLength(size);

        if (size != (encoded.length - index - codeVarint.length - sizeVarintLength)) {
            throw new IllegalArgumentException(
                    "The declared digest size = " + size + " and the actual hash digest size = " + (encoded.length - index - codeVarint.length - sizeVarintLength) + " do not match.");
        }

        // digest
        return Arrays.copyOfRange(encoded, index + codeVarint.length + sizeVarintLength, encoded.length - index);
    }

    @Override
    public String toString() {
        return "Multihash [name=" + name + ", tag=" + tag + ", code=" + code + "]";
    }
}
