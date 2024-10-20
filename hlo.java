/*
 * Decompiled with CFR 0.152.
 */
public final class hlo
extends hwv
implements hyg {
    public static final hlo a;
    private static volatile hym g;
    public int b;
    public int c = 0;
    public Object d;
    public hll e;
    public hxk f;
    private byte h = (byte)2;

    static {
        hlo hlo2;
        a = hlo2 = new hlo();
        hwv.z(hlo.class, hlo2);
    }

    private hlo() {
        this.f = hyp.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.h;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001\u1509\u0000\u0002\u041b\u0004\u043c\u0000", new Object[]{"d", "c", "b", "e", "f", hll.class, hlm.class});
        }
        if (n2 == 3) {
            return new hlo();
        }
        if (n2 == 4) {
            return new hwp(a);
        }
        if (n2 == 5) {
            return a;
        }
        if (n2 != 6) {
            if (object == null) {
                by2 = 0;
            }
            this.h = by2;
            return null;
        }
        hym hym2 = g;
        object = hym2;
        if (hym2 == null) {
            synchronized (hlo.class) {
                hym2 = g;
                object = hym2;
                if (hym2 == null) {
                    g = object = new hwq(a);
                }
            }
        }
        return object;
    }

    public final void b() {
        hxk hxk2 = this.f;
        if (!hxk2.c()) {
            this.f = hwv.s(hxk2);
        }
    }
}

