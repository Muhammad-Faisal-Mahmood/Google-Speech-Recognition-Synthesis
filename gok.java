/*
 * Decompiled with CFR 0.152.
 */
public final class gok
extends hwv
implements hyg {
    public static final gok a;
    private static volatile hym n;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public long f;
    public int g;
    public long h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public boolean m;

    static {
        gok gok2;
        a = gok2 = new gok();
        hwv.z(gok.class, gok2);
    }

    private gok() {
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
            object = fhn.l;
            return new hyq(a, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1002\u0003\u0005\u1002\u0005\u0006\u1007\b\u0007\u1004\u0007\b\u180c\t\t\u1007\n\n\u1004\u0004\u000b\u1004\u0006", new Object[]{"b", "c", "d", "e", "f", "h", "k", "j", "l", object, "m", "g", "i"});
        }
        if (n2 == 3) {
            return new gok();
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
            synchronized (gok.class) {
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

