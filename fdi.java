/*
 * Decompiled with CFR 0.152.
 */
public final class fdi
extends hwv
implements hyg {
    public static final fdi a;
    private static volatile hym d;
    public int b;
    public int c;

    static {
        fdi fdi2;
        a = fdi2 = new fdi();
        hwv.z(fdi.class, fdi2);
    }

    private fdi() {
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
            object = eck.p;
            return new hyq(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u180c\u0000", new Object[]{"b", "c", object});
        }
        if (n2 == 3) {
            return new fdi();
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
            synchronized (fdi.class) {
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

