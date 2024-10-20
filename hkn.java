/*
 * Decompiled with CFR 0.152.
 */
public final class hkn
extends hwv
implements hyg {
    public static final hkn a;
    public static final gpm d;
    private static volatile hym e;
    public int b;
    public int c;

    static {
        hkn hkn2;
        a = hkn2 = new hkn();
        hwv.z(hkn.class, hkn2);
        d = hwv.F(bos.a, hkn2, hkn2, 403710410, hzm.k);
    }

    private hkn() {
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
            object = eck.n;
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u180c\u0000", new Object[]{"b", "c", object});
        }
        if (n2 == 3) {
            return new hkn();
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
        hym hym2 = e;
        object = hym2;
        if (hym2 == null) {
            synchronized (hkn.class) {
                hym2 = e;
                object = hym2;
                if (hym2 == null) {
                    e = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

