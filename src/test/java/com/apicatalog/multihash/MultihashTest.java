package com.apicatalog.multihash;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Base64;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MultihashTest {

    MultihashDecoder DECODER = MultihashDecoder.getInstance();

    @ParameterizedTest(name = "{index}")
    @MethodSource("testData")
    void testEncode(byte[] expected, Multihash codec, byte[] input) {
        assertArrayEquals(expected, codec.encode(input));
    }

    @ParameterizedTest(name = "{index}")
    @MethodSource("testData")
    void testDecode(byte[] input, Multihash codec, byte[] expected) {
        assertArrayEquals(expected, codec.decode(input));
    }

    @ParameterizedTest(name = "{index}")
    @MethodSource("testData")
    void testDecoderDecode(byte[] input) {
        assertNotNull(DECODER.decode(input));
    }

    @ParameterizedTest(name = "{index}")
    @MethodSource("testData")
    void testDecoderGet(byte[] input, Multihash expected) {
        assertEquals(expected, DECODER.get(input).orElseThrow(IllegalArgumentException::new));
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(Base64.getDecoder().decode("ERSIwvEfss45KstbKYbmQCEcRpAHPg=="),
                        Multihash.SHA1,
                        Base64.getDecoder().decode("iMLxH7LOOSrLWymG5kAhHEaQBz4=")),
                Arguments.of(Base64.getDecoder().decode("EiCcvAfD+ZFyWDajqipYHKICkZiqQgudmbwOEx2fPiy+Rw=="),
                        Multihash.SHA2_256,
                        Base64.getDecoder().decode("nLwHw/mRclg2o6oqWByiApGYqkILnZm8DhMdnz4svkc=")));
    }
}
