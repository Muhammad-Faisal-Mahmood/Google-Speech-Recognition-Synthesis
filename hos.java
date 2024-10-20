/*
 * Decompiled with CFR 0.152.
 */
public final class hos
extends Enum {
    public static final /* enum */ hos a;
    public static final /* enum */ hos b;
    public static final /* enum */ hos c;
    private static final hos[] d;

    static {
        hos hos2;
        hos hos3;
        hos hos4;
        a = hos4 = new hos("NOT_RUN", 0);
        b = hos3 = new hos("CANCELLED", 1);
        c = hos2 = new hos("STARTED", 2);
        d = new hos[]{hos4, hos3, hos2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hos() {
        void var2_-1;
        void var1_-1;
    }

    public static hos[] values() {
        return (hos[])d.clone();
    }
}

