package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec.Tag;
import com.apicatalog.multicodec.Multicodec;

/** Multicodec Registry - generated: Tue Jul 29 16:54:27 CEST 2025 */
public class HashCodec {

    /** Hash: crc32, CRC-32 non-cryptographic hash algorithm (IEEE 802.3), status = draft, code = 0x132 */
    public static final Multicodec CRC32 = Multicodec.of("crc32", Tag.Hash, 0x132, Multicodec.Status.Draft);

    /** Hash: crc64-ecma, CRC-64 non-cryptographic hash algorithm (ECMA-182 - Annex B), status = draft, code = 0x164 */
    public static final Multicodec CRC64_ECMA = Multicodec.of("crc64-ecma", Tag.Hash, 0x164, Multicodec.Status.Draft);

    /** Hash: murmur3-32, status = draft, code = 0x23 */
    public static final Multicodec MURMUR3_32 = Multicodec.of("murmur3-32", Tag.Hash, 0x23, Multicodec.Status.Draft);

    /** Hash: murmur3-x64-128, status = draft, code = 0x1022 */
    public static final Multicodec MURMUR3_X64_128 = Multicodec.of("murmur3-x64-128", Tag.Hash, 0x1022, Multicodec.Status.Draft);

    /** Hash: murmur3-x64-64, The first 64-bits of a murmur3-x64-128 - used for UnixFS directory sharding., status = permanent, code = 0x22 */
    public static final Multicodec MURMUR3_X64_64 = Multicodec.of("murmur3-x64-64", Tag.Hash, 0x22, Multicodec.Status.Permanent);

    /** Hash: sha256a, The sum of multiple sha2-256 hashes; as specified by Ceramic CIP-124., status = draft, code = 0x7012 */
    public static final Multicodec SHA256A = Multicodec.of("sha256a", Tag.Hash, 0x7012, Multicodec.Status.Draft);

    /** Hash: xxh-32, Extremely fast non-cryptographic hash algorithm, status = draft, code = 0xb3e1 */
    public static final Multicodec XXH_32 = Multicodec.of("xxh-32", Tag.Hash, 0xb3e1, Multicodec.Status.Draft);

    /** Hash: xxh-64, Extremely fast non-cryptographic hash algorithm, status = draft, code = 0xb3e2 */
    public static final Multicodec XXH_64 = Multicodec.of("xxh-64", Tag.Hash, 0xb3e2, Multicodec.Status.Draft);

    /** Hash: xxh3-128, Extremely fast non-cryptographic hash algorithm, status = draft, code = 0xb3e4 */
    public static final Multicodec XXH3_128 = Multicodec.of("xxh3-128", Tag.Hash, 0xb3e4, Multicodec.Status.Draft);

    /** Hash: xxh3-64, Extremely fast non-cryptographic hash algorithm, status = draft, code = 0xb3e3 */
    public static final Multicodec XXH3_64 = Multicodec.of("xxh3-64", Tag.Hash, 0xb3e3, Multicodec.Status.Draft);

    protected static final Map<Long,Multicodec> ALL = new TreeMap<>();

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

    protected HashCodec() { /* protected */ }
}
