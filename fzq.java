/*
 * Decompiled with CFR 0.152.
 */
public final class fzq
extends hwv
implements hyg {
    public static final fzq a;
    private static volatile hym f;
    public int b;
    public long c;
    public long d;
    public long e;

    static {
        fzq fzq2;
        a = fzq2 = new fzq();
        hwv.z(fzq.class, fzq2);
    }

    private fzq() {
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
            return new hyq(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0002\u0003\u1002\u0001", new Object[]{"b", "c", "e", "d"});
        }
        if (n2 == 3) {
            return new fzq();
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
        hym hym2 = f;
        object = hym2;
        if (hym2 == null) {
            synchronized (fzq.class) {
                hym2 = f;
                object = hym2;
                if (hym2 == null) {
                    f = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

