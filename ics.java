/*
 * Decompiled with CFR 0.152.
 */
public final class ics
extends hwv
implements hyg {
    public static final ics a;
    private static volatile hym g;
    public int b;
    public int c = 2;
    public int d = 2;
    public int e;
    public int f = 1;

    static {
        ics ics2;
        a = ics2 = new ics();
        hwv.z(ics.class, ics2);
    }

    private ics() {
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
            hwz hwz2 = hqj.l;
            object = hqj.k;
            return new hyq(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0003\u1004\u0001\u0004\u180c\u0003\u0005\u180c\u0004", new Object[]{"b", "c", "d", "e", hwz2, "f", object});
        }
        if (n2 == 3) {
            return new ics();
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
        hym hym2 = g;
        object = hym2;
        if (hym2 == null) {
            synchronized (ics.class) {
                hym2 = g;
                object = hym2;
                if (hym2 == null) {
                    g = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

