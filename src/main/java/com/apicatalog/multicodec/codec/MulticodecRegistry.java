package com.apicatalog.multicodec.codec;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.apicatalog.multicodec.Multicodec;
import com.apicatalog.multicodec.Multicodec.Tag;

public final class MulticodecRegistry {

    private static final Map<Long, Multicodec> ALL = Stream.of(
            HashCodec.ALL,
            KeyCodec.ALL,
            MultiformatCodec.ALL,
            MultihashCodec.ALL,
            VarsigCodec.ALL)
            .flatMap(map -> map.entrySet().stream())
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    private static final MulticodecRegistry INSTANCE = new MulticodecRegistry(ALL);

    private final Map<Long, Multicodec> codecs;

    protected MulticodecRegistry(Map<Long, Multicodec> codecs) {
        this.codecs = codecs;
    }

    public static final MulticodecRegistry getInstance() {
        return INSTANCE;
    }

    public static final MulticodecRegistry getInstance(Tag... tags) {
        return new MulticodecRegistry(ALL.values().stream()
                .filter(codec -> tags.length == 1
                        ? tags[0] == codec.tag()
                        : Arrays.stream(tags).anyMatch(tag -> tag == codec.tag()))
                .collect(Collectors.toMap(Multicodec::code, Function.identity())));
    }

    public static final MulticodecRegistry getInstance(Multicodec[] codecs) {
        return new MulticodecRegistry(Arrays.stream(codecs)
                .collect(Collectors.toMap(Multicodec::code, Function.identity())));
    }

    /**
     * Returns a codec associated with the given code.
     * 
     * @param code associated with the codec
     * @return a codec or {@link Optional#empty()}
     */
    public final Optional<Multicodec> getCodec(final long code) {
        return Optional.ofNullable(codecs.get(code));
    }
}
