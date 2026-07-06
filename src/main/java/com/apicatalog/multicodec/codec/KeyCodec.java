package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.time.Instant;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec.Tag;
import com.apicatalog.multicodec.Multicodec;

/** Multicodec Registry - generated: Mon Jul 06 23:11:10 CEST 2026 */
public class KeyCodec {

    public static final Instant UPDATED = Instant.parse("2026-07-06T21:11:10.562607319Z");

    /** Key: aes-128, 128-bit AES symmetric key, status = draft, code = 0xa0 */
    public static final Multicodec AES_128 = Multicodec.of("aes-128", Tag.Key, 0xa0, Multicodec.Status.Draft);

    /** Key: aes-192, 192-bit AES symmetric key, status = draft, code = 0xa1 */
    public static final Multicodec AES_192 = Multicodec.of("aes-192", Tag.Key, 0xa1, Multicodec.Status.Draft);

    /** Key: aes-256, 256-bit AES symmetric key, status = draft, code = 0xa2 */
    public static final Multicodec AES_256 = Multicodec.of("aes-256", Tag.Key, 0xa2, Multicodec.Status.Draft);

    /** Key: bip340-priv, BIP340 private key, status = draft, code = 0x1341 */
    public static final Multicodec BIP340_PRIVATE = Multicodec.of("bip340-priv", Tag.Key, 0x1341, Multicodec.Status.Draft);

    /** Key: bip340-pub, BIP340 public key, status = draft, code = 0x1340 */
    public static final Multicodec BIP340_PUBLIC = Multicodec.of("bip340-pub", Tag.Key, 0x1340, Multicodec.Status.Draft);

    /** Key: bls12_381-g1-priv, BLS12-381 G1 private key, status = draft, code = 0x1309 */
    public static final Multicodec BLS12_381_G1_PRIVATE = Multicodec.of("bls12_381-g1-priv", Tag.Key, 0x1309, Multicodec.Status.Draft);

    /** Key: bls12_381-g1-priv-share, BLS12-381 G1 private key share, status = draft, code = 0x130e */
    public static final Multicodec BLS12_381_G1_PRIVATE_SHARE = Multicodec.of("bls12_381-g1-priv-share", Tag.Key, 0x130e, Multicodec.Status.Draft);

    /** Key: bls12_381-g1-pub, BLS12-381 public key in the G1 field, status = draft, code = 0xea */
    public static final Multicodec BLS12_381_G1_PUBLIC = Multicodec.of("bls12_381-g1-pub", Tag.Key, 0xea, Multicodec.Status.Draft);

    /** Key: bls12_381-g1-pub-share, BLS12-381 G1 public key share, status = draft, code = 0x130c */
    public static final Multicodec BLS12_381_G1_PUBLIC_SHARE = Multicodec.of("bls12_381-g1-pub-share", Tag.Key, 0x130c, Multicodec.Status.Draft);

    /** Key: bls12_381-g1g2-priv, BLS12-381 G1 and G2 private key, status = draft, code = 0x130b */
    public static final Multicodec BLS12_381_G1G2_PRIVATE = Multicodec.of("bls12_381-g1g2-priv", Tag.Key, 0x130b, Multicodec.Status.Draft);

    /** Key: bls12_381-g1g2-pub, BLS12-381 concatenated public keys in both the G1 and G2 fields, status = draft, code = 0xee */
    public static final Multicodec BLS12_381_G1G2_PUBLIC = Multicodec.of("bls12_381-g1g2-pub", Tag.Key, 0xee, Multicodec.Status.Draft);

    /** Key: bls12_381-g2-priv, BLS12-381 G2 private key, status = draft, code = 0x130a */
    public static final Multicodec BLS12_381_G2_PRIVATE = Multicodec.of("bls12_381-g2-priv", Tag.Key, 0x130a, Multicodec.Status.Draft);

    /** Key: bls12_381-g2-priv-share, BLS12-381 G2 private key share, status = draft, code = 0x130f */
    public static final Multicodec BLS12_381_G2_PRIVATE_SHARE = Multicodec.of("bls12_381-g2-priv-share", Tag.Key, 0x130f, Multicodec.Status.Draft);

    /** Key: bls12_381-g2-pub, BLS12-381 public key in the G2 field, status = draft, code = 0xeb */
    public static final Multicodec BLS12_381_G2_PUBLIC = Multicodec.of("bls12_381-g2-pub", Tag.Key, 0xeb, Multicodec.Status.Draft);

    /** Key: bls12_381-g2-pub-share, BLS12-381 G2 public key share, status = draft, code = 0x130d */
    public static final Multicodec BLS12_381_G2_PUBLIC_SHARE = Multicodec.of("bls12_381-g2-pub-share", Tag.Key, 0x130d, Multicodec.Status.Draft);

