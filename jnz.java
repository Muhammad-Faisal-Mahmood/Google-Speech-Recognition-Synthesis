/*
 * Decompiled with CFR 0.152.
 */
public final class jnz
extends Enum {
    public static final /* enum */ jnz a;
    public static final /* enum */ jnz b;
    public static final /* enum */ jnz c;
    private static final jnz[] d;

    static {
        jnz jnz2;
        jnz jnz3;
        jnz jnz4;
        a = jnz4 = new jnz("SYNCHRONIZED", 0);
        b = jnz3 = new jnz("PUBLICATION", 1);
        c = jnz2 = new jnz("NONE", 2);
        Enum[] enumArray = new jnz[]{jnz4, jnz3, jnz2};
        d = enumArray;
        jsd.h(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private jnz() {
        void var2_-1;
        void var1_-1;
    }

    public static jnz[] values() {
        return (jnz[])d.clone();
    }
}

