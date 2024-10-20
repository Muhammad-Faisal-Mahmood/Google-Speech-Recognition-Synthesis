/*
 * Decompiled with CFR 0.152.
 */
public final class euk
extends hwv
implements hyg {
    public static final euk a;
    private static volatile hym g;
    public int b;
    public ear c;
    public edf d;
    public eae e;
    public boolean f;

    static {
        euk euk2;
        a = euk2 = new euk();
        hwv.z(euk.class, euk2);
    }

    private euk() {
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
            return new hyq(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0003\u1009\u0001\u0004\u1009\u0002\u0005\u1007\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (n2 == 3) {
            return new euk();
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
        hym hym2 = g;
        object = hym2;
        if (hym2 == null) {
            synchronized (euk.class) {
                hym2 = g;
                object = hym2;
                if (hym2 == null) {
                    g = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

