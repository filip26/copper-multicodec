/**
 * Support for <a href="https://multiformats.io/multihash/">multihash</a>.
 *
 * <p>
 * A <em>multihash</em> is a self-describing cryptographic hash format. It
 * encodes a digest as:
 * </p>
 * <ol>
 * <li>a multicodec code identifying the hash algorithm,</li>
 * <li>a varint indicating the length of the digest,</li>
 * <li>the digest bytes themselves.</li>
 * </ol>
 *
 * <p>
 * This package provides {@link com.apicatalog.multihash.Multihash}, a
 * specialization of {@link com.apicatalog.multicodec.Multicodec} that
 * implements the multihash format. Instances are immutable and thread-safe.
 * </p>
 */
package com.apicatalog.multihash;