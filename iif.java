/*
 * Decompiled with CFR 0.152.
 */
public final class iif
extends hwv
implements hyg {
    public static final iif a;
    public static final gpm n;
    private static volatile hym o;
    public int b;
    public int c = 0;
    public Object d;
    public int e = 0;
    public Object f;
    public String g = "";
    public iij h;
    public int i = 8;
    public String j;
    public String k;
    public int l;
    public boolean m;
    private byte p = (byte)2;

    static {
        iif iif2;
        a = iif2 = new iif();
        hwv.z(iif.class, iif2);
        n = hwv.F(ida.a, iif2, iif2, 27801516, hzm.k);
    }

    private iif() {
        Object object = hyp.a;
        object = hww.a;
        this.j = "";
        this.k = "";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.p;
        }
        byte by2 = 1;
        if (n2 == 2) {
            object = ieo.s;
            return new hyq(a, "\u0001\u000b\u0002\u0001\u0001\u001c\u000b\u0000\u0000\u0001\u0001\u1008\u0000\u0003\u1008\r\u0004\u1008\u000e\u0005\u1004\u000f\u00073\u0000\b3\u0001\n\u180c\b\r\u1409\u0003\u0010\u1007\u0014\u001b3\u0000\u001c3\u0001", new Object[]{"d", "c", "f", "e", "b", "g", "j", "k", "l", "i", object, "h", "m"});
        }
        if (n2 == 3) {
            return new iif();
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
            this.p = by2;
            return null;
        }
        hym hym2 = o;
        object = hym2;
        if (hym2 == null) {
            synchronized (iif.class) {
                hym2 = o;
                object = hym2;
                if (hym2 == null) {
                    o = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

