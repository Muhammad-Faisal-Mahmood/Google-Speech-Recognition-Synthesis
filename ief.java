/*
 * Decompiled with CFR 0.152.
 */
public final class ief
extends hwv
implements hyg {
    public static final ief a;
    public static final gpm h;
    private static volatile hym i;
    public int b;
    public String c = "";
    public hxk d = hyp.b;
    public String e = "";
    public String f = "";
    public boolean g;

    static {
        ief ief2;
        a = ief2 = new ief();
        hwv.z(ief.class, ief2);
        h = hwv.F(iga.a, ief2, ief2, 420374974, hzm.k);
    }

    private ief() {
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
            return new hyq(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u1008\u0001\u0004\u1008\u0002\u0005\u1007\u0003", new Object[]{"b", "c", "d", igt.class, "e", "f", "g"});
        }
        if (n2 == 3) {
            return new ief();
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
            synchronized (ief.class) {
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

