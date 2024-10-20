/*
 * Decompiled with CFR 0.152.
 */
public final class ies
extends hwv
implements hyg {
    public static final ies a;
    private static volatile hym c;
    public hxk b = hyp.b;
    private int d;
    private boolean e;

    static {
        ies ies2;
        a = ies2 = new ies();
        hwv.z(ies.class, ies2);
    }

    private ies() {
    }

    public static /* synthetic */ void c(ies ies2) {
        ies2.d |= 1;
        ies2.e = true;
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
            return new hyq(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u1007\u0000\u0003\u001a", new Object[]{"d", "e", "b"});
        }
        if (n2 == 3) {
            return new ies();
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
            synchronized (ies.class) {
                hym2 = c;
                object = hym2;
                if (hym2 == null) {
                    c = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

