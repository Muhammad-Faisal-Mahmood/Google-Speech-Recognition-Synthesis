/*
 * Decompiled with CFR 0.152.
 */
public final class kqg
extends hwv
implements hyg {
    public static final kqg DEFAULT_INSTANCE;
    public static final int FLAGS_FIELD_NUMBER = 1;
    private static volatile hym PARSER;
    public hya flags_ = hya.a;

    static {
        kqg kqg2;
        DEFAULT_INSTANCE = kqg2 = new kqg();
        hwv.z(kqg.class, kqg2);
    }

    private kqg() {
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
            object = kqf.a;
            return new hyq(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"flags_", object});
        }
        if (n2 == 3) {
            return new kqg();
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
            synchronized (kqg.class) {
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

