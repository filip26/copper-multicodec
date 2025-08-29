package com.apicatalog.multihash;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Base64;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.apicatalog.multicodec.Multicodec.Tag;
import com.apicatalog.multicodec.MulticodecDecoder;
import com.apicatalog.multicodec.codec.MultihashCodec;

class MultihashTest {

    static final MulticodecDecoder DECODER = MulticodecDecoder.getInstance(Tag.Multihash);

    @ParameterizedTest(name = "{index}")
    @MethodSource("testData")
    void testEncode(byte[] expected, Multihash codec, byte[] input) {
        assertArrayEquals(expected, codec.encode(input));
    }

    @ParameterizedTest(name = "{index}")
    @MethodSource("testData")
    void testEncodeFromIndex(byte[] expected, Multihash codec, byte[] input) {

        int index = 1 + (int) (Math.random() * 10);

        byte[] array = new byte[input.length + index];

        System.arraycopy(input, 0, array, index, input.length);
        assertArrayEquals(expected, codec.encode(array, index));
    }

    @ParameterizedTest(name = "{index}")
    @MethodSource("testData")
    void testEncodeFromRange(byte[] expected, Multihash codec, byte[] input) {
        int extra = 2 + (int) (Math.random() * 20);

        byte[] array = new byte[input.length + extra];

        int index = 1 + Math.round(extra / 2);

        System.arraycopy(input, 0, array, index, input.length);
        assertArrayEquals(expected, codec.encode(array, index, input.length));
    }

    @ParameterizedTest(name = "{index}")
    @MethodSource("testData")
    void testDecode(byte[] input, Multihash codec, byte[] expected) {
        assertArrayEquals(expected, codec.decode(input));
    }

    @ParameterizedTest(name = "{index}")
    @MethodSource("testData")
    void testDecodeFromIndex(byte[] input, Multihash codec, byte[] expected) {

        int index = 1 + (int) (Math.random() * 10);

        byte[] array = new byte[input.length + index];

        System.arraycopy(input, 0, array, index, input.length);
        assertArrayEquals(expected, codec.decode(array, index));
    }

    @ParameterizedTest(name = "{index}")
    @MethodSource("testData")
    void testDecodeRange(byte[] input, Multihash codec, byte[] expected) {

        int extra = 2 + (int) (Math.random() * 20);

        byte[] array = new byte[input.length + extra];

        int index = 1 + Math.round(extra / 2);

        System.arraycopy(input, 0, array, index, input.length);
        assertArrayEquals(expected, codec.decode(array, index, input.length));
    }

    @ParameterizedTest(name = "{index}")
    @MethodSource("testData")
    void testDecoderDecode(byte[] input) {
        assertNotNull(DECODER.decode(input));
    }

    @ParameterizedTest(name = "{index}")
    @MethodSource("testData")
    void testDecoderGet(byte[] input, Multihash expected) {
        assertEquals(expected, DECODER.getCodec(input).orElseThrow(IllegalArgumentException::new));
    }

    @ParameterizedTest(name = "{index}")
    @MethodSource("testData")
    void testDigestLength(byte[] input, Multihash codec, byte[] expected) {
        assertEquals(expected.length, codec.digestLength(input));
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(Base64.getDecoder().decode("ERSIwvEfss45KstbKYbmQCEcRpAHPg=="),
                        MultihashCodec.SHA1,
                        Base64.getDecoder().decode("iMLxH7LOOSrLWymG5kAhHEaQBz4=")),
                Arguments.of(Base64.getDecoder().decode("EiCcvAfD+ZFyWDajqipYHKICkZiqQgudmbwOEx2fPiy+Rw=="),
                        MultihashCodec.SHA2_256,
                        Base64.getDecoder().decode("nLwHw/mRclg2o6oqWByiApGYqkILnZm8DhMdnz4svkc=")));
    }
}
