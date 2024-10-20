/*
 * Decompiled with CFR 0.152.
 */
public final class kfl
extends hwv
implements hyg {
    public static final kfl a;
    private static volatile hym y;
    private byte A = (byte)2;
    public int b;
    public long c;
    public String d = "";
    public String e = "";
    public kdt f;
    public kfm g;
    public kdy h;
    public kez i;
    public kfh j;
    public kde k;
    public kff l;
    public keb m;
    public hxk n;
    public kda o;
    public kdn p;
    public ket q;
    public kfc r;
    public hxk s;
    public kew t;
    public kfk u;
    public kfd v;
    public kdo w;
    public kev x;
    private kex z;

    static {
        kfl kfl2;
        a = kfl2 = new kfl();
        hwv.z(kfl.class, kfl2);
    }

    private kfl() {
        hyp hyp2 = hyp.b;
        this.n = hyp2;
        this.s = hyp2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.A;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0017\u0000\u0001\u0001'\u0017\u0000\u0002\n\u0001\u1409\u0003\u0002\u1005\u0000\u0003\u1008\u0001\u0004\u1009\u0004\u0005\u1009\u0016\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0017\t\u1009\u0007\n\u1409\b\f\u1009\n\u000e\u1409\u0019\u0010\u1409\u000b\u0011\u1008\u0002\u0015\u1009\u001a\u0017\u1009\u0018\u001d\u1409\u0012\u001e\u1009\u0014\u001f\u1009\u0015 \u1409\u0010\"\u001b%\u041b'\u1009\u0013", new Object[]{"b", "f", "c", "d", "g", "t", "h", "i", "u", "j", "k", "l", "w", "m", "e", "x", "v", "z", "q", "r", "o", "s", kdp.class, "n", kfp.class, "p"});
        }
        if (n2 == 3) {
            return new kfl();
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
            this.A = by2;
            return null;
        }
        hym hym2 = y;
        object = hym2;
        if (hym2 == null) {
            synchronized (kfl.class) {
                hym2 = y;
                object = hym2;
                if (hym2 == null) {
                    y = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

