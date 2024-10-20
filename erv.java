/*
 * Decompiled with CFR 0.152.
 */
public final class erv
extends hwv
implements hyg {
    public static final erv a;
    private static volatile hym f;
    public int b;
    public int c;
    public String d = "";
    public int e;

    static {
        erv erv2;
        a = erv2 = new erv();
        hwv.z(erv.class, erv2);
    }

    private erv() {
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
            hwz hwz2 = eck.k;
            object = eck.j;
            return new hyq(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1008\u0001\u0003\u180c\u0002", new Object[]{"b", "c", hwz2, "d", "e", object});
        }
        if (n2 == 3) {
            return new erv();
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
            synchronized (erv.class) {
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

