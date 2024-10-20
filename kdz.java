/*
 * Decompiled with CFR 0.152.
 */
public final class kdz
extends hwv
implements hyg {
    public static final kdz a;
    private static volatile hym d;
    public int b;
    public int c;

    static {
        kdz kdz2;
        a = kdz2 = new kdz();
        hwv.z(kdz.class, kdz2);
    }

    private kdz() {
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
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[]{"b", "c"});
        }
        if (n2 == 3) {
            return new kdz();
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
            synchronized (kdz.class) {
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

