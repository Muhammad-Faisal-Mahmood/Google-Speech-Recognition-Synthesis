/*
 * Decompiled with CFR 0.152.
 */
public final class kef
extends hwv
implements hyg {
    public static final kef a;
    private static volatile hym x;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public boolean r;
    public int s;
    public boolean t;
    public ked u;
    public ked v;
    public hya w = hya.a;

    static {
        kef kef2;
        a = kef2 = new kef();
        hwv.z(kef.class, kef2);
    }

    private kef() {
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
            dlm dlm2 = kee.a;
            object = kei.b;
            return new hyq(a, "\u0001\u0015\u0000\u0001\u0001\u0019\u0015\u0001\u0000\u0000\u0001\u1002\u0000\u0003\u1002\u0004\u0004\u1002\u0007\u0005\u1002\t\t\u1002\n\n\u1002\u000f\u000b\u1007\u0010\f\u1009\u0013\r\u1009\u0014\u000e\u1002\u0001\u000f\u1002\u0002\u00102\u0011\u1002\u0005\u0012\u1002\b\u0013\u1002\u0006\u0014\u1002\u000b\u0015\u1002\f\u0016\u180c\u0011\u0017\u1002\r\u0018\u1002\u000e\u0019\u1007\u0012", new Object[]{"b", "c", "f", "i", "k", "l", "q", "r", "u", "v", "d", "e", "w", dlm2, "g", "j", "h", "m", "n", "s", object, "o", "p", "t"});
        }
        if (n2 == 3) {
            return new kef();
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
            synchronized (kef.class) {
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

