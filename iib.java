/*
 * Decompiled with CFR 0.152.
 */
public final class iib
extends hwv
implements hyg {
    public static final iib a;
    public static final gpm q;
    private static volatile hym r;
    public int b;
    public int c;
    public int d;
    public ibm e;
    public int f = 1;
    public boolean g;
    public boolean h;
    public int i = 2;
    public String j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public ics o;
    public boolean p;
    private byte s = (byte)2;

    static {
        iib iib2;
        a = iib2 = new iib();
        hwv.z(iib.class, iib2);
        q = hwv.F(ida.a, iib2, iib2, 294500, hzm.k);
    }

    private iib() {
        Object[] objectArray = hyp.a;
        this.j = "";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.s;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\f\u0000\u0003\u0001@\f\u0000\u0000\u0001\u0001\u1409\u0000\u0003\u1004\u0001\u0005\u1007\u0004\u0007\u1004\f\u000e\u1007\u0017\u0014\u1007\u001e\u0017\u1007\u0006(\u1007-*\u10071+\u10092>\u1007@@\u1008\u0013", new Object[]{"b", "c", "d", "e", "f", "g", "i", "k", "l", "h", "m", "n", "o", "p", "j"});
        }
        if (n2 == 3) {
            return new iib();
        }
        if (n2 == 4) {
            return new hwp(a);
        }
        if (n2 == 5) {
            return a;
        }
        if (n2 != 6) {
            if (object == null) {
                by2 = 0;
            }
            this.s = by2;
            return null;
        }
        hym hym2 = r;
        object = hym2;
        if (hym2 == null) {
            synchronized (iib.class) {
                hym2 = r;
                object = hym2;
                if (hym2 == null) {
                    r = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

