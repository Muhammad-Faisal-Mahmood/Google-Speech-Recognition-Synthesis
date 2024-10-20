/*
 * Decompiled with CFR 0.152.
 */
public final class iec
extends hwv
implements hyg {
    public static final iec a;
    private static volatile hym b;
    private hya c = hya.a;

    static {
        iec iec2;
        a = iec2 = new iec();
        hwv.z(iec.class, iec2);
    }

    private iec() {
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
            object = ieb.a;
            return new hyq(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"c", object});
        }
        if (n2 == 3) {
            return new iec();
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
            synchronized (iec.class) {
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

