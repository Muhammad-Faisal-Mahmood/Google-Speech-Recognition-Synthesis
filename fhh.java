/*
 * Decompiled with CFR 0.152.
 */
public final class fhh
extends hwv
implements hyg {
    public static final fhh a;
    private static volatile hym f;
    public int b;
    public ihi c;
    public hxk d;
    public fid e;
    private byte g = (byte)2;

    static {
        fhh fhh2;
        a = fhh2 = new fhh();
        hwv.z(fhh.class, fhh2);
    }

    private fhh() {
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
            return this.g;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001\u1409\u0000\u0003\u001a\u0004\u1009\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (n2 == 3) {
            return new fhh();
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
            synchronized (fhh.class) {
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

