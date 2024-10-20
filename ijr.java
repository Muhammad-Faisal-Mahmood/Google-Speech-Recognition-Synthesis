/*
 * Decompiled with CFR 0.152.
 */
public final class ijr
extends hwv
implements hyg {
    public static final ijr a;
    private static volatile hym d;
    public int b;
    public float c;

    static {
        ijr ijr2;
        a = ijr2 = new ijr();
        hwv.z(ijr.class, ijr2);
    }

    private ijr() {
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
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1001\u0001", new Object[]{"b", "c"});
        }
        if (n2 == 3) {
            return new ijr();
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
        hym hym2 = d;
        object = hym2;
        if (hym2 == null) {
            synchronized (ijr.class) {
                hym2 = d;
                object = hym2;
                if (hym2 == null) {
                    d = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

