/*
 * Decompiled with CFR 0.152.
 */
public final class eaf
extends hws
implements hwt {
    public static final eaf a;
    private static volatile hym d;
    public int b;
    public long c;
    private byte e = (byte)2;

    static {
        eaf eaf2;
        a = eaf2 = new eaf();
        hwv.z(eaf.class, eaf2);
    }

    private eaf() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.e;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[]{"b", "c"});
        }
        if (n2 == 3) {
            return new eaf();
        }
        if (n2 == 4) {
            return new hwr(a);
        }
        if (n2 == 5) {
            return a;
        }
        if (n2 != 6) {
            if (object == null) {
                by2 = 0;
            }
            this.e = by2;
            return null;
        }
        hym hym2 = d;
        object = hym2;
        if (hym2 == null) {
            synchronized (eaf.class) {
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

