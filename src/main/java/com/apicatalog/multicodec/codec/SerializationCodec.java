package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.time.Instant;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec.Tag;
import com.apicatalog.multicodec.Multicodec;

/** Multicodec Registry - generated: Sat Jun 20 18:15:55 CEST 2026 */
public class SerializationCodec {

    public static final Instant UPDATED = Instant.parse("2026-06-20T16:15:55.299Z");

    public static final long BENCODE_CODE = 0x63;
    /** Serialization: bencode, bencode, status = draft, code = 0x63, uvarint = [0x63] */
    public static final Multicodec BENCODE = Multicodec.of("bencode", Tag.Serialization, BENCODE_CODE, Multicodec.Status.Draft);

    public static final long CAR_CODE = 0x202;
    /** Serialization: car, Content Addressable aRchive (CAR), status = draft, code = 0x202, uvarint = [0x82, 0x04] */
    public static final Multicodec CAR = Multicodec.of("car", Tag.Serialization, CAR_CODE, Multicodec.Status.Draft);

    public static final long CAR_INDEX_SORTED_CODE = 0x400;
    /** Serialization: car-index-sorted, CARv2 IndexSorted index format, status = draft, code = 0x400, uvarint = [0x80, 0x08] */
    public static final Multicodec CAR_INDEX_SORTED = Multicodec.of("car-index-sorted", Tag.Serialization, CAR_INDEX_SORTED_CODE, Multicodec.Status.Draft);

    public static final long CAR_MULTIHASH_INDEX_SORTED_CODE = 0x401;
    /** Serialization: car-multihash-index-sorted, CARv2 MultihashIndexSorted index format, status = draft, code = 0x401, uvarint = [0x81, 0x08] */
    public static final Multicodec CAR_MULTIHASH_INDEX_SORTED = Multicodec.of("car-multihash-index-sorted", Tag.Serialization, CAR_MULTIHASH_INDEX_SORTED_CODE, Multicodec.Status.Draft);

    public static final long IPNS_RECORD_CODE = 0x300;
    /** Serialization: ipns-record, Signed IPNS Record, status = permanent, code = 0x300, uvarint = [0x80, 0x06] */
    public static final Multicodec IPNS_RECORD = Multicodec.of("ipns-record", Tag.Serialization, IPNS_RECORD_CODE, Multicodec.Status.Permanent);

    public static final long MESSAGEPACK_CODE = 0x201;
    /** Serialization: messagepack, MessagePack, status = draft, code = 0x201, uvarint = [0x81, 0x04] */
    public static final Multicodec MESSAGEPACK = Multicodec.of("messagepack", Tag.Serialization, MESSAGEPACK_CODE, Multicodec.Status.Draft);

    public static final long PROTOBUF_CODE = 0x50;
    /** Serialization: protobuf, Protocol Buffers, status = draft, code = 0x50, uvarint = [0x50] */
    public static final Multicodec PROTOBUF = Multicodec.of("protobuf", Tag.Serialization, PROTOBUF_CODE, Multicodec.Status.Draft);

    public static final long PROVENANCE_LOG_CODE = 0x1208;
    /** Serialization: provenance-log, Verifiable and permissioned append-only log, status = draft, code = 0x1208, uvarint = [0x88, 0x24] */
    public static final Multicodec PROVENANCE_LOG = Multicodec.of("provenance-log", Tag.Serialization, PROVENANCE_LOG_CODE, Multicodec.Status.Draft);

    public static final long PROVENANCE_LOG_ENTRY_CODE = 0x1209;
    /** Serialization: provenance-log-entry, Verifiable and permissioned append-only log entry, status = draft, code = 0x1209, uvarint = [0x89, 0x24] */
    public static final Multicodec PROVENANCE_LOG_ENTRY = Multicodec.of("provenance-log-entry", Tag.Serialization, PROVENANCE_LOG_ENTRY_CODE, Multicodec.Status.Draft);

    public static final long PROVENANCE_LOG_SCRIPT_CODE = 0x120a;
    /** Serialization: provenance-log-script, Verifiable and permissioned append-only log script, status = draft, code = 0x120a, uvarint = [0x8a, 0x24] */
    public static final Multicodec PROVENANCE_LOG_SCRIPT = Multicodec.of("provenance-log-script", Tag.Serialization, PROVENANCE_LOG_SCRIPT_CODE, Multicodec.Status.Draft);

    public static final long RLP_CODE = 0x60;
    /** Serialization: rlp, recursive length prefix, status = draft, code = 0x60, uvarint = [0x60] */
    public static final Multicodec RLP = Multicodec.of("rlp", Tag.Serialization, RLP_CODE, Multicodec.Status.Draft);

    public static final long SSZ_CODE = 0xb501;
    /** Serialization: ssz, SimpleSerialize (SSZ) serialization, status = draft, code = 0xb501, uvarint = [0x81, 0xea, 0x02] */
    public static final Multicodec SSZ = Multicodec.of("ssz", Tag.Serialization, SSZ_CODE, Multicodec.Status.Draft);

    public static final long X509_CERTIFICATE_CODE = 0x210;
    /** Serialization: x509-certificate, DER-encoded X.509 (PKIX) certificate per RFC 5280; single certificate only (no chain); raw DER bytes (not PEM), status = draft, code = 0x210, uvarint = [0x90, 0x04] */
    public static final Multicodec X509_CERTIFICATE = Multicodec.of("x509-certificate", Tag.Serialization, X509_CERTIFICATE_CODE, Multicodec.Status.Draft);

    protected static final Map<Long,Multicodec> ALL = new TreeMap<>();

    static {
      ALL.put(BENCODE_CODE, BENCODE);
      ALL.put(CAR_CODE, CAR);
      ALL.put(CAR_INDEX_SORTED_CODE, CAR_INDEX_SORTED);
      ALL.put(CAR_MULTIHASH_INDEX_SORTED_CODE, CAR_MULTIHASH_INDEX_SORTED);
      ALL.put(IPNS_RECORD_CODE, IPNS_RECORD);
      ALL.put(MESSAGEPACK_CODE, MESSAGEPACK);
      ALL.put(PROTOBUF_CODE, PROTOBUF);
      ALL.put(PROVENANCE_LOG_CODE, PROVENANCE_LOG);
      ALL.put(PROVENANCE_LOG_ENTRY_CODE, PROVENANCE_LOG_ENTRY);
      ALL.put(PROVENANCE_LOG_SCRIPT_CODE, PROVENANCE_LOG_SCRIPT);
      ALL.put(RLP_CODE, RLP);
      ALL.put(SSZ_CODE, SSZ);
      ALL.put(X509_CERTIFICATE_CODE, X509_CERTIFICATE);
    }

    protected SerializationCodec() { /* protected */ }
}
