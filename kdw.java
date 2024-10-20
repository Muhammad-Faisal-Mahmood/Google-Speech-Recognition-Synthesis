/*
 * Decompiled with CFR 0.152.
 */
public final class kdw
extends Enum
implements hwx {
    public static final /* enum */ kdw a;
    public static final /* enum */ kdw b;
    private static final kdw[] d;
    public final int c;

    static {
        kdw kdw2;
        kdw kdw3;
        a = kdw3 = new kdw("UNKNOWN", 0, 0);
        b = kdw2 = new kdw("CRONET", 1, 1);
        d = new kdw[]{kdw3, kdw2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private kdw() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.c = var3_2;
    }

    public static kdw b(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                return null;
            }
            return b;
        }
        return a;
    }

    public static kdw[] values() {
        return (kdw[])d.clone();
    }

    @Override
    public final int a() {
        return this.c;
    }

    public final String toString() {
        return Integer.toString(this.c);
    }
}

