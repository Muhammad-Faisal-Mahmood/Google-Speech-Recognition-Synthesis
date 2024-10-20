/*
 * Decompiled with CFR 0.152.
 */
final class gvw
extends Enum {
    public static final /* enum */ gvw a;
    public static final /* enum */ gvw b;
    public static final /* enum */ gvw c;
    private static final gvw[] d;

    static {
        gvw gvw2;
        gvw gvw3;
        gvw gvw4;
        a = gvw4 = new gvw("STRONG", 0);
        b = gvw3 = new gvw("SOFT", 1);
        c = gvw2 = new gvw("WEAK", 2);
        d = new gvw[]{gvw4, gvw3, gvw2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private gvw() {
        void var2_-1;
        void var1_-1;
    }

    public static gvw[] values() {
        return (gvw[])d.clone();
    }

    final gtd a() {
        int n2 = this.ordinal();
        if (n2 != 0) {
            if (n2 != 1 && n2 != 2) {
                throw null;
            }
            return gtc.a;
        }
        return gtb.a;
    }
}

