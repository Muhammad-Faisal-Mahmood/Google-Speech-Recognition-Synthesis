/*
 * Decompiled with CFR 0.152.
 */
public final class hqp
extends hwv
implements hyg {
    public static final hqp a;
    private static volatile hym n;
    public int b;
    public int c = 0;
    public Object d;
    public int e = 0;
    public Object f;
    public String g = "";
    public boolean h;
    public hxk i = hyp.b;
    public hvu j;
    public int k;
    public long l;
    public hvu m;

    static {
        hqp hqp2;
        a = hqp2 = new hqp();
        hwv.z(hqp.class, hqp2);
    }

    private hqp() {
        hww hww2 = hww.a;
        this.j = hvu.b;
        this.m = hvu.b;
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
            object = hqj.d;
            return new hyq(a, "\u0001\u000b\u0002\u0001\u0001\u000f\u000b\u0000\u0001\u0000\u0001\u1008\u0000\u00027\u0000\u0003\u001a\u0005\u100a\u0002\u0007;\u0001\t\u180c\u0005\n;\u0001\u000b\u1007\u0001\r\u100e\u0007\u000e\u100a\b\u000f5\u0000", new Object[]{"d", "c", "f", "e", "b", "g", "i", "j", "k", object, "h", "l", "m"});
        }
        if (n2 == 3) {
            return new hqp();
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
        hym hym2 = n;
        object = hym2;
        if (hym2 == null) {
            synchronized (hqp.class) {
                hym2 = n;
                object = hym2;
                if (hym2 == null) {
                    n = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

