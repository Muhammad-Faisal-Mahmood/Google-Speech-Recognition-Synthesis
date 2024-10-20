/*
 * Decompiled with CFR 0.152.
 */
public final class fhu
extends hwv
implements hyg {
    public static final fhu a;
    private static volatile hym d;
    public boolean b;
    public hxk c = hyp.b;
    private int e;

    static {
        fhu fhu2;
        a = fhu2 = new fhu();
        hwv.z(fhu.class, fhu2);
    }

    private fhu() {
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
            return new hyq(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1007\u0000\u0002\u001a", new Object[]{"e", "b", "c"});
        }
        if (n2 == 3) {
            return new fhu();
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
            synchronized (fhu.class) {
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

