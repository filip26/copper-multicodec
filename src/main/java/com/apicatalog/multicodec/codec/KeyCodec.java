package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec.Tag;
import com.apicatalog.multicodec.Multicodec;

/** Multicodec Registry - generated: Tue Jul 29 16:54:27 CEST 2025 */
public class KeyCodec {

    /** Key: aes-128, 128-bit AES symmetric key, status = draft, code = 0xa0 */
    public static final Multicodec AES_128_KEY = Multicodec.of("aes-128", Tag.Key, 0xa0, Multicodec.Status.Draft);

    /** Key: aes-192, 192-bit AES symmetric key, status = draft, code = 0xa1 */
    public static final Multicodec AES_192_KEY = Multicodec.of("aes-192", Tag.Key, 0xa1, Multicodec.Status.Draft);

    /** Key: aes-256, 256-bit AES symmetric key, status = draft, code = 0xa2 */
    public static final Multicodec AES_256_KEY = Multicodec.of("aes-256", Tag.Key, 0xa2, Multicodec.Status.Draft);

    /** Key: bls12_381-g1-priv, BLS12-381 G1 private key, status = draft, code = 0x1309 */
    public static final Multicodec BLS12_381_G1_PRIVATE_KEY = Multicodec.of("bls12_381-g1-priv", Tag.Key, 0x1309, Multicodec.Status.Draft);

    /** Key: bls12_381-g1-priv-share, BLS12-381 G1 private key share, status = draft, code = 0x130e */
    public static final Multicodec BLS12_381_G1_PRIVATE_SHARE_KEY = Multicodec.of("bls12_381-g1-priv-share", Tag.Key, 0x130e, Multicodec.Status.Draft);

    /** Key: bls12_381-g1-pub, BLS12-381 public key in the G1 field, status = draft, code = 0xea */
    public static final Multicodec BLS12_381_G1_PUBLIC_KEY = Multicodec.of("bls12_381-g1-pub", Tag.Key, 0xea, Multicodec.Status.Draft);

    /** Key: bls12_381-g1-pub-share, BLS12-381 G1 public key share, status = draft, code = 0x130c */
    public static final Multicodec BLS12_381_G1_PUBLIC_SHARE_KEY = Multicodec.of("bls12_381-g1-pub-share", Tag.Key, 0x130c, Multicodec.Status.Draft);

    /** Key: bls12_381-g1g2-priv, BLS12-381 G1 and G2 private key, status = draft, code = 0x130b */
    public static final Multicodec BLS12_381_G1G2_PRIVATE_KEY = Multicodec.of("bls12_381-g1g2-priv", Tag.Key, 0x130b, Multicodec.Status.Draft);

    /** Key: bls12_381-g1g2-pub, BLS12-381 concatenated public keys in both the G1 and G2 fields, status = draft, code = 0xee */
    public static final Multicodec BLS12_381_G1G2_PUBLIC_KEY = Multicodec.of("bls12_381-g1g2-pub", Tag.Key, 0xee, Multicodec.Status.Draft);

    /** Key: bls12_381-g2-priv, BLS12-381 G2 private key, status = draft, code = 0x130a */
    public static final Multicodec BLS12_381_G2_PRIVATE_KEY = Multicodec.of("bls12_381-g2-priv", Tag.Key, 0x130a, Multicodec.Status.Draft);

    /** Key: bls12_381-g2-priv-share, BLS12-381 G2 private key share, status = draft, code = 0x130f */
    public static final Multicodec BLS12_381_G2_PRIVATE_SHARE_KEY = Multicodec.of("bls12_381-g2-priv-share", Tag.Key, 0x130f, Multicodec.Status.Draft);

    /** Key: bls12_381-g2-pub, BLS12-381 public key in the G2 field, status = draft, code = 0xeb */
    public static final Multicodec BLS12_381_G2_PUBLIC_KEY = Multicodec.of("bls12_381-g2-pub", Tag.Key, 0xeb, Multicodec.Status.Draft);

