/*
 * Decompiled with CFR 0.152.
 */
public final class dkl
extends hwv
implements hyg {
    public static final dkl a;
    private static volatile hym c;
    public hxk b;
    private byte d = (byte)2;

    static {
        dkl dkl2;
        a = dkl2 = new dkl();
        hwv.z(dkl.class, dkl2);
    }

    private dkl() {
        this.b = hyp.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.d;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0004\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0001\u0001\u0004\u041b", new Object[]{"b", dkj.class});
        }
        if (n2 == 3) {
            return new dkl();
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
            this.d = by2;
            return null;
        }
        hym hym2 = c;
        object = hym2;
        if (hym2 == null) {
            synchronized (dkl.class) {
                hym2 = c;
                object = hym2;
                if (hym2 == null) {
                    c = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

