# Copper Multicodec

A multicodec is a **self-describing** format: encoded data always begins
with a varint code that unambiguously identifies its format and intended
purpose.  

This design eliminates guesswork, ensures interoperability between systems,
and makes it possible to introduce new formats without breaking existing
implementations.  

The multicodec identifier tells applications how the data is meant to be
interpreted and processed.  

Each multicodec is tagged to reflect its purpose - for example, hash functions (e.g., `sha2-256`), cryptography keys (e.g., `ed25519-pub`), and other identifiers used across the multiformats ecosystem.

Copper Multicodec is a Java library implementing 
[Multicodec](https://github.com/multiformats/multicodec) and 
[Multihash](https://github.com/multiformats/multihash), enabling efficient
encoding and decoding of self-describing data formats.

[![Java 8 CI](https://github.com/filip26/copper-multicodec/actions/workflows/java8-build.yml/badge.svg)](https://github.com/filip26/copper-multicodec/actions/workflows/java8-build.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=filip26_copper-multicodec&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=filip26_copper-multicodec)
[![javadoc](https://javadoc.io/badge2/com.apicatalog/copper-multicodec/javadoc.svg)](https://javadoc.io/doc/com.apicatalog/copper-multicodec)
[![Maven Central](https://img.shields.io/maven-central/v/com.apicatalog/copper-multicodec.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:com.apicatalog%20AND%20a:copper-multicodec)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

## Features

- **Static Codec Registry:** Predefined codecs for efficient access.
- **Direct Static Access to Codecs:** Eliminates runtime searches for codecs.
- **Custom Codec Support:** Allows customization of supported codecs.
- **Multihash Support:** Provides compatibility with multihash encoding.
- **Unsigned VarInt Support:** Handles unsigned variable-length integers.
- **Zero Third-Party Dependencies:** Ensures a lightweight and self-contained implementation.

[Supported Codecs](https://github.com/filip26/copper-multicodec/tree/main/src/main/java/com/apicatalog/multicodec/codec)

## Examples

```java
/* encode an input as P-521 public key */
byte[] encoded = KeyCodec.P521_PUBLIC_KEY.encode(input);

/* encode an input as an identity */
byte[] encoded = MultihashCodec.IDENTITY.encode(input);

/* get decoder instance initialized with all supported codecs */
var decoder = MulticodecDecoder.getInstance();

/* get custom decoder initialized with codecs tagged as key and hash */
var decoder = MulticodecDecoder.getInstance(Tag.Key, Tag.Hash);

/* get custom decoder initialized with custom codec set  */
var decoder = MulticodecDecoder.getInstance(codecs...);

/* decode */
byte[] decoded = decoder.decode(encoded);

/* or check if encoding is supported  */
Multicodec codec = decoder.getCodec(encoded).orElseThrow(() -> new IllegalArgumentException("Unsupported codec."));
byte[] decoded = codec.decode(encoded);

/* or directly when only one codec is supported */
byte[] decoded = KeyCodec.P521_PUBLIC_KEY.decode(encoded);

/* check if byte array is encoded with a codec */
if (KeyCodec.P521_PUBLIC_KEY.isEncoded(encoded)) {
  ...
}

/* create a custom codec */
var codec = Multicodec.of(name, tag, code);

/* get registry instance initialized with all supported codecs */
var registry = MulticodecRegistry.getInstance();

/* get custom registry initialized with codecs tagged as key and hash */
var registry = MulticodecRegistry.getInstance(Tag.Key, Tag.Hash);

/* get custom registry initialized with custom codec set  */
var registry = MulticodecRegistry.getInstance(codecs...);

/* get codec */
var codec = registry.getCodec(code).orElseThrow(() -> new IllegalArgumentException("Unsupported codec."));
byte[] encoded = codec.encode(input);

```

### Multihash

```java
/* get multihash decoder initialized with all multihash codecs */
var decoder = MulticodecDecoder.getInstance(Tag.Multihash);

/* decode; digest size is checked and removed */
byte[] decoded = decoder.decode(encoded);

/* or check if supported  */
var codec = decoder.get(encoded).orElseThrow(() -> new IllegalArgumentException("Unsupported multihash."));
byte[] decoded = codec.decode(encoded);

/* or directly */
byte[] decoded = MultihashCodec.SHA2_384.decode(encoded);

/* 

/* check if byte array is encoded with multihash codec */
if (MultihashCodec.SHA2_384.isEncoded(encoded)) {
  ...
}

/* get registry initialized with all multihash codecs */
var registry = MulticodecRegistry.getInstance(Tag.Multihash);

/* encode an input as multihash */
var codec = registry.get(code).orElseThrow(() -> new IllegalArgumentException("Unsupported multihash."));
byte[] encoded = codec.encode(input);

```


## Installation

### Maven

To include Copper Multicodec in your project, add the following dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>com.apicatalog</groupId>
    <artifactId>copper-multicodec</artifactId>
    <version>2.2.0</version>
</dependency>
```

## Contributing

All PR's welcome!


### Building

Fork and clone the project repository.

```bash
> cd copper-multicodec
> mvn clean package
```

## Additional Resources
- [Copper Multibase](https://github.com/filip26/copper-multibase)
- [Multicodec](https://github.com/multiformats/multicodec)
- [Multihash](https://github.com/multiformats/multihash)
- [unsigned-varint](https://github.com/multiformats/unsigned-varint)
