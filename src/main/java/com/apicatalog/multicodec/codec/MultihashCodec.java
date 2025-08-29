package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec;
import com.apicatalog.multihash.Multihash;

/** Multicodec Registry - generated: Fri Aug 29 18:18:52 CEST 2025 */
public class MultihashCodec {

    /** Multihash: bcrypt-pbkdf, Bcrypt-PBKDF key derivation function, status = draft, code = 0xd00d */
    public static final Multihash BCRYPT_PBKDF = Multihash.of("bcrypt-pbkdf", 0xd00d, Multicodec.Status.Draft);

    /** Multihash: bittorrent-pieces-root, BitTorrent v2 pieces root hash., status = draft, code = 0xb702 */
    public static final Multihash BITTORRENT_PIECES_ROOT = Multihash.of("bittorrent-pieces-root", 0xb702, Multicodec.Status.Draft);

    /** Multihash: blake2b-104, status = draft, code = 0xb20d */
    public static final Multihash BLAKE2B_104 = Multihash.of("blake2b-104", 0xb20d, Multicodec.Status.Draft);

    /** Multihash: blake2b-112, status = draft, code = 0xb20e */
    public static final Multihash BLAKE2B_112 = Multihash.of("blake2b-112", 0xb20e, Multicodec.Status.Draft);

    /** Multihash: blake2b-120, status = draft, code = 0xb20f */
    public static final Multihash BLAKE2B_120 = Multihash.of("blake2b-120", 0xb20f, Multicodec.Status.Draft);

    /** Multihash: blake2b-128, status = draft, code = 0xb210 */
    public static final Multihash BLAKE2B_128 = Multihash.of("blake2b-128", 0xb210, Multicodec.Status.Draft);

    /** Multihash: blake2b-136, status = draft, code = 0xb211 */
    public static final Multihash BLAKE2B_136 = Multihash.of("blake2b-136", 0xb211, Multicodec.Status.Draft);

    /** Multihash: blake2b-144, status = draft, code = 0xb212 */
    public static final Multihash BLAKE2B_144 = Multihash.of("blake2b-144", 0xb212, Multicodec.Status.Draft);

    /** Multihash: blake2b-152, status = draft, code = 0xb213 */
    public static final Multihash BLAKE2B_152 = Multihash.of("blake2b-152", 0xb213, Multicodec.Status.Draft);

    /** Multihash: blake2b-16, status = draft, code = 0xb202 */
    public static final Multihash BLAKE2B_16 = Multihash.of("blake2b-16", 0xb202, Multicodec.Status.Draft);

    /** Multihash: blake2b-160, status = draft, code = 0xb214 */
    public static final Multihash BLAKE2B_160 = Multihash.of("blake2b-160", 0xb214, Multicodec.Status.Draft);

    /** Multihash: blake2b-168, status = draft, code = 0xb215 */
    public static final Multihash BLAKE2B_168 = Multihash.of("blake2b-168", 0xb215, Multicodec.Status.Draft);

    /** Multihash: blake2b-176, status = draft, code = 0xb216 */
    public static final Multihash BLAKE2B_176 = Multihash.of("blake2b-176", 0xb216, Multicodec.Status.Draft);

    /** Multihash: blake2b-184, status = draft, code = 0xb217 */
    public static final Multihash BLAKE2B_184 = Multihash.of("blake2b-184", 0xb217, Multicodec.Status.Draft);

    /** Multihash: blake2b-192, status = draft, code = 0xb218 */
    public static final Multihash BLAKE2B_192 = Multihash.of("blake2b-192", 0xb218, Multicodec.Status.Draft);

    /** Multihash: blake2b-200, status = draft, code = 0xb219 */
    public static final Multihash BLAKE2B_200 = Multihash.of("blake2b-200", 0xb219, Multicodec.Status.Draft);

    /** Multihash: blake2b-208, status = draft, code = 0xb21a */
    public static final Multihash BLAKE2B_208 = Multihash.of("blake2b-208", 0xb21a, Multicodec.Status.Draft);

    /** Multihash: blake2b-216, status = draft, code = 0xb21b */
    public static final Multihash BLAKE2B_216 = Multihash.of("blake2b-216", 0xb21b, Multicodec.Status.Draft);

    /** Multihash: blake2b-224, status = draft, code = 0xb21c */
    public static final Multihash BLAKE2B_224 = Multihash.of("blake2b-224", 0xb21c, Multicodec.Status.Draft);

    /** Multihash: blake2b-232, status = draft, code = 0xb21d */
    public static final Multihash BLAKE2B_232 = Multihash.of("blake2b-232", 0xb21d, Multicodec.Status.Draft);

    /** Multihash: blake2b-24, status = draft, code = 0xb203 */
    public static final Multihash BLAKE2B_24 = Multihash.of("blake2b-24", 0xb203, Multicodec.Status.Draft);

    /** Multihash: blake2b-240, status = draft, code = 0xb21e */
    public static final Multihash BLAKE2B_240 = Multihash.of("blake2b-240", 0xb21e, Multicodec.Status.Draft);

    /** Multihash: blake2b-248, status = draft, code = 0xb21f */
    public static final Multihash BLAKE2B_248 = Multihash.of("blake2b-248", 0xb21f, Multicodec.Status.Draft);

    /** Multihash: blake2b-256, status = permanent, code = 0xb220 */
    public static final Multihash BLAKE2B_256 = Multihash.of("blake2b-256", 0xb220, Multicodec.Status.Permanent);

    /** Multihash: blake2b-264, status = draft, code = 0xb221 */
    public static final Multihash BLAKE2B_264 = Multihash.of("blake2b-264", 0xb221, Multicodec.Status.Draft);

    /** Multihash: blake2b-272, status = draft, code = 0xb222 */
    public static final Multihash BLAKE2B_272 = Multihash.of("blake2b-272", 0xb222, Multicodec.Status.Draft);

    /** Multihash: blake2b-280, status = draft, code = 0xb223 */
    public static final Multihash BLAKE2B_280 = Multihash.of("blake2b-280", 0xb223, Multicodec.Status.Draft);

    /** Multihash: blake2b-288, status = draft, code = 0xb224 */
    public static final Multihash BLAKE2B_288 = Multihash.of("blake2b-288", 0xb224, Multicodec.Status.Draft);

    /** Multihash: blake2b-296, status = draft, code = 0xb225 */
    public static final Multihash BLAKE2B_296 = Multihash.of("blake2b-296", 0xb225, Multicodec.Status.Draft);

    /** Multihash: blake2b-304, status = draft, code = 0xb226 */
    public static final Multihash BLAKE2B_304 = Multihash.of("blake2b-304", 0xb226, Multicodec.Status.Draft);

    /** Multihash: blake2b-312, status = draft, code = 0xb227 */
    public static final Multihash BLAKE2B_312 = Multihash.of("blake2b-312", 0xb227, Multicodec.Status.Draft);

    /** Multihash: blake2b-32, status = draft, code = 0xb204 */
    public static final Multihash BLAKE2B_32 = Multihash.of("blake2b-32", 0xb204, Multicodec.Status.Draft);

    /** Multihash: blake2b-320, status = draft, code = 0xb228 */
    public static final Multihash BLAKE2B_320 = Multihash.of("blake2b-320", 0xb228, Multicodec.Status.Draft);

    /** Multihash: blake2b-328, status = draft, code = 0xb229 */
    public static final Multihash BLAKE2B_328 = Multihash.of("blake2b-328", 0xb229, Multicodec.Status.Draft);

    /** Multihash: blake2b-336, status = draft, code = 0xb22a */
    public static final Multihash BLAKE2B_336 = Multihash.of("blake2b-336", 0xb22a, Multicodec.Status.Draft);

    /** Multihash: blake2b-344, status = draft, code = 0xb22b */
    public static final Multihash BLAKE2B_344 = Multihash.of("blake2b-344", 0xb22b, Multicodec.Status.Draft);

    /** Multihash: blake2b-352, status = draft, code = 0xb22c */
    public static final Multihash BLAKE2B_352 = Multihash.of("blake2b-352", 0xb22c, Multicodec.Status.Draft);

    /** Multihash: blake2b-360, status = draft, code = 0xb22d */
    public static final Multihash BLAKE2B_360 = Multihash.of("blake2b-360", 0xb22d, Multicodec.Status.Draft);

    /** Multihash: blake2b-368, status = draft, code = 0xb22e */
    public static final Multihash BLAKE2B_368 = Multihash.of("blake2b-368", 0xb22e, Multicodec.Status.Draft);

    /** Multihash: blake2b-376, status = draft, code = 0xb22f */
    public static final Multihash BLAKE2B_376 = Multihash.of("blake2b-376", 0xb22f, Multicodec.Status.Draft);

    /** Multihash: blake2b-384, status = draft, code = 0xb230 */
    public static final Multihash BLAKE2B_384 = Multihash.of("blake2b-384", 0xb230, Multicodec.Status.Draft);

    /** Multihash: blake2b-392, status = draft, code = 0xb231 */
    public static final Multihash BLAKE2B_392 = Multihash.of("blake2b-392", 0xb231, Multicodec.Status.Draft);

    /** Multihash: blake2b-40, status = draft, code = 0xb205 */
    public static final Multihash BLAKE2B_40 = Multihash.of("blake2b-40", 0xb205, Multicodec.Status.Draft);

    /** Multihash: blake2b-400, status = draft, code = 0xb232 */
    public static final Multihash BLAKE2B_400 = Multihash.of("blake2b-400", 0xb232, Multicodec.Status.Draft);

    /** Multihash: blake2b-408, status = draft, code = 0xb233 */
    public static final Multihash BLAKE2B_408 = Multihash.of("blake2b-408", 0xb233, Multicodec.Status.Draft);

    /** Multihash: blake2b-416, status = draft, code = 0xb234 */
    public static final Multihash BLAKE2B_416 = Multihash.of("blake2b-416", 0xb234, Multicodec.Status.Draft);

    /** Multihash: blake2b-424, status = draft, code = 0xb235 */
    public static final Multihash BLAKE2B_424 = Multihash.of("blake2b-424", 0xb235, Multicodec.Status.Draft);

    /** Multihash: blake2b-432, status = draft, code = 0xb236 */
    public static final Multihash BLAKE2B_432 = Multihash.of("blake2b-432", 0xb236, Multicodec.Status.Draft);

    /** Multihash: blake2b-440, status = draft, code = 0xb237 */
    public static final Multihash BLAKE2B_440 = Multihash.of("blake2b-440", 0xb237, Multicodec.Status.Draft);

    /** Multihash: blake2b-448, status = draft, code = 0xb238 */
    public static final Multihash BLAKE2B_448 = Multihash.of("blake2b-448", 0xb238, Multicodec.Status.Draft);

    /** Multihash: blake2b-456, status = draft, code = 0xb239 */
    public static final Multihash BLAKE2B_456 = Multihash.of("blake2b-456", 0xb239, Multicodec.Status.Draft);

    /** Multihash: blake2b-464, status = draft, code = 0xb23a */
    public static final Multihash BLAKE2B_464 = Multihash.of("blake2b-464", 0xb23a, Multicodec.Status.Draft);

    /** Multihash: blake2b-472, status = draft, code = 0xb23b */
    public static final Multihash BLAKE2B_472 = Multihash.of("blake2b-472", 0xb23b, Multicodec.Status.Draft);

    /** Multihash: blake2b-48, status = draft, code = 0xb206 */
    public static final Multihash BLAKE2B_48 = Multihash.of("blake2b-48", 0xb206, Multicodec.Status.Draft);

    /** Multihash: blake2b-480, status = draft, code = 0xb23c */
    public static final Multihash BLAKE2B_480 = Multihash.of("blake2b-480", 0xb23c, Multicodec.Status.Draft);

    /** Multihash: blake2b-488, status = draft, code = 0xb23d */
    public static final Multihash BLAKE2B_488 = Multihash.of("blake2b-488", 0xb23d, Multicodec.Status.Draft);

    /** Multihash: blake2b-496, status = draft, code = 0xb23e */
    public static final Multihash BLAKE2B_496 = Multihash.of("blake2b-496", 0xb23e, Multicodec.Status.Draft);

    /** Multihash: blake2b-504, status = draft, code = 0xb23f */
    public static final Multihash BLAKE2B_504 = Multihash.of("blake2b-504", 0xb23f, Multicodec.Status.Draft);

    /** Multihash: blake2b-512, status = draft, code = 0xb240 */
    public static final Multihash BLAKE2B_512 = Multihash.of("blake2b-512", 0xb240, Multicodec.Status.Draft);

    /** Multihash: blake2b-56, status = draft, code = 0xb207 */
    public static final Multihash BLAKE2B_56 = Multihash.of("blake2b-56", 0xb207, Multicodec.Status.Draft);

