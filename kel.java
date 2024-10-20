/*
 * Decompiled with CFR 0.152.
 */
public final class kel
extends hwv
implements hyg {
    public static final kel a;
    private static volatile hym k;
    public int b;
    public long c;
    public String d = "";
    public hxk e;
    public hzb f;
    public hwg g;
    public int h;
    public kek i;
    public hxk j;

    static {
        kel kel2;
        a = kel2 = new kel();
        hwv.z(kel.class, kel2);
    }

    private kel() {
        hyp hyp2 = hyp.b;
        this.e = hyp2;
        this.j = hyp2;
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
            return new hyq(a, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0002\u0000\u0001\u1005\u0000\u0002\u1008\u0001\u0004\u1009\u0004\u0005\u1004\u0006\u0006\u1009\u0007\u0007\u001b\b\u001b\u000b\u1009\u0005", new Object[]{"b", "c", "d", "f", "h", "i", "j", keq.class, "e", kej.class, "g"});
        }
        if (n2 == 3) {
            return new kel();
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
        hym hym2 = k;
        object = hym2;
        if (hym2 == null) {
            synchronized (kel.class) {
                hym2 = k;
                object = hym2;
                if (hym2 == null) {
                    k = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

