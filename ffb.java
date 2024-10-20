/*
 * Decompiled with CFR 0.152.
 */
public final class ffb
extends Enum
implements hwx {
    public static final /* enum */ ffb a;
    public static final /* enum */ ffb b;
    public static final /* enum */ ffb c;
    public static final /* enum */ ffb d;
    public static final /* enum */ ffb e;
    private static final ffb[] f;
    private final int g;

    static {
        ffb ffb2;
        ffb ffb3;
        ffb ffb4;
        ffb ffb5;
        ffb ffb6;
        a = ffb6 = new ffb("PRIVILEGED_FEATURE_UNSPECIFIED", 0, 0);
        b = ffb5 = new ffb("PRIVILEGED_FEATURE_S3_DIARIZATION", 1, 1);
        c = ffb4 = new ffb("PRIVILEGED_FEATURE_PER_APP_CONCURRENCY", 2, 2);
        d = ffb3 = new ffb("PRIVILEGED_FEATURE_AICORE_ALWAYS_FALLBACK", 3, 3);
        e = ffb2 = new ffb("UNRECOGNIZED", 4, -1);
        f = new ffb[]{ffb6, ffb5, ffb4, ffb3, ffb2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ffb() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.g = var3_2;
    }

    public static ffb[] values() {
        return (ffb[])f.clone();
    }

    @Override
    public final int a() {
        if (this != e) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(this.a());
    }
}

