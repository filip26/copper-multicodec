package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec.Tag;
import com.apicatalog.multicodec.Multicodec;

/** Multicodec Registry - generated: Tue Jul 29 16:54:27 CEST 2025 */
public class MultiaddrCodec {

    /** Multiaddr: certhash, TLS certificate's fingerprint as a multihash, status = draft, code = 0x1d2 */
    public static final Multicodec CERTHASH = Multicodec.of("certhash", Tag.Multiaddr, 0x1d2, Multicodec.Status.Draft);

    /** Multiaddr: dccp, status = draft, code = 0x21 */
    public static final Multicodec DCCP = Multicodec.of("dccp", Tag.Multiaddr, 0x21, Multicodec.Status.Draft);

    /** Multiaddr: dns, status = permanent, code = 0x35 */
    public static final Multicodec DNS = Multicodec.of("dns", Tag.Multiaddr, 0x35, Multicodec.Status.Permanent);

    /** Multiaddr: dns4, status = permanent, code = 0x36 */
    public static final Multicodec DNS4 = Multicodec.of("dns4", Tag.Multiaddr, 0x36, Multicodec.Status.Permanent);

    /** Multiaddr: dns6, status = permanent, code = 0x37 */
    public static final Multicodec DNS6 = Multicodec.of("dns6", Tag.Multiaddr, 0x37, Multicodec.Status.Permanent);

    /** Multiaddr: dnsaddr, status = permanent, code = 0x38 */
    public static final Multicodec DNSADDR = Multicodec.of("dnsaddr", Tag.Multiaddr, 0x38, Multicodec.Status.Permanent);

    /** Multiaddr: garlic32, I2P base32 (hashed public key or encoded public key/checksum+optional secret), status = draft, code = 0x1bf */
    public static final Multicodec GARLIC32 = Multicodec.of("garlic32", Tag.Multiaddr, 0x1bf, Multicodec.Status.Draft);

    /** Multiaddr: garlic64, I2P base64 (raw public key), status = draft, code = 0x1be */
    public static final Multicodec GARLIC64 = Multicodec.of("garlic64", Tag.Multiaddr, 0x1be, Multicodec.Status.Draft);

    /** Multiaddr: http, status = draft, code = 0x1e0 */
    public static final Multicodec HTTP = Multicodec.of("http", Tag.Multiaddr, 0x1e0, Multicodec.Status.Draft);

    /** Multiaddr: http-path, Percent-encoded path to an HTTP resource, status = draft, code = 0x1e1 */
    public static final Multicodec HTTP_PATH = Multicodec.of("http-path", Tag.Multiaddr, 0x1e1, Multicodec.Status.Draft);

    /** Multiaddr: https, status = draft, code = 0x1bb */
    public static final Multicodec HTTPS = Multicodec.of("https", Tag.Multiaddr, 0x1bb, Multicodec.Status.Draft);

    /** Multiaddr: ip4, status = permanent, code = 0x4 */
    public static final Multicodec IP4 = Multicodec.of("ip4", Tag.Multiaddr, 0x4, Multicodec.Status.Permanent);

    /** Multiaddr: ip6, status = permanent, code = 0x29 */
    public static final Multicodec IP6 = Multicodec.of("ip6", Tag.Multiaddr, 0x29, Multicodec.Status.Permanent);

    /** Multiaddr: ip6zone, status = draft, code = 0x2a */
    public static final Multicodec IP6ZONE = Multicodec.of("ip6zone", Tag.Multiaddr, 0x2a, Multicodec.Status.Draft);

    /** Multiaddr: ipcidr, CIDR mask for IP addresses, status = draft, code = 0x2b */
    public static final Multicodec IPCIDR = Multicodec.of("ipcidr", Tag.Multiaddr, 0x2b, Multicodec.Status.Draft);

    /** Multiaddr: noise, status = draft, code = 0x1c6 */
    public static final Multicodec NOISE = Multicodec.of("noise", Tag.Multiaddr, 0x1c6, Multicodec.Status.Draft);

    /** Multiaddr: onion, status = draft, code = 0x1bc */
    public static final Multicodec ONION = Multicodec.of("onion", Tag.Multiaddr, 0x1bc, Multicodec.Status.Draft);

    /** Multiaddr: onion3, status = draft, code = 0x1bd */
    public static final Multicodec ONION3 = Multicodec.of("onion3", Tag.Multiaddr, 0x1bd, Multicodec.Status.Draft);

    /** Multiaddr: p2p, libp2p, status = permanent, code = 0x1a5 */
    public static final Multicodec P2P = Multicodec.of("p2p", Tag.Multiaddr, 0x1a5, Multicodec.Status.Permanent);

