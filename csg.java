/*
 * Decompiled with CFR 0.152.
 */
public final class csg
extends hwv
implements hyg {
    public static final csg a;
    private static volatile hym o;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public int f;
    public int g;
    public hxk h;
    public long i;
    public String j;
    public hxk k;
    public hvi l;
    public hvi m;
    public String n;

    static {
        csg csg2;
        a = csg2 = new csg();
        hwv.z(csg.class, csg2);
    }

    private csg() {
        hyp hyp2 = hyp.b;
        this.h = hyp2;
        this.j = "";
        this.k = hyp2;
        this.n = "";
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
            object = bqk.i;
            return new hyq(a, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0002\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u1008\u0001\u0004\u1004\u0003\u0005\u180c\u0004\u0006\u1008\u0002\b\u1002\u0005\n\u001a\u000b\u1009\u0007\f\u1008\u0006\r\u1009\b\u000f\u1008\n", new Object[]{"b", "c", "h", csf.class, "d", "f", "g", object, "e", "i", "k", "l", "j", "m", "n"});
        }
        if (n2 == 3) {
            return new csg();
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
        hym hym2 = o;
        object = hym2;
        if (hym2 == null) {
            synchronized (csg.class) {
                hym2 = o;
                object = hym2;
                if (hym2 == null) {
                    o = object = new hwq(a);
                }
            }
        }
        return object;
    }

    public final void b() {
        hxk hxk2 = this.h;
        if (!hxk2.c()) {
            this.h = hwv.s(hxk2);
        }
    }
}

