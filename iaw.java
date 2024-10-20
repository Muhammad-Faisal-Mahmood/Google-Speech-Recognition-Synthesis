/*
 * Decompiled with CFR 0.152.
 */
public final class iaw
extends hwv
implements hyg {
    public static final iaw a;
    public static final gpm b;
    private static volatile hym c;

    static {
        iaw iaw2;
        a = iaw2 = new iaw();
        hwv.z(iaw.class, iaw2);
        b = hwv.F(bos.a, iat.a, iat.a, 520870272, hzm.k);
    }

    private iaw() {
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
            return new iaw();
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
        hym hym2 = c;
        object = hym2;
        if (hym2 == null) {
            synchronized (iaw.class) {
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

