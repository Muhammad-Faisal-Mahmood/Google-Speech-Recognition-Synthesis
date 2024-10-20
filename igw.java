/*
 * Decompiled with CFR 0.152.
 */
public final class igw
extends hwv
implements hyg {
    public static final igw a;
    private static volatile hym g;
    public int b;
    public int c;
    public int d;
    public ids e;
    public int f;

    static {
        igw igw2;
        a = igw2 = new igw();
        hwv.z(igw.class, igw2);
    }

    private igw() {
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
            object = ieo.q;
            hwz hwz2 = ieo.r;
            hwz hwz3 = ieo.p;
            return new hyq(a, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001\u0004\u1009\u0002\b\u180c\u0005", new Object[]{"b", "c", object, "d", hwz2, "e", "f", hwz3});
        }
        if (n2 == 3) {
            return new igw();
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
            synchronized (igw.class) {
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

