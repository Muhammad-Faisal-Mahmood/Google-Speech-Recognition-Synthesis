/*
 * Decompiled with CFR 0.152.
 */
public final class esl
extends hwv
implements hyg {
    public static final esl a;
    private static volatile hym b;

    static {
        esl esl2;
        a = esl2 = new esl();
        hwv.z(esl.class, esl2);
    }

    private esl() {
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
            return new hyq(a, "\u0004\u0000", null);
        }
        if (n2 == 3) {
            return new esl();
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
        hym hym2 = b;
        object = hym2;
        if (hym2 == null) {
            synchronized (esl.class) {
                hym2 = b;
                object = hym2;
                if (hym2 == null) {
                    b = object = new hwq(a);
                }
            }
        }
        return object;
    }
}

