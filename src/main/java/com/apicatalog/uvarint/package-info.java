/**
 * Utilities for working with unsigned variable-length integers (UVarInt).
 *
 * <p>
 * A <em>UVarInt</em> is an encoding of an unsigned integer into one or more
 * bytes using a variable-length scheme. Each byte contributes 7 bits of data,
 * and the highest bit indicates whether more bytes follow. This encoding is
 * widely used in <a href="https://multiformats.io/">multiformats</a>
 * specifications such as multicodec and multihash.
 * </p>
 *
 * <p>
 * The {@link com.apicatalog.uvarint.UVarInt} class provides static methods for:
 * </p>
 * <ul>
 * <li>Encoding a {@code long} into UVarInt form</li>
 * <li>Decoding a UVarInt-encoded byte array back into a {@code long}</li>
 * <li>Determining the number of bytes required to encode a given value</li>
 * </ul>
 *
 * <p>
 * Encoded values are limited to at most
 * {@link com.apicatalog.uvarint.UVarInt#MAX_VAR_LENGTH} bytes.
 * </p>
 */
package com.apicatalog.uvarint;
