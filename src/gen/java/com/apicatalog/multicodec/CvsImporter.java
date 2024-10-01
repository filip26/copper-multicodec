package com.apicatalog.multicodec;

import java.io.IOException;

import com.apicatalog.multihash.Multihash;

public class CvsImporter {

    public static void main(final String[] args) throws IOException {
        CodecTag.generate("key", "KeyCodec", Multicodec.class);
        CodecTag.generate("multihash", "MultihashCodec", Multihash.class);
        CodecTag.generate("multiaddr", "MultiaddrCodec", Multicodec.class);
        CodecTag.generate("hash", "HashCodec", Multicodec.class);
        CodecTag.generate("cid", "CidCodec", Multicodec.class);
        CodecTag.generate("namespace", "NamespaceCodec", Multicodec.class);
        CodecTag.generate("multiformat", "MultiformatCodec", Multicodec.class);
        CodecTag.generate("serialization", "SerializationCodec", Multicodec.class);
        CodecTag.generate("transport", "TransportCodec", Multicodec.class);
        CodecTag.generate("varsig", "VarsigCodec", Multicodec.class);
    }
}
