/*
 * Decompiled with CFR 0.152.
 */
public final class iae
extends hwv
implements hyg {
    public static final iae a;
    private static volatile hym e;
    public String b = "";
    public int c;
    public String d = "";

    static {
        iae iae2;
        a = iae2 = new iae();
        hwv.z(iae.class, iae2);
    }

    private iae() {
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
            return new hyq(a, "\u0004\u0003\u0000\u0000\u0001\u0006\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0004\u0006\u0208", new Object[]{"b", "c", "d"});
        }
        if (n2 == 3) {
            return new iae();
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
            synchronized (iae.class) {
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

