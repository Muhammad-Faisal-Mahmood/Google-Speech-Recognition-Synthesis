/*
 * Decompiled with CFR 0.152.
 */
public final class fhe
extends hwv
implements hyg {
    public static final fhe a;
    private static volatile hym c;
    public int b;
    private int d;

    static {
        fhe fhe2;
        a = fhe2 = new fhe();
        hwv.z(fhe.class, fhe2);
    }

    private fhe() {
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
            object = eck.s;
            return new hyq(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u180c\u0000", new Object[]{"d", "b", object});
        }
        if (n2 == 3) {
            return new fhe();
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
            synchronized (fhe.class) {
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

