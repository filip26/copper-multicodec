package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec;
import com.apicatalog.multicodec.Multicodec.Tag;

/** Multicodec Registry - generated: Sat Nov 25 23:45:54 CET 2023 */
public class HashCodec {

    /** Hash: crc32, CRC-32 non-cryptographic hash algorithm (IEEE 802.3), status = draft, code = 0x132 */
    public static Multicodec CRC32 = new Multicodec("crc32", Tag.Hash, 306, new byte[] {(byte)0xb2, (byte)0x02});

    /** Hash: crc64-ecma, CRC-64 non-cryptographic hash algorithm (ECMA-182 - Annex B), status = draft, code = 0x164 */
    public static Multicodec CRC64_ECMA = new Multicodec("crc64-ecma", Tag.Hash, 356, new byte[] {(byte)0xe4, (byte)0x02});

    /** Hash: murmur3-32, status = draft, code = 0x23 */
    public static Multicodec MURMUR3_32 = new Multicodec("murmur3-32", Tag.Hash, 35, new byte[] {(byte)0x23});

    /** Hash: murmur3-x64-128, status = draft, code = 0x1022 */
    public static Multicodec MURMUR3_X64_128 = new Multicodec("murmur3-x64-128", Tag.Hash, 4130, new byte[] {(byte)0xa2, (byte)0x20});

    /** Hash: murmur3-x64-64, The first 64-bits of a murmur3-x64-128 - used for UnixFS directory sharding., status = permanent, code = 0x22 */
    public static Multicodec MURMUR3_X64_64 = new Multicodec("murmur3-x64-64", Tag.Hash, 34, new byte[] {(byte)0x22});

    /** Hash: sha256a, The sum of multiple sha2-256 hashes; as specified by Ceramic CIP-124., status = draft, code = 0x7012 */
    public static Multicodec SHA256A = new Multicodec("sha256a", Tag.Hash, 28690, new byte[] {(byte)0x92, (byte)0xe0, (byte)0x01});

    /** Hash: xxh-32, Extremely fast non-cryptographic hash algorithm, status = draft, code = 0xb3e1 */
    public static Multicodec XXH_32 = new Multicodec("xxh-32", Tag.Hash, 46049, new byte[] {(byte)0xe1, (byte)0xe7, (byte)0x02});

    /** Hash: xxh-64, Extremely fast non-cryptographic hash algorithm, status = draft, code = 0xb3e2 */
    public static Multicodec XXH_64 = new Multicodec("xxh-64", Tag.Hash, 46050, new byte[] {(byte)0xe2, (byte)0xe7, (byte)0x02});

    /** Hash: xxh3-128, Extremely fast non-cryptographic hash algorithm, status = draft, code = 0xb3e4 */
    public static Multicodec XXH3_128 = new Multicodec("xxh3-128", Tag.Hash, 46052, new byte[] {(byte)0xe4, (byte)0xe7, (byte)0x02});

    /** Hash: xxh3-64, Extremely fast non-cryptographic hash algorithm, status = draft, code = 0xb3e3 */
    public static Multicodec XXH3_64 = new Multicodec("xxh3-64", Tag.Hash, 46051, new byte[] {(byte)0xe3, (byte)0xe7, (byte)0x02});

    public static Map<Long, Multicodec> ALL = new TreeMap<>();

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
