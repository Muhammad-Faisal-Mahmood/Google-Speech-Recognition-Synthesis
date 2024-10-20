/*
 * Decompiled with CFR 0.152.
 */
public final class dpm
extends hwv
implements hyg {
    public static final dpm a;
    private static volatile hym d;
    public int b;
    public String c = "";
    private int e;

    static {
        dpm dpm2;
        a = dpm2 = new dpm();
        hwv.z(dpm.class, dpm2);
    }

    private dpm() {
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
            object = dpn.a;
            return new hyq(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1008\u0001", new Object[]{"e", "b", object, "c"});
        }
        if (n2 == 3) {
            return new dpm();
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
            synchronized (dpm.class) {
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

