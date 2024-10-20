/*
 * Decompiled with CFR 0.152.
 */
public final class fmg
extends hwv
implements hyg {
    public static final fmg a;
    private static volatile hym f;
    public int b;
    public boolean c = true;
    public String d = "";
    public hxk e = hyp.b;

    static {
        fmg fmg2;
        a = fmg2 = new fmg();
        hwv.z(fmg.class, fmg2);
    }

    private fmg() {
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
            return new hyq(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1007\u0000\u0002\u1008\u0001\u0003\u001a", new Object[]{"b", "c", "d", "e"});
        }
        if (n2 == 3) {
            return new fmg();
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
            synchronized (fmg.class) {
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

