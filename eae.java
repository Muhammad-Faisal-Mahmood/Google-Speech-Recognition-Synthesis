/*
 * Decompiled with CFR 0.152.
 */
public final class eae
extends hwv
implements hyg {
    public static final eae a;
    private static volatile hym n;
    public int b;
    public int c = 6;
    public int d = 16000;
    public int e = 1;
    public int f = 2;
    public int g;
    public eac h;
    public long i;
    public ead j;
    public boolean k;
    public boolean l;
    public boolean m;

    static {
        eae eae2;
        a = eae2 = new eae();
        hwv.z(eae.class, eae2);
    }

    private eae() {
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
            return new hyq(a, "\u0001\u000b\u0000\u0001\u0001i\u000b\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u100b\u0001\u0003\u100b\u0002\u0004\u100b\u0003\u0006\u100b\u0004\u0007\u1003\u0007\b\u1009\u0005\f\u1009\b\r\u1007\t\u000e\u1007\ni\u1007\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "i", "h", "j", "k", "l", "m"});
        }
        if (n2 == 3) {
            return new eae();
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
        hym hym2 = n;
        object = hym2;
        if (hym2 == null) {
            synchronized (eae.class) {
                hym2 = n;
                object = hym2;
                if (hym2 == null) {
                    n = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

