package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.time.Instant;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec.Tag;
import com.apicatalog.multicodec.Multicodec;

/** Multicodec Registry - generated: Sat Jun 20 18:15:55 CEST 2026 */
public class KeyCodec {

    public static final Instant UPDATED = Instant.parse("2026-06-20T16:15:55.198Z");

    public static final long AES_128_KEY_CODE = 0xa0;
    /** Key: aes-128, 128-bit AES symmetric key, status = draft, code = 0xa0, uvarint = [0xa0, 0x01] */
    public static final Multicodec AES_128_KEY = Multicodec.of("aes-128", Tag.Key, AES_128_KEY_CODE, Multicodec.Status.Draft);

    public static final long AES_192_KEY_CODE = 0xa1;
    /** Key: aes-192, 192-bit AES symmetric key, status = draft, code = 0xa1, uvarint = [0xa1, 0x01] */
    public static final Multicodec AES_192_KEY = Multicodec.of("aes-192", Tag.Key, AES_192_KEY_CODE, Multicodec.Status.Draft);

    public static final long AES_256_KEY_CODE = 0xa2;
    /** Key: aes-256, 256-bit AES symmetric key, status = draft, code = 0xa2, uvarint = [0xa2, 0x01] */
    public static final Multicodec AES_256_KEY = Multicodec.of("aes-256", Tag.Key, AES_256_KEY_CODE, Multicodec.Status.Draft);

    public static final long BIP340_PRIVATE_KEY_CODE = 0x1341;
    /** Key: bip340-priv, BIP340 private key, status = draft, code = 0x1341, uvarint = [0xc1, 0x26] */
    public static final Multicodec BIP340_PRIVATE_KEY = Multicodec.of("bip340-priv", Tag.Key, BIP340_PRIVATE_KEY_CODE, Multicodec.Status.Draft);