    /** Key: chacha-128, 128-bit ChaCha symmetric key, status = draft, code = 0xa3 */
    public static final Multicodec CHACHA_128 = Multicodec.of("chacha-128", Tag.Key, 0xa3, Multicodec.Status.Draft);

    /** Key: chacha-256, 256-bit ChaCha symmetric key, status = draft, code = 0xa4 */
    public static final Multicodec CHACHA_256 = Multicodec.of("chacha-256", Tag.Key, 0xa4, Multicodec.Status.Draft);

    /** Key: ed25519-priv, Ed25519 private key, status = draft, code = 0x1300 */
    public static final Multicodec ED25519_PRIVATE = Multicodec.of("ed25519-priv", Tag.Key, 0x1300, Multicodec.Status.Draft);

    /** Key: ed25519-pub, Ed25519 public key, status = draft, code = 0xed */
    public static final Multicodec ED25519_PUBLIC = Multicodec.of("ed25519-pub", Tag.Key, 0xed, Multicodec.Status.Draft);

    /** Key: ed448-priv, Ed448 private key, status = draft, code = 0x1311 */
    public static final Multicodec ED448_PRIVATE = Multicodec.of("ed448-priv", Tag.Key, 0x1311, Multicodec.Status.Draft);

    /** Key: ed448-pub, Ed448 public key, status = draft, code = 0x1203 */
    public static final Multicodec ED448_PUBLIC = Multicodec.of("ed448-pub", Tag.Key, 0x1203, Multicodec.Status.Draft);

    /** Key: jwk_jcs-priv, JSON object containing only the required members of a JWK (RFC 7518 and RFC 7517) representing the private key. Serialisation based on JCS (RFC 8785), status = draft, code = 0x1316 */
    public static final Multicodec JWK_JCS_PRIVATE = Multicodec.of("jwk_jcs-priv", Tag.Key, 0x1316, Multicodec.Status.Draft);

    /** Key: jwk_jcs-pub, JSON object containing only the required members of a JWK (RFC 7518 and RFC 7517) representing the public key. Serialisation based on JCS (RFC 8785), status = draft, code = 0xeb51 */
    public static final Multicodec JWK_JCS_PUBLIC = Multicodec.of("jwk_jcs-pub", Tag.Key, 0xeb51, Multicodec.Status.Draft);

    /** Key: lamport-sha3-256-priv, Lamport private key based on SHA3-256, status = draft, code = 0x1a26 */
    public static final Multicodec LAMPORT_SHA3_256_PRIVATE = Multicodec.of("lamport-sha3-256-priv", Tag.Key, 0x1a26, Multicodec.Status.Draft);

    /** Key: lamport-sha3-256-priv-share, Lamport private key share based on SHA3-256 and split with Shamir gf256, status = draft, code = 0x1a36 */
    public static final Multicodec LAMPORT_SHA3_256_PRIVATE_SHARE = Multicodec.of("lamport-sha3-256-priv-share", Tag.Key, 0x1a36, Multicodec.Status.Draft);

    /** Key: lamport-sha3-256-pub, Lamport public key based on SHA3-256, status = draft, code = 0x1a16 */
    public static final Multicodec LAMPORT_SHA3_256_PUBLIC = Multicodec.of("lamport-sha3-256-pub", Tag.Key, 0x1a16, Multicodec.Status.Draft);

    /** Key: lamport-sha3-384-priv, Lamport private key based on SHA3-384, status = draft, code = 0x1a25 */
    public static final Multicodec LAMPORT_SHA3_384_PRIVATE = Multicodec.of("lamport-sha3-384-priv", Tag.Key, 0x1a25, Multicodec.Status.Draft);

    /** Key: lamport-sha3-384-priv-share, Lamport private key share based on SHA3-384 and split with Shamir gf256, status = draft, code = 0x1a35 */
    public static final Multicodec LAMPORT_SHA3_384_PRIVATE_SHARE = Multicodec.of("lamport-sha3-384-priv-share", Tag.Key, 0x1a35, Multicodec.Status.Draft);

    /** Key: lamport-sha3-384-pub, Lamport public key based on SHA3-384, status = draft, code = 0x1a15 */
    public static final Multicodec LAMPORT_SHA3_384_PUBLIC = Multicodec.of("lamport-sha3-384-pub", Tag.Key, 0x1a15, Multicodec.Status.Draft);

    /** Key: lamport-sha3-512-priv, Lamport private key based on SHA3-512, status = draft, code = 0x1a24 */
    public static final Multicodec LAMPORT_SHA3_512_PRIVATE = Multicodec.of("lamport-sha3-512-priv", Tag.Key, 0x1a24, Multicodec.Status.Draft);

    /** Key: lamport-sha3-512-priv-share, Lamport private key share based on SHA3-512 and split with Shamir gf256, status = draft, code = 0x1a34 */
    public static final Multicodec LAMPORT_SHA3_512_PRIVATE_SHARE = Multicodec.of("lamport-sha3-512-priv-share", Tag.Key, 0x1a34, Multicodec.Status.Draft);

