package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec;
import com.apicatalog.multicodec.Multicodec.Tag;

/** Multicodec Registry - generated: Mon Jul 08 00:02:45 CEST 2024 */
public class KeyCodec {

    protected KeyCodec() { /* protected */ }

    /** Key: aes-128, 128-bit AES symmetric key, status = draft, code = 0xa0 */
    public static final Multicodec AES_128_KEY = Multicodec.of("aes-128", Tag.Key, 0xa0);

    /** Key: aes-192, 192-bit AES symmetric key, status = draft, code = 0xa1 */
    public static final Multicodec AES_192_KEY = Multicodec.of("aes-192", Tag.Key, 0xa1);

    /** Key: aes-256, 256-bit AES symmetric key, status = draft, code = 0xa2 */
    public static final Multicodec AES_256_KEY = Multicodec.of("aes-256", Tag.Key, 0xa2);

    /** Key: bls12_381-g1-priv, BLS12-381 G1 private key, status = draft, code = 0x1309 */
    public static final Multicodec BLS12_381_G1_PRIVATE_KEY = Multicodec.of("bls12_381-g1-priv", Tag.Key, 0x1309);

    /** Key: bls12_381-g1-pub, BLS12-381 public key in the G1 field, status = draft, code = 0xea */
    public static final Multicodec BLS12_381_G1_PUBLIC_KEY = Multicodec.of("bls12_381-g1-pub", Tag.Key, 0xea);

    /** Key: bls12_381-g1g2-priv, BLS12-381 G1 and G2 private key, status = draft, code = 0x130b */
    public static final Multicodec BLS12_381_G1G2_PRIVATE_KEY = Multicodec.of("bls12_381-g1g2-priv", Tag.Key, 0x130b);

    /** Key: bls12_381-g1g2-pub, BLS12-381 concatenated public keys in both the G1 and G2 fields, status = draft, code = 0xee */
    public static final Multicodec BLS12_381_G1G2_PUBLIC_KEY = Multicodec.of("bls12_381-g1g2-pub", Tag.Key, 0xee);

    /** Key: bls12_381-g2-priv, BLS12-381 G2 private key, status = draft, code = 0x130a */
    public static final Multicodec BLS12_381_G2_PRIVATE_KEY = Multicodec.of("bls12_381-g2-priv", Tag.Key, 0x130a);

    /** Key: bls12_381-g2-pub, BLS12-381 public key in the G2 field, status = draft, code = 0xeb */
    public static final Multicodec BLS12_381_G2_PUBLIC_KEY = Multicodec.of("bls12_381-g2-pub", Tag.Key, 0xeb);

    /** Key: chacha-128, 128-bit ChaCha symmetric key, status = draft, code = 0xa3 */
    public static final Multicodec CHACHA_128_KEY = Multicodec.of("chacha-128", Tag.Key, 0xa3);

    /** Key: chacha-256, 256-bit ChaCha symmetric key, status = draft, code = 0xa4 */
    public static final Multicodec CHACHA_256_KEY = Multicodec.of("chacha-256", Tag.Key, 0xa4);

    /** Key: ed25519-priv, Ed25519 private key, status = draft, code = 0x1300 */
    public static final Multicodec ED25519_PRIVATE_KEY = Multicodec.of("ed25519-priv", Tag.Key, 0x1300);

    /** Key: ed25519-pub, Ed25519 public key, status = draft, code = 0xed */
    public static final Multicodec ED25519_PUBLIC_KEY = Multicodec.of("ed25519-pub", Tag.Key, 0xed);

    /** Key: ed448-pub, Ed448 public Key, status = draft, code = 0x1203 */
    public static final Multicodec ED448_PUBLIC_KEY = Multicodec.of("ed448-pub", Tag.Key, 0x1203);

    /** Key: jwk_jcs-pub, JSON object containing only the required members of a JWK (RFC 7518 and RFC 7517) representing the public key. Serialisation based on JCS (RFC 8785), status = draft, code = 0xeb51 */
    public static final Multicodec JWK_JCS_PUBLIC_KEY = Multicodec.of("jwk_jcs-pub", Tag.Key, 0xeb51);

    /** Key: p256-priv, P-256 private key, status = draft, code = 0x1306 */
    public static final Multicodec P256_PRIVATE_KEY = Multicodec.of("p256-priv", Tag.Key, 0x1306);

    /** Key: p256-pub, P-256 public Key (compressed), status = draft, code = 0x1200 */
    public static final Multicodec P256_PUBLIC_KEY = Multicodec.of("p256-pub", Tag.Key, 0x1200);

    /** Key: p384-priv, P-384 private key, status = draft, code = 0x1307 */
    public static final Multicodec P384_PRIVATE_KEY = Multicodec.of("p384-priv", Tag.Key, 0x1307);

    /** Key: p384-pub, P-384 public Key (compressed), status = draft, code = 0x1201 */
    public static final Multicodec P384_PUBLIC_KEY = Multicodec.of("p384-pub", Tag.Key, 0x1201);

