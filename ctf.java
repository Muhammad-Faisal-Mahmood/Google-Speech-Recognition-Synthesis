/*
 * Decompiled with CFR 0.152.
 */
public final class ctf
extends hwv
implements hyg {
    public static final ctf a;
    private static volatile hym r;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public int f;
    public String g = "";
    public ikm h;
    public String i = "";
    public int j;
    public ikm k;
    public hxk l = hyp.b;
    public int m;
    public int n;
    public String o = "";
    public String p = "";
    public hvi q;

    static {
        ctf ctf2;
        a = ctf2 = new ctf();
        hwv.z(ctf.class, ctf2);
    }

    private ctf() {
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
            object = bqk.o;
            hwz hwz2 = bqk.n;
            hwz hwz3 = bqk.m;
            return new hyq(a, "\u0001\u000f\u0000\u0001\u0002\u0015\u000f\u0000\u0001\u0000\u0002\u1008\u0001\u0004\u1004\u0002\u0005\u1008\u0004\u0007\u1008\u0000\u000b\u1009\u0005\f\u1009\b\r\u001b\u000e\u1008\u0006\u000f\u180c\u0003\u0010\u1004\u0007\u0011\u180c\t\u0012\u180c\n\u0013\u1008\u000b\u0014\u1008\f\u0015\u1009\r", new Object[]{"b", "d", "e", "g", "c", "h", "k", "l", cti.class, "i", "f", object, "j", "m", hwz2, "n", hwz3, "o", "p", "q"});
        }
        if (n2 == 3) {
            return new ctf();
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
        hym hym2 = r;
        object = hym2;
        if (hym2 == null) {
            synchronized (ctf.class) {
                hym2 = r;
                object = hym2;
                if (hym2 == null) {
                    r = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

