/*
 * Decompiled with CFR 0.152.
 */
public final class faq
extends hwv
implements hyg {
    public static final hxc a;
    public static final faq b;
    private static volatile hym h;
    public int c;
    public String d = "";
    public long e;
    public int f;
    public hxb g = hww.a;

    static {
        faq faq2;
        a = new dvg(4);
        b = faq2 = new faq();
        hwv.z(faq.class, faq2);
    }

    private faq() {
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
            object = hqj.n;
            hwz hwz2 = hqj.f;
            return new hyq(b, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u180c\u0002\u0004\u082c", new Object[]{"c", "d", "e", "f", object, "g", hwz2});
        }
        if (n2 == 3) {
            return new faq();
        }
        if (n2 == 4) {
            return new hwp(b);
        }
        if (n2 == 5) {
            return b;
        }
        if (n2 != 6) {
            return null;
        }
        hym hym2 = h;
        object = hym2;
        if (hym2 == null) {
            synchronized (faq.class) {
                hym2 = h;
                object = hym2;
                if (hym2 == null) {
                    h = object = new hwq(b);
                }
            }
        }
        return object;
    }
}

