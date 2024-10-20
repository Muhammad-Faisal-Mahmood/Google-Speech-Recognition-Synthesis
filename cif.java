/*
 * Decompiled with CFR 0.152.
 */
public final class cif
extends hwv
implements hyg {
    public static final cif a;
    private static volatile hym o;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public int h;
    public long i = -1L;
    public int j;
    public String k = "";
    public int l;
    public int m;
    public boolean n;

    static {
        cif cif2;
        a = cif2 = new cif();
        hwv.z(cif.class, cif2);
    }

    private cif() {
        Object[] objectArray = hyp.a;
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
            object = iko.a;
            return new hyq(a, "\u0004\u000b\u0000\u0002\u0002$\u000b\u0000\u0000\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0005\u1008\u0006\u0013\u1002\u0018\u0017\u1004\u001e\u0019\u180c\b \u1008!!\u1008\u0004\"\u1004\"#\u1004#$\u1007$", new Object[]{"b", "c", "d", "e", "g", "i", "j", "h", object, "k", "f", "l", "m", "n"});
        }
        if (n2 == 3) {
            return new cif();
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
        hym hym2 = o;
        object = hym2;
        if (hym2 == null) {
            synchronized (cif.class) {
                hym2 = o;
                object = hym2;
                if (hym2 == null) {
                    o = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

