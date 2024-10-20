/*
 * Decompiled with CFR 0.152.
 */
public final class fiu
extends hwv
implements hyg {
    public static final fiu a;
    private static volatile hym e;
    public int b;
    public int c;
    public int d;
    private int f;

    static {
        fiu fiu2;
        a = fiu2 = new fiu();
        hwv.z(fiu.class, fiu2);
    }

    private fiu() {
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
            object = fhn.j;
            return new hyq(a, "\u0004\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0007\u180c\u0002", new Object[]{"f", "b", "c", "d", object});
        }
        if (n2 == 3) {
            return new fiu();
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
            synchronized (fiu.class) {
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

