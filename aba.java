/*
 * Decompiled with CFR 0.152.
 */
public final class aba
extends Enum {
    public static final /* enum */ aba a;
    public static final /* enum */ aba b;
    public static final /* enum */ aba c;
    public static final /* enum */ aba d;
    public static final /* enum */ aba e;
    private static final aba[] f;

    static {
        aba aba2;
        aba aba3;
        aba aba4;
        aba aba5;
        aba aba6;
        a = aba6 = new aba("DESTROYED", 0);
        b = aba5 = new aba("INITIALIZED", 1);
        c = aba4 = new aba("CREATED", 2);
        d = aba3 = new aba("STARTED", 3);
        e = aba2 = new aba("RESUMED", 4);
        f = new aba[]{aba6, aba5, aba4, aba3, aba2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private aba() {
        void var2_-1;
        void var1_-1;
    }

    public static aba[] values() {
        return (aba[])f.clone();
    }

    public final boolean a(aba aba2) {
        jse.e((Object)aba2, "state");
        return this.compareTo(aba2) >= 0;
    }
}

