/*
 * Decompiled with CFR 0.152.
 */
public final class hln
extends hwv
implements hyg {
    public static final hln a;
    private static volatile hym f;
    public int b;
    public hll c;
    public int d;
    public hxb e;
    private byte g = (byte)2;

    static {
        hln hln2;
        a = hln2 = new hln();
        hwv.z(hln.class, hln2);
    }

    private hln() {
        this.e = hww.a;
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
            return new hyq(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u1004\u0001\u0003'", new Object[]{"b", "c", "d", "e"});
        }
        if (n2 == 3) {
            return new hln();
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
        hym hym2 = f;
        object = hym2;
        if (hym2 == null) {
            synchronized (hln.class) {
                hym2 = f;
                object = hym2;
                if (hym2 == null) {
                    f = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

