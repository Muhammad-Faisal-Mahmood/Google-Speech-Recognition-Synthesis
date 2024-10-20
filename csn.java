/*
 * Decompiled with CFR 0.152.
 */
public final class csn
extends Enum
implements hwx {
    public static final /* enum */ csn a;
    public static final /* enum */ csn b;
    public static final /* enum */ csn c;
    private static final csn[] e;
    public final int d;

    static {
        csn csn2;
        csn csn3;
        csn csn4;
        a = csn4 = new csn("DOWNLOAD_ONLY_ON_WIFI", 0, 0);
        b = csn3 = new csn("DOWNLOAD_ON_ANY_NETWORK", 1, 1);
        c = csn2 = new csn("DOWNLOAD_FIRST_ON_WIFI_THEN_ON_ANY_NETWORK", 2, 2);
        e = new csn[]{csn4, csn3, csn2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private csn() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.d = var3_2;
    }

    public static csn b(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    return null;
                }
                return c;
            }
            return b;
        }
        return a;
    }

    public static csn[] values() {
        return (csn[])e.clone();
    }

    @Override
    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}

