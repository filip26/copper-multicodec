package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.time.Instant;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec.Tag;
import com.apicatalog.multicodec.Multicodec;

/** Multicodec Registry - generated: Mon Jul 06 23:31:03 CEST 2026 */
public class NamespaceCodec {

    public static final Instant UPDATED = Instant.parse("2026-07-06T21:31:03.622952876Z");

    public static final int ADNL_CODE = 0xb69910;
    /** Namespace: adnl, TON ADNL address: 32-byte SHA-256(0x4813b4c6_LE || Ed25519-pubkey), status = draft, code = 0xb69910, uvarint = [0x90, 0xb2, 0xda, 0x05] */
    public static final Multicodec ADNL = Multicodec.of("adnl", Tag.Namespace, ADNL_CODE, Multicodec.Status.Draft);

    public static final int ARWEAVE_NS_CODE = 0xb29910;
    /** Namespace: arweave-ns, Arweave Namespace, status = draft, code = 0xb29910, uvarint = [0x90, 0xb2, 0xca, 0x05] */
    public static final Multicodec ARWEAVE_NS = Multicodec.of("arweave-ns", Tag.Namespace, ARWEAVE_NS_CODE, Multicodec.Status.Draft);

    public static final int DNSLINK_CODE = 0xe8;
    /** Namespace: dnslink, DNSLink path, status = permanent, code = 0xe8, uvarint = [0xe8, 0x01] */
    public static final Multicodec DNSLINK = Multicodec.of("dnslink", Tag.Namespace, DNSLINK_CODE, Multicodec.Status.Permanent);

    public static final int IPFS_CODE = 0xe3;
    /** Namespace: ipfs, IPFS path, status = draft, code = 0xe3, uvarint = [0xe3, 0x01] */
    public static final Multicodec IPFS = Multicodec.of("ipfs", Tag.Namespace, IPFS_CODE, Multicodec.Status.Draft);

    public static final int IPLD_CODE = 0xe2;
    /** Namespace: ipld, IPLD path, status = draft, code = 0xe2, uvarint = [0xe2, 0x01] */
    public static final Multicodec IPLD = Multicodec.of("ipld", Tag.Namespace, IPLD_CODE, Multicodec.Status.Draft);

    public static final int IPNS_CODE = 0xe5;
    /** Namespace: ipns, IPNS path, status = draft, code = 0xe5, uvarint = [0xe5, 0x01] */
    public static final Multicodec IPNS = Multicodec.of("ipns", Tag.Namespace, IPNS_CODE, Multicodec.Status.Draft);

    public static final int KUMANDRA_NS_CODE = 0xb49910;
    /** Namespace: kumandra-ns, Kumandra Network Namespace, status = draft, code = 0xb49910, uvarint = [0x90, 0xb2, 0xd2, 0x05] */
    public static final Multicodec KUMANDRA_NS = Multicodec.of("kumandra-ns", Tag.Namespace, KUMANDRA_NS_CODE, Multicodec.Status.Draft);

    public static final int LBRY_CODE = 0x8c;
    /** Namespace: lbry, LBRY Address, status = draft, code = 0x8c, uvarint = [0x8c, 0x01] */
    public static final Multicodec LBRY = Multicodec.of("lbry", Tag.Namespace, LBRY_CODE, Multicodec.Status.Draft);

    public static final int MASSA_CODE = 0xb59910;
    /** Namespace: massa, Massa blockchain ecosystem, status = draft, code = 0xb59910, uvarint = [0x90, 0xb2, 0xd6, 0x05] */
    public static final Multicodec MASSA = Multicodec.of("massa", Tag.Namespace, MASSA_CODE, Multicodec.Status.Draft);

    public static final int MASSA_BUILDNET_CODE = 0xb59912;
    /** Namespace: massa-buildnet, Massa buildnet network, status = draft, code = 0xb59912, uvarint = [0x92, 0xb2, 0xd6, 0x05] */
    public static final Multicodec MASSA_BUILDNET = Multicodec.of("massa-buildnet", Tag.Namespace, MASSA_BUILDNET_CODE, Multicodec.Status.Draft);

    public static final int MASSA_DEWEB_CODE = 0xb59913;
    /** Namespace: massa-deweb, Massa DeWeb decentralized web, status = draft, code = 0xb59913, uvarint = [0x93, 0xb2, 0xd6, 0x05] */
    public static final Multicodec MASSA_DEWEB = Multicodec.of("massa-deweb", Tag.Namespace, MASSA_DEWEB_CODE, Multicodec.Status.Draft);

    public static final int MASSA_GOSSIP_CODE = 0xb59914;
    /** Namespace: massa-gossip, Massa Gossip decentralized messaging, status = draft, code = 0xb59914, uvarint = [0x94, 0xb2, 0xd6, 0x05] */
    public static final Multicodec MASSA_GOSSIP = Multicodec.of("massa-gossip", Tag.Namespace, MASSA_GOSSIP_CODE, Multicodec.Status.Draft);

    public static final int MASSA_GOSSIP_ID_CODE = 0xb59917;
    /** Namespace: massa-gossip-id, Massa Gossip ID target, status = draft, code = 0xb59917, uvarint = [0x97, 0xb2, 0xd6, 0x05] */
    public static final Multicodec MASSA_GOSSIP_ID = Multicodec.of("massa-gossip-id", Tag.Namespace, MASSA_GOSSIP_ID_CODE, Multicodec.Status.Draft);

