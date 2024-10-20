/*
 * Decompiled with CFR 0.152.
 */
public final class iey
extends hws
implements hwt {
    public static final iey a;
    private static volatile hym w;
    public int b;
    public int c;
    public ign d;
    public boolean e = true;
    public String f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public ies k;
    public iew l;
    public boolean m;
    public int n;
    public boolean o;
    public iep p;
    public String q;
    public boolean s;
    public boolean t;
    public iel u;
    public boolean v;
    private byte x = (byte)2;

    static {
        iey iey2;
        a = iey2 = new iey();
        hwv.z(iey.class, iey2);
    }

    private iey() {
        float[] fArray = hwn.a;
        this.f = "";
        this.i = true;
        this.q = "";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.x;
        }
        byte by2 = 1;
        if (n2 == 2) {
            object = hqj.n;
            hwz hwz2 = ieo.f;
            return new hyq(a, "\u0001\u0012\u0000\u0002\n\u03e7\u0012\u0000\u0000\u0001\n\u1007\t\r\u1008\u0010\u000f\u1007\u0012\u0010\u1007\u0013\u0011\u1007\u0014\u0012\u180c\u0016\u0013\u1009\u0017\u0014\u1007\u001a\u0016\u1409 \u0017\u1009\b\u0018\u1008!\u0019\u1007\"\u001a\u1007\u001c\u001b\u1009\u0018\u001f\u180c\u001b/\u1007(0\u1009)\u03e7\u1007+", new Object[]{"b", "c", "e", "f", "g", "h", "i", "j", object, "k", "m", "p", "d", "q", "s", "o", "l", "n", hwz2, "t", "u", "v"});
        }
        if (n2 == 3) {
            return new iey();
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
            this.x = by2;
            return null;
        }
        hym hym2 = w;
        object = hym2;
        if (hym2 == null) {
            synchronized (iey.class) {
                hym2 = w;
                object = hym2;
                if (hym2 == null) {
                    w = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