    /** Key: lamport-sha3-512-pub, Lamport public key based on SHA3-512, status = draft, code = 0x1a14 */
    public static final Multicodec LAMPORT_SHA3_512_PUBLIC = Multicodec.of("lamport-sha3-512-pub", Tag.Key, 0x1a14, Multicodec.Status.Draft);

    /** Key: mldsa-44-priv, ML-DSA 44 private key; expanded key format (2560 bytes) as specified by FIPS 204, status = draft, code = 0x1317 */
    public static final Multicodec MLDSA_44_PRIVATE = Multicodec.of("mldsa-44-priv", Tag.Key, 0x1317, Multicodec.Status.Draft);

    /** Key: mldsa-44-priv-seed, ML-DSA 44 private key seed; (32 bytes) as specified by FIPS 204, status = draft, code = 0x131a */
    public static final Multicodec MLDSA_44_PRIVATE_SEED = Multicodec.of("mldsa-44-priv-seed", Tag.Key, 0x131a, Multicodec.Status.Draft);

    /** Key: mldsa-44-pub, ML-DSA 44 public key; as specified by FIPS 204, status = draft, code = 0x1210 */
    public static final Multicodec MLDSA_44_PUBLIC = Multicodec.of("mldsa-44-pub", Tag.Key, 0x1210, Multicodec.Status.Draft);

    /** Key: mldsa-65-priv, ML-DSA 65 private key; expanded key format (4032 bytes) as specified by FIPS 204, status = draft, code = 0x1318 */
    public static final Multicodec MLDSA_65_PRIVATE = Multicodec.of("mldsa-65-priv", Tag.Key, 0x1318, Multicodec.Status.Draft);

    /** Key: mldsa-65-priv-seed, ML-DSA 65 private key seed; (32 bytes) as specified by FIPS 204, status = draft, code = 0x131b */
    public static final Multicodec MLDSA_65_PRIVATE_SEED = Multicodec.of("mldsa-65-priv-seed", Tag.Key, 0x131b, Multicodec.Status.Draft);

    /** Key: mldsa-65-pub, ML-DSA 65 public key; as specified by FIPS 204, status = draft, code = 0x1211 */
    public static final Multicodec MLDSA_65_PUBLIC = Multicodec.of("mldsa-65-pub", Tag.Key, 0x1211, Multicodec.Status.Draft);

    /** Key: mldsa-87-priv, ML-DSA 87 private key; expanded key format (4896 bytes) as specified by FIPS 204, status = draft, code = 0x1319 */
    public static final Multicodec MLDSA_87_PRIVATE = Multicodec.of("mldsa-87-priv", Tag.Key, 0x1319, Multicodec.Status.Draft);

    /** Key: mldsa-87-priv-seed, ML-DSA 87 private key seed; (32 bytes) as specified by FIPS 204, status = draft, code = 0x131c */
    public static final Multicodec MLDSA_87_PRIVATE_SEED = Multicodec.of("mldsa-87-priv-seed", Tag.Key, 0x131c, Multicodec.Status.Draft);

    /** Key: mldsa-87-pub, ML-DSA 87 public key; as specified by FIPS 204, status = draft, code = 0x1212 */
    public static final Multicodec MLDSA_87_PUBLIC = Multicodec.of("mldsa-87-pub", Tag.Key, 0x1212, Multicodec.Status.Draft);

    /** Key: mlkem-1024-priv, ML-KEM 1024 private key; as specified by FIPS 203, status = draft, code = 0x1315 */
    public static final Multicodec MLKEM_1024_PRIVATE = Multicodec.of("mlkem-1024-priv", Tag.Key, 0x1315, Multicodec.Status.Draft);

    /** Key: mlkem-1024-pub, ML-KEM 1024 public key; as specified by FIPS 203, status = draft, code = 0x120d */
    public static final Multicodec MLKEM_1024_PUBLIC = Multicodec.of("mlkem-1024-pub", Tag.Key, 0x120d, Multicodec.Status.Draft);

    /** Key: mlkem-512-priv, ML-KEM 512 private key; as specified by FIPS 203, status = draft, code = 0x1313 */
    public static final Multicodec MLKEM_512_PRIVATE = Multicodec.of("mlkem-512-priv", Tag.Key, 0x1313, Multicodec.Status.Draft);

    /** Key: mlkem-512-pub, ML-KEM 512 public key; as specified by FIPS 203, status = draft, code = 0x120b */
    public static final Multicodec MLKEM_512_PUBLIC = Multicodec.of("mlkem-512-pub", Tag.Key, 0x120b, Multicodec.Status.Draft);

