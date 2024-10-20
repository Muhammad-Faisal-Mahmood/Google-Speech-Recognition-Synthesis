/*
 * Decompiled with CFR 0.152.
 */
public final class kqd
extends hwv
implements hyg {
    public static final int APP_ID_FIELD_NUMBER = 1;
    public static final int BOOL_VALUE_FIELD_NUMBER = 3;
    public static final int BYTES_VALUE_FIELD_NUMBER = 7;
    public static final kqd DEFAULT_INSTANCE;
    public static final int FLOAT_VALUE_FIELD_NUMBER = 5;
    public static final int INT_VALUE_FIELD_NUMBER = 4;
    public static final int MIN_VERSION_FIELD_NUMBER = 2;
    private static volatile hym PARSER;
    public static final int STRING_VALUE_FIELD_NUMBER = 6;
    public String appId_ = "";
    public int bitField0_;
    public String minVersion_ = "";
    public int valueCase_ = 0;
    public Object value_;

    static {
        kqd kqd2;
        DEFAULT_INSTANCE = kqd2 = new kqd();
        hwv.z(kqd.class, kqd2);
    }

    private kqd() {
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
            return new hyq(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u103a\u0000\u0004\u1035\u0000\u0005\u1034\u0000\u0006\u103b\u0000\u0007\u103d\u0000", new Object[]{"value_", "valueCase_", "bitField0_", "appId_", "minVersion_"});
        }
        if (n2 == 3) {
            return new kqd();
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
            synchronized (kqd.class) {
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

