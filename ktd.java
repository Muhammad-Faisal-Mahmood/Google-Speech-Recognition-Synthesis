/*
 * Decompiled with CFR 0.152.
 */
public final class ktd
extends hwv
implements hyg {
    public static final ktd a;
    private static volatile hym b;
    private hya c = hya.a;
    private byte d = (byte)2;

    static {
        ktd ktd2;
        a = ktd2 = new ktd();
        hwv.z(ktd.class, ktd2);
    }

    private ktd() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.d;
        }
        byte by2 = 1;
        if (n2 == 2) {
            object = ktc.a;
            return new hyq(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0432", new Object[]{"c", object});
        }
        if (n2 == 3) {
            return new ktd();
        }
        if (n2 == 4) {
            return new hwp(a);
        }
        if (n2 == 5) {
            return a;
        }
        if (n2 != 6) {
            if (object == null) {
                by2 = 0;
            }
            this.d = by2;
            return null;
        }
        hym hym2 = b;
        object = hym2;
        if (hym2 == null) {
            synchronized (ktd.class) {
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

