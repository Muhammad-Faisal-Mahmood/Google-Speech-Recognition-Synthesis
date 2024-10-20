/*
 * Decompiled with CFR 0.152.
 */
public final class ibi
extends hwv
implements hyg {
    public static final ibi a;
    private static volatile hym d;
    public int b;
    public String c = "";

    static {
        ibi ibi2;
        a = ibi2 = new ibi();
        hwv.z(ibi.class, ibi2);
    }

    private ibi() {
        Object[] objectArray = hyp.a;
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
            return new hyq(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0208", new Object[]{"b", "c"});
        }
        if (n2 == 3) {
            return new ibi();
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
            synchronized (ibi.class) {
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

