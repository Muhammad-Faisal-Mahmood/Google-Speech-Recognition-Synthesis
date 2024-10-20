/*
 * Decompiled with CFR 0.152.
 */
public final class fgs
extends Enum
implements hwx {
    public static final /* enum */ fgs a;
    public static final /* enum */ fgs b;
    public static final /* enum */ fgs c;
    public static final /* enum */ fgs d;
    public static final /* enum */ fgs e;
    private static final fgs[] f;
    private final int g;

    static {
        fgs fgs2;
        fgs fgs3;
        fgs fgs4;
        fgs fgs5;
        fgs fgs6;
        a = fgs6 = new fgs("UNDEFINED", 0, 0);
        b = fgs5 = new fgs("INTENT_API", 1, 1);
        c = fgs4 = new fgs("SERVICE_API", 2, 2);
        d = fgs3 = new fgs("VOICE_IME", 3, 3);
        e = fgs2 = new fgs("GRPC_SERVICE_API", 4, 4);
        f = new fgs[]{fgs6, fgs5, fgs4, fgs3, fgs2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private fgs() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.g = var3_2;
    }

    public static fgs[] values() {
        return (fgs[])f.clone();
    }

    @Override
    public final int a() {
        return this.g;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}

