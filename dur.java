/*
 * Decompiled with CFR 0.152.
 */
public final class dur
extends hwv
implements hyg {
    public static final dur a;
    private static volatile hym f;
    public int b;
    public int c = 0;
    public Object d;
    public String e = "";

    static {
        dur dur2;
        a = dur2 = new dur();
        hwv.z(dur.class, dur2);
    }

    private dur() {
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
            return new hyq(a, "\u0004\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\n\u1008\u0000", new Object[]{"d", "c", "b", "e"});
        }
        if (n2 == 3) {
            return new dur();
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
            synchronized (dur.class) {
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

