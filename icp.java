/*
 * Decompiled with CFR 0.152.
 */
public final class icp
extends hws
implements hwt {
    public static final icp a;
    private static volatile hym d;
    public long b;
    public hxk c;
    private int e;
    private ico f;
    private byte g = (byte)2;

    static {
        icp icp2;
        a = icp2 = new icp();
        hwv.z(icp.class, icp2);
    }

    private icp() {
        this.c = hyp.b;
        hvu hvu2 = hvu.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.g;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0002\u0001\u1002\u0002\u0003\u041b\u0005\u1409\u0004", new Object[]{"e", "b", "c", icg.class, "f"});
        }
        if (n2 == 3) {
            return new icp();
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
            this.g = by2;
            return null;
        }
        hym hym2 = d;
        object = hym2;
        if (hym2 == null) {
            synchronized (icp.class) {
                hym2 = d;
                object = hym2;
                if (hym2 == null) {
                    d = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

