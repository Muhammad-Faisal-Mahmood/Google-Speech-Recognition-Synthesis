/*
 * Decompiled with CFR 0.152.
 */
public final class iim
extends Enum
implements hwx {
    public static final /* enum */ iim a;
    public static final /* enum */ iim b;
    public static final /* enum */ iim c;
    public static final /* enum */ iim d;
    public static final /* enum */ iim e;
    public static final /* enum */ iim f;
    private static final iim[] h;
    public final int g;

    static {
        iim iim2;
        iim iim3;
        iim iim4;
        iim iim5;
        iim iim6;
        iim iim7;
        a = iim7 = new iim("COMPOSITION_STATUS_UNSPECIFIED", 0, 0);
        b = iim6 = new iim("COMPOSITION_STATUS_ERROR", 1, 1);
        c = iim5 = new iim("COMPOSITION_STATUS_END_OF_STREAM", 2, 2);
        d = iim4 = new iim("COMPOSITION_STATUS_SUCCESS", 3, 3);
        e = iim3 = new iim("COMPOSITION_STATUS_INVALID_ARGUMENT_ERROR", 4, 4);
        f = iim2 = new iim("COMPOSITION_STATUS_DEADLINE_EXCEEDED_ERROR", 5, 5);
        h = new iim[]{iim7, iim6, iim5, iim4, iim3, iim2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private iim() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.g = var3_2;
    }

    public static iim[] values() {
        return (iim[])h.clone();
    }

    @Override
    public final int a() {
        return this.g;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}