    /** Key: bls12_381-g2-pub-share, BLS12-381 G2 public key share, status = draft, code = 0x130d */
    public static final Multicodec BLS12_381_G2_PUBLIC_SHARE_KEY = Multicodec.of("bls12_381-g2-pub-share", Tag.Key, 0x130d, Multicodec.Status.Draft);

    /** Key: chacha-128, 128-bit ChaCha symmetric key, status = draft, code = 0xa3 */
    public static final Multicodec CHACHA_128_KEY = Multicodec.of("chacha-128", Tag.Key, 0xa3, Multicodec.Status.Draft);

    /** Key: chacha-256, 256-bit ChaCha symmetric key, status = draft, code = 0xa4 */
    public static final Multicodec CHACHA_256_KEY = Multicodec.of("chacha-256", Tag.Key, 0xa4, Multicodec.Status.Draft);

    /** Key: ed25519-priv, Ed25519 private key, status = draft, code = 0x1300 */
    public static final Multicodec ED25519_PRIVATE_KEY = Multicodec.of("ed25519-priv", Tag.Key, 0x1300, Multicodec.Status.Draft);

    /** Key: ed25519-pub, Ed25519 public key, status = draft, code = 0xed */
    public static final Multicodec ED25519_PUBLIC_KEY = Multicodec.of("ed25519-pub", Tag.Key, 0xed, Multicodec.Status.Draft);

    /** Key: ed448-pub, Ed448 public Key, status = draft, code = 0x1203 */
    public static final Multicodec ED448_PUBLIC_KEY = Multicodec.of("ed448-pub", Tag.Key, 0x1203, Multicodec.Status.Draft);

    /** Key: jwk_jcs-pub, JSON object containing only the required members of a JWK (RFC 7518 and RFC 7517) representing the public key. Serialisation based on JCS (RFC 8785), status = draft, code = 0xeb51 */
    public static final Multicodec JWK_JCS_PUBLIC_KEY = Multicodec.of("jwk_jcs-pub", Tag.Key, 0xeb51, Multicodec.Status.Draft);

    /** Key: lamport-sha3-256-priv, Lamport private key based on SHA3-256, status = draft, code = 0x1a26 */
    public static final Multicodec LAMPORT_SHA3_256_PRIVATE_KEY = Multicodec.of("lamport-sha3-256-priv", Tag.Key, 0x1a26, Multicodec.Status.Draft);

    /** Key: lamport-sha3-256-priv-share, Lamport private key share based on SHA3-256 and split with Shamir gf256, status = draft, code = 0x1a36 */
    public static final Multicodec LAMPORT_SHA3_256_PRIVATE_SHARE_KEY = Multicodec.of("lamport-sha3-256-priv-share", Tag.Key, 0x1a36, Multicodec.Status.Draft);

    /** Key: lamport-sha3-256-pub, Lamport public key based on SHA3-256, status = draft, code = 0x1a16 */
    public static final Multicodec LAMPORT_SHA3_256_PUBLIC_KEY = Multicodec.of("lamport-sha3-256-pub", Tag.Key, 0x1a16, Multicodec.Status.Draft);

    /** Key: lamport-sha3-384-priv, Lamport private key based on SHA3-384, status = draft, code = 0x1a25 */
    public static final Multicodec LAMPORT_SHA3_384_PRIVATE_KEY = Multicodec.of("lamport-sha3-384-priv", Tag.Key, 0x1a25, Multicodec.Status.Draft);

    /** Key: lamport-sha3-384-priv-share, Lamport private key share based on SHA3-384 and split with Shamir gf256, status = draft, code = 0x1a35 */
    public static final Multicodec LAMPORT_SHA3_384_PRIVATE_SHARE_KEY = Multicodec.of("lamport-sha3-384-priv-share", Tag.Key, 0x1a35, Multicodec.Status.Draft);

    /** Key: lamport-sha3-384-pub, Lamport public key based on SHA3-384, status = draft, code = 0x1a15 */
    public static final Multicodec LAMPORT_SHA3_384_PUBLIC_KEY = Multicodec.of("lamport-sha3-384-pub", Tag.Key, 0x1a15, Multicodec.Status.Draft);

