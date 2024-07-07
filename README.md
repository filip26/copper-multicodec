# Copper Multicodec
A Java implementation of [Multicodec](https://github.com/multiformats/multicodec).

[![Java 8 CI](https://github.com/filip26/copper-multicodec/actions/workflows/java8-build.yml/badge.svg)](https://github.com/filip26/copper-multicodec/actions/workflows/java8-build.yml)
[![Maven Central](https://img.shields.io/maven-central/v/com.apicatalog/copper-multicodec.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:com.apicatalog%20AND%20a:copper-multicodec)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

## Features
 * `static` codecs registry
   * no lookups for a codec when encoding
   * direct `static` access to codecs
   * confirugable set of codecs to support when decoding
 * built-in `Unsigned VarInt` support
 * no 3rd pary dependencies

## Example

```java
/* encode an input as P-521 public key */
byte[] encoded = KeyCodec.P521_PUBLIC_KEY.encode(input);

/* encode an input as an identity */
byte[] encoded = MultihashCodec.IDENTITY.encode(input);

/* get decoder instance initialized with all supported codecs */
var decoder = MulticodecDecoder.getInstance();

/* get decoder initialized with codecs tagged as key and hash */
var decoder = MulticodecDecoder.getInstance(Tag.Key, Tag.Hash);

/* get decoder initialized with custom codec set  */
var decoder = MulticodecDecoder.getInstance(codecs...);

/* decode */
byte[] decoded = decoder.decode(encoded);

/* or check if encoding is supported  */
Multicodec codec = decoder.getCodec(encoded).orElseThrow(() -> new IllegalArgumentException("Unsupported codec."));
byte[] decoded = codec.decode(encoded);

/* or directy when only one codec is supported */
byte[] decoded = KeyCodec.P521_PUBLIC_KEY.decode(encoded);

/* check if byte array is encoded with a codec */
if (KeyCodec.P521_PUBLIC_KEY.isEncoded(encoded)) {
  ...
}
```

## Installation

### Maven

```xml
<dependency>
    <groupId>com.apicatalog</groupId>
    <artifactId>copper-multicodec</artifactId>
    <version>0.1.1</version>
</dependency>
```

### Gradle

Android 12+ (API Level >=32)

```gradle
implementation("com.apicatalog:copper-multicodec:0.1.1")
```

## Documentation

[![javadoc](https://javadoc.io/badge2/com.apicatalog/copper-multicodec/javadoc.svg)](https://javadoc.io/doc/com.apicatalog/copper-multicodec)


## Contributing

All PR's welcome!


### Building

Fork and clone the project repository.

```bash
> cd copper-multicodec
> mvn clean package
```


## Resources
- [Copper Multibase](https://github.com/filip26/copper-multibase)
- [Multicodec](https://github.com/multiformats/multicodec)
- [unsigned-varint](https://github.com/multiformats/unsigned-varint)

