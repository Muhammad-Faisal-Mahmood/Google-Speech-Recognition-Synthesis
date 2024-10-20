/*
 * Decompiled with CFR 0.152.
 */
public final class eac
extends hwv
implements hyg {
    public static final eac a;
    private static volatile hym e;
    public int b;
    public boolean c;
    public boolean d;

    static {
        eac eac2;
        a = eac2 = new eac();
        hwv.z(eac.class, eac2);
    }

    private eac() {
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
            return new hyq(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001", new Object[]{"b", "c", "d"});
        }
        if (n2 == 3) {
            return new eac();
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
        hym hym2 = e;
        object = hym2;
        if (hym2 == null) {
            synchronized (eac.class) {
                hym2 = e;
                object = hym2;
                if (hym2 == null) {
                    e = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

