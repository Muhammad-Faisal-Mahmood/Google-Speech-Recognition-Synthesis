/*
 * Decompiled with CFR 0.152.
 */
public final class ijg
extends hwv
implements hyg {
    public static final ijg a;
    private static volatile hym h;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public int f;
    public int g;

    static {
        ijg ijg2;
        a = ijg2 = new ijg();
        hwv.z(ijg.class, ijg2);
    }

    private ijg() {
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
            return new hyq(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u00037\u0000\u0004;\u0000\u0005\u1004\u0002", new Object[]{"d", "c", "b", "e", "f", "g"});
        }
        if (n2 == 3) {
            return new ijg();
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
            synchronized (ijg.class) {
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