    /** Multiaddr: p2p-circuit, status = permanent, code = 0x122 */
    public static final Multicodec P2P_CIRCUIT = Multicodec.of("p2p-circuit", Tag.Multiaddr, 0x122, Multicodec.Status.Permanent);

    /** Multiaddr: p2p-stardust, status = deprecated, code = 0x115 */
    public static final Multicodec P2P_STARDUST = Multicodec.of("p2p-stardust", Tag.Multiaddr, 0x115, Multicodec.Status.Deprecated);

    /** Multiaddr: p2p-webrtc-direct, Use webrtc or webrtc-direct instead, status = deprecated, code = 0x114 */
    public static final Multicodec P2P_WEBRTC_DIRECT = Multicodec.of("p2p-webrtc-direct", Tag.Multiaddr, 0x114, Multicodec.Status.Deprecated);

    /** Multiaddr: p2p-webrtc-star, Use webrtc or webrtc-direct instead, status = deprecated, code = 0x113 */
    public static final Multicodec P2P_WEBRTC_STAR = Multicodec.of("p2p-webrtc-star", Tag.Multiaddr, 0x113, Multicodec.Status.Deprecated);

    /** Multiaddr: p2p-websocket-star, status = permanent, code = 0x1df */
    public static final Multicodec P2P_WEBSOCKET_STAR = Multicodec.of("p2p-websocket-star", Tag.Multiaddr, 0x1df, Multicodec.Status.Permanent);

    /** Multiaddr: plaintextv2, status = draft, code = 0x706c61 */
    public static final Multicodec PLAINTEXTV2 = Multicodec.of("plaintextv2", Tag.Multiaddr, 0x706c61, Multicodec.Status.Draft);

    /** Multiaddr: quic, status = permanent, code = 0x1cc */
    public static final Multicodec QUIC = Multicodec.of("quic", Tag.Multiaddr, 0x1cc, Multicodec.Status.Permanent);

    /** Multiaddr: quic-v1, status = permanent, code = 0x1cd */
    public static final Multicodec QUIC_V1 = Multicodec.of("quic-v1", Tag.Multiaddr, 0x1cd, Multicodec.Status.Permanent);

    /** Multiaddr: scion, SCION Internet architecture, status = draft, code = 0xd02000 */
    public static final Multicodec SCION = Multicodec.of("scion", Tag.Multiaddr, 0xd02000, Multicodec.Status.Draft);

    /** Multiaddr: sctp, status = draft, code = 0x84 */
    public static final Multicodec SCTP = Multicodec.of("sctp", Tag.Multiaddr, 0x84, Multicodec.Status.Draft);

    /** Multiaddr: shs, Secure Scuttlebutt - Secret Handshake Stream, status = draft, code = 0x1c8 */
    public static final Multicodec SHS = Multicodec.of("shs", Tag.Multiaddr, 0x1c8, Multicodec.Status.Draft);

    /** Multiaddr: silverpine, Experimental QUIC over yggdrasil and ironwood routing protocol, status = draft, code = 0x3f42 */
    public static final Multicodec SILVERPINE = Multicodec.of("silverpine", Tag.Multiaddr, 0x3f42, Multicodec.Status.Draft);

    /** Multiaddr: sni, Server Name Indication RFC 6066 § 3, status = draft, code = 0x1c1 */
    public static final Multicodec SNI = Multicodec.of("sni", Tag.Multiaddr, 0x1c1, Multicodec.Status.Draft);

    /** Multiaddr: tcp, status = permanent, code = 0x6 */
    public static final Multicodec TCP = Multicodec.of("tcp", Tag.Multiaddr, 0x6, Multicodec.Status.Permanent);

    /** Multiaddr: thread, Textile Thread, status = draft, code = 0x196 */
    public static final Multicodec THREAD = Multicodec.of("thread", Tag.Multiaddr, 0x196, Multicodec.Status.Draft);

    /** Multiaddr: tls, status = draft, code = 0x1c0 */
    public static final Multicodec TLS = Multicodec.of("tls", Tag.Multiaddr, 0x1c0, Multicodec.Status.Draft);

    /** Multiaddr: udp, status = draft, code = 0x111 */
    public static final Multicodec UDP = Multicodec.of("udp", Tag.Multiaddr, 0x111, Multicodec.Status.Draft);

    /** Multiaddr: udt, status = draft, code = 0x12d */
    public static final Multicodec UDT = Multicodec.of("udt", Tag.Multiaddr, 0x12d, Multicodec.Status.Draft);

