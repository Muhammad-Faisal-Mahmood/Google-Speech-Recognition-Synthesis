/*
 * Decompiled with CFR 0.152.
 */
public final class ecb
extends Enum
implements hwx {
    public static final /* enum */ ecb a;
    public static final /* enum */ ecb b;
    public static final /* enum */ ecb c;
    public static final /* enum */ ecb d;
    private static final ecb[] f;
    public final int e;

    static {
        ecb ecb2;
        ecb ecb3;
        ecb ecb4;
        ecb ecb5;
        a = ecb5 = new ecb("UNKNOWN", 0, 0);
        b = ecb4 = new ecb("START_CONNECTING", 1, 1);
        c = ecb3 = new ecb("CONNECTING", 2, 3);
        d = ecb2 = new ecb("CONNECTED", 3, 2);
        f = new ecb[]{ecb5, ecb4, ecb3, ecb2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ecb() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.e = var3_2;
    }

    public static ecb b(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        return null;
                    }
                    return c;
                }
                return d;
            }
            return b;
        }
        return a;
    }

    public static ecb[] values() {
        return (ecb[])f.clone();
    }

    @Override
    public final int a() {
        return this.e;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}

