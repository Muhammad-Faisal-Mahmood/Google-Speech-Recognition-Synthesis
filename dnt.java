/*
 * Decompiled with CFR 0.152.
 */
public final class dnt
extends hwv
implements hyg {
    public static final dnt a;
    private static volatile hym f;
    public boolean b;
    public int c;
    public int d;
    public int e;
    private int g;

    static {
        dnt dnt2;
        a = dnt2 = new dnt();
        hwv.z(dnt.class, dnt2);
    }

    private dnt() {
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
            return new hyq(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1004\u0003", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (n2 == 3) {
            return new dnt();
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
            synchronized (dnt.class) {
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

