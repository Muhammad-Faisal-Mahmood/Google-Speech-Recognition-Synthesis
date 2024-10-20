/*
 * Decompiled with CFR 0.152.
 */
public final class icx
extends hwv
implements hyg {
    public static final icx a;
    public static final gpm h;
    private static volatile hym i;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    private String j;

    static {
        icx icx2;
        a = icx2 = new icx();
        hwv.z(icx.class, icx2);
        h = hwv.F(ida.a, icx2, icx2, 294000, hzm.k);
    }

    private icx() {
        Object[] objectArray = hyp.a;
        this.j = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
    }

    public static /* synthetic */ void c(icx icx2) {
        icx2.b |= 4;
        icx2.j = "Android";
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
            return new hyq(a, "\u0001\u0006\u0000\u0001\u0002\u0010\u0006\u0000\u0000\u0000\u0002\u1008\u0004\b\u1008\u0002\t\u1008\u0003\n\u1008\u0005\u000b\u1008\u0006\u0010\u1008\u000b", new Object[]{"b", "d", "j", "c", "e", "f", "g"});
        }
        if (n2 == 3) {
            return new icx();
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
        hym hym2 = i;
        object = hym2;
        if (hym2 == null) {
            synchronized (icx.class) {
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

