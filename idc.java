/*
 * Decompiled with CFR 0.152.
 */
public final class idc
extends hwv
implements hyg {
    public static final idc a;
    public static final gpm e;
    private static volatile hym f;
    public int b;
    public icw c;
    public hxk d;
    private byte g = (byte)2;

    static {
        idc idc2;
        a = idc2 = new idc();
        hwv.z(idc.class, idc2);
        e = hwv.F(ida.a, idc2, idc2, 293000, hzm.k);
    }

    private idc() {
        this.d = hyp.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.g;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0001\u0000\u0002\u1009\u0000\u0004\u001b", new Object[]{"b", "c", "d", icw.class});
        }
        if (n2 == 3) {
            return new idc();
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
            this.g = by2;
            return null;
        }
        hym hym2 = f;
        object = hym2;
        if (hym2 == null) {
            synchronized (idc.class) {
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

