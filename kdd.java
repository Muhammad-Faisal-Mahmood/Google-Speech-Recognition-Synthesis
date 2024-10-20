/*
 * Decompiled with CFR 0.152.
 */
public final class kdd
extends hwv
implements hyg {
    public static final kdd a;
    private static volatile hym m;
    public int b;
    public int c;
    public long d;
    public String e = "";
    public String f = "";
    public kdo g;
    public int h;
    public long i;
    public kdm j;
    public long k;
    public long l;
    private byte n = (byte)2;

    static {
        kdd kdd2;
        a = kdd2 = new kdd();
        hwv.z(kdd.class, kdd2);
    }

    private kdd() {
        Object[] objectArray = hyp.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.n;
        }
        byte by2 = 1;
        if (n2 == 2) {
            object = iko.j;
            return new hyq(a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0001\u0001\u180c\u0000\u0002\u180c\u0005\u0003\u1002\u0006\u0006\u1009\u0007\u0007\u1002\b\b\u1005\u0001\t\u1008\u0002\n\u1008\u0003\u000b\u1409\u0004\f\u1002\t", new Object[]{"b", "c", object, "h", object, "i", "j", "k", "d", "e", "f", "g", "l"});
        }
        if (n2 == 3) {
            return new kdd();
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
            this.n = by2;
            return null;
        }
        hym hym2 = m;
        object = hym2;
        if (hym2 == null) {
            synchronized (kdd.class) {
                hym2 = m;
                object = hym2;
                if (hym2 == null) {
                    m = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

