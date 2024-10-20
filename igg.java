/*
 * Decompiled with CFR 0.152.
 */
public final class igg
extends hwv
implements hyg {
    public static final igg a;
    private static volatile hym d;
    public int b;
    public int c;
    private int e;

    static {
        igg igg2;
        a = igg2 = new igg();
        hwv.z(igg.class, igg2);
    }

    private igg() {
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
            object = ieo.k;
            return new hyq(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u180c\u0001", new Object[]{"e", "b", "c", object});
        }
        if (n2 == 3) {
            return new igg();
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
            synchronized (igg.class) {
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

