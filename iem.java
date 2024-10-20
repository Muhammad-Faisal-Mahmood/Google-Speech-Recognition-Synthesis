/*
 * Decompiled with CFR 0.152.
 */
public final class iem
extends hwv
implements hyg {
    public static final iem a;
    private static volatile hym f;
    public int b;
    public boolean c;
    public String d = "";
    public String e = "";

    static {
        iem iem2;
        a = iem2 = new iem();
        hwv.z(iem.class, iem2);
    }

    private iem() {
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
            return new hyq(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (n2 == 3) {
            return new iem();
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
            synchronized (iem.class) {
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

