/*
 * Decompiled with CFR 0.152.
 */
public final class ctx
extends hwv
implements hyg {
    public static final ctx a;
    private static volatile hym c;
    public hya b = hya.a;

    static {
        ctx ctx2;
        a = ctx2 = new ctx();
        hwv.z(ctx.class, ctx2);
    }

    private ctx() {
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
            object = ctw.a;
            return new hyq(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", object});
        }
        if (n2 == 3) {
            return new ctx();
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
        hym hym2 = c;
        object = hym2;
        if (hym2 == null) {
            synchronized (ctx.class) {
                hym2 = c;
                object = hym2;
                if (hym2 == null) {
                    c = object = new hwq(a);
                }
            }
        }
        return object;
    }

    public final hya b() {
        hya hya2 = this.b;
        if (!hya2.b) {
            this.b = hya2.a();
        }
        return this.b;
    }
}

