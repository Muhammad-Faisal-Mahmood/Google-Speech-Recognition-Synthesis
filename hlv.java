/*
 * Decompiled with CFR 0.152.
 */
public final class hlv
extends hwv
implements hyg {
    public static final hlv a;
    private static volatile hym g;
    public int b;
    public int c;
    public hlq d;
    public int e;
    public int f;

    static {
        hlv hlv2;
        a = hlv2 = new hlv();
        hwv.z(hlv.class, hlv2);
    }

    private hlv() {
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
            object = fhn.p;
            hwz hwz2 = fhn.o;
            return new hyq(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1009\u0001\u0003\u180c\u0002\u0004\u1004\u0003", new Object[]{"b", "c", object, "d", "e", hwz2, "f"});
        }
        if (n2 == 3) {
            return new hlv();
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
        hym hym2 = g;
        object = hym2;
        if (hym2 == null) {
            synchronized (hlv.class) {
                hym2 = g;
                object = hym2;
                if (hym2 == null) {
                    g = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

