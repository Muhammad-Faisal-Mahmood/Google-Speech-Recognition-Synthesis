/*
 * Decompiled with CFR 0.152.
 */
public final class iia
extends hws
implements hwt {
    public static final iia a;
    public static final gpm d;
    private static volatile hym e;
    public int b = 0;
    public Object c;
    private byte f = (byte)2;

    static {
        iia iia2;
        a = iia2 = new iia();
        hwv.z(iia.class, iia2);
        d = hwv.F(idb.a, iia2, iia2, 1253625, hzm.k);
    }

    private iia() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return this.f;
        }
        byte by2 = 1;
        if (n2 == 2) {
            return new hyq(a, "\u0001\r\u0001\u0000\u0001\u0010\r\u0000\u0000\u0003\u0001\u043c\u0000\u0002<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b\u043c\u0000\f<\u0000\r<\u0000\u000f<\u0000\u0010\u043c\u0000", new Object[]{"c", "b", icn.class, icf.class, icc.class, ice.class, ick.class, ihz.class, icd.class, ihy.class, iak.class, icr.class, iic.class, ich.class, iaj.class});
        }
        if (n2 == 3) {
            return new iia();
        }
        if (n2 == 4) {
            return new hwr(a);
        }
        if (n2 == 5) {
            return a;
        }
        if (n2 != 6) {
            if (object == null) {
                by2 = 0;
            }
            this.f = by2;
            return null;
        }
        hym hym2 = e;
        object = hym2;
        if (hym2 == null) {
            synchronized (iia.class) {
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