    /** Multihash: blake2b-64, status = draft, code = 0xb208 */
    public static final Multihash BLAKE2B_64 = Multihash.of("blake2b-64", 0xb208, Multicodec.Status.Draft);

    /** Multihash: blake2b-72, status = draft, code = 0xb209 */
    public static final Multihash BLAKE2B_72 = Multihash.of("blake2b-72", 0xb209, Multicodec.Status.Draft);

    /** Multihash: blake2b-8, Blake2b consists of 64 output lengths that give different hashes, status = draft, code = 0xb201 */
    public static final Multihash BLAKE2B_8 = Multihash.of("blake2b-8", 0xb201, Multicodec.Status.Draft);

    /** Multihash: blake2b-80, status = draft, code = 0xb20a */
    public static final Multihash BLAKE2B_80 = Multihash.of("blake2b-80", 0xb20a, Multicodec.Status.Draft);

    /** Multihash: blake2b-88, status = draft, code = 0xb20b */
    public static final Multihash BLAKE2B_88 = Multihash.of("blake2b-88", 0xb20b, Multicodec.Status.Draft);

    /** Multihash: blake2b-96, status = draft, code = 0xb20c */
    public static final Multihash BLAKE2B_96 = Multihash.of("blake2b-96", 0xb20c, Multicodec.Status.Draft);

    /** Multihash: blake2s-104, status = draft, code = 0xb24d */
    public static final Multihash BLAKE2S_104 = Multihash.of("blake2s-104", 0xb24d, Multicodec.Status.Draft);

    /** Multihash: blake2s-112, status = draft, code = 0xb24e */
    public static final Multihash BLAKE2S_112 = Multihash.of("blake2s-112", 0xb24e, Multicodec.Status.Draft);

    /** Multihash: blake2s-120, status = draft, code = 0xb24f */
    public static final Multihash BLAKE2S_120 = Multihash.of("blake2s-120", 0xb24f, Multicodec.Status.Draft);

    /** Multihash: blake2s-128, status = draft, code = 0xb250 */
    public static final Multihash BLAKE2S_128 = Multihash.of("blake2s-128", 0xb250, Multicodec.Status.Draft);

    /** Multihash: blake2s-136, status = draft, code = 0xb251 */
    public static final Multihash BLAKE2S_136 = Multihash.of("blake2s-136", 0xb251, Multicodec.Status.Draft);

    /** Multihash: blake2s-144, status = draft, code = 0xb252 */
    public static final Multihash BLAKE2S_144 = Multihash.of("blake2s-144", 0xb252, Multicodec.Status.Draft);

    /** Multihash: blake2s-152, status = draft, code = 0xb253 */
    public static final Multihash BLAKE2S_152 = Multihash.of("blake2s-152", 0xb253, Multicodec.Status.Draft);

    /** Multihash: blake2s-16, status = draft, code = 0xb242 */
    public static final Multihash BLAKE2S_16 = Multihash.of("blake2s-16", 0xb242, Multicodec.Status.Draft);

    /** Multihash: blake2s-160, status = draft, code = 0xb254 */
    public static final Multihash BLAKE2S_160 = Multihash.of("blake2s-160", 0xb254, Multicodec.Status.Draft);

    /** Multihash: blake2s-168, status = draft, code = 0xb255 */
    public static final Multihash BLAKE2S_168 = Multihash.of("blake2s-168", 0xb255, Multicodec.Status.Draft);

    /** Multihash: blake2s-176, status = draft, code = 0xb256 */
    public static final Multihash BLAKE2S_176 = Multihash.of("blake2s-176", 0xb256, Multicodec.Status.Draft);

    /** Multihash: blake2s-184, status = draft, code = 0xb257 */
    public static final Multihash BLAKE2S_184 = Multihash.of("blake2s-184", 0xb257, Multicodec.Status.Draft);

    /** Multihash: blake2s-192, status = draft, code = 0xb258 */
    public static final Multihash BLAKE2S_192 = Multihash.of("blake2s-192", 0xb258, Multicodec.Status.Draft);

    /** Multihash: blake2s-200, status = draft, code = 0xb259 */
    public static final Multihash BLAKE2S_200 = Multihash.of("blake2s-200", 0xb259, Multicodec.Status.Draft);

    /** Multihash: blake2s-208, status = draft, code = 0xb25a */
    public static final Multihash BLAKE2S_208 = Multihash.of("blake2s-208", 0xb25a, Multicodec.Status.Draft);

    /** Multihash: blake2s-216, status = draft, code = 0xb25b */
    public static final Multihash BLAKE2S_216 = Multihash.of("blake2s-216", 0xb25b, Multicodec.Status.Draft);

    /** Multihash: blake2s-224, status = draft, code = 0xb25c */
    public static final Multihash BLAKE2S_224 = Multihash.of("blake2s-224", 0xb25c, Multicodec.Status.Draft);

    /** Multihash: blake2s-232, status = draft, code = 0xb25d */
    public static final Multihash BLAKE2S_232 = Multihash.of("blake2s-232", 0xb25d, Multicodec.Status.Draft);

    /** Multihash: blake2s-24, status = draft, code = 0xb243 */
    public static final Multihash BLAKE2S_24 = Multihash.of("blake2s-24", 0xb243, Multicodec.Status.Draft);

    /** Multihash: blake2s-240, status = draft, code = 0xb25e */
    public static final Multihash BLAKE2S_240 = Multihash.of("blake2s-240", 0xb25e, Multicodec.Status.Draft);

    /** Multihash: blake2s-248, status = draft, code = 0xb25f */
    public static final Multihash BLAKE2S_248 = Multihash.of("blake2s-248", 0xb25f, Multicodec.Status.Draft);

    /** Multihash: blake2s-256, status = draft, code = 0xb260 */
    public static final Multihash BLAKE2S_256 = Multihash.of("blake2s-256", 0xb260, Multicodec.Status.Draft);

    /** Multihash: blake2s-32, status = draft, code = 0xb244 */
    public static final Multihash BLAKE2S_32 = Multihash.of("blake2s-32", 0xb244, Multicodec.Status.Draft);

    /** Multihash: blake2s-40, status = draft, code = 0xb245 */
    public static final Multihash BLAKE2S_40 = Multihash.of("blake2s-40", 0xb245, Multicodec.Status.Draft);

    /** Multihash: blake2s-48, status = draft, code = 0xb246 */
    public static final Multihash BLAKE2S_48 = Multihash.of("blake2s-48", 0xb246, Multicodec.Status.Draft);

    /** Multihash: blake2s-56, status = draft, code = 0xb247 */
    public static final Multihash BLAKE2S_56 = Multihash.of("blake2s-56", 0xb247, Multicodec.Status.Draft);

    /** Multihash: blake2s-64, status = draft, code = 0xb248 */
    public static final Multihash BLAKE2S_64 = Multihash.of("blake2s-64", 0xb248, Multicodec.Status.Draft);

    /** Multihash: blake2s-72, status = draft, code = 0xb249 */
    public static final Multihash BLAKE2S_72 = Multihash.of("blake2s-72", 0xb249, Multicodec.Status.Draft);

    /** Multihash: blake2s-8, Blake2s consists of 32 output lengths that give different hashes, status = draft, code = 0xb241 */
    public static final Multihash BLAKE2S_8 = Multihash.of("blake2s-8", 0xb241, Multicodec.Status.Draft);

    /** Multihash: blake2s-80, status = draft, code = 0xb24a */
    public static final Multihash BLAKE2S_80 = Multihash.of("blake2s-80", 0xb24a, Multicodec.Status.Draft);

    /** Multihash: blake2s-88, status = draft, code = 0xb24b */
    public static final Multihash BLAKE2S_88 = Multihash.of("blake2s-88", 0xb24b, Multicodec.Status.Draft);

    /** Multihash: blake2s-96, status = draft, code = 0xb24c */
    public static final Multihash BLAKE2S_96 = Multihash.of("blake2s-96", 0xb24c, Multicodec.Status.Draft);

    /** Multihash: blake3, BLAKE3 has a default 32 byte output length. The maximum length is (2^64)-1 bytes., status = draft, code = 0x1e */
    public static final Multihash BLAKE3 = Multihash.of("blake3", 0x1e, Multicodec.Status.Draft);

    /** Multihash: dbl-sha2-256, status = draft, code = 0x56 */
    public static final Multihash DBL_SHA2_256 = Multihash.of("dbl-sha2-256", 0x56, Multicodec.Status.Draft);

    /** Multihash: ed2k, eDonkey2000 hash., status = draft, code = 0xed20 */
    public static final Multihash ED2K = Multihash.of("ed2k", 0xed20, Multicodec.Status.Draft);

    /** Multihash: fr32-sha256-trunc254-padbintree, A balanced binary tree hash used in Filecoin Piece Commitments as described in FRC-0069, status = draft, code = 0x1011 */
    public static final Multihash FR32_SHA256_TRUNC254_PADBINTREE = Multihash.of("fr32-sha256-trunc254-padbintree", 0x1011, Multicodec.Status.Draft);

    /** Multihash: identity, raw binary, status = permanent, code = 0x0 */
    public static final Multihash IDENTITY = Multihash.of("identity", 0x0, Multicodec.Status.Permanent);

    /** Multihash: kangarootwelve, KangarooTwelve is an extendable-output hash function based on Keccak-p, status = draft, code = 0x1d01 */
    public static final Multihash KANGAROOTWELVE = Multihash.of("kangarootwelve", 0x1d01, Multicodec.Status.Draft);

    /** Multihash: keccak-224, keccak has variable output length. The number specifies the core length, status = draft, code = 0x1a */
    public static final Multihash KECCAK_224 = Multihash.of("keccak-224", 0x1a, Multicodec.Status.Draft);

    /** Multihash: keccak-256, status = draft, code = 0x1b */
    public static final Multihash KECCAK_256 = Multihash.of("keccak-256", 0x1b, Multicodec.Status.Draft);

    /** Multihash: keccak-384, status = draft, code = 0x1c */
    public static final Multihash KECCAK_384 = Multihash.of("keccak-384", 0x1c, Multicodec.Status.Draft);

    /** Multihash: keccak-512, status = draft, code = 0x1d */
    public static final Multihash KECCAK_512 = Multihash.of("keccak-512", 0x1d, Multicodec.Status.Draft);

    /** Multihash: md4, status = draft, code = 0xd4 */
    public static final Multihash MD4 = Multihash.of("md4", 0xd4, Multicodec.Status.Draft);

    /** Multihash: md5, status = draft, code = 0xd5 */
    public static final Multihash MD5 = Multihash.of("md5", 0xd5, Multicodec.Status.Draft);

    /** Multihash: poseidon-bls12_381-a2-fc1, Poseidon using BLS12-381 and arity of 2 with Filecoin parameters, status = permanent, code = 0xb401 */
    public static final Multihash POSEIDON_BLS12_381_A2_FC1 = Multihash.of("poseidon-bls12_381-a2-fc1", 0xb401, Multicodec.Status.Permanent);

    /** Multihash: poseidon-bls12_381-a2-fc1-sc, Poseidon using BLS12-381 and arity of 2 with Filecoin parameters - high-security variant, status = draft, code = 0xb402 */
    public static final Multihash POSEIDON_BLS12_381_A2_FC1_SC = Multihash.of("poseidon-bls12_381-a2-fc1-sc", 0xb402, Multicodec.Status.Draft);

    /** Multihash: ripemd-128, status = draft, code = 0x1052 */
    public static final Multihash RIPEMD_128 = Multihash.of("ripemd-128", 0x1052, Multicodec.Status.Draft);

    /** Multihash: ripemd-160, status = draft, code = 0x1053 */
    public static final Multihash RIPEMD_160 = Multihash.of("ripemd-160", 0x1053, Multicodec.Status.Draft);

    /** Multihash: ripemd-256, status = draft, code = 0x1054 */
    public static final Multihash RIPEMD_256 = Multihash.of("ripemd-256", 0x1054, Multicodec.Status.Draft);

    /** Multihash: ripemd-320, status = draft, code = 0x1055 */
    public static final Multihash RIPEMD_320 = Multihash.of("ripemd-320", 0x1055, Multicodec.Status.Draft);

    /** Multihash: sha1, status = permanent, code = 0x11 */
    public static final Multihash SHA1 = Multihash.of("sha1", 0x11, Multicodec.Status.Permanent);

    /** Multihash: sha2-224, aka SHA-224; as specified by FIPS 180-4., status = permanent, code = 0x1013 */
    public static final Multihash SHA2_224 = Multihash.of("sha2-224", 0x1013, Multicodec.Status.Permanent);

    /** Multihash: sha2-256, status = permanent, code = 0x12 */
    public static final Multihash SHA2_256 = Multihash.of("sha2-256", 0x12, Multicodec.Status.Permanent);

