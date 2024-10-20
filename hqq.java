/*
 * Decompiled with CFR 0.152.
 */
public final class hqq
extends hwv
implements hyg {
    public static final hqq a;
    public static final gpm e;
    private static volatile hym f;
    public int b;
    public long c;
    public hxk d = hyp.b;

    static {
        hqq hqq2;
        a = hqq2 = new hqq();
        hwv.z(hqq.class, hqq2);
        e = hwv.F(iax.a, hqq2, hqq2, 182135729, hzm.k);
    }

    private hqq() {
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
            return new hyq(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1002\u0000\u0002\u001a", new Object[]{"b", "c", "d"});
        }
        if (n2 == 3) {
            return new hqq();
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
            synchronized (hqq.class) {
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

