/*
 * Decompiled with CFR 0.152.
 */
public final class fic
extends hwv
implements hyg {
    public static final fic a;
    private static volatile hym d;
    public int b = 0;
    public Object c;

    static {
        fic fic2;
        a = fic2 = new fic();
        hwv.z(fic.class, fic2);
    }

    private fic() {
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
            return new hyq(a, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001:\u0000\u00027\u0000\u00037\u0000", new Object[]{"c", "b"});
        }
        if (n2 == 3) {
            return new fic();
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
            synchronized (fic.class) {
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

