/*
 * Decompiled with CFR 0.152.
 */
public final class fim
extends hwv
implements hyg {
    public static final fim a;
    private static volatile hym h;
    public int b;
    public String c = "";
    public int d;
    public hxk e = hyp.b;
    public int f;
    public int g;

    static {
        fim fim2;
        a = fim2 = new fim();
        hwv.z(fim.class, fim2);
    }

    private fim() {
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
            hwz hwz2 = fhn.e;
            object = fhn.g;
            hwz hwz3 = fhn.f;
            return new hyq(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u180c\u0001\u0003\u001a\u0004\u180c\u0002\u0005\u180c\u0003", new Object[]{"b", "c", "d", hwz2, "e", "f", object, "g", hwz3});
        }
        if (n2 == 3) {
            return new fim();
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
        hym hym2 = h;
        object = hym2;
        if (hym2 == null) {
            synchronized (fim.class) {
                hym2 = h;
                object = hym2;
                if (hym2 == null) {
                    h = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

