/*
 * Decompiled with CFR 0.152.
 */
public final class ifz
extends hws
implements hwt {
    public static final ifz a;
    private static volatile hym g;
    public int b = 0;
    public Object c;
    public int d;
    public hxk e;
    public String f = "";
    private int h;
    private byte i = (byte)2;

    static {
        ifz ifz2;
        a = ifz2 = new ifz();
        hwv.z(ifz.class, ifz2);
    }

    private ifz() {
        this.e = hyp.b;
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
            object = ieo.n;
            return new hyq(a, "\u0001\u0006\u0001\u0001\u0001\b\u0006\u0000\u0001\u0003\u0001\u043c\u0000\u0002\u043c\u0000\u0003\u180c\u0000\u0004\u043c\u0000\u0007\u001b\b\u1008\u0002", new Object[]{"c", "b", "h", ifm.class, ifw.class, "d", object, ify.class, "e", ifu.class, "f"});
        }
        if (n2 == 3) {
            return new ifz();
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
        hym hym2 = g;
        object = hym2;
        if (hym2 == null) {
            synchronized (ifz.class) {
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

