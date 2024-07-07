package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec;
import com.apicatalog.multicodec.Multicodec.Tag;

/** Multicodec Registry - generated: Mon Jul 08 00:02:45 CEST 2024 */
public class HashCodec {

    protected HashCodec() { /* protected */ }

    /** Hash: crc32, CRC-32 non-cryptographic hash algorithm (IEEE 802.3), status = draft, code = 0x132 */
    public static final Multicodec CRC32 = Multicodec.of("crc32", Tag.Hash, 0x132);

    /** Hash: crc64-ecma, CRC-64 non-cryptographic hash algorithm (ECMA-182 - Annex B), status = draft, code = 0x164 */
    public static final Multicodec CRC64_ECMA = Multicodec.of("crc64-ecma", Tag.Hash, 0x164);

    /** Hash: murmur3-32, status = draft, code = 0x23 */
    public static final Multicodec MURMUR3_32 = Multicodec.of("murmur3-32", Tag.Hash, 0x23);

    /** Hash: murmur3-x64-128, status = draft, code = 0x1022 */
    public static final Multicodec MURMUR3_X64_128 = Multicodec.of("murmur3-x64-128", Tag.Hash, 0x1022);

    /** Hash: murmur3-x64-64, The first 64-bits of a murmur3-x64-128 - used for UnixFS directory sharding., status = permanent, code = 0x22 */
    public static final Multicodec MURMUR3_X64_64 = Multicodec.of("murmur3-x64-64", Tag.Hash, 0x22);

    /** Hash: sha256a, The sum of multiple sha2-256 hashes; as specified by Ceramic CIP-124., status = draft, code = 0x7012 */
    public static final Multicodec SHA256A = Multicodec.of("sha256a", Tag.Hash, 0x7012);

    /** Hash: xxh-32, Extremely fast non-cryptographic hash algorithm, status = draft, code = 0xb3e1 */
    public static final Multicodec XXH_32 = Multicodec.of("xxh-32", Tag.Hash, 0xb3e1);

    /** Hash: xxh-64, Extremely fast non-cryptographic hash algorithm, status = draft, code = 0xb3e2 */
    public static final Multicodec XXH_64 = Multicodec.of("xxh-64", Tag.Hash, 0xb3e2);

    /** Hash: xxh3-128, Extremely fast non-cryptographic hash algorithm, status = draft, code = 0xb3e4 */
    public static final Multicodec XXH3_128 = Multicodec.of("xxh3-128", Tag.Hash, 0xb3e4);

    /** Hash: xxh3-64, Extremely fast non-cryptographic hash algorithm, status = draft, code = 0xb3e3 */
    public static final Multicodec XXH3_64 = Multicodec.of("xxh3-64", Tag.Hash, 0xb3e3);

    protected static final Map<Long, Multicodec> ALL = new TreeMap<>();

    static {
      ALL.put(CRC32.code(), CRC32);
      ALL.put(CRC64_ECMA.code(), CRC64_ECMA);
      ALL.put(MURMUR3_32.code(), MURMUR3_32);
      ALL.put(MURMUR3_X64_128.code(), MURMUR3_X64_128);
      ALL.put(MURMUR3_X64_64.code(), MURMUR3_X64_64);
      ALL.put(SHA256A.code(), SHA256A);
      ALL.put(XXH_32.code(), XXH_32);
      ALL.put(XXH_64.code(), XXH_64);
      ALL.put(XXH3_128.code(), XXH3_128);
      ALL.put(XXH3_64.code(), XXH3_64);
    }
}
