/*
 * Decompiled with CFR 0.152.
 */
public final class ffx
extends hwv
implements hyg {
    public static final ffx a;
    private static volatile hym g;
    public int b;
    public hxk c = hyp.b;
    public long d;
    public int e;
    public few f;

    static {
        ffx ffx2;
        a = ffx2 = new ffx();
        hwv.z(ffx.class, ffx2);
    }

    private ffx() {
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
            object = eck.q;
            return new hyq(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001a\u0002\u1002\u0000\u0003\u180c\u0001\u0004\u1009\u0002", new Object[]{"b", "c", "d", "e", object, "f"});
        }
        if (n2 == 3) {
            return new ffx();
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
        hym hym2 = g;
        object = hym2;
        if (hym2 == null) {
            synchronized (ffx.class) {
                hym2 = g;
                object = hym2;
                if (hym2 == null) {
                    g = object = new hwq(a);
                }
            }
        }
        return object;
    }

    public final void b() {
        hxk hxk2 = this.c;
        if (!hxk2.c()) {
            this.c = hwv.s(hxk2);
        }
    }
}

