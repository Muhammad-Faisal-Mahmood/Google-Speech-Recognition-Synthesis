/*
 * Decompiled with CFR 0.152.
 */
public final class cwq
extends Enum {
    public static final /* enum */ cwq a;
    public static final /* enum */ cwq b;
    public static final /* enum */ cwq c;
    private static final cwq[] e;
    public final int d;

    static {
        cwq cwq2;
        cwq cwq3;
        cwq cwq4;
        a = cwq4 = new cwq("NEW_FILE_KEY", 0, 0);
        b = cwq3 = new cwq("ADD_DOWNLOAD_TRANSFORM", 1, 1);
        c = cwq2 = new cwq("USE_CHECKSUM_ONLY", 2, 2);
        e = new cwq[]{cwq4, cwq3, cwq2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cwq() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.d = var3_2;
    }

    public static cwq a(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 == 2) {
                    return c;
                }
                throw new IllegalArgumentException(a.af(n2, "Unknown MDD FileKey version:"));
            }
            return b;
        }
        return a;
    }

    public static cwq[] values() {
        return (cwq[])e.clone();
    }
}

