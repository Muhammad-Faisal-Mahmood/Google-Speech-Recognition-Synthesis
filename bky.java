/*
 * Decompiled with CFR 0.152.
 */
public final class bky
extends Enum {
    public static final /* enum */ bky a;
    public static final /* enum */ bky b;
    public static final /* enum */ bky c;
    private static final bky[] d;

    static {
        bky bky2;
        bky bky3;
        bky bky4;
        a = bky4 = new bky("CONTENT", 0);
        b = bky3 = new bky("STANDARD", 1);
        c = bky2 = new bky("AVATAR", 2);
        d = new bky[]{bky4, bky3, bky2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bky() {
        void var2_-1;
        void var1_-1;
    }

    public static bky[] values() {
        return (bky[])d.clone();
    }
}

