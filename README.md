# Copper Multicodec
A Java implementation of [Multicodec](https://github.com/multiformats/multicodec) in Java.

[![Java 8 CI](https://github.com/filip26/copper-multicodec/actions/workflows/java8-build.yml/badge.svg)](https://github.com/filip26/copper-multicodec/actions/workflows/java8-build.yml)
[![Maven Central](https://img.shields.io/maven-central/v/com.apicatalog/copper-multicodec.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:com.apicatalog%20AND%20a:copper-multicodec)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

## Features
 * `static` codecs registry
 * `Unsigned VarInt` support

## Example

```java
/* encode an input as P-521 public key */
byte[] encoded = KeyCodec.P521_PUBLIC_KEY.encode(input);

/* get decoder instance initialized with all supported codecs */
var decoder = MulticodecDecoder.getInstance();
byte[] decoded = decoder.decode(encoded);

/* or */
Optional<Multicodec> codec = decoder.getCodec(encoded);
if (codec.isPresent()) {
   byte[] decoded = codec.get().decode(encoded);
}

/* get decoder initialized with codecs tagged as key and hash */
var decoder = MulticodecDecoder.getInstance(Tag.Key, Tag.Hash);
```

## Installation

### Maven

```xml
<dependency>
    <groupId>com.apicatalog</groupId>
    <artifactId>copper-multicodec</artifactId>
    <version>0.1.0</version>
</dependency>
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