    /** Multihash: sha2-256-chunked, Hash of concatenated SHA2-256 digests of 8*2^n MiB source chunks; n = ceil(log2(source_size/(10^4 * 8MiB))), status = draft, code = 0xb510 */
    public static final Multihash SHA2_256_CHUNKED = Multihash.of("sha2-256-chunked", 0xb510, Multicodec.Status.Draft);

    /** Multihash: sha2-256-trunc254-padded, SHA2-256 with the two most significant bits from the last byte zeroed (as via a mask with 0b00111111) - used for proving trees as in Filecoin, status = permanent, code = 0x1012 */
    public static final Multihash SHA2_256_TRUNC254_PADDED = Multihash.of("sha2-256-trunc254-padded", 0x1012, Multicodec.Status.Permanent);

    /** Multihash: sha2-384, aka SHA-384; as specified by FIPS 180-4., status = permanent, code = 0x20 */
    public static final Multihash SHA2_384 = Multihash.of("sha2-384", 0x20, Multicodec.Status.Permanent);

    /** Multihash: sha2-512, status = permanent, code = 0x13 */
    public static final Multihash SHA2_512 = Multihash.of("sha2-512", 0x13, Multicodec.Status.Permanent);

    /** Multihash: sha2-512-224, aka SHA-512/224; as specified by FIPS 180-4., status = permanent, code = 0x1014 */
    public static final Multihash SHA2_512_224 = Multihash.of("sha2-512-224", 0x1014, Multicodec.Status.Permanent);

    /** Multihash: sha2-512-256, aka SHA-512/256; as specified by FIPS 180-4., status = permanent, code = 0x1015 */
    public static final Multihash SHA2_512_256 = Multihash.of("sha2-512-256", 0x1015, Multicodec.Status.Permanent);

    /** Multihash: sha3-224, status = permanent, code = 0x17 */
    public static final Multihash SHA3_224 = Multihash.of("sha3-224", 0x17, Multicodec.Status.Permanent);

    /** Multihash: sha3-256, status = permanent, code = 0x16 */
    public static final Multihash SHA3_256 = Multihash.of("sha3-256", 0x16, Multicodec.Status.Permanent);

    /** Multihash: sha3-384, status = permanent, code = 0x15 */
    public static final Multihash SHA3_384 = Multihash.of("sha3-384", 0x15, Multicodec.Status.Permanent);

    /** Multihash: sha3-512, status = permanent, code = 0x14 */
    public static final Multihash SHA3_512 = Multihash.of("sha3-512", 0x14, Multicodec.Status.Permanent);

    /** Multihash: shake-128, status = draft, code = 0x18 */
    public static final Multihash SHAKE_128 = Multihash.of("shake-128", 0x18, Multicodec.Status.Draft);

    /** Multihash: shake-256, status = draft, code = 0x19 */
    public static final Multihash SHAKE_256 = Multihash.of("shake-256", 0x19, Multicodec.Status.Draft);

    /** Multihash: skein1024-1000, status = draft, code = 0xb3dd */
    public static final Multihash SKEIN1024_1000 = Multihash.of("skein1024-1000", 0xb3dd, Multicodec.Status.Draft);

    /** Multihash: skein1024-1008, status = draft, code = 0xb3de */
    public static final Multihash SKEIN1024_1008 = Multihash.of("skein1024-1008", 0xb3de, Multicodec.Status.Draft);

    /** Multihash: skein1024-1016, status = draft, code = 0xb3df */
    public static final Multihash SKEIN1024_1016 = Multihash.of("skein1024-1016", 0xb3df, Multicodec.Status.Draft);

    /** Multihash: skein1024-1024, status = draft, code = 0xb3e0 */
    public static final Multihash SKEIN1024_1024 = Multihash.of("skein1024-1024", 0xb3e0, Multicodec.Status.Draft);

    /** Multihash: skein1024-104, status = draft, code = 0xb36d */
    public static final Multihash SKEIN1024_104 = Multihash.of("skein1024-104", 0xb36d, Multicodec.Status.Draft);

    /** Multihash: skein1024-112, status = draft, code = 0xb36e */
    public static final Multihash SKEIN1024_112 = Multihash.of("skein1024-112", 0xb36e, Multicodec.Status.Draft);

    /** Multihash: skein1024-120, status = draft, code = 0xb36f */
    public static final Multihash SKEIN1024_120 = Multihash.of("skein1024-120", 0xb36f, Multicodec.Status.Draft);

    /** Multihash: skein1024-128, status = draft, code = 0xb370 */
    public static final Multihash SKEIN1024_128 = Multihash.of("skein1024-128", 0xb370, Multicodec.Status.Draft);

    /** Multihash: skein1024-136, status = draft, code = 0xb371 */
    public static final Multihash SKEIN1024_136 = Multihash.of("skein1024-136", 0xb371, Multicodec.Status.Draft);

    /** Multihash: skein1024-144, status = draft, code = 0xb372 */
    public static final Multihash SKEIN1024_144 = Multihash.of("skein1024-144", 0xb372, Multicodec.Status.Draft);

    /** Multihash: skein1024-152, status = draft, code = 0xb373 */
    public static final Multihash SKEIN1024_152 = Multihash.of("skein1024-152", 0xb373, Multicodec.Status.Draft);

    /** Multihash: skein1024-16, status = draft, code = 0xb362 */
    public static final Multihash SKEIN1024_16 = Multihash.of("skein1024-16", 0xb362, Multicodec.Status.Draft);

    /** Multihash: skein1024-160, status = draft, code = 0xb374 */
    public static final Multihash SKEIN1024_160 = Multihash.of("skein1024-160", 0xb374, Multicodec.Status.Draft);

    /** Multihash: skein1024-168, status = draft, code = 0xb375 */
    public static final Multihash SKEIN1024_168 = Multihash.of("skein1024-168", 0xb375, Multicodec.Status.Draft);

    /** Multihash: skein1024-176, status = draft, code = 0xb376 */
    public static final Multihash SKEIN1024_176 = Multihash.of("skein1024-176", 0xb376, Multicodec.Status.Draft);

    /** Multihash: skein1024-184, status = draft, code = 0xb377 */
    public static final Multihash SKEIN1024_184 = Multihash.of("skein1024-184", 0xb377, Multicodec.Status.Draft);

    /** Multihash: skein1024-192, status = draft, code = 0xb378 */
    public static final Multihash SKEIN1024_192 = Multihash.of("skein1024-192", 0xb378, Multicodec.Status.Draft);

    /** Multihash: skein1024-200, status = draft, code = 0xb379 */
    public static final Multihash SKEIN1024_200 = Multihash.of("skein1024-200", 0xb379, Multicodec.Status.Draft);

    /** Multihash: skein1024-208, status = draft, code = 0xb37a */
    public static final Multihash SKEIN1024_208 = Multihash.of("skein1024-208", 0xb37a, Multicodec.Status.Draft);

    /** Multihash: skein1024-216, status = draft, code = 0xb37b */
    public static final Multihash SKEIN1024_216 = Multihash.of("skein1024-216", 0xb37b, Multicodec.Status.Draft);

    /** Multihash: skein1024-224, status = draft, code = 0xb37c */
    public static final Multihash SKEIN1024_224 = Multihash.of("skein1024-224", 0xb37c, Multicodec.Status.Draft);

    /** Multihash: skein1024-232, status = draft, code = 0xb37d */
    public static final Multihash SKEIN1024_232 = Multihash.of("skein1024-232", 0xb37d, Multicodec.Status.Draft);

    /** Multihash: skein1024-24, status = draft, code = 0xb363 */
    public static final Multihash SKEIN1024_24 = Multihash.of("skein1024-24", 0xb363, Multicodec.Status.Draft);

    /** Multihash: skein1024-240, status = draft, code = 0xb37e */
    public static final Multihash SKEIN1024_240 = Multihash.of("skein1024-240", 0xb37e, Multicodec.Status.Draft);

    /** Multihash: skein1024-248, status = draft, code = 0xb37f */
    public static final Multihash SKEIN1024_248 = Multihash.of("skein1024-248", 0xb37f, Multicodec.Status.Draft);

    /** Multihash: skein1024-256, status = draft, code = 0xb380 */
    public static final Multihash SKEIN1024_256 = Multihash.of("skein1024-256", 0xb380, Multicodec.Status.Draft);

    /** Multihash: skein1024-264, status = draft, code = 0xb381 */
    public static final Multihash SKEIN1024_264 = Multihash.of("skein1024-264", 0xb381, Multicodec.Status.Draft);

    /** Multihash: skein1024-272, status = draft, code = 0xb382 */
    public static final Multihash SKEIN1024_272 = Multihash.of("skein1024-272", 0xb382, Multicodec.Status.Draft);

    /** Multihash: skein1024-280, status = draft, code = 0xb383 */
    public static final Multihash SKEIN1024_280 = Multihash.of("skein1024-280", 0xb383, Multicodec.Status.Draft);

    /** Multihash: skein1024-288, status = draft, code = 0xb384 */
    public static final Multihash SKEIN1024_288 = Multihash.of("skein1024-288", 0xb384, Multicodec.Status.Draft);

    /** Multihash: skein1024-296, status = draft, code = 0xb385 */
    public static final Multihash SKEIN1024_296 = Multihash.of("skein1024-296", 0xb385, Multicodec.Status.Draft);

    /** Multihash: skein1024-304, status = draft, code = 0xb386 */
    public static final Multihash SKEIN1024_304 = Multihash.of("skein1024-304", 0xb386, Multicodec.Status.Draft);

    /** Multihash: skein1024-312, status = draft, code = 0xb387 */
    public static final Multihash SKEIN1024_312 = Multihash.of("skein1024-312", 0xb387, Multicodec.Status.Draft);

    /** Multihash: skein1024-32, status = draft, code = 0xb364 */
    public static final Multihash SKEIN1024_32 = Multihash.of("skein1024-32", 0xb364, Multicodec.Status.Draft);

    /** Multihash: skein1024-320, status = draft, code = 0xb388 */
    public static final Multihash SKEIN1024_320 = Multihash.of("skein1024-320", 0xb388, Multicodec.Status.Draft);

    /** Multihash: skein1024-328, status = draft, code = 0xb389 */
    public static final Multihash SKEIN1024_328 = Multihash.of("skein1024-328", 0xb389, Multicodec.Status.Draft);

    /** Multihash: skein1024-336, status = draft, code = 0xb38a */
    public static final Multihash SKEIN1024_336 = Multihash.of("skein1024-336", 0xb38a, Multicodec.Status.Draft);

    /** Multihash: skein1024-344, status = draft, code = 0xb38b */
    public static final Multihash SKEIN1024_344 = Multihash.of("skein1024-344", 0xb38b, Multicodec.Status.Draft);

    /** Multihash: skein1024-352, status = draft, code = 0xb38c */
    public static final Multihash SKEIN1024_352 = Multihash.of("skein1024-352", 0xb38c, Multicodec.Status.Draft);

    /** Multihash: skein1024-360, status = draft, code = 0xb38d */
    public static final Multihash SKEIN1024_360 = Multihash.of("skein1024-360", 0xb38d, Multicodec.Status.Draft);

    /** Multihash: skein1024-368, status = draft, code = 0xb38e */
    public static final Multihash SKEIN1024_368 = Multihash.of("skein1024-368", 0xb38e, Multicodec.Status.Draft);

    /** Multihash: skein1024-376, status = draft, code = 0xb38f */
    public static final Multihash SKEIN1024_376 = Multihash.of("skein1024-376", 0xb38f, Multicodec.Status.Draft);

    /** Multihash: skein1024-384, status = draft, code = 0xb390 */
    public static final Multihash SKEIN1024_384 = Multihash.of("skein1024-384", 0xb390, Multicodec.Status.Draft);

    /** Multihash: skein1024-392, status = draft, code = 0xb391 */
    public static final Multihash SKEIN1024_392 = Multihash.of("skein1024-392", 0xb391, Multicodec.Status.Draft);

    /** Multihash: skein1024-40, status = draft, code = 0xb365 */
    public static final Multihash SKEIN1024_40 = Multihash.of("skein1024-40", 0xb365, Multicodec.Status.Draft);

    /** Multihash: skein1024-400, status = draft, code = 0xb392 */
    public static final Multihash SKEIN1024_400 = Multihash.of("skein1024-400", 0xb392, Multicodec.Status.Draft);

    /** Multihash: skein1024-408, status = draft, code = 0xb393 */
    public static final Multihash SKEIN1024_408 = Multihash.of("skein1024-408", 0xb393, Multicodec.Status.Draft);

    /** Multihash: skein1024-416, status = draft, code = 0xb394 */
    public static final Multihash SKEIN1024_416 = Multihash.of("skein1024-416", 0xb394, Multicodec.Status.Draft);

