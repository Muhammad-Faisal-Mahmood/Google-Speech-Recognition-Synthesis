/*
 * Decompiled with CFR 0.152.
 */
public final class dkk
extends hwv
implements hyg {
    public static final dkk a;
    private static volatile hym c;
    public hzb b;
    private int d;

    static {
        dkk dkk2;
        a = dkk2 = new dkk();
        hwv.z(dkk.class, dkk2);
    }

    private dkk() {
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
            return new hyq(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[]{"d", "b"});
        }
        if (n2 == 3) {
            return new dkk();
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
            synchronized (dkk.class) {
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

