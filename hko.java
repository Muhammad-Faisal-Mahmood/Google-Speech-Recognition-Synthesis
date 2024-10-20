/*
 * Decompiled with CFR 0.152.
 */
public final class hko
extends hwv
implements hyg {
    public static final hko a;
    private static volatile hym b;
    private int c;
    private hkl d;
    private hkl e;
    private byte f = (byte)2;

    static {
        hko hko2;
        a = hko2 = new hko();
        hwv.z(hko.class, hko2);
    }

    private hko() {
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
            return this.f;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0002\u0000\u0001\b\t\u0002\u0000\u0000\u0002\b\u1409\u0006\t\u1409\u0007", new Object[]{"c", "d", "e"});
        }
        if (n2 == 3) {
            return new hko();
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
        hym hym2 = b;
        object = hym2;
        if (hym2 == null) {
            synchronized (hko.class) {
                hym2 = b;
                object = hym2;
                if (hym2 == null) {
                    b = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