    /** Multihash: skein1024-424, status = draft, code = 0xb395 */
    public static final Multihash SKEIN1024_424 = Multihash.of("skein1024-424", 0xb395, Multicodec.Status.Draft);

    /** Multihash: skein1024-432, status = draft, code = 0xb396 */
    public static final Multihash SKEIN1024_432 = Multihash.of("skein1024-432", 0xb396, Multicodec.Status.Draft);

    /** Multihash: skein1024-440, status = draft, code = 0xb397 */
    public static final Multihash SKEIN1024_440 = Multihash.of("skein1024-440", 0xb397, Multicodec.Status.Draft);

    /** Multihash: skein1024-448, status = draft, code = 0xb398 */
    public static final Multihash SKEIN1024_448 = Multihash.of("skein1024-448", 0xb398, Multicodec.Status.Draft);

    /** Multihash: skein1024-456, status = draft, code = 0xb399 */
    public static final Multihash SKEIN1024_456 = Multihash.of("skein1024-456", 0xb399, Multicodec.Status.Draft);

    /** Multihash: skein1024-464, status = draft, code = 0xb39a */
    public static final Multihash SKEIN1024_464 = Multihash.of("skein1024-464", 0xb39a, Multicodec.Status.Draft);

    /** Multihash: skein1024-472, status = draft, code = 0xb39b */
    public static final Multihash SKEIN1024_472 = Multihash.of("skein1024-472", 0xb39b, Multicodec.Status.Draft);

    /** Multihash: skein1024-48, status = draft, code = 0xb366 */
    public static final Multihash SKEIN1024_48 = Multihash.of("skein1024-48", 0xb366, Multicodec.Status.Draft);

    /** Multihash: skein1024-480, status = draft, code = 0xb39c */
    public static final Multihash SKEIN1024_480 = Multihash.of("skein1024-480", 0xb39c, Multicodec.Status.Draft);

    /** Multihash: skein1024-488, status = draft, code = 0xb39d */
    public static final Multihash SKEIN1024_488 = Multihash.of("skein1024-488", 0xb39d, Multicodec.Status.Draft);

    /** Multihash: skein1024-496, status = draft, code = 0xb39e */
    public static final Multihash SKEIN1024_496 = Multihash.of("skein1024-496", 0xb39e, Multicodec.Status.Draft);

    /** Multihash: skein1024-504, status = draft, code = 0xb39f */
    public static final Multihash SKEIN1024_504 = Multihash.of("skein1024-504", 0xb39f, Multicodec.Status.Draft);

    /** Multihash: skein1024-512, status = draft, code = 0xb3a0 */
    public static final Multihash SKEIN1024_512 = Multihash.of("skein1024-512", 0xb3a0, Multicodec.Status.Draft);

    /** Multihash: skein1024-520, status = draft, code = 0xb3a1 */
    public static final Multihash SKEIN1024_520 = Multihash.of("skein1024-520", 0xb3a1, Multicodec.Status.Draft);

    /** Multihash: skein1024-528, status = draft, code = 0xb3a2 */
    public static final Multihash SKEIN1024_528 = Multihash.of("skein1024-528", 0xb3a2, Multicodec.Status.Draft);

    /** Multihash: skein1024-536, status = draft, code = 0xb3a3 */
    public static final Multihash SKEIN1024_536 = Multihash.of("skein1024-536", 0xb3a3, Multicodec.Status.Draft);

    /** Multihash: skein1024-544, status = draft, code = 0xb3a4 */
    public static final Multihash SKEIN1024_544 = Multihash.of("skein1024-544", 0xb3a4, Multicodec.Status.Draft);

    /** Multihash: skein1024-552, status = draft, code = 0xb3a5 */
    public static final Multihash SKEIN1024_552 = Multihash.of("skein1024-552", 0xb3a5, Multicodec.Status.Draft);

    /** Multihash: skein1024-56, status = draft, code = 0xb367 */
    public static final Multihash SKEIN1024_56 = Multihash.of("skein1024-56", 0xb367, Multicodec.Status.Draft);

    /** Multihash: skein1024-560, status = draft, code = 0xb3a6 */
    public static final Multihash SKEIN1024_560 = Multihash.of("skein1024-560", 0xb3a6, Multicodec.Status.Draft);

    /** Multihash: skein1024-568, status = draft, code = 0xb3a7 */
    public static final Multihash SKEIN1024_568 = Multihash.of("skein1024-568", 0xb3a7, Multicodec.Status.Draft);

    /** Multihash: skein1024-576, status = draft, code = 0xb3a8 */
    public static final Multihash SKEIN1024_576 = Multihash.of("skein1024-576", 0xb3a8, Multicodec.Status.Draft);

    /** Multihash: skein1024-584, status = draft, code = 0xb3a9 */
    public static final Multihash SKEIN1024_584 = Multihash.of("skein1024-584", 0xb3a9, Multicodec.Status.Draft);

    /** Multihash: skein1024-592, status = draft, code = 0xb3aa */
    public static final Multihash SKEIN1024_592 = Multihash.of("skein1024-592", 0xb3aa, Multicodec.Status.Draft);

    /** Multihash: skein1024-600, status = draft, code = 0xb3ab */
    public static final Multihash SKEIN1024_600 = Multihash.of("skein1024-600", 0xb3ab, Multicodec.Status.Draft);

    /** Multihash: skein1024-608, status = draft, code = 0xb3ac */
    public static final Multihash SKEIN1024_608 = Multihash.of("skein1024-608", 0xb3ac, Multicodec.Status.Draft);

    /** Multihash: skein1024-616, status = draft, code = 0xb3ad */
    public static final Multihash SKEIN1024_616 = Multihash.of("skein1024-616", 0xb3ad, Multicodec.Status.Draft);

    /** Multihash: skein1024-624, status = draft, code = 0xb3ae */
    public static final Multihash SKEIN1024_624 = Multihash.of("skein1024-624", 0xb3ae, Multicodec.Status.Draft);

    /** Multihash: skein1024-632, status = draft, code = 0xb3af */
    public static final Multihash SKEIN1024_632 = Multihash.of("skein1024-632", 0xb3af, Multicodec.Status.Draft);

    /** Multihash: skein1024-64, status = draft, code = 0xb368 */
    public static final Multihash SKEIN1024_64 = Multihash.of("skein1024-64", 0xb368, Multicodec.Status.Draft);

    /** Multihash: skein1024-640, status = draft, code = 0xb3b0 */
    public static final Multihash SKEIN1024_640 = Multihash.of("skein1024-640", 0xb3b0, Multicodec.Status.Draft);

    /** Multihash: skein1024-648, status = draft, code = 0xb3b1 */
    public static final Multihash SKEIN1024_648 = Multihash.of("skein1024-648", 0xb3b1, Multicodec.Status.Draft);

    /** Multihash: skein1024-656, status = draft, code = 0xb3b2 */
    public static final Multihash SKEIN1024_656 = Multihash.of("skein1024-656", 0xb3b2, Multicodec.Status.Draft);

    /** Multihash: skein1024-664, status = draft, code = 0xb3b3 */
    public static final Multihash SKEIN1024_664 = Multihash.of("skein1024-664", 0xb3b3, Multicodec.Status.Draft);

    /** Multihash: skein1024-672, status = draft, code = 0xb3b4 */
    public static final Multihash SKEIN1024_672 = Multihash.of("skein1024-672", 0xb3b4, Multicodec.Status.Draft);

    /** Multihash: skein1024-680, status = draft, code = 0xb3b5 */
    public static final Multihash SKEIN1024_680 = Multihash.of("skein1024-680", 0xb3b5, Multicodec.Status.Draft);

    /** Multihash: skein1024-688, status = draft, code = 0xb3b6 */
    public static final Multihash SKEIN1024_688 = Multihash.of("skein1024-688", 0xb3b6, Multicodec.Status.Draft);

    /** Multihash: skein1024-696, status = draft, code = 0xb3b7 */
    public static final Multihash SKEIN1024_696 = Multihash.of("skein1024-696", 0xb3b7, Multicodec.Status.Draft);

    /** Multihash: skein1024-704, status = draft, code = 0xb3b8 */
    public static final Multihash SKEIN1024_704 = Multihash.of("skein1024-704", 0xb3b8, Multicodec.Status.Draft);

    /** Multihash: skein1024-712, status = draft, code = 0xb3b9 */
    public static final Multihash SKEIN1024_712 = Multihash.of("skein1024-712", 0xb3b9, Multicodec.Status.Draft);

    /** Multihash: skein1024-72, status = draft, code = 0xb369 */
    public static final Multihash SKEIN1024_72 = Multihash.of("skein1024-72", 0xb369, Multicodec.Status.Draft);

    /** Multihash: skein1024-720, status = draft, code = 0xb3ba */
    public static final Multihash SKEIN1024_720 = Multihash.of("skein1024-720", 0xb3ba, Multicodec.Status.Draft);

    /** Multihash: skein1024-728, status = draft, code = 0xb3bb */
    public static final Multihash SKEIN1024_728 = Multihash.of("skein1024-728", 0xb3bb, Multicodec.Status.Draft);

    /** Multihash: skein1024-736, status = draft, code = 0xb3bc */
    public static final Multihash SKEIN1024_736 = Multihash.of("skein1024-736", 0xb3bc, Multicodec.Status.Draft);

    /** Multihash: skein1024-744, status = draft, code = 0xb3bd */
    public static final Multihash SKEIN1024_744 = Multihash.of("skein1024-744", 0xb3bd, Multicodec.Status.Draft);

    /** Multihash: skein1024-752, status = draft, code = 0xb3be */
    public static final Multihash SKEIN1024_752 = Multihash.of("skein1024-752", 0xb3be, Multicodec.Status.Draft);

    /** Multihash: skein1024-760, status = draft, code = 0xb3bf */
    public static final Multihash SKEIN1024_760 = Multihash.of("skein1024-760", 0xb3bf, Multicodec.Status.Draft);

    /** Multihash: skein1024-768, status = draft, code = 0xb3c0 */
    public static final Multihash SKEIN1024_768 = Multihash.of("skein1024-768", 0xb3c0, Multicodec.Status.Draft);

    /** Multihash: skein1024-776, status = draft, code = 0xb3c1 */
    public static final Multihash SKEIN1024_776 = Multihash.of("skein1024-776", 0xb3c1, Multicodec.Status.Draft);

    /** Multihash: skein1024-784, status = draft, code = 0xb3c2 */
    public static final Multihash SKEIN1024_784 = Multihash.of("skein1024-784", 0xb3c2, Multicodec.Status.Draft);

    /** Multihash: skein1024-792, status = draft, code = 0xb3c3 */
    public static final Multihash SKEIN1024_792 = Multihash.of("skein1024-792", 0xb3c3, Multicodec.Status.Draft);

    /** Multihash: skein1024-8, Skein1024 consists of 128 output lengths that give different hashes, status = draft, code = 0xb361 */
    public static final Multihash SKEIN1024_8 = Multihash.of("skein1024-8", 0xb361, Multicodec.Status.Draft);

    /** Multihash: skein1024-80, status = draft, code = 0xb36a */
    public static final Multihash SKEIN1024_80 = Multihash.of("skein1024-80", 0xb36a, Multicodec.Status.Draft);

    /** Multihash: skein1024-800, status = draft, code = 0xb3c4 */
    public static final Multihash SKEIN1024_800 = Multihash.of("skein1024-800", 0xb3c4, Multicodec.Status.Draft);

    /** Multihash: skein1024-808, status = draft, code = 0xb3c5 */
    public static final Multihash SKEIN1024_808 = Multihash.of("skein1024-808", 0xb3c5, Multicodec.Status.Draft);

    /** Multihash: skein1024-816, status = draft, code = 0xb3c6 */
    public static final Multihash SKEIN1024_816 = Multihash.of("skein1024-816", 0xb3c6, Multicodec.Status.Draft);

    /** Multihash: skein1024-824, status = draft, code = 0xb3c7 */
    public static final Multihash SKEIN1024_824 = Multihash.of("skein1024-824", 0xb3c7, Multicodec.Status.Draft);

    /** Multihash: skein1024-832, status = draft, code = 0xb3c8 */
    public static final Multihash SKEIN1024_832 = Multihash.of("skein1024-832", 0xb3c8, Multicodec.Status.Draft);

    /** Multihash: skein1024-840, status = draft, code = 0xb3c9 */
    public static final Multihash SKEIN1024_840 = Multihash.of("skein1024-840", 0xb3c9, Multicodec.Status.Draft);

    /** Multihash: skein1024-848, status = draft, code = 0xb3ca */
    public static final Multihash SKEIN1024_848 = Multihash.of("skein1024-848", 0xb3ca, Multicodec.Status.Draft);

