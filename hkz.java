/*
 * Decompiled with CFR 0.152.
 */
public final class hkz
extends hws
implements hwt {
    public static final hkz a;
    private static volatile hym c;
    public int b;
    private hlg d;
    private byte e = (byte)2;

    static {
        hkz hkz2;
        a = hkz2 = new hkz();
        hwv.z(hkz.class, hkz2);
    }

    private hkz() {
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
            return this.e;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0010\u0010\u0001\u0000\u0000\u0001\u0010\u1409\u0000", new Object[]{"b", "d"});
        }
        if (n2 == 3) {
            return new hkz();
        }
        if (n2 == 4) {
            return new hwr(a);
        }
        if (n2 == 5) {
            return a;
        }
        if (n2 != 6) {
            if (object == null) {
                by2 = 0;
            }
            this.e = by2;
            return null;
        }
        hym hym2 = c;
        object = hym2;
        if (hym2 == null) {
            synchronized (hkz.class) {
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

