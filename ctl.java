/*
 * Decompiled with CFR 0.152.
 */
public final class ctl
extends hwv
implements hyg {
    public static final ctl a;
    private static volatile hym i;
    public int b;
    public ctq c;
    public long d;
    public String e = "";
    public int f;
    public long g;
    public long h;

    static {
        ctl ctl2;
        a = ctl2 = new ctl();
        hwv.z(ctl.class, ctl2);
    }

    private ctl() {
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
            return new hyq(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1002\u0001\u0003\u1004\u0003\u0004\u1002\u0004\u0005\u1002\u0005\u0006\u1008\u0002", new Object[]{"b", "c", "d", "f", "g", "h", "e"});
        }
        if (n2 == 3) {
            return new ctl();
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
            synchronized (ctl.class) {
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

