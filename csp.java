/*
 * Decompiled with CFR 0.152.
 */
public final class csp
extends hwv
implements hyg {
    public static final csp a;
    private static volatile hym e;
    public int b;
    public int c;
    public int d;

    static {
        csp csp2;
        a = csp2 = new csp();
        hwv.z(csp.class, csp2);
    }

    private csp() {
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
            object = bqk.k;
            hwz hwz2 = bqk.j;
            return new hyq(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001", new Object[]{"b", "c", object, "d", hwz2});
        }
        if (n2 == 3) {
            return new csp();
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
            synchronized (csp.class) {
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

