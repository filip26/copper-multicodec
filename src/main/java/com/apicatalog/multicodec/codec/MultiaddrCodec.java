package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.time.Instant;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec.Tag;
import com.apicatalog.multicodec.Multicodec;

/** Multicodec Registry - generated: Sat Jun 20 18:15:55 CEST 2026 */
public class MultiaddrCodec {

    public static final Instant UPDATED = Instant.parse("2026-06-20T16:15:55.282Z");

    public static final long CERTHASH_CODE = 0x1d2;
    /** Multiaddr: certhash, TLS certificate's fingerprint as a multihash, status = draft, code = 0x1d2, uvarint = [0xd2, 0x03] */
    public static final Multicodec CERTHASH = Multicodec.of("certhash", Tag.Multiaddr, CERTHASH_CODE, Multicodec.Status.Draft);

    public static final long DCCP_CODE = 0x21;
    /** Multiaddr: dccp, status = draft, code = 0x21, uvarint = [0x21] */
    public static final Multicodec DCCP = Multicodec.of("dccp", Tag.Multiaddr, DCCP_CODE, Multicodec.Status.Draft);

    public static final long DNS_CODE = 0x35;
    /** Multiaddr: dns, status = permanent, code = 0x35, uvarint = [0x35] */
    public static final Multicodec DNS = Multicodec.of("dns", Tag.Multiaddr, DNS_CODE, Multicodec.Status.Permanent);

    public static final long DNS4_CODE = 0x36;
    /** Multiaddr: dns4, status = permanent, code = 0x36, uvarint = [0x36] */
    public static final Multicodec DNS4 = Multicodec.of("dns4", Tag.Multiaddr, DNS4_CODE, Multicodec.Status.Permanent);

    public static final long DNS6_CODE = 0x37;
    /** Multiaddr: dns6, status = permanent, code = 0x37, uvarint = [0x37] */
    public static final Multicodec DNS6 = Multicodec.of("dns6", Tag.Multiaddr, DNS6_CODE, Multicodec.Status.Permanent);

    public static final long DNSADDR_CODE = 0x38;
    /** Multiaddr: dnsaddr, status = permanent, code = 0x38, uvarint = [0x38] */
    public static final Multicodec DNSADDR = Multicodec.of("dnsaddr", Tag.Multiaddr, DNSADDR_CODE, Multicodec.Status.Permanent);

    public static final long GARLIC32_CODE = 0x1bf;
    /** Multiaddr: garlic32, I2P base32 (hashed public key or encoded public key/checksum+optional secret), status = draft, code = 0x1bf, uvarint = [0xbf, 0x03] */
    public static final Multicodec GARLIC32 = Multicodec.of("garlic32", Tag.Multiaddr, GARLIC32_CODE, Multicodec.Status.Draft);

    public static final long GARLIC64_CODE = 0x1be;
    /** Multiaddr: garlic64, I2P base64 (raw public key), status = draft, code = 0x1be, uvarint = [0xbe, 0x03] */
    public static final Multicodec GARLIC64 = Multicodec.of("garlic64", Tag.Multiaddr, GARLIC64_CODE, Multicodec.Status.Draft);

    public static final long HTTP_CODE = 0x1e0;
    /** Multiaddr: http, status = draft, code = 0x1e0, uvarint = [0xe0, 0x03] */
    public static final Multicodec HTTP = Multicodec.of("http", Tag.Multiaddr, HTTP_CODE, Multicodec.Status.Draft);

    public static final long HTTP_PATH_CODE = 0x1e1;
    /** Multiaddr: http-path, Percent-encoded path to an HTTP resource, status = draft, code = 0x1e1, uvarint = [0xe1, 0x03] */
    public static final Multicodec HTTP_PATH = Multicodec.of("http-path", Tag.Multiaddr, HTTP_PATH_CODE, Multicodec.Status.Draft);

    public static final long HTTPS_CODE = 0x1bb;
    /** Multiaddr: https, status = draft, code = 0x1bb, uvarint = [0xbb, 0x03] */
    public static final Multicodec HTTPS = Multicodec.of("https", Tag.Multiaddr, HTTPS_CODE, Multicodec.Status.Draft);

    public static final long IP4_CODE = 0x4;
    /** Multiaddr: ip4, status = permanent, code = 0x4, uvarint = [0x04] */
    public static final Multicodec IP4 = Multicodec.of("ip4", Tag.Multiaddr, IP4_CODE, Multicodec.Status.Permanent);

    public static final long IP6_CODE = 0x29;
    /** Multiaddr: ip6, status = permanent, code = 0x29, uvarint = [0x29] */
    public static final Multicodec IP6 = Multicodec.of("ip6", Tag.Multiaddr, IP6_CODE, Multicodec.Status.Permanent);

