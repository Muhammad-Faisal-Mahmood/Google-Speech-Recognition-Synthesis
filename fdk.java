/*
 * Decompiled with CFR 0.152.
 */
public final class fdk
extends hwv
implements hyg {
    public static final fdk a;
    private static volatile hym b;

    static {
        fdk fdk2;
        a = fdk2 = new fdk();
        hwv.z(fdk.class, fdk2);
    }

    private fdk() {
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
            return new hyq(a, "\u0004\u0000", null);
        }
        if (n2 == 3) {
            return new fdk();
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
        hym hym2 = b;
        object = hym2;
        if (hym2 == null) {
            synchronized (fdk.class) {
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

