package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec;
import com.apicatalog.multicodec.Multicodec.Tag;

/** Multicodec Registry - generated: Sat Nov 25 23:25:18 CET 2023 */
public class KeyCodec {

    /** Key: aes-128, 128-bit AES symmetric key, status = draft, code = 0xa0 */
    public static Multicodec AES_128_KEY = new Multicodec("aes-128", Tag.Key, 160, new byte[] {(byte)0xa0, (byte)0x01});

    /** Key: aes-192, 192-bit AES symmetric key, status = draft, code = 0xa1 */
    public static Multicodec AES_192_KEY = new Multicodec("aes-192", Tag.Key, 161, new byte[] {(byte)0xa1, (byte)0x01});

    /** Key: aes-256, 256-bit AES symmetric key, status = draft, code = 0xa2 */
    public static Multicodec AES_256_KEY = new Multicodec("aes-256", Tag.Key, 162, new byte[] {(byte)0xa2, (byte)0x01});

    /** Key: bls12_381-g1-pub, BLS12-381 public key in the G1 field, status = draft, code = 0xea */
    public static Multicodec BLS12_381_G1_PUBLIC_KEY = new Multicodec("bls12_381-g1-pub", Tag.Key, 234, new byte[] {(byte)0xea, (byte)0x01});

    /** Key: bls12_381-g1g2-pub, BLS12-381 concatenated public keys in both the G1 and G2 fields, status = draft, code = 0xee */
    public static Multicodec BLS12_381_G1G2_PUBLIC_KEY = new Multicodec("bls12_381-g1g2-pub", Tag.Key, 238, new byte[] {(byte)0xee, (byte)0x01});

    /** Key: bls12_381-g2-pub, BLS12-381 public key in the G2 field, status = draft, code = 0xeb */
    public static Multicodec BLS12_381_G2_PUBLIC_KEY = new Multicodec("bls12_381-g2-pub", Tag.Key, 235, new byte[] {(byte)0xeb, (byte)0x01});

    /** Key: chacha-128, 128-bit ChaCha symmetric key, status = draft, code = 0xa3 */
    public static Multicodec CHACHA_128_KEY = new Multicodec("chacha-128", Tag.Key, 163, new byte[] {(byte)0xa3, (byte)0x01});

    /** Key: chacha-256, 256-bit ChaCha symmetric key, status = draft, code = 0xa4 */
    public static Multicodec CHACHA_256_KEY = new Multicodec("chacha-256", Tag.Key, 164, new byte[] {(byte)0xa4, (byte)0x01});

    /** Key: ed25519-priv, Ed25519 private key, status = draft, code = 0x1300 */
    public static Multicodec ED25519_PRIVATE_KEY = new Multicodec("ed25519-priv", Tag.Key, 4864, new byte[] {(byte)0x80, (byte)0x26});

    /** Key: ed25519-pub, Ed25519 public key, status = draft, code = 0xed */
    public static Multicodec ED25519_PUBLIC_KEY = new Multicodec("ed25519-pub", Tag.Key, 237, new byte[] {(byte)0xed, (byte)0x01});

    /** Key: ed448-pub, Ed448 public Key, status = draft, code = 0x1203 */
    public static Multicodec ED448_PUBLIC_KEY = new Multicodec("ed448-pub", Tag.Key, 4611, new byte[] {(byte)0x83, (byte)0x24});

    /** Key: jwk_jcs-pub, JSON object containing only the required members of a JWK (RFC 7518 and RFC 7517) representing the public key. Serialisation based on JCS (RFC 8785), status = draft, code = 0xeb51 */
    public static Multicodec JWK_JCS_PUBLIC_KEY = new Multicodec("jwk_jcs-pub", Tag.Key, 60241, new byte[] {(byte)0xd1, (byte)0xd6, (byte)0x03});

    /** Key: p256-priv, P-256 private key, status = draft, code = 0x1306 */
    public static Multicodec P256_PRIVATE_KEY = new Multicodec("p256-priv", Tag.Key, 4870, new byte[] {(byte)0x86, (byte)0x26});

    /** Key: p256-pub, P-256 public Key (compressed), status = draft, code = 0x1200 */
    public static Multicodec P256_PUBLIC_KEY = new Multicodec("p256-pub", Tag.Key, 4608, new byte[] {(byte)0x80, (byte)0x24});

