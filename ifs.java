/*
 * Decompiled with CFR 0.152.
 */
public final class ifs
extends hws
implements hwt {
    public static final ifs a;
    private static volatile hym h;
    public int b;
    public hxk c;
    public int d;
    public hxk e;
    public int f;
    public int g;
    private byte i = (byte)2;

    static {
        ifs ifs2;
        a = ifs2 = new ifs();
        hwv.z(ifs.class, ifs2);
    }

    private ifs() {
        hyp hyp2 = hyp.b;
        this.c = hyp2;
        this.e = hyp2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.i;
        }
        byte by2 = 1;
        if (n2 == 2) {
            object = ieo.j;
            hwz hwz2 = ieo.i;
            hwz hwz3 = ieo.h;
            return new hyq(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0001\u0001\u041b\u0002\u180c\u0000\u0003\u180c\u0001\u0004\u001a\u0005\u180c\u0002", new Object[]{"b", "c", ift.class, "d", object, "f", hwz2, "e", "g", hwz3});
        }
        if (n2 == 3) {
            return new ifs();
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
            this.i = by2;
            return null;
        }
        hym hym2 = h;
        object = hym2;
        if (hym2 == null) {
            synchronized (ifs.class) {
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

