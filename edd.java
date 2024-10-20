/*
 * Decompiled with CFR 0.152.
 */
public final class edd
extends hwv
implements hyg {
    public static final edd a;
    private static volatile hym f;
    public int b;
    public int c = 0;
    public Object d;
    public int e;

    static {
        edd edd2;
        a = edd2 = new edd();
        hwv.z(edd.class, edd2);
    }

    private edd() {
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
            object = eck.e;
            hwz hwz2 = dpn.q;
            hwz hwz3 = dpn.o;
            return new hyq(a, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u083f\u0000\u0003\u083f\u0000", new Object[]{"d", "c", "b", "e", object, hwz2, hwz3});
        }
        if (n2 == 3) {
            return new edd();
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
            synchronized (edd.class) {
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

