/*
 * Decompiled with CFR 0.152.
 */
public final class hqr
extends hwv
implements hyg {
    public static final hqr a;
    public static final gpm b;
    private static volatile hym c;

    static {
        hqr hqr2;
        a = hqr2 = new hqr();
        hwv.z(hqr.class, hqr2);
        b = hwv.F(iax.a, hqr2, hqr2, 203522521, hzm.k);
    }

    private hqr() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return (byte)1;
        }
        if (n2 == 2) {
            return new hyq(a, "\u0004\u0000", null);
        }
        if (n2 == 3) {
            return new hqr();
        }
        if (n2 == 4) {
            return new hwp(a);
        }
        if (n2 == 5) {
            return a;
        }
        if (n2 != 6) {
            return null;
        }
        hym hym2 = c;
        object = hym2;
        if (hym2 == null) {
            synchronized (hqr.class) {
                hym2 = c;
                object = hym2;
                if (hym2 == null) {
                    c = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

