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
    void testDecode() {
        final Multicodec codec = Multicodec.of("test-hash", Tag.Hash, 123l);
        assertArrayEquals("Hello".getBytes(), codec.decode(new byte[] { 0x7b, 0x48, 0x65, 0x6C, 0x6C, 0x6F }));
    }

}
