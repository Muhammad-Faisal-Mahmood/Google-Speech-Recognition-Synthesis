/*
 * Decompiled with CFR 0.152.
 */
public final class ffl
extends hwv
implements hyg {
    public static final ffl a;
    private static volatile hym i;
    public int b;
    public int c;
    public hxk d = hyp.b;
    public int e;
    public int f;
    public int g;
    public boolean h;

    static {
        ffl ffl2;
        a = ffl2 = new ffl();
        hwv.z(ffl.class, ffl2);
    }

    private ffl() {
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
            object = ieo.d;
            hwz hwz2 = ieo.e;
            return new hyq(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u180c\u0000\u0002\u001a\u0003\u1004\u0001\u0004\u1004\u0002\u0005\u180c\u0003\u0006\u1007\u0004", new Object[]{"b", "c", object, "d", "e", "f", "g", hwz2, "h"});
        }
        if (n2 == 3) {
            return new ffl();
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
        hym hym2 = i;
        object = hym2;
        if (hym2 == null) {
            synchronized (ffl.class) {
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

