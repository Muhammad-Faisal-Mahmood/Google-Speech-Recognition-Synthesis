/*
 * Decompiled with CFR 0.152.
 */
public final class eul
extends hwv
implements hyg {
    public static final eul a;
    private static volatile hym d;
    public eco b;
    public edf c;
    private int e;

    static {
        eul eul2;
        a = eul2 = new eul();
        hwv.z(eul.class, eul2);
    }

    private eul() {
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
            return new hyq(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[]{"e", "b", "c"});
        }
        if (n2 == 3) {
            return new eul();
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
            synchronized (eul.class) {
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

