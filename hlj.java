/*
 * Decompiled with CFR 0.152.
 */
public final class hlj
extends hwv
implements hyg {
    public static final hlj a;
    private static volatile hym b;
    private int c;
    private hli d;
    private String e = "";
    private int f;
    private hlo g;
    private byte h = (byte)2;

    static {
        hlj hlj2;
        a = hlj2 = new hlj();
        hwv.z(hlj.class, hlj2);
    }

    private hlj() {
        Object[] objectArray = hyp.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.h;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0004\u0001\u1509\u0000\u0002\u1508\u0001\u0003\u1504\u0002\b\u1409\n", new Object[]{"c", "d", "e", "f", "g"});
        }
        if (n2 == 3) {
            return new hlj();
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
            this.h = by2;
            return null;
        }
        hym hym2 = b;
        object = hym2;
        if (hym2 == null) {
            synchronized (hlj.class) {
                hym2 = b;
                object = hym2;
                if (hym2 == null) {
                    b = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

