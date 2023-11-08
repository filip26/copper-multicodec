package com.apicatalog.multicodec;

import com.apicatalog.multicodec.Multicodec.Tag;

/** Multicodec Registry - generated: Wed Nov 08 01:38:28 CET 2023 */
public class MulticodecRegistry {

    /** aes-128: 128-bit AES symmetric key, status = draft, code = 160 */
    public static Multicodec AES_128_KEY = new Multicodec("aes-128", Tag.Key, 160, new byte[] {(byte)0xa0, (byte)0x01});

    /** aes-192: 192-bit AES symmetric key, status = draft, code = 161 */
    public static Multicodec AES_192_KEY = new Multicodec("aes-192", Tag.Key, 161, new byte[] {(byte)0xa1, (byte)0x01});

    /** aes-256: 256-bit AES symmetric key, status = draft, code = 162 */
    public static Multicodec AES_256_KEY = new Multicodec("aes-256", Tag.Key, 162, new byte[] {(byte)0xa2, (byte)0x01});

    /** bls12_381-g1-pub: BLS12-381 public key in the G1 field, status = draft, code = 234 */
    public static Multicodec BLS12_381_G1_PUBLIC_KEY = new Multicodec("bls12_381-g1-pub", Tag.Key, 234, new byte[] {(byte)0xea, (byte)0x01});

    /** bls12_381-g1g2-pub: BLS12-381 concatenated public keys in both the G1 and G2 fields, status = draft, code = 238 */
    public static Multicodec BLS12_381_G1G2_PUBLIC_KEY = new Multicodec("bls12_381-g1g2-pub", Tag.Key, 238, new byte[] {(byte)0xee, (byte)0x01});

    /** bls12_381-g2-pub: BLS12-381 public key in the G2 field, status = draft, code = 235 */
    public static Multicodec BLS12_381_G2_PUBLIC_KEY = new Multicodec("bls12_381-g2-pub", Tag.Key, 235, new byte[] {(byte)0xeb, (byte)0x01});

    /** chacha-128: 128-bit ChaCha symmetric key, status = draft, code = 163 */
    public static Multicodec CHACHA_128_KEY = new Multicodec("chacha-128", Tag.Key, 163, new byte[] {(byte)0xa3, (byte)0x01});

    /** chacha-256: 256-bit ChaCha symmetric key, status = draft, code = 164 */
    public static Multicodec CHACHA_256_KEY = new Multicodec("chacha-256", Tag.Key, 164, new byte[] {(byte)0xa4, (byte)0x01});

    /** ed25519-priv: Ed25519 private key, status = draft, code = 4864 */
    public static Multicodec ED25519_PRIVATE_KEY = new Multicodec("ed25519-priv", Tag.Key, 4864, new byte[] {(byte)0x80, (byte)0x26});

    /** ed25519-pub: Ed25519 public key, status = draft, code = 237 */
    public static Multicodec ED25519_PUBLIC_KEY = new Multicodec("ed25519-pub", Tag.Key, 237, new byte[] {(byte)0xed, (byte)0x01});

    /** ed448-pub: Ed448 public Key, status = draft, code = 4611 */
    public static Multicodec ED448_PUBLIC_KEY = new Multicodec("ed448-pub", Tag.Key, 4611, new byte[] {(byte)0x83, (byte)0x24});

    /** identity: raw binary, status = permanent, code = 0 */
    public static Multicodec IDENTITY = new Multicodec("identity", Tag.Multihash, 0, new byte[] {(byte)0x00});

    /** jwk_jcs-pub: JSON object containing only the required members of a JWK (RFC 7518 and RFC 7517) representing the public key. Serialisation based on JCS (RFC 8785), status = draft, code = 60241 */
    public static Multicodec JWK_JCS_PUBLIC_KEY = new Multicodec("jwk_jcs-pub", Tag.Key, 60241, new byte[] {(byte)0xd1, (byte)0xd6, (byte)0x03});

    /** p256-priv: P-256 private key, status = draft, code = 4870 */
    public static Multicodec P256_PRIVATE_KEY = new Multicodec("p256-priv", Tag.Key, 4870, new byte[] {(byte)0x86, (byte)0x26});

