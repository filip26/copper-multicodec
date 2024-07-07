package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec;
import com.apicatalog.multicodec.Multicodec.Tag;

/** Multicodec Registry - generated: Mon Jul 08 00:02:45 CEST 2024 */
public class SerializationCodec {

    protected SerializationCodec() { /* protected */ }

    /** Serialization: bencode, bencode, status = draft, code = 0x63 */
    public static final Multicodec BENCODE = Multicodec.of("bencode", Tag.Serialization, 0x63);

    /** Serialization: car, Content Addressable aRchive (CAR), status = draft, code = 0x202 */
    public static final Multicodec CAR = Multicodec.of("car", Tag.Serialization, 0x202);

    /** Serialization: car-index-sorted, CARv2 IndexSorted index format, status = draft, code = 0x400 */
    public static final Multicodec CAR_INDEX_SORTED = Multicodec.of("car-index-sorted", Tag.Serialization, 0x400);

    /** Serialization: car-multihash-index-sorted, CARv2 MultihashIndexSorted index format, status = draft, code = 0x401 */
    public static final Multicodec CAR_MULTIHASH_INDEX_SORTED = Multicodec.of("car-multihash-index-sorted", Tag.Serialization, 0x401);

    /** Serialization: ipns-record, Signed IPNS Record, status = permanent, code = 0x300 */
    public static final Multicodec IPNS_RECORD = Multicodec.of("ipns-record", Tag.Serialization, 0x300);

    /** Serialization: messagepack, MessagePack, status = draft, code = 0x201 */
    public static final Multicodec MESSAGEPACK = Multicodec.of("messagepack", Tag.Serialization, 0x201);

    /** Serialization: protobuf, Protocol Buffers, status = draft, code = 0x50 */
    public static final Multicodec PROTOBUF = Multicodec.of("protobuf", Tag.Serialization, 0x50);

    /** Serialization: rlp, recursive length prefix, status = draft, code = 0x60 */
    public static final Multicodec RLP = Multicodec.of("rlp", Tag.Serialization, 0x60);

    /** Serialization: ssz, SimpleSerialize (SSZ) serialization, status = draft, code = 0xb501 */
    public static final Multicodec SSZ = Multicodec.of("ssz", Tag.Serialization, 0xb501);

    protected static final Map<Long, Multicodec> ALL = new TreeMap<>();

    static {
      ALL.put(BENCODE.code(), BENCODE);
      ALL.put(CAR.code(), CAR);
      ALL.put(CAR_INDEX_SORTED.code(), CAR_INDEX_SORTED);
      ALL.put(CAR_MULTIHASH_INDEX_SORTED.code(), CAR_MULTIHASH_INDEX_SORTED);
      ALL.put(IPNS_RECORD.code(), IPNS_RECORD);
      ALL.put(MESSAGEPACK.code(), MESSAGEPACK);
      ALL.put(PROTOBUF.code(), PROTOBUF);
      ALL.put(RLP.code(), RLP);
      ALL.put(SSZ.code(), SSZ);
    }
}
