package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.time.Instant;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec.Tag;
import com.apicatalog.multicodec.Multicodec;

/** Multicodec Registry - generated: Mon Jun 01 18:59:15 CEST 2026 */
public class NamespaceCodec {

    public static final Instant UPDATED = Instant.parse("2026-06-01T16:59:15.578Z");

    /** Namespace: adnl, TON ADNL address: 32-byte SHA-256(0x4813b4c6_LE || Ed25519-pubkey), status = draft, code = 0xb69910 */
    public static final Multicodec ADNL = Multicodec.of("adnl", Tag.Namespace, 0xb69910, Multicodec.Status.Draft);

    /** Namespace: arweave-ns, Arweave Namespace, status = draft, code = 0xb29910 */
    public static final Multicodec ARWEAVE_NS = Multicodec.of("arweave-ns", Tag.Namespace, 0xb29910, Multicodec.Status.Draft);

    /** Namespace: dnslink, DNSLink path, status = permanent, code = 0xe8 */
    public static final Multicodec DNSLINK = Multicodec.of("dnslink", Tag.Namespace, 0xe8, Multicodec.Status.Permanent);

    /** Namespace: ipfs, IPFS path, status = draft, code = 0xe3 */
    public static final Multicodec IPFS = Multicodec.of("ipfs", Tag.Namespace, 0xe3, Multicodec.Status.Draft);

    /** Namespace: ipld, IPLD path, status = draft, code = 0xe2 */
    public static final Multicodec IPLD = Multicodec.of("ipld", Tag.Namespace, 0xe2, Multicodec.Status.Draft);

    /** Namespace: ipns, IPNS path, status = draft, code = 0xe5 */
    public static final Multicodec IPNS = Multicodec.of("ipns", Tag.Namespace, 0xe5, Multicodec.Status.Draft);

    /** Namespace: kumandra-ns, Kumandra Network Namespace, status = draft, code = 0xb49910 */
    public static final Multicodec KUMANDRA_NS = Multicodec.of("kumandra-ns", Tag.Namespace, 0xb49910, Multicodec.Status.Draft);

    /** Namespace: lbry, LBRY Address, status = draft, code = 0x8c */
    public static final Multicodec LBRY = Multicodec.of("lbry", Tag.Namespace, 0x8c, Multicodec.Status.Draft);

    /** Namespace: massa, Massa blockchain ecosystem, status = draft, code = 0xb59910 */
    public static final Multicodec MASSA = Multicodec.of("massa", Tag.Namespace, 0xb59910, Multicodec.Status.Draft);

    /** Namespace: massa-buildnet, Massa buildnet network, status = draft, code = 0xb59912 */
    public static final Multicodec MASSA_BUILDNET = Multicodec.of("massa-buildnet", Tag.Namespace, 0xb59912, Multicodec.Status.Draft);

    /** Namespace: massa-deweb, Massa DeWeb decentralized web, status = draft, code = 0xb59913 */
    public static final Multicodec MASSA_DEWEB = Multicodec.of("massa-deweb", Tag.Namespace, 0xb59913, Multicodec.Status.Draft);

    /** Namespace: massa-gossip, Massa Gossip decentralized messaging, status = draft, code = 0xb59914 */
    public static final Multicodec MASSA_GOSSIP = Multicodec.of("massa-gossip", Tag.Namespace, 0xb59914, Multicodec.Status.Draft);

    /** Namespace: massa-gossip-id, Massa Gossip ID target, status = draft, code = 0xb59917 */
    public static final Multicodec MASSA_GOSSIP_ID = Multicodec.of("massa-gossip-id", Tag.Namespace, 0xb59917, Multicodec.Status.Draft);

    /** Namespace: massa-mainnet, Massa mainnet network, status = draft, code = 0xb59911 */
    public static final Multicodec MASSA_MAINNET = Multicodec.of("massa-mainnet", Tag.Namespace, 0xb59911, Multicodec.Status.Draft);

    /** Namespace: massa-mns, Massa Name Service target, status = draft, code = 0xb59915 */
    public static final Multicodec MASSA_MNS = Multicodec.of("massa-mns", Tag.Namespace, 0xb59915, Multicodec.Status.Draft);

    /** Namespace: massa-sc, Massa smart-contract address target, status = draft, code = 0xb59916 */
    public static final Multicodec MASSA_SC = Multicodec.of("massa-sc", Tag.Namespace, 0xb59916, Multicodec.Status.Draft);

    /** Namespace: path, Namespace for string paths. Corresponds to `/` in ASCII., status = permanent, code = 0x2f */
    public static final Multicodec PATH = Multicodec.of("path", Tag.Namespace, 0x2f, Multicodec.Status.Permanent);

    /** Namespace: skynet-ns, Skynet Namespace, status = draft, code = 0xb19910 */
    public static final Multicodec SKYNET_NS = Multicodec.of("skynet-ns", Tag.Namespace, 0xb19910, Multicodec.Status.Draft);

    /** Namespace: streamid, Ceramic Stream ID, status = draft, code = 0xce */
    public static final Multicodec STREAMID = Multicodec.of("streamid", Tag.Namespace, 0xce, Multicodec.Status.Draft);

    /** Namespace: subspace-ns, Subspace Network Namespace, status = draft, code = 0xb39910 */
    public static final Multicodec SUBSPACE_NS = Multicodec.of("subspace-ns", Tag.Namespace, 0xb39910, Multicodec.Status.Draft);

    /** Namespace: swarm, Swarm path, status = draft, code = 0xe4 */
    public static final Multicodec SWARM = Multicodec.of("swarm", Tag.Namespace, 0xe4, Multicodec.Status.Draft);

    /** Namespace: zeronet, ZeroNet site address, status = draft, code = 0xe6 */
    public static final Multicodec ZERONET = Multicodec.of("zeronet", Tag.Namespace, 0xe6, Multicodec.Status.Draft);

    protected static final Map<Long,Multicodec> ALL = new TreeMap<>();

    static {
      ALL.put(ADNL.code(), ADNL);
      ALL.put(ARWEAVE_NS.code(), ARWEAVE_NS);
      ALL.put(DNSLINK.code(), DNSLINK);
      ALL.put(IPFS.code(), IPFS);
      ALL.put(IPLD.code(), IPLD);
      ALL.put(IPNS.code(), IPNS);
      ALL.put(KUMANDRA_NS.code(), KUMANDRA_NS);
      ALL.put(LBRY.code(), LBRY);
      ALL.put(MASSA.code(), MASSA);
      ALL.put(MASSA_BUILDNET.code(), MASSA_BUILDNET);
      ALL.put(MASSA_DEWEB.code(), MASSA_DEWEB);
      ALL.put(MASSA_GOSSIP.code(), MASSA_GOSSIP);
      ALL.put(MASSA_GOSSIP_ID.code(), MASSA_GOSSIP_ID);
      ALL.put(MASSA_MAINNET.code(), MASSA_MAINNET);
      ALL.put(MASSA_MNS.code(), MASSA_MNS);
      ALL.put(MASSA_SC.code(), MASSA_SC);
      ALL.put(PATH.code(), PATH);
      ALL.put(SKYNET_NS.code(), SKYNET_NS);
      ALL.put(STREAMID.code(), STREAMID);
      ALL.put(SUBSPACE_NS.code(), SUBSPACE_NS);
      ALL.put(SWARM.code(), SWARM);
      ALL.put(ZERONET.code(), ZERONET);
    }

    protected NamespaceCodec() { /* protected */ }
}
