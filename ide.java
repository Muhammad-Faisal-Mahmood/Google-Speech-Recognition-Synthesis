/*
 * Decompiled with CFR 0.152.
 */
public final class ide
extends hwv
implements hyg {
    public static final ide a;
    public static final gpm c;
    private static volatile hym d;
    public boolean b;
    private int e;

    static {
        ide ide2;
        a = ide2 = new ide();
        hwv.z(ide.class, ide2);
        c = hwv.F(idb.a, ide2, ide2, 443278602, hzm.k);
    }

    private ide() {
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
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[]{"e", "b"});
        }
        if (n2 == 3) {
            return new ide();
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
            synchronized (ide.class) {
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

