/*
 * Decompiled with CFR 0.152.
 */
public final class ebw
extends hwv
implements hyg {
    public static final ebw a;
    private static volatile hym h;
    public int b;
    public int c;
    public String d = "";
    public int e;
    public int f;
    public int g;

    static {
        ebw ebw2;
        a = ebw2 = new ebw();
        hwv.z(ebw.class, ebw2);
    }

    private ebw() {
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
            object = dpn.u;
            return new hyq(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1008\u0001\u0003\u1004\u0002\u0004\u1004\u0003\u0005\u1004\u0004", new Object[]{"b", "c", object, "d", "e", "f", "g"});
        }
        if (n2 == 3) {
            return new ebw();
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
            synchronized (ebw.class) {
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

