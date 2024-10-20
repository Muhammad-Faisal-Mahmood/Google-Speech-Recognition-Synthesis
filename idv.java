/*
 * Decompiled with CFR 0.152.
 */
public final class idv
extends hwv
implements hyg {
    public static final idv a;
    private static volatile hym b;
    private int c;
    private igm d;

    static {
        idv idv2;
        a = idv2 = new idv();
        hwv.z(idv.class, idv2);
    }

    private idv() {
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
            return new hyq(a, "\u0001\u0001\u0000\u0001\b\b\u0001\u0000\u0000\u0000\b\u1009\u0007", new Object[]{"c", "d"});
        }
        if (n2 == 3) {
            return new idv();
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
        hym hym2 = b;
        object = hym2;
        if (hym2 == null) {
            synchronized (idv.class) {
                hym2 = b;
                object = hym2;
                if (hym2 == null) {
                    b = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

