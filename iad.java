/*
 * Decompiled with CFR 0.152.
 */
public final class iad
extends hwv
implements hyg {
    private static volatile hym B;
    public static final iad a;
    public int A;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public String f = "";
    public int g;
    public String h = "";
    public String i = "";
    public long j;
    public long k;
    public long l;
    public long m;
    public float n;
    public boolean o;
    public int p;
    public String q = "";
    public long r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public int w;
    public boolean x;
    public boolean y;
    public iab z;

    static {
        iad iad2;
        a = iad2 = new iad();
        hwv.z(iad.class, iad2);
    }

    private iad() {
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
            return new hyq(a, "\u0004\u0019\u0000\u0001\u0001 \u0019\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0208\u0004\u0004\u0005\u0208\u0006\u0208\u0007\u0002\b\u0002\t\u0002\n\u0002\u000b\u0001\f\u0007\r\u0004\u000f\u0208\u0010\u0208\u0011\u0002\u0012\u0004\u0016\u0004\u0017\u0007\u001a\u0007\u001b\u0004\u001c\u0007\u001e\u0007\u001f\u1009\u0000 \f", new Object[]{"b", "c", "d", "e", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "f", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A"});
        }
        if (n2 == 3) {
            return new iad();
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
        hym hym2 = B;
        object = hym2;
        if (hym2 == null) {
            synchronized (iad.class) {
                hym2 = B;
                object = hym2;
                if (hym2 == null) {
                    B = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

