/*
 * Decompiled with CFR 0.152.
 */
public final class hkv
extends hwv
implements hyg {
    public static final hkv a;
    private static volatile hym b;
    private int c;
    private hku d;
    private bqo e;
    private byte f = (byte)2;

    static {
        hkv hkv2;
        a = hkv2 = new hkv();
        hwv.z(hkv.class, hkv2);
    }

    private hkv() {
        Object object = hvu.b;
        object = hyp.a;
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
            return this.f;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0002\u0000\u0001\u000b\u001e\u0002\u0000\u0000\u0001\u000b\u1409\n\u001e\u1009\u0019", new Object[]{"c", "d", "e"});
        }
        if (n2 == 3) {
            return new hkv();
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
            synchronized (hkv.class) {
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

