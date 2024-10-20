/*
 * Decompiled with CFR 0.152.
 */
public final class kfn
extends hwv
implements hyg {
    public static final kfn a;
    private static volatile hym i;
    public int b;
    public long c;
    public kdo d;
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    private byte j = (byte)2;

    static {
        kfn kfn2;
        a = kfn2 = new kfn();
        hwv.z(kfn.class, kfn2);
    }

    private kfn() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.j;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001\u1003\u0000\u0002\u1409\u0001\u0003\u1007\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u1003\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (n2 == 3) {
            return new kfn();
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
            this.j = by2;
            return null;
        }
        hym hym2 = i;
        object = hym2;
        if (hym2 == null) {
            synchronized (kfn.class) {
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