    /** Key: mlkem-768-priv, ML-KEM 768 private key; as specified by FIPS 203, status = draft, code = 0x1314 */
    public static final Multicodec MLKEM_768_PRIVATE = Multicodec.of("mlkem-768-priv", Tag.Key, 0x1314, Multicodec.Status.Draft);

    /** Key: mlkem-768-pub, ML-KEM 768 public key; as specified by FIPS 203, status = draft, code = 0x120c */
    public static final Multicodec MLKEM_768_PUBLIC = Multicodec.of("mlkem-768-pub", Tag.Key, 0x120c, Multicodec.Status.Draft);

    /** Key: p256-priv, P-256 private key, status = draft, code = 0x1306 */
    public static final Multicodec P256_PRIVATE = Multicodec.of("p256-priv", Tag.Key, 0x1306, Multicodec.Status.Draft);

    /** Key: p256-pub, P-256 public key (compressed), status = draft, code = 0x1200 */
    public static final Multicodec P256_PUBLIC = Multicodec.of("p256-pub", Tag.Key, 0x1200, Multicodec.Status.Draft);

    /** Key: p384-priv, P-384 private key, status = draft, code = 0x1307 */
    public static final Multicodec P384_PRIVATE = Multicodec.of("p384-priv", Tag.Key, 0x1307, Multicodec.Status.Draft);

    /** Key: p384-pub, P-384 public key (compressed), status = draft, code = 0x1201 */
    public static final Multicodec P384_PUBLIC = Multicodec.of("p384-pub", Tag.Key, 0x1201, Multicodec.Status.Draft);

    /** Key: p521-priv, P-521 private key, status = draft, code = 0x1308 */
    public static final Multicodec P521_PRIVATE = Multicodec.of("p521-priv", Tag.Key, 0x1308, Multicodec.Status.Draft);

    /** Key: p521-pub, P-521 public key (compressed), status = draft, code = 0x1202 */
    public static final Multicodec P521_PUBLIC = Multicodec.of("p521-pub", Tag.Key, 0x1202, Multicodec.Status.Draft);

    /** Key: rsa-priv, RSA private key, status = draft, code = 0x1305 */
    public static final Multicodec RSA_PRIVATE = Multicodec.of("rsa-priv", Tag.Key, 0x1305, Multicodec.Status.Draft);

    /** Key: rsa-pub, RSA public key. DER-encoded ASN.1 type RSAPublicKey according to IETF RFC 8017 (PKCS #1), status = draft, code = 0x1205 */
    public static final Multicodec RSA_PUBLIC = Multicodec.of("rsa-pub", Tag.Key, 0x1205, Multicodec.Status.Draft);

    /** Key: secp256k1-priv, Secp256k1 private key, status = draft, code = 0x1301 */
    public static final Multicodec SECP256K1_PRIVATE = Multicodec.of("secp256k1-priv", Tag.Key, 0x1301, Multicodec.Status.Draft);

    /** Key: secp256k1-pub, Secp256k1 public key (compressed), status = draft, code = 0xe7 */
    public static final Multicodec SECP256K1_PUBLIC = Multicodec.of("secp256k1-pub", Tag.Key, 0xe7, Multicodec.Status.Draft);

    /** Key: slhdsa-sha2-128f-priv, SLH-DSA-SHA2-128f private key; as specified by FIPS 205, status = draft, code = 0x131f */
    public static final Multicodec SLHDSA_SHA2_128F_PRIVATE = Multicodec.of("slhdsa-sha2-128f-priv", Tag.Key, 0x131f, Multicodec.Status.Draft);

    /** Key: slhdsa-sha2-128f-pub, SLH-DSA-SHA2-128f public key; as specified by FIPS 205, status = draft, code = 0x1222 */
    public static final Multicodec SLHDSA_SHA2_128F_PUBLIC = Multicodec.of("slhdsa-sha2-128f-pub", Tag.Key, 0x1222, Multicodec.Status.Draft);

    /** Key: slhdsa-sha2-128s-priv, SLH-DSA-SHA2-128s private key; as specified by FIPS 205, status = draft, code = 0x131d */
    public static final Multicodec SLHDSA_SHA2_128S_PRIVATE = Multicodec.of("slhdsa-sha2-128s-priv", Tag.Key, 0x131d, Multicodec.Status.Draft);

    public static final int SLHDSA_SHA2_128S_PRIVATE_CODE = 0x131d;
    
    /** Key: slhdsa-sha2-128s-pub, SLH-DSA-SHA2-128s public key; as specified by FIPS 205, status = draft, code = 0x1220 */
    public static final Multicodec SLHDSA_SHA2_128S_PUBLIC = Multicodec.of("slhdsa-sha2-128s-pub", Tag.Key, 0x1220, Multicodec.Status.Draft);

