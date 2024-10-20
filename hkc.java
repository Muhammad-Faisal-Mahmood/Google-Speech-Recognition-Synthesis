/*
 * Decompiled with CFR 0.152.
 */
public final class hkc
extends hwv
implements hyg {
    public static final hkc a;
    private static volatile hym b;
    private int c;
    private int d;
    private hld e;
    private hli f;
    private byte g = (byte)2;

    static {
        hkc hkc2;
        a = hkc2 = new hkc();
        hwv.z(hkc.class, hkc2);
    }

    private hkc() {
        Object object = hyp.a;
        object = hww.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.g;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0002\u0000\u00029v\u0002\u0000\u0000\u00029\u1409\u000bv\u14097", new Object[]{"c", "d", "e", "f"});
        }
        if (n2 == 3) {
            return new hkc();
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
            this.g = by2;
            return null;
        }
        hym hym2 = b;
        object = hym2;
        if (hym2 == null) {
            synchronized (hkc.class) {
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

