/*
 * Decompiled with CFR 0.152.
 */
public final class idp
extends hwv
implements hyg {
    public static final idp a;
    public static final gpm c;
    private static volatile hym d;
    public hxk b = hyp.b;

    static {
        idp idp2;
        a = idp2 = new idp();
        hwv.z(idp.class, idp2);
        c = hwv.E(ifm.a, idp2, null, 386458583, hzm.k, false);
    }

    private idp() {
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
            return new hyq(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", ido.class});
        }
        if (n2 == 3) {
            return new idp();
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
            synchronized (idp.class) {
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

