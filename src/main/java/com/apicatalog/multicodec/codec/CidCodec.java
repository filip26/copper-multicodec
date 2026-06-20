package com.apicatalog.multicodec.codec;

import java.util.TreeMap;
import java.time.Instant;
import java.util.Map;

import com.apicatalog.multicodec.Multicodec.Tag;
import com.apicatalog.multicodec.Multicodec;

/** Multicodec Registry - generated: Sat Jun 20 18:15:55 CEST 2026 */
public class CidCodec {

    public static final Instant UPDATED = Instant.parse("2026-06-20T16:15:55.291Z");

    public static final long CIDV1_CODE = 0x1;
    /** Cid: cidv1, CIDv1, status = permanent, code = 0x1, uvarint = [0x01] */
    public static final Multicodec CIDV1 = Multicodec.of("cidv1", Tag.Cid, CIDV1_CODE, Multicodec.Status.Permanent);

    public static final long CIDV2_CODE = 0x2;
    /** Cid: cidv2, CIDv2, status = draft, code = 0x2, uvarint = [0x02] */
    public static final Multicodec CIDV2 = Multicodec.of("cidv2", Tag.Cid, CIDV2_CODE, Multicodec.Status.Draft);

    public static final long CIDV3_CODE = 0x3;
    /** Cid: cidv3, CIDv3, status = draft, code = 0x3, uvarint = [0x03] */
    public static final Multicodec CIDV3 = Multicodec.of("cidv3", Tag.Cid, CIDV3_CODE, Multicodec.Status.Draft);

    protected static final Map<Long,Multicodec> ALL = new TreeMap<>();

    static {
      ALL.put(CIDV1_CODE, CIDV1);
      ALL.put(CIDV2_CODE, CIDV2);
      ALL.put(CIDV3_CODE, CIDV3);
    }

    protected CidCodec() { /* protected */ }
}
