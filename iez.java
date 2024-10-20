/*
 * Decompiled with CFR 0.152.
 */
public final class iez
extends hws
implements hwt {
    public static final iez a;
    private static volatile hym l;
    public int b;
    public ien c;
    public ier d;
    public iey e;
    public iet f;
    public String g = "";
    public idr h;
    public idt i;
    public igi j;
    public iem k;
    private idv m;
    private byte n = (byte)2;

    static {
        iez iez2;
        a = iez2 = new iez();
        hwv.z(iez.class, iez2);
    }

    private iez() {
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
            return new hyq(a, "\u0001\n\u0000\u0001\u0001\u0014\n\u0000\u0000\u0002\u0001\u1009\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0006\u1009\u0005\u0007\u1008\u0006\t\u1009\b\n\u1009\t\f\u1009\u000b\u0011\u1009\n\u0014\u1009\u0012", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "m", "j", "k"});
        }
        if (n2 == 3) {
            return new iez();
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
            this.n = by2;
            return null;
        }
        hym hym2 = l;
        object = hym2;
        if (hym2 == null) {
            synchronized (iez.class) {
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

