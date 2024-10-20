/*
 * Decompiled with CFR 0.152.
 */
public final class hly
extends hwv
implements hyg {
    public static final hly a;
    private static volatile hym g;
    public int b;
    public int c;
    public int d;
    public hxk e = hyp.b;
    public long f;

    static {
        hly hly2;
        a = hly2 = new hly();
        hwv.z(hly.class, hly2);
    }

    private hly() {
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
            object = fhn.t;
            hwz hwz2 = fhn.u;
            return new hyq(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u180c\u0000\u0002\u180c\u0001\u0003\u001b\u0004\u1002\u0002", new Object[]{"b", "c", object, "d", hwz2, "e", hlq.class, "f"});
        }
        if (n2 == 3) {
            return new hly();
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
            synchronized (hly.class) {
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