    /** Multihash: skein1024-856, status = draft, code = 0xb3cb */
    public static final Multihash SKEIN1024_856 = Multihash.of("skein1024-856", 0xb3cb, Multicodec.Status.Draft);

    /** Multihash: skein1024-864, status = draft, code = 0xb3cc */
    public static final Multihash SKEIN1024_864 = Multihash.of("skein1024-864", 0xb3cc, Multicodec.Status.Draft);

    /** Multihash: skein1024-872, status = draft, code = 0xb3cd */
    public static final Multihash SKEIN1024_872 = Multihash.of("skein1024-872", 0xb3cd, Multicodec.Status.Draft);

    /** Multihash: skein1024-88, status = draft, code = 0xb36b */
    public static final Multihash SKEIN1024_88 = Multihash.of("skein1024-88", 0xb36b, Multicodec.Status.Draft);

    /** Multihash: skein1024-880, status = draft, code = 0xb3ce */
    public static final Multihash SKEIN1024_880 = Multihash.of("skein1024-880", 0xb3ce, Multicodec.Status.Draft);

    /** Multihash: skein1024-888, status = draft, code = 0xb3cf */
    public static final Multihash SKEIN1024_888 = Multihash.of("skein1024-888", 0xb3cf, Multicodec.Status.Draft);

    /** Multihash: skein1024-896, status = draft, code = 0xb3d0 */
    public static final Multihash SKEIN1024_896 = Multihash.of("skein1024-896", 0xb3d0, Multicodec.Status.Draft);

    /** Multihash: skein1024-904, status = draft, code = 0xb3d1 */
    public static final Multihash SKEIN1024_904 = Multihash.of("skein1024-904", 0xb3d1, Multicodec.Status.Draft);

    /** Multihash: skein1024-912, status = draft, code = 0xb3d2 */
    public static final Multihash SKEIN1024_912 = Multihash.of("skein1024-912", 0xb3d2, Multicodec.Status.Draft);

    /** Multihash: skein1024-920, status = draft, code = 0xb3d3 */
    public static final Multihash SKEIN1024_920 = Multihash.of("skein1024-920", 0xb3d3, Multicodec.Status.Draft);

    /** Multihash: skein1024-928, status = draft, code = 0xb3d4 */
    public static final Multihash SKEIN1024_928 = Multihash.of("skein1024-928", 0xb3d4, Multicodec.Status.Draft);

    /** Multihash: skein1024-936, status = draft, code = 0xb3d5 */
    public static final Multihash SKEIN1024_936 = Multihash.of("skein1024-936", 0xb3d5, Multicodec.Status.Draft);

    /** Multihash: skein1024-944, status = draft, code = 0xb3d6 */
    public static final Multihash SKEIN1024_944 = Multihash.of("skein1024-944", 0xb3d6, Multicodec.Status.Draft);

    /** Multihash: skein1024-952, status = draft, code = 0xb3d7 */
    public static final Multihash SKEIN1024_952 = Multihash.of("skein1024-952", 0xb3d7, Multicodec.Status.Draft);

    /** Multihash: skein1024-96, status = draft, code = 0xb36c */
    public static final Multihash SKEIN1024_96 = Multihash.of("skein1024-96", 0xb36c, Multicodec.Status.Draft);

    /** Multihash: skein1024-960, status = draft, code = 0xb3d8 */
    public static final Multihash SKEIN1024_960 = Multihash.of("skein1024-960", 0xb3d8, Multicodec.Status.Draft);

    /** Multihash: skein1024-968, status = draft, code = 0xb3d9 */
    public static final Multihash SKEIN1024_968 = Multihash.of("skein1024-968", 0xb3d9, Multicodec.Status.Draft);

    /** Multihash: skein1024-976, status = draft, code = 0xb3da */
    public static final Multihash SKEIN1024_976 = Multihash.of("skein1024-976", 0xb3da, Multicodec.Status.Draft);

    /** Multihash: skein1024-984, status = draft, code = 0xb3db */
    public static final Multihash SKEIN1024_984 = Multihash.of("skein1024-984", 0xb3db, Multicodec.Status.Draft);

    /** Multihash: skein1024-992, status = draft, code = 0xb3dc */
    public static final Multihash SKEIN1024_992 = Multihash.of("skein1024-992", 0xb3dc, Multicodec.Status.Draft);

    /** Multihash: skein256-104, status = draft, code = 0xb30d */
    public static final Multihash SKEIN256_104 = Multihash.of("skein256-104", 0xb30d, Multicodec.Status.Draft);

    /** Multihash: skein256-112, status = draft, code = 0xb30e */
    public static final Multihash SKEIN256_112 = Multihash.of("skein256-112", 0xb30e, Multicodec.Status.Draft);

    /** Multihash: skein256-120, status = draft, code = 0xb30f */
    public static final Multihash SKEIN256_120 = Multihash.of("skein256-120", 0xb30f, Multicodec.Status.Draft);

    /** Multihash: skein256-128, status = draft, code = 0xb310 */
    public static final Multihash SKEIN256_128 = Multihash.of("skein256-128", 0xb310, Multicodec.Status.Draft);

    /** Multihash: skein256-136, status = draft, code = 0xb311 */
    public static final Multihash SKEIN256_136 = Multihash.of("skein256-136", 0xb311, Multicodec.Status.Draft);

    /** Multihash: skein256-144, status = draft, code = 0xb312 */
    public static final Multihash SKEIN256_144 = Multihash.of("skein256-144", 0xb312, Multicodec.Status.Draft);

    /** Multihash: skein256-152, status = draft, code = 0xb313 */
    public static final Multihash SKEIN256_152 = Multihash.of("skein256-152", 0xb313, Multicodec.Status.Draft);

    /** Multihash: skein256-16, status = draft, code = 0xb302 */
    public static final Multihash SKEIN256_16 = Multihash.of("skein256-16", 0xb302, Multicodec.Status.Draft);

    /** Multihash: skein256-160, status = draft, code = 0xb314 */
    public static final Multihash SKEIN256_160 = Multihash.of("skein256-160", 0xb314, Multicodec.Status.Draft);

    /** Multihash: skein256-168, status = draft, code = 0xb315 */
    public static final Multihash SKEIN256_168 = Multihash.of("skein256-168", 0xb315, Multicodec.Status.Draft);

    /** Multihash: skein256-176, status = draft, code = 0xb316 */
    public static final Multihash SKEIN256_176 = Multihash.of("skein256-176", 0xb316, Multicodec.Status.Draft);

    /** Multihash: skein256-184, status = draft, code = 0xb317 */
    public static final Multihash SKEIN256_184 = Multihash.of("skein256-184", 0xb317, Multicodec.Status.Draft);

    /** Multihash: skein256-192, status = draft, code = 0xb318 */
    public static final Multihash SKEIN256_192 = Multihash.of("skein256-192", 0xb318, Multicodec.Status.Draft);

    /** Multihash: skein256-200, status = draft, code = 0xb319 */
    public static final Multihash SKEIN256_200 = Multihash.of("skein256-200", 0xb319, Multicodec.Status.Draft);

    /** Multihash: skein256-208, status = draft, code = 0xb31a */
    public static final Multihash SKEIN256_208 = Multihash.of("skein256-208", 0xb31a, Multicodec.Status.Draft);

    /** Multihash: skein256-216, status = draft, code = 0xb31b */
    public static final Multihash SKEIN256_216 = Multihash.of("skein256-216", 0xb31b, Multicodec.Status.Draft);

    /** Multihash: skein256-224, status = draft, code = 0xb31c */
    public static final Multihash SKEIN256_224 = Multihash.of("skein256-224", 0xb31c, Multicodec.Status.Draft);

    /** Multihash: skein256-232, status = draft, code = 0xb31d */
    public static final Multihash SKEIN256_232 = Multihash.of("skein256-232", 0xb31d, Multicodec.Status.Draft);

    /** Multihash: skein256-24, status = draft, code = 0xb303 */
    public static final Multihash SKEIN256_24 = Multihash.of("skein256-24", 0xb303, Multicodec.Status.Draft);

    /** Multihash: skein256-240, status = draft, code = 0xb31e */
    public static final Multihash SKEIN256_240 = Multihash.of("skein256-240", 0xb31e, Multicodec.Status.Draft);

    /** Multihash: skein256-248, status = draft, code = 0xb31f */
    public static final Multihash SKEIN256_248 = Multihash.of("skein256-248", 0xb31f, Multicodec.Status.Draft);

    /** Multihash: skein256-256, status = draft, code = 0xb320 */
    public static final Multihash SKEIN256_256 = Multihash.of("skein256-256", 0xb320, Multicodec.Status.Draft);

    /** Multihash: skein256-32, status = draft, code = 0xb304 */
    public static final Multihash SKEIN256_32 = Multihash.of("skein256-32", 0xb304, Multicodec.Status.Draft);

    /** Multihash: skein256-40, status = draft, code = 0xb305 */
    public static final Multihash SKEIN256_40 = Multihash.of("skein256-40", 0xb305, Multicodec.Status.Draft);

    /** Multihash: skein256-48, status = draft, code = 0xb306 */
    public static final Multihash SKEIN256_48 = Multihash.of("skein256-48", 0xb306, Multicodec.Status.Draft);

    /** Multihash: skein256-56, status = draft, code = 0xb307 */
    public static final Multihash SKEIN256_56 = Multihash.of("skein256-56", 0xb307, Multicodec.Status.Draft);

    /** Multihash: skein256-64, status = draft, code = 0xb308 */
    public static final Multihash SKEIN256_64 = Multihash.of("skein256-64", 0xb308, Multicodec.Status.Draft);

    /** Multihash: skein256-72, status = draft, code = 0xb309 */
    public static final Multihash SKEIN256_72 = Multihash.of("skein256-72", 0xb309, Multicodec.Status.Draft);

    /** Multihash: skein256-8, Skein256 consists of 32 output lengths that give different hashes, status = draft, code = 0xb301 */
    public static final Multihash SKEIN256_8 = Multihash.of("skein256-8", 0xb301, Multicodec.Status.Draft);

    /** Multihash: skein256-80, status = draft, code = 0xb30a */
    public static final Multihash SKEIN256_80 = Multihash.of("skein256-80", 0xb30a, Multicodec.Status.Draft);

    /** Multihash: skein256-88, status = draft, code = 0xb30b */
    public static final Multihash SKEIN256_88 = Multihash.of("skein256-88", 0xb30b, Multicodec.Status.Draft);

    /** Multihash: skein256-96, status = draft, code = 0xb30c */
    public static final Multihash SKEIN256_96 = Multihash.of("skein256-96", 0xb30c, Multicodec.Status.Draft);

    /** Multihash: skein512-104, status = draft, code = 0xb32d */
    public static final Multihash SKEIN512_104 = Multihash.of("skein512-104", 0xb32d, Multicodec.Status.Draft);

    /** Multihash: skein512-112, status = draft, code = 0xb32e */
    public static final Multihash SKEIN512_112 = Multihash.of("skein512-112", 0xb32e, Multicodec.Status.Draft);

    /** Multihash: skein512-120, status = draft, code = 0xb32f */
    public static final Multihash SKEIN512_120 = Multihash.of("skein512-120", 0xb32f, Multicodec.Status.Draft);

    /** Multihash: skein512-128, status = draft, code = 0xb330 */
    public static final Multihash SKEIN512_128 = Multihash.of("skein512-128", 0xb330, Multicodec.Status.Draft);

    /** Multihash: skein512-136, status = draft, code = 0xb331 */
    public static final Multihash SKEIN512_136 = Multihash.of("skein512-136", 0xb331, Multicodec.Status.Draft);

    /** Multihash: skein512-144, status = draft, code = 0xb332 */
    public static final Multihash SKEIN512_144 = Multihash.of("skein512-144", 0xb332, Multicodec.Status.Draft);

    /** Multihash: skein512-152, status = draft, code = 0xb333 */
    public static final Multihash SKEIN512_152 = Multihash.of("skein512-152", 0xb333, Multicodec.Status.Draft);

    /** Multihash: skein512-16, status = draft, code = 0xb322 */
    public static final Multihash SKEIN512_16 = Multihash.of("skein512-16", 0xb322, Multicodec.Status.Draft);

    /** Multihash: skein512-160, status = draft, code = 0xb334 */
    public static final Multihash SKEIN512_160 = Multihash.of("skein512-160", 0xb334, Multicodec.Status.Draft);

    /** Multihash: skein512-168, status = draft, code = 0xb335 */
    public static final Multihash SKEIN512_168 = Multihash.of("skein512-168", 0xb335, Multicodec.Status.Draft);

    /** Multihash: skein512-176, status = draft, code = 0xb336 */
    public static final Multihash SKEIN512_176 = Multihash.of("skein512-176", 0xb336, Multicodec.Status.Draft);

