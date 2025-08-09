package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec.Tag;
import com.apicatalog.multicodec.Multicodec;

/** Multicodec Registry - generated: Sat Aug 09 14:53:59 CEST 2025 */
public class VarsigCodec {

    /** Varsig: bls12_381-g1-sig, G1 signature for BLS12-381, status = draft, code = 0xd0ea */
    public static final Multicodec BLS12_381_G1_SIG = Multicodec.of("bls12_381-g1-sig", Tag.Varsig, 0xd0ea, Multicodec.Status.Draft);

    /** Varsig: bls12_381-g2-sig, G2 signature for BLS12-381, status = draft, code = 0xd0eb */
    public static final Multicodec BLS12_381_G2_SIG = Multicodec.of("bls12_381-g2-sig", Tag.Varsig, 0xd0eb, Multicodec.Status.Draft);

    /** Varsig: eddsa, Edwards-Curve Digital Signature Algorithm, status = draft, code = 0xd0ed */
    public static final Multicodec EDDSA = Multicodec.of("eddsa", Tag.Varsig, 0xd0ed, Multicodec.Status.Draft);

    /** Varsig: eip-191, EIP-191 Ethereum Signed Data Standard, status = draft, code = 0xd191 */
    public static final Multicodec EIP_191 = Multicodec.of("eip-191", Tag.Varsig, 0xd191, Multicodec.Status.Draft);

    /** Varsig: es256, ES256 Signature Algorithm, status = draft, code = 0xd01200 */
    public static final Multicodec ES256 = Multicodec.of("es256", Tag.Varsig, 0xd01200, Multicodec.Status.Draft);

    /** Varsig: es256k, ES256K Signature Algorithm (secp256k1), status = draft, code = 0xd0e7 */
    public static final Multicodec ES256K = Multicodec.of("es256k", Tag.Varsig, 0xd0e7, Multicodec.Status.Draft);

    /** Varsig: es384, ES384 Signature Algorithm, status = draft, code = 0xd01201 */
    public static final Multicodec ES384 = Multicodec.of("es384", Tag.Varsig, 0xd01201, Multicodec.Status.Draft);

    /** Varsig: es512, ES512 Signature Algorithm, status = draft, code = 0xd01202 */
    public static final Multicodec ES512 = Multicodec.of("es512", Tag.Varsig, 0xd01202, Multicodec.Status.Draft);

    /** Varsig: nonstandard-sig, Namespace for all not yet standard signature algorithms, status = deprecated, code = 0xd000 */
    public static final Multicodec NONSTANDARD_SIG = Multicodec.of("nonstandard-sig", Tag.Varsig, 0xd000, Multicodec.Status.Deprecated);

    /** Varsig: rs256, RS256 Signature Algorithm, status = draft, code = 0xd01205 */
    public static final Multicodec RS256 = Multicodec.of("rs256", Tag.Varsig, 0xd01205, Multicodec.Status.Draft);

    protected static final Map<Long,Multicodec> ALL = new TreeMap<>();

    static {
      ALL.put(BLS12_381_G1_SIG.code(), BLS12_381_G1_SIG);
      ALL.put(BLS12_381_G2_SIG.code(), BLS12_381_G2_SIG);
      ALL.put(EDDSA.code(), EDDSA);
      ALL.put(EIP_191.code(), EIP_191);
      ALL.put(ES256.code(), ES256);
      ALL.put(ES256K.code(), ES256K);
      ALL.put(ES384.code(), ES384);
      ALL.put(ES512.code(), ES512);
      ALL.put(NONSTANDARD_SIG.code(), NONSTANDARD_SIG);
      ALL.put(RS256.code(), RS256);
    }

    protected VarsigCodec() { /* protected */ }
}
