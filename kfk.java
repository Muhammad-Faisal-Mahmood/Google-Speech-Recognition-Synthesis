/*
 * Decompiled with CFR 0.152.
 */
public final class kfk
extends hwv
implements hyg {
    public static final kfk a;
    private static volatile hym e;
    public int b;
    public int c;
    public int d = 1;
    private kfj f;
    private byte g = (byte)2;

    static {
        kfk kfk2;
        a = kfk2 = new kfk();
        hwv.z(kfk.class, kfk2);
    }

    private kfk() {
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
            object = kei.h;
            return new hyq(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u180c\u0000\u0002\u1004\u0001\u0003\u1409\u0002", new Object[]{"b", "c", object, "d", "f"});
        }
        if (n2 == 3) {
            return new kfk();
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
        hym hym2 = e;
        object = hym2;
        if (hym2 == null) {
            synchronized (kfk.class) {
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

