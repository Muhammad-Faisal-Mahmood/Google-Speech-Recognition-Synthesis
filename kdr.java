/*
 * Decompiled with CFR 0.152.
 */
public final class kdr
extends hwv
implements hyg {
    public static final kdr a;
    private static volatile hym d;
    public int b;
    public boolean c;

    static {
        kdr kdr2;
        a = kdr2 = new kdr();
        hwv.z(kdr.class, kdr2);
    }

    private kdr() {
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
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[]{"b", "c"});
        }
        if (n2 == 3) {
            return new kdr();
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
            synchronized (kdr.class) {
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

