package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec;
import com.apicatalog.multicodec.Multicodec.Tag;

/** Multicodec Registry - generated: Sat Nov 25 23:25:18 CET 2023 */
public class VarsigCodec {

    /** Varsig: bls-12381-g1-sig, G1 signature for BLS-12381-G2, status = draft, code = 0xd0ea */
    public static Multicodec BLS_12381_G1_SIG = new Multicodec("bls-12381-g1-sig", Tag.Varsig, 53482, new byte[] {(byte)0xea, (byte)0xa1, (byte)0x03});

    /** Varsig: bls-12381-g2-sig, G2 signature for BLS-12381-G1, status = draft, code = 0xd0eb */
    public static Multicodec BLS_12381_G2_SIG = new Multicodec("bls-12381-g2-sig", Tag.Varsig, 53483, new byte[] {(byte)0xeb, (byte)0xa1, (byte)0x03});

    /** Varsig: eddsa, Edwards-Curve Digital Signature Algorithm, status = draft, code = 0xd0ed */
    public static Multicodec EDDSA = new Multicodec("eddsa", Tag.Varsig, 53485, new byte[] {(byte)0xed, (byte)0xa1, (byte)0x03});

    /** Varsig: eip-191, EIP-191 Ethereum Signed Data Standard, status = draft, code = 0xd191 */
    public static Multicodec EIP_191 = new Multicodec("eip-191", Tag.Varsig, 53649, new byte[] {(byte)0x91, (byte)0xa3, (byte)0x03});

    /** Varsig: es256, ES256 Signature Algorithm, status = draft, code = 0xd01200 */
    public static Multicodec ES256 = new Multicodec("es256", Tag.Varsig, 13636096, new byte[] {(byte)0x80, (byte)0xa4, (byte)0xc0, (byte)0x06});

    /** Varsig: es256k, ES256K Siganture Algorithm (secp256k1), status = draft, code = 0xd0e7 */
    public static Multicodec ES256K = new Multicodec("es256k", Tag.Varsig, 53479, new byte[] {(byte)0xe7, (byte)0xa1, (byte)0x03});

    /** Varsig: es284, ES384 Signature Algorithm, status = draft, code = 0xd01201 */
    public static Multicodec ES284 = new Multicodec("es284", Tag.Varsig, 13636097, new byte[] {(byte)0x81, (byte)0xa4, (byte)0xc0, (byte)0x06});

    /** Varsig: es512, ES512 Signature Algorithm, status = draft, code = 0xd01202 */
    public static Multicodec ES512 = new Multicodec("es512", Tag.Varsig, 13636098, new byte[] {(byte)0x82, (byte)0xa4, (byte)0xc0, (byte)0x06});

    /** Varsig: nonstandard-sig, Namespace for all not yet standard signature algorithms, status = deprecated, code = 0xd000 */
    public static Multicodec NONSTANDARD_SIG = new Multicodec("nonstandard-sig", Tag.Varsig, 53248, new byte[] {(byte)0x80, (byte)0xa0, (byte)0x03});

    /** Varsig: rs256, RS256 Signature Algorithm, status = draft, code = 0xd01205 */
    public static Multicodec RS256 = new Multicodec("rs256", Tag.Varsig, 13636101, new byte[] {(byte)0x85, (byte)0xa4, (byte)0xc0, (byte)0x06});

    public static Map<Long, Multicodec> ALL = new TreeMap<>();

    static {
      ALL.put(BLS_12381_G1_SIG.code(), BLS_12381_G1_SIG);
      ALL.put(BLS_12381_G2_SIG.code(), BLS_12381_G2_SIG);
      ALL.put(EDDSA.code(), EDDSA);
      ALL.put(EIP_191.code(), EIP_191);
      ALL.put(ES256.code(), ES256);
      ALL.put(ES256K.code(), ES256K);
      ALL.put(ES284.code(), ES284);
      ALL.put(ES512.code(), ES512);
      ALL.put(NONSTANDARD_SIG.code(), NONSTANDARD_SIG);
      ALL.put(RS256.code(), RS256);
    }
}
