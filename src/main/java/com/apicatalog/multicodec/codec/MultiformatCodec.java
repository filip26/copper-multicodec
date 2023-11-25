package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec;
import com.apicatalog.multicodec.Multicodec.Tag;

/** Multicodec Registry - generated: Sat Nov 25 23:18:18 CET 2023 */
public class MultiformatCodec {

    /** caip-50: CAIP-50 multi-chain account id, status = draft, code = 0xca */
    public static Multicodec CAIP_50 = new Multicodec("caip-50", Tag.Multiformat, 202, new byte[] {(byte)0xca, (byte)0x01});

    /** multiaddr: null, status = draft, code = 0x32 */
    public static Multicodec MULTIADDR = new Multicodec("multiaddr", Tag.Multiformat, 50, new byte[] {(byte)0x32});

    /** multibase: null, status = draft, code = 0x33 */
    public static Multicodec MULTIBASE = new Multicodec("multibase", Tag.Multiformat, 51, new byte[] {(byte)0x33});

    /** multicodec: null, status = draft, code = 0x30 */
    public static Multicodec MULTICODEC = new Multicodec("multicodec", Tag.Multiformat, 48, new byte[] {(byte)0x30});

    /** multidid: Compact encoding for Decentralized Identifers, status = draft, code = 0xd1d */
    public static Multicodec MULTIDID = new Multicodec("multidid", Tag.Multiformat, 3357, new byte[] {(byte)0x9d, (byte)0x1a});

    /** multihash: null, status = draft, code = 0x31 */
    public static Multicodec MULTIHASH = new Multicodec("multihash", Tag.Multiformat, 49, new byte[] {(byte)0x31});

    /** varsig: Variable signature (varsig) multiformat, status = draft, code = 0x34 */
    public static Multicodec VARSIG = new Multicodec("varsig", Tag.Multiformat, 52, new byte[] {(byte)0x34});

    public static Map<Long, Multicodec> ALL = new TreeMap<>();

    static {
      ALL.put(CAIP_50.code(), CAIP_50);
      ALL.put(MULTIADDR.code(), MULTIADDR);
      ALL.put(MULTIBASE.code(), MULTIBASE);
      ALL.put(MULTICODEC.code(), MULTICODEC);
      ALL.put(MULTIDID.code(), MULTIDID);
      ALL.put(MULTIHASH.code(), MULTIHASH);
      ALL.put(VARSIG.code(), VARSIG);
    }
}
