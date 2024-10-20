/*
 * Decompiled with CFR 0.152.
 */
public final class fhj
extends hwv
implements hyg {
    public static final fhj a;
    public static final gpm d;
    private static volatile hym e;
    public boolean b;
    public long c;
    private int f;

    static {
        fhj fhj2;
        a = fhj2 = new fhj();
        hwv.z(fhj.class, fhj2);
        d = hwv.F(fhm.a, fhj2, fhj2, 101, hzm.k);
    }

    private fhj() {
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
            return new hyq(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0003\u1002\u0002", new Object[]{"f", "b", "c"});
        }
        if (n2 == 3) {
            return new fhj();
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
            synchronized (fhj.class) {
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

