package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec;
import com.apicatalog.multicodec.Multicodec.Tag;

/** Multicodec Registry - generated: Sun Jul 07 20:52:59 CEST 2024 */
public class MultihashCodec {

    protected MultihashCodec() { /* protected */ }

    /** Multihash: blake2b-104, status = draft, code = 0xb20d */
    public static final Multicodec BLAKE2B_104 = new Multicodec("blake2b-104", Tag.Multihash, 45581, new byte[] {(byte)0x8d, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-112, status = draft, code = 0xb20e */
    public static final Multicodec BLAKE2B_112 = new Multicodec("blake2b-112", Tag.Multihash, 45582, new byte[] {(byte)0x8e, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-120, status = draft, code = 0xb20f */
    public static final Multicodec BLAKE2B_120 = new Multicodec("blake2b-120", Tag.Multihash, 45583, new byte[] {(byte)0x8f, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-128, status = draft, code = 0xb210 */
    public static final Multicodec BLAKE2B_128 = new Multicodec("blake2b-128", Tag.Multihash, 45584, new byte[] {(byte)0x90, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-136, status = draft, code = 0xb211 */
    public static final Multicodec BLAKE2B_136 = new Multicodec("blake2b-136", Tag.Multihash, 45585, new byte[] {(byte)0x91, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-144, status = draft, code = 0xb212 */
    public static final Multicodec BLAKE2B_144 = new Multicodec("blake2b-144", Tag.Multihash, 45586, new byte[] {(byte)0x92, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-152, status = draft, code = 0xb213 */
    public static final Multicodec BLAKE2B_152 = new Multicodec("blake2b-152", Tag.Multihash, 45587, new byte[] {(byte)0x93, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-16, status = draft, code = 0xb202 */
    public static final Multicodec BLAKE2B_16 = new Multicodec("blake2b-16", Tag.Multihash, 45570, new byte[] {(byte)0x82, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-160, status = draft, code = 0xb214 */
    public static final Multicodec BLAKE2B_160 = new Multicodec("blake2b-160", Tag.Multihash, 45588, new byte[] {(byte)0x94, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-168, status = draft, code = 0xb215 */
    public static final Multicodec BLAKE2B_168 = new Multicodec("blake2b-168", Tag.Multihash, 45589, new byte[] {(byte)0x95, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-176, status = draft, code = 0xb216 */
    public static final Multicodec BLAKE2B_176 = new Multicodec("blake2b-176", Tag.Multihash, 45590, new byte[] {(byte)0x96, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-184, status = draft, code = 0xb217 */
    public static final Multicodec BLAKE2B_184 = new Multicodec("blake2b-184", Tag.Multihash, 45591, new byte[] {(byte)0x97, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-192, status = draft, code = 0xb218 */
    public static final Multicodec BLAKE2B_192 = new Multicodec("blake2b-192", Tag.Multihash, 45592, new byte[] {(byte)0x98, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-200, status = draft, code = 0xb219 */
    public static final Multicodec BLAKE2B_200 = new Multicodec("blake2b-200", Tag.Multihash, 45593, new byte[] {(byte)0x99, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-208, status = draft, code = 0xb21a */
    public static final Multicodec BLAKE2B_208 = new Multicodec("blake2b-208", Tag.Multihash, 45594, new byte[] {(byte)0x9a, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-216, status = draft, code = 0xb21b */
    public static final Multicodec BLAKE2B_216 = new Multicodec("blake2b-216", Tag.Multihash, 45595, new byte[] {(byte)0x9b, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-224, status = draft, code = 0xb21c */
    public static final Multicodec BLAKE2B_224 = new Multicodec("blake2b-224", Tag.Multihash, 45596, new byte[] {(byte)0x9c, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-232, status = draft, code = 0xb21d */
    public static final Multicodec BLAKE2B_232 = new Multicodec("blake2b-232", Tag.Multihash, 45597, new byte[] {(byte)0x9d, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-24, status = draft, code = 0xb203 */
    public static final Multicodec BLAKE2B_24 = new Multicodec("blake2b-24", Tag.Multihash, 45571, new byte[] {(byte)0x83, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-240, status = draft, code = 0xb21e */
    public static final Multicodec BLAKE2B_240 = new Multicodec("blake2b-240", Tag.Multihash, 45598, new byte[] {(byte)0x9e, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-248, status = draft, code = 0xb21f */
    public static final Multicodec BLAKE2B_248 = new Multicodec("blake2b-248", Tag.Multihash, 45599, new byte[] {(byte)0x9f, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-256, status = permanent, code = 0xb220 */
    public static final Multicodec BLAKE2B_256 = new Multicodec("blake2b-256", Tag.Multihash, 45600, new byte[] {(byte)0xa0, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-264, status = draft, code = 0xb221 */
    public static final Multicodec BLAKE2B_264 = new Multicodec("blake2b-264", Tag.Multihash, 45601, new byte[] {(byte)0xa1, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-272, status = draft, code = 0xb222 */
    public static final Multicodec BLAKE2B_272 = new Multicodec("blake2b-272", Tag.Multihash, 45602, new byte[] {(byte)0xa2, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-280, status = draft, code = 0xb223 */
    public static final Multicodec BLAKE2B_280 = new Multicodec("blake2b-280", Tag.Multihash, 45603, new byte[] {(byte)0xa3, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-288, status = draft, code = 0xb224 */
    public static final Multicodec BLAKE2B_288 = new Multicodec("blake2b-288", Tag.Multihash, 45604, new byte[] {(byte)0xa4, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-296, status = draft, code = 0xb225 */
    public static final Multicodec BLAKE2B_296 = new Multicodec("blake2b-296", Tag.Multihash, 45605, new byte[] {(byte)0xa5, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-304, status = draft, code = 0xb226 */
    public static final Multicodec BLAKE2B_304 = new Multicodec("blake2b-304", Tag.Multihash, 45606, new byte[] {(byte)0xa6, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-312, status = draft, code = 0xb227 */
    public static final Multicodec BLAKE2B_312 = new Multicodec("blake2b-312", Tag.Multihash, 45607, new byte[] {(byte)0xa7, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-32, status = draft, code = 0xb204 */
    public static final Multicodec BLAKE2B_32 = new Multicodec("blake2b-32", Tag.Multihash, 45572, new byte[] {(byte)0x84, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-320, status = draft, code = 0xb228 */
    public static final Multicodec BLAKE2B_320 = new Multicodec("blake2b-320", Tag.Multihash, 45608, new byte[] {(byte)0xa8, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-328, status = draft, code = 0xb229 */
    public static final Multicodec BLAKE2B_328 = new Multicodec("blake2b-328", Tag.Multihash, 45609, new byte[] {(byte)0xa9, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-336, status = draft, code = 0xb22a */
    public static final Multicodec BLAKE2B_336 = new Multicodec("blake2b-336", Tag.Multihash, 45610, new byte[] {(byte)0xaa, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-344, status = draft, code = 0xb22b */
    public static final Multicodec BLAKE2B_344 = new Multicodec("blake2b-344", Tag.Multihash, 45611, new byte[] {(byte)0xab, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-352, status = draft, code = 0xb22c */
    public static final Multicodec BLAKE2B_352 = new Multicodec("blake2b-352", Tag.Multihash, 45612, new byte[] {(byte)0xac, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-360, status = draft, code = 0xb22d */
    public static final Multicodec BLAKE2B_360 = new Multicodec("blake2b-360", Tag.Multihash, 45613, new byte[] {(byte)0xad, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-368, status = draft, code = 0xb22e */
    public static final Multicodec BLAKE2B_368 = new Multicodec("blake2b-368", Tag.Multihash, 45614, new byte[] {(byte)0xae, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-376, status = draft, code = 0xb22f */
    public static final Multicodec BLAKE2B_376 = new Multicodec("blake2b-376", Tag.Multihash, 45615, new byte[] {(byte)0xaf, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-384, status = draft, code = 0xb230 */
    public static final Multicodec BLAKE2B_384 = new Multicodec("blake2b-384", Tag.Multihash, 45616, new byte[] {(byte)0xb0, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-392, status = draft, code = 0xb231 */
    public static final Multicodec BLAKE2B_392 = new Multicodec("blake2b-392", Tag.Multihash, 45617, new byte[] {(byte)0xb1, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-40, status = draft, code = 0xb205 */
    public static final Multicodec BLAKE2B_40 = new Multicodec("blake2b-40", Tag.Multihash, 45573, new byte[] {(byte)0x85, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-400, status = draft, code = 0xb232 */
    public static final Multicodec BLAKE2B_400 = new Multicodec("blake2b-400", Tag.Multihash, 45618, new byte[] {(byte)0xb2, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-408, status = draft, code = 0xb233 */
    public static final Multicodec BLAKE2B_408 = new Multicodec("blake2b-408", Tag.Multihash, 45619, new byte[] {(byte)0xb3, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-416, status = draft, code = 0xb234 */
    public static final Multicodec BLAKE2B_416 = new Multicodec("blake2b-416", Tag.Multihash, 45620, new byte[] {(byte)0xb4, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-424, status = draft, code = 0xb235 */
    public static final Multicodec BLAKE2B_424 = new Multicodec("blake2b-424", Tag.Multihash, 45621, new byte[] {(byte)0xb5, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-432, status = draft, code = 0xb236 */
    public static final Multicodec BLAKE2B_432 = new Multicodec("blake2b-432", Tag.Multihash, 45622, new byte[] {(byte)0xb6, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-440, status = draft, code = 0xb237 */
    public static final Multicodec BLAKE2B_440 = new Multicodec("blake2b-440", Tag.Multihash, 45623, new byte[] {(byte)0xb7, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-448, status = draft, code = 0xb238 */
    public static final Multicodec BLAKE2B_448 = new Multicodec("blake2b-448", Tag.Multihash, 45624, new byte[] {(byte)0xb8, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-456, status = draft, code = 0xb239 */
    public static final Multicodec BLAKE2B_456 = new Multicodec("blake2b-456", Tag.Multihash, 45625, new byte[] {(byte)0xb9, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-464, status = draft, code = 0xb23a */
    public static final Multicodec BLAKE2B_464 = new Multicodec("blake2b-464", Tag.Multihash, 45626, new byte[] {(byte)0xba, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-472, status = draft, code = 0xb23b */
    public static final Multicodec BLAKE2B_472 = new Multicodec("blake2b-472", Tag.Multihash, 45627, new byte[] {(byte)0xbb, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-48, status = draft, code = 0xb206 */
    public static final Multicodec BLAKE2B_48 = new Multicodec("blake2b-48", Tag.Multihash, 45574, new byte[] {(byte)0x86, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-480, status = draft, code = 0xb23c */
    public static final Multicodec BLAKE2B_480 = new Multicodec("blake2b-480", Tag.Multihash, 45628, new byte[] {(byte)0xbc, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-488, status = draft, code = 0xb23d */
    public static final Multicodec BLAKE2B_488 = new Multicodec("blake2b-488", Tag.Multihash, 45629, new byte[] {(byte)0xbd, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-496, status = draft, code = 0xb23e */
    public static final Multicodec BLAKE2B_496 = new Multicodec("blake2b-496", Tag.Multihash, 45630, new byte[] {(byte)0xbe, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-504, status = draft, code = 0xb23f */
    public static final Multicodec BLAKE2B_504 = new Multicodec("blake2b-504", Tag.Multihash, 45631, new byte[] {(byte)0xbf, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-512, status = draft, code = 0xb240 */
    public static final Multicodec BLAKE2B_512 = new Multicodec("blake2b-512", Tag.Multihash, 45632, new byte[] {(byte)0xc0, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-56, status = draft, code = 0xb207 */
    public static final Multicodec BLAKE2B_56 = new Multicodec("blake2b-56", Tag.Multihash, 45575, new byte[] {(byte)0x87, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-64, status = draft, code = 0xb208 */
    public static final Multicodec BLAKE2B_64 = new Multicodec("blake2b-64", Tag.Multihash, 45576, new byte[] {(byte)0x88, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-72, status = draft, code = 0xb209 */
    public static final Multicodec BLAKE2B_72 = new Multicodec("blake2b-72", Tag.Multihash, 45577, new byte[] {(byte)0x89, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-8, Blake2b consists of 64 output lengths that give different hashes, status = draft, code = 0xb201 */
    public static final Multicodec BLAKE2B_8 = new Multicodec("blake2b-8", Tag.Multihash, 45569, new byte[] {(byte)0x81, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-80, status = draft, code = 0xb20a */
    public static final Multicodec BLAKE2B_80 = new Multicodec("blake2b-80", Tag.Multihash, 45578, new byte[] {(byte)0x8a, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-88, status = draft, code = 0xb20b */
    public static final Multicodec BLAKE2B_88 = new Multicodec("blake2b-88", Tag.Multihash, 45579, new byte[] {(byte)0x8b, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2b-96, status = draft, code = 0xb20c */
    public static final Multicodec BLAKE2B_96 = new Multicodec("blake2b-96", Tag.Multihash, 45580, new byte[] {(byte)0x8c, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-104, status = draft, code = 0xb24d */
    public static final Multicodec BLAKE2S_104 = new Multicodec("blake2s-104", Tag.Multihash, 45645, new byte[] {(byte)0xcd, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-112, status = draft, code = 0xb24e */
    public static final Multicodec BLAKE2S_112 = new Multicodec("blake2s-112", Tag.Multihash, 45646, new byte[] {(byte)0xce, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-120, status = draft, code = 0xb24f */
    public static final Multicodec BLAKE2S_120 = new Multicodec("blake2s-120", Tag.Multihash, 45647, new byte[] {(byte)0xcf, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-128, status = draft, code = 0xb250 */
    public static final Multicodec BLAKE2S_128 = new Multicodec("blake2s-128", Tag.Multihash, 45648, new byte[] {(byte)0xd0, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-136, status = draft, code = 0xb251 */
    public static final Multicodec BLAKE2S_136 = new Multicodec("blake2s-136", Tag.Multihash, 45649, new byte[] {(byte)0xd1, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-144, status = draft, code = 0xb252 */
    public static final Multicodec BLAKE2S_144 = new Multicodec("blake2s-144", Tag.Multihash, 45650, new byte[] {(byte)0xd2, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-152, status = draft, code = 0xb253 */
    public static final Multicodec BLAKE2S_152 = new Multicodec("blake2s-152", Tag.Multihash, 45651, new byte[] {(byte)0xd3, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-16, status = draft, code = 0xb242 */
    public static final Multicodec BLAKE2S_16 = new Multicodec("blake2s-16", Tag.Multihash, 45634, new byte[] {(byte)0xc2, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-160, status = draft, code = 0xb254 */
    public static final Multicodec BLAKE2S_160 = new Multicodec("blake2s-160", Tag.Multihash, 45652, new byte[] {(byte)0xd4, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-168, status = draft, code = 0xb255 */
    public static final Multicodec BLAKE2S_168 = new Multicodec("blake2s-168", Tag.Multihash, 45653, new byte[] {(byte)0xd5, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-176, status = draft, code = 0xb256 */
    public static final Multicodec BLAKE2S_176 = new Multicodec("blake2s-176", Tag.Multihash, 45654, new byte[] {(byte)0xd6, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-184, status = draft, code = 0xb257 */
    public static final Multicodec BLAKE2S_184 = new Multicodec("blake2s-184", Tag.Multihash, 45655, new byte[] {(byte)0xd7, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-192, status = draft, code = 0xb258 */
    public static final Multicodec BLAKE2S_192 = new Multicodec("blake2s-192", Tag.Multihash, 45656, new byte[] {(byte)0xd8, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-200, status = draft, code = 0xb259 */
    public static final Multicodec BLAKE2S_200 = new Multicodec("blake2s-200", Tag.Multihash, 45657, new byte[] {(byte)0xd9, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-208, status = draft, code = 0xb25a */
    public static final Multicodec BLAKE2S_208 = new Multicodec("blake2s-208", Tag.Multihash, 45658, new byte[] {(byte)0xda, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-216, status = draft, code = 0xb25b */
    public static final Multicodec BLAKE2S_216 = new Multicodec("blake2s-216", Tag.Multihash, 45659, new byte[] {(byte)0xdb, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-224, status = draft, code = 0xb25c */
    public static final Multicodec BLAKE2S_224 = new Multicodec("blake2s-224", Tag.Multihash, 45660, new byte[] {(byte)0xdc, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-232, status = draft, code = 0xb25d */
    public static final Multicodec BLAKE2S_232 = new Multicodec("blake2s-232", Tag.Multihash, 45661, new byte[] {(byte)0xdd, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-24, status = draft, code = 0xb243 */
    public static final Multicodec BLAKE2S_24 = new Multicodec("blake2s-24", Tag.Multihash, 45635, new byte[] {(byte)0xc3, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-240, status = draft, code = 0xb25e */
    public static final Multicodec BLAKE2S_240 = new Multicodec("blake2s-240", Tag.Multihash, 45662, new byte[] {(byte)0xde, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-248, status = draft, code = 0xb25f */
    public static final Multicodec BLAKE2S_248 = new Multicodec("blake2s-248", Tag.Multihash, 45663, new byte[] {(byte)0xdf, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-256, status = draft, code = 0xb260 */
    public static final Multicodec BLAKE2S_256 = new Multicodec("blake2s-256", Tag.Multihash, 45664, new byte[] {(byte)0xe0, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-32, status = draft, code = 0xb244 */
    public static final Multicodec BLAKE2S_32 = new Multicodec("blake2s-32", Tag.Multihash, 45636, new byte[] {(byte)0xc4, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-40, status = draft, code = 0xb245 */
    public static final Multicodec BLAKE2S_40 = new Multicodec("blake2s-40", Tag.Multihash, 45637, new byte[] {(byte)0xc5, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-48, status = draft, code = 0xb246 */
    public static final Multicodec BLAKE2S_48 = new Multicodec("blake2s-48", Tag.Multihash, 45638, new byte[] {(byte)0xc6, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-56, status = draft, code = 0xb247 */
    public static final Multicodec BLAKE2S_56 = new Multicodec("blake2s-56", Tag.Multihash, 45639, new byte[] {(byte)0xc7, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-64, status = draft, code = 0xb248 */
    public static final Multicodec BLAKE2S_64 = new Multicodec("blake2s-64", Tag.Multihash, 45640, new byte[] {(byte)0xc8, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-72, status = draft, code = 0xb249 */
    public static final Multicodec BLAKE2S_72 = new Multicodec("blake2s-72", Tag.Multihash, 45641, new byte[] {(byte)0xc9, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-8, Blake2s consists of 32 output lengths that give different hashes, status = draft, code = 0xb241 */
    public static final Multicodec BLAKE2S_8 = new Multicodec("blake2s-8", Tag.Multihash, 45633, new byte[] {(byte)0xc1, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-80, status = draft, code = 0xb24a */
    public static final Multicodec BLAKE2S_80 = new Multicodec("blake2s-80", Tag.Multihash, 45642, new byte[] {(byte)0xca, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-88, status = draft, code = 0xb24b */
    public static final Multicodec BLAKE2S_88 = new Multicodec("blake2s-88", Tag.Multihash, 45643, new byte[] {(byte)0xcb, (byte)0xe4, (byte)0x02});

    /** Multihash: blake2s-96, status = draft, code = 0xb24c */
    public static final Multicodec BLAKE2S_96 = new Multicodec("blake2s-96", Tag.Multihash, 45644, new byte[] {(byte)0xcc, (byte)0xe4, (byte)0x02});

    /** Multihash: blake3, BLAKE3 has a default 32 byte output length. The maximum length is (2^64)-1 bytes., status = draft, code = 0x1e */
    public static final Multicodec BLAKE3 = new Multicodec("blake3", Tag.Multihash, 30, new byte[] {(byte)0x1e});

    /** Multihash: dbl-sha2-256, status = draft, code = 0x56 */
    public static final Multicodec DBL_SHA2_256 = new Multicodec("dbl-sha2-256", Tag.Multihash, 86, new byte[] {(byte)0x56});

    /** Multihash: identity, raw binary, status = permanent, code = 0x0 */
    public static final Multicodec IDENTITY = new Multicodec("identity", Tag.Multihash, 0, new byte[] {(byte)0x00});

    /** Multihash: kangarootwelve, KangarooTwelve is an extendable-output hash function based on Keccak-p, status = draft, code = 0x1d01 */
    public static final Multicodec KANGAROOTWELVE = new Multicodec("kangarootwelve", Tag.Multihash, 7425, new byte[] {(byte)0x81, (byte)0x3a});

    /** Multihash: keccak-224, keccak has variable output length. The number specifies the core length, status = draft, code = 0x1a */
    public static final Multicodec KECCAK_224 = new Multicodec("keccak-224", Tag.Multihash, 26, new byte[] {(byte)0x1a});

    /** Multihash: keccak-256, status = draft, code = 0x1b */
    public static final Multicodec KECCAK_256 = new Multicodec("keccak-256", Tag.Multihash, 27, new byte[] {(byte)0x1b});

    /** Multihash: keccak-384, status = draft, code = 0x1c */
    public static final Multicodec KECCAK_384 = new Multicodec("keccak-384", Tag.Multihash, 28, new byte[] {(byte)0x1c});

    /** Multihash: keccak-512, status = draft, code = 0x1d */
    public static final Multicodec KECCAK_512 = new Multicodec("keccak-512", Tag.Multihash, 29, new byte[] {(byte)0x1d});

    /** Multihash: md4, status = draft, code = 0xd4 */
    public static final Multicodec MD4 = new Multicodec("md4", Tag.Multihash, 212, new byte[] {(byte)0xd4, (byte)0x01});

    /** Multihash: md5, status = draft, code = 0xd5 */
    public static final Multicodec MD5 = new Multicodec("md5", Tag.Multihash, 213, new byte[] {(byte)0xd5, (byte)0x01});

    /** Multihash: poseidon-bls12_381-a2-fc1, Poseidon using BLS12-381 and arity of 2 with Filecoin parameters, status = permanent, code = 0xb401 */
    public static final Multicodec POSEIDON_BLS12_381_A2_FC1 = new Multicodec("poseidon-bls12_381-a2-fc1", Tag.Multihash, 46081, new byte[] {(byte)0x81, (byte)0xe8, (byte)0x02});

    /** Multihash: poseidon-bls12_381-a2-fc1-sc, Poseidon using BLS12-381 and arity of 2 with Filecoin parameters - high-security variant, status = draft, code = 0xb402 */
    public static final Multicodec POSEIDON_BLS12_381_A2_FC1_SC = new Multicodec("poseidon-bls12_381-a2-fc1-sc", Tag.Multihash, 46082, new byte[] {(byte)0x82, (byte)0xe8, (byte)0x02});

    /** Multihash: ripemd-128, status = draft, code = 0x1052 */
    public static final Multicodec RIPEMD_128 = new Multicodec("ripemd-128", Tag.Multihash, 4178, new byte[] {(byte)0xd2, (byte)0x20});

    /** Multihash: ripemd-160, status = draft, code = 0x1053 */
    public static final Multicodec RIPEMD_160 = new Multicodec("ripemd-160", Tag.Multihash, 4179, new byte[] {(byte)0xd3, (byte)0x20});

    /** Multihash: ripemd-256, status = draft, code = 0x1054 */
    public static final Multicodec RIPEMD_256 = new Multicodec("ripemd-256", Tag.Multihash, 4180, new byte[] {(byte)0xd4, (byte)0x20});

    /** Multihash: ripemd-320, status = draft, code = 0x1055 */
    public static final Multicodec RIPEMD_320 = new Multicodec("ripemd-320", Tag.Multihash, 4181, new byte[] {(byte)0xd5, (byte)0x20});

    /** Multihash: sha1, status = permanent, code = 0x11 */
    public static final Multicodec SHA1 = new Multicodec("sha1", Tag.Multihash, 17, new byte[] {(byte)0x11});

    /** Multihash: sha2-224, aka SHA-224; as specified by FIPS 180-4., status = permanent, code = 0x1013 */
    public static final Multicodec SHA2_224 = new Multicodec("sha2-224", Tag.Multihash, 4115, new byte[] {(byte)0x93, (byte)0x20});

    /** Multihash: sha2-256, status = permanent, code = 0x12 */
    public static final Multicodec SHA2_256 = new Multicodec("sha2-256", Tag.Multihash, 18, new byte[] {(byte)0x12});

    /** Multihash: sha2-256-chunked, Hash of concatenated SHA2-256 digests of 8*2^n MiB source chunks; n = ceil(log2(source_size/(10^4 * 8MiB))), status = draft, code = 0xb510 */
    public static final Multicodec SHA2_256_CHUNKED = new Multicodec("sha2-256-chunked", Tag.Multihash, 46352, new byte[] {(byte)0x90, (byte)0xea, (byte)0x02});

    /** Multihash: sha2-256-trunc254-padded, SHA2-256 with the two most significant bits from the last byte zeroed (as via a mask with 0b00111111) - used for proving trees as in Filecoin, status = permanent, code = 0x1012 */
    public static final Multicodec SHA2_256_TRUNC254_PADDED = new Multicodec("sha2-256-trunc254-padded", Tag.Multihash, 4114, new byte[] {(byte)0x92, (byte)0x20});

    /** Multihash: sha2-384, aka SHA-384; as specified by FIPS 180-4., status = permanent, code = 0x20 */
    public static final Multicodec SHA2_384 = new Multicodec("sha2-384", Tag.Multihash, 32, new byte[] {(byte)0x20});

    /** Multihash: sha2-512, status = permanent, code = 0x13 */
    public static final Multicodec SHA2_512 = new Multicodec("sha2-512", Tag.Multihash, 19, new byte[] {(byte)0x13});

    /** Multihash: sha2-512-224, aka SHA-512/224; as specified by FIPS 180-4., status = permanent, code = 0x1014 */
    public static final Multicodec SHA2_512_224 = new Multicodec("sha2-512-224", Tag.Multihash, 4116, new byte[] {(byte)0x94, (byte)0x20});

    /** Multihash: sha2-512-256, aka SHA-512/256; as specified by FIPS 180-4., status = permanent, code = 0x1015 */
    public static final Multicodec SHA2_512_256 = new Multicodec("sha2-512-256", Tag.Multihash, 4117, new byte[] {(byte)0x95, (byte)0x20});

    /** Multihash: sha3-224, status = permanent, code = 0x17 */
    public static final Multicodec SHA3_224 = new Multicodec("sha3-224", Tag.Multihash, 23, new byte[] {(byte)0x17});

    /** Multihash: sha3-256, status = permanent, code = 0x16 */
    public static final Multicodec SHA3_256 = new Multicodec("sha3-256", Tag.Multihash, 22, new byte[] {(byte)0x16});

    /** Multihash: sha3-384, status = permanent, code = 0x15 */
    public static final Multicodec SHA3_384 = new Multicodec("sha3-384", Tag.Multihash, 21, new byte[] {(byte)0x15});

    /** Multihash: sha3-512, status = permanent, code = 0x14 */
    public static final Multicodec SHA3_512 = new Multicodec("sha3-512", Tag.Multihash, 20, new byte[] {(byte)0x14});

    /** Multihash: shake-128, status = draft, code = 0x18 */
    public static final Multicodec SHAKE_128 = new Multicodec("shake-128", Tag.Multihash, 24, new byte[] {(byte)0x18});

    /** Multihash: shake-256, status = draft, code = 0x19 */
    public static final Multicodec SHAKE_256 = new Multicodec("shake-256", Tag.Multihash, 25, new byte[] {(byte)0x19});

    /** Multihash: skein1024-1000, status = draft, code = 0xb3dd */
    public static final Multicodec SKEIN1024_1000 = new Multicodec("skein1024-1000", Tag.Multihash, 46045, new byte[] {(byte)0xdd, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-1008, status = draft, code = 0xb3de */
    public static final Multicodec SKEIN1024_1008 = new Multicodec("skein1024-1008", Tag.Multihash, 46046, new byte[] {(byte)0xde, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-1016, status = draft, code = 0xb3df */
    public static final Multicodec SKEIN1024_1016 = new Multicodec("skein1024-1016", Tag.Multihash, 46047, new byte[] {(byte)0xdf, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-1024, status = draft, code = 0xb3e0 */
    public static final Multicodec SKEIN1024_1024 = new Multicodec("skein1024-1024", Tag.Multihash, 46048, new byte[] {(byte)0xe0, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-104, status = draft, code = 0xb36d */
    public static final Multicodec SKEIN1024_104 = new Multicodec("skein1024-104", Tag.Multihash, 45933, new byte[] {(byte)0xed, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-112, status = draft, code = 0xb36e */
    public static final Multicodec SKEIN1024_112 = new Multicodec("skein1024-112", Tag.Multihash, 45934, new byte[] {(byte)0xee, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-120, status = draft, code = 0xb36f */
    public static final Multicodec SKEIN1024_120 = new Multicodec("skein1024-120", Tag.Multihash, 45935, new byte[] {(byte)0xef, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-128, status = draft, code = 0xb370 */
    public static final Multicodec SKEIN1024_128 = new Multicodec("skein1024-128", Tag.Multihash, 45936, new byte[] {(byte)0xf0, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-136, status = draft, code = 0xb371 */
    public static final Multicodec SKEIN1024_136 = new Multicodec("skein1024-136", Tag.Multihash, 45937, new byte[] {(byte)0xf1, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-144, status = draft, code = 0xb372 */
    public static final Multicodec SKEIN1024_144 = new Multicodec("skein1024-144", Tag.Multihash, 45938, new byte[] {(byte)0xf2, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-152, status = draft, code = 0xb373 */
    public static final Multicodec SKEIN1024_152 = new Multicodec("skein1024-152", Tag.Multihash, 45939, new byte[] {(byte)0xf3, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-16, status = draft, code = 0xb362 */
    public static final Multicodec SKEIN1024_16 = new Multicodec("skein1024-16", Tag.Multihash, 45922, new byte[] {(byte)0xe2, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-160, status = draft, code = 0xb374 */
    public static final Multicodec SKEIN1024_160 = new Multicodec("skein1024-160", Tag.Multihash, 45940, new byte[] {(byte)0xf4, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-168, status = draft, code = 0xb375 */
    public static final Multicodec SKEIN1024_168 = new Multicodec("skein1024-168", Tag.Multihash, 45941, new byte[] {(byte)0xf5, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-176, status = draft, code = 0xb376 */
    public static final Multicodec SKEIN1024_176 = new Multicodec("skein1024-176", Tag.Multihash, 45942, new byte[] {(byte)0xf6, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-184, status = draft, code = 0xb377 */
    public static final Multicodec SKEIN1024_184 = new Multicodec("skein1024-184", Tag.Multihash, 45943, new byte[] {(byte)0xf7, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-192, status = draft, code = 0xb378 */
    public static final Multicodec SKEIN1024_192 = new Multicodec("skein1024-192", Tag.Multihash, 45944, new byte[] {(byte)0xf8, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-200, status = draft, code = 0xb379 */
    public static final Multicodec SKEIN1024_200 = new Multicodec("skein1024-200", Tag.Multihash, 45945, new byte[] {(byte)0xf9, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-208, status = draft, code = 0xb37a */
    public static final Multicodec SKEIN1024_208 = new Multicodec("skein1024-208", Tag.Multihash, 45946, new byte[] {(byte)0xfa, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-216, status = draft, code = 0xb37b */
    public static final Multicodec SKEIN1024_216 = new Multicodec("skein1024-216", Tag.Multihash, 45947, new byte[] {(byte)0xfb, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-224, status = draft, code = 0xb37c */
    public static final Multicodec SKEIN1024_224 = new Multicodec("skein1024-224", Tag.Multihash, 45948, new byte[] {(byte)0xfc, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-232, status = draft, code = 0xb37d */
    public static final Multicodec SKEIN1024_232 = new Multicodec("skein1024-232", Tag.Multihash, 45949, new byte[] {(byte)0xfd, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-24, status = draft, code = 0xb363 */
    public static final Multicodec SKEIN1024_24 = new Multicodec("skein1024-24", Tag.Multihash, 45923, new byte[] {(byte)0xe3, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-240, status = draft, code = 0xb37e */
    public static final Multicodec SKEIN1024_240 = new Multicodec("skein1024-240", Tag.Multihash, 45950, new byte[] {(byte)0xfe, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-248, status = draft, code = 0xb37f */
    public static final Multicodec SKEIN1024_248 = new Multicodec("skein1024-248", Tag.Multihash, 45951, new byte[] {(byte)0xff, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-256, status = draft, code = 0xb380 */
    public static final Multicodec SKEIN1024_256 = new Multicodec("skein1024-256", Tag.Multihash, 45952, new byte[] {(byte)0x80, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-264, status = draft, code = 0xb381 */
    public static final Multicodec SKEIN1024_264 = new Multicodec("skein1024-264", Tag.Multihash, 45953, new byte[] {(byte)0x81, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-272, status = draft, code = 0xb382 */
    public static final Multicodec SKEIN1024_272 = new Multicodec("skein1024-272", Tag.Multihash, 45954, new byte[] {(byte)0x82, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-280, status = draft, code = 0xb383 */
    public static final Multicodec SKEIN1024_280 = new Multicodec("skein1024-280", Tag.Multihash, 45955, new byte[] {(byte)0x83, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-288, status = draft, code = 0xb384 */
    public static final Multicodec SKEIN1024_288 = new Multicodec("skein1024-288", Tag.Multihash, 45956, new byte[] {(byte)0x84, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-296, status = draft, code = 0xb385 */
    public static final Multicodec SKEIN1024_296 = new Multicodec("skein1024-296", Tag.Multihash, 45957, new byte[] {(byte)0x85, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-304, status = draft, code = 0xb386 */
    public static final Multicodec SKEIN1024_304 = new Multicodec("skein1024-304", Tag.Multihash, 45958, new byte[] {(byte)0x86, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-312, status = draft, code = 0xb387 */
    public static final Multicodec SKEIN1024_312 = new Multicodec("skein1024-312", Tag.Multihash, 45959, new byte[] {(byte)0x87, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-32, status = draft, code = 0xb364 */
    public static final Multicodec SKEIN1024_32 = new Multicodec("skein1024-32", Tag.Multihash, 45924, new byte[] {(byte)0xe4, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-320, status = draft, code = 0xb388 */
    public static final Multicodec SKEIN1024_320 = new Multicodec("skein1024-320", Tag.Multihash, 45960, new byte[] {(byte)0x88, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-328, status = draft, code = 0xb389 */
    public static final Multicodec SKEIN1024_328 = new Multicodec("skein1024-328", Tag.Multihash, 45961, new byte[] {(byte)0x89, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-336, status = draft, code = 0xb38a */
    public static final Multicodec SKEIN1024_336 = new Multicodec("skein1024-336", Tag.Multihash, 45962, new byte[] {(byte)0x8a, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-344, status = draft, code = 0xb38b */
    public static final Multicodec SKEIN1024_344 = new Multicodec("skein1024-344", Tag.Multihash, 45963, new byte[] {(byte)0x8b, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-352, status = draft, code = 0xb38c */
    public static final Multicodec SKEIN1024_352 = new Multicodec("skein1024-352", Tag.Multihash, 45964, new byte[] {(byte)0x8c, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-360, status = draft, code = 0xb38d */
    public static final Multicodec SKEIN1024_360 = new Multicodec("skein1024-360", Tag.Multihash, 45965, new byte[] {(byte)0x8d, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-368, status = draft, code = 0xb38e */
    public static final Multicodec SKEIN1024_368 = new Multicodec("skein1024-368", Tag.Multihash, 45966, new byte[] {(byte)0x8e, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-376, status = draft, code = 0xb38f */
    public static final Multicodec SKEIN1024_376 = new Multicodec("skein1024-376", Tag.Multihash, 45967, new byte[] {(byte)0x8f, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-384, status = draft, code = 0xb390 */
    public static final Multicodec SKEIN1024_384 = new Multicodec("skein1024-384", Tag.Multihash, 45968, new byte[] {(byte)0x90, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-392, status = draft, code = 0xb391 */
    public static final Multicodec SKEIN1024_392 = new Multicodec("skein1024-392", Tag.Multihash, 45969, new byte[] {(byte)0x91, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-40, status = draft, code = 0xb365 */
    public static final Multicodec SKEIN1024_40 = new Multicodec("skein1024-40", Tag.Multihash, 45925, new byte[] {(byte)0xe5, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-400, status = draft, code = 0xb392 */
    public static final Multicodec SKEIN1024_400 = new Multicodec("skein1024-400", Tag.Multihash, 45970, new byte[] {(byte)0x92, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-408, status = draft, code = 0xb393 */
    public static final Multicodec SKEIN1024_408 = new Multicodec("skein1024-408", Tag.Multihash, 45971, new byte[] {(byte)0x93, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-416, status = draft, code = 0xb394 */
    public static final Multicodec SKEIN1024_416 = new Multicodec("skein1024-416", Tag.Multihash, 45972, new byte[] {(byte)0x94, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-424, status = draft, code = 0xb395 */
    public static final Multicodec SKEIN1024_424 = new Multicodec("skein1024-424", Tag.Multihash, 45973, new byte[] {(byte)0x95, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-432, status = draft, code = 0xb396 */
    public static final Multicodec SKEIN1024_432 = new Multicodec("skein1024-432", Tag.Multihash, 45974, new byte[] {(byte)0x96, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-440, status = draft, code = 0xb397 */
    public static final Multicodec SKEIN1024_440 = new Multicodec("skein1024-440", Tag.Multihash, 45975, new byte[] {(byte)0x97, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-448, status = draft, code = 0xb398 */
    public static final Multicodec SKEIN1024_448 = new Multicodec("skein1024-448", Tag.Multihash, 45976, new byte[] {(byte)0x98, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-456, status = draft, code = 0xb399 */
    public static final Multicodec SKEIN1024_456 = new Multicodec("skein1024-456", Tag.Multihash, 45977, new byte[] {(byte)0x99, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-464, status = draft, code = 0xb39a */
    public static final Multicodec SKEIN1024_464 = new Multicodec("skein1024-464", Tag.Multihash, 45978, new byte[] {(byte)0x9a, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-472, status = draft, code = 0xb39b */
    public static final Multicodec SKEIN1024_472 = new Multicodec("skein1024-472", Tag.Multihash, 45979, new byte[] {(byte)0x9b, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-48, status = draft, code = 0xb366 */
    public static final Multicodec SKEIN1024_48 = new Multicodec("skein1024-48", Tag.Multihash, 45926, new byte[] {(byte)0xe6, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-480, status = draft, code = 0xb39c */
    public static final Multicodec SKEIN1024_480 = new Multicodec("skein1024-480", Tag.Multihash, 45980, new byte[] {(byte)0x9c, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-488, status = draft, code = 0xb39d */
    public static final Multicodec SKEIN1024_488 = new Multicodec("skein1024-488", Tag.Multihash, 45981, new byte[] {(byte)0x9d, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-496, status = draft, code = 0xb39e */
    public static final Multicodec SKEIN1024_496 = new Multicodec("skein1024-496", Tag.Multihash, 45982, new byte[] {(byte)0x9e, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-504, status = draft, code = 0xb39f */
    public static final Multicodec SKEIN1024_504 = new Multicodec("skein1024-504", Tag.Multihash, 45983, new byte[] {(byte)0x9f, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-512, status = draft, code = 0xb3a0 */
    public static final Multicodec SKEIN1024_512 = new Multicodec("skein1024-512", Tag.Multihash, 45984, new byte[] {(byte)0xa0, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-520, status = draft, code = 0xb3a1 */
    public static final Multicodec SKEIN1024_520 = new Multicodec("skein1024-520", Tag.Multihash, 45985, new byte[] {(byte)0xa1, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-528, status = draft, code = 0xb3a2 */
    public static final Multicodec SKEIN1024_528 = new Multicodec("skein1024-528", Tag.Multihash, 45986, new byte[] {(byte)0xa2, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-536, status = draft, code = 0xb3a3 */
    public static final Multicodec SKEIN1024_536 = new Multicodec("skein1024-536", Tag.Multihash, 45987, new byte[] {(byte)0xa3, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-544, status = draft, code = 0xb3a4 */
    public static final Multicodec SKEIN1024_544 = new Multicodec("skein1024-544", Tag.Multihash, 45988, new byte[] {(byte)0xa4, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-552, status = draft, code = 0xb3a5 */
    public static final Multicodec SKEIN1024_552 = new Multicodec("skein1024-552", Tag.Multihash, 45989, new byte[] {(byte)0xa5, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-56, status = draft, code = 0xb367 */
    public static final Multicodec SKEIN1024_56 = new Multicodec("skein1024-56", Tag.Multihash, 45927, new byte[] {(byte)0xe7, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-560, status = draft, code = 0xb3a6 */
    public static final Multicodec SKEIN1024_560 = new Multicodec("skein1024-560", Tag.Multihash, 45990, new byte[] {(byte)0xa6, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-568, status = draft, code = 0xb3a7 */
    public static final Multicodec SKEIN1024_568 = new Multicodec("skein1024-568", Tag.Multihash, 45991, new byte[] {(byte)0xa7, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-576, status = draft, code = 0xb3a8 */
    public static final Multicodec SKEIN1024_576 = new Multicodec("skein1024-576", Tag.Multihash, 45992, new byte[] {(byte)0xa8, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-584, status = draft, code = 0xb3a9 */
    public static final Multicodec SKEIN1024_584 = new Multicodec("skein1024-584", Tag.Multihash, 45993, new byte[] {(byte)0xa9, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-592, status = draft, code = 0xb3aa */
    public static final Multicodec SKEIN1024_592 = new Multicodec("skein1024-592", Tag.Multihash, 45994, new byte[] {(byte)0xaa, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-600, status = draft, code = 0xb3ab */
    public static final Multicodec SKEIN1024_600 = new Multicodec("skein1024-600", Tag.Multihash, 45995, new byte[] {(byte)0xab, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-608, status = draft, code = 0xb3ac */
    public static final Multicodec SKEIN1024_608 = new Multicodec("skein1024-608", Tag.Multihash, 45996, new byte[] {(byte)0xac, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-616, status = draft, code = 0xb3ad */
    public static final Multicodec SKEIN1024_616 = new Multicodec("skein1024-616", Tag.Multihash, 45997, new byte[] {(byte)0xad, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-624, status = draft, code = 0xb3ae */
    public static final Multicodec SKEIN1024_624 = new Multicodec("skein1024-624", Tag.Multihash, 45998, new byte[] {(byte)0xae, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-632, status = draft, code = 0xb3af */
    public static final Multicodec SKEIN1024_632 = new Multicodec("skein1024-632", Tag.Multihash, 45999, new byte[] {(byte)0xaf, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-64, status = draft, code = 0xb368 */
    public static final Multicodec SKEIN1024_64 = new Multicodec("skein1024-64", Tag.Multihash, 45928, new byte[] {(byte)0xe8, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-640, status = draft, code = 0xb3b0 */
    public static final Multicodec SKEIN1024_640 = new Multicodec("skein1024-640", Tag.Multihash, 46000, new byte[] {(byte)0xb0, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-648, status = draft, code = 0xb3b1 */
    public static final Multicodec SKEIN1024_648 = new Multicodec("skein1024-648", Tag.Multihash, 46001, new byte[] {(byte)0xb1, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-656, status = draft, code = 0xb3b2 */
    public static final Multicodec SKEIN1024_656 = new Multicodec("skein1024-656", Tag.Multihash, 46002, new byte[] {(byte)0xb2, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-664, status = draft, code = 0xb3b3 */
    public static final Multicodec SKEIN1024_664 = new Multicodec("skein1024-664", Tag.Multihash, 46003, new byte[] {(byte)0xb3, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-672, status = draft, code = 0xb3b4 */
    public static final Multicodec SKEIN1024_672 = new Multicodec("skein1024-672", Tag.Multihash, 46004, new byte[] {(byte)0xb4, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-680, status = draft, code = 0xb3b5 */
    public static final Multicodec SKEIN1024_680 = new Multicodec("skein1024-680", Tag.Multihash, 46005, new byte[] {(byte)0xb5, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-688, status = draft, code = 0xb3b6 */
    public static final Multicodec SKEIN1024_688 = new Multicodec("skein1024-688", Tag.Multihash, 46006, new byte[] {(byte)0xb6, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-696, status = draft, code = 0xb3b7 */
    public static final Multicodec SKEIN1024_696 = new Multicodec("skein1024-696", Tag.Multihash, 46007, new byte[] {(byte)0xb7, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-704, status = draft, code = 0xb3b8 */
    public static final Multicodec SKEIN1024_704 = new Multicodec("skein1024-704", Tag.Multihash, 46008, new byte[] {(byte)0xb8, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-712, status = draft, code = 0xb3b9 */
    public static final Multicodec SKEIN1024_712 = new Multicodec("skein1024-712", Tag.Multihash, 46009, new byte[] {(byte)0xb9, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-72, status = draft, code = 0xb369 */
    public static final Multicodec SKEIN1024_72 = new Multicodec("skein1024-72", Tag.Multihash, 45929, new byte[] {(byte)0xe9, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-720, status = draft, code = 0xb3ba */
    public static final Multicodec SKEIN1024_720 = new Multicodec("skein1024-720", Tag.Multihash, 46010, new byte[] {(byte)0xba, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-728, status = draft, code = 0xb3bb */
    public static final Multicodec SKEIN1024_728 = new Multicodec("skein1024-728", Tag.Multihash, 46011, new byte[] {(byte)0xbb, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-736, status = draft, code = 0xb3bc */
    public static final Multicodec SKEIN1024_736 = new Multicodec("skein1024-736", Tag.Multihash, 46012, new byte[] {(byte)0xbc, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-744, status = draft, code = 0xb3bd */
    public static final Multicodec SKEIN1024_744 = new Multicodec("skein1024-744", Tag.Multihash, 46013, new byte[] {(byte)0xbd, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-752, status = draft, code = 0xb3be */
    public static final Multicodec SKEIN1024_752 = new Multicodec("skein1024-752", Tag.Multihash, 46014, new byte[] {(byte)0xbe, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-760, status = draft, code = 0xb3bf */
    public static final Multicodec SKEIN1024_760 = new Multicodec("skein1024-760", Tag.Multihash, 46015, new byte[] {(byte)0xbf, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-768, status = draft, code = 0xb3c0 */
    public static final Multicodec SKEIN1024_768 = new Multicodec("skein1024-768", Tag.Multihash, 46016, new byte[] {(byte)0xc0, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-776, status = draft, code = 0xb3c1 */
    public static final Multicodec SKEIN1024_776 = new Multicodec("skein1024-776", Tag.Multihash, 46017, new byte[] {(byte)0xc1, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-784, status = draft, code = 0xb3c2 */
    public static final Multicodec SKEIN1024_784 = new Multicodec("skein1024-784", Tag.Multihash, 46018, new byte[] {(byte)0xc2, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-792, status = draft, code = 0xb3c3 */
    public static final Multicodec SKEIN1024_792 = new Multicodec("skein1024-792", Tag.Multihash, 46019, new byte[] {(byte)0xc3, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-8, Skein1024 consists of 128 output lengths that give different hashes, status = draft, code = 0xb361 */
    public static final Multicodec SKEIN1024_8 = new Multicodec("skein1024-8", Tag.Multihash, 45921, new byte[] {(byte)0xe1, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-80, status = draft, code = 0xb36a */
    public static final Multicodec SKEIN1024_80 = new Multicodec("skein1024-80", Tag.Multihash, 45930, new byte[] {(byte)0xea, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-800, status = draft, code = 0xb3c4 */
    public static final Multicodec SKEIN1024_800 = new Multicodec("skein1024-800", Tag.Multihash, 46020, new byte[] {(byte)0xc4, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-808, status = draft, code = 0xb3c5 */
    public static final Multicodec SKEIN1024_808 = new Multicodec("skein1024-808", Tag.Multihash, 46021, new byte[] {(byte)0xc5, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-816, status = draft, code = 0xb3c6 */
    public static final Multicodec SKEIN1024_816 = new Multicodec("skein1024-816", Tag.Multihash, 46022, new byte[] {(byte)0xc6, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-824, status = draft, code = 0xb3c7 */
    public static final Multicodec SKEIN1024_824 = new Multicodec("skein1024-824", Tag.Multihash, 46023, new byte[] {(byte)0xc7, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-832, status = draft, code = 0xb3c8 */
    public static final Multicodec SKEIN1024_832 = new Multicodec("skein1024-832", Tag.Multihash, 46024, new byte[] {(byte)0xc8, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-840, status = draft, code = 0xb3c9 */
    public static final Multicodec SKEIN1024_840 = new Multicodec("skein1024-840", Tag.Multihash, 46025, new byte[] {(byte)0xc9, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-848, status = draft, code = 0xb3ca */
    public static final Multicodec SKEIN1024_848 = new Multicodec("skein1024-848", Tag.Multihash, 46026, new byte[] {(byte)0xca, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-856, status = draft, code = 0xb3cb */
    public static final Multicodec SKEIN1024_856 = new Multicodec("skein1024-856", Tag.Multihash, 46027, new byte[] {(byte)0xcb, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-864, status = draft, code = 0xb3cc */
    public static final Multicodec SKEIN1024_864 = new Multicodec("skein1024-864", Tag.Multihash, 46028, new byte[] {(byte)0xcc, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-872, status = draft, code = 0xb3cd */
    public static final Multicodec SKEIN1024_872 = new Multicodec("skein1024-872", Tag.Multihash, 46029, new byte[] {(byte)0xcd, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-88, status = draft, code = 0xb36b */
    public static final Multicodec SKEIN1024_88 = new Multicodec("skein1024-88", Tag.Multihash, 45931, new byte[] {(byte)0xeb, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-880, status = draft, code = 0xb3ce */
    public static final Multicodec SKEIN1024_880 = new Multicodec("skein1024-880", Tag.Multihash, 46030, new byte[] {(byte)0xce, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-888, status = draft, code = 0xb3cf */
    public static final Multicodec SKEIN1024_888 = new Multicodec("skein1024-888", Tag.Multihash, 46031, new byte[] {(byte)0xcf, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-896, status = draft, code = 0xb3d0 */
    public static final Multicodec SKEIN1024_896 = new Multicodec("skein1024-896", Tag.Multihash, 46032, new byte[] {(byte)0xd0, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-904, status = draft, code = 0xb3d1 */
    public static final Multicodec SKEIN1024_904 = new Multicodec("skein1024-904", Tag.Multihash, 46033, new byte[] {(byte)0xd1, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-912, status = draft, code = 0xb3d2 */
    public static final Multicodec SKEIN1024_912 = new Multicodec("skein1024-912", Tag.Multihash, 46034, new byte[] {(byte)0xd2, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-920, status = draft, code = 0xb3d3 */
    public static final Multicodec SKEIN1024_920 = new Multicodec("skein1024-920", Tag.Multihash, 46035, new byte[] {(byte)0xd3, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-928, status = draft, code = 0xb3d4 */
    public static final Multicodec SKEIN1024_928 = new Multicodec("skein1024-928", Tag.Multihash, 46036, new byte[] {(byte)0xd4, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-936, status = draft, code = 0xb3d5 */
    public static final Multicodec SKEIN1024_936 = new Multicodec("skein1024-936", Tag.Multihash, 46037, new byte[] {(byte)0xd5, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-944, status = draft, code = 0xb3d6 */
    public static final Multicodec SKEIN1024_944 = new Multicodec("skein1024-944", Tag.Multihash, 46038, new byte[] {(byte)0xd6, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-952, status = draft, code = 0xb3d7 */
    public static final Multicodec SKEIN1024_952 = new Multicodec("skein1024-952", Tag.Multihash, 46039, new byte[] {(byte)0xd7, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-96, status = draft, code = 0xb36c */
    public static final Multicodec SKEIN1024_96 = new Multicodec("skein1024-96", Tag.Multihash, 45932, new byte[] {(byte)0xec, (byte)0xe6, (byte)0x02});

    /** Multihash: skein1024-960, status = draft, code = 0xb3d8 */
    public static final Multicodec SKEIN1024_960 = new Multicodec("skein1024-960", Tag.Multihash, 46040, new byte[] {(byte)0xd8, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-968, status = draft, code = 0xb3d9 */
    public static final Multicodec SKEIN1024_968 = new Multicodec("skein1024-968", Tag.Multihash, 46041, new byte[] {(byte)0xd9, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-976, status = draft, code = 0xb3da */
    public static final Multicodec SKEIN1024_976 = new Multicodec("skein1024-976", Tag.Multihash, 46042, new byte[] {(byte)0xda, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-984, status = draft, code = 0xb3db */
    public static final Multicodec SKEIN1024_984 = new Multicodec("skein1024-984", Tag.Multihash, 46043, new byte[] {(byte)0xdb, (byte)0xe7, (byte)0x02});

    /** Multihash: skein1024-992, status = draft, code = 0xb3dc */
    public static final Multicodec SKEIN1024_992 = new Multicodec("skein1024-992", Tag.Multihash, 46044, new byte[] {(byte)0xdc, (byte)0xe7, (byte)0x02});

    /** Multihash: skein256-104, status = draft, code = 0xb30d */
    public static final Multicodec SKEIN256_104 = new Multicodec("skein256-104", Tag.Multihash, 45837, new byte[] {(byte)0x8d, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-112, status = draft, code = 0xb30e */
    public static final Multicodec SKEIN256_112 = new Multicodec("skein256-112", Tag.Multihash, 45838, new byte[] {(byte)0x8e, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-120, status = draft, code = 0xb30f */
    public static final Multicodec SKEIN256_120 = new Multicodec("skein256-120", Tag.Multihash, 45839, new byte[] {(byte)0x8f, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-128, status = draft, code = 0xb310 */
    public static final Multicodec SKEIN256_128 = new Multicodec("skein256-128", Tag.Multihash, 45840, new byte[] {(byte)0x90, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-136, status = draft, code = 0xb311 */
    public static final Multicodec SKEIN256_136 = new Multicodec("skein256-136", Tag.Multihash, 45841, new byte[] {(byte)0x91, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-144, status = draft, code = 0xb312 */
    public static final Multicodec SKEIN256_144 = new Multicodec("skein256-144", Tag.Multihash, 45842, new byte[] {(byte)0x92, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-152, status = draft, code = 0xb313 */
    public static final Multicodec SKEIN256_152 = new Multicodec("skein256-152", Tag.Multihash, 45843, new byte[] {(byte)0x93, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-16, status = draft, code = 0xb302 */
    public static final Multicodec SKEIN256_16 = new Multicodec("skein256-16", Tag.Multihash, 45826, new byte[] {(byte)0x82, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-160, status = draft, code = 0xb314 */
    public static final Multicodec SKEIN256_160 = new Multicodec("skein256-160", Tag.Multihash, 45844, new byte[] {(byte)0x94, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-168, status = draft, code = 0xb315 */
    public static final Multicodec SKEIN256_168 = new Multicodec("skein256-168", Tag.Multihash, 45845, new byte[] {(byte)0x95, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-176, status = draft, code = 0xb316 */
    public static final Multicodec SKEIN256_176 = new Multicodec("skein256-176", Tag.Multihash, 45846, new byte[] {(byte)0x96, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-184, status = draft, code = 0xb317 */
    public static final Multicodec SKEIN256_184 = new Multicodec("skein256-184", Tag.Multihash, 45847, new byte[] {(byte)0x97, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-192, status = draft, code = 0xb318 */
    public static final Multicodec SKEIN256_192 = new Multicodec("skein256-192", Tag.Multihash, 45848, new byte[] {(byte)0x98, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-200, status = draft, code = 0xb319 */
    public static final Multicodec SKEIN256_200 = new Multicodec("skein256-200", Tag.Multihash, 45849, new byte[] {(byte)0x99, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-208, status = draft, code = 0xb31a */
    public static final Multicodec SKEIN256_208 = new Multicodec("skein256-208", Tag.Multihash, 45850, new byte[] {(byte)0x9a, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-216, status = draft, code = 0xb31b */
    public static final Multicodec SKEIN256_216 = new Multicodec("skein256-216", Tag.Multihash, 45851, new byte[] {(byte)0x9b, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-224, status = draft, code = 0xb31c */
    public static final Multicodec SKEIN256_224 = new Multicodec("skein256-224", Tag.Multihash, 45852, new byte[] {(byte)0x9c, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-232, status = draft, code = 0xb31d */
    public static final Multicodec SKEIN256_232 = new Multicodec("skein256-232", Tag.Multihash, 45853, new byte[] {(byte)0x9d, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-24, status = draft, code = 0xb303 */
    public static final Multicodec SKEIN256_24 = new Multicodec("skein256-24", Tag.Multihash, 45827, new byte[] {(byte)0x83, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-240, status = draft, code = 0xb31e */
    public static final Multicodec SKEIN256_240 = new Multicodec("skein256-240", Tag.Multihash, 45854, new byte[] {(byte)0x9e, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-248, status = draft, code = 0xb31f */
    public static final Multicodec SKEIN256_248 = new Multicodec("skein256-248", Tag.Multihash, 45855, new byte[] {(byte)0x9f, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-256, status = draft, code = 0xb320 */
    public static final Multicodec SKEIN256_256 = new Multicodec("skein256-256", Tag.Multihash, 45856, new byte[] {(byte)0xa0, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-32, status = draft, code = 0xb304 */
    public static final Multicodec SKEIN256_32 = new Multicodec("skein256-32", Tag.Multihash, 45828, new byte[] {(byte)0x84, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-40, status = draft, code = 0xb305 */
    public static final Multicodec SKEIN256_40 = new Multicodec("skein256-40", Tag.Multihash, 45829, new byte[] {(byte)0x85, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-48, status = draft, code = 0xb306 */
    public static final Multicodec SKEIN256_48 = new Multicodec("skein256-48", Tag.Multihash, 45830, new byte[] {(byte)0x86, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-56, status = draft, code = 0xb307 */
    public static final Multicodec SKEIN256_56 = new Multicodec("skein256-56", Tag.Multihash, 45831, new byte[] {(byte)0x87, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-64, status = draft, code = 0xb308 */
    public static final Multicodec SKEIN256_64 = new Multicodec("skein256-64", Tag.Multihash, 45832, new byte[] {(byte)0x88, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-72, status = draft, code = 0xb309 */
    public static final Multicodec SKEIN256_72 = new Multicodec("skein256-72", Tag.Multihash, 45833, new byte[] {(byte)0x89, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-8, Skein256 consists of 32 output lengths that give different hashes, status = draft, code = 0xb301 */
    public static final Multicodec SKEIN256_8 = new Multicodec("skein256-8", Tag.Multihash, 45825, new byte[] {(byte)0x81, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-80, status = draft, code = 0xb30a */
    public static final Multicodec SKEIN256_80 = new Multicodec("skein256-80", Tag.Multihash, 45834, new byte[] {(byte)0x8a, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-88, status = draft, code = 0xb30b */
    public static final Multicodec SKEIN256_88 = new Multicodec("skein256-88", Tag.Multihash, 45835, new byte[] {(byte)0x8b, (byte)0xe6, (byte)0x02});

    /** Multihash: skein256-96, status = draft, code = 0xb30c */
    public static final Multicodec SKEIN256_96 = new Multicodec("skein256-96", Tag.Multihash, 45836, new byte[] {(byte)0x8c, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-104, status = draft, code = 0xb32d */
    public static final Multicodec SKEIN512_104 = new Multicodec("skein512-104", Tag.Multihash, 45869, new byte[] {(byte)0xad, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-112, status = draft, code = 0xb32e */
    public static final Multicodec SKEIN512_112 = new Multicodec("skein512-112", Tag.Multihash, 45870, new byte[] {(byte)0xae, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-120, status = draft, code = 0xb32f */
    public static final Multicodec SKEIN512_120 = new Multicodec("skein512-120", Tag.Multihash, 45871, new byte[] {(byte)0xaf, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-128, status = draft, code = 0xb330 */
    public static final Multicodec SKEIN512_128 = new Multicodec("skein512-128", Tag.Multihash, 45872, new byte[] {(byte)0xb0, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-136, status = draft, code = 0xb331 */
    public static final Multicodec SKEIN512_136 = new Multicodec("skein512-136", Tag.Multihash, 45873, new byte[] {(byte)0xb1, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-144, status = draft, code = 0xb332 */
    public static final Multicodec SKEIN512_144 = new Multicodec("skein512-144", Tag.Multihash, 45874, new byte[] {(byte)0xb2, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-152, status = draft, code = 0xb333 */
    public static final Multicodec SKEIN512_152 = new Multicodec("skein512-152", Tag.Multihash, 45875, new byte[] {(byte)0xb3, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-16, status = draft, code = 0xb322 */
    public static final Multicodec SKEIN512_16 = new Multicodec("skein512-16", Tag.Multihash, 45858, new byte[] {(byte)0xa2, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-160, status = draft, code = 0xb334 */
    public static final Multicodec SKEIN512_160 = new Multicodec("skein512-160", Tag.Multihash, 45876, new byte[] {(byte)0xb4, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-168, status = draft, code = 0xb335 */
    public static final Multicodec SKEIN512_168 = new Multicodec("skein512-168", Tag.Multihash, 45877, new byte[] {(byte)0xb5, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-176, status = draft, code = 0xb336 */
    public static final Multicodec SKEIN512_176 = new Multicodec("skein512-176", Tag.Multihash, 45878, new byte[] {(byte)0xb6, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-184, status = draft, code = 0xb337 */
    public static final Multicodec SKEIN512_184 = new Multicodec("skein512-184", Tag.Multihash, 45879, new byte[] {(byte)0xb7, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-192, status = draft, code = 0xb338 */
    public static final Multicodec SKEIN512_192 = new Multicodec("skein512-192", Tag.Multihash, 45880, new byte[] {(byte)0xb8, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-200, status = draft, code = 0xb339 */
    public static final Multicodec SKEIN512_200 = new Multicodec("skein512-200", Tag.Multihash, 45881, new byte[] {(byte)0xb9, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-208, status = draft, code = 0xb33a */
    public static final Multicodec SKEIN512_208 = new Multicodec("skein512-208", Tag.Multihash, 45882, new byte[] {(byte)0xba, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-216, status = draft, code = 0xb33b */
    public static final Multicodec SKEIN512_216 = new Multicodec("skein512-216", Tag.Multihash, 45883, new byte[] {(byte)0xbb, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-224, status = draft, code = 0xb33c */
    public static final Multicodec SKEIN512_224 = new Multicodec("skein512-224", Tag.Multihash, 45884, new byte[] {(byte)0xbc, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-232, status = draft, code = 0xb33d */
    public static final Multicodec SKEIN512_232 = new Multicodec("skein512-232", Tag.Multihash, 45885, new byte[] {(byte)0xbd, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-24, status = draft, code = 0xb323 */
    public static final Multicodec SKEIN512_24 = new Multicodec("skein512-24", Tag.Multihash, 45859, new byte[] {(byte)0xa3, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-240, status = draft, code = 0xb33e */
    public static final Multicodec SKEIN512_240 = new Multicodec("skein512-240", Tag.Multihash, 45886, new byte[] {(byte)0xbe, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-248, status = draft, code = 0xb33f */
    public static final Multicodec SKEIN512_248 = new Multicodec("skein512-248", Tag.Multihash, 45887, new byte[] {(byte)0xbf, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-256, status = draft, code = 0xb340 */
    public static final Multicodec SKEIN512_256 = new Multicodec("skein512-256", Tag.Multihash, 45888, new byte[] {(byte)0xc0, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-264, status = draft, code = 0xb341 */
    public static final Multicodec SKEIN512_264 = new Multicodec("skein512-264", Tag.Multihash, 45889, new byte[] {(byte)0xc1, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-272, status = draft, code = 0xb342 */
    public static final Multicodec SKEIN512_272 = new Multicodec("skein512-272", Tag.Multihash, 45890, new byte[] {(byte)0xc2, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-280, status = draft, code = 0xb343 */
    public static final Multicodec SKEIN512_280 = new Multicodec("skein512-280", Tag.Multihash, 45891, new byte[] {(byte)0xc3, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-288, status = draft, code = 0xb344 */
    public static final Multicodec SKEIN512_288 = new Multicodec("skein512-288", Tag.Multihash, 45892, new byte[] {(byte)0xc4, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-296, status = draft, code = 0xb345 */
    public static final Multicodec SKEIN512_296 = new Multicodec("skein512-296", Tag.Multihash, 45893, new byte[] {(byte)0xc5, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-304, status = draft, code = 0xb346 */
    public static final Multicodec SKEIN512_304 = new Multicodec("skein512-304", Tag.Multihash, 45894, new byte[] {(byte)0xc6, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-312, status = draft, code = 0xb347 */
    public static final Multicodec SKEIN512_312 = new Multicodec("skein512-312", Tag.Multihash, 45895, new byte[] {(byte)0xc7, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-32, status = draft, code = 0xb324 */
    public static final Multicodec SKEIN512_32 = new Multicodec("skein512-32", Tag.Multihash, 45860, new byte[] {(byte)0xa4, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-320, status = draft, code = 0xb348 */
    public static final Multicodec SKEIN512_320 = new Multicodec("skein512-320", Tag.Multihash, 45896, new byte[] {(byte)0xc8, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-328, status = draft, code = 0xb349 */
    public static final Multicodec SKEIN512_328 = new Multicodec("skein512-328", Tag.Multihash, 45897, new byte[] {(byte)0xc9, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-336, status = draft, code = 0xb34a */
    public static final Multicodec SKEIN512_336 = new Multicodec("skein512-336", Tag.Multihash, 45898, new byte[] {(byte)0xca, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-344, status = draft, code = 0xb34b */
    public static final Multicodec SKEIN512_344 = new Multicodec("skein512-344", Tag.Multihash, 45899, new byte[] {(byte)0xcb, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-352, status = draft, code = 0xb34c */
    public static final Multicodec SKEIN512_352 = new Multicodec("skein512-352", Tag.Multihash, 45900, new byte[] {(byte)0xcc, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-360, status = draft, code = 0xb34d */
    public static final Multicodec SKEIN512_360 = new Multicodec("skein512-360", Tag.Multihash, 45901, new byte[] {(byte)0xcd, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-368, status = draft, code = 0xb34e */
    public static final Multicodec SKEIN512_368 = new Multicodec("skein512-368", Tag.Multihash, 45902, new byte[] {(byte)0xce, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-376, status = draft, code = 0xb34f */
    public static final Multicodec SKEIN512_376 = new Multicodec("skein512-376", Tag.Multihash, 45903, new byte[] {(byte)0xcf, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-384, status = draft, code = 0xb350 */
    public static final Multicodec SKEIN512_384 = new Multicodec("skein512-384", Tag.Multihash, 45904, new byte[] {(byte)0xd0, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-392, status = draft, code = 0xb351 */
    public static final Multicodec SKEIN512_392 = new Multicodec("skein512-392", Tag.Multihash, 45905, new byte[] {(byte)0xd1, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-40, status = draft, code = 0xb325 */
    public static final Multicodec SKEIN512_40 = new Multicodec("skein512-40", Tag.Multihash, 45861, new byte[] {(byte)0xa5, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-400, status = draft, code = 0xb352 */
    public static final Multicodec SKEIN512_400 = new Multicodec("skein512-400", Tag.Multihash, 45906, new byte[] {(byte)0xd2, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-408, status = draft, code = 0xb353 */
    public static final Multicodec SKEIN512_408 = new Multicodec("skein512-408", Tag.Multihash, 45907, new byte[] {(byte)0xd3, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-416, status = draft, code = 0xb354 */
    public static final Multicodec SKEIN512_416 = new Multicodec("skein512-416", Tag.Multihash, 45908, new byte[] {(byte)0xd4, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-424, status = draft, code = 0xb355 */
    public static final Multicodec SKEIN512_424 = new Multicodec("skein512-424", Tag.Multihash, 45909, new byte[] {(byte)0xd5, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-432, status = draft, code = 0xb356 */
    public static final Multicodec SKEIN512_432 = new Multicodec("skein512-432", Tag.Multihash, 45910, new byte[] {(byte)0xd6, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-440, status = draft, code = 0xb357 */
    public static final Multicodec SKEIN512_440 = new Multicodec("skein512-440", Tag.Multihash, 45911, new byte[] {(byte)0xd7, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-448, status = draft, code = 0xb358 */
    public static final Multicodec SKEIN512_448 = new Multicodec("skein512-448", Tag.Multihash, 45912, new byte[] {(byte)0xd8, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-456, status = draft, code = 0xb359 */
    public static final Multicodec SKEIN512_456 = new Multicodec("skein512-456", Tag.Multihash, 45913, new byte[] {(byte)0xd9, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-464, status = draft, code = 0xb35a */
    public static final Multicodec SKEIN512_464 = new Multicodec("skein512-464", Tag.Multihash, 45914, new byte[] {(byte)0xda, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-472, status = draft, code = 0xb35b */
    public static final Multicodec SKEIN512_472 = new Multicodec("skein512-472", Tag.Multihash, 45915, new byte[] {(byte)0xdb, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-48, status = draft, code = 0xb326 */
    public static final Multicodec SKEIN512_48 = new Multicodec("skein512-48", Tag.Multihash, 45862, new byte[] {(byte)0xa6, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-480, status = draft, code = 0xb35c */
    public static final Multicodec SKEIN512_480 = new Multicodec("skein512-480", Tag.Multihash, 45916, new byte[] {(byte)0xdc, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-488, status = draft, code = 0xb35d */
    public static final Multicodec SKEIN512_488 = new Multicodec("skein512-488", Tag.Multihash, 45917, new byte[] {(byte)0xdd, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-496, status = draft, code = 0xb35e */
    public static final Multicodec SKEIN512_496 = new Multicodec("skein512-496", Tag.Multihash, 45918, new byte[] {(byte)0xde, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-504, status = draft, code = 0xb35f */
    public static final Multicodec SKEIN512_504 = new Multicodec("skein512-504", Tag.Multihash, 45919, new byte[] {(byte)0xdf, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-512, status = draft, code = 0xb360 */
    public static final Multicodec SKEIN512_512 = new Multicodec("skein512-512", Tag.Multihash, 45920, new byte[] {(byte)0xe0, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-56, status = draft, code = 0xb327 */
    public static final Multicodec SKEIN512_56 = new Multicodec("skein512-56", Tag.Multihash, 45863, new byte[] {(byte)0xa7, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-64, status = draft, code = 0xb328 */
    public static final Multicodec SKEIN512_64 = new Multicodec("skein512-64", Tag.Multihash, 45864, new byte[] {(byte)0xa8, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-72, status = draft, code = 0xb329 */
    public static final Multicodec SKEIN512_72 = new Multicodec("skein512-72", Tag.Multihash, 45865, new byte[] {(byte)0xa9, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-8, Skein512 consists of 64 output lengths that give different hashes, status = draft, code = 0xb321 */
    public static final Multicodec SKEIN512_8 = new Multicodec("skein512-8", Tag.Multihash, 45857, new byte[] {(byte)0xa1, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-80, status = draft, code = 0xb32a */
    public static final Multicodec SKEIN512_80 = new Multicodec("skein512-80", Tag.Multihash, 45866, new byte[] {(byte)0xaa, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-88, status = draft, code = 0xb32b */
    public static final Multicodec SKEIN512_88 = new Multicodec("skein512-88", Tag.Multihash, 45867, new byte[] {(byte)0xab, (byte)0xe6, (byte)0x02});

    /** Multihash: skein512-96, status = draft, code = 0xb32c */
    public static final Multicodec SKEIN512_96 = new Multicodec("skein512-96", Tag.Multihash, 45868, new byte[] {(byte)0xac, (byte)0xe6, (byte)0x02});

    /** Multihash: sm3-256, status = draft, code = 0x534d */
    public static final Multicodec SM3_256 = new Multicodec("sm3-256", Tag.Multihash, 21325, new byte[] {(byte)0xcd, (byte)0xa6, (byte)0x01});

    /** Multihash: ssz-sha2-256-bmt, SSZ Merkle tree root using SHA2-256 as the hashing function and SSZ serialization for the block binary, status = draft, code = 0xb502 */
    public static final Multicodec SSZ_SHA2_256_BMT = new Multicodec("ssz-sha2-256-bmt", Tag.Multihash, 46338, new byte[] {(byte)0x82, (byte)0xea, (byte)0x02});

    /** Multihash: x11, status = draft, code = 0x1100 */
    public static final Multicodec X11 = new Multicodec("x11", Tag.Multihash, 4352, new byte[] {(byte)0x80, (byte)0x22});

    public static final Map<Long, Multicodec> ALL = new TreeMap<>();

    static {
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
}
