/*
 * Decompiled with CFR 0.152.
 */
public final class keb
extends hwv
implements hyg {
    public static final keb a;
    private static volatile hym g;
    public int b;
    public long c;
    public int d;
    public hxk e;
    public kef f;
    private byte h = (byte)2;

    static {
        keb keb2;
        a = keb2 = new keb();
        hwv.z(keb.class, keb2);
    }

    private keb() {
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
            return this.h;
        }
        byte by2 = 1;
        if (n2 == 2) {
            object = iko.t;
            return new hyq(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0001\u0001\u1005\u0000\u0002\u041b\u0003\u180c\u0001\u0006\u1009\u0004", new Object[]{"b", "c", "e", kec.class, "d", object, "f"});
        }
        if (n2 == 3) {
            return new keb();
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
            synchronized (keb.class) {
                hym2 = g;
                object = hym2;
                if (hym2 == null) {
                    g = object = new hwq(a);
                }
            }
        }
        return object;
    }

    public final void c() {
        hxk hxk2 = this.e;
        if (!hxk2.c()) {
            this.e = hwv.s(hxk2);
        }
    }
}

