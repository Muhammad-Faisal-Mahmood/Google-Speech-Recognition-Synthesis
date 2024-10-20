/*
 * Decompiled with CFR 0.152.
 */
public final class eaa
extends hwv
implements hyg {
    public static final hxc a;
    public static final eaa b;
    private static volatile hym d;
    public hxb c = hww.a;

    static {
        eaa eaa2;
        a = new dvg(3);
        b = eaa2 = new eaa();
        hwv.z(eaa.class, eaa2);
    }

    private eaa() {
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
            object = dpn.h;
            return new hyq(b, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u082c", new Object[]{"c", object});
        }
        if (n2 == 3) {
            return new eaa();
        }
        if (n2 == 4) {
            return new hwp(b);
        }
        if (n2 == 5) {
            return b;
        }
        if (n2 != 6) {
            return null;
        }
        hym hym2 = d;
        object = hym2;
        if (hym2 == null) {
            synchronized (eaa.class) {
                hym2 = d;
                object = hym2;
                if (hym2 == null) {
                    d = object = new hwq(b);
                }
            }
        }
        return object;
    }
}

