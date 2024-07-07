package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec;
import com.apicatalog.multicodec.Multicodec.Tag;

/** Multicodec Registry - generated: Mon Jul 08 00:02:45 CEST 2024 */
public class NamespaceCodec {

    protected NamespaceCodec() { /* protected */ }

    /** Namespace: arweave-ns, Arweave Namespace, status = draft, code = 0xb29910 */
    public static final Multicodec ARWEAVE_NS = Multicodec.of("arweave-ns", Tag.Namespace, 0xb29910);

    /** Namespace: dnslink, DNSLink path, status = permanent, code = 0xe8 */
    public static final Multicodec DNSLINK = Multicodec.of("dnslink", Tag.Namespace, 0xe8);

    /** Namespace: ipfs, IPFS path, status = draft, code = 0xe3 */
    public static final Multicodec IPFS = Multicodec.of("ipfs", Tag.Namespace, 0xe3);

    /** Namespace: ipld, IPLD path, status = draft, code = 0xe2 */
    public static final Multicodec IPLD = Multicodec.of("ipld", Tag.Namespace, 0xe2);

    /** Namespace: ipns, IPNS path, status = draft, code = 0xe5 */
    public static final Multicodec IPNS = Multicodec.of("ipns", Tag.Namespace, 0xe5);

    /** Namespace: kumandra-ns, Kumandra Network Namespace, status = draft, code = 0xb49910 */
    public static final Multicodec KUMANDRA_NS = Multicodec.of("kumandra-ns", Tag.Namespace, 0xb49910);

    /** Namespace: lbry, LBRY Address, status = draft, code = 0x8c */
    public static final Multicodec LBRY = Multicodec.of("lbry", Tag.Namespace, 0x8c);

    /** Namespace: path, Namespace for string paths. Corresponds to `/` in ASCII., status = permanent, code = 0x2f */
    public static final Multicodec PATH = Multicodec.of("path", Tag.Namespace, 0x2f);

    /** Namespace: skynet-ns, Skynet Namespace, status = draft, code = 0xb19910 */
    public static final Multicodec SKYNET_NS = Multicodec.of("skynet-ns", Tag.Namespace, 0xb19910);

    /** Namespace: streamid, Ceramic Stream Id, status = draft, code = 0xce */
    public static final Multicodec STREAMID = Multicodec.of("streamid", Tag.Namespace, 0xce);

    /** Namespace: subspace-ns, Subspace Network Namespace, status = draft, code = 0xb39910 */
    public static final Multicodec SUBSPACE_NS = Multicodec.of("subspace-ns", Tag.Namespace, 0xb39910);

    /** Namespace: swarm, Swarm path, status = draft, code = 0xe4 */
    public static final Multicodec SWARM = Multicodec.of("swarm", Tag.Namespace, 0xe4);

    /** Namespace: zeronet, ZeroNet site address, status = draft, code = 0xe6 */
    public static final Multicodec ZERONET = Multicodec.of("zeronet", Tag.Namespace, 0xe6);

    protected static final Map<Long, Multicodec> ALL = new TreeMap<>();

    static {
      ALL.put(ARWEAVE_NS.code(), ARWEAVE_NS);
      ALL.put(DNSLINK.code(), DNSLINK);
      ALL.put(IPFS.code(), IPFS);
      ALL.put(IPLD.code(), IPLD);
      ALL.put(IPNS.code(), IPNS);
      ALL.put(KUMANDRA_NS.code(), KUMANDRA_NS);
      ALL.put(LBRY.code(), LBRY);
      ALL.put(PATH.code(), PATH);
      ALL.put(SKYNET_NS.code(), SKYNET_NS);
      ALL.put(STREAMID.code(), STREAMID);
      ALL.put(SUBSPACE_NS.code(), SUBSPACE_NS);
      ALL.put(SWARM.code(), SWARM);
      ALL.put(ZERONET.code(), ZERONET);
    }
}