    /** Key: p521-priv, P-521 private key, status = draft, code = 0x1308 */
    public static final Multicodec P521_PRIVATE_KEY = Multicodec.of("p521-priv", Tag.Key, 0x1308);

    /** Key: p521-pub, P-521 public Key (compressed), status = draft, code = 0x1202 */
    public static final Multicodec P521_PUBLIC_KEY = Multicodec.of("p521-pub", Tag.Key, 0x1202);

    /** Key: rsa-priv, RSA private key, status = draft, code = 0x1305 */
    public static final Multicodec RSA_PRIVATE_KEY = Multicodec.of("rsa-priv", Tag.Key, 0x1305);

    /** Key: rsa-pub, RSA public key. DER-encoded ASN.1 type RSAPublicKey according to IETF RFC 8017 (PKCS #1), status = draft, code = 0x1205 */
    public static final Multicodec RSA_PUBLIC_KEY = Multicodec.of("rsa-pub", Tag.Key, 0x1205);

    /** Key: secp256k1-priv, Secp256k1 private key, status = draft, code = 0x1301 */
    public static final Multicodec SECP256K1_PRIVATE_KEY = Multicodec.of("secp256k1-priv", Tag.Key, 0x1301);

    /** Key: secp256k1-pub, Secp256k1 public key (compressed), status = draft, code = 0xe7 */
    public static final Multicodec SECP256K1_PUBLIC_KEY = Multicodec.of("secp256k1-pub", Tag.Key, 0xe7);

    /** Key: sm2-pub, SM2 public key (compressed), status = draft, code = 0x1206 */
    public static final Multicodec SM2_PUBLIC_KEY = Multicodec.of("sm2-pub", Tag.Key, 0x1206);

    /** Key: sr25519-priv, Sr25519 private key, status = draft, code = 0x1303 */
    public static final Multicodec SR25519_PRIVATE_KEY = Multicodec.of("sr25519-priv", Tag.Key, 0x1303);

    /** Key: sr25519-pub, Sr25519 public key, status = draft, code = 0xef */
    public static final Multicodec SR25519_PUBLIC_KEY = Multicodec.of("sr25519-pub", Tag.Key, 0xef);

    /** Key: x25519-priv, Curve25519 private key, status = draft, code = 0x1302 */
    public static final Multicodec X25519_PRIVATE_KEY = Multicodec.of("x25519-priv", Tag.Key, 0x1302);

    /** Key: x25519-pub, Curve25519 public key, status = draft, code = 0xec */
    public static final Multicodec X25519_PUBLIC_KEY = Multicodec.of("x25519-pub", Tag.Key, 0xec);

    /** Key: x448-pub, X448 public Key, status = draft, code = 0x1204 */
    public static final Multicodec X448_PUBLIC_KEY = Multicodec.of("x448-pub", Tag.Key, 0x1204);

    protected static final Map<Long, Multicodec> ALL = new TreeMap<>();

    static {
      ALL.put(AES_128_KEY.code(), AES_128_KEY);
      ALL.put(AES_192_KEY.code(), AES_192_KEY);
      ALL.put(AES_256_KEY.code(), AES_256_KEY);
      ALL.put(BLS12_381_G1_PRIVATE_KEY.code(), BLS12_381_G1_PRIVATE_KEY);
      ALL.put(BLS12_381_G1_PUBLIC_KEY.code(), BLS12_381_G1_PUBLIC_KEY);
      ALL.put(BLS12_381_G1G2_PRIVATE_KEY.code(), BLS12_381_G1G2_PRIVATE_KEY);
      ALL.put(BLS12_381_G1G2_PUBLIC_KEY.code(), BLS12_381_G1G2_PUBLIC_KEY);
      ALL.put(BLS12_381_G2_PRIVATE_KEY.code(), BLS12_381_G2_PRIVATE_KEY);
      ALL.put(BLS12_381_G2_PUBLIC_KEY.code(), BLS12_381_G2_PUBLIC_KEY);
      ALL.put(CHACHA_128_KEY.code(), CHACHA_128_KEY);
      ALL.put(CHACHA_256_KEY.code(), CHACHA_256_KEY);
      ALL.put(ED25519_PRIVATE_KEY.code(), ED25519_PRIVATE_KEY);
      ALL.put(ED25519_PUBLIC_KEY.code(), ED25519_PUBLIC_KEY);
      ALL.put(ED448_PUBLIC_KEY.code(), ED448_PUBLIC_KEY);
      ALL.put(JWK_JCS_PUBLIC_KEY.code(), JWK_JCS_PUBLIC_KEY);
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
      ALL.put(SM2_PUBLIC_KEY.code(), SM2_PUBLIC_KEY);
      ALL.put(SR25519_PRIVATE_KEY.code(), SR25519_PRIVATE_KEY);
      ALL.put(SR25519_PUBLIC_KEY.code(), SR25519_PUBLIC_KEY);
      ALL.put(X25519_PRIVATE_KEY.code(), X25519_PRIVATE_KEY);
      ALL.put(X25519_PUBLIC_KEY.code(), X25519_PUBLIC_KEY);
      ALL.put(X448_PUBLIC_KEY.code(), X448_PUBLIC_KEY);
    }
}
