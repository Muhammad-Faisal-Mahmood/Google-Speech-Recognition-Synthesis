/*
 * Decompiled with CFR 0.152.
 */
public final class cth
extends hwv
implements hyg {
    public static final cth a;
    private static volatile hym x;
    public int b;
    public ctg c;
    public String d = "";
    public String e = "";
    public int f;
    public hvi g;
    public hvi h;
    public hvi i;
    public int j;
    public long k;
    public long l;
    public ctj m;
    public boolean n;
    public hxk o;
    public int p;
    public hxk q;
    public int r;
    public long s;
    public String t;
    public hxk u;
    public kfr v;
    public String w;

    static {
        cth cth2;
        a = cth2 = new cth();
        hwv.z(cth.class, cth2);
    }

    private cth() {
        hyp hyp2 = hyp.b;
        this.o = hyp2;
        this.q = hyp2;
        this.t = "";
        this.u = hyp2;
        this.w = "";
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
            hwz hwz2 = bqk.p;
            object = dpn.b;
            return new hyq(a, "\u0001\u0015\u0000\u0001\u0001\uf98e\u76a4\u0015\u0000\u0003\u0000\u0001\u1008\u0001\u0002\u001b\u0003\u1002\t\u0006\u1008\u0002\n\u1004\u0003\u000b\u1002\n\f\u180c\b\r\u1009\u000b\u000e\u1007\f\u0010\u1004\r\u0011\u001b\u0013\u180c\u000e\u0014\u1009\u0004\u0017\u1002\u000f\u0019\u001a\u001a\u1008\u0010\u001b\u1009\u0005\u001c\u1009\u0011\u001d\u1009\u0006\u03e8\u1008\u0013\uf98e\u76a4\u1009\u0000", new Object[]{"b", "d", "o", ctf.class, "k", "e", "f", "l", "j", hwz2, "m", "n", "p", "q", ctk.class, "r", object, "g", "s", "u", "t", "h", "v", "i", "w", "c"});
        }
        if (n2 == 3) {
            return new cth();
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
        hym hym2 = x;
        object = hym2;
        if (hym2 == null) {
            synchronized (cth.class) {
                hym2 = x;
                object = hym2;
                if (hym2 == null) {
                    x = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

