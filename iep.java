/*
 * Decompiled with CFR 0.152.
 */
public final class iep
extends hws
implements hwt {
    public static final iep a;
    private static volatile hym g;
    public int b;
    public int c;
    public int d = 2;
    public int e = 2;
    public int f;
    private byte h = (byte)2;

    static {
        iep iep2;
        a = iep2 = new iep();
        hwv.z(iep.class, iep2);
    }

    private iep() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.h;
        }
        byte by2 = 1;
        if (n2 == 2) {
            hwz hwz2 = ieo.a;
            object = ieo.c;
            return new hyq(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1004\u0002\u0003\u1004\u0003\u0005\u180c\u0004", new Object[]{"b", "c", hwz2, "d", "e", "f", object});
        }
        if (n2 == 3) {
            return new iep();
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
            this.h = by2;
            return null;
        }
        hym hym2 = g;
        object = hym2;
        if (hym2 == null) {
            synchronized (iep.class) {
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

