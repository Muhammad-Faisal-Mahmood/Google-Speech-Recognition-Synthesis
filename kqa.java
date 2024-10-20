/*
 * Decompiled with CFR 0.152.
 */
public final class kqa
extends hwv
implements hyg {
    public static final kqa DEFAULT_INSTANCE;
    public static final int ENABLED_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile hym PARSER;
    public int bitField0_;
    public boolean enabled_;
    public hya params_ = hya.a;

    static {
        kqa kqa2;
        DEFAULT_INSTANCE = kqa2 = new kqa();
        hwv.z(kqa.class, kqa2);
    }

    private kqa() {
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
            object = kpz.a;
            return new hyq(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u1007\u0000\u00022", new Object[]{"bitField0_", "enabled_", "params_", object});
        }
        if (n2 == 3) {
            return new kqa();
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
            synchronized (kqa.class) {
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

