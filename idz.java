/*
 * Decompiled with CFR 0.152.
 */
public final class idz
extends hwv
implements hyg {
    public static final idz a;
    private static volatile hym e;
    public hxk b;
    public hxk c;
    public hxk d;

    static {
        idz idz2;
        a = idz2 = new idz();
        hwv.z(idz.class, idz2);
    }

    private idz() {
        hyp hyp2 = hyp.b;
        this.b = hyp2;
        this.c = hyp2;
        this.d = hyp2;
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
            return new hyq(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new Object[]{"b", ied.class, "c", iea.class, "d", iee.class});
        }
        if (n2 == 3) {
            return new idz();
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
        hym hym2 = e;
        object = hym2;
        if (hym2 == null) {
            synchronized (idz.class) {
                hym2 = e;
                object = hym2;
                if (hym2 == null) {
                    e = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

