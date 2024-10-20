/*
 * Decompiled with CFR 0.152.
 */
public final class bou
extends hwv
implements hyg {
    public static final bou a;
    private static volatile hym g;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public bot f;
    private hli h;
    private byte i = (byte)2;

    static {
        bou bou2;
        a = bou2 = new bou();
        hwv.z(bou.class, bou2);
    }

    private bou() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.i;
        }
        byte by2 = 1;
        if (n2 == 2) {
            object = bqk.b;
            return new hyq(a, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001\u180c\u0000\u0003\u1009\u0003\u00045\u0000\u0005;\u0000\u0006\u1409\u0002", new Object[]{"d", "c", "b", "e", object, "f", "h"});
        }
        if (n2 == 3) {
            return new bou();
        }
        if (n2 == 4) {
            return new hwp(a);
        }
        if (n2 == 5) {
            return a;
        }
        if (n2 != 6) {
            if (object == null) {
                by2 = 0;
            }
            this.i = by2;
            return null;
        }
        hym hym2 = g;
        object = hym2;
        if (hym2 == null) {
            synchronized (bou.class) {
                hym2 = g;
                object = hym2;
                if (hym2 == null) {
                    g = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

