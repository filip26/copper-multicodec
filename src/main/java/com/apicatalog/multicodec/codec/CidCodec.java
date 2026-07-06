package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.time.Instant;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec.Tag;
import com.apicatalog.multicodec.Multicodec;

/** Multicodec Registry - generated: Mon Jul 06 23:31:03 CEST 2026 */
public class CidCodec {

    public static final Instant UPDATED = Instant.parse("2026-07-06T21:31:03.620855340Z");

    public static final int CIDV1_CODE = 0x1;
    /** Cid: cidv1, CIDv1, status = permanent, code = 0x1, uvarint = [0x01] */
    public static final Multicodec CIDV1 = Multicodec.of("cidv1", Tag.Cid, CIDV1_CODE, Multicodec.Status.Permanent);

    public static final int CIDV2_CODE = 0x2;
    /** Cid: cidv2, CIDv2, status = draft, code = 0x2, uvarint = [0x02] */
    public static final Multicodec CIDV2 = Multicodec.of("cidv2", Tag.Cid, CIDV2_CODE, Multicodec.Status.Draft);

    public static final int CIDV3_CODE = 0x3;
    /** Cid: cidv3, CIDv3, status = draft, code = 0x3, uvarint = [0x03] */
    public static final Multicodec CIDV3 = Multicodec.of("cidv3", Tag.Cid, CIDV3_CODE, Multicodec.Status.Draft);

    protected static final Map<Integer,Multicodec> ALL = new TreeMap<>();

    static {
      ALL.put(CIDV1_CODE, CIDV1);
      ALL.put(CIDV2_CODE, CIDV2);
      ALL.put(CIDV3_CODE, CIDV3);
    }

    protected CidCodec() { /* protected */ }
}
