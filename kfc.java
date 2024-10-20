/*
 * Decompiled with CFR 0.152.
 */
public final class kfc
extends hwv
implements hyg {
    public static final kfc a;
    private static volatile hym h;
    public hxe b;
    public hxe c;
    public hxb d;
    public hxb e;
    public hxb f;
    public hxk g;

    static {
        kfc kfc2;
        a = kfc2 = new kfc();
        hwv.z(kfc.class, kfc2);
    }

    private kfc() {
        hvg hvg2 = hxw.a;
        this.b = hvg2;
        this.c = hvg2;
        hvg2 = hww.a;
        this.d = hvg2;
        this.e = hvg2;
        this.f = hvg2;
        this.g = hyp.b;
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
            return new hyq(a, "\u0001\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0006\u0000\u0001%\u0002%\u0003'\u0004'\u0005'\u0006\u001a", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (n2 == 3) {
            return new kfc();
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
        hym hym2 = h;
        object = hym2;
        if (hym2 == null) {
            synchronized (kfc.class) {
                hym2 = h;
                object = hym2;
                if (hym2 == null) {
                    h = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

