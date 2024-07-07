package com.apicatalog.multicodec;

import java.io.IOException;

public class CvsImporter {

    public static void main(final String[] args) throws IOException {
        CodecTag.generate("key", "KeyCodec");
        CodecTag.generate("multihash", "MultihashCodec");
        CodecTag.generate("multiaddr", "MultiaddrCodec");
        CodecTag.generate("hash", "HashCodec");
        CodecTag.generate("cid", "CidCodec");
        CodecTag.generate("namespace", "NamespaceCodec");
        CodecTag.generate("multiformat", "MultiformatCodec");
        CodecTag.generate("serialization", "SerializationCodec");
        CodecTag.generate("transport", "TransportCodec");
        CodecTag.generate("varsig", "VarsigCodec");
    }
}
