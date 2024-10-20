/*
 * Decompiled with CFR 0.152.
 */
public final class hlc
extends hwv
implements hyg {
    public static final hlc a;
    private static volatile hym b;
    private hya c = hya.a;

    static {
        hlc hlc2;
        a = hlc2 = new hlc();
        hwv.z(hlc.class, hlc2);
    }

    private hlc() {
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
            object = hlb.a;
            return new hyq(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"c", object});
        }
        if (n2 == 3) {
            return new hlc();
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
            synchronized (hlc.class) {
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

