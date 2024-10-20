/*
 * Decompiled with CFR 0.152.
 */
public final class icv
extends hwv
implements hyg {
    public static final icv a;
    public static final gpm d;
    private static volatile hym e;
    public int b;
    public boolean c;

    static {
        icv icv2;
        a = icv2 = new icv();
        hwv.z(icv.class, icv2);
        d = hwv.F(ida.a, icv2, icv2, 77499489, hzm.k);
    }

    private icv() {
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
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[]{"b", "c"});
        }
        if (n2 == 3) {
            return new icv();
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
            synchronized (icv.class) {
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

