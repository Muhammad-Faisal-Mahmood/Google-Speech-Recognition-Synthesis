/*
 * Decompiled with CFR 0.152.
 */
public final class fhg
extends hwv
implements hyg {
    public static final fhg a;
    private static volatile hym g;
    public boolean b;
    public int c;
    public hxk d = hyp.b;
    public fiu e;
    public boolean f;
    private int h;

    static {
        fhg fhg2;
        a = fhg2 = new fhg();
        hwv.z(fhg.class, fhg2);
    }

    private fhg() {
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
            object = eck.t;
            return new hyq(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u1007\u0000\u0002\u180c\u0001\u0003\u001a\u0004\u1009\u0002\u0005\u1007\u0003", new Object[]{"h", "b", "c", object, "d", "e", "f"});
        }
        if (n2 == 3) {
            return new fhg();
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
            synchronized (fhg.class) {
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

