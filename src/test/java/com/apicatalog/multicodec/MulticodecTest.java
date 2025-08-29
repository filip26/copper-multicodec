package com.apicatalog.multicodec;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.apicatalog.multicodec.Multicodec.Tag;
import com.apicatalog.uvarint.UVarInt;

class MulticodecTest {

    @Test
    void testIsEncoded() {
        final Multicodec codec = Multicodec.of("test-hash", Tag.Hash, 123l);
        assertTrue(codec.isEncoded(UVarInt.encode(123l)));
        assertFalse(codec.isEncoded(UVarInt.encode(124l)));
    }

    @Test
    void testEncode() {
        final Multicodec codec = Multicodec.of("test-hash", Tag.Hash, 123l);
        assertArrayEquals(new byte[] { 0x7b, 0x48, 0x65, 0x6C, 0x6C, 0x6F }, codec.encode("Hello".getBytes()));
    }

    @Test
    void testEncodeFromIndex() {
        final Multicodec codec = Multicodec.of("test-hash", Tag.Hash, 123l);
        assertArrayEquals(new byte[] { 0x7b, 0x48, 0x65, 0x6C, 0x6C, 0x6F }, codec.encode(new byte[] {'0', 'H', 'e',  'l', 'l', 'o'}, 1));
    }

    @Test
    void testEncodeRange() {
        final Multicodec codec = Multicodec.of("test-hash", Tag.Hash, 123l);
        assertArrayEquals(new byte[] { 0x7b, 0x48, 0x65, 0x6C, 0x6C, 0x6F }, codec.encode(new byte[] {'A', 'B', 'H', 'e',  'l', 'l', 'o', 'C'}, 2, 5));
    }

    @Test
    void testDecode() {
        final Multicodec codec = Multicodec.of("test-hash", Tag.Hash, 123l);
        assertArrayEquals("Hello".getBytes(), codec.decode(new byte[] { 0x7b, 0x48, 0x65, 0x6C, 0x6C, 0x6F }));
    }

    @Test
    void testDecodeFromIndex() {
        final Multicodec codec = Multicodec.of("test-hash", Tag.Hash, 123l);
        assertArrayEquals("Hello".getBytes(), codec.decode(new byte[] { 0x0, 0x7b, 0x48, 0x65, 0x6C, 0x6C, 0x6F }, 1));
    }

    @Test
    void testDecodeFromRange() {
        final Multicodec codec = Multicodec.of("test-hash", Tag.Hash, 123l);
        assertArrayEquals("Hello".getBytes(), codec.decode(new byte[] { 0xa, 0xb, 0x7b, 0x48, 0x65, 0x6C, 0x6C, 0x6F, 0x1, 0x2, 0x3 }, 2, 6));
    }
}
