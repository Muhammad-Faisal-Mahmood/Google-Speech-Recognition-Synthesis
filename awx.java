/*
 * Decompiled with CFR 0.152.
 */
public final class awx
extends Enum {
    public static final /* enum */ awx a;
    public static final /* enum */ awx b;
    public static final /* enum */ awx c;
    public static final /* enum */ awx d;
    public static final /* enum */ awx e;
    private static final awx[] f;

    static {
        awx awx2;
        awx awx3;
        awx awx4;
        awx awx5;
        awx awx6;
        a = awx6 = new awx("ON_CONFIGURE", 0);
        b = awx5 = new awx("ON_CREATE", 1);
        c = awx4 = new awx("ON_UPGRADE", 2);
        d = awx3 = new awx("ON_DOWNGRADE", 3);
        e = awx2 = new awx("ON_OPEN", 4);
        f = new awx[]{awx6, awx5, awx4, awx3, awx2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private awx() {
        void var2_-1;
        void var1_-1;
    }

    public static awx[] values() {
        return (awx[])f.clone();
    }
}

