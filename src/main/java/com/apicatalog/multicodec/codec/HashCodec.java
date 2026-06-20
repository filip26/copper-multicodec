package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.time.Instant;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec.Tag;
import com.apicatalog.multicodec.Multicodec;

/** Multicodec Registry - generated: Sat Jun 20 18:15:55 CEST 2026 */
public class HashCodec {

    public static final Instant UPDATED = Instant.parse("2026-06-20T16:15:55.288Z");

    public static final long CRC32_CODE = 0x132;
    /** Hash: crc32, CRC-32 non-cryptographic hash algorithm (IEEE 802.3), status = draft, code = 0x132, uvarint = [0xb2, 0x02] */
    public static final Multicodec CRC32 = Multicodec.of("crc32", Tag.Hash, CRC32_CODE, Multicodec.Status.Draft);

    public static final long CRC64_ECMA_CODE = 0x164;
    /** Hash: crc64-ecma, CRC-64 non-cryptographic hash algorithm (ECMA-182 - Annex B), status = draft, code = 0x164, uvarint = [0xe4, 0x02] */
    public static final Multicodec CRC64_ECMA = Multicodec.of("crc64-ecma", Tag.Hash, CRC64_ECMA_CODE, Multicodec.Status.Draft);

    public static final long CRC64_NVME_CODE = 0x165;
    /** Hash: crc64-nvme, CRC-64 checksum based on the NVME polynomial as specified in the NVM Express® NVM Command Set Specification, status = draft, code = 0x165, uvarint = [0xe5, 0x02] */
    public static final Multicodec CRC64_NVME = Multicodec.of("crc64-nvme", Tag.Hash, CRC64_NVME_CODE, Multicodec.Status.Draft);

    public static final long MURMUR3_32_CODE = 0x23;
    /** Hash: murmur3-32, status = draft, code = 0x23, uvarint = [0x23] */
    public static final Multicodec MURMUR3_32 = Multicodec.of("murmur3-32", Tag.Hash, MURMUR3_32_CODE, Multicodec.Status.Draft);

    public static final long MURMUR3_X64_128_CODE = 0x1022;
    /** Hash: murmur3-x64-128, status = draft, code = 0x1022, uvarint = [0xa2, 0x20] */
    public static final Multicodec MURMUR3_X64_128 = Multicodec.of("murmur3-x64-128", Tag.Hash, MURMUR3_X64_128_CODE, Multicodec.Status.Draft);

    public static final long MURMUR3_X64_64_CODE = 0x22;
    /** Hash: murmur3-x64-64, The first 64-bits of a murmur3-x64-128 - used for UnixFS directory sharding., status = permanent, code = 0x22, uvarint = [0x22] */
    public static final Multicodec MURMUR3_X64_64 = Multicodec.of("murmur3-x64-64", Tag.Hash, MURMUR3_X64_64_CODE, Multicodec.Status.Permanent);

    public static final long SHA256A_CODE = 0x7012;
    /** Hash: sha256a, The sum of multiple sha2-256 hashes; as specified by Ceramic CIP-124., status = draft, code = 0x7012, uvarint = [0x92, 0xe0, 0x01] */
    public static final Multicodec SHA256A = Multicodec.of("sha256a", Tag.Hash, SHA256A_CODE, Multicodec.Status.Draft);

    public static final long XXH_32_CODE = 0xb3e1;
    /** Hash: xxh-32, Extremely fast non-cryptographic hash algorithm, status = draft, code = 0xb3e1, uvarint = [0xe1, 0xe7, 0x02] */
    public static final Multicodec XXH_32 = Multicodec.of("xxh-32", Tag.Hash, XXH_32_CODE, Multicodec.Status.Draft);

    public static final long XXH_64_CODE = 0xb3e2;
    /** Hash: xxh-64, Extremely fast non-cryptographic hash algorithm, status = draft, code = 0xb3e2, uvarint = [0xe2, 0xe7, 0x02] */
    public static final Multicodec XXH_64 = Multicodec.of("xxh-64", Tag.Hash, XXH_64_CODE, Multicodec.Status.Draft);

    public static final long XXH3_128_CODE = 0xb3e4;
    /** Hash: xxh3-128, Extremely fast non-cryptographic hash algorithm, status = draft, code = 0xb3e4, uvarint = [0xe4, 0xe7, 0x02] */
    public static final Multicodec XXH3_128 = Multicodec.of("xxh3-128", Tag.Hash, XXH3_128_CODE, Multicodec.Status.Draft);

    public static final long XXH3_64_CODE = 0xb3e3;
    /** Hash: xxh3-64, Extremely fast non-cryptographic hash algorithm, status = draft, code = 0xb3e3, uvarint = [0xe3, 0xe7, 0x02] */
    public static final Multicodec XXH3_64 = Multicodec.of("xxh3-64", Tag.Hash, XXH3_64_CODE, Multicodec.Status.Draft);

    protected static final Map<Long,Multicodec> ALL = new TreeMap<>();

    static {
      ALL.put(CRC32_CODE, CRC32);
      ALL.put(CRC64_ECMA_CODE, CRC64_ECMA);
      ALL.put(CRC64_NVME_CODE, CRC64_NVME);
      ALL.put(MURMUR3_32_CODE, MURMUR3_32);
      ALL.put(MURMUR3_X64_128_CODE, MURMUR3_X64_128);
      ALL.put(MURMUR3_X64_64_CODE, MURMUR3_X64_64);
      ALL.put(SHA256A_CODE, SHA256A);
      ALL.put(XXH_32_CODE, XXH_32);
      ALL.put(XXH_64_CODE, XXH_64);
      ALL.put(XXH3_128_CODE, XXH3_128);
      ALL.put(XXH3_64_CODE, XXH3_64);
    }

    protected HashCodec() { /* protected */ }
}
