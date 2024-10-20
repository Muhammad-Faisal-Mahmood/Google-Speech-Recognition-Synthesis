/*
 * Decompiled with CFR 0.152.
 */
public final class kdx
extends hwv
implements hyg {
    private static volatile hym A;
    public static final kdx a;
    private byte B = (byte)2;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public ker l;
    public int m;
    public kdv n;
    public int o;
    public long p;
    public int q;
    public int r;
    public int s;
    public int t;
    public String u;
    public hxe v;
    public String w;
    public kdz x;
    public kdu y;
    public long z;

    static {
        kdx kdx2;
        a = kdx2 = new kdx();
        hwv.z(kdx.class, kdx2);
    }

    private kdx() {
        Object[] objectArray = hyp.a;
        this.u = "";
        this.v = hxw.a;
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
            return this.B;
        }
        byte by2 = 1;
        if (n2 == 2) {
            hwz hwz2 = iko.q;
            object = iko.r;
            hwz hwz3 = iko.p;
            hwz hwz4 = iko.n;
            hwz hwz5 = iko.o;
            return new hyq(a, "\u0001\u0018\u0000\u0001\u0001\u001c\u0018\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1004\u0003\u0004\u1004\u0004\u0005\u1004\u0005\u0006\u100b\u0006\u0007\u100b\u0007\b\u180c\b\n\u1009\t\u000b\u1009\u000b\r\u1002\u000e\u000e\u180c\u000f\u000f\u180c\u0010\u0010\u1004\u0012\u0011\u1008\u0013\u0013\u1004\u0011\u0014\u1008\u0015\u0015(\u0016\u1009\u0016\u0018\u180c\n\u0019\u1008\u0002\u001a\u1009\u0017\u001b\u180c\f\u001c\u1002\u0018", new Object[]{"b", "c", "d", "f", "g", "h", "i", "j", "k", hwz2, "l", "n", "p", "q", object, "r", hwz3, "t", "u", "s", "w", "v", "x", "m", hwz4, "e", "y", "o", hwz5, "z"});
        }
        if (n2 == 3) {
            return new kdx();
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
            this.B = by2;
            return null;
        }
        hym hym2 = A;
        object = hym2;
        if (hym2 == null) {
            synchronized (kdx.class) {
                hym2 = A;
                object = hym2;
                if (hym2 == null) {
                    A = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

