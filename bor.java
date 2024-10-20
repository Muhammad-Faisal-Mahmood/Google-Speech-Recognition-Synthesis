/*
 * Decompiled with CFR 0.152.
 */
public final class bor
extends hwv
implements hyg {
    public static final bor a;
    private static volatile hym i;
    public int b;
    public bou c;
    public ibk d;
    public bos e;
    public long f;
    public long g;
    public int h;
    private byte j = (byte)2;

    static {
        bor bor2;
        a = bor2 = new bor();
        hwv.z(bor.class, bor2);
    }

    private bor() {
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
            return new hyq(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0002\u0005\u1005\u0003\u0006\u1005\u0004\u0007\u1004\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (n2 == 3) {
            return new bor();
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
            synchronized (bor.class) {
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

