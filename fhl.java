/*
 * Decompiled with CFR 0.152.
 */
public final class fhl
extends hwv
implements hyg {
    public static final fhl a;
    private static volatile hym g;
    public boolean b;
    public int c;
    public int d = 2;
    public int e = 2;
    public int f;
    private int h;

    static {
        fhl fhl2;
        a = fhl2 = new fhl();
        hwv.z(fhl.class, fhl2);
    }

    private fhl() {
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
            hwz hwz2 = eck.u;
            object = fhn.b;
            return new hyq(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u180c\u0001\u0003\u1004\u0002\u0004\u1004\u0003\u0005\u180c\u0004", new Object[]{"h", "b", "c", hwz2, "d", "e", "f", object});
        }
        if (n2 == 3) {
            return new fhl();
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
            synchronized (fhl.class) {
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

