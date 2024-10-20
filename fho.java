/*
 * Decompiled with CFR 0.152.
 */
public final class fho
extends hwv
implements hyg {
    public static final fho a;
    private static volatile hym e;
    public boolean b;
    public int c;
    public boolean d;
    private int f;

    static {
        fho fho2;
        a = fho2 = new fho();
        hwv.z(fho.class, fho2);
    }

    private fho() {
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
            object = fhn.a;
            return new hyq(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u180c\u0001\u0003\u1007\u0002", new Object[]{"f", "b", "c", object, "d"});
        }
        if (n2 == 3) {
            return new fho();
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
            synchronized (fho.class) {
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

