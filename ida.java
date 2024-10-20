/*
 * Decompiled with CFR 0.152.
 */
public final class ida
extends hws
implements hwt {
    public static final ida a;
    private static volatile hym e;
    public int b;
    public String c = "";
    public boolean d = true;
    private boolean f;
    private byte g = (byte)2;

    static {
        ida ida2;
        a = ida2 = new ida();
        hwv.z(ida.class, ida2);
    }

    private ida() {
    }

    public static /* synthetic */ void G(ida ida2) {
        ida2.b |= 8;
        ida2.f = true;
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
            return new hyq(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1007\u0003", new Object[]{"b", "c", "d", "f"});
        }
        if (n2 == 3) {
            return new ida();
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
            this.g = by2;
            return null;
        }
        hym hym2 = e;
        object = hym2;
        if (hym2 == null) {
            synchronized (ida.class) {
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

