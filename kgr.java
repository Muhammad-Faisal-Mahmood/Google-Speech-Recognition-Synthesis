/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class kgr {
    public kgm a;
    public bzo b;
    private String c;
    private kgt d;
    private Map e = new LinkedHashMap();

    public kgr() {
        this.c = "GET";
        this.b = new bzo(null, null, null);
    }

    public kgr(kgs kgs2) {
        this.a = kgs2.a;
        this.c = kgs2.b;
        this.d = kgs2.d;
        Map map = kgs2.e.isEmpty() ? new LinkedHashMap() : jjj.L(kgs2.e);
        this.e = map;
        this.b = kgs2.c.e();
    }

    public final kgs a() {
        kgm kgm2 = this.a;
        if (kgm2 != null) {
            String string = this.c;
            kgk kgk2 = this.b.aw();
            kgt kgt2 = this.d;
            Map map = this.e;
            jse.e(map, "<this>");
            if (map.isEmpty()) {
                map = jpb.a;
            } else {
                map = DesugarCollections.unmodifiableMap(new LinkedHashMap(map));
                jse.b(map);
            }
            return new kgs(kgm2, string, kgk2, kgt2, map);
        }
        throw new IllegalStateException("url == null");
    }

    public final void b(String string, String string2) {
        jse.e(string2, "value");
        this.b.ay(string, string2);
    }

    public final void c(String string, kgt kgt2) {
        block5: {
            block8: {
                block7: {
                    block6: {
                        jse.e(string, "method");
                        if (string.length() <= 0) break block5;
                        if (kgt2 != null) break block6;
                        jse.e(string, "method");
                        if (jse.i(string, "POST") || jse.i(string, "PUT") || jse.i(string, "PATCH") || jse.i(string, "PROPPATCH") || jse.i(string, "REPORT")) {
                            throw new IllegalArgumentException(a.aj(string, "method ", " must have a request body."));
                        }
                        break block7;
                    }
                    if (!kmp.I(string)) break block8;
                }
                this.c = string;
                this.d = kgt2;
                return;
            }
            throw new IllegalArgumentException(a.aj(string, "method ", " must not have a request body."));
        }
        throw new IllegalArgumentException("method.isEmpty() == true");
    }

    public final void d(String string) {
        this.b.aA(string);
    }
}

