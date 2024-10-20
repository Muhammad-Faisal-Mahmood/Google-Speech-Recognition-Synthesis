/*
 * Decompiled with CFR 0.152.
 */
public final class iba
extends hwv
implements hyg {
    public static final iba a;
    private static volatile hym f;
    public int b;
    public int c;
    public String d = "";
    public iba e;

    static {
        iba iba2;
        a = iba2 = new iba();
        hwv.z(iba.class, iba2);
    }

    private iba() {
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
            return new hyq(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0001\u0002\u1008\u0002\u0003\u1009\u0003", new Object[]{"b", "c", "d", "e"});
        }
        if (n2 == 3) {
            return new iba();
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
            synchronized (iba.class) {
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

