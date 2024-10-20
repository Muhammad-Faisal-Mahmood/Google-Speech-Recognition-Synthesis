/*
 * Decompiled with CFR 0.152.
 */
public final class ecw
extends hwv
implements hyg {
    public static final ecw a;
    private static volatile hym i;
    public int b;
    public int c = 0;
    public Object d;
    public eae e;
    public boolean f;
    public eip g;
    public int h;

    static {
        ecw ecw2;
        a = ecw2 = new ecw();
        hwv.z(ecw.class, ecw2);
    }

    private ecw() {
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
            object = eck.c;
            return new hyq(a, "\u0001\u0006\u0001\u0001\u0001\r\u0006\u0000\u0000\u0000\u0001\u1009\u0000\u0003\u1007\u0001\t<\u0000\n\u1009\u0002\u000b\u180c\u0003\r<\u0000", new Object[]{"d", "c", "b", "e", "f", ecz.class, "g", "h", object, edg.class});
        }
        if (n2 == 3) {
            return new ecw();
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
            synchronized (ecw.class) {
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

