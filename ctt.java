/*
 * Decompiled with CFR 0.152.
 */
public final class ctt
extends hwv
implements hyg {
    public static final ctt a;
    private static volatile hym h;
    public int b;
    public String c = "";
    public int d;
    public String e = "";
    public int f;
    public ikm g;

    static {
        ctt ctt2;
        a = ctt2 = new ctt();
        hwv.z(ctt.class, ctt2);
    }

    private ctt() {
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
            object = bqk.p;
            return new hyq(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0001\u0003\u1008\u0002\u0004\u180c\u0003\u0005\u1009\u0004", new Object[]{"b", "c", "d", "e", "f", object, "g"});
        }
        if (n2 == 3) {
            return new ctt();
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
            synchronized (ctt.class) {
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