    /** Key: p384-priv, P-384 private key, status = draft, code = 0x1307 */
    public static Multicodec P384_PRIVATE_KEY = new Multicodec("p384-priv", Tag.Key, 4871, new byte[] {(byte)0x87, (byte)0x26});

    /** Key: p384-pub, P-384 public Key (compressed), status = draft, code = 0x1201 */
    public static Multicodec P384_PUBLIC_KEY = new Multicodec("p384-pub", Tag.Key, 4609, new byte[] {(byte)0x81, (byte)0x24});

    /** Key: p521-priv, P-521 private key, status = draft, code = 0x1308 */
    public static Multicodec P521_PRIVATE_KEY = new Multicodec("p521-priv", Tag.Key, 4872, new byte[] {(byte)0x88, (byte)0x26});

    /** Key: p521-pub, P-521 public Key (compressed), status = draft, code = 0x1202 */
    public static Multicodec P521_PUBLIC_KEY = new Multicodec("p521-pub", Tag.Key, 4610, new byte[] {(byte)0x82, (byte)0x24});

    /** Key: rsa-priv, RSA private key, status = draft, code = 0x1305 */
    public static Multicodec RSA_PRIVATE_KEY = new Multicodec("rsa-priv", Tag.Key, 4869, new byte[] {(byte)0x85, (byte)0x26});

    /** Key: rsa-pub, RSA public key. DER-encoded ASN.1 type RSAPublicKey according to IETF RFC 8017 (PKCS #1), status = draft, code = 0x1205 */
    public static Multicodec RSA_PUBLIC_KEY = new Multicodec("rsa-pub", Tag.Key, 4613, new byte[] {(byte)0x85, (byte)0x24});

    /** Key: secp256k1-priv, Secp256k1 private key, status = draft, code = 0x1301 */
    public static Multicodec SECP256K1_PRIVATE_KEY = new Multicodec("secp256k1-priv", Tag.Key, 4865, new byte[] {(byte)0x81, (byte)0x26});

    /** Key: secp256k1-pub, Secp256k1 public key (compressed), status = draft, code = 0xe7 */
    public static Multicodec SECP256K1_PUBLIC_KEY = new Multicodec("secp256k1-pub", Tag.Key, 231, new byte[] {(byte)0xe7, (byte)0x01});

    /** Key: sm2-pub, SM2 public key (compressed), status = draft, code = 0x1206 */
    public static Multicodec SM2_PUBLIC_KEY = new Multicodec("sm2-pub", Tag.Key, 4614, new byte[] {(byte)0x86, (byte)0x24});

    /** Key: sr25519-priv, Sr25519 private key, status = draft, code = 0x1303 */
    public static Multicodec SR25519_PRIVATE_KEY = new Multicodec("sr25519-priv", Tag.Key, 4867, new byte[] {(byte)0x83, (byte)0x26});

    /** Key: sr25519-pub, Sr25519 public key, status = draft, code = 0xef */
    public static Multicodec SR25519_PUBLIC_KEY = new Multicodec("sr25519-pub", Tag.Key, 239, new byte[] {(byte)0xef, (byte)0x01});

    /** Key: x25519-priv, Curve25519 private key, status = draft, code = 0x1302 */
    public static Multicodec X25519_PRIVATE_KEY = new Multicodec("x25519-priv", Tag.Key, 4866, new byte[] {(byte)0x82, (byte)0x26});

    /** Key: x25519-pub, Curve25519 public key, status = draft, code = 0xec */
    public static Multicodec X25519_PUBLIC_KEY = new Multicodec("x25519-pub", Tag.Key, 236, new byte[] {(byte)0xec, (byte)0x01});

    /** Key: x448-pub, X448 public Key, status = draft, code = 0x1204 */
    public static Multicodec X448_PUBLIC_KEY = new Multicodec("x448-pub", Tag.Key, 4612, new byte[] {(byte)0x84, (byte)0x24});

    public static Map<Long, Multicodec> ALL = new TreeMap<>();

    static {
      ALL.put(AES_128_KEY.code(), AES_128_KEY);
      ALL.put(AES_192_KEY.code(), AES_192_KEY);
      ALL.put(AES_256_KEY.code(), AES_256_KEY);
      ALL.put(BLS12_381_G1_PUBLIC_KEY.code(), BLS12_381_G1_PUBLIC_KEY);
      ALL.put(BLS12_381_G1G2_PUBLIC_KEY.code(), BLS12_381_G1G2_PUBLIC_KEY);
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