    /** Multihash: skein512-184, status = draft, code = 0xb337 */
    public static final Multihash SKEIN512_184 = Multihash.of("skein512-184", 0xb337, Multicodec.Status.Draft);

    /** Multihash: skein512-192, status = draft, code = 0xb338 */
    public static final Multihash SKEIN512_192 = Multihash.of("skein512-192", 0xb338, Multicodec.Status.Draft);

    /** Multihash: skein512-200, status = draft, code = 0xb339 */
    public static final Multihash SKEIN512_200 = Multihash.of("skein512-200", 0xb339, Multicodec.Status.Draft);

    /** Multihash: skein512-208, status = draft, code = 0xb33a */
    public static final Multihash SKEIN512_208 = Multihash.of("skein512-208", 0xb33a, Multicodec.Status.Draft);

    /** Multihash: skein512-216, status = draft, code = 0xb33b */
    public static final Multihash SKEIN512_216 = Multihash.of("skein512-216", 0xb33b, Multicodec.Status.Draft);

    /** Multihash: skein512-224, status = draft, code = 0xb33c */
    public static final Multihash SKEIN512_224 = Multihash.of("skein512-224", 0xb33c, Multicodec.Status.Draft);

    /** Multihash: skein512-232, status = draft, code = 0xb33d */
    public static final Multihash SKEIN512_232 = Multihash.of("skein512-232", 0xb33d, Multicodec.Status.Draft);

    /** Multihash: skein512-24, status = draft, code = 0xb323 */
    public static final Multihash SKEIN512_24 = Multihash.of("skein512-24", 0xb323, Multicodec.Status.Draft);

    /** Multihash: skein512-240, status = draft, code = 0xb33e */
    public static final Multihash SKEIN512_240 = Multihash.of("skein512-240", 0xb33e, Multicodec.Status.Draft);

    /** Multihash: skein512-248, status = draft, code = 0xb33f */
    public static final Multihash SKEIN512_248 = Multihash.of("skein512-248", 0xb33f, Multicodec.Status.Draft);

    /** Multihash: skein512-256, status = draft, code = 0xb340 */
    public static final Multihash SKEIN512_256 = Multihash.of("skein512-256", 0xb340, Multicodec.Status.Draft);

    /** Multihash: skein512-264, status = draft, code = 0xb341 */
    public static final Multihash SKEIN512_264 = Multihash.of("skein512-264", 0xb341, Multicodec.Status.Draft);

    /** Multihash: skein512-272, status = draft, code = 0xb342 */
    public static final Multihash SKEIN512_272 = Multihash.of("skein512-272", 0xb342, Multicodec.Status.Draft);

    /** Multihash: skein512-280, status = draft, code = 0xb343 */
    public static final Multihash SKEIN512_280 = Multihash.of("skein512-280", 0xb343, Multicodec.Status.Draft);

    /** Multihash: skein512-288, status = draft, code = 0xb344 */
    public static final Multihash SKEIN512_288 = Multihash.of("skein512-288", 0xb344, Multicodec.Status.Draft);

    /** Multihash: skein512-296, status = draft, code = 0xb345 */
    public static final Multihash SKEIN512_296 = Multihash.of("skein512-296", 0xb345, Multicodec.Status.Draft);

    /** Multihash: skein512-304, status = draft, code = 0xb346 */
    public static final Multihash SKEIN512_304 = Multihash.of("skein512-304", 0xb346, Multicodec.Status.Draft);

    /** Multihash: skein512-312, status = draft, code = 0xb347 */
    public static final Multihash SKEIN512_312 = Multihash.of("skein512-312", 0xb347, Multicodec.Status.Draft);

    /** Multihash: skein512-32, status = draft, code = 0xb324 */
    public static final Multihash SKEIN512_32 = Multihash.of("skein512-32", 0xb324, Multicodec.Status.Draft);

    /** Multihash: skein512-320, status = draft, code = 0xb348 */
    public static final Multihash SKEIN512_320 = Multihash.of("skein512-320", 0xb348, Multicodec.Status.Draft);

    /** Multihash: skein512-328, status = draft, code = 0xb349 */
    public static final Multihash SKEIN512_328 = Multihash.of("skein512-328", 0xb349, Multicodec.Status.Draft);

    /** Multihash: skein512-336, status = draft, code = 0xb34a */
    public static final Multihash SKEIN512_336 = Multihash.of("skein512-336", 0xb34a, Multicodec.Status.Draft);

    /** Multihash: skein512-344, status = draft, code = 0xb34b */
    public static final Multihash SKEIN512_344 = Multihash.of("skein512-344", 0xb34b, Multicodec.Status.Draft);

    /** Multihash: skein512-352, status = draft, code = 0xb34c */
    public static final Multihash SKEIN512_352 = Multihash.of("skein512-352", 0xb34c, Multicodec.Status.Draft);

    /** Multihash: skein512-360, status = draft, code = 0xb34d */
    public static final Multihash SKEIN512_360 = Multihash.of("skein512-360", 0xb34d, Multicodec.Status.Draft);

    /** Multihash: skein512-368, status = draft, code = 0xb34e */
    public static final Multihash SKEIN512_368 = Multihash.of("skein512-368", 0xb34e, Multicodec.Status.Draft);

    /** Multihash: skein512-376, status = draft, code = 0xb34f */
    public static final Multihash SKEIN512_376 = Multihash.of("skein512-376", 0xb34f, Multicodec.Status.Draft);

    /** Multihash: skein512-384, status = draft, code = 0xb350 */
    public static final Multihash SKEIN512_384 = Multihash.of("skein512-384", 0xb350, Multicodec.Status.Draft);

    /** Multihash: skein512-392, status = draft, code = 0xb351 */
    public static final Multihash SKEIN512_392 = Multihash.of("skein512-392", 0xb351, Multicodec.Status.Draft);

    /** Multihash: skein512-40, status = draft, code = 0xb325 */
    public static final Multihash SKEIN512_40 = Multihash.of("skein512-40", 0xb325, Multicodec.Status.Draft);

    /** Multihash: skein512-400, status = draft, code = 0xb352 */
    public static final Multihash SKEIN512_400 = Multihash.of("skein512-400", 0xb352, Multicodec.Status.Draft);

    /** Multihash: skein512-408, status = draft, code = 0xb353 */
    public static final Multihash SKEIN512_408 = Multihash.of("skein512-408", 0xb353, Multicodec.Status.Draft);

    /** Multihash: skein512-416, status = draft, code = 0xb354 */
    public static final Multihash SKEIN512_416 = Multihash.of("skein512-416", 0xb354, Multicodec.Status.Draft);

    /** Multihash: skein512-424, status = draft, code = 0xb355 */
    public static final Multihash SKEIN512_424 = Multihash.of("skein512-424", 0xb355, Multicodec.Status.Draft);

    /** Multihash: skein512-432, status = draft, code = 0xb356 */
    public static final Multihash SKEIN512_432 = Multihash.of("skein512-432", 0xb356, Multicodec.Status.Draft);

    /** Multihash: skein512-440, status = draft, code = 0xb357 */
    public static final Multihash SKEIN512_440 = Multihash.of("skein512-440", 0xb357, Multicodec.Status.Draft);

    /** Multihash: skein512-448, status = draft, code = 0xb358 */
    public static final Multihash SKEIN512_448 = Multihash.of("skein512-448", 0xb358, Multicodec.Status.Draft);

    /** Multihash: skein512-456, status = draft, code = 0xb359 */
    public static final Multihash SKEIN512_456 = Multihash.of("skein512-456", 0xb359, Multicodec.Status.Draft);

    /** Multihash: skein512-464, status = draft, code = 0xb35a */
    public static final Multihash SKEIN512_464 = Multihash.of("skein512-464", 0xb35a, Multicodec.Status.Draft);

    /** Multihash: skein512-472, status = draft, code = 0xb35b */
    public static final Multihash SKEIN512_472 = Multihash.of("skein512-472", 0xb35b, Multicodec.Status.Draft);

    /** Multihash: skein512-48, status = draft, code = 0xb326 */
    public static final Multihash SKEIN512_48 = Multihash.of("skein512-48", 0xb326, Multicodec.Status.Draft);

    /** Multihash: skein512-480, status = draft, code = 0xb35c */
    public static final Multihash SKEIN512_480 = Multihash.of("skein512-480", 0xb35c, Multicodec.Status.Draft);

    /** Multihash: skein512-488, status = draft, code = 0xb35d */
    public static final Multihash SKEIN512_488 = Multihash.of("skein512-488", 0xb35d, Multicodec.Status.Draft);

    /** Multihash: skein512-496, status = draft, code = 0xb35e */
    public static final Multihash SKEIN512_496 = Multihash.of("skein512-496", 0xb35e, Multicodec.Status.Draft);

    /** Multihash: skein512-504, status = draft, code = 0xb35f */
    public static final Multihash SKEIN512_504 = Multihash.of("skein512-504", 0xb35f, Multicodec.Status.Draft);

    /** Multihash: skein512-512, status = draft, code = 0xb360 */
    public static final Multihash SKEIN512_512 = Multihash.of("skein512-512", 0xb360, Multicodec.Status.Draft);

    /** Multihash: skein512-56, status = draft, code = 0xb327 */
    public static final Multihash SKEIN512_56 = Multihash.of("skein512-56", 0xb327, Multicodec.Status.Draft);

    /** Multihash: skein512-64, status = draft, code = 0xb328 */
    public static final Multihash SKEIN512_64 = Multihash.of("skein512-64", 0xb328, Multicodec.Status.Draft);

    /** Multihash: skein512-72, status = draft, code = 0xb329 */
    public static final Multihash SKEIN512_72 = Multihash.of("skein512-72", 0xb329, Multicodec.Status.Draft);

    /** Multihash: skein512-8, Skein512 consists of 64 output lengths that give different hashes, status = draft, code = 0xb321 */
    public static final Multihash SKEIN512_8 = Multihash.of("skein512-8", 0xb321, Multicodec.Status.Draft);

    /** Multihash: skein512-80, status = draft, code = 0xb32a */
    public static final Multihash SKEIN512_80 = Multihash.of("skein512-80", 0xb32a, Multicodec.Status.Draft);

    /** Multihash: skein512-88, status = draft, code = 0xb32b */
    public static final Multihash SKEIN512_88 = Multihash.of("skein512-88", 0xb32b, Multicodec.Status.Draft);

    /** Multihash: skein512-96, status = draft, code = 0xb32c */
    public static final Multihash SKEIN512_96 = Multihash.of("skein512-96", 0xb32c, Multicodec.Status.Draft);

    /** Multihash: sm3-256, status = draft, code = 0x534d */
    public static final Multihash SM3_256 = Multihash.of("sm3-256", 0x534d, Multicodec.Status.Draft);

    /** Multihash: ssz-sha2-256-bmt, SSZ Merkle tree root using SHA2-256 as the hashing function and SSZ serialization for the block binary, status = draft, code = 0xb502 */
    public static final Multihash SSZ_SHA2_256_BMT = Multihash.of("ssz-sha2-256-bmt", 0xb502, Multicodec.Status.Draft);

    /** Multihash: x11, status = draft, code = 0x1100 */
    public static final Multihash X11 = Multihash.of("x11", 0x1100, Multicodec.Status.Draft);

    protected static final Map<Long,Multicodec> ALL = new TreeMap<>();

