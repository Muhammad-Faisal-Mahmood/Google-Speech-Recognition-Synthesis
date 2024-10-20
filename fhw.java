/*
 * Decompiled with CFR 0.152.
 */
public final class fhw
extends hwv
implements hyg {
    public static final fhw a;
    private static volatile hym f;
    public int b;
    public String c = "";
    public int d;
    public hxb e = hww.a;

    static {
        fhw fhw2;
        a = fhw2 = new fhw();
        hwv.z(fhw.class, fhw2);
    }

    private fhw() {
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
            object = hqj.f;
            return new hyq(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1004\u0001\u0003\u082c", new Object[]{"b", "c", "d", "e", object});
        }
        if (n2 == 3) {
            return new fhw();
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
        hym hym2 = f;
        object = hym2;
        if (hym2 == null) {
            synchronized (fhw.class) {
                hym2 = f;
                object = hym2;
                if (hym2 == null) {
                    f = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

