package com.apicatalog.multicodec.codec;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.apicatalog.multicodec.Multicodec.Tag;
import com.apicatalog.multicodec.MulticodecDecoder;

public class MulticodecDecoderTest {

    @Test
    void testGetInstance() {
        final MulticodecDecoder decoder = MulticodecDecoder.getInstance();
        assertNotNull(decoder);
        assertTrue(KeyCodec.ALL.values().stream()
                .allMatch(codec -> decoder.getCodec(codec.varint()).isPresent()));
        assertTrue(HashCodec.ALL.values().stream()
                .allMatch(codec -> decoder.getCodec(codec.varint()).isPresent()));
        assertTrue(MultiformatCodec.ALL.values().stream()
                .allMatch(codec -> decoder.getCodec(codec.varint()).isPresent()));
        assertTrue(MultihashCodec.ALL.values().stream()
                .allMatch(codec -> decoder.getCodec(codec.varint()).isPresent()));
        assertTrue(VarsigCodec.ALL.values().stream()
                .allMatch(codec -> decoder.getCodec(codec.varint()).isPresent()));
    }

    @Test
    void testGetInstanceKeyTag() {
        final MulticodecDecoder decoder = MulticodecDecoder.getInstance(Tag.Key);
        assertNotNull(decoder);
        assertTrue(KeyCodec.ALL.values().stream()
                .allMatch(codec -> decoder.getCodec(codec.varint()).isPresent()));
        assertTrue(HashCodec.ALL.values().stream()
                .allMatch(codec -> !decoder.getCodec(codec.varint()).isPresent()));
    }

    @Test
    void testGetInstanceHashKeyTag() {
        final MulticodecDecoder decoder = MulticodecDecoder.getInstance(Tag.Key, Tag.Hash);
        assertNotNull(decoder);
        assertTrue(KeyCodec.ALL.values().stream()
                .allMatch(codec -> decoder.getCodec(codec.varint()).isPresent()));
        assertTrue(HashCodec.ALL.values().stream()
                .allMatch(codec -> decoder.getCodec(codec.varint()).isPresent()));
    }
}
