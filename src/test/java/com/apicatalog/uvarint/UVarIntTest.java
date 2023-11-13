package com.apicatalog.uvarint;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class UVarIntTest {

    @ParameterizedTest(name = "{index}: {0}")
    @MethodSource("testData")
    void testEncode(Long input, byte[] expedcted) {
        byte[] output = UVarInt.encode(input);
        assertArrayEquals(expedcted, output);
    }

    @ParameterizedTest(name = "{index}: {0}")
    @MethodSource("testData")
    void testDecode(Long expected, byte[] input) {
        long output = UVarInt.decode(input);
        assertEquals(expected, output);
    }
    
    static Stream<Arguments> testData() {
        return Stream.of(
          Arguments.of(1l, new byte[] {1}),
          Arguments.of(127l, new byte[] {0x7f}),
          Arguments.of(128l, new byte[] {(byte)0x80, 0x01}),
          Arguments.of(255l, new byte[] {(byte)0xff, 0x01}),
          Arguments.of(300l, new byte[] {(byte)0xac, 0x02}),
          Arguments.of(16384l, new byte[] {(byte)0x80, (byte)0x80, 0x01})
        );
    }
}
