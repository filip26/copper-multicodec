package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec;
import com.apicatalog.multicodec.Multicodec.Tag;

/** Multicodec Registry - generated: Wed Oct 02 01:34:48 CEST 2024 */
public class CidCodec {

    /** Cid: cidv1, CIDv1, status = permanent, code = 0x1 */
    public static final Multicodec CIDV1 = Multicodec.of("cidv1",  Tag.Cid, 0x1);

    /** Cid: cidv2, CIDv2, status = draft, code = 0x2 */
    public static final Multicodec CIDV2 = Multicodec.of("cidv2",  Tag.Cid, 0x2);

    /** Cid: cidv3, CIDv3, status = draft, code = 0x3 */
    public static final Multicodec CIDV3 = Multicodec.of("cidv3",  Tag.Cid, 0x3);

    protected static final Map<Long,Multicodec> ALL = new TreeMap<>();

    static {
      ALL.put(CIDV1.code(), CIDV1);
      ALL.put(CIDV2.code(), CIDV2);
      ALL.put(CIDV3.code(), CIDV3);
    }

    protected CidCodec() { /* protected */ }
}
