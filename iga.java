/*
 * Decompiled with CFR 0.152.
 */
public final class iga
extends hws
implements hwt {
    public static final iga a;
    private static volatile hym j;
    public int b;
    public ifq c;
    public ifz d;
    public ifl e;
    public ifj f;
    public String g = "";
    public idz h;
    public ifs i;
    private igp k;
    private ifv l;
    private ifo m;
    private ige n;
    private igd o;
    private byte p = (byte)2;

    static {
        iga iga2;
        a = iga2 = new iga();
        hwv.z(iga.class, iga2);
    }

    private iga() {
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
            return new hyq(a, "\u0001\f\u0000\u0001\u0001\u001c\f\u0000\u0000\u0005\u0001\u1009\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0005\u1009\u0005\u0006\u1008\u0007\u0007\u1409\b\t\u1009\u000f\n\u1009\u0010\r\u1009\u0014\u0012\u1409\u0018\u001a\u1409\u001a\u001c\u1009\u001b", new Object[]{"b", "c", "d", "e", "f", "g", "k", "l", "m", "h", "i", "n", "o"});
        }
        if (n2 == 3) {
            return new iga();
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
            this.p = by2;
            return null;
        }
        hym hym2 = j;
        object = hym2;
        if (hym2 == null) {
            synchronized (iga.class) {
                hym2 = j;
                object = hym2;
                if (hym2 == null) {
                    j = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

