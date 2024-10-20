/*
 * Decompiled with CFR 0.152.
 */
public final class idd
extends hwv
implements hyg {
    public static final idd a;
    public static final gpm e;
    private static volatile hym f;
    public int b;
    public boolean c;
    public long d;

    static {
        idd idd2;
        a = idd2 = new idd();
        hwv.z(idd.class, idd2);
        e = hwv.F(ida.a, idd2, idd2, 307792803, hzm.k);
    }

    private idd() {
        Object[] objectArray = hyp.a;
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
            return new hyq(a, "\u0001\u0002\u0000\u0001\u0001\u000b\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u000b\u1002\t", new Object[]{"b", "c", "d"});
        }
        if (n2 == 3) {
            return new idd();
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
            synchronized (idd.class) {
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

