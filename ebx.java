/*
 * Decompiled with CFR 0.152.
 */
public final class ebx
extends hwv
implements hyg {
    public static final ebx a;
    private static volatile hym f;
    public int b;
    public int c = 0;
    public Object d;
    public long e;
    private byte g = (byte)2;

    static {
        ebx ebx2;
        a = ebx2 = new ebx();
        hwv.z(ebx.class, ebx2);
    }

    private ebx() {
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
            return new hyq(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001\u1002\u0000\u0002\u043c\u0000\u0003<\u0000\u0004\u043c\u0000", new Object[]{"d", "c", "b", "e", ece.class, ecg.class, ecf.class});
        }
        if (n2 == 3) {
            return new ebx();
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
            synchronized (ebx.class) {
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

