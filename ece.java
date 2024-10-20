/*
 * Decompiled with CFR 0.152.
 */
public final class ece
extends hwv
implements hyg {
    public static final ece a;
    private static volatile hym o;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public long f;
    public long g;
    public int h;
    public efn i;
    public int j;
    public eip k;
    public long l;
    public int m;
    public hxk n;
    private byte p = (byte)2;

    static {
        ece ece2;
        a = ece2 = new ece();
        hwv.z(ece.class, ece2);
    }

    private ece() {
        this.n = hyp.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.p;
        }
        byte by2 = 1;
        if (n2 == 2) {
            hwz hwz2 = eck.b;
            hwz hwz3 = dpn.r;
            object = dpn.j;
            hwz hwz4 = eck.f;
            return new hyq(a, "\u0001\u0010\u0001\u0001\u0001\u00cd\u0010\u0000\u0001\u0001\u0001\u180c\u0000d\u1002\u0001e\u1002\u0002f\u180c\u0003g\u1009\u0004i\u180c\u0005j\u1009\u0006k\u1002\u0007l\u180c\bm\u001b\u00c8\u043c\u0000\u00c9<\u0000\u00ca<\u0000\u00cb<\u0000\u00cc<\u0000\u00cd<\u0000", new Object[]{"d", "c", "b", "e", hwz2, "f", "g", "h", hwz3, "i", "j", object, "k", "l", "m", hwz4, "n", eln.class, eam.class, eao.class, ecw.class, dzx.class, eaw.class, ebk.class});
        }
        if (n2 == 3) {
            return new ece();
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
            this.p = by2;
            return null;
        }
        hym hym2 = o;
        object = hym2;
        if (hym2 == null) {
            synchronized (ece.class) {
                hym2 = o;
                object = hym2;
                if (hym2 == null) {
                    o = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

