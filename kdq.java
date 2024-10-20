/*
 * Decompiled with CFR 0.152.
 */
public final class kdq
extends hwv
implements hyg {
    public static final kdq a;
    private static volatile hym j;
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    static {
        kdq kdq2;
        a = kdq2 = new kdq();
        hwv.z(kdq.class, kdq2);
    }

    private kdq() {
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
            return new hyq(a, "\u0001\u0007\u0000\u0001\u0011\u0018\u0007\u0000\u0000\u0000\u0011\u1004\u0011\u0012\u1004\u0012\u0014\u1002\u0013\u0015\u1002\u0014\u0016\u1002\u0015\u0017\u1002\u0016\u0018\u1002\u0017", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (n2 == 3) {
            return new kdq();
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
        hym hym2 = j;
        object = hym2;
        if (hym2 == null) {
            synchronized (kdq.class) {
                hym2 = j;
                object = hym2;
                if (hym2 == null) {
                    j = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

