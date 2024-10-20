/*
 * Decompiled with CFR 0.152.
 */
public final class eas
extends hwv
implements hyg {
    public static final eas a;
    private static volatile hym e;
    public int b;
    public ebq c;
    public int d;

    static {
        eas eas2;
        a = eas2 = new eas();
        hwv.z(eas.class, eas2);
    }

    private eas() {
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
            object = dpn.r;
            return new hyq(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u180c\u0001", new Object[]{"b", "c", "d", object});
        }
        if (n2 == 3) {
            return new eas();
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
        hym hym2 = e;
        object = hym2;
        if (hym2 == null) {
            synchronized (eas.class) {
                hym2 = e;
                object = hym2;
                if (hym2 == null) {
                    e = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

