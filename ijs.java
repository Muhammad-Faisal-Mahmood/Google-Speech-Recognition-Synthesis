/*
 * Decompiled with CFR 0.152.
 */
public final class ijs
extends hwv
implements hyg {
    public static final ijs a;
    private static volatile hym d;
    public int b;
    public ijr c;

    static {
        ijs ijs2;
        a = ijs2 = new ijs();
        hwv.z(ijs.class, ijs2);
    }

    private ijs() {
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
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u1009\u0001", new Object[]{"b", "c"});
        }
        if (n2 == 3) {
            return new ijs();
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
            synchronized (ijs.class) {
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