    public static final long IP6ZONE_CODE = 0x2a;
    /** Multiaddr: ip6zone, status = draft, code = 0x2a, uvarint = [0x2a] */
    public static final Multicodec IP6ZONE = Multicodec.of("ip6zone", Tag.Multiaddr, IP6ZONE_CODE, Multicodec.Status.Draft);

    public static final long IPCIDR_CODE = 0x2b;
    /** Multiaddr: ipcidr, CIDR mask for IP addresses, status = draft, code = 0x2b, uvarint = [0x2b] */
    public static final Multicodec IPCIDR = Multicodec.of("ipcidr", Tag.Multiaddr, IPCIDR_CODE, Multicodec.Status.Draft);

    public static final long NOISE_CODE = 0x1c6;
    /** Multiaddr: noise, status = draft, code = 0x1c6, uvarint = [0xc6, 0x03] */
    public static final Multicodec NOISE = Multicodec.of("noise", Tag.Multiaddr, NOISE_CODE, Multicodec.Status.Draft);

    public static final long ONION_CODE = 0x1bc;
    /** Multiaddr: onion, status = draft, code = 0x1bc, uvarint = [0xbc, 0x03] */
    public static final Multicodec ONION = Multicodec.of("onion", Tag.Multiaddr, ONION_CODE, Multicodec.Status.Draft);

    public static final long ONION3_CODE = 0x1bd;
    /** Multiaddr: onion3, status = draft, code = 0x1bd, uvarint = [0xbd, 0x03] */
    public static final Multicodec ONION3 = Multicodec.of("onion3", Tag.Multiaddr, ONION3_CODE, Multicodec.Status.Draft);

    public static final long P2P_CODE = 0x1a5;
    /** Multiaddr: p2p, libp2p, status = permanent, code = 0x1a5, uvarint = [0xa5, 0x03] */
    public static final Multicodec P2P = Multicodec.of("p2p", Tag.Multiaddr, P2P_CODE, Multicodec.Status.Permanent);

    public static final long P2P_CIRCUIT_CODE = 0x122;
    /** Multiaddr: p2p-circuit, status = permanent, code = 0x122, uvarint = [0xa2, 0x02] */
    public static final Multicodec P2P_CIRCUIT = Multicodec.of("p2p-circuit", Tag.Multiaddr, P2P_CIRCUIT_CODE, Multicodec.Status.Permanent);

    public static final long P2P_STARDUST_CODE = 0x115;
    /** Multiaddr: p2p-stardust, status = deprecated, code = 0x115, uvarint = [0x95, 0x02] */
    public static final Multicodec P2P_STARDUST = Multicodec.of("p2p-stardust", Tag.Multiaddr, P2P_STARDUST_CODE, Multicodec.Status.Deprecated);

    public static final long P2P_WEBRTC_DIRECT_CODE = 0x114;
    /** Multiaddr: p2p-webrtc-direct, Use webrtc or webrtc-direct instead, status = deprecated, code = 0x114, uvarint = [0x94, 0x02] */
    public static final Multicodec P2P_WEBRTC_DIRECT = Multicodec.of("p2p-webrtc-direct", Tag.Multiaddr, P2P_WEBRTC_DIRECT_CODE, Multicodec.Status.Deprecated);

    public static final long P2P_WEBRTC_STAR_CODE = 0x113;
    /** Multiaddr: p2p-webrtc-star, Use webrtc or webrtc-direct instead, status = deprecated, code = 0x113, uvarint = [0x93, 0x02] */
    public static final Multicodec P2P_WEBRTC_STAR = Multicodec.of("p2p-webrtc-star", Tag.Multiaddr, P2P_WEBRTC_STAR_CODE, Multicodec.Status.Deprecated);

    public static final long P2P_WEBSOCKET_STAR_CODE = 0x1df;
    /** Multiaddr: p2p-websocket-star, status = permanent, code = 0x1df, uvarint = [0xdf, 0x03] */
    public static final Multicodec P2P_WEBSOCKET_STAR = Multicodec.of("p2p-websocket-star", Tag.Multiaddr, P2P_WEBSOCKET_STAR_CODE, Multicodec.Status.Permanent);

    public static final long PLAINTEXTV2_CODE = 0x706c61;
    /** Multiaddr: plaintextv2, status = draft, code = 0x706c61, uvarint = [0xe1, 0xd8, 0xc1, 0x03] */
    public static final Multicodec PLAINTEXTV2 = Multicodec.of("plaintextv2", Tag.Multiaddr, PLAINTEXTV2_CODE, Multicodec.Status.Draft);

