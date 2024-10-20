/*
 * Decompiled with CFR 0.152.
 */
public final class ebd
extends hwv
implements hyg {
    public static final ebd a;
    private static volatile hym d;
    public int b;
    public int c = 2;

    static {
        ebd ebd2;
        a = ebd2 = new ebd();
        hwv.z(ebd.class, ebd2);
    }

    private ebd() {
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
            object = dpn.k;
            return new hyq(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u180c\u0000", new Object[]{"b", "c", object});
        }
        if (n2 == 3) {
            return new ebd();
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
        hym hym2 = d;
        object = hym2;
        if (hym2 == null) {
            synchronized (ebd.class) {
                hym2 = d;
                object = hym2;
                if (hym2 == null) {
                    d = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

