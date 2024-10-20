/*
 * Decompiled with CFR 0.152.
 */
public final class ikn
extends hwv
implements hyg {
    public static final ikn a;
    private static volatile hym d;
    public int b;
    public String c = "";

    static {
        ikn ikn2;
        a = ikn2 = new ikn();
        hwv.z(ikn.class, ikn2);
    }

    private ikn() {
    }

    public static /* synthetic */ void c(ikn ikn2) {
        ikn2.b |= 1;
        ikn2.c = "*";
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
            return new hyq(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[]{"b", "c"});
        }
        if (n2 == 3) {
            return new ikn();
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
            synchronized (ikn.class) {
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

