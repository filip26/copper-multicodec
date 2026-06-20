package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.time.Instant;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec;
import com.apicatalog.multihash.Multihash;

/** Multicodec Registry - generated: Sat Jun 20 18:15:55 CEST 2026 */
public class MultihashCodec {

    public static final Instant UPDATED = Instant.parse("2026-06-20T16:15:55.248Z");

    public static final long BCRYPT_PBKDF_CODE = 0xd00d;
    /** Multihash: bcrypt-pbkdf, Bcrypt-PBKDF key derivation function, status = draft, code = 0xd00d, uvarint = [0x8d, 0xa0, 0x03] */
    public static final Multihash BCRYPT_PBKDF = Multihash.of("bcrypt-pbkdf", BCRYPT_PBKDF_CODE, Multicodec.Status.Draft);

    public static final long BITTORRENT_PIECES_ROOT_CODE = 0xb702;
    /** Multihash: bittorrent-pieces-root, BitTorrent v2 pieces root hash., status = draft, code = 0xb702, uvarint = [0x82, 0xee, 0x02] */
    public static final Multihash BITTORRENT_PIECES_ROOT = Multihash.of("bittorrent-pieces-root", BITTORRENT_PIECES_ROOT_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_104_CODE = 0xb20d;
    /** Multihash: blake2b-104, status = draft, code = 0xb20d, uvarint = [0x8d, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_104 = Multihash.of("blake2b-104", BLAKE2B_104_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_112_CODE = 0xb20e;
    /** Multihash: blake2b-112, status = draft, code = 0xb20e, uvarint = [0x8e, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_112 = Multihash.of("blake2b-112", BLAKE2B_112_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_120_CODE = 0xb20f;
    /** Multihash: blake2b-120, status = draft, code = 0xb20f, uvarint = [0x8f, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_120 = Multihash.of("blake2b-120", BLAKE2B_120_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_128_CODE = 0xb210;
    /** Multihash: blake2b-128, status = draft, code = 0xb210, uvarint = [0x90, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_128 = Multihash.of("blake2b-128", BLAKE2B_128_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_136_CODE = 0xb211;
    /** Multihash: blake2b-136, status = draft, code = 0xb211, uvarint = [0x91, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_136 = Multihash.of("blake2b-136", BLAKE2B_136_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_144_CODE = 0xb212;
    /** Multihash: blake2b-144, status = draft, code = 0xb212, uvarint = [0x92, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_144 = Multihash.of("blake2b-144", BLAKE2B_144_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_152_CODE = 0xb213;
    /** Multihash: blake2b-152, status = draft, code = 0xb213, uvarint = [0x93, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_152 = Multihash.of("blake2b-152", BLAKE2B_152_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_16_CODE = 0xb202;
    /** Multihash: blake2b-16, status = draft, code = 0xb202, uvarint = [0x82, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_16 = Multihash.of("blake2b-16", BLAKE2B_16_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_160_CODE = 0xb214;
    /** Multihash: blake2b-160, status = draft, code = 0xb214, uvarint = [0x94, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_160 = Multihash.of("blake2b-160", BLAKE2B_160_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_168_CODE = 0xb215;
    /** Multihash: blake2b-168, status = draft, code = 0xb215, uvarint = [0x95, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_168 = Multihash.of("blake2b-168", BLAKE2B_168_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_176_CODE = 0xb216;
    /** Multihash: blake2b-176, status = draft, code = 0xb216, uvarint = [0x96, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_176 = Multihash.of("blake2b-176", BLAKE2B_176_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_184_CODE = 0xb217;
    /** Multihash: blake2b-184, status = draft, code = 0xb217, uvarint = [0x97, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_184 = Multihash.of("blake2b-184", BLAKE2B_184_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_192_CODE = 0xb218;
    /** Multihash: blake2b-192, status = draft, code = 0xb218, uvarint = [0x98, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_192 = Multihash.of("blake2b-192", BLAKE2B_192_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_200_CODE = 0xb219;
    /** Multihash: blake2b-200, status = draft, code = 0xb219, uvarint = [0x99, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_200 = Multihash.of("blake2b-200", BLAKE2B_200_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_208_CODE = 0xb21a;
    /** Multihash: blake2b-208, status = draft, code = 0xb21a, uvarint = [0x9a, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_208 = Multihash.of("blake2b-208", BLAKE2B_208_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_216_CODE = 0xb21b;
    /** Multihash: blake2b-216, status = draft, code = 0xb21b, uvarint = [0x9b, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_216 = Multihash.of("blake2b-216", BLAKE2B_216_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_224_CODE = 0xb21c;
    /** Multihash: blake2b-224, status = draft, code = 0xb21c, uvarint = [0x9c, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_224 = Multihash.of("blake2b-224", BLAKE2B_224_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_232_CODE = 0xb21d;
    /** Multihash: blake2b-232, status = draft, code = 0xb21d, uvarint = [0x9d, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_232 = Multihash.of("blake2b-232", BLAKE2B_232_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_24_CODE = 0xb203;
    /** Multihash: blake2b-24, status = draft, code = 0xb203, uvarint = [0x83, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_24 = Multihash.of("blake2b-24", BLAKE2B_24_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_240_CODE = 0xb21e;
    /** Multihash: blake2b-240, status = draft, code = 0xb21e, uvarint = [0x9e, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_240 = Multihash.of("blake2b-240", BLAKE2B_240_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_248_CODE = 0xb21f;
    /** Multihash: blake2b-248, status = draft, code = 0xb21f, uvarint = [0x9f, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_248 = Multihash.of("blake2b-248", BLAKE2B_248_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_256_CODE = 0xb220;
    /** Multihash: blake2b-256, status = permanent, code = 0xb220, uvarint = [0xa0, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_256 = Multihash.of("blake2b-256", BLAKE2B_256_CODE, Multicodec.Status.Permanent);

    public static final long BLAKE2B_264_CODE = 0xb221;
    /** Multihash: blake2b-264, status = draft, code = 0xb221, uvarint = [0xa1, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_264 = Multihash.of("blake2b-264", BLAKE2B_264_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_272_CODE = 0xb222;
    /** Multihash: blake2b-272, status = draft, code = 0xb222, uvarint = [0xa2, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_272 = Multihash.of("blake2b-272", BLAKE2B_272_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_280_CODE = 0xb223;
    /** Multihash: blake2b-280, status = draft, code = 0xb223, uvarint = [0xa3, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_280 = Multihash.of("blake2b-280", BLAKE2B_280_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_288_CODE = 0xb224;
    /** Multihash: blake2b-288, status = draft, code = 0xb224, uvarint = [0xa4, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_288 = Multihash.of("blake2b-288", BLAKE2B_288_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_296_CODE = 0xb225;
    /** Multihash: blake2b-296, status = draft, code = 0xb225, uvarint = [0xa5, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_296 = Multihash.of("blake2b-296", BLAKE2B_296_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_304_CODE = 0xb226;
    /** Multihash: blake2b-304, status = draft, code = 0xb226, uvarint = [0xa6, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_304 = Multihash.of("blake2b-304", BLAKE2B_304_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_312_CODE = 0xb227;
    /** Multihash: blake2b-312, status = draft, code = 0xb227, uvarint = [0xa7, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_312 = Multihash.of("blake2b-312", BLAKE2B_312_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_32_CODE = 0xb204;
    /** Multihash: blake2b-32, status = draft, code = 0xb204, uvarint = [0x84, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_32 = Multihash.of("blake2b-32", BLAKE2B_32_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_320_CODE = 0xb228;
    /** Multihash: blake2b-320, status = draft, code = 0xb228, uvarint = [0xa8, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_320 = Multihash.of("blake2b-320", BLAKE2B_320_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_328_CODE = 0xb229;
    /** Multihash: blake2b-328, status = draft, code = 0xb229, uvarint = [0xa9, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_328 = Multihash.of("blake2b-328", BLAKE2B_328_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_336_CODE = 0xb22a;
    /** Multihash: blake2b-336, status = draft, code = 0xb22a, uvarint = [0xaa, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_336 = Multihash.of("blake2b-336", BLAKE2B_336_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_344_CODE = 0xb22b;
    /** Multihash: blake2b-344, status = draft, code = 0xb22b, uvarint = [0xab, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_344 = Multihash.of("blake2b-344", BLAKE2B_344_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_352_CODE = 0xb22c;
    /** Multihash: blake2b-352, status = draft, code = 0xb22c, uvarint = [0xac, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_352 = Multihash.of("blake2b-352", BLAKE2B_352_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_360_CODE = 0xb22d;
    /** Multihash: blake2b-360, status = draft, code = 0xb22d, uvarint = [0xad, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_360 = Multihash.of("blake2b-360", BLAKE2B_360_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_368_CODE = 0xb22e;
    /** Multihash: blake2b-368, status = draft, code = 0xb22e, uvarint = [0xae, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_368 = Multihash.of("blake2b-368", BLAKE2B_368_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_376_CODE = 0xb22f;
    /** Multihash: blake2b-376, status = draft, code = 0xb22f, uvarint = [0xaf, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_376 = Multihash.of("blake2b-376", BLAKE2B_376_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_384_CODE = 0xb230;
    /** Multihash: blake2b-384, status = draft, code = 0xb230, uvarint = [0xb0, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_384 = Multihash.of("blake2b-384", BLAKE2B_384_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_392_CODE = 0xb231;
    /** Multihash: blake2b-392, status = draft, code = 0xb231, uvarint = [0xb1, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_392 = Multihash.of("blake2b-392", BLAKE2B_392_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_40_CODE = 0xb205;
    /** Multihash: blake2b-40, status = draft, code = 0xb205, uvarint = [0x85, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_40 = Multihash.of("blake2b-40", BLAKE2B_40_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_400_CODE = 0xb232;
    /** Multihash: blake2b-400, status = draft, code = 0xb232, uvarint = [0xb2, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_400 = Multihash.of("blake2b-400", BLAKE2B_400_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_408_CODE = 0xb233;
    /** Multihash: blake2b-408, status = draft, code = 0xb233, uvarint = [0xb3, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_408 = Multihash.of("blake2b-408", BLAKE2B_408_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_416_CODE = 0xb234;
    /** Multihash: blake2b-416, status = draft, code = 0xb234, uvarint = [0xb4, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_416 = Multihash.of("blake2b-416", BLAKE2B_416_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_424_CODE = 0xb235;
    /** Multihash: blake2b-424, status = draft, code = 0xb235, uvarint = [0xb5, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_424 = Multihash.of("blake2b-424", BLAKE2B_424_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_432_CODE = 0xb236;
    /** Multihash: blake2b-432, status = draft, code = 0xb236, uvarint = [0xb6, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_432 = Multihash.of("blake2b-432", BLAKE2B_432_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_440_CODE = 0xb237;
    /** Multihash: blake2b-440, status = draft, code = 0xb237, uvarint = [0xb7, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_440 = Multihash.of("blake2b-440", BLAKE2B_440_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_448_CODE = 0xb238;
    /** Multihash: blake2b-448, status = draft, code = 0xb238, uvarint = [0xb8, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_448 = Multihash.of("blake2b-448", BLAKE2B_448_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_456_CODE = 0xb239;
    /** Multihash: blake2b-456, status = draft, code = 0xb239, uvarint = [0xb9, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_456 = Multihash.of("blake2b-456", BLAKE2B_456_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_464_CODE = 0xb23a;
    /** Multihash: blake2b-464, status = draft, code = 0xb23a, uvarint = [0xba, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_464 = Multihash.of("blake2b-464", BLAKE2B_464_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_472_CODE = 0xb23b;
    /** Multihash: blake2b-472, status = draft, code = 0xb23b, uvarint = [0xbb, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_472 = Multihash.of("blake2b-472", BLAKE2B_472_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_48_CODE = 0xb206;
    /** Multihash: blake2b-48, status = draft, code = 0xb206, uvarint = [0x86, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_48 = Multihash.of("blake2b-48", BLAKE2B_48_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_480_CODE = 0xb23c;
    /** Multihash: blake2b-480, status = draft, code = 0xb23c, uvarint = [0xbc, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_480 = Multihash.of("blake2b-480", BLAKE2B_480_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_488_CODE = 0xb23d;
    /** Multihash: blake2b-488, status = draft, code = 0xb23d, uvarint = [0xbd, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_488 = Multihash.of("blake2b-488", BLAKE2B_488_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_496_CODE = 0xb23e;
    /** Multihash: blake2b-496, status = draft, code = 0xb23e, uvarint = [0xbe, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_496 = Multihash.of("blake2b-496", BLAKE2B_496_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_504_CODE = 0xb23f;
    /** Multihash: blake2b-504, status = draft, code = 0xb23f, uvarint = [0xbf, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_504 = Multihash.of("blake2b-504", BLAKE2B_504_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_512_CODE = 0xb240;
    /** Multihash: blake2b-512, status = draft, code = 0xb240, uvarint = [0xc0, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_512 = Multihash.of("blake2b-512", BLAKE2B_512_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_56_CODE = 0xb207;
    /** Multihash: blake2b-56, status = draft, code = 0xb207, uvarint = [0x87, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_56 = Multihash.of("blake2b-56", BLAKE2B_56_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_64_CODE = 0xb208;
    /** Multihash: blake2b-64, status = draft, code = 0xb208, uvarint = [0x88, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_64 = Multihash.of("blake2b-64", BLAKE2B_64_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_72_CODE = 0xb209;
    /** Multihash: blake2b-72, status = draft, code = 0xb209, uvarint = [0x89, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_72 = Multihash.of("blake2b-72", BLAKE2B_72_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_8_CODE = 0xb201;
    /** Multihash: blake2b-8, Blake2b consists of 64 output lengths that give different hashes, status = draft, code = 0xb201, uvarint = [0x81, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_8 = Multihash.of("blake2b-8", BLAKE2B_8_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_80_CODE = 0xb20a;
    /** Multihash: blake2b-80, status = draft, code = 0xb20a, uvarint = [0x8a, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_80 = Multihash.of("blake2b-80", BLAKE2B_80_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_88_CODE = 0xb20b;
    /** Multihash: blake2b-88, status = draft, code = 0xb20b, uvarint = [0x8b, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_88 = Multihash.of("blake2b-88", BLAKE2B_88_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2B_96_CODE = 0xb20c;
    /** Multihash: blake2b-96, status = draft, code = 0xb20c, uvarint = [0x8c, 0xe4, 0x02] */
    public static final Multihash BLAKE2B_96 = Multihash.of("blake2b-96", BLAKE2B_96_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_104_CODE = 0xb24d;
    /** Multihash: blake2s-104, status = draft, code = 0xb24d, uvarint = [0xcd, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_104 = Multihash.of("blake2s-104", BLAKE2S_104_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_112_CODE = 0xb24e;
    /** Multihash: blake2s-112, status = draft, code = 0xb24e, uvarint = [0xce, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_112 = Multihash.of("blake2s-112", BLAKE2S_112_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_120_CODE = 0xb24f;
    /** Multihash: blake2s-120, status = draft, code = 0xb24f, uvarint = [0xcf, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_120 = Multihash.of("blake2s-120", BLAKE2S_120_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_128_CODE = 0xb250;
    /** Multihash: blake2s-128, status = draft, code = 0xb250, uvarint = [0xd0, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_128 = Multihash.of("blake2s-128", BLAKE2S_128_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_136_CODE = 0xb251;
    /** Multihash: blake2s-136, status = draft, code = 0xb251, uvarint = [0xd1, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_136 = Multihash.of("blake2s-136", BLAKE2S_136_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_144_CODE = 0xb252;
    /** Multihash: blake2s-144, status = draft, code = 0xb252, uvarint = [0xd2, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_144 = Multihash.of("blake2s-144", BLAKE2S_144_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_152_CODE = 0xb253;
    /** Multihash: blake2s-152, status = draft, code = 0xb253, uvarint = [0xd3, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_152 = Multihash.of("blake2s-152", BLAKE2S_152_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_16_CODE = 0xb242;
    /** Multihash: blake2s-16, status = draft, code = 0xb242, uvarint = [0xc2, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_16 = Multihash.of("blake2s-16", BLAKE2S_16_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_160_CODE = 0xb254;
    /** Multihash: blake2s-160, status = draft, code = 0xb254, uvarint = [0xd4, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_160 = Multihash.of("blake2s-160", BLAKE2S_160_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_168_CODE = 0xb255;
    /** Multihash: blake2s-168, status = draft, code = 0xb255, uvarint = [0xd5, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_168 = Multihash.of("blake2s-168", BLAKE2S_168_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_176_CODE = 0xb256;
    /** Multihash: blake2s-176, status = draft, code = 0xb256, uvarint = [0xd6, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_176 = Multihash.of("blake2s-176", BLAKE2S_176_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_184_CODE = 0xb257;
    /** Multihash: blake2s-184, status = draft, code = 0xb257, uvarint = [0xd7, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_184 = Multihash.of("blake2s-184", BLAKE2S_184_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_192_CODE = 0xb258;
    /** Multihash: blake2s-192, status = draft, code = 0xb258, uvarint = [0xd8, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_192 = Multihash.of("blake2s-192", BLAKE2S_192_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_200_CODE = 0xb259;
    /** Multihash: blake2s-200, status = draft, code = 0xb259, uvarint = [0xd9, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_200 = Multihash.of("blake2s-200", BLAKE2S_200_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_208_CODE = 0xb25a;
    /** Multihash: blake2s-208, status = draft, code = 0xb25a, uvarint = [0xda, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_208 = Multihash.of("blake2s-208", BLAKE2S_208_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_216_CODE = 0xb25b;
    /** Multihash: blake2s-216, status = draft, code = 0xb25b, uvarint = [0xdb, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_216 = Multihash.of("blake2s-216", BLAKE2S_216_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_224_CODE = 0xb25c;
    /** Multihash: blake2s-224, status = draft, code = 0xb25c, uvarint = [0xdc, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_224 = Multihash.of("blake2s-224", BLAKE2S_224_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_232_CODE = 0xb25d;
    /** Multihash: blake2s-232, status = draft, code = 0xb25d, uvarint = [0xdd, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_232 = Multihash.of("blake2s-232", BLAKE2S_232_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_24_CODE = 0xb243;
    /** Multihash: blake2s-24, status = draft, code = 0xb243, uvarint = [0xc3, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_24 = Multihash.of("blake2s-24", BLAKE2S_24_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_240_CODE = 0xb25e;
    /** Multihash: blake2s-240, status = draft, code = 0xb25e, uvarint = [0xde, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_240 = Multihash.of("blake2s-240", BLAKE2S_240_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_248_CODE = 0xb25f;
    /** Multihash: blake2s-248, status = draft, code = 0xb25f, uvarint = [0xdf, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_248 = Multihash.of("blake2s-248", BLAKE2S_248_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_256_CODE = 0xb260;
    /** Multihash: blake2s-256, status = draft, code = 0xb260, uvarint = [0xe0, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_256 = Multihash.of("blake2s-256", BLAKE2S_256_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_32_CODE = 0xb244;
    /** Multihash: blake2s-32, status = draft, code = 0xb244, uvarint = [0xc4, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_32 = Multihash.of("blake2s-32", BLAKE2S_32_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_40_CODE = 0xb245;
    /** Multihash: blake2s-40, status = draft, code = 0xb245, uvarint = [0xc5, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_40 = Multihash.of("blake2s-40", BLAKE2S_40_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_48_CODE = 0xb246;
    /** Multihash: blake2s-48, status = draft, code = 0xb246, uvarint = [0xc6, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_48 = Multihash.of("blake2s-48", BLAKE2S_48_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_56_CODE = 0xb247;
    /** Multihash: blake2s-56, status = draft, code = 0xb247, uvarint = [0xc7, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_56 = Multihash.of("blake2s-56", BLAKE2S_56_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_64_CODE = 0xb248;
    /** Multihash: blake2s-64, status = draft, code = 0xb248, uvarint = [0xc8, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_64 = Multihash.of("blake2s-64", BLAKE2S_64_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_72_CODE = 0xb249;
    /** Multihash: blake2s-72, status = draft, code = 0xb249, uvarint = [0xc9, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_72 = Multihash.of("blake2s-72", BLAKE2S_72_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_8_CODE = 0xb241;
    /** Multihash: blake2s-8, Blake2s consists of 32 output lengths that give different hashes, status = draft, code = 0xb241, uvarint = [0xc1, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_8 = Multihash.of("blake2s-8", BLAKE2S_8_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_80_CODE = 0xb24a;
    /** Multihash: blake2s-80, status = draft, code = 0xb24a, uvarint = [0xca, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_80 = Multihash.of("blake2s-80", BLAKE2S_80_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_88_CODE = 0xb24b;
    /** Multihash: blake2s-88, status = draft, code = 0xb24b, uvarint = [0xcb, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_88 = Multihash.of("blake2s-88", BLAKE2S_88_CODE, Multicodec.Status.Draft);

    public static final long BLAKE2S_96_CODE = 0xb24c;
    /** Multihash: blake2s-96, status = draft, code = 0xb24c, uvarint = [0xcc, 0xe4, 0x02] */
    public static final Multihash BLAKE2S_96 = Multihash.of("blake2s-96", BLAKE2S_96_CODE, Multicodec.Status.Draft);

    public static final long BLAKE3_CODE = 0x1e;
    /** Multihash: blake3, BLAKE3 has a default 32 byte output length. The maximum length is (2^64)-1 bytes., status = draft, code = 0x1e, uvarint = [0x1e] */
    public static final Multihash BLAKE3 = Multihash.of("blake3", BLAKE3_CODE, Multicodec.Status.Draft);

    public static final long DBL_SHA2_256_CODE = 0x56;
    /** Multihash: dbl-sha2-256, status = draft, code = 0x56, uvarint = [0x56] */
    public static final Multihash DBL_SHA2_256 = Multihash.of("dbl-sha2-256", DBL_SHA2_256_CODE, Multicodec.Status.Draft);

    public static final long ED2K_CODE = 0xed20;
    /** Multihash: ed2k, eDonkey2000 hash., status = draft, code = 0xed20, uvarint = [0xa0, 0xda, 0x03] */
    public static final Multihash ED2K = Multihash.of("ed2k", ED2K_CODE, Multicodec.Status.Draft);

    public static final long FR32_SHA256_TRUNC254_PADBINTREE_CODE = 0x1011;
    /** Multihash: fr32-sha256-trunc254-padbintree, A balanced binary tree hash used in Filecoin Piece Commitments as described in FRC-0069, status = draft, code = 0x1011, uvarint = [0x91, 0x20] */
    public static final Multihash FR32_SHA256_TRUNC254_PADBINTREE = Multihash.of("fr32-sha256-trunc254-padbintree", FR32_SHA256_TRUNC254_PADBINTREE_CODE, Multicodec.Status.Draft);

    public static final long IDENTITY_CODE = 0x0;
    /** Multihash: identity, raw binary, status = permanent, code = 0x0, uvarint = [0x00] */
    public static final Multihash IDENTITY = Multihash.of("identity", IDENTITY_CODE, Multicodec.Status.Permanent);

    public static final long KECCAK_224_CODE = 0x1a;
    /** Multihash: keccak-224, keccak has variable output length. The number specifies the core length, status = draft, code = 0x1a, uvarint = [0x1a] */
    public static final Multihash KECCAK_224 = Multihash.of("keccak-224", KECCAK_224_CODE, Multicodec.Status.Draft);

    public static final long KECCAK_256_CODE = 0x1b;
    /** Multihash: keccak-256, status = draft, code = 0x1b, uvarint = [0x1b] */
    public static final Multihash KECCAK_256 = Multihash.of("keccak-256", KECCAK_256_CODE, Multicodec.Status.Draft);

    public static final long KECCAK_384_CODE = 0x1c;
    /** Multihash: keccak-384, status = draft, code = 0x1c, uvarint = [0x1c] */
    public static final Multihash KECCAK_384 = Multihash.of("keccak-384", KECCAK_384_CODE, Multicodec.Status.Draft);

    public static final long KECCAK_512_CODE = 0x1d;
    /** Multihash: keccak-512, status = draft, code = 0x1d, uvarint = [0x1d] */
    public static final Multihash KECCAK_512 = Multihash.of("keccak-512", KECCAK_512_CODE, Multicodec.Status.Draft);

    public static final long KT_128_CODE = 0x1d01;
    /** Multihash: kt-128, KangarooTwelve KT128 extendable-output hash function (XOF) as defined in RFC 9861, status = draft, code = 0x1d01, uvarint = [0x81, 0x3a] */
    public static final Multihash KT_128 = Multihash.of("kt-128", KT_128_CODE, Multicodec.Status.Draft);

    public static final long KT_256_CODE = 0x1d02;
    /** Multihash: kt-256, KangarooTwelve KT256 extendable-output hash function (XOF) as defined in RFC 9861, status = draft, code = 0x1d02, uvarint = [0x82, 0x3a] */
    public static final Multihash KT_256 = Multihash.of("kt-256", KT_256_CODE, Multicodec.Status.Draft);

    public static final long MD4_CODE = 0xd4;
    /** Multihash: md4, status = draft, code = 0xd4, uvarint = [0xd4, 0x01] */
    public static final Multihash MD4 = Multihash.of("md4", MD4_CODE, Multicodec.Status.Draft);

    public static final long MD5_CODE = 0xd5;
    /** Multihash: md5, status = draft, code = 0xd5, uvarint = [0xd5, 0x01] */
    public static final Multihash MD5 = Multihash.of("md5", MD5_CODE, Multicodec.Status.Draft);

    public static final long POSEIDON_BLS12_381_A2_FC1_CODE = 0xb401;
    /** Multihash: poseidon-bls12_381-a2-fc1, Poseidon using BLS12-381 and arity of 2 with Filecoin parameters, status = permanent, code = 0xb401, uvarint = [0x81, 0xe8, 0x02] */
    public static final Multihash POSEIDON_BLS12_381_A2_FC1 = Multihash.of("poseidon-bls12_381-a2-fc1", POSEIDON_BLS12_381_A2_FC1_CODE, Multicodec.Status.Permanent);

    public static final long POSEIDON_BLS12_381_A2_FC1_SC_CODE = 0xb402;
    /** Multihash: poseidon-bls12_381-a2-fc1-sc, Poseidon using BLS12-381 and arity of 2 with Filecoin parameters - high-security variant, status = draft, code = 0xb402, uvarint = [0x82, 0xe8, 0x02] */
    public static final Multihash POSEIDON_BLS12_381_A2_FC1_SC = Multihash.of("poseidon-bls12_381-a2-fc1-sc", POSEIDON_BLS12_381_A2_FC1_SC_CODE, Multicodec.Status.Draft);

    public static final long RIPEMD_128_CODE = 0x1052;
    /** Multihash: ripemd-128, status = draft, code = 0x1052, uvarint = [0xd2, 0x20] */
    public static final Multihash RIPEMD_128 = Multihash.of("ripemd-128", RIPEMD_128_CODE, Multicodec.Status.Draft);

    public static final long RIPEMD_160_CODE = 0x1053;
    /** Multihash: ripemd-160, status = draft, code = 0x1053, uvarint = [0xd3, 0x20] */
    public static final Multihash RIPEMD_160 = Multihash.of("ripemd-160", RIPEMD_160_CODE, Multicodec.Status.Draft);

    public static final long RIPEMD_256_CODE = 0x1054;
    /** Multihash: ripemd-256, status = draft, code = 0x1054, uvarint = [0xd4, 0x20] */
    public static final Multihash RIPEMD_256 = Multihash.of("ripemd-256", RIPEMD_256_CODE, Multicodec.Status.Draft);

    public static final long RIPEMD_320_CODE = 0x1055;
    /** Multihash: ripemd-320, status = draft, code = 0x1055, uvarint = [0xd5, 0x20] */
    public static final Multihash RIPEMD_320 = Multihash.of("ripemd-320", RIPEMD_320_CODE, Multicodec.Status.Draft);

    public static final long SHA1_CODE = 0x11;
    /** Multihash: sha1, status = permanent, code = 0x11, uvarint = [0x11] */
    public static final Multihash SHA1 = Multihash.of("sha1", SHA1_CODE, Multicodec.Status.Permanent);

    public static final long SHA2_224_CODE = 0x1013;
    /** Multihash: sha2-224, aka SHA-224; as specified by FIPS 180-4., status = permanent, code = 0x1013, uvarint = [0x93, 0x20] */
    public static final Multihash SHA2_224 = Multihash.of("sha2-224", SHA2_224_CODE, Multicodec.Status.Permanent);

    public static final long SHA2_256_CODE = 0x12;
    /** Multihash: sha2-256, status = permanent, code = 0x12, uvarint = [0x12] */
    public static final Multihash SHA2_256 = Multihash.of("sha2-256", SHA2_256_CODE, Multicodec.Status.Permanent);

    public static final long SHA2_256_CHUNKED_CODE = 0xb510;
    /** Multihash: sha2-256-chunked, Hash of concatenated SHA2-256 digests of 8*2^n MiB source chunks; n = ceil(log2(source_size/(10^4 * 8MiB))), status = draft, code = 0xb510, uvarint = [0x90, 0xea, 0x02] */
    public static final Multihash SHA2_256_CHUNKED = Multihash.of("sha2-256-chunked", SHA2_256_CHUNKED_CODE, Multicodec.Status.Draft);

    public static final long SHA2_256_TRUNC254_PADDED_CODE = 0x1012;
    /** Multihash: sha2-256-trunc254-padded, SHA2-256 with the two most significant bits from the last byte zeroed (as via a mask with 0b00111111) - used for proving trees as in Filecoin, status = permanent, code = 0x1012, uvarint = [0x92, 0x20] */
    public static final Multihash SHA2_256_TRUNC254_PADDED = Multihash.of("sha2-256-trunc254-padded", SHA2_256_TRUNC254_PADDED_CODE, Multicodec.Status.Permanent);

    public static final long SHA2_384_CODE = 0x20;
    /** Multihash: sha2-384, aka SHA-384; as specified by FIPS 180-4., status = permanent, code = 0x20, uvarint = [0x20] */
    public static final Multihash SHA2_384 = Multihash.of("sha2-384", SHA2_384_CODE, Multicodec.Status.Permanent);

    public static final long SHA2_512_CODE = 0x13;
    /** Multihash: sha2-512, status = permanent, code = 0x13, uvarint = [0x13] */
    public static final Multihash SHA2_512 = Multihash.of("sha2-512", SHA2_512_CODE, Multicodec.Status.Permanent);

    public static final long SHA2_512_224_CODE = 0x1014;
    /** Multihash: sha2-512-224, aka SHA-512/224; as specified by FIPS 180-4., status = permanent, code = 0x1014, uvarint = [0x94, 0x20] */
    public static final Multihash SHA2_512_224 = Multihash.of("sha2-512-224", SHA2_512_224_CODE, Multicodec.Status.Permanent);

    public static final long SHA2_512_256_CODE = 0x1015;
    /** Multihash: sha2-512-256, aka SHA-512/256; as specified by FIPS 180-4., status = permanent, code = 0x1015, uvarint = [0x95, 0x20] */
    public static final Multihash SHA2_512_256 = Multihash.of("sha2-512-256", SHA2_512_256_CODE, Multicodec.Status.Permanent);

    public static final long SHA3_224_CODE = 0x17;
    /** Multihash: sha3-224, status = permanent, code = 0x17, uvarint = [0x17] */
    public static final Multihash SHA3_224 = Multihash.of("sha3-224", SHA3_224_CODE, Multicodec.Status.Permanent);

    public static final long SHA3_256_CODE = 0x16;
    /** Multihash: sha3-256, status = permanent, code = 0x16, uvarint = [0x16] */
    public static final Multihash SHA3_256 = Multihash.of("sha3-256", SHA3_256_CODE, Multicodec.Status.Permanent);

    public static final long SHA3_384_CODE = 0x15;
    /** Multihash: sha3-384, status = permanent, code = 0x15, uvarint = [0x15] */
    public static final Multihash SHA3_384 = Multihash.of("sha3-384", SHA3_384_CODE, Multicodec.Status.Permanent);

    public static final long SHA3_512_CODE = 0x14;
    /** Multihash: sha3-512, status = permanent, code = 0x14, uvarint = [0x14] */
    public static final Multihash SHA3_512 = Multihash.of("sha3-512", SHA3_512_CODE, Multicodec.Status.Permanent);

    public static final long SHAKE_128_CODE = 0x18;
    /** Multihash: shake-128, status = draft, code = 0x18, uvarint = [0x18] */
    public static final Multihash SHAKE_128 = Multihash.of("shake-128", SHAKE_128_CODE, Multicodec.Status.Draft);

    public static final long SHAKE_256_CODE = 0x19;
    /** Multihash: shake-256, status = draft, code = 0x19, uvarint = [0x19] */
    public static final Multihash SHAKE_256 = Multihash.of("shake-256", SHAKE_256_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_1000_CODE = 0xb3dd;
    /** Multihash: skein1024-1000, status = draft, code = 0xb3dd, uvarint = [0xdd, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_1000 = Multihash.of("skein1024-1000", SKEIN1024_1000_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_1008_CODE = 0xb3de;
    /** Multihash: skein1024-1008, status = draft, code = 0xb3de, uvarint = [0xde, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_1008 = Multihash.of("skein1024-1008", SKEIN1024_1008_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_1016_CODE = 0xb3df;
    /** Multihash: skein1024-1016, status = draft, code = 0xb3df, uvarint = [0xdf, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_1016 = Multihash.of("skein1024-1016", SKEIN1024_1016_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_1024_CODE = 0xb3e0;
    /** Multihash: skein1024-1024, status = draft, code = 0xb3e0, uvarint = [0xe0, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_1024 = Multihash.of("skein1024-1024", SKEIN1024_1024_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_104_CODE = 0xb36d;
    /** Multihash: skein1024-104, status = draft, code = 0xb36d, uvarint = [0xed, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_104 = Multihash.of("skein1024-104", SKEIN1024_104_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_112_CODE = 0xb36e;
    /** Multihash: skein1024-112, status = draft, code = 0xb36e, uvarint = [0xee, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_112 = Multihash.of("skein1024-112", SKEIN1024_112_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_120_CODE = 0xb36f;
    /** Multihash: skein1024-120, status = draft, code = 0xb36f, uvarint = [0xef, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_120 = Multihash.of("skein1024-120", SKEIN1024_120_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_128_CODE = 0xb370;
    /** Multihash: skein1024-128, status = draft, code = 0xb370, uvarint = [0xf0, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_128 = Multihash.of("skein1024-128", SKEIN1024_128_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_136_CODE = 0xb371;
    /** Multihash: skein1024-136, status = draft, code = 0xb371, uvarint = [0xf1, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_136 = Multihash.of("skein1024-136", SKEIN1024_136_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_144_CODE = 0xb372;
    /** Multihash: skein1024-144, status = draft, code = 0xb372, uvarint = [0xf2, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_144 = Multihash.of("skein1024-144", SKEIN1024_144_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_152_CODE = 0xb373;
    /** Multihash: skein1024-152, status = draft, code = 0xb373, uvarint = [0xf3, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_152 = Multihash.of("skein1024-152", SKEIN1024_152_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_16_CODE = 0xb362;
    /** Multihash: skein1024-16, status = draft, code = 0xb362, uvarint = [0xe2, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_16 = Multihash.of("skein1024-16", SKEIN1024_16_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_160_CODE = 0xb374;
    /** Multihash: skein1024-160, status = draft, code = 0xb374, uvarint = [0xf4, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_160 = Multihash.of("skein1024-160", SKEIN1024_160_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_168_CODE = 0xb375;
    /** Multihash: skein1024-168, status = draft, code = 0xb375, uvarint = [0xf5, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_168 = Multihash.of("skein1024-168", SKEIN1024_168_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_176_CODE = 0xb376;
    /** Multihash: skein1024-176, status = draft, code = 0xb376, uvarint = [0xf6, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_176 = Multihash.of("skein1024-176", SKEIN1024_176_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_184_CODE = 0xb377;
    /** Multihash: skein1024-184, status = draft, code = 0xb377, uvarint = [0xf7, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_184 = Multihash.of("skein1024-184", SKEIN1024_184_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_192_CODE = 0xb378;
    /** Multihash: skein1024-192, status = draft, code = 0xb378, uvarint = [0xf8, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_192 = Multihash.of("skein1024-192", SKEIN1024_192_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_200_CODE = 0xb379;
    /** Multihash: skein1024-200, status = draft, code = 0xb379, uvarint = [0xf9, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_200 = Multihash.of("skein1024-200", SKEIN1024_200_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_208_CODE = 0xb37a;
    /** Multihash: skein1024-208, status = draft, code = 0xb37a, uvarint = [0xfa, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_208 = Multihash.of("skein1024-208", SKEIN1024_208_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_216_CODE = 0xb37b;
    /** Multihash: skein1024-216, status = draft, code = 0xb37b, uvarint = [0xfb, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_216 = Multihash.of("skein1024-216", SKEIN1024_216_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_224_CODE = 0xb37c;
    /** Multihash: skein1024-224, status = draft, code = 0xb37c, uvarint = [0xfc, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_224 = Multihash.of("skein1024-224", SKEIN1024_224_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_232_CODE = 0xb37d;
    /** Multihash: skein1024-232, status = draft, code = 0xb37d, uvarint = [0xfd, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_232 = Multihash.of("skein1024-232", SKEIN1024_232_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_24_CODE = 0xb363;
    /** Multihash: skein1024-24, status = draft, code = 0xb363, uvarint = [0xe3, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_24 = Multihash.of("skein1024-24", SKEIN1024_24_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_240_CODE = 0xb37e;
    /** Multihash: skein1024-240, status = draft, code = 0xb37e, uvarint = [0xfe, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_240 = Multihash.of("skein1024-240", SKEIN1024_240_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_248_CODE = 0xb37f;
    /** Multihash: skein1024-248, status = draft, code = 0xb37f, uvarint = [0xff, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_248 = Multihash.of("skein1024-248", SKEIN1024_248_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_256_CODE = 0xb380;
    /** Multihash: skein1024-256, status = draft, code = 0xb380, uvarint = [0x80, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_256 = Multihash.of("skein1024-256", SKEIN1024_256_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_264_CODE = 0xb381;
    /** Multihash: skein1024-264, status = draft, code = 0xb381, uvarint = [0x81, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_264 = Multihash.of("skein1024-264", SKEIN1024_264_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_272_CODE = 0xb382;
    /** Multihash: skein1024-272, status = draft, code = 0xb382, uvarint = [0x82, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_272 = Multihash.of("skein1024-272", SKEIN1024_272_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_280_CODE = 0xb383;
    /** Multihash: skein1024-280, status = draft, code = 0xb383, uvarint = [0x83, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_280 = Multihash.of("skein1024-280", SKEIN1024_280_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_288_CODE = 0xb384;
    /** Multihash: skein1024-288, status = draft, code = 0xb384, uvarint = [0x84, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_288 = Multihash.of("skein1024-288", SKEIN1024_288_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_296_CODE = 0xb385;
    /** Multihash: skein1024-296, status = draft, code = 0xb385, uvarint = [0x85, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_296 = Multihash.of("skein1024-296", SKEIN1024_296_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_304_CODE = 0xb386;
    /** Multihash: skein1024-304, status = draft, code = 0xb386, uvarint = [0x86, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_304 = Multihash.of("skein1024-304", SKEIN1024_304_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_312_CODE = 0xb387;
    /** Multihash: skein1024-312, status = draft, code = 0xb387, uvarint = [0x87, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_312 = Multihash.of("skein1024-312", SKEIN1024_312_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_32_CODE = 0xb364;
    /** Multihash: skein1024-32, status = draft, code = 0xb364, uvarint = [0xe4, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_32 = Multihash.of("skein1024-32", SKEIN1024_32_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_320_CODE = 0xb388;
    /** Multihash: skein1024-320, status = draft, code = 0xb388, uvarint = [0x88, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_320 = Multihash.of("skein1024-320", SKEIN1024_320_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_328_CODE = 0xb389;
    /** Multihash: skein1024-328, status = draft, code = 0xb389, uvarint = [0x89, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_328 = Multihash.of("skein1024-328", SKEIN1024_328_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_336_CODE = 0xb38a;
    /** Multihash: skein1024-336, status = draft, code = 0xb38a, uvarint = [0x8a, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_336 = Multihash.of("skein1024-336", SKEIN1024_336_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_344_CODE = 0xb38b;
    /** Multihash: skein1024-344, status = draft, code = 0xb38b, uvarint = [0x8b, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_344 = Multihash.of("skein1024-344", SKEIN1024_344_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_352_CODE = 0xb38c;
    /** Multihash: skein1024-352, status = draft, code = 0xb38c, uvarint = [0x8c, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_352 = Multihash.of("skein1024-352", SKEIN1024_352_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_360_CODE = 0xb38d;
    /** Multihash: skein1024-360, status = draft, code = 0xb38d, uvarint = [0x8d, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_360 = Multihash.of("skein1024-360", SKEIN1024_360_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_368_CODE = 0xb38e;
    /** Multihash: skein1024-368, status = draft, code = 0xb38e, uvarint = [0x8e, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_368 = Multihash.of("skein1024-368", SKEIN1024_368_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_376_CODE = 0xb38f;
    /** Multihash: skein1024-376, status = draft, code = 0xb38f, uvarint = [0x8f, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_376 = Multihash.of("skein1024-376", SKEIN1024_376_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_384_CODE = 0xb390;
    /** Multihash: skein1024-384, status = draft, code = 0xb390, uvarint = [0x90, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_384 = Multihash.of("skein1024-384", SKEIN1024_384_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_392_CODE = 0xb391;
    /** Multihash: skein1024-392, status = draft, code = 0xb391, uvarint = [0x91, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_392 = Multihash.of("skein1024-392", SKEIN1024_392_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_40_CODE = 0xb365;
    /** Multihash: skein1024-40, status = draft, code = 0xb365, uvarint = [0xe5, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_40 = Multihash.of("skein1024-40", SKEIN1024_40_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_400_CODE = 0xb392;
    /** Multihash: skein1024-400, status = draft, code = 0xb392, uvarint = [0x92, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_400 = Multihash.of("skein1024-400", SKEIN1024_400_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_408_CODE = 0xb393;
    /** Multihash: skein1024-408, status = draft, code = 0xb393, uvarint = [0x93, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_408 = Multihash.of("skein1024-408", SKEIN1024_408_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_416_CODE = 0xb394;
    /** Multihash: skein1024-416, status = draft, code = 0xb394, uvarint = [0x94, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_416 = Multihash.of("skein1024-416", SKEIN1024_416_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_424_CODE = 0xb395;
    /** Multihash: skein1024-424, status = draft, code = 0xb395, uvarint = [0x95, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_424 = Multihash.of("skein1024-424", SKEIN1024_424_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_432_CODE = 0xb396;
    /** Multihash: skein1024-432, status = draft, code = 0xb396, uvarint = [0x96, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_432 = Multihash.of("skein1024-432", SKEIN1024_432_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_440_CODE = 0xb397;
    /** Multihash: skein1024-440, status = draft, code = 0xb397, uvarint = [0x97, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_440 = Multihash.of("skein1024-440", SKEIN1024_440_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_448_CODE = 0xb398;
    /** Multihash: skein1024-448, status = draft, code = 0xb398, uvarint = [0x98, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_448 = Multihash.of("skein1024-448", SKEIN1024_448_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_456_CODE = 0xb399;
    /** Multihash: skein1024-456, status = draft, code = 0xb399, uvarint = [0x99, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_456 = Multihash.of("skein1024-456", SKEIN1024_456_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_464_CODE = 0xb39a;
    /** Multihash: skein1024-464, status = draft, code = 0xb39a, uvarint = [0x9a, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_464 = Multihash.of("skein1024-464", SKEIN1024_464_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_472_CODE = 0xb39b;
    /** Multihash: skein1024-472, status = draft, code = 0xb39b, uvarint = [0x9b, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_472 = Multihash.of("skein1024-472", SKEIN1024_472_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_48_CODE = 0xb366;
    /** Multihash: skein1024-48, status = draft, code = 0xb366, uvarint = [0xe6, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_48 = Multihash.of("skein1024-48", SKEIN1024_48_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_480_CODE = 0xb39c;
    /** Multihash: skein1024-480, status = draft, code = 0xb39c, uvarint = [0x9c, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_480 = Multihash.of("skein1024-480", SKEIN1024_480_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_488_CODE = 0xb39d;
    /** Multihash: skein1024-488, status = draft, code = 0xb39d, uvarint = [0x9d, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_488 = Multihash.of("skein1024-488", SKEIN1024_488_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_496_CODE = 0xb39e;
    /** Multihash: skein1024-496, status = draft, code = 0xb39e, uvarint = [0x9e, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_496 = Multihash.of("skein1024-496", SKEIN1024_496_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_504_CODE = 0xb39f;
    /** Multihash: skein1024-504, status = draft, code = 0xb39f, uvarint = [0x9f, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_504 = Multihash.of("skein1024-504", SKEIN1024_504_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_512_CODE = 0xb3a0;
    /** Multihash: skein1024-512, status = draft, code = 0xb3a0, uvarint = [0xa0, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_512 = Multihash.of("skein1024-512", SKEIN1024_512_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_520_CODE = 0xb3a1;
    /** Multihash: skein1024-520, status = draft, code = 0xb3a1, uvarint = [0xa1, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_520 = Multihash.of("skein1024-520", SKEIN1024_520_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_528_CODE = 0xb3a2;
    /** Multihash: skein1024-528, status = draft, code = 0xb3a2, uvarint = [0xa2, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_528 = Multihash.of("skein1024-528", SKEIN1024_528_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_536_CODE = 0xb3a3;
    /** Multihash: skein1024-536, status = draft, code = 0xb3a3, uvarint = [0xa3, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_536 = Multihash.of("skein1024-536", SKEIN1024_536_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_544_CODE = 0xb3a4;
    /** Multihash: skein1024-544, status = draft, code = 0xb3a4, uvarint = [0xa4, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_544 = Multihash.of("skein1024-544", SKEIN1024_544_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_552_CODE = 0xb3a5;
    /** Multihash: skein1024-552, status = draft, code = 0xb3a5, uvarint = [0xa5, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_552 = Multihash.of("skein1024-552", SKEIN1024_552_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_56_CODE = 0xb367;
    /** Multihash: skein1024-56, status = draft, code = 0xb367, uvarint = [0xe7, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_56 = Multihash.of("skein1024-56", SKEIN1024_56_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_560_CODE = 0xb3a6;
    /** Multihash: skein1024-560, status = draft, code = 0xb3a6, uvarint = [0xa6, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_560 = Multihash.of("skein1024-560", SKEIN1024_560_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_568_CODE = 0xb3a7;
    /** Multihash: skein1024-568, status = draft, code = 0xb3a7, uvarint = [0xa7, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_568 = Multihash.of("skein1024-568", SKEIN1024_568_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_576_CODE = 0xb3a8;
    /** Multihash: skein1024-576, status = draft, code = 0xb3a8, uvarint = [0xa8, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_576 = Multihash.of("skein1024-576", SKEIN1024_576_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_584_CODE = 0xb3a9;
    /** Multihash: skein1024-584, status = draft, code = 0xb3a9, uvarint = [0xa9, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_584 = Multihash.of("skein1024-584", SKEIN1024_584_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_592_CODE = 0xb3aa;
    /** Multihash: skein1024-592, status = draft, code = 0xb3aa, uvarint = [0xaa, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_592 = Multihash.of("skein1024-592", SKEIN1024_592_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_600_CODE = 0xb3ab;
    /** Multihash: skein1024-600, status = draft, code = 0xb3ab, uvarint = [0xab, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_600 = Multihash.of("skein1024-600", SKEIN1024_600_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_608_CODE = 0xb3ac;
    /** Multihash: skein1024-608, status = draft, code = 0xb3ac, uvarint = [0xac, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_608 = Multihash.of("skein1024-608", SKEIN1024_608_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_616_CODE = 0xb3ad;
    /** Multihash: skein1024-616, status = draft, code = 0xb3ad, uvarint = [0xad, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_616 = Multihash.of("skein1024-616", SKEIN1024_616_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_624_CODE = 0xb3ae;
    /** Multihash: skein1024-624, status = draft, code = 0xb3ae, uvarint = [0xae, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_624 = Multihash.of("skein1024-624", SKEIN1024_624_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_632_CODE = 0xb3af;
    /** Multihash: skein1024-632, status = draft, code = 0xb3af, uvarint = [0xaf, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_632 = Multihash.of("skein1024-632", SKEIN1024_632_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_64_CODE = 0xb368;
    /** Multihash: skein1024-64, status = draft, code = 0xb368, uvarint = [0xe8, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_64 = Multihash.of("skein1024-64", SKEIN1024_64_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_640_CODE = 0xb3b0;
    /** Multihash: skein1024-640, status = draft, code = 0xb3b0, uvarint = [0xb0, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_640 = Multihash.of("skein1024-640", SKEIN1024_640_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_648_CODE = 0xb3b1;
    /** Multihash: skein1024-648, status = draft, code = 0xb3b1, uvarint = [0xb1, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_648 = Multihash.of("skein1024-648", SKEIN1024_648_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_656_CODE = 0xb3b2;
    /** Multihash: skein1024-656, status = draft, code = 0xb3b2, uvarint = [0xb2, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_656 = Multihash.of("skein1024-656", SKEIN1024_656_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_664_CODE = 0xb3b3;
    /** Multihash: skein1024-664, status = draft, code = 0xb3b3, uvarint = [0xb3, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_664 = Multihash.of("skein1024-664", SKEIN1024_664_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_672_CODE = 0xb3b4;
    /** Multihash: skein1024-672, status = draft, code = 0xb3b4, uvarint = [0xb4, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_672 = Multihash.of("skein1024-672", SKEIN1024_672_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_680_CODE = 0xb3b5;
    /** Multihash: skein1024-680, status = draft, code = 0xb3b5, uvarint = [0xb5, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_680 = Multihash.of("skein1024-680", SKEIN1024_680_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_688_CODE = 0xb3b6;
    /** Multihash: skein1024-688, status = draft, code = 0xb3b6, uvarint = [0xb6, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_688 = Multihash.of("skein1024-688", SKEIN1024_688_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_696_CODE = 0xb3b7;
    /** Multihash: skein1024-696, status = draft, code = 0xb3b7, uvarint = [0xb7, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_696 = Multihash.of("skein1024-696", SKEIN1024_696_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_704_CODE = 0xb3b8;
    /** Multihash: skein1024-704, status = draft, code = 0xb3b8, uvarint = [0xb8, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_704 = Multihash.of("skein1024-704", SKEIN1024_704_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_712_CODE = 0xb3b9;
    /** Multihash: skein1024-712, status = draft, code = 0xb3b9, uvarint = [0xb9, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_712 = Multihash.of("skein1024-712", SKEIN1024_712_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_72_CODE = 0xb369;
    /** Multihash: skein1024-72, status = draft, code = 0xb369, uvarint = [0xe9, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_72 = Multihash.of("skein1024-72", SKEIN1024_72_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_720_CODE = 0xb3ba;
    /** Multihash: skein1024-720, status = draft, code = 0xb3ba, uvarint = [0xba, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_720 = Multihash.of("skein1024-720", SKEIN1024_720_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_728_CODE = 0xb3bb;
    /** Multihash: skein1024-728, status = draft, code = 0xb3bb, uvarint = [0xbb, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_728 = Multihash.of("skein1024-728", SKEIN1024_728_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_736_CODE = 0xb3bc;
    /** Multihash: skein1024-736, status = draft, code = 0xb3bc, uvarint = [0xbc, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_736 = Multihash.of("skein1024-736", SKEIN1024_736_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_744_CODE = 0xb3bd;
    /** Multihash: skein1024-744, status = draft, code = 0xb3bd, uvarint = [0xbd, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_744 = Multihash.of("skein1024-744", SKEIN1024_744_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_752_CODE = 0xb3be;
    /** Multihash: skein1024-752, status = draft, code = 0xb3be, uvarint = [0xbe, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_752 = Multihash.of("skein1024-752", SKEIN1024_752_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_760_CODE = 0xb3bf;
    /** Multihash: skein1024-760, status = draft, code = 0xb3bf, uvarint = [0xbf, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_760 = Multihash.of("skein1024-760", SKEIN1024_760_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_768_CODE = 0xb3c0;
    /** Multihash: skein1024-768, status = draft, code = 0xb3c0, uvarint = [0xc0, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_768 = Multihash.of("skein1024-768", SKEIN1024_768_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_776_CODE = 0xb3c1;
    /** Multihash: skein1024-776, status = draft, code = 0xb3c1, uvarint = [0xc1, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_776 = Multihash.of("skein1024-776", SKEIN1024_776_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_784_CODE = 0xb3c2;
    /** Multihash: skein1024-784, status = draft, code = 0xb3c2, uvarint = [0xc2, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_784 = Multihash.of("skein1024-784", SKEIN1024_784_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_792_CODE = 0xb3c3;
    /** Multihash: skein1024-792, status = draft, code = 0xb3c3, uvarint = [0xc3, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_792 = Multihash.of("skein1024-792", SKEIN1024_792_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_8_CODE = 0xb361;
    /** Multihash: skein1024-8, Skein1024 consists of 128 output lengths that give different hashes, status = draft, code = 0xb361, uvarint = [0xe1, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_8 = Multihash.of("skein1024-8", SKEIN1024_8_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_80_CODE = 0xb36a;
    /** Multihash: skein1024-80, status = draft, code = 0xb36a, uvarint = [0xea, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_80 = Multihash.of("skein1024-80", SKEIN1024_80_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_800_CODE = 0xb3c4;
    /** Multihash: skein1024-800, status = draft, code = 0xb3c4, uvarint = [0xc4, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_800 = Multihash.of("skein1024-800", SKEIN1024_800_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_808_CODE = 0xb3c5;
    /** Multihash: skein1024-808, status = draft, code = 0xb3c5, uvarint = [0xc5, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_808 = Multihash.of("skein1024-808", SKEIN1024_808_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_816_CODE = 0xb3c6;
    /** Multihash: skein1024-816, status = draft, code = 0xb3c6, uvarint = [0xc6, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_816 = Multihash.of("skein1024-816", SKEIN1024_816_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_824_CODE = 0xb3c7;
    /** Multihash: skein1024-824, status = draft, code = 0xb3c7, uvarint = [0xc7, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_824 = Multihash.of("skein1024-824", SKEIN1024_824_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_832_CODE = 0xb3c8;
    /** Multihash: skein1024-832, status = draft, code = 0xb3c8, uvarint = [0xc8, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_832 = Multihash.of("skein1024-832", SKEIN1024_832_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_840_CODE = 0xb3c9;
    /** Multihash: skein1024-840, status = draft, code = 0xb3c9, uvarint = [0xc9, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_840 = Multihash.of("skein1024-840", SKEIN1024_840_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_848_CODE = 0xb3ca;
    /** Multihash: skein1024-848, status = draft, code = 0xb3ca, uvarint = [0xca, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_848 = Multihash.of("skein1024-848", SKEIN1024_848_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_856_CODE = 0xb3cb;
    /** Multihash: skein1024-856, status = draft, code = 0xb3cb, uvarint = [0xcb, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_856 = Multihash.of("skein1024-856", SKEIN1024_856_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_864_CODE = 0xb3cc;
    /** Multihash: skein1024-864, status = draft, code = 0xb3cc, uvarint = [0xcc, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_864 = Multihash.of("skein1024-864", SKEIN1024_864_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_872_CODE = 0xb3cd;
    /** Multihash: skein1024-872, status = draft, code = 0xb3cd, uvarint = [0xcd, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_872 = Multihash.of("skein1024-872", SKEIN1024_872_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_88_CODE = 0xb36b;
    /** Multihash: skein1024-88, status = draft, code = 0xb36b, uvarint = [0xeb, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_88 = Multihash.of("skein1024-88", SKEIN1024_88_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_880_CODE = 0xb3ce;
    /** Multihash: skein1024-880, status = draft, code = 0xb3ce, uvarint = [0xce, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_880 = Multihash.of("skein1024-880", SKEIN1024_880_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_888_CODE = 0xb3cf;
    /** Multihash: skein1024-888, status = draft, code = 0xb3cf, uvarint = [0xcf, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_888 = Multihash.of("skein1024-888", SKEIN1024_888_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_896_CODE = 0xb3d0;
    /** Multihash: skein1024-896, status = draft, code = 0xb3d0, uvarint = [0xd0, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_896 = Multihash.of("skein1024-896", SKEIN1024_896_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_904_CODE = 0xb3d1;
    /** Multihash: skein1024-904, status = draft, code = 0xb3d1, uvarint = [0xd1, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_904 = Multihash.of("skein1024-904", SKEIN1024_904_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_912_CODE = 0xb3d2;
    /** Multihash: skein1024-912, status = draft, code = 0xb3d2, uvarint = [0xd2, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_912 = Multihash.of("skein1024-912", SKEIN1024_912_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_920_CODE = 0xb3d3;
    /** Multihash: skein1024-920, status = draft, code = 0xb3d3, uvarint = [0xd3, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_920 = Multihash.of("skein1024-920", SKEIN1024_920_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_928_CODE = 0xb3d4;
    /** Multihash: skein1024-928, status = draft, code = 0xb3d4, uvarint = [0xd4, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_928 = Multihash.of("skein1024-928", SKEIN1024_928_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_936_CODE = 0xb3d5;
    /** Multihash: skein1024-936, status = draft, code = 0xb3d5, uvarint = [0xd5, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_936 = Multihash.of("skein1024-936", SKEIN1024_936_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_944_CODE = 0xb3d6;
    /** Multihash: skein1024-944, status = draft, code = 0xb3d6, uvarint = [0xd6, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_944 = Multihash.of("skein1024-944", SKEIN1024_944_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_952_CODE = 0xb3d7;
    /** Multihash: skein1024-952, status = draft, code = 0xb3d7, uvarint = [0xd7, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_952 = Multihash.of("skein1024-952", SKEIN1024_952_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_96_CODE = 0xb36c;
    /** Multihash: skein1024-96, status = draft, code = 0xb36c, uvarint = [0xec, 0xe6, 0x02] */
    public static final Multihash SKEIN1024_96 = Multihash.of("skein1024-96", SKEIN1024_96_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_960_CODE = 0xb3d8;
    /** Multihash: skein1024-960, status = draft, code = 0xb3d8, uvarint = [0xd8, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_960 = Multihash.of("skein1024-960", SKEIN1024_960_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_968_CODE = 0xb3d9;
    /** Multihash: skein1024-968, status = draft, code = 0xb3d9, uvarint = [0xd9, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_968 = Multihash.of("skein1024-968", SKEIN1024_968_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_976_CODE = 0xb3da;
    /** Multihash: skein1024-976, status = draft, code = 0xb3da, uvarint = [0xda, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_976 = Multihash.of("skein1024-976", SKEIN1024_976_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_984_CODE = 0xb3db;
    /** Multihash: skein1024-984, status = draft, code = 0xb3db, uvarint = [0xdb, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_984 = Multihash.of("skein1024-984", SKEIN1024_984_CODE, Multicodec.Status.Draft);

    public static final long SKEIN1024_992_CODE = 0xb3dc;
    /** Multihash: skein1024-992, status = draft, code = 0xb3dc, uvarint = [0xdc, 0xe7, 0x02] */
    public static final Multihash SKEIN1024_992 = Multihash.of("skein1024-992", SKEIN1024_992_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_104_CODE = 0xb30d;
    /** Multihash: skein256-104, status = draft, code = 0xb30d, uvarint = [0x8d, 0xe6, 0x02] */
    public static final Multihash SKEIN256_104 = Multihash.of("skein256-104", SKEIN256_104_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_112_CODE = 0xb30e;
    /** Multihash: skein256-112, status = draft, code = 0xb30e, uvarint = [0x8e, 0xe6, 0x02] */
    public static final Multihash SKEIN256_112 = Multihash.of("skein256-112", SKEIN256_112_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_120_CODE = 0xb30f;
    /** Multihash: skein256-120, status = draft, code = 0xb30f, uvarint = [0x8f, 0xe6, 0x02] */
    public static final Multihash SKEIN256_120 = Multihash.of("skein256-120", SKEIN256_120_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_128_CODE = 0xb310;
    /** Multihash: skein256-128, status = draft, code = 0xb310, uvarint = [0x90, 0xe6, 0x02] */
    public static final Multihash SKEIN256_128 = Multihash.of("skein256-128", SKEIN256_128_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_136_CODE = 0xb311;
    /** Multihash: skein256-136, status = draft, code = 0xb311, uvarint = [0x91, 0xe6, 0x02] */
    public static final Multihash SKEIN256_136 = Multihash.of("skein256-136", SKEIN256_136_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_144_CODE = 0xb312;
    /** Multihash: skein256-144, status = draft, code = 0xb312, uvarint = [0x92, 0xe6, 0x02] */
    public static final Multihash SKEIN256_144 = Multihash.of("skein256-144", SKEIN256_144_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_152_CODE = 0xb313;
    /** Multihash: skein256-152, status = draft, code = 0xb313, uvarint = [0x93, 0xe6, 0x02] */
    public static final Multihash SKEIN256_152 = Multihash.of("skein256-152", SKEIN256_152_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_16_CODE = 0xb302;
    /** Multihash: skein256-16, status = draft, code = 0xb302, uvarint = [0x82, 0xe6, 0x02] */
    public static final Multihash SKEIN256_16 = Multihash.of("skein256-16", SKEIN256_16_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_160_CODE = 0xb314;
    /** Multihash: skein256-160, status = draft, code = 0xb314, uvarint = [0x94, 0xe6, 0x02] */
    public static final Multihash SKEIN256_160 = Multihash.of("skein256-160", SKEIN256_160_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_168_CODE = 0xb315;
    /** Multihash: skein256-168, status = draft, code = 0xb315, uvarint = [0x95, 0xe6, 0x02] */
    public static final Multihash SKEIN256_168 = Multihash.of("skein256-168", SKEIN256_168_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_176_CODE = 0xb316;
    /** Multihash: skein256-176, status = draft, code = 0xb316, uvarint = [0x96, 0xe6, 0x02] */
    public static final Multihash SKEIN256_176 = Multihash.of("skein256-176", SKEIN256_176_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_184_CODE = 0xb317;
    /** Multihash: skein256-184, status = draft, code = 0xb317, uvarint = [0x97, 0xe6, 0x02] */
    public static final Multihash SKEIN256_184 = Multihash.of("skein256-184", SKEIN256_184_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_192_CODE = 0xb318;
    /** Multihash: skein256-192, status = draft, code = 0xb318, uvarint = [0x98, 0xe6, 0x02] */
    public static final Multihash SKEIN256_192 = Multihash.of("skein256-192", SKEIN256_192_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_200_CODE = 0xb319;
    /** Multihash: skein256-200, status = draft, code = 0xb319, uvarint = [0x99, 0xe6, 0x02] */
    public static final Multihash SKEIN256_200 = Multihash.of("skein256-200", SKEIN256_200_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_208_CODE = 0xb31a;
    /** Multihash: skein256-208, status = draft, code = 0xb31a, uvarint = [0x9a, 0xe6, 0x02] */
    public static final Multihash SKEIN256_208 = Multihash.of("skein256-208", SKEIN256_208_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_216_CODE = 0xb31b;
    /** Multihash: skein256-216, status = draft, code = 0xb31b, uvarint = [0x9b, 0xe6, 0x02] */
    public static final Multihash SKEIN256_216 = Multihash.of("skein256-216", SKEIN256_216_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_224_CODE = 0xb31c;
    /** Multihash: skein256-224, status = draft, code = 0xb31c, uvarint = [0x9c, 0xe6, 0x02] */
    public static final Multihash SKEIN256_224 = Multihash.of("skein256-224", SKEIN256_224_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_232_CODE = 0xb31d;
    /** Multihash: skein256-232, status = draft, code = 0xb31d, uvarint = [0x9d, 0xe6, 0x02] */
    public static final Multihash SKEIN256_232 = Multihash.of("skein256-232", SKEIN256_232_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_24_CODE = 0xb303;
    /** Multihash: skein256-24, status = draft, code = 0xb303, uvarint = [0x83, 0xe6, 0x02] */
    public static final Multihash SKEIN256_24 = Multihash.of("skein256-24", SKEIN256_24_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_240_CODE = 0xb31e;
    /** Multihash: skein256-240, status = draft, code = 0xb31e, uvarint = [0x9e, 0xe6, 0x02] */
    public static final Multihash SKEIN256_240 = Multihash.of("skein256-240", SKEIN256_240_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_248_CODE = 0xb31f;
    /** Multihash: skein256-248, status = draft, code = 0xb31f, uvarint = [0x9f, 0xe6, 0x02] */
    public static final Multihash SKEIN256_248 = Multihash.of("skein256-248", SKEIN256_248_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_256_CODE = 0xb320;
    /** Multihash: skein256-256, status = draft, code = 0xb320, uvarint = [0xa0, 0xe6, 0x02] */
    public static final Multihash SKEIN256_256 = Multihash.of("skein256-256", SKEIN256_256_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_32_CODE = 0xb304;
    /** Multihash: skein256-32, status = draft, code = 0xb304, uvarint = [0x84, 0xe6, 0x02] */
    public static final Multihash SKEIN256_32 = Multihash.of("skein256-32", SKEIN256_32_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_40_CODE = 0xb305;
    /** Multihash: skein256-40, status = draft, code = 0xb305, uvarint = [0x85, 0xe6, 0x02] */
    public static final Multihash SKEIN256_40 = Multihash.of("skein256-40", SKEIN256_40_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_48_CODE = 0xb306;
    /** Multihash: skein256-48, status = draft, code = 0xb306, uvarint = [0x86, 0xe6, 0x02] */
    public static final Multihash SKEIN256_48 = Multihash.of("skein256-48", SKEIN256_48_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_56_CODE = 0xb307;
    /** Multihash: skein256-56, status = draft, code = 0xb307, uvarint = [0x87, 0xe6, 0x02] */
    public static final Multihash SKEIN256_56 = Multihash.of("skein256-56", SKEIN256_56_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_64_CODE = 0xb308;
    /** Multihash: skein256-64, status = draft, code = 0xb308, uvarint = [0x88, 0xe6, 0x02] */
    public static final Multihash SKEIN256_64 = Multihash.of("skein256-64", SKEIN256_64_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_72_CODE = 0xb309;
    /** Multihash: skein256-72, status = draft, code = 0xb309, uvarint = [0x89, 0xe6, 0x02] */
    public static final Multihash SKEIN256_72 = Multihash.of("skein256-72", SKEIN256_72_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_8_CODE = 0xb301;
    /** Multihash: skein256-8, Skein256 consists of 32 output lengths that give different hashes, status = draft, code = 0xb301, uvarint = [0x81, 0xe6, 0x02] */
    public static final Multihash SKEIN256_8 = Multihash.of("skein256-8", SKEIN256_8_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_80_CODE = 0xb30a;
    /** Multihash: skein256-80, status = draft, code = 0xb30a, uvarint = [0x8a, 0xe6, 0x02] */
    public static final Multihash SKEIN256_80 = Multihash.of("skein256-80", SKEIN256_80_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_88_CODE = 0xb30b;
    /** Multihash: skein256-88, status = draft, code = 0xb30b, uvarint = [0x8b, 0xe6, 0x02] */
    public static final Multihash SKEIN256_88 = Multihash.of("skein256-88", SKEIN256_88_CODE, Multicodec.Status.Draft);

    public static final long SKEIN256_96_CODE = 0xb30c;
    /** Multihash: skein256-96, status = draft, code = 0xb30c, uvarint = [0x8c, 0xe6, 0x02] */
    public static final Multihash SKEIN256_96 = Multihash.of("skein256-96", SKEIN256_96_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_104_CODE = 0xb32d;
    /** Multihash: skein512-104, status = draft, code = 0xb32d, uvarint = [0xad, 0xe6, 0x02] */
    public static final Multihash SKEIN512_104 = Multihash.of("skein512-104", SKEIN512_104_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_112_CODE = 0xb32e;
    /** Multihash: skein512-112, status = draft, code = 0xb32e, uvarint = [0xae, 0xe6, 0x02] */
    public static final Multihash SKEIN512_112 = Multihash.of("skein512-112", SKEIN512_112_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_120_CODE = 0xb32f;
    /** Multihash: skein512-120, status = draft, code = 0xb32f, uvarint = [0xaf, 0xe6, 0x02] */
    public static final Multihash SKEIN512_120 = Multihash.of("skein512-120", SKEIN512_120_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_128_CODE = 0xb330;
    /** Multihash: skein512-128, status = draft, code = 0xb330, uvarint = [0xb0, 0xe6, 0x02] */
    public static final Multihash SKEIN512_128 = Multihash.of("skein512-128", SKEIN512_128_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_136_CODE = 0xb331;
    /** Multihash: skein512-136, status = draft, code = 0xb331, uvarint = [0xb1, 0xe6, 0x02] */
    public static final Multihash SKEIN512_136 = Multihash.of("skein512-136", SKEIN512_136_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_144_CODE = 0xb332;
    /** Multihash: skein512-144, status = draft, code = 0xb332, uvarint = [0xb2, 0xe6, 0x02] */
    public static final Multihash SKEIN512_144 = Multihash.of("skein512-144", SKEIN512_144_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_152_CODE = 0xb333;
    /** Multihash: skein512-152, status = draft, code = 0xb333, uvarint = [0xb3, 0xe6, 0x02] */
    public static final Multihash SKEIN512_152 = Multihash.of("skein512-152", SKEIN512_152_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_16_CODE = 0xb322;
    /** Multihash: skein512-16, status = draft, code = 0xb322, uvarint = [0xa2, 0xe6, 0x02] */
    public static final Multihash SKEIN512_16 = Multihash.of("skein512-16", SKEIN512_16_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_160_CODE = 0xb334;
    /** Multihash: skein512-160, status = draft, code = 0xb334, uvarint = [0xb4, 0xe6, 0x02] */
    public static final Multihash SKEIN512_160 = Multihash.of("skein512-160", SKEIN512_160_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_168_CODE = 0xb335;
    /** Multihash: skein512-168, status = draft, code = 0xb335, uvarint = [0xb5, 0xe6, 0x02] */
    public static final Multihash SKEIN512_168 = Multihash.of("skein512-168", SKEIN512_168_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_176_CODE = 0xb336;
    /** Multihash: skein512-176, status = draft, code = 0xb336, uvarint = [0xb6, 0xe6, 0x02] */
    public static final Multihash SKEIN512_176 = Multihash.of("skein512-176", SKEIN512_176_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_184_CODE = 0xb337;
    /** Multihash: skein512-184, status = draft, code = 0xb337, uvarint = [0xb7, 0xe6, 0x02] */
    public static final Multihash SKEIN512_184 = Multihash.of("skein512-184", SKEIN512_184_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_192_CODE = 0xb338;
    /** Multihash: skein512-192, status = draft, code = 0xb338, uvarint = [0xb8, 0xe6, 0x02] */
    public static final Multihash SKEIN512_192 = Multihash.of("skein512-192", SKEIN512_192_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_200_CODE = 0xb339;
    /** Multihash: skein512-200, status = draft, code = 0xb339, uvarint = [0xb9, 0xe6, 0x02] */
    public static final Multihash SKEIN512_200 = Multihash.of("skein512-200", SKEIN512_200_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_208_CODE = 0xb33a;
    /** Multihash: skein512-208, status = draft, code = 0xb33a, uvarint = [0xba, 0xe6, 0x02] */
    public static final Multihash SKEIN512_208 = Multihash.of("skein512-208", SKEIN512_208_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_216_CODE = 0xb33b;
    /** Multihash: skein512-216, status = draft, code = 0xb33b, uvarint = [0xbb, 0xe6, 0x02] */
    public static final Multihash SKEIN512_216 = Multihash.of("skein512-216", SKEIN512_216_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_224_CODE = 0xb33c;
    /** Multihash: skein512-224, status = draft, code = 0xb33c, uvarint = [0xbc, 0xe6, 0x02] */
    public static final Multihash SKEIN512_224 = Multihash.of("skein512-224", SKEIN512_224_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_232_CODE = 0xb33d;
    /** Multihash: skein512-232, status = draft, code = 0xb33d, uvarint = [0xbd, 0xe6, 0x02] */
    public static final Multihash SKEIN512_232 = Multihash.of("skein512-232", SKEIN512_232_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_24_CODE = 0xb323;
    /** Multihash: skein512-24, status = draft, code = 0xb323, uvarint = [0xa3, 0xe6, 0x02] */
    public static final Multihash SKEIN512_24 = Multihash.of("skein512-24", SKEIN512_24_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_240_CODE = 0xb33e;
    /** Multihash: skein512-240, status = draft, code = 0xb33e, uvarint = [0xbe, 0xe6, 0x02] */
    public static final Multihash SKEIN512_240 = Multihash.of("skein512-240", SKEIN512_240_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_248_CODE = 0xb33f;
    /** Multihash: skein512-248, status = draft, code = 0xb33f, uvarint = [0xbf, 0xe6, 0x02] */
    public static final Multihash SKEIN512_248 = Multihash.of("skein512-248", SKEIN512_248_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_256_CODE = 0xb340;
    /** Multihash: skein512-256, status = draft, code = 0xb340, uvarint = [0xc0, 0xe6, 0x02] */
    public static final Multihash SKEIN512_256 = Multihash.of("skein512-256", SKEIN512_256_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_264_CODE = 0xb341;
    /** Multihash: skein512-264, status = draft, code = 0xb341, uvarint = [0xc1, 0xe6, 0x02] */
    public static final Multihash SKEIN512_264 = Multihash.of("skein512-264", SKEIN512_264_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_272_CODE = 0xb342;
    /** Multihash: skein512-272, status = draft, code = 0xb342, uvarint = [0xc2, 0xe6, 0x02] */
    public static final Multihash SKEIN512_272 = Multihash.of("skein512-272", SKEIN512_272_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_280_CODE = 0xb343;
    /** Multihash: skein512-280, status = draft, code = 0xb343, uvarint = [0xc3, 0xe6, 0x02] */
    public static final Multihash SKEIN512_280 = Multihash.of("skein512-280", SKEIN512_280_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_288_CODE = 0xb344;
    /** Multihash: skein512-288, status = draft, code = 0xb344, uvarint = [0xc4, 0xe6, 0x02] */
    public static final Multihash SKEIN512_288 = Multihash.of("skein512-288", SKEIN512_288_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_296_CODE = 0xb345;
    /** Multihash: skein512-296, status = draft, code = 0xb345, uvarint = [0xc5, 0xe6, 0x02] */
    public static final Multihash SKEIN512_296 = Multihash.of("skein512-296", SKEIN512_296_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_304_CODE = 0xb346;
    /** Multihash: skein512-304, status = draft, code = 0xb346, uvarint = [0xc6, 0xe6, 0x02] */
    public static final Multihash SKEIN512_304 = Multihash.of("skein512-304", SKEIN512_304_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_312_CODE = 0xb347;
    /** Multihash: skein512-312, status = draft, code = 0xb347, uvarint = [0xc7, 0xe6, 0x02] */
    public static final Multihash SKEIN512_312 = Multihash.of("skein512-312", SKEIN512_312_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_32_CODE = 0xb324;
    /** Multihash: skein512-32, status = draft, code = 0xb324, uvarint = [0xa4, 0xe6, 0x02] */
    public static final Multihash SKEIN512_32 = Multihash.of("skein512-32", SKEIN512_32_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_320_CODE = 0xb348;
    /** Multihash: skein512-320, status = draft, code = 0xb348, uvarint = [0xc8, 0xe6, 0x02] */
    public static final Multihash SKEIN512_320 = Multihash.of("skein512-320", SKEIN512_320_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_328_CODE = 0xb349;
    /** Multihash: skein512-328, status = draft, code = 0xb349, uvarint = [0xc9, 0xe6, 0x02] */
    public static final Multihash SKEIN512_328 = Multihash.of("skein512-328", SKEIN512_328_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_336_CODE = 0xb34a;
    /** Multihash: skein512-336, status = draft, code = 0xb34a, uvarint = [0xca, 0xe6, 0x02] */
    public static final Multihash SKEIN512_336 = Multihash.of("skein512-336", SKEIN512_336_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_344_CODE = 0xb34b;
    /** Multihash: skein512-344, status = draft, code = 0xb34b, uvarint = [0xcb, 0xe6, 0x02] */
    public static final Multihash SKEIN512_344 = Multihash.of("skein512-344", SKEIN512_344_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_352_CODE = 0xb34c;
    /** Multihash: skein512-352, status = draft, code = 0xb34c, uvarint = [0xcc, 0xe6, 0x02] */
    public static final Multihash SKEIN512_352 = Multihash.of("skein512-352", SKEIN512_352_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_360_CODE = 0xb34d;
    /** Multihash: skein512-360, status = draft, code = 0xb34d, uvarint = [0xcd, 0xe6, 0x02] */
    public static final Multihash SKEIN512_360 = Multihash.of("skein512-360", SKEIN512_360_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_368_CODE = 0xb34e;
    /** Multihash: skein512-368, status = draft, code = 0xb34e, uvarint = [0xce, 0xe6, 0x02] */
    public static final Multihash SKEIN512_368 = Multihash.of("skein512-368", SKEIN512_368_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_376_CODE = 0xb34f;
    /** Multihash: skein512-376, status = draft, code = 0xb34f, uvarint = [0xcf, 0xe6, 0x02] */
    public static final Multihash SKEIN512_376 = Multihash.of("skein512-376", SKEIN512_376_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_384_CODE = 0xb350;
    /** Multihash: skein512-384, status = draft, code = 0xb350, uvarint = [0xd0, 0xe6, 0x02] */
    public static final Multihash SKEIN512_384 = Multihash.of("skein512-384", SKEIN512_384_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_392_CODE = 0xb351;
    /** Multihash: skein512-392, status = draft, code = 0xb351, uvarint = [0xd1, 0xe6, 0x02] */
    public static final Multihash SKEIN512_392 = Multihash.of("skein512-392", SKEIN512_392_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_40_CODE = 0xb325;
    /** Multihash: skein512-40, status = draft, code = 0xb325, uvarint = [0xa5, 0xe6, 0x02] */
    public static final Multihash SKEIN512_40 = Multihash.of("skein512-40", SKEIN512_40_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_400_CODE = 0xb352;
    /** Multihash: skein512-400, status = draft, code = 0xb352, uvarint = [0xd2, 0xe6, 0x02] */
    public static final Multihash SKEIN512_400 = Multihash.of("skein512-400", SKEIN512_400_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_408_CODE = 0xb353;
    /** Multihash: skein512-408, status = draft, code = 0xb353, uvarint = [0xd3, 0xe6, 0x02] */
    public static final Multihash SKEIN512_408 = Multihash.of("skein512-408", SKEIN512_408_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_416_CODE = 0xb354;
    /** Multihash: skein512-416, status = draft, code = 0xb354, uvarint = [0xd4, 0xe6, 0x02] */
    public static final Multihash SKEIN512_416 = Multihash.of("skein512-416", SKEIN512_416_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_424_CODE = 0xb355;
    /** Multihash: skein512-424, status = draft, code = 0xb355, uvarint = [0xd5, 0xe6, 0x02] */
    public static final Multihash SKEIN512_424 = Multihash.of("skein512-424", SKEIN512_424_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_432_CODE = 0xb356;
    /** Multihash: skein512-432, status = draft, code = 0xb356, uvarint = [0xd6, 0xe6, 0x02] */
    public static final Multihash SKEIN512_432 = Multihash.of("skein512-432", SKEIN512_432_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_440_CODE = 0xb357;
    /** Multihash: skein512-440, status = draft, code = 0xb357, uvarint = [0xd7, 0xe6, 0x02] */
    public static final Multihash SKEIN512_440 = Multihash.of("skein512-440", SKEIN512_440_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_448_CODE = 0xb358;
    /** Multihash: skein512-448, status = draft, code = 0xb358, uvarint = [0xd8, 0xe6, 0x02] */
    public static final Multihash SKEIN512_448 = Multihash.of("skein512-448", SKEIN512_448_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_456_CODE = 0xb359;
    /** Multihash: skein512-456, status = draft, code = 0xb359, uvarint = [0xd9, 0xe6, 0x02] */
    public static final Multihash SKEIN512_456 = Multihash.of("skein512-456", SKEIN512_456_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_464_CODE = 0xb35a;
    /** Multihash: skein512-464, status = draft, code = 0xb35a, uvarint = [0xda, 0xe6, 0x02] */
    public static final Multihash SKEIN512_464 = Multihash.of("skein512-464", SKEIN512_464_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_472_CODE = 0xb35b;
    /** Multihash: skein512-472, status = draft, code = 0xb35b, uvarint = [0xdb, 0xe6, 0x02] */
    public static final Multihash SKEIN512_472 = Multihash.of("skein512-472", SKEIN512_472_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_48_CODE = 0xb326;
    /** Multihash: skein512-48, status = draft, code = 0xb326, uvarint = [0xa6, 0xe6, 0x02] */
    public static final Multihash SKEIN512_48 = Multihash.of("skein512-48", SKEIN512_48_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_480_CODE = 0xb35c;
    /** Multihash: skein512-480, status = draft, code = 0xb35c, uvarint = [0xdc, 0xe6, 0x02] */
    public static final Multihash SKEIN512_480 = Multihash.of("skein512-480", SKEIN512_480_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_488_CODE = 0xb35d;
    /** Multihash: skein512-488, status = draft, code = 0xb35d, uvarint = [0xdd, 0xe6, 0x02] */
    public static final Multihash SKEIN512_488 = Multihash.of("skein512-488", SKEIN512_488_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_496_CODE = 0xb35e;
    /** Multihash: skein512-496, status = draft, code = 0xb35e, uvarint = [0xde, 0xe6, 0x02] */
    public static final Multihash SKEIN512_496 = Multihash.of("skein512-496", SKEIN512_496_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_504_CODE = 0xb35f;
    /** Multihash: skein512-504, status = draft, code = 0xb35f, uvarint = [0xdf, 0xe6, 0x02] */
    public static final Multihash SKEIN512_504 = Multihash.of("skein512-504", SKEIN512_504_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_512_CODE = 0xb360;
    /** Multihash: skein512-512, status = draft, code = 0xb360, uvarint = [0xe0, 0xe6, 0x02] */
    public static final Multihash SKEIN512_512 = Multihash.of("skein512-512", SKEIN512_512_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_56_CODE = 0xb327;
    /** Multihash: skein512-56, status = draft, code = 0xb327, uvarint = [0xa7, 0xe6, 0x02] */
    public static final Multihash SKEIN512_56 = Multihash.of("skein512-56", SKEIN512_56_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_64_CODE = 0xb328;
    /** Multihash: skein512-64, status = draft, code = 0xb328, uvarint = [0xa8, 0xe6, 0x02] */
    public static final Multihash SKEIN512_64 = Multihash.of("skein512-64", SKEIN512_64_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_72_CODE = 0xb329;
    /** Multihash: skein512-72, status = draft, code = 0xb329, uvarint = [0xa9, 0xe6, 0x02] */
    public static final Multihash SKEIN512_72 = Multihash.of("skein512-72", SKEIN512_72_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_8_CODE = 0xb321;
    /** Multihash: skein512-8, Skein512 consists of 64 output lengths that give different hashes, status = draft, code = 0xb321, uvarint = [0xa1, 0xe6, 0x02] */
    public static final Multihash SKEIN512_8 = Multihash.of("skein512-8", SKEIN512_8_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_80_CODE = 0xb32a;
    /** Multihash: skein512-80, status = draft, code = 0xb32a, uvarint = [0xaa, 0xe6, 0x02] */
    public static final Multihash SKEIN512_80 = Multihash.of("skein512-80", SKEIN512_80_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_88_CODE = 0xb32b;
    /** Multihash: skein512-88, status = draft, code = 0xb32b, uvarint = [0xab, 0xe6, 0x02] */
    public static final Multihash SKEIN512_88 = Multihash.of("skein512-88", SKEIN512_88_CODE, Multicodec.Status.Draft);

    public static final long SKEIN512_96_CODE = 0xb32c;
    /** Multihash: skein512-96, status = draft, code = 0xb32c, uvarint = [0xac, 0xe6, 0x02] */
    public static final Multihash SKEIN512_96 = Multihash.of("skein512-96", SKEIN512_96_CODE, Multicodec.Status.Draft);

    public static final long SM3_256_CODE = 0x534d;
    /** Multihash: sm3-256, status = draft, code = 0x534d, uvarint = [0xcd, 0xa6, 0x01] */
    public static final Multihash SM3_256 = Multihash.of("sm3-256", SM3_256_CODE, Multicodec.Status.Draft);

    public static final long SSZ_SHA2_256_BMT_CODE = 0xb502;
    /** Multihash: ssz-sha2-256-bmt, SSZ Merkle tree root using SHA2-256 as the hashing function and SSZ serialization for the block binary, status = draft, code = 0xb502, uvarint = [0x82, 0xea, 0x02] */
    public static final Multihash SSZ_SHA2_256_BMT = Multihash.of("ssz-sha2-256-bmt", SSZ_SHA2_256_BMT_CODE, Multicodec.Status.Draft);

    public static final long X11_CODE = 0x1100;
    /** Multihash: x11, status = draft, code = 0x1100, uvarint = [0x80, 0x22] */
    public static final Multihash X11 = Multihash.of("x11", X11_CODE, Multicodec.Status.Draft);

    protected static final Map<Long,Multicodec> ALL = new TreeMap<>();

    static {
      ALL.put(BCRYPT_PBKDF_CODE, BCRYPT_PBKDF);
      ALL.put(BITTORRENT_PIECES_ROOT_CODE, BITTORRENT_PIECES_ROOT);
      ALL.put(BLAKE2B_104_CODE, BLAKE2B_104);
      ALL.put(BLAKE2B_112_CODE, BLAKE2B_112);
      ALL.put(BLAKE2B_120_CODE, BLAKE2B_120);
      ALL.put(BLAKE2B_128_CODE, BLAKE2B_128);
      ALL.put(BLAKE2B_136_CODE, BLAKE2B_136);
      ALL.put(BLAKE2B_144_CODE, BLAKE2B_144);
      ALL.put(BLAKE2B_152_CODE, BLAKE2B_152);
      ALL.put(BLAKE2B_16_CODE, BLAKE2B_16);
      ALL.put(BLAKE2B_160_CODE, BLAKE2B_160);
      ALL.put(BLAKE2B_168_CODE, BLAKE2B_168);
      ALL.put(BLAKE2B_176_CODE, BLAKE2B_176);
      ALL.put(BLAKE2B_184_CODE, BLAKE2B_184);
      ALL.put(BLAKE2B_192_CODE, BLAKE2B_192);
      ALL.put(BLAKE2B_200_CODE, BLAKE2B_200);
      ALL.put(BLAKE2B_208_CODE, BLAKE2B_208);
      ALL.put(BLAKE2B_216_CODE, BLAKE2B_216);
      ALL.put(BLAKE2B_224_CODE, BLAKE2B_224);
      ALL.put(BLAKE2B_232_CODE, BLAKE2B_232);
      ALL.put(BLAKE2B_24_CODE, BLAKE2B_24);
      ALL.put(BLAKE2B_240_CODE, BLAKE2B_240);
      ALL.put(BLAKE2B_248_CODE, BLAKE2B_248);
      ALL.put(BLAKE2B_256_CODE, BLAKE2B_256);
      ALL.put(BLAKE2B_264_CODE, BLAKE2B_264);
      ALL.put(BLAKE2B_272_CODE, BLAKE2B_272);
      ALL.put(BLAKE2B_280_CODE, BLAKE2B_280);
      ALL.put(BLAKE2B_288_CODE, BLAKE2B_288);
      ALL.put(BLAKE2B_296_CODE, BLAKE2B_296);
      ALL.put(BLAKE2B_304_CODE, BLAKE2B_304);
      ALL.put(BLAKE2B_312_CODE, BLAKE2B_312);
      ALL.put(BLAKE2B_32_CODE, BLAKE2B_32);
      ALL.put(BLAKE2B_320_CODE, BLAKE2B_320);
      ALL.put(BLAKE2B_328_CODE, BLAKE2B_328);
      ALL.put(BLAKE2B_336_CODE, BLAKE2B_336);
      ALL.put(BLAKE2B_344_CODE, BLAKE2B_344);
      ALL.put(BLAKE2B_352_CODE, BLAKE2B_352);
      ALL.put(BLAKE2B_360_CODE, BLAKE2B_360);
      ALL.put(BLAKE2B_368_CODE, BLAKE2B_368);
      ALL.put(BLAKE2B_376_CODE, BLAKE2B_376);
      ALL.put(BLAKE2B_384_CODE, BLAKE2B_384);
      ALL.put(BLAKE2B_392_CODE, BLAKE2B_392);
      ALL.put(BLAKE2B_40_CODE, BLAKE2B_40);
      ALL.put(BLAKE2B_400_CODE, BLAKE2B_400);
      ALL.put(BLAKE2B_408_CODE, BLAKE2B_408);
      ALL.put(BLAKE2B_416_CODE, BLAKE2B_416);
      ALL.put(BLAKE2B_424_CODE, BLAKE2B_424);
      ALL.put(BLAKE2B_432_CODE, BLAKE2B_432);
      ALL.put(BLAKE2B_440_CODE, BLAKE2B_440);
      ALL.put(BLAKE2B_448_CODE, BLAKE2B_448);
      ALL.put(BLAKE2B_456_CODE, BLAKE2B_456);
      ALL.put(BLAKE2B_464_CODE, BLAKE2B_464);
      ALL.put(BLAKE2B_472_CODE, BLAKE2B_472);
      ALL.put(BLAKE2B_48_CODE, BLAKE2B_48);
      ALL.put(BLAKE2B_480_CODE, BLAKE2B_480);
      ALL.put(BLAKE2B_488_CODE, BLAKE2B_488);
      ALL.put(BLAKE2B_496_CODE, BLAKE2B_496);
      ALL.put(BLAKE2B_504_CODE, BLAKE2B_504);
      ALL.put(BLAKE2B_512_CODE, BLAKE2B_512);
      ALL.put(BLAKE2B_56_CODE, BLAKE2B_56);
      ALL.put(BLAKE2B_64_CODE, BLAKE2B_64);
      ALL.put(BLAKE2B_72_CODE, BLAKE2B_72);
      ALL.put(BLAKE2B_8_CODE, BLAKE2B_8);
      ALL.put(BLAKE2B_80_CODE, BLAKE2B_80);
      ALL.put(BLAKE2B_88_CODE, BLAKE2B_88);
      ALL.put(BLAKE2B_96_CODE, BLAKE2B_96);
      ALL.put(BLAKE2S_104_CODE, BLAKE2S_104);
      ALL.put(BLAKE2S_112_CODE, BLAKE2S_112);
      ALL.put(BLAKE2S_120_CODE, BLAKE2S_120);
      ALL.put(BLAKE2S_128_CODE, BLAKE2S_128);
      ALL.put(BLAKE2S_136_CODE, BLAKE2S_136);
      ALL.put(BLAKE2S_144_CODE, BLAKE2S_144);
      ALL.put(BLAKE2S_152_CODE, BLAKE2S_152);
      ALL.put(BLAKE2S_16_CODE, BLAKE2S_16);
      ALL.put(BLAKE2S_160_CODE, BLAKE2S_160);
      ALL.put(BLAKE2S_168_CODE, BLAKE2S_168);
      ALL.put(BLAKE2S_176_CODE, BLAKE2S_176);
      ALL.put(BLAKE2S_184_CODE, BLAKE2S_184);
      ALL.put(BLAKE2S_192_CODE, BLAKE2S_192);
      ALL.put(BLAKE2S_200_CODE, BLAKE2S_200);
      ALL.put(BLAKE2S_208_CODE, BLAKE2S_208);
      ALL.put(BLAKE2S_216_CODE, BLAKE2S_216);
      ALL.put(BLAKE2S_224_CODE, BLAKE2S_224);
      ALL.put(BLAKE2S_232_CODE, BLAKE2S_232);
      ALL.put(BLAKE2S_24_CODE, BLAKE2S_24);
      ALL.put(BLAKE2S_240_CODE, BLAKE2S_240);
      ALL.put(BLAKE2S_248_CODE, BLAKE2S_248);
      ALL.put(BLAKE2S_256_CODE, BLAKE2S_256);
      ALL.put(BLAKE2S_32_CODE, BLAKE2S_32);
      ALL.put(BLAKE2S_40_CODE, BLAKE2S_40);
      ALL.put(BLAKE2S_48_CODE, BLAKE2S_48);
      ALL.put(BLAKE2S_56_CODE, BLAKE2S_56);
      ALL.put(BLAKE2S_64_CODE, BLAKE2S_64);
      ALL.put(BLAKE2S_72_CODE, BLAKE2S_72);
      ALL.put(BLAKE2S_8_CODE, BLAKE2S_8);
      ALL.put(BLAKE2S_80_CODE, BLAKE2S_80);
      ALL.put(BLAKE2S_88_CODE, BLAKE2S_88);
      ALL.put(BLAKE2S_96_CODE, BLAKE2S_96);
      ALL.put(BLAKE3_CODE, BLAKE3);
      ALL.put(DBL_SHA2_256_CODE, DBL_SHA2_256);
      ALL.put(ED2K_CODE, ED2K);
      ALL.put(FR32_SHA256_TRUNC254_PADBINTREE_CODE, FR32_SHA256_TRUNC254_PADBINTREE);
      ALL.put(IDENTITY_CODE, IDENTITY);
      ALL.put(KECCAK_224_CODE, KECCAK_224);
      ALL.put(KECCAK_256_CODE, KECCAK_256);
      ALL.put(KECCAK_384_CODE, KECCAK_384);
      ALL.put(KECCAK_512_CODE, KECCAK_512);
      ALL.put(KT_128_CODE, KT_128);
      ALL.put(KT_256_CODE, KT_256);
      ALL.put(MD4_CODE, MD4);
      ALL.put(MD5_CODE, MD5);
      ALL.put(POSEIDON_BLS12_381_A2_FC1_CODE, POSEIDON_BLS12_381_A2_FC1);
      ALL.put(POSEIDON_BLS12_381_A2_FC1_SC_CODE, POSEIDON_BLS12_381_A2_FC1_SC);
      ALL.put(RIPEMD_128_CODE, RIPEMD_128);
      ALL.put(RIPEMD_160_CODE, RIPEMD_160);
      ALL.put(RIPEMD_256_CODE, RIPEMD_256);
      ALL.put(RIPEMD_320_CODE, RIPEMD_320);
      ALL.put(SHA1_CODE, SHA1);
      ALL.put(SHA2_224_CODE, SHA2_224);
      ALL.put(SHA2_256_CODE, SHA2_256);
      ALL.put(SHA2_256_CHUNKED_CODE, SHA2_256_CHUNKED);
      ALL.put(SHA2_256_TRUNC254_PADDED_CODE, SHA2_256_TRUNC254_PADDED);
      ALL.put(SHA2_384_CODE, SHA2_384);
      ALL.put(SHA2_512_CODE, SHA2_512);
      ALL.put(SHA2_512_224_CODE, SHA2_512_224);
      ALL.put(SHA2_512_256_CODE, SHA2_512_256);
      ALL.put(SHA3_224_CODE, SHA3_224);
      ALL.put(SHA3_256_CODE, SHA3_256);
      ALL.put(SHA3_384_CODE, SHA3_384);
      ALL.put(SHA3_512_CODE, SHA3_512);
      ALL.put(SHAKE_128_CODE, SHAKE_128);
      ALL.put(SHAKE_256_CODE, SHAKE_256);
      ALL.put(SKEIN1024_1000_CODE, SKEIN1024_1000);
      ALL.put(SKEIN1024_1008_CODE, SKEIN1024_1008);
      ALL.put(SKEIN1024_1016_CODE, SKEIN1024_1016);
      ALL.put(SKEIN1024_1024_CODE, SKEIN1024_1024);
      ALL.put(SKEIN1024_104_CODE, SKEIN1024_104);
      ALL.put(SKEIN1024_112_CODE, SKEIN1024_112);
      ALL.put(SKEIN1024_120_CODE, SKEIN1024_120);
      ALL.put(SKEIN1024_128_CODE, SKEIN1024_128);
      ALL.put(SKEIN1024_136_CODE, SKEIN1024_136);
      ALL.put(SKEIN1024_144_CODE, SKEIN1024_144);
      ALL.put(SKEIN1024_152_CODE, SKEIN1024_152);
      ALL.put(SKEIN1024_16_CODE, SKEIN1024_16);
      ALL.put(SKEIN1024_160_CODE, SKEIN1024_160);
      ALL.put(SKEIN1024_168_CODE, SKEIN1024_168);
      ALL.put(SKEIN1024_176_CODE, SKEIN1024_176);
      ALL.put(SKEIN1024_184_CODE, SKEIN1024_184);
      ALL.put(SKEIN1024_192_CODE, SKEIN1024_192);
      ALL.put(SKEIN1024_200_CODE, SKEIN1024_200);
      ALL.put(SKEIN1024_208_CODE, SKEIN1024_208);
      ALL.put(SKEIN1024_216_CODE, SKEIN1024_216);
      ALL.put(SKEIN1024_224_CODE, SKEIN1024_224);
      ALL.put(SKEIN1024_232_CODE, SKEIN1024_232);
      ALL.put(SKEIN1024_24_CODE, SKEIN1024_24);
      ALL.put(SKEIN1024_240_CODE, SKEIN1024_240);
      ALL.put(SKEIN1024_248_CODE, SKEIN1024_248);
      ALL.put(SKEIN1024_256_CODE, SKEIN1024_256);
      ALL.put(SKEIN1024_264_CODE, SKEIN1024_264);
      ALL.put(SKEIN1024_272_CODE, SKEIN1024_272);
      ALL.put(SKEIN1024_280_CODE, SKEIN1024_280);
      ALL.put(SKEIN1024_288_CODE, SKEIN1024_288);
      ALL.put(SKEIN1024_296_CODE, SKEIN1024_296);
      ALL.put(SKEIN1024_304_CODE, SKEIN1024_304);
      ALL.put(SKEIN1024_312_CODE, SKEIN1024_312);
      ALL.put(SKEIN1024_32_CODE, SKEIN1024_32);
      ALL.put(SKEIN1024_320_CODE, SKEIN1024_320);
      ALL.put(SKEIN1024_328_CODE, SKEIN1024_328);
      ALL.put(SKEIN1024_336_CODE, SKEIN1024_336);
      ALL.put(SKEIN1024_344_CODE, SKEIN1024_344);
      ALL.put(SKEIN1024_352_CODE, SKEIN1024_352);
      ALL.put(SKEIN1024_360_CODE, SKEIN1024_360);
      ALL.put(SKEIN1024_368_CODE, SKEIN1024_368);
      ALL.put(SKEIN1024_376_CODE, SKEIN1024_376);
      ALL.put(SKEIN1024_384_CODE, SKEIN1024_384);
      ALL.put(SKEIN1024_392_CODE, SKEIN1024_392);
      ALL.put(SKEIN1024_40_CODE, SKEIN1024_40);
      ALL.put(SKEIN1024_400_CODE, SKEIN1024_400);
      ALL.put(SKEIN1024_408_CODE, SKEIN1024_408);
      ALL.put(SKEIN1024_416_CODE, SKEIN1024_416);
      ALL.put(SKEIN1024_424_CODE, SKEIN1024_424);
      ALL.put(SKEIN1024_432_CODE, SKEIN1024_432);
      ALL.put(SKEIN1024_440_CODE, SKEIN1024_440);
      ALL.put(SKEIN1024_448_CODE, SKEIN1024_448);
      ALL.put(SKEIN1024_456_CODE, SKEIN1024_456);
      ALL.put(SKEIN1024_464_CODE, SKEIN1024_464);
      ALL.put(SKEIN1024_472_CODE, SKEIN1024_472);
      ALL.put(SKEIN1024_48_CODE, SKEIN1024_48);
      ALL.put(SKEIN1024_480_CODE, SKEIN1024_480);
      ALL.put(SKEIN1024_488_CODE, SKEIN1024_488);
      ALL.put(SKEIN1024_496_CODE, SKEIN1024_496);
      ALL.put(SKEIN1024_504_CODE, SKEIN1024_504);
      ALL.put(SKEIN1024_512_CODE, SKEIN1024_512);
      ALL.put(SKEIN1024_520_CODE, SKEIN1024_520);
      ALL.put(SKEIN1024_528_CODE, SKEIN1024_528);
      ALL.put(SKEIN1024_536_CODE, SKEIN1024_536);
      ALL.put(SKEIN1024_544_CODE, SKEIN1024_544);
      ALL.put(SKEIN1024_552_CODE, SKEIN1024_552);
      ALL.put(SKEIN1024_56_CODE, SKEIN1024_56);
      ALL.put(SKEIN1024_560_CODE, SKEIN1024_560);
      ALL.put(SKEIN1024_568_CODE, SKEIN1024_568);
      ALL.put(SKEIN1024_576_CODE, SKEIN1024_576);
      ALL.put(SKEIN1024_584_CODE, SKEIN1024_584);
      ALL.put(SKEIN1024_592_CODE, SKEIN1024_592);
      ALL.put(SKEIN1024_600_CODE, SKEIN1024_600);
      ALL.put(SKEIN1024_608_CODE, SKEIN1024_608);
      ALL.put(SKEIN1024_616_CODE, SKEIN1024_616);
      ALL.put(SKEIN1024_624_CODE, SKEIN1024_624);
      ALL.put(SKEIN1024_632_CODE, SKEIN1024_632);
      ALL.put(SKEIN1024_64_CODE, SKEIN1024_64);
      ALL.put(SKEIN1024_640_CODE, SKEIN1024_640);
      ALL.put(SKEIN1024_648_CODE, SKEIN1024_648);
      ALL.put(SKEIN1024_656_CODE, SKEIN1024_656);
      ALL.put(SKEIN1024_664_CODE, SKEIN1024_664);
      ALL.put(SKEIN1024_672_CODE, SKEIN1024_672);
      ALL.put(SKEIN1024_680_CODE, SKEIN1024_680);
      ALL.put(SKEIN1024_688_CODE, SKEIN1024_688);
      ALL.put(SKEIN1024_696_CODE, SKEIN1024_696);
      ALL.put(SKEIN1024_704_CODE, SKEIN1024_704);
      ALL.put(SKEIN1024_712_CODE, SKEIN1024_712);
      ALL.put(SKEIN1024_72_CODE, SKEIN1024_72);
      ALL.put(SKEIN1024_720_CODE, SKEIN1024_720);
      ALL.put(SKEIN1024_728_CODE, SKEIN1024_728);
      ALL.put(SKEIN1024_736_CODE, SKEIN1024_736);
      ALL.put(SKEIN1024_744_CODE, SKEIN1024_744);
      ALL.put(SKEIN1024_752_CODE, SKEIN1024_752);
      ALL.put(SKEIN1024_760_CODE, SKEIN1024_760);
      ALL.put(SKEIN1024_768_CODE, SKEIN1024_768);
      ALL.put(SKEIN1024_776_CODE, SKEIN1024_776);
      ALL.put(SKEIN1024_784_CODE, SKEIN1024_784);
      ALL.put(SKEIN1024_792_CODE, SKEIN1024_792);
      ALL.put(SKEIN1024_8_CODE, SKEIN1024_8);
      ALL.put(SKEIN1024_80_CODE, SKEIN1024_80);
      ALL.put(SKEIN1024_800_CODE, SKEIN1024_800);
      ALL.put(SKEIN1024_808_CODE, SKEIN1024_808);
      ALL.put(SKEIN1024_816_CODE, SKEIN1024_816);
      ALL.put(SKEIN1024_824_CODE, SKEIN1024_824);
      ALL.put(SKEIN1024_832_CODE, SKEIN1024_832);
      ALL.put(SKEIN1024_840_CODE, SKEIN1024_840);
      ALL.put(SKEIN1024_848_CODE, SKEIN1024_848);
      ALL.put(SKEIN1024_856_CODE, SKEIN1024_856);
      ALL.put(SKEIN1024_864_CODE, SKEIN1024_864);
      ALL.put(SKEIN1024_872_CODE, SKEIN1024_872);
      ALL.put(SKEIN1024_88_CODE, SKEIN1024_88);
      ALL.put(SKEIN1024_880_CODE, SKEIN1024_880);
      ALL.put(SKEIN1024_888_CODE, SKEIN1024_888);
      ALL.put(SKEIN1024_896_CODE, SKEIN1024_896);
      ALL.put(SKEIN1024_904_CODE, SKEIN1024_904);
      ALL.put(SKEIN1024_912_CODE, SKEIN1024_912);
      ALL.put(SKEIN1024_920_CODE, SKEIN1024_920);
      ALL.put(SKEIN1024_928_CODE, SKEIN1024_928);
      ALL.put(SKEIN1024_936_CODE, SKEIN1024_936);
      ALL.put(SKEIN1024_944_CODE, SKEIN1024_944);
      ALL.put(SKEIN1024_952_CODE, SKEIN1024_952);
      ALL.put(SKEIN1024_96_CODE, SKEIN1024_96);
      ALL.put(SKEIN1024_960_CODE, SKEIN1024_960);
      ALL.put(SKEIN1024_968_CODE, SKEIN1024_968);
      ALL.put(SKEIN1024_976_CODE, SKEIN1024_976);
      ALL.put(SKEIN1024_984_CODE, SKEIN1024_984);
      ALL.put(SKEIN1024_992_CODE, SKEIN1024_992);
      ALL.put(SKEIN256_104_CODE, SKEIN256_104);
      ALL.put(SKEIN256_112_CODE, SKEIN256_112);
      ALL.put(SKEIN256_120_CODE, SKEIN256_120);
      ALL.put(SKEIN256_128_CODE, SKEIN256_128);
      ALL.put(SKEIN256_136_CODE, SKEIN256_136);
      ALL.put(SKEIN256_144_CODE, SKEIN256_144);
      ALL.put(SKEIN256_152_CODE, SKEIN256_152);
      ALL.put(SKEIN256_16_CODE, SKEIN256_16);
      ALL.put(SKEIN256_160_CODE, SKEIN256_160);
      ALL.put(SKEIN256_168_CODE, SKEIN256_168);
      ALL.put(SKEIN256_176_CODE, SKEIN256_176);
      ALL.put(SKEIN256_184_CODE, SKEIN256_184);
      ALL.put(SKEIN256_192_CODE, SKEIN256_192);
      ALL.put(SKEIN256_200_CODE, SKEIN256_200);
      ALL.put(SKEIN256_208_CODE, SKEIN256_208);
      ALL.put(SKEIN256_216_CODE, SKEIN256_216);
      ALL.put(SKEIN256_224_CODE, SKEIN256_224);
      ALL.put(SKEIN256_232_CODE, SKEIN256_232);
      ALL.put(SKEIN256_24_CODE, SKEIN256_24);
      ALL.put(SKEIN256_240_CODE, SKEIN256_240);
      ALL.put(SKEIN256_248_CODE, SKEIN256_248);
      ALL.put(SKEIN256_256_CODE, SKEIN256_256);
      ALL.put(SKEIN256_32_CODE, SKEIN256_32);
      ALL.put(SKEIN256_40_CODE, SKEIN256_40);
      ALL.put(SKEIN256_48_CODE, SKEIN256_48);
      ALL.put(SKEIN256_56_CODE, SKEIN256_56);
      ALL.put(SKEIN256_64_CODE, SKEIN256_64);
      ALL.put(SKEIN256_72_CODE, SKEIN256_72);
      ALL.put(SKEIN256_8_CODE, SKEIN256_8);
      ALL.put(SKEIN256_80_CODE, SKEIN256_80);
      ALL.put(SKEIN256_88_CODE, SKEIN256_88);
      ALL.put(SKEIN256_96_CODE, SKEIN256_96);
      ALL.put(SKEIN512_104_CODE, SKEIN512_104);
      ALL.put(SKEIN512_112_CODE, SKEIN512_112);
      ALL.put(SKEIN512_120_CODE, SKEIN512_120);
      ALL.put(SKEIN512_128_CODE, SKEIN512_128);
      ALL.put(SKEIN512_136_CODE, SKEIN512_136);
      ALL.put(SKEIN512_144_CODE, SKEIN512_144);
      ALL.put(SKEIN512_152_CODE, SKEIN512_152);
      ALL.put(SKEIN512_16_CODE, SKEIN512_16);
      ALL.put(SKEIN512_160_CODE, SKEIN512_160);
      ALL.put(SKEIN512_168_CODE, SKEIN512_168);
      ALL.put(SKEIN512_176_CODE, SKEIN512_176);
      ALL.put(SKEIN512_184_CODE, SKEIN512_184);
      ALL.put(SKEIN512_192_CODE, SKEIN512_192);
      ALL.put(SKEIN512_200_CODE, SKEIN512_200);
      ALL.put(SKEIN512_208_CODE, SKEIN512_208);
      ALL.put(SKEIN512_216_CODE, SKEIN512_216);
      ALL.put(SKEIN512_224_CODE, SKEIN512_224);
      ALL.put(SKEIN512_232_CODE, SKEIN512_232);
      ALL.put(SKEIN512_24_CODE, SKEIN512_24);
      ALL.put(SKEIN512_240_CODE, SKEIN512_240);
      ALL.put(SKEIN512_248_CODE, SKEIN512_248);
      ALL.put(SKEIN512_256_CODE, SKEIN512_256);
      ALL.put(SKEIN512_264_CODE, SKEIN512_264);
      ALL.put(SKEIN512_272_CODE, SKEIN512_272);
      ALL.put(SKEIN512_280_CODE, SKEIN512_280);
      ALL.put(SKEIN512_288_CODE, SKEIN512_288);
      ALL.put(SKEIN512_296_CODE, SKEIN512_296);
      ALL.put(SKEIN512_304_CODE, SKEIN512_304);
      ALL.put(SKEIN512_312_CODE, SKEIN512_312);
      ALL.put(SKEIN512_32_CODE, SKEIN512_32);
      ALL.put(SKEIN512_320_CODE, SKEIN512_320);
      ALL.put(SKEIN512_328_CODE, SKEIN512_328);
      ALL.put(SKEIN512_336_CODE, SKEIN512_336);
      ALL.put(SKEIN512_344_CODE, SKEIN512_344);
      ALL.put(SKEIN512_352_CODE, SKEIN512_352);
      ALL.put(SKEIN512_360_CODE, SKEIN512_360);
      ALL.put(SKEIN512_368_CODE, SKEIN512_368);
      ALL.put(SKEIN512_376_CODE, SKEIN512_376);
      ALL.put(SKEIN512_384_CODE, SKEIN512_384);
      ALL.put(SKEIN512_392_CODE, SKEIN512_392);
      ALL.put(SKEIN512_40_CODE, SKEIN512_40);
      ALL.put(SKEIN512_400_CODE, SKEIN512_400);
      ALL.put(SKEIN512_408_CODE, SKEIN512_408);
      ALL.put(SKEIN512_416_CODE, SKEIN512_416);
      ALL.put(SKEIN512_424_CODE, SKEIN512_424);
      ALL.put(SKEIN512_432_CODE, SKEIN512_432);
      ALL.put(SKEIN512_440_CODE, SKEIN512_440);
      ALL.put(SKEIN512_448_CODE, SKEIN512_448);
      ALL.put(SKEIN512_456_CODE, SKEIN512_456);
      ALL.put(SKEIN512_464_CODE, SKEIN512_464);
      ALL.put(SKEIN512_472_CODE, SKEIN512_472);
      ALL.put(SKEIN512_48_CODE, SKEIN512_48);
      ALL.put(SKEIN512_480_CODE, SKEIN512_480);
      ALL.put(SKEIN512_488_CODE, SKEIN512_488);
      ALL.put(SKEIN512_496_CODE, SKEIN512_496);
      ALL.put(SKEIN512_504_CODE, SKEIN512_504);
      ALL.put(SKEIN512_512_CODE, SKEIN512_512);
      ALL.put(SKEIN512_56_CODE, SKEIN512_56);
      ALL.put(SKEIN512_64_CODE, SKEIN512_64);
      ALL.put(SKEIN512_72_CODE, SKEIN512_72);
      ALL.put(SKEIN512_8_CODE, SKEIN512_8);
      ALL.put(SKEIN512_80_CODE, SKEIN512_80);
      ALL.put(SKEIN512_88_CODE, SKEIN512_88);
      ALL.put(SKEIN512_96_CODE, SKEIN512_96);
      ALL.put(SM3_256_CODE, SM3_256);
      ALL.put(SSZ_SHA2_256_BMT_CODE, SSZ_SHA2_256_BMT);
      ALL.put(X11_CODE, X11);
    }

    protected MultihashCodec() { /* protected */ }
}
