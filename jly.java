/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

final class jly {
    public static final klp a = kmp.v(":");
    public static final jlv[] b;
    public static final Map c;

    static {
        jlv[] jlvArray = new jlv(jlv.e, "");
        int n2 = 0;
        b = new jlv[]{jlvArray, new jlv(jlv.b, "GET"), new jlv(jlv.b, "POST"), new jlv(jlv.c, "/"), new jlv(jlv.c, "/index.html"), new jlv(jlv.d, "http"), new jlv(jlv.d, "https"), new jlv(jlv.a, "200"), new jlv(jlv.a, "204"), new jlv(jlv.a, "206"), new jlv(jlv.a, "304"), new jlv(jlv.a, "400"), new jlv(jlv.a, "404"), new jlv(jlv.a, "500"), new jlv("accept-charset", ""), new jlv("accept-encoding", "gzip, deflate"), new jlv("accept-language", ""), new jlv("accept-ranges", ""), new jlv("accept", ""), new jlv("access-control-allow-origin", ""), new jlv("age", ""), new jlv("allow", ""), new jlv("authorization", ""), new jlv("cache-control", ""), new jlv("content-disposition", ""), new jlv("content-encoding", ""), new jlv("content-language", ""), new jlv("content-length", ""), new jlv("content-location", ""), new jlv("content-range", ""), new jlv("content-type", ""), new jlv("cookie", ""), new jlv("date", ""), new jlv("etag", ""), new jlv("expect", ""), new jlv("expires", ""), new jlv("from", ""), new jlv("host", ""), new jlv("if-match", ""), new jlv("if-modified-since", ""), new jlv("if-none-match", ""), new jlv("if-range", ""), new jlv("if-unmodified-since", ""), new jlv("last-modified", ""), new jlv("link", ""), new jlv("location", ""), new jlv("max-forwards", ""), new jlv("proxy-authenticate", ""), new jlv("proxy-authorization", ""), new jlv("range", ""), new jlv("referer", ""), new jlv("refresh", ""), new jlv("retry-after", ""), new jlv("server", ""), new jlv("set-cookie", ""), new jlv("strict-transport-security", ""), new jlv("transfer-encoding", ""), new jlv("user-agent", ""), new jlv("vary", ""), new jlv("via", ""), new jlv("www-authenticate", "")};
        LinkedHashMap<klp, Integer> linkedHashMap = new LinkedHashMap<klp, Integer>(61);
        while (true) {
            jlvArray = b;
            int n3 = jlvArray.length;
            if (n2 >= 61) break;
            if (!linkedHashMap.containsKey(jlvArray[n2].f)) {
                linkedHashMap.put(jlvArray[n2].f, n2);
            }
            ++n2;
        }
        c = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    public static void a(klp klp2) {
        int n2 = klp2.b();
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by2 = klp2.a(i2);
            if (by2 < 65 || by2 > 90) continue;
            throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(klp2.e()));
        }
    }
}

