/*
 * Decompiled with CFR 0.152.
 */
public final class ffa
extends hwv
implements hyg {
    public static final ffa a;
    private static volatile hym c;
    public hya b = hya.a;

    static {
        ffa ffa2;
        a = ffa2 = new ffa();
        hwv.z(ffa.class, ffa2);
    }

    private ffa() {
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
            object = fez.a;
            return new hyq(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", object});
        }
        if (n2 == 3) {
            return new ffa();
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
        hym hym2 = c;
        object = hym2;
        if (hym2 == null) {
            synchronized (ffa.class) {
                hym2 = c;
                object = hym2;
                if (hym2 == null) {
                    c = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

