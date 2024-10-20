/*
 * Decompiled with CFR 0.152.
 */
public final class kec
extends hws
implements hwt {
    public static final kec a;
    private static volatile hym l;
    public int b;
    public String c = "";
    public long d;
    public String e = "";
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public int k;
    private byte m = (byte)2;

    static {
        kec kec2;
        a = kec2 = new kec();
        hwv.z(kec.class, kec2);
    }

    private kec() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.m;
        }
        byte by2 = 1;
        if (n2 == 2) {
            object = iko.u;
            return new hyq(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1005\u0003\u0003\u1005\u0004\u0004\u1002\t\u0005\u1002\n\u0006\u1002\f\u0007\u180c\r\b\u1005\u0001\t\u1008\u0002", new Object[]{"b", "c", "f", "g", "h", "i", "j", "k", object, "d", "e"});
        }
        if (n2 == 3) {
            return new kec();
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
            this.m = by2;
            return null;
        }
        hym hym2 = l;
        object = hym2;
        if (hym2 == null) {
            synchronized (kec.class) {
                hym2 = l;
                object = hym2;
                if (hym2 == null) {
                    l = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

