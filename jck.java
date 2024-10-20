/*
 * Decompiled with CFR 0.152.
 */
public final class jck
extends Enum {
    public static final /* enum */ jck a;
    public static final /* enum */ jck b;
    public static final /* enum */ jck c;
    public static final /* enum */ jck d;
    private static final jck[] e;

    static {
        jck jck2;
        jck jck3;
        jck jck4;
        jck jck5;
        a = jck5 = new jck("PROCESSED", 0);
        b = jck4 = new jck("REFUSED", 1);
        c = jck3 = new jck("DROPPED", 2);
        d = jck2 = new jck("MISCARRIED", 3);
        e = new jck[]{jck5, jck4, jck3, jck2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private jck() {
        void var2_-1;
        void var1_-1;
    }

    public static jck[] values() {
        return (jck[])e.clone();
    }
}

