/*
 * Decompiled with CFR 0.152.
 */
public final class dzq
extends hwv
implements hyg {
    public static final dzq a;
    private static volatile hym f;
    public int b;
    public long c;
    public long d;
    public int e;

    static {
        dzq dzq2;
        a = dzq2 = new dzq();
        hwv.z(dzq.class, dzq2);
    }

    private dzq() {
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
            object = dpn.c;
            return new hyq(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u180c\u0002", new Object[]{"b", "c", "d", "e", object});
        }
        if (n2 == 3) {
            return new dzq();
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
            synchronized (dzq.class) {
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

