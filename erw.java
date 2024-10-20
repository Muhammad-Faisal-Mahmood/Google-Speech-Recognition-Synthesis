/*
 * Decompiled with CFR 0.152.
 */
public final class erw
extends hwv
implements hyg {
    public static final erw a;
    private static volatile hym h;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public String f = "";
    public int g = -1;

    static {
        erw erw2;
        a = erw2 = new erw();
        hwv.z(erw.class, erw2);
    }

    private erw() {
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
            object = eck.k;
            return new hyq(a, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u180c\u0000\u0002<\u0000\u0003<\u0000\u0004\u1008\u0001\u0005\u1004\u0002", new Object[]{"d", "c", "b", "e", object, ebt.class, ebq.class, "f", "g"});
        }
        if (n2 == 3) {
            return new erw();
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
        hym hym2 = h;
        object = hym2;
        if (hym2 == null) {
            synchronized (erw.class) {
                hym2 = h;
                object = hym2;
                if (hym2 == null) {
                    h = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

