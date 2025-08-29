/**
 * Provides the codec registry and predefined codec sets for the
 * <a href="https://github.com/multiformats/multicodec">multicodec</a> format.
 *
 * <p>
 * The {@code codec} subpackage contains the
 * {@link com.apicatalog.multicodec.codec.MulticodecRegistry}, which maintains
 * mappings between multicodec codes and their
 * {@link com.apicatalog.multicodec.Multicodec} definitions. It supports
 * creating registry instances containing:
 * </p>
 *
 * <ul>
 * <li>All known codecs ({@code MulticodecRegistry.getInstance()})</li>
 * <li>Only codecs matching specific
 * {@link com.apicatalog.multicodec.Multicodec.Tag}s</li>
 * <li>Only explicitly provided codecs</li>
 * </ul>
 *
 * <h2>Usage Example</h2>
 * 
 * <pre>{@code
 * // registry with all known codecs
 * MulticodecRegistry registry = MulticodecRegistry.getInstance();
 *
 * // registry with only a subset of codecs by tag
 * MulticodecRegistry hashes = MulticodecRegistry.getInstance(Tag.Hash);
 * }</pre>
 */
package com.apicatalog.multicodec.codec;
