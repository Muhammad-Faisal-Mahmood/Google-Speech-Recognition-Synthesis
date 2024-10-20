/*
 * Decompiled with CFR 0.152.
 */
public final class kqe
extends hwv
implements hyg {
    public static final int CONSTRAINED_VALUES_FIELD_NUMBER = 8;
    public static final kqe DEFAULT_INSTANCE;
    private static volatile hym PARSER;
    public hxk constrainedValues_ = hyp.b;

    static {
        kqe kqe2;
        DEFAULT_INSTANCE = kqe2 = new kqe();
        hwv.z(kqe.class, kqe2);
    }

    private kqe() {
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
            return new hyq(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"constrainedValues_", kqd.class});
        }
        if (n2 == 3) {
            return new kqe();
        }
        if (n2 == 4) {
            return new hwp(DEFAULT_INSTANCE);
        }
        if (n2 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (n2 != 6) {
            return null;
        }
        hym hym2 = PARSER;
        object = hym2;
        if (hym2 == null) {
            synchronized (kqe.class) {
                hym2 = PARSER;
                object = hym2;
                if (hym2 == null) {
                    PARSER = object = new hwq(DEFAULT_INSTANCE);
                }
            }
        }
        return object;
    }
}

