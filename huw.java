/*
 * Decompiled with CFR 0.152.
 */
public final class huw
extends hwv
implements hyg {
    public static final hxc a;
    public static final huw b;
    public static final hxf l;
    private static volatile hym m;
    public int c;
    public String d = "";
    public String e;
    public int f;
    public int g;
    public String h;
    public hxb i;
    public hxk j;
    public hya k = hya.a;

    static {
        huw huw2;
        a = new dvg(8);
        l = new hxf(ibz.ah, ibz.a);
        b = huw2 = new huw();
        hwv.z(huw.class, huw2);
    }

    private huw() {
        Object object = hyp.a;
        this.e = "";
        object = hww.a;
        this.h = "";
        this.i = hww.a;
        this.j = hyp.b;
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
            hwz hwz2 = hqj.n;
            dlm dlm2 = huv.a;
            object = hqj.g;
            return new hyq(b, "\u0004\b\u0000\u0001\u0001\u0015\b\u0001\u0002\u0000\u0001\u1008\u0000\u0003\u1008\u0001\u0004\u1004\u0002\u0005\u1004\u0005\u000f\u081e\u0011\u1008\u000b\u0014\u001b\u0015\u0832", new Object[]{"c", "d", "e", "f", "g", "i", hwz2, "h", "j", hux.class, "k", dlm2, object});
        }
        if (n2 == 3) {
            return new huw();
        }
        if (n2 == 4) {
            return new hwp(b);
        }
        if (n2 == 5) {
            return b;
        }
        if (n2 != 6) {
            return null;
        }
        hym hym2 = m;
        object = hym2;
        if (hym2 == null) {
            synchronized (huw.class) {
                hym2 = m;
                object = hym2;
                if (hym2 == null) {
                    m = object = new hwq(b);
                }
            }
        }
        return object;
    }
}

