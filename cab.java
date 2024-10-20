/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public final class cab {
    public static final hav a;
    public static final hav b;
    public static final hac c;
    public static final hac d;
    private static final Function e;

    static {
        e = new caa();
        a = hav.q(bty.e, bty.f, bty.d);
        b = hav.q(bty.b, bty.c, bty.d);
        gzy gzy2 = new gzy();
        gzy2.d(bua.c, "-lstm");
        gzy2.d(bua.d, "-seanet");
        gzy2.d(bua.e, "-lemonbalm");
        gzy2.d(bua.f, "-locomel");
        gzy2.d(bua.b, "-server");
        c = gzy2.b();
        gzy2 = new gzy();
        gzy2.d(btz.b, "");
        gzy2.d(btz.c, "-darwinnjaneiro");
        gzy2.d(btz.d, "-darwinnrio");
        d = gzy2.b();
    }

    public static final iik a(bso bso2) {
        return (iik)ag$$ExternalSyntheticApiModelOutline1.m(e, (Object)bso2);
    }

    public static String b(bua bua2, btz btz2) {
        String string = (String)d.get(btz2);
        String string2 = (String)c.get(bua2);
        if (string != null) {
            if (string2 != null) {
                return string.concat(string2);
            }
            throw new IllegalArgumentException("No suffix defined for type: ".concat(String.valueOf(bua2.name())));
        }
        throw new IllegalArgumentException("No suffix defined for platform: ".concat(String.valueOf(btz2.name())));
    }

    public static String c(bua object, btz btz2) {
        if (object == bua.c) {
            object = (String)d.get(btz2);
            if (object != null) {
                return object;
            }
            throw new IllegalArgumentException("No suffix defined for platform: ".concat(String.valueOf(btz2.name())));
        }
        return cab.b((bua)object, btz2);
    }

    public static boolean d(buc object) {
        object = ((buc)object).g.iterator();
        while (object.hasNext()) {
            if (!new hxd(((bub)object.next()).j, bub.a).contains(btx.c)) continue;
            return true;
        }
        return false;
    }

    public static boolean e(bub object) {
        int n2 = ((bub)object).g;
        bty bty2 = bty.b(n2);
        object = bty2;
        if (bty2 == null) {
            object = bty.a;
        }
        if (object != bty.e) {
            bty2 = bty.b(n2);
            object = bty2;
            if (bty2 == null) {
                object = bty.a;
            }
            if (object != bty.f) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(bub object) {
        int n2 = ((bub)object).g;
        bty bty2 = bty.b(n2);
        object = bty2;
        if (bty2 == null) {
            object = bty.a;
        }
        if (object != bty.e) {
            bty2 = bty.b(n2);
            object = bty2;
            if (bty2 == null) {
                object = bty.a;
            }
            if (object != bty.f) {
                return true;
            }
        }
        return false;
    }
}

