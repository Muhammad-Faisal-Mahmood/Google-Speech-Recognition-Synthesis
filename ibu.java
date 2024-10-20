/*
 * Decompiled with CFR 0.152.
 */
public final class ibu
extends hwv
implements hyg {
    public static final ibu a;
    private static volatile hym d;
    public long b;
    public String c = "";
    private int e;
    private long f;
    private float g;
    private float h;
    private float i;
    private long j;
    private long k;
    private String l = "";
    private float m;
    private byte n = (byte)2;

    static {
        ibu ibu2;
        a = ibu2 = new ibu();
        hwv.z(ibu.class, ibu2);
    }

    private ibu() {
        Object[] objectArray = hxw.a;
        objectArray = hyp.a;
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
            return new hyq(a, "\u0001\n\u0000\u0001\u0006\u0010\n\u0000\u0000\n\u0006\u1502\u0000\u0007\u1502\u0001\b\u1501\u0004\t\u1501\u0002\n\u1501\u0003\u000b\u1502\u0005\f\u1502\u0006\r\u1508\u0007\u000e\u1508\b\u0010\u1501\n", new Object[]{"e", "b", "f", "i", "g", "h", "j", "k", "l", "c", "m"});
        }
        if (n2 == 3) {
            return new ibu();
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
        hym hym2 = d;
        object = hym2;
        if (hym2 == null) {
            synchronized (ibu.class) {
                hym2 = d;
                object = hym2;
                if (hym2 == null) {
                    d = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

