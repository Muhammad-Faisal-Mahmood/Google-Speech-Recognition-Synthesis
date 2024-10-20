/*
 * Decompiled with CFR 0.152.
 */
public final class dzy
extends hwv
implements hyg {
    public static final dzy a;
    private static volatile hym e;
    public int b;
    public int c;
    public int d;

    static {
        dzy dzy2;
        a = dzy2 = new dzy();
        hwv.z(dzy.class, dzy2);
    }

    private dzy() {
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
            hwz hwz2 = dpn.g;
            object = dpn.f;
            return new hyq(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001", new Object[]{"b", "c", hwz2, "d", object});
        }
        if (n2 == 3) {
            return new dzy();
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
            synchronized (dzy.class) {
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

