/*
 * Decompiled with CFR 0.152.
 */
public final class hlm
extends hwv
implements hyg {
    public static final hlm a;
    private static volatile hym c;
    public hxk b;
    private byte d = (byte)2;

    static {
        hlm hlm2;
        a = hlm2 = new hlm();
        hwv.z(hlm.class, hlm2);
    }

    private hlm() {
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
            return new hyq(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[]{"b", hln.class});
        }
        if (n2 == 3) {
            return new hlm();
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
            synchronized (hlm.class) {
                hym2 = c;
                object = hym2;
                if (hym2 == null) {
                    c = object = new hwq(a);
                }
            }
        }
        return object;
    }

    public final void b() {
        hxk hxk2 = this.b;
        if (!hxk2.c()) {
            this.b = hwv.s(hxk2);
        }
    }
}

