/*
 * Decompiled with CFR 0.152.
 */
public final class idf
extends hwv
implements hyg {
    public static final idf a;
    public static final gpm d;
    private static volatile hym e;
    public int b;
    public int c;

    static {
        idf idf2;
        a = idf2 = new idf();
        hwv.z(idf.class, idf2);
        d = hwv.F(ida.a, idf2, idf2, 29735924, hzm.k);
    }

    private idf() {
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
            return new hyq(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[]{"b", "c"});
        }
        if (n2 == 3) {
            return new idf();
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
            synchronized (idf.class) {
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

