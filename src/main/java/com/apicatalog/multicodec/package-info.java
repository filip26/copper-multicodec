/**
 * Core classes for working with
 * <a href="https://github.com/multiformats/multicodec">multicodec</a>
 * identifiers and encoded values.
 *
 * <p>
 * A <em>multicodec</em> is a self-describing format in which the data is
 * prefixed by a varint code identifying the codec. This package provides:
 * </p>
 *
 * <ul>
 * <li>{@link com.apicatalog.multicodec.Multicodec} – immutable definition of a
 * codec including its name, tag, numeric code, varint representation, and
 * status.</li>
 * <li>{@link com.apicatalog.multicodec.MulticodecDecoder} – decoder that uses a
 * {@link com.apicatalog.multicodec.codec.MulticodecRegistry} to resolve and
 * decode multicodec-encoded values.</li>
 * </ul>
 *
 * <h2>Usage Example</h2>
 * 
 * <pre>{@code
 * // obtain a decoder with all known codecs
 * MulticodecDecoder decoder = MulticodecDecoder.getInstance();
 *
 * byte[] encoded = ... ;   // some multicodec-encoded data
 * byte[] decoded = decoder.decode(encoded);
 * }</pre>
 *
 * <p>
 * For additional codecs, see the
 * {@link com.apicatalog.multicodec.codec} subpackage.
 * </p>
 */
package com.apicatalog.multicodec;
