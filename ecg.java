/*
 * Decompiled with CFR 0.152.
 */
public final class ecg
extends hwv
implements hyg {
    public static final ecg a;
    private static volatile hym i;
    public int b;
    public int c = 0;
    public Object d;
    public long e;
    public efn f;
    public eip g;
    public long h;

    static {
        ecg ecg2;
        a = ecg2 = new ecg();
        hwv.z(ecg.class, ecg2);
    }

    private ecg() {
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
            return new hyq(a, "\u0001\f\u0001\u0001\u0001\u00cc\f\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0005<\u0000\u0006<\u0000\b<\u0000d<\u0000e<\u0000f<\u0000\u00c9\u1002\u0000\u00ca\u1009\u0001\u00cb\u1009\u0002\u00cc\u1002\u0003", new Object[]{"d", "c", "b", ear.class, eas.class, dzv.class, dzy.class, eby.class, ecx.class, ecy.class, eci.class, "e", "f", "g", "h"});
        }
        if (n2 == 3) {
            return new ecg();
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
        hym hym2 = i;
        object = hym2;
        if (hym2 == null) {
            synchronized (ecg.class) {
                hym2 = i;
                object = hym2;
                if (hym2 == null) {
                    i = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

