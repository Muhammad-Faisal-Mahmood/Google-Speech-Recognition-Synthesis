/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public final class kiu {
    public static final kir[] a;
    public static final Map b;

    static {
        Map<klp, Integer> map = new kir(kir.f, "");
        a = new kir[]{map, new kir(kir.c, "GET"), new kir(kir.c, "POST"), new kir(kir.d, "/"), new kir(kir.d, "/index.html"), new kir(kir.e, "http"), new kir(kir.e, "https"), new kir(kir.b, "200"), new kir(kir.b, "204"), new kir(kir.b, "206"), new kir(kir.b, "304"), new kir(kir.b, "400"), new kir(kir.b, "404"), new kir(kir.b, "500"), new kir("accept-charset", ""), new kir("accept-encoding", "gzip, deflate"), new kir("accept-language", ""), new kir("accept-ranges", ""), new kir("accept", ""), new kir("access-control-allow-origin", ""), new kir("age", ""), new kir("allow", ""), new kir("authorization", ""), new kir("cache-control", ""), new kir("content-disposition", ""), new kir("content-encoding", ""), new kir("content-language", ""), new kir("content-length", ""), new kir("content-location", ""), new kir("content-range", ""), new kir("content-type", ""), new kir("cookie", ""), new kir("date", ""), new kir("etag", ""), new kir("expect", ""), new kir("expires", ""), new kir("from", ""), new kir("host", ""), new kir("if-match", ""), new kir("if-modified-since", ""), new kir("if-none-match", ""), new kir("if-range", ""), new kir("if-unmodified-since", ""), new kir("last-modified", ""), new kir("link", ""), new kir("location", ""), new kir("max-forwards", ""), new kir("proxy-authenticate", ""), new kir("proxy-authorization", ""), new kir("range", ""), new kir("referer", ""), new kir("refresh", ""), new kir("retry-after", ""), new kir("server", ""), new kir("set-cookie", ""), new kir("strict-transport-security", ""), new kir("transfer-encoding", ""), new kir("user-agent", ""), new kir("vary", ""), new kir("via", ""), new kir("www-authenticate", "")};
        map = new LinkedHashMap(61);
        for (int i2 = 0; i2 < 61; ++i2) {
            kir[] kirArray = a;
            if (((HashMap)map).containsKey(kirArray[i2].g)) continue;
            map.put(kirArray[i2].g, i2);
        }
        map = DesugarCollections.unmodifiableMap(map);
        jse.d(map, "unmodifiableMap(...)");
        b = map;
    }

    public static final void a(klp klp2) {
        jse.e(klp2, "name");
        int n2 = klp2.b();
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by2 = klp2.a(i2);
            if (by2 < 65 || by2 >= 91) continue;
            throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(klp2.e()));
        }
    }
}