    /** Key: lamport-sha3-512-priv, Lamport private key based on SHA3-512, status = draft, code = 0x1a24 */
    public static final Multicodec LAMPORT_SHA3_512_PRIVATE_KEY = Multicodec.of("lamport-sha3-512-priv", Tag.Key, 0x1a24, Multicodec.Status.Draft);

    /** Key: lamport-sha3-512-priv-share, Lamport private key share based on SHA3-512 and split with Shamir gf256, status = draft, code = 0x1a34 */
    public static final Multicodec LAMPORT_SHA3_512_PRIVATE_SHARE_KEY = Multicodec.of("lamport-sha3-512-priv-share", Tag.Key, 0x1a34, Multicodec.Status.Draft);

    /** Key: lamport-sha3-512-pub, Lamport public key based on SHA3-512, status = draft, code = 0x1a14 */
    public static final Multicodec LAMPORT_SHA3_512_PUBLIC_KEY = Multicodec.of("lamport-sha3-512-pub", Tag.Key, 0x1a14, Multicodec.Status.Draft);

    /** Key: mlkem-1024-pub, ML-KEM 1024 public key; as specified by FIPS 203, status = draft, code = 0x120d */
    public static final Multicodec MLKEM_1024_PUBLIC_KEY = Multicodec.of("mlkem-1024-pub", Tag.Key, 0x120d, Multicodec.Status.Draft);

    /** Key: mlkem-512-pub, ML-KEM 512 public key; as specified by FIPS 203, status = draft, code = 0x120b */
    public static final Multicodec MLKEM_512_PUBLIC_KEY = Multicodec.of("mlkem-512-pub", Tag.Key, 0x120b, Multicodec.Status.Draft);

    /** Key: mlkem-768-pub, ML-KEM 768 public key; as specified by FIPS 203, status = draft, code = 0x120c */
    public static final Multicodec MLKEM_768_PUBLIC_KEY = Multicodec.of("mlkem-768-pub", Tag.Key, 0x120c, Multicodec.Status.Draft);

    /** Key: p256-priv, P-256 private key, status = draft, code = 0x1306 */
    public static final Multicodec P256_PRIVATE_KEY = Multicodec.of("p256-priv", Tag.Key, 0x1306, Multicodec.Status.Draft);

    /** Key: p256-pub, P-256 public Key (compressed), status = draft, code = 0x1200 */
    public static final Multicodec P256_PUBLIC_KEY = Multicodec.of("p256-pub", Tag.Key, 0x1200, Multicodec.Status.Draft);

    /** Key: p384-priv, P-384 private key, status = draft, code = 0x1307 */
    public static final Multicodec P384_PRIVATE_KEY = Multicodec.of("p384-priv", Tag.Key, 0x1307, Multicodec.Status.Draft);

    /** Key: p384-pub, P-384 public Key (compressed), status = draft, code = 0x1201 */
    public static final Multicodec P384_PUBLIC_KEY = Multicodec.of("p384-pub", Tag.Key, 0x1201, Multicodec.Status.Draft);

    /** Key: p521-priv, P-521 private key, status = draft, code = 0x1308 */
    public static final Multicodec P521_PRIVATE_KEY = Multicodec.of("p521-priv", Tag.Key, 0x1308, Multicodec.Status.Draft);

    /** Key: p521-pub, P-521 public Key (compressed), status = draft, code = 0x1202 */
    public static final Multicodec P521_PUBLIC_KEY = Multicodec.of("p521-pub", Tag.Key, 0x1202, Multicodec.Status.Draft);

    /** Key: rsa-priv, RSA private key, status = draft, code = 0x1305 */
    public static final Multicodec RSA_PRIVATE_KEY = Multicodec.of("rsa-priv", Tag.Key, 0x1305, Multicodec.Status.Draft);

    /** Key: rsa-pub, RSA public key. DER-encoded ASN.1 type RSAPublicKey according to IETF RFC 8017 (PKCS #1), status = draft, code = 0x1205 */
    public static final Multicodec RSA_PUBLIC_KEY = Multicodec.of("rsa-pub", Tag.Key, 0x1205, Multicodec.Status.Draft);

