/*
 * Decompiled with CFR 0.152.
 */
public final class eip
extends hwv
implements hyg {
    public static final eip a;
    private static volatile hym d;
    public int b = 0;
    public Object c;

    static {
        eip eip2;
        a = eip2 = new eip();
        hwv.z(eip.class, eip2);
    }

    private eip() {
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
            return new hyq(a, "\u0001#\u0001\u0000\u0001+#\u0000\u0000\u0000\u0001<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\n<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0017<\u0000\u0018<\u0000\u001a<\u0000\u001b<\u0000\u001c<\u0000\u001e<\u0000\u001f<\u0000 <\u0000!<\u0000\"<\u0000#<\u0000$<\u0000%<\u0000&<\u0000'<\u0000(<\u0000)<\u0000*<\u0000+<\u0000", new Object[]{"c", "b", eiq.class, eir.class, eis.class, eiu.class, eiw.class, eiv.class, eix.class, eiy.class, eja.class, ejb.class, ejd.class, eje.class, ejh.class, eji.class, ejo.class, ejq.class, eju.class, ejk.class, ejg.class, eiz.class, ejv.class, ejw.class, ejx.class, ejn.class, ejt.class, ejy.class, ejm.class, ejr.class, ejp.class, eit.class, ejs.class, ejf.class, ejl.class, ejj.class, ejc.class});
        }
        if (n2 == 3) {
            return new eip();
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
        hym hym2 = d;
        object = hym2;
        if (hym2 == null) {
            synchronized (eip.class) {
                hym2 = d;
                object = hym2;
                if (hym2 == null) {
                    d = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

