/*
 * Decompiled with CFR 0.152.
 */
public final class iie
extends hwv
implements hyg {
    public static final iie a;
    public static final gpm f;
    private static volatile hym g;
    public int b;
    public hvu c;
    public iid d;
    public iih e;
    private byte h = (byte)2;

    static {
        iie iie2;
        a = iie2 = new iie();
        hwv.z(iie.class, iie2);
        f = hwv.F(idb.a, iie2, iie2, 28599812, hzm.k);
    }

    private iie() {
        this.c = hvu.b;
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
            return new hyq(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001\u100a\u0000\u0003\u1009\u0002\u0005\u1009\u0004", new Object[]{"b", "c", "d", "e"});
        }
        if (n2 == 3) {
            return new iie();
        }
        if (n2 == 4) {
            return new hwp(a);
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
            synchronized (iie.class) {
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