    /** Multiaddr: unix, status = permanent, code = 0x190 */
    public static final Multicodec UNIX = Multicodec.of("unix", Tag.Multiaddr, 0x190, Multicodec.Status.Permanent);

    /** Multiaddr: utp, status = draft, code = 0x12e */
    public static final Multicodec UTP = Multicodec.of("utp", Tag.Multiaddr, 0x12e, Multicodec.Status.Draft);

    /** Multiaddr: webrtc, webrtc transport where connection establishment is according to w3c spec, status = draft, code = 0x119 */
    public static final Multicodec WEBRTC = Multicodec.of("webrtc", Tag.Multiaddr, 0x119, Multicodec.Status.Draft);

    /** Multiaddr: webrtc-direct, ICE-lite webrtc transport with SDP munging during connection establishment and without use of a STUN server, status = draft, code = 0x118 */
    public static final Multicodec WEBRTC_DIRECT = Multicodec.of("webrtc-direct", Tag.Multiaddr, 0x118, Multicodec.Status.Draft);

    /** Multiaddr: webtransport, status = draft, code = 0x1d1 */
    public static final Multicodec WEBTRANSPORT = Multicodec.of("webtransport", Tag.Multiaddr, 0x1d1, Multicodec.Status.Draft);

    /** Multiaddr: ws, status = permanent, code = 0x1dd */
    public static final Multicodec WS = Multicodec.of("ws", Tag.Multiaddr, 0x1dd, Multicodec.Status.Permanent);

    /** Multiaddr: wss, status = permanent, code = 0x1de */
    public static final Multicodec WSS = Multicodec.of("wss", Tag.Multiaddr, 0x1de, Multicodec.Status.Permanent);

    protected static final Map<Long,Multicodec> ALL = new TreeMap<>();

    static {
      ALL.put(CERTHASH.code(), CERTHASH);
      ALL.put(DCCP.code(), DCCP);
      ALL.put(DNS.code(), DNS);
      ALL.put(DNS4.code(), DNS4);
      ALL.put(DNS6.code(), DNS6);
      ALL.put(DNSADDR.code(), DNSADDR);
      ALL.put(GARLIC32.code(), GARLIC32);
      ALL.put(GARLIC64.code(), GARLIC64);
      ALL.put(HTTP.code(), HTTP);
      ALL.put(HTTP_PATH.code(), HTTP_PATH);
      ALL.put(HTTPS.code(), HTTPS);
      ALL.put(IP4.code(), IP4);
      ALL.put(IP6.code(), IP6);
      ALL.put(IP6ZONE.code(), IP6ZONE);
      ALL.put(IPCIDR.code(), IPCIDR);
      ALL.put(NOISE.code(), NOISE);
      ALL.put(ONION.code(), ONION);
      ALL.put(ONION3.code(), ONION3);
      ALL.put(P2P.code(), P2P);
      ALL.put(P2P_CIRCUIT.code(), P2P_CIRCUIT);
      ALL.put(P2P_STARDUST.code(), P2P_STARDUST);
      ALL.put(P2P_WEBRTC_DIRECT.code(), P2P_WEBRTC_DIRECT);
      ALL.put(P2P_WEBRTC_STAR.code(), P2P_WEBRTC_STAR);
      ALL.put(P2P_WEBSOCKET_STAR.code(), P2P_WEBSOCKET_STAR);
      ALL.put(PLAINTEXTV2.code(), PLAINTEXTV2);
      ALL.put(QUIC.code(), QUIC);
      ALL.put(QUIC_V1.code(), QUIC_V1);
      ALL.put(SCION.code(), SCION);
      ALL.put(SCTP.code(), SCTP);
      ALL.put(SHS.code(), SHS);
      ALL.put(SILVERPINE.code(), SILVERPINE);
      ALL.put(SNI.code(), SNI);
      ALL.put(TCP.code(), TCP);
      ALL.put(THREAD.code(), THREAD);
      ALL.put(TLS.code(), TLS);
      ALL.put(UDP.code(), UDP);
      ALL.put(UDT.code(), UDT);
      ALL.put(UNIX.code(), UNIX);
      ALL.put(UTP.code(), UTP);
      ALL.put(WEBRTC.code(), WEBRTC);
      ALL.put(WEBRTC_DIRECT.code(), WEBRTC_DIRECT);
      ALL.put(WEBTRANSPORT.code(), WEBTRANSPORT);
      ALL.put(WS.code(), WS);
      ALL.put(WSS.code(), WSS);
    }

    protected MultiaddrCodec() { /* protected */ }
}