    /** Key: secp256k1-priv, Secp256k1 private key, status = draft, code = 0x1301 */
    public static final Multicodec SECP256K1_PRIVATE_KEY = Multicodec.of("secp256k1-priv", Tag.Key, 0x1301, Multicodec.Status.Draft);

    /** Key: secp256k1-pub, Secp256k1 public key (compressed), status = draft, code = 0xe7 */
    public static final Multicodec SECP256K1_PUBLIC_KEY = Multicodec.of("secp256k1-pub", Tag.Key, 0xe7, Multicodec.Status.Draft);

    /** Key: sm2-priv, SM2 private key, status = draft, code = 0x1310 */
    public static final Multicodec SM2_PRIVATE_KEY = Multicodec.of("sm2-priv", Tag.Key, 0x1310, Multicodec.Status.Draft);

    /** Key: sm2-pub, SM2 public key (compressed), status = draft, code = 0x1206 */
    public static final Multicodec SM2_PUBLIC_KEY = Multicodec.of("sm2-pub", Tag.Key, 0x1206, Multicodec.Status.Draft);

    /** Key: sr25519-priv, Sr25519 private key, status = draft, code = 0x1303 */
    public static final Multicodec SR25519_PRIVATE_KEY = Multicodec.of("sr25519-priv", Tag.Key, 0x1303, Multicodec.Status.Draft);

    /** Key: sr25519-pub, Sr25519 public key, status = draft, code = 0xef */
    public static final Multicodec SR25519_PUBLIC_KEY = Multicodec.of("sr25519-pub", Tag.Key, 0xef, Multicodec.Status.Draft);

    /** Key: x25519-priv, Curve25519 private key, status = draft, code = 0x1302 */
    public static final Multicodec X25519_PRIVATE_KEY = Multicodec.of("x25519-priv", Tag.Key, 0x1302, Multicodec.Status.Draft);

    /** Key: x25519-pub, Curve25519 public key, status = draft, code = 0xec */
    public static final Multicodec X25519_PUBLIC_KEY = Multicodec.of("x25519-pub", Tag.Key, 0xec, Multicodec.Status.Draft);

    /** Key: x448-pub, X448 public Key, status = draft, code = 0x1204 */
    public static final Multicodec X448_PUBLIC_KEY = Multicodec.of("x448-pub", Tag.Key, 0x1204, Multicodec.Status.Draft);

    protected static final Map<Long,Multicodec> ALL = new TreeMap<>();

