/*
 * Decompiled with CFR 0.152.
 */
public final class ifk
extends hwv
implements hyg {
    public static final ifk a;
    private static volatile hym d;
    public String b = "";
    public boolean c;
    private int e;

    static {
        ifk ifk2;
        a = ifk2 = new ifk();
        hwv.z(ifk.class, ifk2);
    }

    private ifk() {
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
            return new hyq(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001", new Object[]{"e", "b", "c"});
        }
        if (n2 == 3) {
            return new ifk();
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
        hym hym2 = d;
        object = hym2;
        if (hym2 == null) {
            synchronized (ifk.class) {
                hym2 = d;
                object = hym2;
                if (hym2 == null) {
                    d = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