    /** p256-pub: P-256 public Key (compressed), status = draft, code = 4608 */
    public static Multicodec P256_PUBLIC_KEY = new Multicodec("p256-pub", Tag.Key, 4608, new byte[] {(byte)0x80, (byte)0x24});

    /** p384-priv: P-384 private key, status = draft, code = 4871 */
    public static Multicodec P384_PRIVATE_KEY = new Multicodec("p384-priv", Tag.Key, 4871, new byte[] {(byte)0x87, (byte)0x26});

    /** p384-pub: P-384 public Key (compressed), status = draft, code = 4609 */
    public static Multicodec P384_PUBLIC_KEY = new Multicodec("p384-pub", Tag.Key, 4609, new byte[] {(byte)0x81, (byte)0x24});

    /** p521-priv: P-521 private key, status = draft, code = 4872 */
    public static Multicodec P521_PRIVATE_KEY = new Multicodec("p521-priv", Tag.Key, 4872, new byte[] {(byte)0x88, (byte)0x26});

    /** p521-pub: P-521 public Key (compressed), status = draft, code = 4610 */
    public static Multicodec P521_PUBLIC_KEY = new Multicodec("p521-pub", Tag.Key, 4610, new byte[] {(byte)0x82, (byte)0x24});

    /** rsa-priv: RSA private key, status = draft, code = 4869 */
    public static Multicodec RSA_PRIVATE_KEY = new Multicodec("rsa-priv", Tag.Key, 4869, new byte[] {(byte)0x85, (byte)0x26});

    /** rsa-pub: RSA public key. DER-encoded ASN.1 type RSAPublicKey according to IETF RFC 8017 (PKCS #1), status = draft, code = 4613 */
    public static Multicodec RSA_PUBLIC_KEY = new Multicodec("rsa-pub", Tag.Key, 4613, new byte[] {(byte)0x85, (byte)0x24});

    /** secp256k1-priv: Secp256k1 private key, status = draft, code = 4865 */
    public static Multicodec SECP256K1_PRIVATE_KEY = new Multicodec("secp256k1-priv", Tag.Key, 4865, new byte[] {(byte)0x81, (byte)0x26});

    /** secp256k1-pub: Secp256k1 public key (compressed), status = draft, code = 231 */
    public static Multicodec SECP256K1_PUBLIC_KEY = new Multicodec("secp256k1-pub", Tag.Key, 231, new byte[] {(byte)0xe7, (byte)0x01});

    /** sm2-pub: SM2 public key (compressed), status = draft, code = 4614 */
    public static Multicodec SM2_PUBLIC_KEY = new Multicodec("sm2-pub", Tag.Key, 4614, new byte[] {(byte)0x86, (byte)0x24});

    /** sr25519-priv: Sr25519 private key, status = draft, code = 4867 */
    public static Multicodec SR25519_PRIVATE_KEY = new Multicodec("sr25519-priv", Tag.Key, 4867, new byte[] {(byte)0x83, (byte)0x26});

    /** sr25519-pub: Sr25519 public key, status = draft, code = 239 */
    public static Multicodec SR25519_PUBLIC_KEY = new Multicodec("sr25519-pub", Tag.Key, 239, new byte[] {(byte)0xef, (byte)0x01});

    /** x25519-priv: Curve25519 private key, status = draft, code = 4866 */
    public static Multicodec X25519_PRIVATE_KEY = new Multicodec("x25519-priv", Tag.Key, 4866, new byte[] {(byte)0x82, (byte)0x26});

    /** x25519-pub: Curve25519 public key, status = draft, code = 236 */
    public static Multicodec X25519_PUBLIC_KEY = new Multicodec("x25519-pub", Tag.Key, 236, new byte[] {(byte)0xec, (byte)0x01});

    /** x448-pub: X448 public Key, status = draft, code = 4612 */
    public static Multicodec X448_PUBLIC_KEY = new Multicodec("x448-pub", Tag.Key, 4612, new byte[] {(byte)0x84, (byte)0x24});

}