    public static final long QUIC_CODE = 0x1cc;
    /** Multiaddr: quic, status = permanent, code = 0x1cc, uvarint = [0xcc, 0x03] */
    public static final Multicodec QUIC = Multicodec.of("quic", Tag.Multiaddr, QUIC_CODE, Multicodec.Status.Permanent);

    public static final long QUIC_V1_CODE = 0x1cd;
    /** Multiaddr: quic-v1, status = permanent, code = 0x1cd, uvarint = [0xcd, 0x03] */
    public static final Multicodec QUIC_V1 = Multicodec.of("quic-v1", Tag.Multiaddr, QUIC_V1_CODE, Multicodec.Status.Permanent);

    public static final long SCION_CODE = 0xd02000;
    /** Multiaddr: scion, SCION Internet architecture, status = draft, code = 0xd02000, uvarint = [0x80, 0xc0, 0xc0, 0x06] */
    public static final Multicodec SCION = Multicodec.of("scion", Tag.Multiaddr, SCION_CODE, Multicodec.Status.Draft);

    public static final long SCTP_CODE = 0x84;
    /** Multiaddr: sctp, status = draft, code = 0x84, uvarint = [0x84, 0x01] */
    public static final Multicodec SCTP = Multicodec.of("sctp", Tag.Multiaddr, SCTP_CODE, Multicodec.Status.Draft);

    public static final long SHS_CODE = 0x1c8;
    /** Multiaddr: shs, Secure Scuttlebutt - Secret Handshake Stream, status = draft, code = 0x1c8, uvarint = [0xc8, 0x03] */
    public static final Multicodec SHS = Multicodec.of("shs", Tag.Multiaddr, SHS_CODE, Multicodec.Status.Draft);

    public static final long SILVERPINE_CODE = 0x3f42;
    /** Multiaddr: silverpine, Experimental QUIC over yggdrasil and ironwood routing protocol, status = draft, code = 0x3f42, uvarint = [0xc2, 0x7e] */
    public static final Multicodec SILVERPINE = Multicodec.of("silverpine", Tag.Multiaddr, SILVERPINE_CODE, Multicodec.Status.Draft);

    public static final long SNI_CODE = 0x1c1;
    /** Multiaddr: sni, Server Name Indication RFC 6066 § 3, status = draft, code = 0x1c1, uvarint = [0xc1, 0x03] */
    public static final Multicodec SNI = Multicodec.of("sni", Tag.Multiaddr, SNI_CODE, Multicodec.Status.Draft);

    public static final long TCP_CODE = 0x6;
    /** Multiaddr: tcp, status = permanent, code = 0x6, uvarint = [0x06] */
    public static final Multicodec TCP = Multicodec.of("tcp", Tag.Multiaddr, TCP_CODE, Multicodec.Status.Permanent);

    public static final long THREAD_CODE = 0x196;
    /** Multiaddr: thread, Textile Thread, status = draft, code = 0x196, uvarint = [0x96, 0x03] */
    public static final Multicodec THREAD = Multicodec.of("thread", Tag.Multiaddr, THREAD_CODE, Multicodec.Status.Draft);

    public static final long TLS_CODE = 0x1c0;
    /** Multiaddr: tls, status = draft, code = 0x1c0, uvarint = [0xc0, 0x03] */
    public static final Multicodec TLS = Multicodec.of("tls", Tag.Multiaddr, TLS_CODE, Multicodec.Status.Draft);

    public static final long UDP_CODE = 0x111;
    /** Multiaddr: udp, status = draft, code = 0x111, uvarint = [0x91, 0x02] */
    public static final Multicodec UDP = Multicodec.of("udp", Tag.Multiaddr, UDP_CODE, Multicodec.Status.Draft);

    public static final long UDT_CODE = 0x12d;
    /** Multiaddr: udt, status = draft, code = 0x12d, uvarint = [0xad, 0x02] */
    public static final Multicodec UDT = Multicodec.of("udt", Tag.Multiaddr, UDT_CODE, Multicodec.Status.Draft);

    public static final long UNIX_CODE = 0x190;
    /** Multiaddr: unix, status = permanent, code = 0x190, uvarint = [0x90, 0x03] */
    public static final Multicodec UNIX = Multicodec.of("unix", Tag.Multiaddr, UNIX_CODE, Multicodec.Status.Permanent);

    public static final long UTP_CODE = 0x12e;
    /** Multiaddr: utp, status = draft, code = 0x12e, uvarint = [0xae, 0x02] */
    public static final Multicodec UTP = Multicodec.of("utp", Tag.Multiaddr, UTP_CODE, Multicodec.Status.Draft);

