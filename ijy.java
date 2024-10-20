/*
 * Decompiled with CFR 0.152.
 */
public final class ijy
extends hwv
implements hyg {
    public static final ijy a;
    private static volatile hym c;
    public hxb b = hww.a;

    static {
        ijy ijy2;
        a = ijy2 = new ijy();
        hwv.z(ijy.class, ijy2);
    }

    private ijy() {
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
            object = hva.a;
            return new hyq(a, "\u0001\u0001\u0000\u0000\u0007\u0007\u0001\u0000\u0001\u0000\u0007\u081e", new Object[]{"b", object});
        }
        if (n2 == 3) {
            return new ijy();
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
            synchronized (ijy.class) {
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

