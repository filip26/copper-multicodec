package com.apicatalog.multicodec;

import com.apicatalog.multicodec.Multicodec.Tag;

/** Multicodec Registry - generated: Tue Nov 07 23:49:34 CET 2023 */
public class MulticodecRegistry {

    /** aes-128: 128-bit AES symmetric key, status = draft */
    public static Multicodec AES_128_KEY = new Multicodec("aes-128", Tag.Key, new byte[] {});

    /** aes-192: 192-bit AES symmetric key, status = draft */
    public static Multicodec AES_192_KEY = new Multicodec("aes-192", Tag.Key, new byte[] {});

    /** aes-256: 256-bit AES symmetric key, status = draft */
    public static Multicodec AES_256_KEY = new Multicodec("aes-256", Tag.Key, new byte[] {});

    /** bls12_381-g1-pub: BLS12-381 public key in the G1 field, status = draft */
    public static Multicodec BLS12_381_G1_PUBLIC_KEY = new Multicodec("bls12_381-g1-pub", Tag.Key, new byte[] {});

    /** bls12_381-g1g2-pub: BLS12-381 concatenated public keys in both the G1 and G2 fields, status = draft */
    public static Multicodec BLS12_381_G1G2_PUBLIC_KEY = new Multicodec("bls12_381-g1g2-pub", Tag.Key, new byte[] {});

    /** bls12_381-g2-pub: BLS12-381 public key in the G2 field, status = draft */
    public static Multicodec BLS12_381_G2_PUBLIC_KEY = new Multicodec("bls12_381-g2-pub", Tag.Key, new byte[] {});

    /** chacha-128: 128-bit ChaCha symmetric key, status = draft */
    public static Multicodec CHACHA_128_KEY = new Multicodec("chacha-128", Tag.Key, new byte[] {});

    /** chacha-256: 256-bit ChaCha symmetric key, status = draft */
    public static Multicodec CHACHA_256_KEY = new Multicodec("chacha-256", Tag.Key, new byte[] {});

    /** ed25519-priv: Ed25519 private key, status = draft */
    public static Multicodec ED25519_PRIVATE_KEY = new Multicodec("ed25519-priv", Tag.Key, new byte[] {});

    /** ed25519-pub: Ed25519 public key, status = draft */
    public static Multicodec ED25519_PUBLIC_KEY = new Multicodec("ed25519-pub", Tag.Key, new byte[] {});

    /** ed448-pub: Ed448 public Key, status = draft */
    public static Multicodec ED448_PUBLIC_KEY = new Multicodec("ed448-pub", Tag.Key, new byte[] {});

    /** jwk_jcs-pub: JSON object containing only the required members of a JWK (RFC 7518 and RFC 7517) representing the public key. Serialisation based on JCS (RFC 8785), status = draft */
    public static Multicodec JWK_JCS_PUBLIC_KEY = new Multicodec("jwk_jcs-pub", Tag.Key, new byte[] {});

    /** p256-priv: P-256 private key, status = draft */
    public static Multicodec P256_PRIVATE_KEY = new Multicodec("p256-priv", Tag.Key, new byte[] {});

    /** p256-pub: P-256 public Key (compressed), status = draft */
    public static Multicodec P256_PUBLIC_KEY = new Multicodec("p256-pub", Tag.Key, new byte[] {});

    /** p384-priv: P-384 private key, status = draft */
    public static Multicodec P384_PRIVATE_KEY = new Multicodec("p384-priv", Tag.Key, new byte[] {});

    /** p384-pub: P-384 public Key (compressed), status = draft */
    public static Multicodec P384_PUBLIC_KEY = new Multicodec("p384-pub", Tag.Key, new byte[] {});

    /** p521-priv: P-521 private key, status = draft */
    public static Multicodec P521_PRIVATE_KEY = new Multicodec("p521-priv", Tag.Key, new byte[] {});

    /** p521-pub: P-521 public Key (compressed), status = draft */
    public static Multicodec P521_PUBLIC_KEY = new Multicodec("p521-pub", Tag.Key, new byte[] {});

    /** rsa-priv: RSA private key, status = draft */
    public static Multicodec RSA_PRIVATE_KEY = new Multicodec("rsa-priv", Tag.Key, new byte[] {});

    /** rsa-pub: RSA public key. DER-encoded ASN.1 type RSAPublicKey according to IETF RFC 8017 (PKCS #1), status = draft */
    public static Multicodec RSA_PUBLIC_KEY = new Multicodec("rsa-pub", Tag.Key, new byte[] {});

    /** secp256k1-priv: Secp256k1 private key, status = draft */
    public static Multicodec SECP256K1_PRIVATE_KEY = new Multicodec("secp256k1-priv", Tag.Key, new byte[] {});

    /** secp256k1-pub: Secp256k1 public key (compressed), status = draft */
    public static Multicodec SECP256K1_PUBLIC_KEY = new Multicodec("secp256k1-pub", Tag.Key, new byte[] {});

    /** sm2-pub: SM2 public key (compressed), status = draft */
    public static Multicodec SM2_PUBLIC_KEY = new Multicodec("sm2-pub", Tag.Key, new byte[] {});

    /** sr25519-priv: Sr25519 private key, status = draft */
    public static Multicodec SR25519_PRIVATE_KEY = new Multicodec("sr25519-priv", Tag.Key, new byte[] {});

    /** sr25519-pub: Sr25519 public key, status = draft */
    public static Multicodec SR25519_PUBLIC_KEY = new Multicodec("sr25519-pub", Tag.Key, new byte[] {});

    /** x25519-priv: Curve25519 private key, status = draft */
    public static Multicodec X25519_PRIVATE_KEY = new Multicodec("x25519-priv", Tag.Key, new byte[] {});

    /** x25519-pub: Curve25519 public key, status = draft */
    public static Multicodec X25519_PUBLIC_KEY = new Multicodec("x25519-pub", Tag.Key, new byte[] {});

    /** x448-pub: X448 public Key, status = draft */
    public static Multicodec X448_PUBLIC_KEY = new Multicodec("x448-pub", Tag.Key, new byte[] {});

}
