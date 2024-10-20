/*
 * Decompiled with CFR 0.152.
 */
public final class ifu
extends hwv
implements hyg {
    public static final ifu a;
    private static volatile hym c;
    public idu b;
    private int d;

    static {
        ifu ifu2;
        a = ifu2 = new ifu();
        hwv.z(ifu.class, ifu2);
    }

    private ifu() {
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
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[]{"d", "b"});
        }
        if (n2 == 3) {
            return new ifu();
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
            synchronized (ifu.class) {
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

