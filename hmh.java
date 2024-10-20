/*
 * Decompiled with CFR 0.152.
 */
public final class hmh
extends Enum
implements hwx {
    public static final /* enum */ hmh a;
    public static final /* enum */ hmh b;
    public static final /* enum */ hmh c;
    public static final /* enum */ hmh d;
    public static final /* enum */ hmh e;
    public static final /* enum */ hmh f;
    public static final /* enum */ hmh g;
    public static final /* enum */ hmh h;
    public static final /* enum */ hmh i;
    public static final /* enum */ hmh j;
    public static final /* enum */ hmh k;
    public static final /* enum */ hmh l;
    public static final /* enum */ hmh m;
    private static final hmh[] n;
    private final int o;

    static {
        hmh hmh2;
        hmh hmh3;
        hmh hmh4;
        hmh hmh5;
        hmh hmh6;
        hmh hmh7;
        hmh hmh8;
        hmh hmh9;
        hmh hmh10;
        hmh hmh11;
        hmh hmh12;
        hmh hmh13;
        hmh hmh14;
        a = hmh14 = new hmh("UNKNOWN", 0, 0);
        b = hmh13 = new hmh("GROUP_NOT_FOUND", 1, 1);
        c = hmh12 = new hmh("NEW_BUILD_ID", 2, 2);
        d = hmh11 = new hmh("NEW_VARIANT_ID", 3, 3);
        e = hmh10 = new hmh("NEW_VERSION_NUMBER", 4, 4);
        f = hmh9 = new hmh("DIFFERENT_FILES", 5, 5);
        g = hmh8 = new hmh("DIFFERENT_STALE_LIFETIME", 6, 6);
        h = hmh7 = new hmh("DIFFERENT_EXPIRATION_DATE", 7, 7);
        i = hmh6 = new hmh("DIFFERENT_DOWNLOAD_CONDITIONS", 8, 8);
        j = hmh5 = new hmh("DIFFERENT_ALLOWED_READERS", 9, 9);
        k = hmh4 = new hmh("DIFFERENT_DOWNLOAD_POLICY", 10, 10);
        l = hmh3 = new hmh("DIFFERENT_EXPERIMENT_INFO", 11, 11);
        m = hmh2 = new hmh("UNRECOGNIZED", 12, -1);
        n = new hmh[]{hmh14, hmh13, hmh12, hmh11, hmh10, hmh9, hmh8, hmh7, hmh6, hmh5, hmh4, hmh3, hmh2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hmh() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.o = var3_2;
    }

    public static hmh[] values() {
        return (hmh[])n.clone();
    }

    @Override
    public final int a() {
        if (this != m) {
            return this.o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(this.a());
    }
}

