/*
 * Decompiled with CFR 0.152.
 */
public final class fan
extends hwv
implements hyg {
    public static final fan a;
    private static volatile hym i;
    public int b;
    public long c;
    public String d = "";
    public String e = "";
    public long f;
    public String g = "";
    public hxk h = hyp.b;

    static {
        fan fan2;
        a = fan2 = new fan();
        hwv.z(fan.class, fan2);
    }

    private fan() {
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
            return new hyq(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1002\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1002\u0003\u0005\u1008\u0004\u0006\u001b", new Object[]{"b", "c", "d", "e", "f", "g", "h", fal.class});
        }
        if (n2 == 3) {
            return new fan();
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
        hym hym2 = i;
        object = hym2;
        if (hym2 == null) {
            synchronized (fan.class) {
                hym2 = i;
                object = hym2;
                if (hym2 == null) {
                    i = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

