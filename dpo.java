/*
 * Decompiled with CFR 0.152.
 */
public final class dpo
extends hwv
implements hyg {
    public static final dpo a;
    private static volatile hym e;
    public String b = "";
    public hxk c = hyp.b;
    public boolean d;
    private int f;

    static {
        dpo dpo2;
        a = dpo2 = new dpo();
        hwv.z(dpo.class, dpo2);
    }

    private dpo() {
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
            return new hyq(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u1007\u0001", new Object[]{"f", "b", "c", dpm.class, "d"});
        }
        if (n2 == 3) {
            return new dpo();
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
        hym hym2 = e;
        object = hym2;
        if (hym2 == null) {
            synchronized (dpo.class) {
                hym2 = e;
                object = hym2;
                if (hym2 == null) {
                    e = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

