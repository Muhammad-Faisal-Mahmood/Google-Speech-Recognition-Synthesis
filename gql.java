/*
 * Decompiled with CFR 0.152.
 */
public final class gql
extends Enum
implements hwx {
    public static final /* enum */ gql a;
    public static final /* enum */ gql b;
    public static final /* enum */ gql c;
    private static final gql[] e;
    public final int d;

    static {
        gql gql2;
        gql gql3;
        gql gql4;
        a = gql4 = new gql("UNKNOWN", 0, 0);
        b = gql3 = new gql("REALTIME", 1, 1);
        c = gql2 = new gql("UPTIME", 2, 2);
        e = new gql[]{gql4, gql3, gql2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private gql() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.d = var3_2;
    }

    public static gql[] values() {
        return (gql[])e.clone();
    }

    @Override
    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}

