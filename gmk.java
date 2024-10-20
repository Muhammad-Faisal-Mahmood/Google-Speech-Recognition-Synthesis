/*
 * Decompiled with CFR 0.152.
 */
public final class gmk
extends hwv
implements hyg {
    public static final gmk a;
    private static volatile hym g;
    public int b;
    public long c = -1L;
    public hxk d = hyp.b;
    public long e;
    public hxb f = hww.a;

    static {
        gmk gmk2;
        a = gmk2 = new gmk();
        hwv.z(gmk.class, gmk2);
    }

    private gmk() {
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
            return new hyq(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u1002\u0000\u0002\u001b\u0003\u1002\u0001\u0004\u0016", new Object[]{"b", "c", "d", gmj.class, "e", "f"});
        }
        if (n2 == 3) {
            return new gmk();
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
        hym hym2 = g;
        object = hym2;
        if (hym2 == null) {
            synchronized (gmk.class) {
                hym2 = g;
                object = hym2;
                if (hym2 == null) {
                    g = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

