/*
 * Decompiled with CFR 0.152.
 */
public final class fmf
extends hwv
implements hyg {
    public static final fmf a;
    private static volatile hym e;
    public int b;
    public fdl c;
    public String d = "";

    static {
        fmf fmf2;
        a = fmf2 = new fmf();
        hwv.z(fmf.class, fmf2);
    }

    private fmf() {
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
            return new hyq(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001", new Object[]{"b", "c", "d"});
        }
        if (n2 == 3) {
            return new fmf();
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
            synchronized (fmf.class) {
                hym2 = e;
                object = hym2;
                if (hym2 == null) {
                    e = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

