/*
 * Decompiled with CFR 0.152.
 */
public final class kqc
extends hwv
implements hyg {
    public static final kqc DEFAULT_INSTANCE;
    public static final int FEATURE_STATES_FIELD_NUMBER = 1;
    private static volatile hym PARSER;
    public hya featureStates_ = hya.a;

    static {
        kqc kqc2;
        DEFAULT_INSTANCE = kqc2 = new kqc();
        hwv.z(kqc.class, kqc2);
    }

    private kqc() {
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
            object = kqb.a;
            return new hyq(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"featureStates_", object});
        }
        if (n2 == 3) {
            return new kqc();
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
            synchronized (kqc.class) {
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

