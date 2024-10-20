/*
 * Decompiled with CFR 0.152.
 */
public final class dup
extends hwv
implements hyg {
    public static final dup a;
    private static volatile hym f;
    public int b;
    public String c = "";
    public duo d;
    public String e = "";

    static {
        dup dup2;
        a = dup2 = new dup();
        hwv.z(dup.class, dup2);
    }

    private dup() {
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
            return new hyq(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1008\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (n2 == 3) {
            return new dup();
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
            synchronized (dup.class) {
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

