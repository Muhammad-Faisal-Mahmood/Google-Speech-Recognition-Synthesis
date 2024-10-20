/*
 * Decompiled with CFR 0.152.
 */
public final class bub
extends hwv
implements hyg {
    public static final hxc a;
    public static final bub b;
    private static volatile hym p;
    public int c;
    public int d;
    public int e = 1;
    public String f;
    public int g;
    public int h;
    public String i;
    public hxb j;
    public hxk k;
    public float l;
    public float m;
    public int n;
    public String o;

    static {
        bub bub2;
        a = new dvg(1);
        b = bub2 = new bub();
        hwv.z(bub.class, bub2);
    }

    private bub() {
        Object[] objectArray = hyp.a;
        this.f = "";
        this.i = "";
        this.j = hww.a;
        this.k = hyp.b;
        this.o = "";
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
            hwz hwz2 = bqk.h;
            hwz hwz3 = bqk.c;
            hwz hwz4 = bqk.f;
            object = bqk.d;
            hwz hwz5 = bqk.g;
            hwz hwz6 = bqk.e;
            return new hyq(b, "\u0004\f\u0000\u0001\u0006*\f\u0000\u0002\u0000\u0006\u180c\u0000\r\u1008\u0004\u0010\u180c\u0006\u0013\u1008\u0007\u0015\u180c\u0005$\u081e%\u001b&\u180c\u0001'\u1001\t(\u1001\n)\u180c\u000b*\u1008\f", new Object[]{"c", "d", hwz2, "f", "h", hwz3, "i", "g", hwz4, "j", object, "k", bub.class, "e", hwz5, "l", "m", "n", hwz6, "o"});
        }
        if (n2 == 3) {
            return new bub();
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
        hym hym2 = p;
        object = hym2;
        if (hym2 == null) {
            synchronized (bub.class) {
                hym2 = p;
                object = hym2;
                if (hym2 == null) {
                    p = object = new hwq(b);
                }
            }
        }
        return object;
    }
}

