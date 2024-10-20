/*
 * Decompiled with CFR 0.152.
 */
public final class elz
extends Enum
implements hwx {
    public static final /* enum */ elz a;
    public static final /* enum */ elz b;
    public static final /* enum */ elz c;
    private static final elz[] e;
    public final int d;

    static {
        elz elz2;
        elz elz3;
        elz elz4;
        a = elz4 = new elz("MODE_DEFAULT_MEMORY", 0, 0);
        b = elz3 = new elz("MODE_MEMORY_PERSISTENT_IF_ALLOWED", 1, 1);
        c = elz2 = new elz("MODE_PERSISTENT_IF_ALLOWED", 2, 2);
        e = new elz[]{elz4, elz3, elz2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private elz() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.d = var3_2;
    }

    public static elz b(int n2) {
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

    public static elz[] values() {
        return (elz[])e.clone();
    }

    @Override
    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}