    public static final long WEBRTC_CODE = 0x119;
    /** Multiaddr: webrtc, webrtc transport where connection establishment is according to w3c spec, status = draft, code = 0x119, uvarint = [0x99, 0x02] */
    public static final Multicodec WEBRTC = Multicodec.of("webrtc", Tag.Multiaddr, WEBRTC_CODE, Multicodec.Status.Draft);

    public static final long WEBRTC_DIRECT_CODE = 0x118;
    /** Multiaddr: webrtc-direct, ICE-lite webrtc transport with SDP munging during connection establishment and without use of a STUN server, status = draft, code = 0x118, uvarint = [0x98, 0x02] */
    public static final Multicodec WEBRTC_DIRECT = Multicodec.of("webrtc-direct", Tag.Multiaddr, WEBRTC_DIRECT_CODE, Multicodec.Status.Draft);

    public static final long WEBTRANSPORT_CODE = 0x1d1;
    /** Multiaddr: webtransport, status = draft, code = 0x1d1, uvarint = [0xd1, 0x03] */
    public static final Multicodec WEBTRANSPORT = Multicodec.of("webtransport", Tag.Multiaddr, WEBTRANSPORT_CODE, Multicodec.Status.Draft);

    public static final long WS_CODE = 0x1dd;
    /** Multiaddr: ws, status = permanent, code = 0x1dd, uvarint = [0xdd, 0x03] */
    public static final Multicodec WS = Multicodec.of("ws", Tag.Multiaddr, WS_CODE, Multicodec.Status.Permanent);

    public static final long WSS_CODE = 0x1de;
    /** Multiaddr: wss, status = permanent, code = 0x1de, uvarint = [0xde, 0x03] */
    public static final Multicodec WSS = Multicodec.of("wss", Tag.Multiaddr, WSS_CODE, Multicodec.Status.Permanent);

    protected static final Map<Long,Multicodec> ALL = new TreeMap<>();

    static {
      ALL.put(CERTHASH_CODE, CERTHASH);
      ALL.put(DCCP_CODE, DCCP);
      ALL.put(DNS_CODE, DNS);
      ALL.put(DNS4_CODE, DNS4);
      ALL.put(DNS6_CODE, DNS6);
      ALL.put(DNSADDR_CODE, DNSADDR);
      ALL.put(GARLIC32_CODE, GARLIC32);
      ALL.put(GARLIC64_CODE, GARLIC64);
      ALL.put(HTTP_CODE, HTTP);
      ALL.put(HTTP_PATH_CODE, HTTP_PATH);
      ALL.put(HTTPS_CODE, HTTPS);
      ALL.put(IP4_CODE, IP4);
      ALL.put(IP6_CODE, IP6);
      ALL.put(IP6ZONE_CODE, IP6ZONE);
      ALL.put(IPCIDR_CODE, IPCIDR);
      ALL.put(NOISE_CODE, NOISE);
      ALL.put(ONION_CODE, ONION);
      ALL.put(ONION3_CODE, ONION3);
      ALL.put(P2P_CODE, P2P);
      ALL.put(P2P_CIRCUIT_CODE, P2P_CIRCUIT);
      ALL.put(P2P_STARDUST_CODE, P2P_STARDUST);
      ALL.put(P2P_WEBRTC_DIRECT_CODE, P2P_WEBRTC_DIRECT);
      ALL.put(P2P_WEBRTC_STAR_CODE, P2P_WEBRTC_STAR);
      ALL.put(P2P_WEBSOCKET_STAR_CODE, P2P_WEBSOCKET_STAR);
      ALL.put(PLAINTEXTV2_CODE, PLAINTEXTV2);
      ALL.put(QUIC_CODE, QUIC);
      ALL.put(QUIC_V1_CODE, QUIC_V1);
      ALL.put(SCION_CODE, SCION);
      ALL.put(SCTP_CODE, SCTP);
      ALL.put(SHS_CODE, SHS);
      ALL.put(SILVERPINE_CODE, SILVERPINE);
      ALL.put(SNI_CODE, SNI);
      ALL.put(TCP_CODE, TCP);
      ALL.put(THREAD_CODE, THREAD);
      ALL.put(TLS_CODE, TLS);
      ALL.put(UDP_CODE, UDP);
      ALL.put(UDT_CODE, UDT);
      ALL.put(UNIX_CODE, UNIX);
      ALL.put(UTP_CODE, UTP);
      ALL.put(WEBRTC_CODE, WEBRTC);
      ALL.put(WEBRTC_DIRECT_CODE, WEBRTC_DIRECT);
      ALL.put(WEBTRANSPORT_CODE, WEBTRANSPORT);
      ALL.put(WS_CODE, WS);
      ALL.put(WSS_CODE, WSS);
    }

    protected MultiaddrCodec() { /* protected */ }
}
