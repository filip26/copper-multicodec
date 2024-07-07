package com.apicatalog.multicodec.codec;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.apicatalog.multicodec.Multicodec;

public class MulticodecRegistry {

    protected MulticodecRegistry() {
        /* protected */
    }

    protected static final Map<Long, Multicodec> ALL = Stream.of(
            HashCodec.ALL,
            KeyCodec.ALL,
            MultiformatCodec.ALL,
            MultihashCodec.ALL,
            VarsigCodec.ALL)
            .flatMap(map -> map.entrySet().stream())
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    public static final Map<Long, Multicodec> data() {
        return ALL;
    }

    public static final Collection<Multicodec> values() {
        return ALL.values();
    }
}
