/*
 * Decompiled with CFR 0.152.
 */
public final class ika
extends hwv
implements hyg {
    public static final ika a;
    private static volatile hym e;
    public int b;
    public float c = 1.0f;
    public hxk d = hyp.b;

    static {
        ika ika2;
        a = ika2 = new ika();
        hwv.z(ika.class, ika2);
    }

    private ika() {
        hww hww2 = hww.a;
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
            return new hyq(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u1001\u0000\u0003\u001b", new Object[]{"b", "c", "d", ijz.class});
        }
        if (n2 == 3) {
            return new ika();
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
            synchronized (ika.class) {
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