    /** Key: slhdsa-sha2-192f-priv, SLH-DSA-SHA2-192f private key; as specified by FIPS 205, status = draft, code = 0x1323 */
    public static final Multicodec SLHDSA_SHA2_192F_PRIVATE = Multicodec.of("slhdsa-sha2-192f-priv", Tag.Key, 0x1323, Multicodec.Status.Draft);

    /** Key: slhdsa-sha2-192f-pub, SLH-DSA-SHA2-192f public key; as specified by FIPS 205, status = draft, code = 0x1226 */
    public static final Multicodec SLHDSA_SHA2_192F_PUBLIC = Multicodec.of("slhdsa-sha2-192f-pub", Tag.Key, 0x1226, Multicodec.Status.Draft);

    /** Key: slhdsa-sha2-192s-priv, SLH-DSA-SHA2-192s private key; as specified by FIPS 205, status = draft, code = 0x1321 */
    public static final Multicodec SLHDSA_SHA2_192S_PRIVATE = Multicodec.of("slhdsa-sha2-192s-priv", Tag.Key, 0x1321, Multicodec.Status.Draft);

    /** Key: slhdsa-sha2-192s-pub, SLH-DSA-SHA2-192s public key; as specified by FIPS 205, status = draft, code = 0x1224 */
    public static final Multicodec SLHDSA_SHA2_192S_PUBLIC = Multicodec.of("slhdsa-sha2-192s-pub", Tag.Key, 0x1224, Multicodec.Status.Draft);

    /** Key: slhdsa-sha2-256f-priv, SLH-DSA-SHA2-256f private key; as specified by FIPS 205, status = draft, code = 0x1327 */
    public static final Multicodec SLHDSA_SHA2_256F_PRIVATE = Multicodec.of("slhdsa-sha2-256f-priv", Tag.Key, 0x1327, Multicodec.Status.Draft);

    /** Key: slhdsa-sha2-256f-pub, SLH-DSA-SHA2-256f public key; as specified by FIPS 205, status = draft, code = 0x122a */
    public static final Multicodec SLHDSA_SHA2_256F_PUBLIC = Multicodec.of("slhdsa-sha2-256f-pub", Tag.Key, 0x122a, Multicodec.Status.Draft);

    /** Key: slhdsa-sha2-256s-priv, SLH-DSA-SHA2-256s private key; as specified by FIPS 205, status = draft, code = 0x1325 */
    public static final Multicodec SLHDSA_SHA2_256S_PRIVATE = Multicodec.of("slhdsa-sha2-256s-priv", Tag.Key, 0x1325, Multicodec.Status.Draft);

    /** Key: slhdsa-sha2-256s-pub, SLH-DSA-SHA2-256s public key; as specified by FIPS 205, status = draft, code = 0x1228 */
    public static final Multicodec SLHDSA_SHA2_256S_PUBLIC = Multicodec.of("slhdsa-sha2-256s-pub", Tag.Key, 0x1228, Multicodec.Status.Draft);

    /** Key: slhdsa-shake-128f-priv, SLH-DSA-SHAKE-128f private key; as specified by FIPS 205, status = draft, code = 0x1320 */
    public static final Multicodec SLHDSA_SHAKE_128F_PRIVATE = Multicodec.of("slhdsa-shake-128f-priv", Tag.Key, 0x1320, Multicodec.Status.Draft);

    /** Key: slhdsa-shake-128f-pub, SLH-DSA-SHAKE-128f public key; as specified by FIPS 205, status = draft, code = 0x1223 */
    public static final Multicodec SLHDSA_SHAKE_128F_PUBLIC = Multicodec.of("slhdsa-shake-128f-pub", Tag.Key, 0x1223, Multicodec.Status.Draft);

    /** Key: slhdsa-shake-128s-priv, SLH-DSA-SHAKE-128s private key; as specified by FIPS 205, status = draft, code = 0x131e */
    public static final Multicodec SLHDSA_SHAKE_128S_PRIVATE = Multicodec.of("slhdsa-shake-128s-priv", Tag.Key, 0x131e, Multicodec.Status.Draft);

    /** Key: slhdsa-shake-128s-pub, SLH-DSA-SHAKE-128s public key; as specified by FIPS 205, status = draft, code = 0x1221 */
    public static final Multicodec SLHDSA_SHAKE_128S_PUBLIC = Multicodec.of("slhdsa-shake-128s-pub", Tag.Key, 0x1221, Multicodec.Status.Draft);

    /** Key: slhdsa-shake-192f-priv, SLH-DSA-SHAKE-192f private key; as specified by FIPS 205, status = draft, code = 0x1324 */
    public static final Multicodec SLHDSA_SHAKE_192F_PRIVATE = Multicodec.of("slhdsa-shake-192f-priv", Tag.Key, 0x1324, Multicodec.Status.Draft);

    /** Key: slhdsa-shake-192f-pub, SLH-DSA-SHAKE-192f public key; as specified by FIPS 205, status = draft, code = 0x1227 */
    public static final Multicodec SLHDSA_SHAKE_192F_PUBLIC = Multicodec.of("slhdsa-shake-192f-pub", Tag.Key, 0x1227, Multicodec.Status.Draft);

