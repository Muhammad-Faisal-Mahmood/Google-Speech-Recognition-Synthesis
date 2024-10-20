/*
 * Decompiled with CFR 0.152.
 */
public final class iiq
extends hws
implements hwt {
    public static final iiq a;
    private static volatile hym g;
    public int b;
    public boolean c;
    public int d = 1024;
    public iir e;
    public iip f;
    private byte h = (byte)2;

    static {
        iiq iiq2;
        a = iiq2 = new iiq();
        hwv.z(iiq.class, iiq2);
    }

    private iiq() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.h;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0004\u0004\u0000\u0001\u0002\u0011\u0004\u0000\u0000\u0000\u0002\u1007\u0001\u0003\u1004\u0002\u000e\u1009\n\u0011\u1009\u0010", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (n2 == 3) {
            return new iiq();
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
            this.h = by2;
            return null;
        }
        hym hym2 = g;
        object = hym2;
        if (hym2 == null) {
            synchronized (iiq.class) {
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

