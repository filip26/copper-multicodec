package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.time.Instant;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec.Tag;
import com.apicatalog.multicodec.Multicodec;

/** Multicodec Registry - generated: Mon Jul 06 23:31:03 CEST 2026 */
public class MultiformatCodec {

    public static final Instant UPDATED = Instant.parse("2026-07-06T21:31:03.627062128Z");

    public static final int CAIP_50_CODE = 0xca;
    /** Multiformat: caip-50, CAIP-50 multi-chain account ID, status = draft, code = 0xca, uvarint = [0xca, 0x01] */
    public static final Multicodec CAIP_50 = Multicodec.of("caip-50", Tag.Multiformat, CAIP_50_CODE, Multicodec.Status.Draft);

    public static final int MULTIADDR_CODE = 0x32;
    /** Multiformat: multiaddr, status = draft, code = 0x32, uvarint = [0x32] */
    public static final Multicodec MULTIADDR = Multicodec.of("multiaddr", Tag.Multiformat, MULTIADDR_CODE, Multicodec.Status.Draft);

    public static final int MULTIBASE_CODE = 0x33;
    /** Multiformat: multibase, status = draft, code = 0x33, uvarint = [0x33] */
    public static final Multicodec MULTIBASE = Multicodec.of("multibase", Tag.Multiformat, MULTIBASE_CODE, Multicodec.Status.Draft);

    public static final int MULTICODEC_CODE = 0x30;
    /** Multiformat: multicodec, status = draft, code = 0x30, uvarint = [0x30] */
    public static final Multicodec MULTICODEC = Multicodec.of("multicodec", Tag.Multiformat, MULTICODEC_CODE, Multicodec.Status.Draft);

    public static final int MULTIDID_CODE = 0xd1d;
    /** Multiformat: multidid, Compact encoding for Decentralized Identifers, status = draft, code = 0xd1d, uvarint = [0x9d, 0x1a] */
    public static final Multicodec MULTIDID = Multicodec.of("multidid", Tag.Multiformat, MULTIDID_CODE, Multicodec.Status.Draft);

    public static final int MULTIHASH_CODE = 0x31;
    /** Multiformat: multihash, status = draft, code = 0x31, uvarint = [0x31] */
    public static final Multicodec MULTIHASH = Multicodec.of("multihash", Tag.Multiformat, MULTIHASH_CODE, Multicodec.Status.Draft);

    public static final int MULTIKEY_CODE = 0x123a;
    /** Multiformat: multikey, Encryption key multiformat, status = draft, code = 0x123a, uvarint = [0xba, 0x24] */
    public static final Multicodec MULTIKEY = Multicodec.of("multikey", Tag.Multiformat, MULTIKEY_CODE, Multicodec.Status.Draft);

    public static final int MULTISIG_CODE = 0x1239;
    /** Multiformat: multisig, Digital signature multiformat, status = draft, code = 0x1239, uvarint = [0xb9, 0x24] */
    public static final Multicodec MULTISIG = Multicodec.of("multisig", Tag.Multiformat, MULTISIG_CODE, Multicodec.Status.Draft);

    public static final int VARSIG_CODE = 0x34;
    /** Multiformat: varsig, Variable signature (varsig) multiformat, status = draft, code = 0x34, uvarint = [0x34] */
    public static final Multicodec VARSIG = Multicodec.of("varsig", Tag.Multiformat, VARSIG_CODE, Multicodec.Status.Draft);

    protected static final Map<Integer,Multicodec> ALL = new TreeMap<>();

    static {
      ALL.put(CAIP_50_CODE, CAIP_50);
      ALL.put(MULTIADDR_CODE, MULTIADDR);
      ALL.put(MULTIBASE_CODE, MULTIBASE);
      ALL.put(MULTICODEC_CODE, MULTICODEC);
      ALL.put(MULTIDID_CODE, MULTIDID);
      ALL.put(MULTIHASH_CODE, MULTIHASH);
      ALL.put(MULTIKEY_CODE, MULTIKEY);
      ALL.put(MULTISIG_CODE, MULTISIG);
      ALL.put(VARSIG_CODE, VARSIG);
    }

    protected MultiformatCodec() { /* protected */ }
}
