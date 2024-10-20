/*
 * Decompiled with CFR 0.152.
 */
public final class ken
extends hwv
implements hyg {
    public static final ken a;
    private static volatile hym h;
    public int b;
    public kep c;
    public long d;
    public String e = "";
    public int f;
    public long g;

    static {
        ken ken2;
        a = ken2 = new ken();
        hwv.z(ken.class, ken2);
    }

    private ken() {
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
            object = kei.c;
            return new hyq(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1003\u0001\u0006\u1008\u0003\u0007\u180c\u0004\b\u1003\u0005", new Object[]{"b", "c", "d", "e", "f", object, "g"});
        }
        if (n2 == 3) {
            return new ken();
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
            synchronized (ken.class) {
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