    public static final int MASSA_MAINNET_CODE = 0xb59911;
    /** Namespace: massa-mainnet, Massa mainnet network, status = draft, code = 0xb59911, uvarint = [0x91, 0xb2, 0xd6, 0x05] */
    public static final Multicodec MASSA_MAINNET = Multicodec.of("massa-mainnet", Tag.Namespace, MASSA_MAINNET_CODE, Multicodec.Status.Draft);

    public static final int MASSA_MNS_CODE = 0xb59915;
    /** Namespace: massa-mns, Massa Name Service target, status = draft, code = 0xb59915, uvarint = [0x95, 0xb2, 0xd6, 0x05] */
    public static final Multicodec MASSA_MNS = Multicodec.of("massa-mns", Tag.Namespace, MASSA_MNS_CODE, Multicodec.Status.Draft);

    public static final int MASSA_SC_CODE = 0xb59916;
    /** Namespace: massa-sc, Massa smart-contract address target, status = draft, code = 0xb59916, uvarint = [0x96, 0xb2, 0xd6, 0x05] */
    public static final Multicodec MASSA_SC = Multicodec.of("massa-sc", Tag.Namespace, MASSA_SC_CODE, Multicodec.Status.Draft);

    public static final int PATH_CODE = 0x2f;
    /** Namespace: path, Namespace for string paths. Corresponds to `/` in ASCII., status = permanent, code = 0x2f, uvarint = [0x2f] */
    public static final Multicodec PATH = Multicodec.of("path", Tag.Namespace, PATH_CODE, Multicodec.Status.Permanent);

    public static final int SKYNET_NS_CODE = 0xb19910;
    /** Namespace: skynet-ns, Skynet Namespace, status = draft, code = 0xb19910, uvarint = [0x90, 0xb2, 0xc6, 0x05] */
    public static final Multicodec SKYNET_NS = Multicodec.of("skynet-ns", Tag.Namespace, SKYNET_NS_CODE, Multicodec.Status.Draft);

    public static final int STREAMID_CODE = 0xce;
    /** Namespace: streamid, Ceramic Stream ID, status = draft, code = 0xce, uvarint = [0xce, 0x01] */
    public static final Multicodec STREAMID = Multicodec.of("streamid", Tag.Namespace, STREAMID_CODE, Multicodec.Status.Draft);

    public static final int SUBSPACE_NS_CODE = 0xb39910;
    /** Namespace: subspace-ns, Subspace Network Namespace, status = draft, code = 0xb39910, uvarint = [0x90, 0xb2, 0xce, 0x05] */
    public static final Multicodec SUBSPACE_NS = Multicodec.of("subspace-ns", Tag.Namespace, SUBSPACE_NS_CODE, Multicodec.Status.Draft);

    public static final int SWARM_CODE = 0xe4;
    /** Namespace: swarm, Swarm path, status = draft, code = 0xe4, uvarint = [0xe4, 0x01] */
    public static final Multicodec SWARM = Multicodec.of("swarm", Tag.Namespace, SWARM_CODE, Multicodec.Status.Draft);

    public static final int ZERONET_CODE = 0xe6;
    /** Namespace: zeronet, ZeroNet site address, status = draft, code = 0xe6, uvarint = [0xe6, 0x01] */
    public static final Multicodec ZERONET = Multicodec.of("zeronet", Tag.Namespace, ZERONET_CODE, Multicodec.Status.Draft);

    protected static final Map<Integer,Multicodec> ALL = new TreeMap<>();

    static {
      ALL.put(ADNL_CODE, ADNL);
      ALL.put(ARWEAVE_NS_CODE, ARWEAVE_NS);
      ALL.put(DNSLINK_CODE, DNSLINK);
      ALL.put(IPFS_CODE, IPFS);
      ALL.put(IPLD_CODE, IPLD);
      ALL.put(IPNS_CODE, IPNS);
      ALL.put(KUMANDRA_NS_CODE, KUMANDRA_NS);
      ALL.put(LBRY_CODE, LBRY);
      ALL.put(MASSA_CODE, MASSA);
      ALL.put(MASSA_BUILDNET_CODE, MASSA_BUILDNET);
      ALL.put(MASSA_DEWEB_CODE, MASSA_DEWEB);
      ALL.put(MASSA_GOSSIP_CODE, MASSA_GOSSIP);
      ALL.put(MASSA_GOSSIP_ID_CODE, MASSA_GOSSIP_ID);
      ALL.put(MASSA_MAINNET_CODE, MASSA_MAINNET);
      ALL.put(MASSA_MNS_CODE, MASSA_MNS);
      ALL.put(MASSA_SC_CODE, MASSA_SC);
      ALL.put(PATH_CODE, PATH);
      ALL.put(SKYNET_NS_CODE, SKYNET_NS);
      ALL.put(STREAMID_CODE, STREAMID);
      ALL.put(SUBSPACE_NS_CODE, SUBSPACE_NS);
      ALL.put(SWARM_CODE, SWARM);
      ALL.put(ZERONET_CODE, ZERONET);
    }

    protected NamespaceCodec() { /* protected */ }
}
