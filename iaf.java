/*
 * Decompiled with CFR 0.152.
 */
public final class iaf
extends hwv
implements hyg {
    public static final iaf a;
    private static volatile hym h;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public String f = "";
    public String g = "";

    static {
        iaf iaf2;
        a = iaf2 = new iaf();
        hwv.z(iaf.class, iaf2);
    }

    private iaf() {
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
            return new hyq(a, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002\u0208\u0003\u0004\u0004\f\u0005\u0208\u0006\u0208", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (n2 == 3) {
            return new iaf();
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
        hym hym2 = h;
        object = hym2;
        if (hym2 == null) {
            synchronized (iaf.class) {
                hym2 = h;
                object = hym2;
                if (hym2 == null) {
                    h = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

