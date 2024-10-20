/*
 * Decompiled with CFR 0.152.
 */
public final class kew
extends hwv
implements hyg {
    public static final kew a;
    private static volatile hym h;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public long f;
    public String g = "";

    static {
        kew kew2;
        a = kew2 = new kew();
        hwv.z(kew.class, kew2);
    }

    private kew() {
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
            object = kei.e;
            return new hyq(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u180c\u0002\u0004\u1002\u0003\u0005\u1008\u0004", new Object[]{"b", "c", "d", "e", object, "f", "g"});
        }
        if (n2 == 3) {
            return new kew();
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
            synchronized (kew.class) {
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

