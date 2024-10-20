/*
 * Decompiled with CFR 0.152.
 */
public final class ctg
extends hwv
implements hyg {
    public static final ctg a;
    private static volatile hym j;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public boolean h;
    public boolean i;

    static {
        ctg ctg2;
        a = ctg2 = new ctg();
        hwv.z(ctg.class, ctg2);
    }

    private ctg() {
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
            return new hyq(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1004\u0004\u0006\u1007\u0005\u0007\u1007\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (n2 == 3) {
            return new ctg();
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
        hym hym2 = j;
        object = hym2;
        if (hym2 == null) {
            synchronized (ctg.class) {
                hym2 = j;
                object = hym2;
                if (hym2 == null) {
                    j = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

