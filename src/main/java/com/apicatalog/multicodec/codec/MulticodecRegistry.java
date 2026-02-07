package com.apicatalog.multicodec.codec;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.apicatalog.multicodec.Multicodec;
import com.apicatalog.multicodec.Multicodec.Tag;

/**
 * A registry of known {@link Multicodec} definitions, organized by their
 * numeric codes and by {@link Tag} categories.
 *
 * <p>
 * This class maintains a global set of predefined codecs loaded from various
 * codec groups (e.g., CID, Multihash, Multiaddr). It provides methods for
 * obtaining registry instances filtered by codec tags or by explicitly provided
 * codecs.
 * </p>
 *
 * <p>
 * Instances of this class are immutable and thread-safe.
 * </p>
 */
public final class MulticodecRegistry {

    /**
     * Mapping from codec tag to the codecs within that category.
     */
    private static final Map<Tag, Map<Long, Multicodec>> TAGS;

    /**
     * Mapping from codec numeric code to its {@link Multicodec} definition across
     * all tags.
     */
    private static final Map<Long, Multicodec> CODECS;

    /**
     * Singleton instance containing all known codecs.
     */
    private static final MulticodecRegistry INSTANCE;

    static {
        TAGS = new EnumMap<>(Tag.class);
        TAGS.put(Tag.Cid, CidCodec.ALL);
        TAGS.put(Tag.Hash, HashCodec.ALL);
        TAGS.put(Tag.Key, KeyCodec.ALL);
        TAGS.put(Tag.Multihash, MultihashCodec.ALL);
        TAGS.put(Tag.Multiaddr, MultiaddrCodec.ALL);
        TAGS.put(Tag.Namespace, NamespaceCodec.ALL);
        TAGS.put(Tag.Multiformat, MultiformatCodec.ALL);
        TAGS.put(Tag.Serialization, SerializationCodec.ALL);
        TAGS.put(Tag.Transport, TransportCodec.ALL);
        TAGS.put(Tag.Varsig, VarsigCodec.ALL);

        CODECS = TAGS
                .values().stream()
                .flatMap(map -> map.values().stream())
                .collect(Collectors.toMap(Multicodec::code, Function.identity()));

        INSTANCE = new MulticodecRegistry(CODECS);
    }

    private final Map<Long, Multicodec> codecs;

    /**
     * Creates a new registry instance backed by the provided codec mapping.
     *
     * @param codecs a map of numeric codes to codec definitions
     */
    protected MulticodecRegistry(final Map<Long, Multicodec> codecs) {
        this.codecs = codecs;
    }

    /**
     * Returns the singleton registry instance containing all known codecs.
     *
     * @return the global codec registry
     */
    public static final MulticodecRegistry getInstance() {
        return INSTANCE;
    }

    /**
     * Returns a registry instance containing only codecs matching the given tags.
     *
     * @param tags one or more codec tags to filter by
     * @return a new registry instance containing only matching codecs
     */
    public static final MulticodecRegistry getInstance(final Tag... tags) {
        Objects.requireNonNull(tags);
        return new MulticodecRegistry(provided(tags));
    }

    /**
     * Returns a registry instance containing only the specified codecs.
     *
     * @param codecs one or more codec definitions to include
     * @return a new registry instance containing only the provided codecs
     */
    public static final MulticodecRegistry getInstance(final Multicodec... codecs) {
        Objects.requireNonNull(codecs);

        if (codecs.length == 0) {
            throw new IllegalArgumentException("At least one codec must be provided.");
        }

        return new MulticodecRegistry(
                Arrays
                        .stream(codecs)
                        .collect(Collectors.toMap(Multicodec::code, Function.identity())));
    }

    /**
     * Returns a map of all known codecs.
     *
     * @return map of numeric code to codec definition
     */
    public static final Map<Long, Multicodec> provided() {
        return CODECS;
    }

    /**
     * Returns a map of codecs filtered by the specified tags.
     *
     * @param tags one or more codec tags to filter by
     * @return map of numeric code to codec definition for matching tags
     */
    public static final Map<Long, Multicodec> provided(final Tag... tags) {
        if (tags == null || tags.length == 0) {
            throw new IllegalArgumentException("At least one tag must be provided.");
        }
        if (tags.length == 1) {
            return TAGS.get(tags[0]);
        }
        return TAGS.entrySet().stream()
                .filter(e -> Arrays.stream(tags).anyMatch(tag -> tag == e.getKey()))
                .flatMap(e -> e.getValue().values().stream())
                .collect(Collectors.toMap(Multicodec::code, Function.identity()));
    }

    /**
     * Looks up a codec by its numeric code.
     *
     * @param code the numeric code associated with the codec
     * @return an {@link Optional} containing the codec if found, or empty if no
     *         match exists
     */
    public final Optional<Multicodec> getCodec(final long code) {
        return Optional.ofNullable(codecs.get(code));
    }

    /**
     * Finds a registered {@link Multicodec} by its name.
     * <p>
     * This method searches through all registered codecs and returns the first
     * match whose {@link Multicodec#name()} equals the given name.
     * </p>
     *
     * @param name the name of the codec to look up (must not be {@code null})
     * @return an {@link Optional} containing the matching {@link Multicodec}, or an
     *         empty {@link Optional} if no codec with the given name is found
     */
    public final Optional<Multicodec> findCodec(final String name) {
        return codecs.values().stream()
                .filter(codec -> codec.name().equals(name))
                .findFirst();
    }

    /**
     * Returns the map of codecs contained in this registry instance.
     *
     * @return map of numeric code to codec definition
     */
    public Map<Long, Multicodec> codecs() {
        return codecs;
    }

    /**
     * Returns the number of registered codecs in this registry.
     *
     * @return the total count of registered codecs
     */
    public long size() {
        return codecs.size();
    }

}
