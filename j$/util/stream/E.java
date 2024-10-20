/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

final class E
extends Enum {
    public static final /* enum */ E ALL;
    public static final /* enum */ E ANY;
    public static final /* enum */ E NONE;
    private static final E[] c;
    private final boolean a;
    private final boolean b;

    static {
        E e2;
        E e3;
        E e4;
        ANY = e4 = new E("ANY", 0, true, true);
        ALL = e3 = new E("ALL", 1, false, false);
        NONE = e2 = new E("NONE", 2, true, false);
        c = new E[]{e4, e3, e2};
    }

    /*
     * WARNING - void declaration
     */
    private E() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.a = var3_2;
        this.b = var4_1;
    }

    static /* bridge */ /* synthetic */ boolean g(E e2) {
        return e2.b;
    }

    static /* bridge */ /* synthetic */ boolean m(E e2) {
        return e2.a;
    }

    public static E valueOf(String string) {
        return Enum.valueOf(E.class, string);
    }

    public static E[] values() {
        return (E[])c.clone();
    }
}

