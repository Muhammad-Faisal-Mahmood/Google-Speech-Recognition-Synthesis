/*
 * Decompiled with CFR 0.152.
 */
public final class fhm
extends hws
implements hwt {
    public static final fhm a;
    private static volatile hym s;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f = true;
    public fic g;
    public fho h;
    public fhu i;
    public fhg j;
    public fiv k;
    public fhl l;
    public fhf m;
    public boolean n;
    public fhe o;
    public fhh p;
    public fit q;
    private byte t = (byte)2;

    static {
        fhm fhm2;
        a = fhm2 = new fhm();
        hwv.z(fhm.class, fhm2);
    }

    private fhm() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.t;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0004\u000f\u0000\u0001\u0001\u0013\u000f\u0000\u0000\u0001\u0001\u1004\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1007\u0003\u0005\u1009\u0004\u0006\u1009\u0005\u0007\u1009\u0006\b\u1009\u0007\t\u1009\b\u000b\u1009\n\u000e\u1009\u000b\u000f\u1007\u000e\u0011\u1009\u000f\u0012\u1409\u0010\u0013\u1009\u0011", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"});
        }
        if (n2 == 3) {
            return new fhm();
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
            this.t = by2;
            return null;
        }
        hym hym2 = s;
        object = hym2;
        if (hym2 == null) {
            synchronized (fhm.class) {
                hym2 = s;
                object = hym2;
                if (hym2 == null) {
                    s = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

