package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec;
import com.apicatalog.multicodec.Multicodec.Tag;

/** Multicodec Registry - generated: Wed Oct 02 02:08:33 CEST 2024 */
public class TransportCodec {

    /** Transport: transport-bitswap, Bitswap datatransfer, status = Draft, code = 0x900 */
    public static final Multicodec TRANSPORT_BITSWAP = Multicodec.of("transport-bitswap",  Tag.Transport, 0x900);

    /** Transport: transport-graphsync-filecoinv1, Filecoin graphsync datatransfer, status = Draft, code = 0x910 */
    public static final Multicodec TRANSPORT_GRAPHSYNC_FILECOINV1 = Multicodec.of("transport-graphsync-filecoinv1",  Tag.Transport, 0x910);

    /** Transport: transport-ipfs-gateway-http, HTTP IPFS Gateway trustless datatransfer, status = Draft, code = 0x920 */
    public static final Multicodec TRANSPORT_IPFS_GATEWAY_HTTP = Multicodec.of("transport-ipfs-gateway-http",  Tag.Transport, 0x920);

    protected static final Map<Long,Multicodec> ALL = new TreeMap<>();

    static {
      ALL.put(TRANSPORT_BITSWAP.code(), TRANSPORT_BITSWAP);
      ALL.put(TRANSPORT_GRAPHSYNC_FILECOINV1.code(), TRANSPORT_GRAPHSYNC_FILECOINV1);
      ALL.put(TRANSPORT_IPFS_GATEWAY_HTTP.code(), TRANSPORT_IPFS_GATEWAY_HTTP);
    }

    protected TransportCodec() { /* protected */ }
}
