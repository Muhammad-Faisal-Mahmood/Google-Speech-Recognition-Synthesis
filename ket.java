/*
 * Decompiled with CFR 0.152.
 */
public final class ket
extends hwv
implements hyg {
    public static final ket a;
    private static volatile hym e;
    public int b;
    public long c;
    public int d;

    static {
        ket ket2;
        a = ket2 = new ket();
        hwv.z(ket.class, ket2);
    }

    private ket() {
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
            object = kei.d;
            return new hyq(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1002\u0001\u0003\u180c\u0002", new Object[]{"b", "c", "d", object});
        }
        if (n2 == 3) {
            return new ket();
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
            synchronized (ket.class) {
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

