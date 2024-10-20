/*
 * Decompiled with CFR 0.152.
 */
public final class ctj
extends hwv
implements hyg {
    public static final ctj a;
    private static volatile hym g;
    public int b;
    public int c;
    public int d;
    public long e;
    public int f;

    static {
        ctj ctj2;
        a = ctj2 = new ctj();
        hwv.z(ctj.class, ctj2);
    }

    private ctj() {
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
            hwz hwz2 = bqk.t;
            hwz hwz3 = bqk.s;
            object = bqk.r;
            return new hyq(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001\u0003\u180c\u0003\u0004\u1002\u0002", new Object[]{"b", "c", hwz2, "d", hwz3, "f", object, "e"});
        }
        if (n2 == 3) {
            return new ctj();
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
            synchronized (ctj.class) {
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

