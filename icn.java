/*
 * Decompiled with CFR 0.152.
 */
public final class icn
extends hws
implements hwt {
    public static final icn a;
    private static volatile hym f;
    public int b;
    public int c;
    public icp d;
    public icj e;
    private icp g;
    private icp h;
    private icm i;
    private byte j = (byte)2;

    static {
        icn icn2;
        a = icn2 = new icn();
        hwv.z(icn.class, icn2);
    }

    private icn() {
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
            return this.j;
        }
        byte by2 = 1;
        if (n2 == 2) {
            object = hqj.i;
            return new hyq(a, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0004\u0001\u180c\u0000\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0007\u1409\u0005\n\u1009\n", new Object[]{"b", "c", object, "d", "e", "g", "h", "i"});
        }
        if (n2 == 3) {
            return new icn();
        }
        if (n2 == 4) {
            return new hwr(a);
        }
        if (n2 == 5) {
            return a;
        }
        if (n2 != 6) {
            if (object == null) {
                by2 = 0;
            }
            this.j = by2;
            return null;
        }
        hym hym2 = f;
        object = hym2;
        if (hym2 == null) {
            synchronized (icn.class) {
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

