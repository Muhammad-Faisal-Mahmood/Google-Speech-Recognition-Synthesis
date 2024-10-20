/*
 * Decompiled with CFR 0.152.
 */
public final class kex
extends hwv
implements hyg {
    public static final kex a;
    private static volatile hym b;
    private int c;
    private hlj d;
    private byte e = (byte)2;

    static {
        kex kex2;
        a = kex2 = new kex();
        hwv.z(kex.class, kex2);
    }

    private kex() {
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
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005\u1409\u0003", new Object[]{"c", "d"});
        }
        if (n2 == 3) {
            return new kex();
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
            this.e = by2;
            return null;
        }
        hym hym2 = b;
        object = hym2;
        if (hym2 == null) {
            synchronized (kex.class) {
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

