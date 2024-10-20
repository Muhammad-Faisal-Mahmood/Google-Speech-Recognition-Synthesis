/*
 * Decompiled with CFR 0.152.
 */
public final class hls
extends hwv
implements hyg {
    public static final hls a;
    private static volatile hym v;
    public int b;
    public int c;
    public int d;
    public hlq e;
    public long f;
    public hmg g;
    public hlx h;
    public hlr i;
    public hme j;
    public hlw k;
    public hmb l;
    public hlp m;
    public hlz n;
    public hlv o;
    public hmc p;
    public hlt q;
    public hlu r;
    public hly s;
    public hmf t;
    public hmd u;

    static {
        hls hls2;
        a = hls2 = new hls();
        hwv.z(hls.class, hls2);
    }

    private hls() {
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
            return new hyq(a, "\u0001\u0011\u0000\u0003\nM\u0011\u0000\u0000\u0000\n\u1009\b\u0015\u1002\u0013 \u1009\u001f(\u1009'.\u1009-0\u1009/1\u100903\u100936\u10096?\u1009?@\u1009@B\u1009BC\u1009CG\u1009HH\u1009\u0014K\u1009IM\u1009K", new Object[]{"b", "c", "d", "e", "f", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "g", "t", "u"});
        }
        if (n2 == 3) {
            return new hls();
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
        hym hym2 = v;
        object = hym2;
        if (hym2 == null) {
            synchronized (hls.class) {
                hym2 = v;
                object = hym2;
                if (hym2 == null) {
                    v = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

