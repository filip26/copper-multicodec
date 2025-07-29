package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec.Tag;
import com.apicatalog.multicodec.Multicodec;

/** Multicodec Registry - generated: Tue Jul 29 16:54:27 CEST 2025 */
public class SerializationCodec {

    /** Serialization: bencode, bencode, status = draft, code = 0x63 */
    public static final Multicodec BENCODE = Multicodec.of("bencode", Tag.Serialization, 0x63, Multicodec.Status.Draft);

    /** Serialization: car, Content Addressable aRchive (CAR), status = draft, code = 0x202 */
    public static final Multicodec CAR = Multicodec.of("car", Tag.Serialization, 0x202, Multicodec.Status.Draft);

    /** Serialization: car-index-sorted, CARv2 IndexSorted index format, status = draft, code = 0x400 */
    public static final Multicodec CAR_INDEX_SORTED = Multicodec.of("car-index-sorted", Tag.Serialization, 0x400, Multicodec.Status.Draft);

    /** Serialization: car-multihash-index-sorted, CARv2 MultihashIndexSorted index format, status = draft, code = 0x401 */
    public static final Multicodec CAR_MULTIHASH_INDEX_SORTED = Multicodec.of("car-multihash-index-sorted", Tag.Serialization, 0x401, Multicodec.Status.Draft);

    /** Serialization: ipns-record, Signed IPNS Record, status = permanent, code = 0x300 */
    public static final Multicodec IPNS_RECORD = Multicodec.of("ipns-record", Tag.Serialization, 0x300, Multicodec.Status.Permanent);

    /** Serialization: messagepack, MessagePack, status = draft, code = 0x201 */
    public static final Multicodec MESSAGEPACK = Multicodec.of("messagepack", Tag.Serialization, 0x201, Multicodec.Status.Draft);

    /** Serialization: protobuf, Protocol Buffers, status = draft, code = 0x50 */
    public static final Multicodec PROTOBUF = Multicodec.of("protobuf", Tag.Serialization, 0x50, Multicodec.Status.Draft);

    /** Serialization: provenance-log, Verifiable and permissioned append-only log, status = draft, code = 0x1208 */
    public static final Multicodec PROVENANCE_LOG = Multicodec.of("provenance-log", Tag.Serialization, 0x1208, Multicodec.Status.Draft);

    /** Serialization: provenance-log-entry, Verifiable and permissioned append-only log entry, status = draft, code = 0x1209 */
    public static final Multicodec PROVENANCE_LOG_ENTRY = Multicodec.of("provenance-log-entry", Tag.Serialization, 0x1209, Multicodec.Status.Draft);

    /** Serialization: provenance-log-script, Verifiable and permissioned append-only log script, status = draft, code = 0x120a */
    public static final Multicodec PROVENANCE_LOG_SCRIPT = Multicodec.of("provenance-log-script", Tag.Serialization, 0x120a, Multicodec.Status.Draft);

    /** Serialization: rlp, recursive length prefix, status = draft, code = 0x60 */
    public static final Multicodec RLP = Multicodec.of("rlp", Tag.Serialization, 0x60, Multicodec.Status.Draft);

    /** Serialization: ssz, SimpleSerialize (SSZ) serialization, status = draft, code = 0xb501 */
    public static final Multicodec SSZ = Multicodec.of("ssz", Tag.Serialization, 0xb501, Multicodec.Status.Draft);

    protected static final Map<Long,Multicodec> ALL = new TreeMap<>();

    static {
      ALL.put(BENCODE.code(), BENCODE);
      ALL.put(CAR.code(), CAR);
      ALL.put(CAR_INDEX_SORTED.code(), CAR_INDEX_SORTED);
      ALL.put(CAR_MULTIHASH_INDEX_SORTED.code(), CAR_MULTIHASH_INDEX_SORTED);
      ALL.put(IPNS_RECORD.code(), IPNS_RECORD);
      ALL.put(MESSAGEPACK.code(), MESSAGEPACK);
      ALL.put(PROTOBUF.code(), PROTOBUF);
      ALL.put(PROVENANCE_LOG.code(), PROVENANCE_LOG);
      ALL.put(PROVENANCE_LOG_ENTRY.code(), PROVENANCE_LOG_ENTRY);
      ALL.put(PROVENANCE_LOG_SCRIPT.code(), PROVENANCE_LOG_SCRIPT);
      ALL.put(RLP.code(), RLP);
      ALL.put(SSZ.code(), SSZ);
    }

    protected SerializationCodec() { /* protected */ }
}
