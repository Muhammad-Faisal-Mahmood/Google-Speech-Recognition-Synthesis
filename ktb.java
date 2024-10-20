/*
 * Decompiled with CFR 0.152.
 */
public final class ktb
extends hwv
implements hyg {
    public static final ktb a;
    private static volatile hym b;
    private hya c = hya.a;

    static {
        ktb ktb2;
        a = ktb2 = new ktb();
        hwv.z(ktb.class, ktb2);
    }

    private ktb() {
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
            object = kta.a;
            return new hyq(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", object});
        }
        if (n2 == 3) {
            return new ktb();
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
        hym hym2 = b;
        object = hym2;
        if (hym2 == null) {
            synchronized (ktb.class) {
                hym2 = b;
                object = hym2;
                if (hym2 == null) {
                    b = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

