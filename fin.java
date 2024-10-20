/*
 * Decompiled with CFR 0.152.
 */
public final class fin
extends hwv
implements hyg {
    public static final fin a;
    private static volatile hym f;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        fin fin2;
        a = fin2 = new fin();
        hwv.z(fin.class, fin2);
    }

    private fin() {
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
            return new hyq(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (n2 == 3) {
            return new fin();
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
            synchronized (fin.class) {
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

