/*
 * Decompiled with CFR 0.152.
 */
public final class ihc
extends hwv
implements hyg {
    public static final ihc a;
    private static volatile hym f;
    public int b;
    public int c = 0;
    public Object d;
    public String e = "";

    static {
        ihc ihc2;
        a = ihc2 = new ihc();
        hwv.z(ihc.class, ihc2);
    }

    private ihc() {
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
            return new hyq(a, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"d", "c", "b", "e", ihb.class, igz.class});
        }
        if (n2 == 3) {
            return new ihc();
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
        hym hym2 = f;
        object = hym2;
        if (hym2 == null) {
            synchronized (ihc.class) {
                hym2 = f;
                object = hym2;
                if (hym2 == null) {
                    f = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

