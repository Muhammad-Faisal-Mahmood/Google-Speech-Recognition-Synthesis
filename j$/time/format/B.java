/*
 * Decompiled with CFR 0.152.
 */
package j$.time.format;

public final class B
extends Enum {
    public static final /* enum */ B FULL;
    public static final /* enum */ B FULL_STANDALONE;
    public static final /* enum */ B NARROW;
    public static final /* enum */ B NARROW_STANDALONE;
    public static final /* enum */ B SHORT;
    public static final /* enum */ B SHORT_STANDALONE;
    private static final B[] b;
    private final int a;

    static {
        B b2;
        B b3;
        B b4;
        B b5;
        B b6;
        B b7;
        FULL = b7 = new B("FULL", 0, 0);
        FULL_STANDALONE = b6 = new B("FULL_STANDALONE", 1, 0);
        SHORT = b5 = new B("SHORT", 2, 1);
        SHORT_STANDALONE = b4 = new B("SHORT_STANDALONE", 3, 1);
        NARROW = b3 = new B("NARROW", 4, 1);
        NARROW_STANDALONE = b2 = new B("NARROW_STANDALONE", 5, 1);
        b = new B[]{b7, b6, b5, b4, b3, b2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private B() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.a = var3_2;
    }

    public static B valueOf(String string) {
        return Enum.valueOf(B.class, string);
    }

    public static B[] values() {
        return (B[])b.clone();
    }

    final int g() {
        return this.a;
    }
}

