/*
 * Decompiled with CFR 0.152.
 */
public final class gam
extends hwv
implements hyg {
    public static final gam a;
    private static volatile hym e;
    public int b;
    public int c = 1;
    public hya d = hya.a;
    private byte f = (byte)2;

    static {
        gam gam2;
        a = gam2 = new gam();
        hwv.z(gam.class, gam2);
    }

    private gam() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.f;
        }
        byte by2 = 1;
        if (n2 == 2) {
            object = gal.a;
            return new hyq(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0001\u0001\u1004\u0000\u0002\u0432", new Object[]{"b", "c", "d", object});
        }
        if (n2 == 3) {
            return new gam();
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
            this.f = by2;
            return null;
        }
        hym hym2 = e;
        object = hym2;
        if (hym2 == null) {
            synchronized (gam.class) {
                hym2 = e;
                object = hym2;
                if (hym2 == null) {
                    e = object = new hwq(a);
                }
            }
        }
        return object;
    }

    public final hya b() {
        hya hya2 = this.d;
        if (!hya2.b) {
            this.d = hya2.a();
        }
        return this.d;
    }
}

