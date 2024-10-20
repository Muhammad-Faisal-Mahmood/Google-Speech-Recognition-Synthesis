/*
 * Decompiled with CFR 0.152.
 */
public final class hme
extends hwv
implements hyg {
    public static final hme a;
    private static volatile hym k;
    public int b;
    public hxk c = hyp.b;
    public hxe d;
    public hxe e;
    public hxe f;
    public hxe g;
    public long h;
    public long i;
    public int j;

    static {
        hme hme2;
        a = hme2 = new hme();
        hwv.z(hme.class, hme2);
    }

    private hme() {
        hxw hxw2 = hxw.a;
        this.d = hxw2;
        this.e = hxw2;
        this.f = hxw2;
        this.g = hxw2;
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
            return new hyq(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0005\u0000\u0001\u001b\u0002\u0015\u0003\u0015\u0004\u1003\u0000\u0005\u1003\u0001\u0006\u1004\u0002\u0007&\b&", new Object[]{"b", "c", hlq.class, "d", "f", "h", "i", "j", "e", "g"});
        }
        if (n2 == 3) {
            return new hme();
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
        hym hym2 = k;
        object = hym2;
        if (hym2 == null) {
            synchronized (hme.class) {
                hym2 = k;
                object = hym2;
                if (hym2 == null) {
                    k = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

