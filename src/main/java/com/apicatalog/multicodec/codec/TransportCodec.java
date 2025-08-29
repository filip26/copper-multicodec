package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec.Tag;
import com.apicatalog.multicodec.Multicodec;

/** Multicodec Registry - generated: Fri Aug 29 18:18:52 CEST 2025 */
public class TransportCodec {

    /** Transport: transport-bitswap, Bitswap datatransfer, status = draft, code = 0x900 */
    public static final Multicodec TRANSPORT_BITSWAP = Multicodec.of("transport-bitswap", Tag.Transport, 0x900, Multicodec.Status.Draft);

    /** Transport: transport-filecoin-piece-http, HTTP piece retrieval from Filecoin storage provider; https://github.com/filecoin-project/FIPs/blob/master/FRCs/frc-0066.md, status = draft, code = 0x930 */
    public static final Multicodec TRANSPORT_FILECOIN_PIECE_HTTP = Multicodec.of("transport-filecoin-piece-http", Tag.Transport, 0x930, Multicodec.Status.Draft);

    /** Transport: transport-graphsync-filecoinv1, Filecoin graphsync datatransfer, status = draft, code = 0x910 */
    public static final Multicodec TRANSPORT_GRAPHSYNC_FILECOINV1 = Multicodec.of("transport-graphsync-filecoinv1", Tag.Transport, 0x910, Multicodec.Status.Draft);

    /** Transport: transport-ipfs-gateway-http, HTTP IPFS Gateway trustless datatransfer, status = draft, code = 0x920 */
    public static final Multicodec TRANSPORT_IPFS_GATEWAY_HTTP = Multicodec.of("transport-ipfs-gateway-http", Tag.Transport, 0x920, Multicodec.Status.Draft);

    protected static final Map<Long,Multicodec> ALL = new TreeMap<>();

    static {
      ALL.put(TRANSPORT_BITSWAP.code(), TRANSPORT_BITSWAP);
      ALL.put(TRANSPORT_FILECOIN_PIECE_HTTP.code(), TRANSPORT_FILECOIN_PIECE_HTTP);
      ALL.put(TRANSPORT_GRAPHSYNC_FILECOINV1.code(), TRANSPORT_GRAPHSYNC_FILECOINV1);
      ALL.put(TRANSPORT_IPFS_GATEWAY_HTTP.code(), TRANSPORT_IPFS_GATEWAY_HTTP);
    }

    protected TransportCodec() { /* protected */ }
}