    public static final long BIP340_PUBLIC_KEY_CODE = 0x1340;
    /** Key: bip340-pub, BIP340 public key, status = draft, code = 0x1340, uvarint = [0xc0, 0x26] */
    public static final Multicodec BIP340_PUBLIC_KEY = Multicodec.of("bip340-pub", Tag.Key, BIP340_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long BLS12_381_G1_PRIVATE_KEY_CODE = 0x1309;
    /** Key: bls12_381-g1-priv, BLS12-381 G1 private key, status = draft, code = 0x1309, uvarint = [0x89, 0x26] */
    public static final Multicodec BLS12_381_G1_PRIVATE_KEY = Multicodec.of("bls12_381-g1-priv", Tag.Key, BLS12_381_G1_PRIVATE_KEY_CODE, Multicodec.Status.Draft);

    public static final long BLS12_381_G1_PRIVATE_SHARE_KEY_CODE = 0x130e;
    /** Key: bls12_381-g1-priv-share, BLS12-381 G1 private key share, status = draft, code = 0x130e, uvarint = [0x8e, 0x26] */
    public static final Multicodec BLS12_381_G1_PRIVATE_SHARE_KEY = Multicodec.of("bls12_381-g1-priv-share", Tag.Key, BLS12_381_G1_PRIVATE_SHARE_KEY_CODE, Multicodec.Status.Draft);

    public static final long BLS12_381_G1_PUBLIC_KEY_CODE = 0xea;
    /** Key: bls12_381-g1-pub, BLS12-381 public key in the G1 field, status = draft, code = 0xea, uvarint = [0xea, 0x01] */
    public static final Multicodec BLS12_381_G1_PUBLIC_KEY = Multicodec.of("bls12_381-g1-pub", Tag.Key, BLS12_381_G1_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long BLS12_381_G1_PUBLIC_SHARE_KEY_CODE = 0x130c;
    /** Key: bls12_381-g1-pub-share, BLS12-381 G1 public key share, status = draft, code = 0x130c, uvarint = [0x8c, 0x26] */
    public static final Multicodec BLS12_381_G1_PUBLIC_SHARE_KEY = Multicodec.of("bls12_381-g1-pub-share", Tag.Key, BLS12_381_G1_PUBLIC_SHARE_KEY_CODE, Multicodec.Status.Draft);

    public static final long BLS12_381_G1G2_PRIVATE_KEY_CODE = 0x130b;
    /** Key: bls12_381-g1g2-priv, BLS12-381 G1 and G2 private key, status = draft, code = 0x130b, uvarint = [0x8b, 0x26] */
    public static final Multicodec BLS12_381_G1G2_PRIVATE_KEY = Multicodec.of("bls12_381-g1g2-priv", Tag.Key, BLS12_381_G1G2_PRIVATE_KEY_CODE, Multicodec.Status.Draft);

    public static final long BLS12_381_G1G2_PUBLIC_KEY_CODE = 0xee;
    /** Key: bls12_381-g1g2-pub, BLS12-381 concatenated public keys in both the G1 and G2 fields, status = draft, code = 0xee, uvarint = [0xee, 0x01] */
    public static final Multicodec BLS12_381_G1G2_PUBLIC_KEY = Multicodec.of("bls12_381-g1g2-pub", Tag.Key, BLS12_381_G1G2_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long BLS12_381_G2_PRIVATE_KEY_CODE = 0x130a;
    /** Key: bls12_381-g2-priv, BLS12-381 G2 private key, status = draft, code = 0x130a, uvarint = [0x8a, 0x26] */
    public static final Multicodec BLS12_381_G2_PRIVATE_KEY = Multicodec.of("bls12_381-g2-priv", Tag.Key, BLS12_381_G2_PRIVATE_KEY_CODE, Multicodec.Status.Draft);

    public static final long BLS12_381_G2_PRIVATE_SHARE_KEY_CODE = 0x130f;
    /** Key: bls12_381-g2-priv-share, BLS12-381 G2 private key share, status = draft, code = 0x130f, uvarint = [0x8f, 0x26] */
    public static final Multicodec BLS12_381_G2_PRIVATE_SHARE_KEY = Multicodec.of("bls12_381-g2-priv-share", Tag.Key, BLS12_381_G2_PRIVATE_SHARE_KEY_CODE, Multicodec.Status.Draft);

    public static final long BLS12_381_G2_PUBLIC_KEY_CODE = 0xeb;
    /** Key: bls12_381-g2-pub, BLS12-381 public key in the G2 field, status = draft, code = 0xeb, uvarint = [0xeb, 0x01] */
    public static final Multicodec BLS12_381_G2_PUBLIC_KEY = Multicodec.of("bls12_381-g2-pub", Tag.Key, BLS12_381_G2_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long BLS12_381_G2_PUBLIC_SHARE_KEY_CODE = 0x130d;
    /** Key: bls12_381-g2-pub-share, BLS12-381 G2 public key share, status = draft, code = 0x130d, uvarint = [0x8d, 0x26] */
    public static final Multicodec BLS12_381_G2_PUBLIC_SHARE_KEY = Multicodec.of("bls12_381-g2-pub-share", Tag.Key, BLS12_381_G2_PUBLIC_SHARE_KEY_CODE, Multicodec.Status.Draft);

    public static final long CHACHA_128_KEY_CODE = 0xa3;
    /** Key: chacha-128, 128-bit ChaCha symmetric key, status = draft, code = 0xa3, uvarint = [0xa3, 0x01] */
    public static final Multicodec CHACHA_128_KEY = Multicodec.of("chacha-128", Tag.Key, CHACHA_128_KEY_CODE, Multicodec.Status.Draft);

    public static final long CHACHA_256_KEY_CODE = 0xa4;
    /** Key: chacha-256, 256-bit ChaCha symmetric key, status = draft, code = 0xa4, uvarint = [0xa4, 0x01] */
    public static final Multicodec CHACHA_256_KEY = Multicodec.of("chacha-256", Tag.Key, CHACHA_256_KEY_CODE, Multicodec.Status.Draft);

    public static final long ED25519_PRIVATE_KEY_CODE = 0x1300;
    /** Key: ed25519-priv, Ed25519 private key, status = draft, code = 0x1300, uvarint = [0x80, 0x26] */
    public static final Multicodec ED25519_PRIVATE_KEY = Multicodec.of("ed25519-priv", Tag.Key, ED25519_PRIVATE_KEY_CODE, Multicodec.Status.Draft);

    public static final long ED25519_PUBLIC_KEY_CODE = 0xed;
    /** Key: ed25519-pub, Ed25519 public key, status = draft, code = 0xed, uvarint = [0xed, 0x01] */
    public static final Multicodec ED25519_PUBLIC_KEY = Multicodec.of("ed25519-pub", Tag.Key, ED25519_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long ED448_PRIVATE_KEY_CODE = 0x1311;
    /** Key: ed448-priv, Ed448 private key, status = draft, code = 0x1311, uvarint = [0x91, 0x26] */
    public static final Multicodec ED448_PRIVATE_KEY = Multicodec.of("ed448-priv", Tag.Key, ED448_PRIVATE_KEY_CODE, Multicodec.Status.Draft);

    public static final long ED448_PUBLIC_KEY_CODE = 0x1203;
    /** Key: ed448-pub, Ed448 public key, status = draft, code = 0x1203, uvarint = [0x83, 0x24] */
    public static final Multicodec ED448_PUBLIC_KEY = Multicodec.of("ed448-pub", Tag.Key, ED448_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long JWK_JCS_PRIVATE_KEY_CODE = 0x1316;
    /** Key: jwk_jcs-priv, JSON object containing only the required members of a JWK (RFC 7518 and RFC 7517) representing the private key. Serialisation based on JCS (RFC 8785), status = draft, code = 0x1316, uvarint = [0x96, 0x26] */
    public static final Multicodec JWK_JCS_PRIVATE_KEY = Multicodec.of("jwk_jcs-priv", Tag.Key, JWK_JCS_PRIVATE_KEY_CODE, Multicodec.Status.Draft);

    public static final long JWK_JCS_PUBLIC_KEY_CODE = 0xeb51;
    /** Key: jwk_jcs-pub, JSON object containing only the required members of a JWK (RFC 7518 and RFC 7517) representing the public key. Serialisation based on JCS (RFC 8785), status = draft, code = 0xeb51, uvarint = [0xd1, 0xd6, 0x03] */
    public static final Multicodec JWK_JCS_PUBLIC_KEY = Multicodec.of("jwk_jcs-pub", Tag.Key, JWK_JCS_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long LAMPORT_SHA3_256_PRIVATE_KEY_CODE = 0x1a26;
    /** Key: lamport-sha3-256-priv, Lamport private key based on SHA3-256, status = draft, code = 0x1a26, uvarint = [0xa6, 0x34] */
    public static final Multicodec LAMPORT_SHA3_256_PRIVATE_KEY = Multicodec.of("lamport-sha3-256-priv", Tag.Key, LAMPORT_SHA3_256_PRIVATE_KEY_CODE, Multicodec.Status.Draft);

    public static final long LAMPORT_SHA3_256_PRIVATE_SHARE_KEY_CODE = 0x1a36;
    /** Key: lamport-sha3-256-priv-share, Lamport private key share based on SHA3-256 and split with Shamir gf256, status = draft, code = 0x1a36, uvarint = [0xb6, 0x34] */
    public static final Multicodec LAMPORT_SHA3_256_PRIVATE_SHARE_KEY = Multicodec.of("lamport-sha3-256-priv-share", Tag.Key, LAMPORT_SHA3_256_PRIVATE_SHARE_KEY_CODE, Multicodec.Status.Draft);

    public static final long LAMPORT_SHA3_256_PUBLIC_KEY_CODE = 0x1a16;
    /** Key: lamport-sha3-256-pub, Lamport public key based on SHA3-256, status = draft, code = 0x1a16, uvarint = [0x96, 0x34] */
    public static final Multicodec LAMPORT_SHA3_256_PUBLIC_KEY = Multicodec.of("lamport-sha3-256-pub", Tag.Key, LAMPORT_SHA3_256_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long LAMPORT_SHA3_384_PRIVATE_KEY_CODE = 0x1a25;
    /** Key: lamport-sha3-384-priv, Lamport private key based on SHA3-384, status = draft, code = 0x1a25, uvarint = [0xa5, 0x34] */
    public static final Multicodec LAMPORT_SHA3_384_PRIVATE_KEY = Multicodec.of("lamport-sha3-384-priv", Tag.Key, LAMPORT_SHA3_384_PRIVATE_KEY_CODE, Multicodec.Status.Draft);

    public static final long LAMPORT_SHA3_384_PRIVATE_SHARE_KEY_CODE = 0x1a35;
    /** Key: lamport-sha3-384-priv-share, Lamport private key share based on SHA3-384 and split with Shamir gf256, status = draft, code = 0x1a35, uvarint = [0xb5, 0x34] */
    public static final Multicodec LAMPORT_SHA3_384_PRIVATE_SHARE_KEY = Multicodec.of("lamport-sha3-384-priv-share", Tag.Key, LAMPORT_SHA3_384_PRIVATE_SHARE_KEY_CODE, Multicodec.Status.Draft);

    public static final long LAMPORT_SHA3_384_PUBLIC_KEY_CODE = 0x1a15;
    /** Key: lamport-sha3-384-pub, Lamport public key based on SHA3-384, status = draft, code = 0x1a15, uvarint = [0x95, 0x34] */
    public static final Multicodec LAMPORT_SHA3_384_PUBLIC_KEY = Multicodec.of("lamport-sha3-384-pub", Tag.Key, LAMPORT_SHA3_384_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long LAMPORT_SHA3_512_PRIVATE_KEY_CODE = 0x1a24;
    /** Key: lamport-sha3-512-priv, Lamport private key based on SHA3-512, status = draft, code = 0x1a24, uvarint = [0xa4, 0x34] */
    public static final Multicodec LAMPORT_SHA3_512_PRIVATE_KEY = Multicodec.of("lamport-sha3-512-priv", Tag.Key, LAMPORT_SHA3_512_PRIVATE_KEY_CODE, Multicodec.Status.Draft);

    public static final long LAMPORT_SHA3_512_PRIVATE_SHARE_KEY_CODE = 0x1a34;
    /** Key: lamport-sha3-512-priv-share, Lamport private key share based on SHA3-512 and split with Shamir gf256, status = draft, code = 0x1a34, uvarint = [0xb4, 0x34] */
    public static final Multicodec LAMPORT_SHA3_512_PRIVATE_SHARE_KEY = Multicodec.of("lamport-sha3-512-priv-share", Tag.Key, LAMPORT_SHA3_512_PRIVATE_SHARE_KEY_CODE, Multicodec.Status.Draft);

    public static final long LAMPORT_SHA3_512_PUBLIC_KEY_CODE = 0x1a14;
    /** Key: lamport-sha3-512-pub, Lamport public key based on SHA3-512, status = draft, code = 0x1a14, uvarint = [0x94, 0x34] */
    public static final Multicodec LAMPORT_SHA3_512_PUBLIC_KEY = Multicodec.of("lamport-sha3-512-pub", Tag.Key, LAMPORT_SHA3_512_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long MLDSA_44_PRIVATE_KEY_CODE = 0x1317;
    /** Key: mldsa-44-priv, ML-DSA 44 private key; expanded key format (2560 bytes) as specified by FIPS 204, status = draft, code = 0x1317, uvarint = [0x97, 0x26] */
    public static final Multicodec MLDSA_44_PRIVATE_KEY = Multicodec.of("mldsa-44-priv", Tag.Key, MLDSA_44_PRIVATE_KEY_CODE, Multicodec.Status.Draft);

    public static final long MLDSA_44_PRIVATE_SEED_KEY_CODE = 0x131a;
    /** Key: mldsa-44-priv-seed, ML-DSA 44 private key seed; (32 bytes) as specified by FIPS 204, status = draft, code = 0x131a, uvarint = [0x9a, 0x26] */
    public static final Multicodec MLDSA_44_PRIVATE_SEED_KEY = Multicodec.of("mldsa-44-priv-seed", Tag.Key, MLDSA_44_PRIVATE_SEED_KEY_CODE, Multicodec.Status.Draft);

    public static final long MLDSA_44_PUBLIC_KEY_CODE = 0x1210;
    /** Key: mldsa-44-pub, ML-DSA 44 public key; as specified by FIPS 204, status = draft, code = 0x1210, uvarint = [0x90, 0x24] */
    public static final Multicodec MLDSA_44_PUBLIC_KEY = Multicodec.of("mldsa-44-pub", Tag.Key, MLDSA_44_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long MLDSA_65_PRIVATE_KEY_CODE = 0x1318;
    /** Key: mldsa-65-priv, ML-DSA 65 private key; expanded key format (4032 bytes) as specified by FIPS 204, status = draft, code = 0x1318, uvarint = [0x98, 0x26] */
    public static final Multicodec MLDSA_65_PRIVATE_KEY = Multicodec.of("mldsa-65-priv", Tag.Key, MLDSA_65_PRIVATE_KEY_CODE, Multicodec.Status.Draft);

    public static final long MLDSA_65_PRIVATE_SEED_KEY_CODE = 0x131b;
    /** Key: mldsa-65-priv-seed, ML-DSA 65 private key seed; (32 bytes) as specified by FIPS 204, status = draft, code = 0x131b, uvarint = [0x9b, 0x26] */
    public static final Multicodec MLDSA_65_PRIVATE_SEED_KEY = Multicodec.of("mldsa-65-priv-seed", Tag.Key, MLDSA_65_PRIVATE_SEED_KEY_CODE, Multicodec.Status.Draft);

    public static final long MLDSA_65_PUBLIC_KEY_CODE = 0x1211;
    /** Key: mldsa-65-pub, ML-DSA 65 public key; as specified by FIPS 204, status = draft, code = 0x1211, uvarint = [0x91, 0x24] */
    public static final Multicodec MLDSA_65_PUBLIC_KEY = Multicodec.of("mldsa-65-pub", Tag.Key, MLDSA_65_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long MLDSA_87_PRIVATE_KEY_CODE = 0x1319;
    /** Key: mldsa-87-priv, ML-DSA 87 private key; expanded key format (4896 bytes) as specified by FIPS 204, status = draft, code = 0x1319, uvarint = [0x99, 0x26] */
    public static final Multicodec MLDSA_87_PRIVATE_KEY = Multicodec.of("mldsa-87-priv", Tag.Key, MLDSA_87_PRIVATE_KEY_CODE, Multicodec.Status.Draft);

    public static final long MLDSA_87_PRIVATE_SEED_KEY_CODE = 0x131c;
    /** Key: mldsa-87-priv-seed, ML-DSA 87 private key seed; (32 bytes) as specified by FIPS 204, status = draft, code = 0x131c, uvarint = [0x9c, 0x26] */
    public static final Multicodec MLDSA_87_PRIVATE_SEED_KEY = Multicodec.of("mldsa-87-priv-seed", Tag.Key, MLDSA_87_PRIVATE_SEED_KEY_CODE, Multicodec.Status.Draft);

    public static final long MLDSA_87_PUBLIC_KEY_CODE = 0x1212;
    /** Key: mldsa-87-pub, ML-DSA 87 public key; as specified by FIPS 204, status = draft, code = 0x1212, uvarint = [0x92, 0x24] */
    public static final Multicodec MLDSA_87_PUBLIC_KEY = Multicodec.of("mldsa-87-pub", Tag.Key, MLDSA_87_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long MLKEM_1024_PRIVATE_KEY_CODE = 0x1315;
    /** Key: mlkem-1024-priv, ML-KEM 1024 private key; as specified by FIPS 203, status = draft, code = 0x1315, uvarint = [0x95, 0x26] */
    public static final Multicodec MLKEM_1024_PRIVATE_KEY = Multicodec.of("mlkem-1024-priv", Tag.Key, MLKEM_1024_PRIVATE_KEY_CODE, Multicodec.Status.Draft);

    public static final long MLKEM_1024_PUBLIC_KEY_CODE = 0x120d;
    /** Key: mlkem-1024-pub, ML-KEM 1024 public key; as specified by FIPS 203, status = draft, code = 0x120d, uvarint = [0x8d, 0x24] */
    public static final Multicodec MLKEM_1024_PUBLIC_KEY = Multicodec.of("mlkem-1024-pub", Tag.Key, MLKEM_1024_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long MLKEM_512_PRIVATE_KEY_CODE = 0x1313;
    /** Key: mlkem-512-priv, ML-KEM 512 private key; as specified by FIPS 203, status = draft, code = 0x1313, uvarint = [0x93, 0x26] */
    public static final Multicodec MLKEM_512_PRIVATE_KEY = Multicodec.of("mlkem-512-priv", Tag.Key, MLKEM_512_PRIVATE_KEY_CODE, Multicodec.Status.Draft);

    public static final long MLKEM_512_PUBLIC_KEY_CODE = 0x120b;
    /** Key: mlkem-512-pub, ML-KEM 512 public key; as specified by FIPS 203, status = draft, code = 0x120b, uvarint = [0x8b, 0x24] */
    public static final Multicodec MLKEM_512_PUBLIC_KEY = Multicodec.of("mlkem-512-pub", Tag.Key, MLKEM_512_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long MLKEM_768_PRIVATE_KEY_CODE = 0x1314;
    /** Key: mlkem-768-priv, ML-KEM 768 private key; as specified by FIPS 203, status = draft, code = 0x1314, uvarint = [0x94, 0x26] */
    public static final Multicodec MLKEM_768_PRIVATE_KEY = Multicodec.of("mlkem-768-priv", Tag.Key, MLKEM_768_PRIVATE_KEY_CODE, Multicodec.Status.Draft);

    public static final long MLKEM_768_PUBLIC_KEY_CODE = 0x120c;
    /** Key: mlkem-768-pub, ML-KEM 768 public key; as specified by FIPS 203, status = draft, code = 0x120c, uvarint = [0x8c, 0x24] */
    public static final Multicodec MLKEM_768_PUBLIC_KEY = Multicodec.of("mlkem-768-pub", Tag.Key, MLKEM_768_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long P256_PRIVATE_KEY_CODE = 0x1306;
    /** Key: p256-priv, P-256 private key, status = draft, code = 0x1306, uvarint = [0x86, 0x26] */
    public static final Multicodec P256_PRIVATE_KEY = Multicodec.of("p256-priv", Tag.Key, P256_PRIVATE_KEY_CODE, Multicodec.Status.Draft);

    public static final long P256_PUBLIC_KEY_CODE = 0x1200;
    /** Key: p256-pub, P-256 public key (compressed), status = draft, code = 0x1200, uvarint = [0x80, 0x24] */
    public static final Multicodec P256_PUBLIC_KEY = Multicodec.of("p256-pub", Tag.Key, P256_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long P384_PRIVATE_KEY_CODE = 0x1307;
    /** Key: p384-priv, P-384 private key, status = draft, code = 0x1307, uvarint = [0x87, 0x26] */
    public static final Multicodec P384_PRIVATE_KEY = Multicodec.of("p384-priv", Tag.Key, P384_PRIVATE_KEY_CODE, Multicodec.Status.Draft);

    public static final long P384_PUBLIC_KEY_CODE = 0x1201;
    /** Key: p384-pub, P-384 public key (compressed), status = draft, code = 0x1201, uvarint = [0x81, 0x24] */
    public static final Multicodec P384_PUBLIC_KEY = Multicodec.of("p384-pub", Tag.Key, P384_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long P521_PRIVATE_KEY_CODE = 0x1308;
    /** Key: p521-priv, P-521 private key, status = draft, code = 0x1308, uvarint = [0x88, 0x26] */
    public static final Multicodec P521_PRIVATE_KEY = Multicodec.of("p521-priv", Tag.Key, P521_PRIVATE_KEY_CODE, Multicodec.Status.Draft);

    public static final long P521_PUBLIC_KEY_CODE = 0x1202;
    /** Key: p521-pub, P-521 public key (compressed), status = draft, code = 0x1202, uvarint = [0x82, 0x24] */
    public static final Multicodec P521_PUBLIC_KEY = Multicodec.of("p521-pub", Tag.Key, P521_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long RSA_PRIVATE_KEY_CODE = 0x1305;
    /** Key: rsa-priv, RSA private key, status = draft, code = 0x1305, uvarint = [0x85, 0x26] */
    public static final Multicodec RSA_PRIVATE_KEY = Multicodec.of("rsa-priv", Tag.Key, RSA_PRIVATE_KEY_CODE, Multicodec.Status.Draft);

    public static final long RSA_PUBLIC_KEY_CODE = 0x1205;
    /** Key: rsa-pub, RSA public key. DER-encoded ASN.1 type RSAPublicKey according to IETF RFC 8017 (PKCS #1), status = draft, code = 0x1205, uvarint = [0x85, 0x24] */
    public static final Multicodec RSA_PUBLIC_KEY = Multicodec.of("rsa-pub", Tag.Key, RSA_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long SECP256K1_PRIVATE_KEY_CODE = 0x1301;
    /** Key: secp256k1-priv, Secp256k1 private key, status = draft, code = 0x1301, uvarint = [0x81, 0x26] */
    public static final Multicodec SECP256K1_PRIVATE_KEY = Multicodec.of("secp256k1-priv", Tag.Key, SECP256K1_PRIVATE_KEY_CODE, Multicodec.Status.Draft);

    public static final long SECP256K1_PUBLIC_KEY_CODE = 0xe7;
    /** Key: secp256k1-pub, Secp256k1 public key (compressed), status = draft, code = 0xe7, uvarint = [0xe7, 0x01] */
    public static final Multicodec SECP256K1_PUBLIC_KEY = Multicodec.of("secp256k1-pub", Tag.Key, SECP256K1_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long SLHDSA_SHA2_128F_PUBLIC_KEY_CODE = 0x1222;
    /** Key: slhdsa-sha2-128f-pub, SLH-DSA-SHA2-128f public key; as specified by FIPS 205, status = draft, code = 0x1222, uvarint = [0xa2, 0x24] */
    public static final Multicodec SLHDSA_SHA2_128F_PUBLIC_KEY = Multicodec.of("slhdsa-sha2-128f-pub", Tag.Key, SLHDSA_SHA2_128F_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long SLHDSA_SHA2_128S_PUBLIC_KEY_CODE = 0x1220;
    /** Key: slhdsa-sha2-128s-pub, SLH-DSA-SHA2-128s public key; as specified by FIPS 205, status = draft, code = 0x1220, uvarint = [0xa0, 0x24] */
    public static final Multicodec SLHDSA_SHA2_128S_PUBLIC_KEY = Multicodec.of("slhdsa-sha2-128s-pub", Tag.Key, SLHDSA_SHA2_128S_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long SLHDSA_SHA2_192F_PUBLIC_KEY_CODE = 0x1226;
    /** Key: slhdsa-sha2-192f-pub, SLH-DSA-SHA2-192f public key; as specified by FIPS 205, status = draft, code = 0x1226, uvarint = [0xa6, 0x24] */
    public static final Multicodec SLHDSA_SHA2_192F_PUBLIC_KEY = Multicodec.of("slhdsa-sha2-192f-pub", Tag.Key, SLHDSA_SHA2_192F_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long SLHDSA_SHA2_192S_PUBLIC_KEY_CODE = 0x1224;
    /** Key: slhdsa-sha2-192s-pub, SLH-DSA-SHA2-192s public key; as specified by FIPS 205, status = draft, code = 0x1224, uvarint = [0xa4, 0x24] */
    public static final Multicodec SLHDSA_SHA2_192S_PUBLIC_KEY = Multicodec.of("slhdsa-sha2-192s-pub", Tag.Key, SLHDSA_SHA2_192S_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long SLHDSA_SHA2_256F_PUBLIC_KEY_CODE = 0x122a;
    /** Key: slhdsa-sha2-256f-pub, SLH-DSA-SHA2-256f public key; as specified by FIPS 205, status = draft, code = 0x122a, uvarint = [0xaa, 0x24] */
    public static final Multicodec SLHDSA_SHA2_256F_PUBLIC_KEY = Multicodec.of("slhdsa-sha2-256f-pub", Tag.Key, SLHDSA_SHA2_256F_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long SLHDSA_SHA2_256S_PUBLIC_KEY_CODE = 0x1228;
    /** Key: slhdsa-sha2-256s-pub, SLH-DSA-SHA2-256s public key; as specified by FIPS 205, status = draft, code = 0x1228, uvarint = [0xa8, 0x24] */
    public static final Multicodec SLHDSA_SHA2_256S_PUBLIC_KEY = Multicodec.of("slhdsa-sha2-256s-pub", Tag.Key, SLHDSA_SHA2_256S_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long SLHDSA_SHAKE_128F_PUBLIC_KEY_CODE = 0x1223;
    /** Key: slhdsa-shake-128f-pub, SLH-DSA-SHAKE-128f public key; as specified by FIPS 205, status = draft, code = 0x1223, uvarint = [0xa3, 0x24] */
    public static final Multicodec SLHDSA_SHAKE_128F_PUBLIC_KEY = Multicodec.of("slhdsa-shake-128f-pub", Tag.Key, SLHDSA_SHAKE_128F_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long SLHDSA_SHAKE_128S_PUBLIC_KEY_CODE = 0x1221;
    /** Key: slhdsa-shake-128s-pub, SLH-DSA-SHAKE-128s public key; as specified by FIPS 205, status = draft, code = 0x1221, uvarint = [0xa1, 0x24] */
    public static final Multicodec SLHDSA_SHAKE_128S_PUBLIC_KEY = Multicodec.of("slhdsa-shake-128s-pub", Tag.Key, SLHDSA_SHAKE_128S_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long SLHDSA_SHAKE_192F_PUBLIC_KEY_CODE = 0x1227;
    /** Key: slhdsa-shake-192f-pub, SLH-DSA-SHAKE-192f public key; as specified by FIPS 205, status = draft, code = 0x1227, uvarint = [0xa7, 0x24] */
    public static final Multicodec SLHDSA_SHAKE_192F_PUBLIC_KEY = Multicodec.of("slhdsa-shake-192f-pub", Tag.Key, SLHDSA_SHAKE_192F_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long SLHDSA_SHAKE_192S_PUBLIC_KEY_CODE = 0x1225;
    /** Key: slhdsa-shake-192s-pub, SLH-DSA-SHAKE-192s public key; as specified by FIPS 205, status = draft, code = 0x1225, uvarint = [0xa5, 0x24] */
    public static final Multicodec SLHDSA_SHAKE_192S_PUBLIC_KEY = Multicodec.of("slhdsa-shake-192s-pub", Tag.Key, SLHDSA_SHAKE_192S_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long SLHDSA_SHAKE_256F_PUBLIC_KEY_CODE = 0x122b;
    /** Key: slhdsa-shake-256f-pub, SLH-DSA-SHAKE-256f public key; as specified by FIPS 205, status = draft, code = 0x122b, uvarint = [0xab, 0x24] */
    public static final Multicodec SLHDSA_SHAKE_256F_PUBLIC_KEY = Multicodec.of("slhdsa-shake-256f-pub", Tag.Key, SLHDSA_SHAKE_256F_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long SLHDSA_SHAKE_256S_PUBLIC_KEY_CODE = 0x1229;
    /** Key: slhdsa-shake-256s-pub, SLH-DSA-SHAKE-256s public key; as specified by FIPS 205, status = draft, code = 0x1229, uvarint = [0xa9, 0x24] */
    public static final Multicodec SLHDSA_SHAKE_256S_PUBLIC_KEY = Multicodec.of("slhdsa-shake-256s-pub", Tag.Key, SLHDSA_SHAKE_256S_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long SM2_PRIVATE_KEY_CODE = 0x1310;
    /** Key: sm2-priv, SM2 private key, status = draft, code = 0x1310, uvarint = [0x90, 0x26] */
    public static final Multicodec SM2_PRIVATE_KEY = Multicodec.of("sm2-priv", Tag.Key, SM2_PRIVATE_KEY_CODE, Multicodec.Status.Draft);

    public static final long SM2_PUBLIC_KEY_CODE = 0x1206;
    /** Key: sm2-pub, SM2 public key (compressed), status = draft, code = 0x1206, uvarint = [0x86, 0x24] */
    public static final Multicodec SM2_PUBLIC_KEY = Multicodec.of("sm2-pub", Tag.Key, SM2_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long SR25519_PRIVATE_KEY_CODE = 0x1303;
    /** Key: sr25519-priv, Sr25519 private key, status = draft, code = 0x1303, uvarint = [0x83, 0x26] */
    public static final Multicodec SR25519_PRIVATE_KEY = Multicodec.of("sr25519-priv", Tag.Key, SR25519_PRIVATE_KEY_CODE, Multicodec.Status.Draft);

    public static final long SR25519_PUBLIC_KEY_CODE = 0xef;
    /** Key: sr25519-pub, Sr25519 public key, status = draft, code = 0xef, uvarint = [0xef, 0x01] */
    public static final Multicodec SR25519_PUBLIC_KEY = Multicodec.of("sr25519-pub", Tag.Key, SR25519_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long X25519_PRIVATE_KEY_CODE = 0x1302;
    /** Key: x25519-priv, Curve25519 private key, status = draft, code = 0x1302, uvarint = [0x82, 0x26] */
    public static final Multicodec X25519_PRIVATE_KEY = Multicodec.of("x25519-priv", Tag.Key, X25519_PRIVATE_KEY_CODE, Multicodec.Status.Draft);

    public static final long X25519_PUBLIC_KEY_CODE = 0xec;
    /** Key: x25519-pub, Curve25519 public key, status = draft, code = 0xec, uvarint = [0xec, 0x01] */
    public static final Multicodec X25519_PUBLIC_KEY = Multicodec.of("x25519-pub", Tag.Key, X25519_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    public static final long X448_PRIVATE_KEY_CODE = 0x1312;
    /** Key: x448-priv, X448 private key, status = draft, code = 0x1312, uvarint = [0x92, 0x26] */
    public static final Multicodec X448_PRIVATE_KEY = Multicodec.of("x448-priv", Tag.Key, X448_PRIVATE_KEY_CODE, Multicodec.Status.Draft);

    public static final long X448_PUBLIC_KEY_CODE = 0x1204;
    /** Key: x448-pub, X448 public key, status = draft, code = 0x1204, uvarint = [0x84, 0x24] */
    public static final Multicodec X448_PUBLIC_KEY = Multicodec.of("x448-pub", Tag.Key, X448_PUBLIC_KEY_CODE, Multicodec.Status.Draft);

    protected static final Map<Long,Multicodec> ALL = new TreeMap<>();

    static {
      ALL.put(AES_128_KEY_CODE, AES_128_KEY);
      ALL.put(AES_192_KEY_CODE, AES_192_KEY);
      ALL.put(AES_256_KEY_CODE, AES_256_KEY);
      ALL.put(BIP340_PRIVATE_KEY_CODE, BIP340_PRIVATE_KEY);
      ALL.put(BIP340_PUBLIC_KEY_CODE, BIP340_PUBLIC_KEY);
      ALL.put(BLS12_381_G1_PRIVATE_KEY_CODE, BLS12_381_G1_PRIVATE_KEY);
      ALL.put(BLS12_381_G1_PRIVATE_SHARE_KEY_CODE, BLS12_381_G1_PRIVATE_SHARE_KEY);
      ALL.put(BLS12_381_G1_PUBLIC_KEY_CODE, BLS12_381_G1_PUBLIC_KEY);
      ALL.put(BLS12_381_G1_PUBLIC_SHARE_KEY_CODE, BLS12_381_G1_PUBLIC_SHARE_KEY);
      ALL.put(BLS12_381_G1G2_PRIVATE_KEY_CODE, BLS12_381_G1G2_PRIVATE_KEY);
      ALL.put(BLS12_381_G1G2_PUBLIC_KEY_CODE, BLS12_381_G1G2_PUBLIC_KEY);
      ALL.put(BLS12_381_G2_PRIVATE_KEY_CODE, BLS12_381_G2_PRIVATE_KEY);
      ALL.put(BLS12_381_G2_PRIVATE_SHARE_KEY_CODE, BLS12_381_G2_PRIVATE_SHARE_KEY);
      ALL.put(BLS12_381_G2_PUBLIC_KEY_CODE, BLS12_381_G2_PUBLIC_KEY);
      ALL.put(BLS12_381_G2_PUBLIC_SHARE_KEY_CODE, BLS12_381_G2_PUBLIC_SHARE_KEY);
      ALL.put(CHACHA_128_KEY_CODE, CHACHA_128_KEY);
      ALL.put(CHACHA_256_KEY_CODE, CHACHA_256_KEY);
      ALL.put(ED25519_PRIVATE_KEY_CODE, ED25519_PRIVATE_KEY);
      ALL.put(ED25519_PUBLIC_KEY_CODE, ED25519_PUBLIC_KEY);
      ALL.put(ED448_PRIVATE_KEY_CODE, ED448_PRIVATE_KEY);
      ALL.put(ED448_PUBLIC_KEY_CODE, ED448_PUBLIC_KEY);
      ALL.put(JWK_JCS_PRIVATE_KEY_CODE, JWK_JCS_PRIVATE_KEY);
      ALL.put(JWK_JCS_PUBLIC_KEY_CODE, JWK_JCS_PUBLIC_KEY);
      ALL.put(LAMPORT_SHA3_256_PRIVATE_KEY_CODE, LAMPORT_SHA3_256_PRIVATE_KEY);
      ALL.put(LAMPORT_SHA3_256_PRIVATE_SHARE_KEY_CODE, LAMPORT_SHA3_256_PRIVATE_SHARE_KEY);
      ALL.put(LAMPORT_SHA3_256_PUBLIC_KEY_CODE, LAMPORT_SHA3_256_PUBLIC_KEY);
      ALL.put(LAMPORT_SHA3_384_PRIVATE_KEY_CODE, LAMPORT_SHA3_384_PRIVATE_KEY);
      ALL.put(LAMPORT_SHA3_384_PRIVATE_SHARE_KEY_CODE, LAMPORT_SHA3_384_PRIVATE_SHARE_KEY);
      ALL.put(LAMPORT_SHA3_384_PUBLIC_KEY_CODE, LAMPORT_SHA3_384_PUBLIC_KEY);
      ALL.put(LAMPORT_SHA3_512_PRIVATE_KEY_CODE, LAMPORT_SHA3_512_PRIVATE_KEY);
      ALL.put(LAMPORT_SHA3_512_PRIVATE_SHARE_KEY_CODE, LAMPORT_SHA3_512_PRIVATE_SHARE_KEY);
      ALL.put(LAMPORT_SHA3_512_PUBLIC_KEY_CODE, LAMPORT_SHA3_512_PUBLIC_KEY);
      ALL.put(MLDSA_44_PRIVATE_KEY_CODE, MLDSA_44_PRIVATE_KEY);
      ALL.put(MLDSA_44_PRIVATE_SEED_KEY_CODE, MLDSA_44_PRIVATE_SEED_KEY);
      ALL.put(MLDSA_44_PUBLIC_KEY_CODE, MLDSA_44_PUBLIC_KEY);
      ALL.put(MLDSA_65_PRIVATE_KEY_CODE, MLDSA_65_PRIVATE_KEY);
      ALL.put(MLDSA_65_PRIVATE_SEED_KEY_CODE, MLDSA_65_PRIVATE_SEED_KEY);
      ALL.put(MLDSA_65_PUBLIC_KEY_CODE, MLDSA_65_PUBLIC_KEY);
      ALL.put(MLDSA_87_PRIVATE_KEY_CODE, MLDSA_87_PRIVATE_KEY);
      ALL.put(MLDSA_87_PRIVATE_SEED_KEY_CODE, MLDSA_87_PRIVATE_SEED_KEY);
      ALL.put(MLDSA_87_PUBLIC_KEY_CODE, MLDSA_87_PUBLIC_KEY);
      ALL.put(MLKEM_1024_PRIVATE_KEY_CODE, MLKEM_1024_PRIVATE_KEY);
      ALL.put(MLKEM_1024_PUBLIC_KEY_CODE, MLKEM_1024_PUBLIC_KEY);
      ALL.put(MLKEM_512_PRIVATE_KEY_CODE, MLKEM_512_PRIVATE_KEY);
      ALL.put(MLKEM_512_PUBLIC_KEY_CODE, MLKEM_512_PUBLIC_KEY);
      ALL.put(MLKEM_768_PRIVATE_KEY_CODE, MLKEM_768_PRIVATE_KEY);
      ALL.put(MLKEM_768_PUBLIC_KEY_CODE, MLKEM_768_PUBLIC_KEY);
      ALL.put(P256_PRIVATE_KEY_CODE, P256_PRIVATE_KEY);
      ALL.put(P256_PUBLIC_KEY_CODE, P256_PUBLIC_KEY);
      ALL.put(P384_PRIVATE_KEY_CODE, P384_PRIVATE_KEY);
      ALL.put(P384_PUBLIC_KEY_CODE, P384_PUBLIC_KEY);
      ALL.put(P521_PRIVATE_KEY_CODE, P521_PRIVATE_KEY);
      ALL.put(P521_PUBLIC_KEY_CODE, P521_PUBLIC_KEY);
      ALL.put(RSA_PRIVATE_KEY_CODE, RSA_PRIVATE_KEY);
      ALL.put(RSA_PUBLIC_KEY_CODE, RSA_PUBLIC_KEY);
      ALL.put(SECP256K1_PRIVATE_KEY_CODE, SECP256K1_PRIVATE_KEY);
      ALL.put(SECP256K1_PUBLIC_KEY_CODE, SECP256K1_PUBLIC_KEY);
      ALL.put(SLHDSA_SHA2_128F_PUBLIC_KEY_CODE, SLHDSA_SHA2_128F_PUBLIC_KEY);
      ALL.put(SLHDSA_SHA2_128S_PUBLIC_KEY_CODE, SLHDSA_SHA2_128S_PUBLIC_KEY);
      ALL.put(SLHDSA_SHA2_192F_PUBLIC_KEY_CODE, SLHDSA_SHA2_192F_PUBLIC_KEY);
      ALL.put(SLHDSA_SHA2_192S_PUBLIC_KEY_CODE, SLHDSA_SHA2_192S_PUBLIC_KEY);
      ALL.put(SLHDSA_SHA2_256F_PUBLIC_KEY_CODE, SLHDSA_SHA2_256F_PUBLIC_KEY);
      ALL.put(SLHDSA_SHA2_256S_PUBLIC_KEY_CODE, SLHDSA_SHA2_256S_PUBLIC_KEY);
      ALL.put(SLHDSA_SHAKE_128F_PUBLIC_KEY_CODE, SLHDSA_SHAKE_128F_PUBLIC_KEY);
      ALL.put(SLHDSA_SHAKE_128S_PUBLIC_KEY_CODE, SLHDSA_SHAKE_128S_PUBLIC_KEY);
      ALL.put(SLHDSA_SHAKE_192F_PUBLIC_KEY_CODE, SLHDSA_SHAKE_192F_PUBLIC_KEY);
      ALL.put(SLHDSA_SHAKE_192S_PUBLIC_KEY_CODE, SLHDSA_SHAKE_192S_PUBLIC_KEY);
      ALL.put(SLHDSA_SHAKE_256F_PUBLIC_KEY_CODE, SLHDSA_SHAKE_256F_PUBLIC_KEY);
      ALL.put(SLHDSA_SHAKE_256S_PUBLIC_KEY_CODE, SLHDSA_SHAKE_256S_PUBLIC_KEY);
      ALL.put(SM2_PRIVATE_KEY_CODE, SM2_PRIVATE_KEY);
      ALL.put(SM2_PUBLIC_KEY_CODE, SM2_PUBLIC_KEY);
      ALL.put(SR25519_PRIVATE_KEY_CODE, SR25519_PRIVATE_KEY);
      ALL.put(SR25519_PUBLIC_KEY_CODE, SR25519_PUBLIC_KEY);
      ALL.put(X25519_PRIVATE_KEY_CODE, X25519_PRIVATE_KEY);
      ALL.put(X25519_PUBLIC_KEY_CODE, X25519_PUBLIC_KEY);
      ALL.put(X448_PRIVATE_KEY_CODE, X448_PRIVATE_KEY);
      ALL.put(X448_PUBLIC_KEY_CODE, X448_PUBLIC_KEY);
    }

    protected KeyCodec() { /* protected */ }
}
