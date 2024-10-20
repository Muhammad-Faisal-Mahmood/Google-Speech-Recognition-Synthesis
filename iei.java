/*
 * Decompiled with CFR 0.152.
 */
public final class iei
extends hwv
implements hyg {
    public static final iei a;
    private static volatile hym f;
    public int b = 0;
    public Object c;
    public int d;
    public String e = "";
    private int g;

    static {
        iei iei2;
        a = iei2 = new iei();
        hwv.z(iei.class, iei2);
    }

    private iei() {
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
            return new hyq(a, "\u0004\u0003\u0001\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002=\u0000\u0003\u1004\u0000\u0004\u1008\u0001", new Object[]{"c", "b", "g", "d", "e"});
        }
        if (n2 == 3) {
            return new iei();
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
            synchronized (iei.class) {
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

