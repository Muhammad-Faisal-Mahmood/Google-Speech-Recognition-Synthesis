/*
 * Decompiled with CFR 0.152.
 */
public final class efv
extends hwv
implements hyg {
    public static final efv a;
    private static volatile hym f;
    public int b;
    public int c;
    public int d;
    public long e;

    static {
        efv efv2;
        a = efv2 = new efv();
        hwv.z(efv.class, efv2);
    }

    private efv() {
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
            object = eck.h;
            return new hyq(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u180c\u0001\u0003\u1002\u0002", new Object[]{"b", "c", "d", object, "e"});
        }
        if (n2 == 3) {
            return new efv();
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
            synchronized (efv.class) {
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

