package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.time.Instant;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec.Tag;
import com.apicatalog.multicodec.Multicodec;

/** Multicodec Registry - generated: Mon Jul 06 23:31:03 CEST 2026 */
public class VarsigCodec {

    public static final Instant UPDATED = Instant.parse("2026-07-06T21:31:03.634425641Z");

    public static final int BIP340_CODE = 0xd01206;
    /** Varsig: bip340, BIP340 Signature Algorithm, status = draft, code = 0xd01206, uvarint = [0x86, 0xa4, 0xc0, 0x06] */
    public static final Multicodec BIP340 = Multicodec.of("bip340", Tag.Varsig, BIP340_CODE, Multicodec.Status.Draft);

    public static final int BLS12_381_G1_SIG_CODE = 0xd0ea;
    /** Varsig: bls12_381-g1-sig, G1 signature for BLS12-381, status = draft, code = 0xd0ea, uvarint = [0xea, 0xa1, 0x03] */
    public static final Multicodec BLS12_381_G1_SIG = Multicodec.of("bls12_381-g1-sig", Tag.Varsig, BLS12_381_G1_SIG_CODE, Multicodec.Status.Draft);

    public static final int BLS12_381_G2_SIG_CODE = 0xd0eb;
    /** Varsig: bls12_381-g2-sig, G2 signature for BLS12-381, status = draft, code = 0xd0eb, uvarint = [0xeb, 0xa1, 0x03] */
    public static final Multicodec BLS12_381_G2_SIG = Multicodec.of("bls12_381-g2-sig", Tag.Varsig, BLS12_381_G2_SIG_CODE, Multicodec.Status.Draft);

    public static final int EDDSA_CODE = 0xd0ed;
    /** Varsig: eddsa, Edwards-Curve Digital Signature Algorithm, status = draft, code = 0xd0ed, uvarint = [0xed, 0xa1, 0x03] */
    public static final Multicodec EDDSA = Multicodec.of("eddsa", Tag.Varsig, EDDSA_CODE, Multicodec.Status.Draft);

    public static final int EIP_191_CODE = 0xd191;
    /** Varsig: eip-191, EIP-191 Ethereum Signed Data Standard, status = draft, code = 0xd191, uvarint = [0x91, 0xa3, 0x03] */
    public static final Multicodec EIP_191 = Multicodec.of("eip-191", Tag.Varsig, EIP_191_CODE, Multicodec.Status.Draft);

    public static final int ES256_CODE = 0xd01200;
    /** Varsig: es256, ES256 Signature Algorithm, status = draft, code = 0xd01200, uvarint = [0x80, 0xa4, 0xc0, 0x06] */
    public static final Multicodec ES256 = Multicodec.of("es256", Tag.Varsig, ES256_CODE, Multicodec.Status.Draft);

    public static final int ES256K_CODE = 0xd0e7;
    /** Varsig: es256k, ES256K Signature Algorithm (secp256k1), status = draft, code = 0xd0e7, uvarint = [0xe7, 0xa1, 0x03] */
    public static final Multicodec ES256K = Multicodec.of("es256k", Tag.Varsig, ES256K_CODE, Multicodec.Status.Draft);

    public static final int ES384_CODE = 0xd01201;
    /** Varsig: es384, ES384 Signature Algorithm, status = draft, code = 0xd01201, uvarint = [0x81, 0xa4, 0xc0, 0x06] */
    public static final Multicodec ES384 = Multicodec.of("es384", Tag.Varsig, ES384_CODE, Multicodec.Status.Draft);

    public static final int ES512_CODE = 0xd01202;
    /** Varsig: es512, ES512 Signature Algorithm, status = draft, code = 0xd01202, uvarint = [0x82, 0xa4, 0xc0, 0x06] */
    public static final Multicodec ES512 = Multicodec.of("es512", Tag.Varsig, ES512_CODE, Multicodec.Status.Draft);

    public static final int NONSTANDARD_SIG_CODE = 0xd000;
    /** Varsig: nonstandard-sig, Namespace for all not yet standard signature algorithms, status = deprecated, code = 0xd000, uvarint = [0x80, 0xa0, 0x03] */
    public static final Multicodec NONSTANDARD_SIG = Multicodec.of("nonstandard-sig", Tag.Varsig, NONSTANDARD_SIG_CODE, Multicodec.Status.Deprecated);

    public static final int RS256_CODE = 0xd01205;
    /** Varsig: rs256, RS256 Signature Algorithm, status = draft, code = 0xd01205, uvarint = [0x85, 0xa4, 0xc0, 0x06] */
    public static final Multicodec RS256 = Multicodec.of("rs256", Tag.Varsig, RS256_CODE, Multicodec.Status.Draft);

    protected static final Map<Integer,Multicodec> ALL = new TreeMap<>();

    static {
      ALL.put(BIP340_CODE, BIP340);
      ALL.put(BLS12_381_G1_SIG_CODE, BLS12_381_G1_SIG);
      ALL.put(BLS12_381_G2_SIG_CODE, BLS12_381_G2_SIG);
      ALL.put(EDDSA_CODE, EDDSA);
      ALL.put(EIP_191_CODE, EIP_191);
      ALL.put(ES256_CODE, ES256);
      ALL.put(ES256K_CODE, ES256K);
      ALL.put(ES384_CODE, ES384);
      ALL.put(ES512_CODE, ES512);
      ALL.put(NONSTANDARD_SIG_CODE, NONSTANDARD_SIG);
      ALL.put(RS256_CODE, RS256);
    }

    protected VarsigCodec() { /* protected */ }
}
