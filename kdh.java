/*
 * Decompiled with CFR 0.152.
 */
public final class kdh
extends hwv
implements hyg {
    public static final kdh a;
    private static volatile hym f;
    public int b;
    public hxk c;
    public hxk d;
    public kdg e;

    static {
        kdh kdh2;
        a = kdh2 = new kdh();
        hwv.z(kdh.class, kdh2);
    }

    private kdh() {
        hyp hyp2 = hyp.b;
        this.c = hyp2;
        this.d = hyp2;
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
            return new hyq(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003\u1009\u0000", new Object[]{"b", "c", kdk.class, "d", kdf.class, "e"});
        }
        if (n2 == 3) {
            return new kdh();
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
            synchronized (kdh.class) {
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

