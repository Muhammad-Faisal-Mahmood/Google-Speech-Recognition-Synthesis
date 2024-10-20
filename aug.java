/*
 * Decompiled with CFR 0.152.
 */
public final class aug
extends Enum {
    public static final /* enum */ aug a;
    public static final /* enum */ aug b;
    public static final /* enum */ aug c;
    private static final aug[] d;

    static {
        aug aug2;
        aug aug3;
        aug aug4;
        a = aug4 = new aug("NO_OP", 0);
        b = aug3 = new aug("ADD", 1);
        c = aug2 = new aug("REMOVE", 2);
        d = new aug[]{aug4, aug3, aug2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private aug() {
        void var2_-1;
        void var1_-1;
    }

    public static aug[] values() {
        return (aug[])d.clone();
    }
}

