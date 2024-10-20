/*
 * Decompiled with CFR 0.152.
 */
public final class kdk
extends hwv
implements hyg {
    public static final kdk a;
    private static volatile hym f;
    public int b;
    public int c;
    public int d;
    public kdg e;

    static {
        kdk kdk2;
        a = kdk2 = new kdk();
        hwv.z(kdk.class, kdk2);
    }

    private kdk() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return (byte)1;
        }
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1009\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (n2 == 3) {
            return new kdk();
        }
        if (n2 == 4) {
            return new hwp(a);
        }
        if (n2 == 5) {
            return a;
        }
        if (n2 != 6) {
            return null;
        }
        hym hym2 = f;
        object = hym2;
        if (hym2 == null) {
            synchronized (kdk.class) {
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

