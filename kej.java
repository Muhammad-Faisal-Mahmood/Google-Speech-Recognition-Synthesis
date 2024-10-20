/*
 * Decompiled with CFR 0.152.
 */
public final class kej
extends hwv
implements hyg {
    public static final kej a;
    private static volatile hym g;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public hxk f = hyp.b;

    static {
        kej kej2;
        a = kej2 = new kej();
        hwv.z(kej.class, kej2);
    }

    private kej() {
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
            object = kei.a;
            return new hyq(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u180c\u0000\u00028\u0000\u0003<\u0000\u0004\u001b", new Object[]{"d", "c", "b", "e", object, keg.class, "f", keh.class});
        }
        if (n2 == 3) {
            return new kej();
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
        hym hym2 = g;
        object = hym2;
        if (hym2 == null) {
            synchronized (kej.class) {
                hym2 = g;
                object = hym2;
                if (hym2 == null) {
                    g = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