    /** Key: slhdsa-shake-192s-priv, SLH-DSA-SHAKE-192s private key; as specified by FIPS 205, status = draft, code = 0x1322 */
    public static final Multicodec SLHDSA_SHAKE_192S_PRIVATE = Multicodec.of("slhdsa-shake-192s-priv", Tag.Key, 0x1322, Multicodec.Status.Draft);

    /** Key: slhdsa-shake-192s-pub, SLH-DSA-SHAKE-192s public key; as specified by FIPS 205, status = draft, code = 0x1225 */
    public static final Multicodec SLHDSA_SHAKE_192S_PUBLIC = Multicodec.of("slhdsa-shake-192s-pub", Tag.Key, 0x1225, Multicodec.Status.Draft);

    /** Key: slhdsa-shake-256f-priv, SLH-DSA-SHAKE-256f private key; as specified by FIPS 205, status = draft, code = 0x1328 */
    public static final Multicodec SLHDSA_SHAKE_256F_PRIVATE = Multicodec.of("slhdsa-shake-256f-priv", Tag.Key, 0x1328, Multicodec.Status.Draft);

    /** Key: slhdsa-shake-256f-pub, SLH-DSA-SHAKE-256f public key; as specified by FIPS 205, status = draft, code = 0x122b */
    public static final Multicodec SLHDSA_SHAKE_256F_PUBLIC = Multicodec.of("slhdsa-shake-256f-pub", Tag.Key, 0x122b, Multicodec.Status.Draft);

    /** Key: slhdsa-shake-256s-priv, SLH-DSA-SHAKE-256s private key; as specified by FIPS 205, status = draft, code = 0x1326 */
    public static final Multicodec SLHDSA_SHAKE_256S_PRIVATE = Multicodec.of("slhdsa-shake-256s-priv", Tag.Key, 0x1326, Multicodec.Status.Draft);

    /** Key: slhdsa-shake-256s-pub, SLH-DSA-SHAKE-256s public key; as specified by FIPS 205, status = draft, code = 0x1229 */
    public static final Multicodec SLHDSA_SHAKE_256S_PUBLIC = Multicodec.of("slhdsa-shake-256s-pub", Tag.Key, 0x1229, Multicodec.Status.Draft);

    /** Key: sm2-priv, SM2 private key, status = draft, code = 0x1310 */
    public static final Multicodec SM2_PRIVATE = Multicodec.of("sm2-priv", Tag.Key, 0x1310, Multicodec.Status.Draft);

    /** Key: sm2-pub, SM2 public key (compressed), status = draft, code = 0x1206 */
    public static final Multicodec SM2_PUBLIC = Multicodec.of("sm2-pub", Tag.Key, 0x1206, Multicodec.Status.Draft);

    /** Key: sr25519-priv, Sr25519 private key, status = draft, code = 0x1303 */
    public static final Multicodec SR25519_PRIVATE = Multicodec.of("sr25519-priv", Tag.Key, 0x1303, Multicodec.Status.Draft);

    /** Key: sr25519-pub, Sr25519 public key, status = draft, code = 0xef */
    public static final Multicodec SR25519_PUBLIC = Multicodec.of("sr25519-pub", Tag.Key, 0xef, Multicodec.Status.Draft);

    /** Key: x25519-priv, Curve25519 private key, status = draft, code = 0x1302 */
    public static final Multicodec X25519_PRIVATE = Multicodec.of("x25519-priv", Tag.Key, 0x1302, Multicodec.Status.Draft);

    /** Key: x25519-pub, Curve25519 public key, status = draft, code = 0xec */
    public static final Multicodec X25519_PUBLIC = Multicodec.of("x25519-pub", Tag.Key, 0xec, Multicodec.Status.Draft);

    /** Key: x448-priv, X448 private key, status = draft, code = 0x1312 */
    public static final Multicodec X448_PRIVATE = Multicodec.of("x448-priv", Tag.Key, 0x1312, Multicodec.Status.Draft);

    /** Key: x448-pub, X448 public key, status = draft, code = 0x1204 */
    public static final Multicodec X448_PUBLIC = Multicodec.of("x448-pub", Tag.Key, 0x1204, Multicodec.Status.Draft);

    protected static final Map<Integer,Multicodec> ALL = new TreeMap<>();

