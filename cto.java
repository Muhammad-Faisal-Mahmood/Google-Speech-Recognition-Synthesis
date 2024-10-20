/*
 * Decompiled with CFR 0.152.
 */
public final class cto
extends hwv
implements hyg {
    public static final cto a;
    private static volatile hym e;
    public hya b = hya.a;
    public hya c = hya.a;
    public hxk d = hyp.b;

    static {
        cto cto2;
        a = cto2 = new cto();
        hwv.z(cto.class, cto2);
    }

    private cto() {
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
            object = ctm.a;
            dlm dlm2 = ctn.a;
            return new hyq(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0002\u0001\u0000\u00012\u00022\u0003\u001b", new Object[]{"b", object, "c", dlm2, "d", cth.class});
        }
        if (n2 == 3) {
            return new cto();
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
            synchronized (cto.class) {
                hym2 = e;
                object = hym2;
                if (hym2 == null) {
                    e = object = new hwq(a);
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

