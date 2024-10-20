/*
 * Decompiled with CFR 0.152.
 */
public final class icz
extends hwv
implements hyg {
    public static final icz a;
    public static final gpm c;
    private static volatile hym d;
    public hxb b;
    private byte e = (byte)2;

    static {
        icz icz2;
        a = icz2 = new icz();
        hwv.z(icz.class, icz2);
        c = hwv.F(ida.a, icz2, icz2, 33357560, hzm.k);
    }

    private icz() {
        this.b = hww.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.e;
        }
        byte by2 = 0;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u0016", new Object[]{"b"});
        }
        if (n2 == 3) {
            return new icz();
        }
        if (n2 == 4) {
            return new hwp(a);
        }
        if (n2 == 5) {
            return a;
        }
        if (n2 != 6) {
            if (object != null) {
                by2 = 1;
            }
            this.e = by2;
            return null;
        }
        hym hym2 = d;
        object = hym2;
        if (hym2 == null) {
            synchronized (icz.class) {
                hym2 = d;
                object = hym2;
                if (hym2 == null) {
                    d = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

