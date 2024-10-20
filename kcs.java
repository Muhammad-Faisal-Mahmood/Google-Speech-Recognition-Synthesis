/*
 * Decompiled with CFR 0.152.
 */
public final class kcs
extends hwv
implements hyg {
    public static final kcs a;
    public static final gpm j;
    private static volatile hym k;
    public int b;
    public int c;
    public int d;
    public kcp e;
    public kcr f;
    public kcm g;
    public kck h;
    public kcl i;

    static {
        kcs kcs2;
        a = kcs2 = new kcs();
        hwv.z(kcs.class, kcs2);
        j = hwv.F(bos.a, kcs2, kcs2, 493626098, hzm.k);
    }

    private kcs() {
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
            hwz hwz2 = iko.e;
            object = iko.d;
            return new hyq(a, "\u0004\u0007\u0000\u0001\u0002\t\u0007\u0000\u0000\u0000\u0002\u180c\u0000\u0003\u180c\u0001\u0004\u1009\u0003\u0005\u1009\u0002\u0006\u1009\u0004\b\u1009\u0006\t\u1009\u0007", new Object[]{"b", "c", hwz2, "d", object, "f", "e", "g", "h", "i"});
        }
        if (n2 == 3) {
            return new kcs();
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
        hym hym2 = k;
        object = hym2;
        if (hym2 == null) {
            synchronized (kcs.class) {
                hym2 = k;
                object = hym2;
                if (hym2 == null) {
                    k = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

