/*
 * Decompiled with CFR 0.152.
 */
public final class ihf
extends hwv
implements hyg {
    public static final ihf a;
    private static volatile hym b;
    private hya c = hya.a;

    static {
        ihf ihf2;
        a = ihf2 = new ihf();
        hwv.z(ihf.class, ihf2);
    }

    private ihf() {
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
            object = ihe.a;
            return new hyq(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", object});
        }
        if (n2 == 3) {
            return new ihf();
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
            synchronized (ihf.class) {
                hym2 = b;
                object = hym2;
                if (hym2 == null) {
                    b = object = new hwq(a);
                }
            }
        }
        return object;
    }

    public final hya c() {
        hya hya2 = this.c;
        if (!hya2.b) {
            this.c = hya2.a();
        }
        return this.c;
    }
}

