/*
 * Decompiled with CFR 0.152.
 */
public final class fig
extends hwv
implements hyg {
    public static final fig a;
    private static volatile hym i;
    public fhi b;
    public int c;
    public String d = "";
    public hxk e;
    public int f;
    public fhm g;
    public boolean h;
    private int j;
    private byte k = (byte)2;

    static {
        fig fig2;
        a = fig2 = new fig();
        hwv.z(fig.class, fig2);
    }

    private fig() {
        this.e = hyp.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.k;
        }
        byte by2 = 1;
        if (n2 == 2) {
            object = hqj.n;
            hwz hwz2 = eck.r;
            return new hyq(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0001\u0001\u1009\u0000\u0002\u180c\u0001\u0003\u1008\u0002\u0004\u001a\u0005\u180c\u0003\u0006\u1409\u0004\u0007\u1007\u0005", new Object[]{"j", "b", "c", object, "d", "e", "f", hwz2, "g", "h"});
        }
        if (n2 == 3) {
            return new fig();
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
            this.k = by2;
            return null;
        }
        hym hym2 = i;
        object = hym2;
        if (hym2 == null) {
            synchronized (fig.class) {
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

