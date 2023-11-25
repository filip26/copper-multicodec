package com.apicatalog.multicodec.codec;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.apicatalog.multicodec.Multicodec;

public class MulticodecRegistry {

    public static final Map<Long, Multicodec> ALL = Stream.of(
            HashCodec.ALL,
            KeyCodec.ALL,
            MultiformatCodec.ALL,
            MultihashCodec.ALL,
            VarsigCodec.ALL)
            .flatMap(map -> map.entrySet().stream())
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
}
