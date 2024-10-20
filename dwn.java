/*
 * Decompiled with CFR 0.152.
 */
public final class dwn
extends hwv
implements hyg {
    public static final dwn a;
    private static volatile hym h;
    public int b;
    public String c = "";
    public hvu d = hvu.b;
    public String e = "";
    public long f;
    public hxk g = hyp.b;

    static {
        dwn dwn2;
        a = dwn2 = new dwn();
        hwv.z(dwn.class, dwn2);
    }

    private dwn() {
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
            return new hyq(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u100a\u0001\u0003\u1008\u0002\u0004\u1002\u0003\u0005\u001b", new Object[]{"b", "c", "d", "e", "f", "g", dwo.class});
        }
        if (n2 == 3) {
            return new dwn();
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
        hym hym2 = h;
        object = hym2;
        if (hym2 == null) {
            synchronized (dwn.class) {
                hym2 = h;
                object = hym2;
                if (hym2 == null) {
                    h = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

