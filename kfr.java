/*
 * Decompiled with CFR 0.152.
 */
public final class kfr
extends hwv
implements hyg {
    public static final kfr a;
    private static volatile hym d;
    public hxk b = hyp.b;
    public hxb c = hww.a;

    static {
        kfr kfr2;
        a = kfr2 = new kfr();
        hwv.z(kfr.class, kfr2);
    }

    private kfr() {
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
            return new hyq(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002'", new Object[]{"b", kfq.class, "c"});
        }
        if (n2 == 3) {
            return new kfr();
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
        hym hym2 = d;
        object = hym2;
        if (hym2 == null) {
            synchronized (kfr.class) {
                hym2 = d;
                object = hym2;
                if (hym2 == null) {
                    d = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

