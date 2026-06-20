package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.time.Instant;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec.Tag;
import com.apicatalog.multicodec.Multicodec;

/** Multicodec Registry - generated: Sat Jun 20 18:15:55 CEST 2026 */
public class TransportCodec {

    public static final Instant UPDATED = Instant.parse("2026-06-20T16:15:55.301Z");

    public static final long TRANSPORT_BITSWAP_CODE = 0x900;
    /** Transport: transport-bitswap, Bitswap datatransfer, status = draft, code = 0x900, uvarint = [0x80, 0x12] */
    public static final Multicodec TRANSPORT_BITSWAP = Multicodec.of("transport-bitswap", Tag.Transport, TRANSPORT_BITSWAP_CODE, Multicodec.Status.Draft);

    public static final long TRANSPORT_FILECOIN_PIECE_HTTP_CODE = 0x930;
    /** Transport: transport-filecoin-piece-http, HTTP piece retrieval from Filecoin storage provider; https://github.com/filecoin-project/FIPs/blob/master/FRCs/frc-0066.md, status = draft, code = 0x930, uvarint = [0xb0, 0x12] */
    public static final Multicodec TRANSPORT_FILECOIN_PIECE_HTTP = Multicodec.of("transport-filecoin-piece-http", Tag.Transport, TRANSPORT_FILECOIN_PIECE_HTTP_CODE, Multicodec.Status.Draft);

    public static final long TRANSPORT_GRAPHSYNC_FILECOINV1_CODE = 0x910;
    /** Transport: transport-graphsync-filecoinv1, Filecoin graphsync datatransfer, status = draft, code = 0x910, uvarint = [0x90, 0x12] */
    public static final Multicodec TRANSPORT_GRAPHSYNC_FILECOINV1 = Multicodec.of("transport-graphsync-filecoinv1", Tag.Transport, TRANSPORT_GRAPHSYNC_FILECOINV1_CODE, Multicodec.Status.Draft);

    public static final long TRANSPORT_IPFS_GATEWAY_HTTP_CODE = 0x920;
    /** Transport: transport-ipfs-gateway-http, HTTP IPFS Gateway trustless datatransfer, status = draft, code = 0x920, uvarint = [0xa0, 0x12] */
    public static final Multicodec TRANSPORT_IPFS_GATEWAY_HTTP = Multicodec.of("transport-ipfs-gateway-http", Tag.Transport, TRANSPORT_IPFS_GATEWAY_HTTP_CODE, Multicodec.Status.Draft);

    protected static final Map<Long,Multicodec> ALL = new TreeMap<>();

    static {
      ALL.put(TRANSPORT_BITSWAP_CODE, TRANSPORT_BITSWAP);
      ALL.put(TRANSPORT_FILECOIN_PIECE_HTTP_CODE, TRANSPORT_FILECOIN_PIECE_HTTP);
      ALL.put(TRANSPORT_GRAPHSYNC_FILECOINV1_CODE, TRANSPORT_GRAPHSYNC_FILECOINV1);
      ALL.put(TRANSPORT_IPFS_GATEWAY_HTTP_CODE, TRANSPORT_IPFS_GATEWAY_HTTP);
    }

    protected TransportCodec() { /* protected */ }
}
