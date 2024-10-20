/*
 * Decompiled with CFR 0.152.
 */
public final class fze
extends hws
implements hwt {
    public static final fze a;
    private static volatile hym j;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public boolean g;
    public String h = "";
    public String i = "";
    private byte k = (byte)2;

    static {
        fze fze2;
        a = fze2 = new fze();
        hwv.z(fze.class, fze2);
    }

    private fze() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.k;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0004\u0004\u1008\u0005\u0005\u1007\u0006\u0006\u1008\u0007\u0007\u1008\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (n2 == 3) {
            return new fze();
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
            this.k = by2;
            return null;
        }
        hym hym2 = j;
        object = hym2;
        if (hym2 == null) {
            synchronized (fze.class) {
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

