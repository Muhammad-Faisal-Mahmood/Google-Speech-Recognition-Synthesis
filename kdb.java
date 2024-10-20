/*
 * Decompiled with CFR 0.152.
 */
public final class kdb
extends hwv
implements hyg {
    public static final kdb a;
    private static volatile hym c;
    public hxb b = hww.a;

    static {
        kdb kdb2;
        a = kdb2 = new kdb();
        hwv.z(kdb.class, kdb2);
    }

    private kdb() {
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
            object = iko.i;
            return new hyq(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u081e", new Object[]{"b", object});
        }
        if (n2 == 3) {
            return new kdb();
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
            synchronized (kdb.class) {
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

