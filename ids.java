/*
 * Decompiled with CFR 0.152.
 */
public final class ids
extends hwv
implements hyg {
    public static final ids a;
    private static volatile hym f;
    public int b;
    public int c = 1;
    public int d;
    public int e;

    static {
        ids ids2;
        a = ids2 = new ids();
        hwv.z(ids.class, ids2);
    }

    private ids() {
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
            object = hqj.o;
            return new hyq(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002\u180c\u0000\u0003\u1004\u0001\u0004\u1004\u0002", new Object[]{"b", "c", object, "d", "e"});
        }
        if (n2 == 3) {
            return new ids();
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
            synchronized (ids.class) {
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

