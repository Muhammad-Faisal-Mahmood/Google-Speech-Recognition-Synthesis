/*
 * Decompiled with CFR 0.152.
 */
public final class kff
extends hwv
implements hyg {
    public static final kff a;
    private static volatile hym p;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public kfi j;
    public hxk k = hyp.b;
    public int l;
    public int m;
    public int n;
    public kfi o;

    static {
        kff kff2;
        a = kff2 = new kff();
        hwv.z(kff.class, kff2);
    }

    private kff() {
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
            return new hyq(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0003\u0004\u1004\u0006\u0005\u001b\u0006\u1004\b\u0007\u1004\u0002\b\u1004\u0004\t\u1004\u0005\n\u1009\u0007\u000b\u1004\t\f\u1004\n\r\u1009\u000b", new Object[]{"b", "c", "d", "f", "i", "k", kfe.class, "l", "e", "g", "h", "j", "m", "n", "o"});
        }
        if (n2 == 3) {
            return new kff();
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
        hym hym2 = p;
        object = hym2;
        if (hym2 == null) {
            synchronized (kff.class) {
                hym2 = p;
                object = hym2;
                if (hym2 == null) {
                    p = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