    static {
      ALL.put(AES_128.code(), AES_128);
      ALL.put(AES_192.code(), AES_192);
      ALL.put(AES_256.code(), AES_256);
      ALL.put(BIP340_PRIVATE.code(), BIP340_PRIVATE);
      ALL.put(BIP340_PUBLIC.code(), BIP340_PUBLIC);
      ALL.put(BLS12_381_G1_PRIVATE.code(), BLS12_381_G1_PRIVATE);
      ALL.put(BLS12_381_G1_PRIVATE_SHARE.code(), BLS12_381_G1_PRIVATE_SHARE);
      ALL.put(BLS12_381_G1_PUBLIC.code(), BLS12_381_G1_PUBLIC);
      ALL.put(BLS12_381_G1_PUBLIC_SHARE.code(), BLS12_381_G1_PUBLIC_SHARE);
      ALL.put(BLS12_381_G1G2_PRIVATE.code(), BLS12_381_G1G2_PRIVATE);
      ALL.put(BLS12_381_G1G2_PUBLIC.code(), BLS12_381_G1G2_PUBLIC);
      ALL.put(BLS12_381_G2_PRIVATE.code(), BLS12_381_G2_PRIVATE);
      ALL.put(BLS12_381_G2_PRIVATE_SHARE.code(), BLS12_381_G2_PRIVATE_SHARE);
      ALL.put(BLS12_381_G2_PUBLIC.code(), BLS12_381_G2_PUBLIC);
      ALL.put(BLS12_381_G2_PUBLIC_SHARE.code(), BLS12_381_G2_PUBLIC_SHARE);
      ALL.put(CHACHA_128.code(), CHACHA_128);
      ALL.put(CHACHA_256.code(), CHACHA_256);
      ALL.put(ED25519_PRIVATE.code(), ED25519_PRIVATE);
      ALL.put(ED25519_PUBLIC.code(), ED25519_PUBLIC);
      ALL.put(ED448_PRIVATE.code(), ED448_PRIVATE);
      ALL.put(ED448_PUBLIC.code(), ED448_PUBLIC);
      ALL.put(JWK_JCS_PRIVATE.code(), JWK_JCS_PRIVATE);
      ALL.put(JWK_JCS_PUBLIC.code(), JWK_JCS_PUBLIC);
      ALL.put(LAMPORT_SHA3_256_PRIVATE.code(), LAMPORT_SHA3_256_PRIVATE);
      ALL.put(LAMPORT_SHA3_256_PRIVATE_SHARE.code(), LAMPORT_SHA3_256_PRIVATE_SHARE);
      ALL.put(LAMPORT_SHA3_256_PUBLIC.code(), LAMPORT_SHA3_256_PUBLIC);
      ALL.put(LAMPORT_SHA3_384_PRIVATE.code(), LAMPORT_SHA3_384_PRIVATE);
      ALL.put(LAMPORT_SHA3_384_PRIVATE_SHARE.code(), LAMPORT_SHA3_384_PRIVATE_SHARE);
      ALL.put(LAMPORT_SHA3_384_PUBLIC.code(), LAMPORT_SHA3_384_PUBLIC);
      ALL.put(LAMPORT_SHA3_512_PRIVATE.code(), LAMPORT_SHA3_512_PRIVATE);
      ALL.put(LAMPORT_SHA3_512_PRIVATE_SHARE.code(), LAMPORT_SHA3_512_PRIVATE_SHARE);
      ALL.put(LAMPORT_SHA3_512_PUBLIC.code(), LAMPORT_SHA3_512_PUBLIC);
      ALL.put(MLDSA_44_PRIVATE.code(), MLDSA_44_PRIVATE);
      ALL.put(MLDSA_44_PRIVATE_SEED.code(), MLDSA_44_PRIVATE_SEED);
      ALL.put(MLDSA_44_PUBLIC.code(), MLDSA_44_PUBLIC);
      ALL.put(MLDSA_65_PRIVATE.code(), MLDSA_65_PRIVATE);
      ALL.put(MLDSA_65_PRIVATE_SEED.code(), MLDSA_65_PRIVATE_SEED);
      ALL.put(MLDSA_65_PUBLIC.code(), MLDSA_65_PUBLIC);
      ALL.put(MLDSA_87_PRIVATE.code(), MLDSA_87_PRIVATE);
      ALL.put(MLDSA_87_PRIVATE_SEED.code(), MLDSA_87_PRIVATE_SEED);
      ALL.put(MLDSA_87_PUBLIC.code(), MLDSA_87_PUBLIC);
      ALL.put(MLKEM_1024_PRIVATE.code(), MLKEM_1024_PRIVATE);
      ALL.put(MLKEM_1024_PUBLIC.code(), MLKEM_1024_PUBLIC);
      ALL.put(MLKEM_512_PRIVATE.code(), MLKEM_512_PRIVATE);
      ALL.put(MLKEM_512_PUBLIC.code(), MLKEM_512_PUBLIC);
      ALL.put(MLKEM_768_PRIVATE.code(), MLKEM_768_PRIVATE);
      ALL.put(MLKEM_768_PUBLIC.code(), MLKEM_768_PUBLIC);
      ALL.put(P256_PRIVATE.code(), P256_PRIVATE);
      ALL.put(P256_PUBLIC.code(), P256_PUBLIC);
      ALL.put(P384_PRIVATE.code(), P384_PRIVATE);
      ALL.put(P384_PUBLIC.code(), P384_PUBLIC);
      ALL.put(P521_PRIVATE.code(), P521_PRIVATE);
      ALL.put(P521_PUBLIC.code(), P521_PUBLIC);
      ALL.put(RSA_PRIVATE.code(), RSA_PRIVATE);
      ALL.put(RSA_PUBLIC.code(), RSA_PUBLIC);
      ALL.put(SECP256K1_PRIVATE.code(), SECP256K1_PRIVATE);
      ALL.put(SECP256K1_PUBLIC.code(), SECP256K1_PUBLIC);
      ALL.put(SLHDSA_SHA2_128F_PRIVATE.code(), SLHDSA_SHA2_128F_PRIVATE);
      ALL.put(SLHDSA_SHA2_128F_PUBLIC.code(), SLHDSA_SHA2_128F_PUBLIC);
      ALL.put(SLHDSA_SHA2_128S_PRIVATE.code(), SLHDSA_SHA2_128S_PRIVATE);
      ALL.put(SLHDSA_SHA2_128S_PUBLIC.code(), SLHDSA_SHA2_128S_PUBLIC);
      ALL.put(SLHDSA_SHA2_192F_PRIVATE.code(), SLHDSA_SHA2_192F_PRIVATE);
      ALL.put(SLHDSA_SHA2_192F_PUBLIC.code(), SLHDSA_SHA2_192F_PUBLIC);
      ALL.put(SLHDSA_SHA2_192S_PRIVATE.code(), SLHDSA_SHA2_192S_PRIVATE);
      ALL.put(SLHDSA_SHA2_192S_PUBLIC.code(), SLHDSA_SHA2_192S_PUBLIC);
      ALL.put(SLHDSA_SHA2_256F_PRIVATE.code(), SLHDSA_SHA2_256F_PRIVATE);
      ALL.put(SLHDSA_SHA2_256F_PUBLIC.code(), SLHDSA_SHA2_256F_PUBLIC);
      ALL.put(SLHDSA_SHA2_256S_PRIVATE.code(), SLHDSA_SHA2_256S_PRIVATE);
      ALL.put(SLHDSA_SHA2_256S_PUBLIC.code(), SLHDSA_SHA2_256S_PUBLIC);
      ALL.put(SLHDSA_SHAKE_128F_PRIVATE.code(), SLHDSA_SHAKE_128F_PRIVATE);
      ALL.put(SLHDSA_SHAKE_128F_PUBLIC.code(), SLHDSA_SHAKE_128F_PUBLIC);
      ALL.put(SLHDSA_SHAKE_128S_PRIVATE.code(), SLHDSA_SHAKE_128S_PRIVATE);
      ALL.put(SLHDSA_SHAKE_128S_PUBLIC.code(), SLHDSA_SHAKE_128S_PUBLIC);
      ALL.put(SLHDSA_SHAKE_192F_PRIVATE.code(), SLHDSA_SHAKE_192F_PRIVATE);
      ALL.put(SLHDSA_SHAKE_192F_PUBLIC.code(), SLHDSA_SHAKE_192F_PUBLIC);
      ALL.put(SLHDSA_SHAKE_192S_PRIVATE.code(), SLHDSA_SHAKE_192S_PRIVATE);
      ALL.put(SLHDSA_SHAKE_192S_PUBLIC.code(), SLHDSA_SHAKE_192S_PUBLIC);
      ALL.put(SLHDSA_SHAKE_256F_PRIVATE.code(), SLHDSA_SHAKE_256F_PRIVATE);
      ALL.put(SLHDSA_SHAKE_256F_PUBLIC.code(), SLHDSA_SHAKE_256F_PUBLIC);
      ALL.put(SLHDSA_SHAKE_256S_PRIVATE.code(), SLHDSA_SHAKE_256S_PRIVATE);
      ALL.put(SLHDSA_SHAKE_256S_PUBLIC.code(), SLHDSA_SHAKE_256S_PUBLIC);
      ALL.put(SM2_PRIVATE.code(), SM2_PRIVATE);
      ALL.put(SM2_PUBLIC.code(), SM2_PUBLIC);
      ALL.put(SR25519_PRIVATE.code(), SR25519_PRIVATE);
      ALL.put(SR25519_PUBLIC.code(), SR25519_PUBLIC);
      ALL.put(X25519_PRIVATE.code(), X25519_PRIVATE);
      ALL.put(X25519_PUBLIC.code(), X25519_PUBLIC);
      ALL.put(X448_PRIVATE.code(), X448_PRIVATE);
      ALL.put(X448_PUBLIC.code(), X448_PUBLIC);
    }

    protected KeyCodec() { /* protected */ }
}
