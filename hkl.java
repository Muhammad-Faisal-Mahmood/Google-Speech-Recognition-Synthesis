/*
 * Decompiled with CFR 0.152.
 */
public final class hkl
extends hwv
implements hyg {
    public static final hkl a;
    private static volatile hym d;
    public int b;
    public hkz c;
    private hlh e;
    private hlh f;
    private hlh g;
    private hkm h;
    private byte i = (byte)2;

    static {
        hkl hkl2;
        a = hkl2 = new hkl();
        hwv.z(hkl.class, hkl2);
    }

    private hkl() {
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
            return this.i;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0004\b\u1409\u0003\t\u1409\u0007", new Object[]{"b", "e", "f", "c", "g", "h"});
        }
        if (n2 == 3) {
            return new hkl();
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
            this.i = by2;
            return null;
        }
        hym hym2 = d;
        object = hym2;
        if (hym2 == null) {
            synchronized (hkl.class) {
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

