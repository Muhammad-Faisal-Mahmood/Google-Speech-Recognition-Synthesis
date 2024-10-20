/*
 * Decompiled with CFR 0.152.
 */
public final class iew
extends hwv
implements hyg {
    public static final iew a;
    private static volatile hym l;
    public int b;
    public hya c = hya.a;
    public boolean d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    private hya m = hya.a;

    static {
        iew iew2;
        a = iew2 = new iew();
        hwv.z(iew.class, iew2);
    }

    private iew() {
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
            object = iev.a;
            hwz hwz2 = ieo.d;
            dlm dlm2 = ieu.a;
            hwz hwz3 = ieo.e;
            return new hyq(a, "\u0001\n\u0000\u0001\u0001\n\n\u0002\u0000\u0000\u00012\u0002\u1007\u0000\u0003\u180c\u0002\u0004\u1004\u0003\u0005\u1004\u0004\u00062\u0007\u180c\u0005\b\u1007\u0006\t\u1007\u0007\n\u1007\u0001", new Object[]{"b", "c", object, "d", "f", hwz2, "g", "h", "m", dlm2, "i", hwz3, "j", "k", "e"});
        }
        if (n2 == 3) {
            return new iew();
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
        hym hym2 = l;
        object = hym2;
        if (hym2 == null) {
            synchronized (iew.class) {
                hym2 = l;
                object = hym2;
                if (hym2 == null) {
                    l = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

