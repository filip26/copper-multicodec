package com.apicatalog.multicodec;

import java.io.IOException;

public class CvsImporter {

    public static void main(final String[] args) throws IOException {
        CodecTag.generate("key", "KeyCodec");
        CodecTag.generate("multiformat", "MultiformatCodec");
        CodecTag.generate("hash", "HashCodec");
        CodecTag.generate("multihash", "MultihashCodec");
        CodecTag.generate("varsig", "VarsigCodec");
    }
}
