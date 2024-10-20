/*
 * Decompiled with CFR 0.152.
 */
public final class igs
extends Enum
implements hwx {
    public static final /* enum */ igs a;
    public static final /* enum */ igs b;
    public static final /* enum */ igs c;
    public static final /* enum */ igs d;
    public static final /* enum */ igs e;
    private static final igs[] f;
    private final int g;

    static {
        igs igs2;
        igs igs3;
        igs igs4;
        igs igs5;
        igs igs6;
        a = igs6 = new igs("STOP_TYPE_UNKNOWN", 0, 0);
        b = igs5 = new igs("STOP_TYPE_IMMEDIATE", 1, 1);
        c = igs4 = new igs("STOP_TYPE_DEFERRED", 2, 2);
        d = igs3 = new igs("STOP_TYPE_FORCED", 3, 3);
        e = igs2 = new igs("STOP_TYPE_TIMEOUT", 4, 4);
        f = new igs[]{igs6, igs5, igs4, igs3, igs2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private igs() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.g = var3_2;
    }

    public static igs[] values() {
        return (igs[])f.clone();
    }

    @Override
    public final int a() {
        return this.g;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}

