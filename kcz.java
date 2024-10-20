/*
 * Decompiled with CFR 0.152.
 */
public final class kcz
extends hwv
implements hyg {
    public static final kcz a;
    private static volatile hym m;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public int f;
    public long g;
    public long h;
    public long i;
    public long j;
    public boolean k;
    public kcx l;
    private byte n = (byte)2;

    static {
        kcz kcz2;
        a = kcz2 = new kcz();
        hwv.z(kcz.class, kcz2);
    }

    private kcz() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.n;
        }
        byte by2 = 1;
        if (n2 == 2) {
            hwz hwz2 = iko.i;
            object = iko.h;
            return new hyq(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u180c\u0001\u0003\u1004\u0002\u0004\u180c\u0003\u0005\u1002\u0004\u0006\u1002\u0006\u0007\u1002\u0007\b\u1007\b\t\u1009\t\n\u1002\u0005", new Object[]{"b", "c", "d", hwz2, "e", "f", object, "g", "i", "j", "k", "l", "h"});
        }
        if (n2 == 3) {
            return new kcz();
        }
        if (n2 == 4) {
            return new kcy();
        }
        if (n2 == 5) {
            return a;
        }
        if (n2 != 6) {
            if (object == null) {
                by2 = 0;
            }
            this.n = by2;
            return null;
        }
        hym hym2 = m;
        object = hym2;
        if (hym2 == null) {
            synchronized (kcz.class) {
                hym2 = m;
                object = hym2;
                if (hym2 == null) {
                    m = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

