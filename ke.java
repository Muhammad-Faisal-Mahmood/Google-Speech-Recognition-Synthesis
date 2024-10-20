/*
 * Decompiled with CFR 0.152.
 */
public final class ke
extends Enum {
    public static final /* enum */ ke a;
    public static final /* enum */ ke b;
    public static final /* enum */ ke c;
    private static final ke[] d;

    static {
        ke ke2;
        ke ke3;
        ke ke4;
        a = ke4 = new ke("ALLOW", 0);
        b = ke3 = new ke("PREVENT_WHEN_EMPTY", 1);
        c = ke2 = new ke("PREVENT", 2);
        d = new ke[]{ke4, ke3, ke2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ke() {
        void var2_-1;
        void var1_-1;
    }

    public static ke[] values() {
        return (ke[])d.clone();
    }
}

