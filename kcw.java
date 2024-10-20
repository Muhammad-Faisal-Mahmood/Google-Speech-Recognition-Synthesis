/*
 * Decompiled with CFR 0.152.
 */
public final class kcw
extends hwv
implements hyg {
    public static final kcw a;
    private static volatile hym l;
    public int b;
    public int c;
    public hxk d;
    public int e;
    public int f;
    public bor g;
    public bor h;
    public hwg i;
    public kcv j;
    public int k;
    private byte m = (byte)2;

    static {
        kcw kcw2;
        a = kcw2 = new kcw();
        hwv.z(kcw.class, kcw2);
    }

    private kcw() {
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
            return this.m;
        }
        byte by2 = 1;
        if (n2 == 2) {
            object = iko.g;
            return new hyq(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0003\u0001\u180c\u0000\u0002\u041b\u0003\u1004\u0001\u0004\u1004\u0002\u0005\u1409\u0003\u0006\u1409\u0004\u0007\u1009\u0005\b\u1009\u0006\t\u1004\u0007", new Object[]{"b", "c", object, "d", bor.class, "e", "f", "g", "h", "i", "j", "k"});
        }
        if (n2 == 3) {
            return new kcw();
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
            this.m = by2;
            return null;
        }
        hym hym2 = l;
        object = hym2;
        if (hym2 == null) {
            synchronized (kcw.class) {
                hym2 = l;
                object = hym2;
                if (hym2 == null) {
                    l = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

