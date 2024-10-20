/*
 * Decompiled with CFR 0.152.
 */
public final class igt
extends hwv
implements hyg {
    public static final igt a;
    private static volatile hym e;
    public int b;
    public int c;
    public ieg d;

    static {
        igt igt2;
        a = igt2 = new igt();
        hwv.z(igt.class, igt2);
    }

    private igt() {
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
            object = ieo.o;
            return new hyq(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u180c\u0000\u0003\u1009\u0002", new Object[]{"b", "c", object, "d"});
        }
        if (n2 == 3) {
            return new igt();
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
            synchronized (igt.class) {
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

