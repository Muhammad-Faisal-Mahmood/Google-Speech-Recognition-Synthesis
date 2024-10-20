/*
 * Decompiled with CFR 0.152.
 */
public final class gao
extends hwv
implements hyg {
    public static final gao a;
    private static volatile hym c;
    public hya b = hya.a;

    static {
        gao gao2;
        a = gao2 = new gao();
        hwv.z(gao.class, gao2);
    }

    private gao() {
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
            object = gan.a;
            return new hyq(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", object});
        }
        if (n2 == 3) {
            return new gao();
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
        hym hym2 = c;
        object = hym2;
        if (hym2 == null) {
            synchronized (gao.class) {
                hym2 = c;
                object = hym2;
                if (hym2 == null) {
                    c = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

