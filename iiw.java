/*
 * Decompiled with CFR 0.152.
 */
public final class iiw
extends hwv
implements hyg {
    public static final iiw a;
    private static volatile hym g;
    public int b;
    public int c = 0;
    public Object d;
    public String e = "";
    public iis f;
    private byte h = (byte)2;

    static {
        iiw iiw2;
        a = iiw2 = new iiw();
        hwv.z(iiw.class, iiw2);
    }

    private iiw() {
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
            return this.h;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\u0017\u0001\u0001\u0002x\u0017\u0000\u0000\u0001\u0002\u1008\u0001\u0004\u1409\u0003d;\u0000e<\u0000f<\u0000g<\u0000h<\u0000i<\u0000j<\u0000k<\u0000l<\u0000m<\u0000n<\u0000o<\u0000p<\u0000q<\u0000r<\u0000s<\u0000t<\u0000u<\u0000v<\u0000w<\u0000x<\u0000", new Object[]{"d", "c", "b", "e", "f", ijs.class, ijx.class, iju.class, ijm.class, ijd.class, ijt.class, ijp.class, ijq.class, ijl.class, ijh.class, ijw.class, iji.class, ijn.class, ijg.class, ijv.class, ijo.class, ijj.class, ijk.class, ije.class, ijf.class});
        }
        if (n2 == 3) {
            return new iiw();
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
            this.h = by2;
            return null;
        }
        hym hym2 = g;
        object = hym2;
        if (hym2 == null) {
            synchronized (iiw.class) {
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

