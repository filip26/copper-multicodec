package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec;
import com.apicatalog.multicodec.Multicodec.Tag;

/** Multicodec Registry - generated: Tue Oct 01 13:47:11 CEST 2024 */
public class MultiformatCodec {

    /** Multiformat: caip-50, CAIP-50 multi-chain account id, status = draft, code = 0xca */
    public static final Multicodec CAIP_50 = Multicodec.of("caip-50", Tag.Multiformat, 0xca);

    /** Multiformat: multiaddr, status = draft, code = 0x32 */
    public static final Multicodec MULTIADDR = Multicodec.of("multiaddr", Tag.Multiformat, 0x32);

    /** Multiformat: multibase, status = draft, code = 0x33 */
    public static final Multicodec MULTIBASE = Multicodec.of("multibase", Tag.Multiformat, 0x33);

    /** Multiformat: multicodec, status = draft, code = 0x30 */
    public static final Multicodec MULTICODEC = Multicodec.of("multicodec", Tag.Multiformat, 0x30);

    /** Multiformat: multidid, Compact encoding for Decentralized Identifers, status = draft, code = 0xd1d */
    public static final Multicodec MULTIDID = Multicodec.of("multidid", Tag.Multiformat, 0xd1d);

    /** Multiformat: multihash, status = draft, code = 0x31 */
    public static final Multicodec MULTIHASH = Multicodec.of("multihash", Tag.Multiformat, 0x31);

    /** Multiformat: multikey, Encryption key multiformat, status = draft, code = 0x123a */
    public static final Multicodec MULTIKEY = Multicodec.of("multikey", Tag.Multiformat, 0x123a);

    /** Multiformat: multisig, Digital signature multiformat, status = draft, code = 0x1239 */
    public static final Multicodec MULTISIG = Multicodec.of("multisig", Tag.Multiformat, 0x1239);

    /** Multiformat: varsig, Variable signature (varsig) multiformat, status = draft, code = 0x34 */
    public static final Multicodec VARSIG = Multicodec.of("varsig", Tag.Multiformat, 0x34);

    protected static final Map<Long, Multicodec> ALL = new TreeMap<>();

    static {
      ALL.put(CAIP_50.code(), CAIP_50);
      ALL.put(MULTIADDR.code(), MULTIADDR);
      ALL.put(MULTIBASE.code(), MULTIBASE);
      ALL.put(MULTICODEC.code(), MULTICODEC);
      ALL.put(MULTIDID.code(), MULTIDID);
      ALL.put(MULTIHASH.code(), MULTIHASH);
      ALL.put(MULTIKEY.code(), MULTIKEY);
      ALL.put(MULTISIG.code(), MULTISIG);
      ALL.put(VARSIG.code(), VARSIG);
    }

    protected MultiformatCodec() { /* protected */ }
}
