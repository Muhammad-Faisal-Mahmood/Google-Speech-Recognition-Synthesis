/*
 * Decompiled with CFR 0.152.
 */
public final class igx
extends hws
implements hwt {
    public static final igx a;
    private static volatile hym i;
    public int b;
    public boolean c = true;
    public boolean d;
    public igv e;
    public ihi f;
    public int g;
    public idr h;
    private ifq j;
    private byte k = (byte)2;

    static {
        igx igx2;
        a = igx2 = new igx();
        hwv.z(igx.class, igx2);
    }

    private igx() {
    }

    public static /* synthetic */ void G(igx igx2) {
        igx2.b |= 1;
        igx2.c = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.k;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0007\u0000\u0001\u0002\u0014\u0007\u0000\u0000\u0001\u0002\u1007\u0000\u0003\u1007\u0001\u0004\u1009\u0003\u0005\u1409\u0005\t\u1004\u0007\n\u1009\b\u0014\u1009\u0010", new Object[]{"b", "c", "d", "e", "f", "g", "h", "j"});
        }
        if (n2 == 3) {
            return new igx();
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
            this.k = by2;
            return null;
        }
        hym hym2 = i;
        object = hym2;
        if (hym2 == null) {
            synchronized (igx.class) {
                hym2 = i;
                object = hym2;
                if (hym2 == null) {
                    i = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