    static {
      ALL.put(AES_128_KEY.code(), AES_128_KEY);
      ALL.put(AES_192_KEY.code(), AES_192_KEY);
      ALL.put(AES_256_KEY.code(), AES_256_KEY);
      ALL.put(BLS12_381_G1_PRIVATE_KEY.code(), BLS12_381_G1_PRIVATE_KEY);
      ALL.put(BLS12_381_G1_PRIVATE_SHARE_KEY.code(), BLS12_381_G1_PRIVATE_SHARE_KEY);
      ALL.put(BLS12_381_G1_PUBLIC_KEY.code(), BLS12_381_G1_PUBLIC_KEY);
      ALL.put(BLS12_381_G1_PUBLIC_SHARE_KEY.code(), BLS12_381_G1_PUBLIC_SHARE_KEY);
      ALL.put(BLS12_381_G1G2_PRIVATE_KEY.code(), BLS12_381_G1G2_PRIVATE_KEY);
      ALL.put(BLS12_381_G1G2_PUBLIC_KEY.code(), BLS12_381_G1G2_PUBLIC_KEY);
      ALL.put(BLS12_381_G2_PRIVATE_KEY.code(), BLS12_381_G2_PRIVATE_KEY);
      ALL.put(BLS12_381_G2_PRIVATE_SHARE_KEY.code(), BLS12_381_G2_PRIVATE_SHARE_KEY);
      ALL.put(BLS12_381_G2_PUBLIC_KEY.code(), BLS12_381_G2_PUBLIC_KEY);
      ALL.put(BLS12_381_G2_PUBLIC_SHARE_KEY.code(), BLS12_381_G2_PUBLIC_SHARE_KEY);
      ALL.put(CHACHA_128_KEY.code(), CHACHA_128_KEY);
      ALL.put(CHACHA_256_KEY.code(), CHACHA_256_KEY);
      ALL.put(ED25519_PRIVATE_KEY.code(), ED25519_PRIVATE_KEY);
      ALL.put(ED25519_PUBLIC_KEY.code(), ED25519_PUBLIC_KEY);
      ALL.put(ED448_PUBLIC_KEY.code(), ED448_PUBLIC_KEY);
      ALL.put(JWK_JCS_PUBLIC_KEY.code(), JWK_JCS_PUBLIC_KEY);
      ALL.put(LAMPORT_SHA3_256_PRIVATE_KEY.code(), LAMPORT_SHA3_256_PRIVATE_KEY);
      ALL.put(LAMPORT_SHA3_256_PRIVATE_SHARE_KEY.code(), LAMPORT_SHA3_256_PRIVATE_SHARE_KEY);
      ALL.put(LAMPORT_SHA3_256_PUBLIC_KEY.code(), LAMPORT_SHA3_256_PUBLIC_KEY);
      ALL.put(LAMPORT_SHA3_384_PRIVATE_KEY.code(), LAMPORT_SHA3_384_PRIVATE_KEY);
      ALL.put(LAMPORT_SHA3_384_PRIVATE_SHARE_KEY.code(), LAMPORT_SHA3_384_PRIVATE_SHARE_KEY);
      ALL.put(LAMPORT_SHA3_384_PUBLIC_KEY.code(), LAMPORT_SHA3_384_PUBLIC_KEY);
      ALL.put(LAMPORT_SHA3_512_PRIVATE_KEY.code(), LAMPORT_SHA3_512_PRIVATE_KEY);
      ALL.put(LAMPORT_SHA3_512_PRIVATE_SHARE_KEY.code(), LAMPORT_SHA3_512_PRIVATE_SHARE_KEY);
      ALL.put(LAMPORT_SHA3_512_PUBLIC_KEY.code(), LAMPORT_SHA3_512_PUBLIC_KEY);
      ALL.put(MLKEM_1024_PUBLIC_KEY.code(), MLKEM_1024_PUBLIC_KEY);
      ALL.put(MLKEM_512_PUBLIC_KEY.code(), MLKEM_512_PUBLIC_KEY);
      ALL.put(MLKEM_768_PUBLIC_KEY.code(), MLKEM_768_PUBLIC_KEY);
      ALL.put(P256_PRIVATE_KEY.code(), P256_PRIVATE_KEY);
      ALL.put(P256_PUBLIC_KEY.code(), P256_PUBLIC_KEY);
      ALL.put(P384_PRIVATE_KEY.code(), P384_PRIVATE_KEY);
      ALL.put(P384_PUBLIC_KEY.code(), P384_PUBLIC_KEY);
      ALL.put(P521_PRIVATE_KEY.code(), P521_PRIVATE_KEY);
      ALL.put(P521_PUBLIC_KEY.code(), P521_PUBLIC_KEY);
      ALL.put(RSA_PRIVATE_KEY.code(), RSA_PRIVATE_KEY);
      ALL.put(RSA_PUBLIC_KEY.code(), RSA_PUBLIC_KEY);
      ALL.put(SECP256K1_PRIVATE_KEY.code(), SECP256K1_PRIVATE_KEY);
      ALL.put(SECP256K1_PUBLIC_KEY.code(), SECP256K1_PUBLIC_KEY);
      ALL.put(SM2_PRIVATE_KEY.code(), SM2_PRIVATE_KEY);
      ALL.put(SM2_PUBLIC_KEY.code(), SM2_PUBLIC_KEY);
      ALL.put(SR25519_PRIVATE_KEY.code(), SR25519_PRIVATE_KEY);
      ALL.put(SR25519_PUBLIC_KEY.code(), SR25519_PUBLIC_KEY);
      ALL.put(X25519_PRIVATE_KEY.code(), X25519_PRIVATE_KEY);
      ALL.put(X25519_PUBLIC_KEY.code(), X25519_PUBLIC_KEY);
      ALL.put(X448_PUBLIC_KEY.code(), X448_PUBLIC_KEY);
    }

    protected KeyCodec() { /* protected */ }
}