    static {
      ALL.put(BCRYPT_PBKDF.code(), BCRYPT_PBKDF);
      ALL.put(BITTORRENT_PIECES_ROOT.code(), BITTORRENT_PIECES_ROOT);
      ALL.put(BLAKE2B_104.code(), BLAKE2B_104);
      ALL.put(BLAKE2B_112.code(), BLAKE2B_112);
      ALL.put(BLAKE2B_120.code(), BLAKE2B_120);
      ALL.put(BLAKE2B_128.code(), BLAKE2B_128);
      ALL.put(BLAKE2B_136.code(), BLAKE2B_136);
      ALL.put(BLAKE2B_144.code(), BLAKE2B_144);
      ALL.put(BLAKE2B_152.code(), BLAKE2B_152);
      ALL.put(BLAKE2B_16.code(), BLAKE2B_16);
      ALL.put(BLAKE2B_160.code(), BLAKE2B_160);
      ALL.put(BLAKE2B_168.code(), BLAKE2B_168);
      ALL.put(BLAKE2B_176.code(), BLAKE2B_176);
      ALL.put(BLAKE2B_184.code(), BLAKE2B_184);
      ALL.put(BLAKE2B_192.code(), BLAKE2B_192);
      ALL.put(BLAKE2B_200.code(), BLAKE2B_200);
      ALL.put(BLAKE2B_208.code(), BLAKE2B_208);
      ALL.put(BLAKE2B_216.code(), BLAKE2B_216);
      ALL.put(BLAKE2B_224.code(), BLAKE2B_224);
      ALL.put(BLAKE2B_232.code(), BLAKE2B_232);
      ALL.put(BLAKE2B_24.code(), BLAKE2B_24);
      ALL.put(BLAKE2B_240.code(), BLAKE2B_240);
      ALL.put(BLAKE2B_248.code(), BLAKE2B_248);
      ALL.put(BLAKE2B_256.code(), BLAKE2B_256);
      ALL.put(BLAKE2B_264.code(), BLAKE2B_264);
      ALL.put(BLAKE2B_272.code(), BLAKE2B_272);
      ALL.put(BLAKE2B_280.code(), BLAKE2B_280);
      ALL.put(BLAKE2B_288.code(), BLAKE2B_288);
      ALL.put(BLAKE2B_296.code(), BLAKE2B_296);
      ALL.put(BLAKE2B_304.code(), BLAKE2B_304);
      ALL.put(BLAKE2B_312.code(), BLAKE2B_312);
      ALL.put(BLAKE2B_32.code(), BLAKE2B_32);
      ALL.put(BLAKE2B_320.code(), BLAKE2B_320);
      ALL.put(BLAKE2B_328.code(), BLAKE2B_328);
      ALL.put(BLAKE2B_336.code(), BLAKE2B_336);
      ALL.put(BLAKE2B_344.code(), BLAKE2B_344);
      ALL.put(BLAKE2B_352.code(), BLAKE2B_352);
      ALL.put(BLAKE2B_360.code(), BLAKE2B_360);
      ALL.put(BLAKE2B_368.code(), BLAKE2B_368);
      ALL.put(BLAKE2B_376.code(), BLAKE2B_376);
      ALL.put(BLAKE2B_384.code(), BLAKE2B_384);
      ALL.put(BLAKE2B_392.code(), BLAKE2B_392);
      ALL.put(BLAKE2B_40.code(), BLAKE2B_40);
      ALL.put(BLAKE2B_400.code(), BLAKE2B_400);
      ALL.put(BLAKE2B_408.code(), BLAKE2B_408);
      ALL.put(BLAKE2B_416.code(), BLAKE2B_416);
      ALL.put(BLAKE2B_424.code(), BLAKE2B_424);
      ALL.put(BLAKE2B_432.code(), BLAKE2B_432);
      ALL.put(BLAKE2B_440.code(), BLAKE2B_440);
      ALL.put(BLAKE2B_448.code(), BLAKE2B_448);
      ALL.put(BLAKE2B_456.code(), BLAKE2B_456);
      ALL.put(BLAKE2B_464.code(), BLAKE2B_464);
      ALL.put(BLAKE2B_472.code(), BLAKE2B_472);
      ALL.put(BLAKE2B_48.code(), BLAKE2B_48);
      ALL.put(BLAKE2B_480.code(), BLAKE2B_480);
      ALL.put(BLAKE2B_488.code(), BLAKE2B_488);
      ALL.put(BLAKE2B_496.code(), BLAKE2B_496);
      ALL.put(BLAKE2B_504.code(), BLAKE2B_504);
      ALL.put(BLAKE2B_512.code(), BLAKE2B_512);
      ALL.put(BLAKE2B_56.code(), BLAKE2B_56);
      ALL.put(BLAKE2B_64.code(), BLAKE2B_64);
      ALL.put(BLAKE2B_72.code(), BLAKE2B_72);
      ALL.put(BLAKE2B_8.code(), BLAKE2B_8);
      ALL.put(BLAKE2B_80.code(), BLAKE2B_80);
      ALL.put(BLAKE2B_88.code(), BLAKE2B_88);
      ALL.put(BLAKE2B_96.code(), BLAKE2B_96);
      ALL.put(BLAKE2S_104.code(), BLAKE2S_104);
      ALL.put(BLAKE2S_112.code(), BLAKE2S_112);
      ALL.put(BLAKE2S_120.code(), BLAKE2S_120);
      ALL.put(BLAKE2S_128.code(), BLAKE2S_128);
      ALL.put(BLAKE2S_136.code(), BLAKE2S_136);
      ALL.put(BLAKE2S_144.code(), BLAKE2S_144);
      ALL.put(BLAKE2S_152.code(), BLAKE2S_152);
      ALL.put(BLAKE2S_16.code(), BLAKE2S_16);
      ALL.put(BLAKE2S_160.code(), BLAKE2S_160);
      ALL.put(BLAKE2S_168.code(), BLAKE2S_168);
      ALL.put(BLAKE2S_176.code(), BLAKE2S_176);
      ALL.put(BLAKE2S_184.code(), BLAKE2S_184);
      ALL.put(BLAKE2S_192.code(), BLAKE2S_192);
      ALL.put(BLAKE2S_200.code(), BLAKE2S_200);
      ALL.put(BLAKE2S_208.code(), BLAKE2S_208);
      ALL.put(BLAKE2S_216.code(), BLAKE2S_216);
      ALL.put(BLAKE2S_224.code(), BLAKE2S_224);
      ALL.put(BLAKE2S_232.code(), BLAKE2S_232);
      ALL.put(BLAKE2S_24.code(), BLAKE2S_24);
      ALL.put(BLAKE2S_240.code(), BLAKE2S_240);
      ALL.put(BLAKE2S_248.code(), BLAKE2S_248);
      ALL.put(BLAKE2S_256.code(), BLAKE2S_256);
      ALL.put(BLAKE2S_32.code(), BLAKE2S_32);
      ALL.put(BLAKE2S_40.code(), BLAKE2S_40);
      ALL.put(BLAKE2S_48.code(), BLAKE2S_48);
      ALL.put(BLAKE2S_56.code(), BLAKE2S_56);
      ALL.put(BLAKE2S_64.code(), BLAKE2S_64);
      ALL.put(BLAKE2S_72.code(), BLAKE2S_72);
      ALL.put(BLAKE2S_8.code(), BLAKE2S_8);
      ALL.put(BLAKE2S_80.code(), BLAKE2S_80);
      ALL.put(BLAKE2S_88.code(), BLAKE2S_88);
      ALL.put(BLAKE2S_96.code(), BLAKE2S_96);
      ALL.put(BLAKE3.code(), BLAKE3);
      ALL.put(DBL_SHA2_256.code(), DBL_SHA2_256);
      ALL.put(ED2K.code(), ED2K);
      ALL.put(FR32_SHA256_TRUNC254_PADBINTREE.code(), FR32_SHA256_TRUNC254_PADBINTREE);
      ALL.put(IDENTITY.code(), IDENTITY);
      ALL.put(KANGAROOTWELVE.code(), KANGAROOTWELVE);
      ALL.put(KECCAK_224.code(), KECCAK_224);
      ALL.put(KECCAK_256.code(), KECCAK_256);
      ALL.put(KECCAK_384.code(), KECCAK_384);
      ALL.put(KECCAK_512.code(), KECCAK_512);
      ALL.put(MD4.code(), MD4);
      ALL.put(MD5.code(), MD5);
      ALL.put(POSEIDON_BLS12_381_A2_FC1.code(), POSEIDON_BLS12_381_A2_FC1);
      ALL.put(POSEIDON_BLS12_381_A2_FC1_SC.code(), POSEIDON_BLS12_381_A2_FC1_SC);
      ALL.put(RIPEMD_128.code(), RIPEMD_128);
      ALL.put(RIPEMD_160.code(), RIPEMD_160);
      ALL.put(RIPEMD_256.code(), RIPEMD_256);
      ALL.put(RIPEMD_320.code(), RIPEMD_320);
      ALL.put(SHA1.code(), SHA1);
      ALL.put(SHA2_224.code(), SHA2_224);
      ALL.put(SHA2_256.code(), SHA2_256);
      ALL.put(SHA2_256_CHUNKED.code(), SHA2_256_CHUNKED);
      ALL.put(SHA2_256_TRUNC254_PADDED.code(), SHA2_256_TRUNC254_PADDED);
      ALL.put(SHA2_384.code(), SHA2_384);
      ALL.put(SHA2_512.code(), SHA2_512);
      ALL.put(SHA2_512_224.code(), SHA2_512_224);
      ALL.put(SHA2_512_256.code(), SHA2_512_256);
      ALL.put(SHA3_224.code(), SHA3_224);
      ALL.put(SHA3_256.code(), SHA3_256);
      ALL.put(SHA3_384.code(), SHA3_384);
      ALL.put(SHA3_512.code(), SHA3_512);
      ALL.put(SHAKE_128.code(), SHAKE_128);
      ALL.put(SHAKE_256.code(), SHAKE_256);
      ALL.put(SKEIN1024_1000.code(), SKEIN1024_1000);
      ALL.put(SKEIN1024_1008.code(), SKEIN1024_1008);
      ALL.put(SKEIN1024_1016.code(), SKEIN1024_1016);
      ALL.put(SKEIN1024_1024.code(), SKEIN1024_1024);
      ALL.put(SKEIN1024_104.code(), SKEIN1024_104);
      ALL.put(SKEIN1024_112.code(), SKEIN1024_112);
      ALL.put(SKEIN1024_120.code(), SKEIN1024_120);
      ALL.put(SKEIN1024_128.code(), SKEIN1024_128);
      ALL.put(SKEIN1024_136.code(), SKEIN1024_136);
      ALL.put(SKEIN1024_144.code(), SKEIN1024_144);
      ALL.put(SKEIN1024_152.code(), SKEIN1024_152);
      ALL.put(SKEIN1024_16.code(), SKEIN1024_16);
      ALL.put(SKEIN1024_160.code(), SKEIN1024_160);
      ALL.put(SKEIN1024_168.code(), SKEIN1024_168);
      ALL.put(SKEIN1024_176.code(), SKEIN1024_176);
      ALL.put(SKEIN1024_184.code(), SKEIN1024_184);
      ALL.put(SKEIN1024_192.code(), SKEIN1024_192);
      ALL.put(SKEIN1024_200.code(), SKEIN1024_200);
      ALL.put(SKEIN1024_208.code(), SKEIN1024_208);
      ALL.put(SKEIN1024_216.code(), SKEIN1024_216);
      ALL.put(SKEIN1024_224.code(), SKEIN1024_224);
      ALL.put(SKEIN1024_232.code(), SKEIN1024_232);
      ALL.put(SKEIN1024_24.code(), SKEIN1024_24);
      ALL.put(SKEIN1024_240.code(), SKEIN1024_240);
      ALL.put(SKEIN1024_248.code(), SKEIN1024_248);
      ALL.put(SKEIN1024_256.code(), SKEIN1024_256);
      ALL.put(SKEIN1024_264.code(), SKEIN1024_264);
      ALL.put(SKEIN1024_272.code(), SKEIN1024_272);
      ALL.put(SKEIN1024_280.code(), SKEIN1024_280);
      ALL.put(SKEIN1024_288.code(), SKEIN1024_288);
      ALL.put(SKEIN1024_296.code(), SKEIN1024_296);
      ALL.put(SKEIN1024_304.code(), SKEIN1024_304);
      ALL.put(SKEIN1024_312.code(), SKEIN1024_312);
      ALL.put(SKEIN1024_32.code(), SKEIN1024_32);
      ALL.put(SKEIN1024_320.code(), SKEIN1024_320);
      ALL.put(SKEIN1024_328.code(), SKEIN1024_328);
      ALL.put(SKEIN1024_336.code(), SKEIN1024_336);
      ALL.put(SKEIN1024_344.code(), SKEIN1024_344);
      ALL.put(SKEIN1024_352.code(), SKEIN1024_352);
      ALL.put(SKEIN1024_360.code(), SKEIN1024_360);
      ALL.put(SKEIN1024_368.code(), SKEIN1024_368);
      ALL.put(SKEIN1024_376.code(), SKEIN1024_376);
      ALL.put(SKEIN1024_384.code(), SKEIN1024_384);
      ALL.put(SKEIN1024_392.code(), SKEIN1024_392);
      ALL.put(SKEIN1024_40.code(), SKEIN1024_40);
      ALL.put(SKEIN1024_400.code(), SKEIN1024_400);
      ALL.put(SKEIN1024_408.code(), SKEIN1024_408);
      ALL.put(SKEIN1024_416.code(), SKEIN1024_416);
      ALL.put(SKEIN1024_424.code(), SKEIN1024_424);
      ALL.put(SKEIN1024_432.code(), SKEIN1024_432);
      ALL.put(SKEIN1024_440.code(), SKEIN1024_440);
      ALL.put(SKEIN1024_448.code(), SKEIN1024_448);
      ALL.put(SKEIN1024_456.code(), SKEIN1024_456);
      ALL.put(SKEIN1024_464.code(), SKEIN1024_464);
      ALL.put(SKEIN1024_472.code(), SKEIN1024_472);
      ALL.put(SKEIN1024_48.code(), SKEIN1024_48);
      ALL.put(SKEIN1024_480.code(), SKEIN1024_480);
      ALL.put(SKEIN1024_488.code(), SKEIN1024_488);
      ALL.put(SKEIN1024_496.code(), SKEIN1024_496);
      ALL.put(SKEIN1024_504.code(), SKEIN1024_504);
      ALL.put(SKEIN1024_512.code(), SKEIN1024_512);
      ALL.put(SKEIN1024_520.code(), SKEIN1024_520);
      ALL.put(SKEIN1024_528.code(), SKEIN1024_528);
      ALL.put(SKEIN1024_536.code(), SKEIN1024_536);
      ALL.put(SKEIN1024_544.code(), SKEIN1024_544);
      ALL.put(SKEIN1024_552.code(), SKEIN1024_552);
      ALL.put(SKEIN1024_56.code(), SKEIN1024_56);
      ALL.put(SKEIN1024_560.code(), SKEIN1024_560);
      ALL.put(SKEIN1024_568.code(), SKEIN1024_568);
      ALL.put(SKEIN1024_576.code(), SKEIN1024_576);
      ALL.put(SKEIN1024_584.code(), SKEIN1024_584);
      ALL.put(SKEIN1024_592.code(), SKEIN1024_592);
      ALL.put(SKEIN1024_600.code(), SKEIN1024_600);
      ALL.put(SKEIN1024_608.code(), SKEIN1024_608);
      ALL.put(SKEIN1024_616.code(), SKEIN1024_616);
      ALL.put(SKEIN1024_624.code(), SKEIN1024_624);
      ALL.put(SKEIN1024_632.code(), SKEIN1024_632);
      ALL.put(SKEIN1024_64.code(), SKEIN1024_64);
      ALL.put(SKEIN1024_640.code(), SKEIN1024_640);
      ALL.put(SKEIN1024_648.code(), SKEIN1024_648);
      ALL.put(SKEIN1024_656.code(), SKEIN1024_656);
      ALL.put(SKEIN1024_664.code(), SKEIN1024_664);
      ALL.put(SKEIN1024_672.code(), SKEIN1024_672);
      ALL.put(SKEIN1024_680.code(), SKEIN1024_680);
      ALL.put(SKEIN1024_688.code(), SKEIN1024_688);
      ALL.put(SKEIN1024_696.code(), SKEIN1024_696);
      ALL.put(SKEIN1024_704.code(), SKEIN1024_704);
      ALL.put(SKEIN1024_712.code(), SKEIN1024_712);
      ALL.put(SKEIN1024_72.code(), SKEIN1024_72);
      ALL.put(SKEIN1024_720.code(), SKEIN1024_720);
      ALL.put(SKEIN1024_728.code(), SKEIN1024_728);
      ALL.put(SKEIN1024_736.code(), SKEIN1024_736);
      ALL.put(SKEIN1024_744.code(), SKEIN1024_744);
      ALL.put(SKEIN1024_752.code(), SKEIN1024_752);
      ALL.put(SKEIN1024_760.code(), SKEIN1024_760);
      ALL.put(SKEIN1024_768.code(), SKEIN1024_768);
      ALL.put(SKEIN1024_776.code(), SKEIN1024_776);
      ALL.put(SKEIN1024_784.code(), SKEIN1024_784);
      ALL.put(SKEIN1024_792.code(), SKEIN1024_792);
      ALL.put(SKEIN1024_8.code(), SKEIN1024_8);
      ALL.put(SKEIN1024_80.code(), SKEIN1024_80);
      ALL.put(SKEIN1024_800.code(), SKEIN1024_800);
      ALL.put(SKEIN1024_808.code(), SKEIN1024_808);
      ALL.put(SKEIN1024_816.code(), SKEIN1024_816);
      ALL.put(SKEIN1024_824.code(), SKEIN1024_824);
      ALL.put(SKEIN1024_832.code(), SKEIN1024_832);
      ALL.put(SKEIN1024_840.code(), SKEIN1024_840);
      ALL.put(SKEIN1024_848.code(), SKEIN1024_848);
      ALL.put(SKEIN1024_856.code(), SKEIN1024_856);
      ALL.put(SKEIN1024_864.code(), SKEIN1024_864);
      ALL.put(SKEIN1024_872.code(), SKEIN1024_872);
      ALL.put(SKEIN1024_88.code(), SKEIN1024_88);
      ALL.put(SKEIN1024_880.code(), SKEIN1024_880);
      ALL.put(SKEIN1024_888.code(), SKEIN1024_888);
      ALL.put(SKEIN1024_896.code(), SKEIN1024_896);
      ALL.put(SKEIN1024_904.code(), SKEIN1024_904);
      ALL.put(SKEIN1024_912.code(), SKEIN1024_912);
      ALL.put(SKEIN1024_920.code(), SKEIN1024_920);
      ALL.put(SKEIN1024_928.code(), SKEIN1024_928);
      ALL.put(SKEIN1024_936.code(), SKEIN1024_936);
      ALL.put(SKEIN1024_944.code(), SKEIN1024_944);
      ALL.put(SKEIN1024_952.code(), SKEIN1024_952);
      ALL.put(SKEIN1024_96.code(), SKEIN1024_96);
      ALL.put(SKEIN1024_960.code(), SKEIN1024_960);
      ALL.put(SKEIN1024_968.code(), SKEIN1024_968);
      ALL.put(SKEIN1024_976.code(), SKEIN1024_976);
      ALL.put(SKEIN1024_984.code(), SKEIN1024_984);
      ALL.put(SKEIN1024_992.code(), SKEIN1024_992);
      ALL.put(SKEIN256_104.code(), SKEIN256_104);
      ALL.put(SKEIN256_112.code(), SKEIN256_112);
      ALL.put(SKEIN256_120.code(), SKEIN256_120);
      ALL.put(SKEIN256_128.code(), SKEIN256_128);
      ALL.put(SKEIN256_136.code(), SKEIN256_136);
      ALL.put(SKEIN256_144.code(), SKEIN256_144);
      ALL.put(SKEIN256_152.code(), SKEIN256_152);
      ALL.put(SKEIN256_16.code(), SKEIN256_16);
      ALL.put(SKEIN256_160.code(), SKEIN256_160);
      ALL.put(SKEIN256_168.code(), SKEIN256_168);
      ALL.put(SKEIN256_176.code(), SKEIN256_176);
      ALL.put(SKEIN256_184.code(), SKEIN256_184);
      ALL.put(SKEIN256_192.code(), SKEIN256_192);
      ALL.put(SKEIN256_200.code(), SKEIN256_200);
      ALL.put(SKEIN256_208.code(), SKEIN256_208);
      ALL.put(SKEIN256_216.code(), SKEIN256_216);
      ALL.put(SKEIN256_224.code(), SKEIN256_224);
      ALL.put(SKEIN256_232.code(), SKEIN256_232);
      ALL.put(SKEIN256_24.code(), SKEIN256_24);
      ALL.put(SKEIN256_240.code(), SKEIN256_240);
      ALL.put(SKEIN256_248.code(), SKEIN256_248);
      ALL.put(SKEIN256_256.code(), SKEIN256_256);
      ALL.put(SKEIN256_32.code(), SKEIN256_32);
      ALL.put(SKEIN256_40.code(), SKEIN256_40);
      ALL.put(SKEIN256_48.code(), SKEIN256_48);
      ALL.put(SKEIN256_56.code(), SKEIN256_56);
      ALL.put(SKEIN256_64.code(), SKEIN256_64);
      ALL.put(SKEIN256_72.code(), SKEIN256_72);
      ALL.put(SKEIN256_8.code(), SKEIN256_8);
      ALL.put(SKEIN256_80.code(), SKEIN256_80);
      ALL.put(SKEIN256_88.code(), SKEIN256_88);
      ALL.put(SKEIN256_96.code(), SKEIN256_96);
      ALL.put(SKEIN512_104.code(), SKEIN512_104);
      ALL.put(SKEIN512_112.code(), SKEIN512_112);
      ALL.put(SKEIN512_120.code(), SKEIN512_120);
      ALL.put(SKEIN512_128.code(), SKEIN512_128);
      ALL.put(SKEIN512_136.code(), SKEIN512_136);
      ALL.put(SKEIN512_144.code(), SKEIN512_144);
      ALL.put(SKEIN512_152.code(), SKEIN512_152);
      ALL.put(SKEIN512_16.code(), SKEIN512_16);
      ALL.put(SKEIN512_160.code(), SKEIN512_160);
      ALL.put(SKEIN512_168.code(), SKEIN512_168);
      ALL.put(SKEIN512_176.code(), SKEIN512_176);
      ALL.put(SKEIN512_184.code(), SKEIN512_184);
      ALL.put(SKEIN512_192.code(), SKEIN512_192);
      ALL.put(SKEIN512_200.code(), SKEIN512_200);
      ALL.put(SKEIN512_208.code(), SKEIN512_208);
      ALL.put(SKEIN512_216.code(), SKEIN512_216);
      ALL.put(SKEIN512_224.code(), SKEIN512_224);
      ALL.put(SKEIN512_232.code(), SKEIN512_232);
      ALL.put(SKEIN512_24.code(), SKEIN512_24);
      ALL.put(SKEIN512_240.code(), SKEIN512_240);
      ALL.put(SKEIN512_248.code(), SKEIN512_248);
      ALL.put(SKEIN512_256.code(), SKEIN512_256);
      ALL.put(SKEIN512_264.code(), SKEIN512_264);
      ALL.put(SKEIN512_272.code(), SKEIN512_272);
      ALL.put(SKEIN512_280.code(), SKEIN512_280);
      ALL.put(SKEIN512_288.code(), SKEIN512_288);
      ALL.put(SKEIN512_296.code(), SKEIN512_296);
      ALL.put(SKEIN512_304.code(), SKEIN512_304);
      ALL.put(SKEIN512_312.code(), SKEIN512_312);
      ALL.put(SKEIN512_32.code(), SKEIN512_32);
      ALL.put(SKEIN512_320.code(), SKEIN512_320);
      ALL.put(SKEIN512_328.code(), SKEIN512_328);
      ALL.put(SKEIN512_336.code(), SKEIN512_336);
      ALL.put(SKEIN512_344.code(), SKEIN512_344);
      ALL.put(SKEIN512_352.code(), SKEIN512_352);
      ALL.put(SKEIN512_360.code(), SKEIN512_360);
      ALL.put(SKEIN512_368.code(), SKEIN512_368);
      ALL.put(SKEIN512_376.code(), SKEIN512_376);
      ALL.put(SKEIN512_384.code(), SKEIN512_384);
      ALL.put(SKEIN512_392.code(), SKEIN512_392);
      ALL.put(SKEIN512_40.code(), SKEIN512_40);
      ALL.put(SKEIN512_400.code(), SKEIN512_400);
      ALL.put(SKEIN512_408.code(), SKEIN512_408);
      ALL.put(SKEIN512_416.code(), SKEIN512_416);
      ALL.put(SKEIN512_424.code(), SKEIN512_424);
      ALL.put(SKEIN512_432.code(), SKEIN512_432);
      ALL.put(SKEIN512_440.code(), SKEIN512_440);
      ALL.put(SKEIN512_448.code(), SKEIN512_448);
      ALL.put(SKEIN512_456.code(), SKEIN512_456);
      ALL.put(SKEIN512_464.code(), SKEIN512_464);
      ALL.put(SKEIN512_472.code(), SKEIN512_472);
      ALL.put(SKEIN512_48.code(), SKEIN512_48);
      ALL.put(SKEIN512_480.code(), SKEIN512_480);
      ALL.put(SKEIN512_488.code(), SKEIN512_488);
      ALL.put(SKEIN512_496.code(), SKEIN512_496);
      ALL.put(SKEIN512_504.code(), SKEIN512_504);
      ALL.put(SKEIN512_512.code(), SKEIN512_512);
      ALL.put(SKEIN512_56.code(), SKEIN512_56);
      ALL.put(SKEIN512_64.code(), SKEIN512_64);
      ALL.put(SKEIN512_72.code(), SKEIN512_72);
      ALL.put(SKEIN512_8.code(), SKEIN512_8);
      ALL.put(SKEIN512_80.code(), SKEIN512_80);
      ALL.put(SKEIN512_88.code(), SKEIN512_88);
      ALL.put(SKEIN512_96.code(), SKEIN512_96);
      ALL.put(SM3_256.code(), SM3_256);
      ALL.put(SSZ_SHA2_256_BMT.code(), SSZ_SHA2_256_BMT);
      ALL.put(X11.code(), X11);
    }

    protected MultihashCodec() { /* protected */ }
}
