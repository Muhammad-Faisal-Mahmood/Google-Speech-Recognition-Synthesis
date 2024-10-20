/*
 * Decompiled with CFR 0.152.
 */
public final class hzm
extends Enum {
    public static final /* enum */ hzm a;
    public static final /* enum */ hzm b;
    public static final /* enum */ hzm c;
    public static final /* enum */ hzm d;
    public static final /* enum */ hzm e;
    public static final /* enum */ hzm f;
    public static final /* enum */ hzm g;
    public static final /* enum */ hzm h;
    public static final /* enum */ hzm i;
    public static final /* enum */ hzm j;
    public static final /* enum */ hzm k;
    public static final /* enum */ hzm l;
    public static final /* enum */ hzm m;
    public static final /* enum */ hzm n;
    public static final /* enum */ hzm o;
    public static final /* enum */ hzm p;
    public static final /* enum */ hzm q;
    public static final /* enum */ hzm r;
    private static final hzm[] u;
    public final hzn s;
    public final int t;

    static {
        hzm hzm2;
        hzm hzm3;
        hzm hzm4;
        hzm hzm5;
        hzm hzm6;
        hzm hzm7;
        hzm hzm8;
        hzm hzm9;
        hzm hzm10;
        hzm hzm11;
        hzm hzm12;
        hzm hzm13;
        hzm hzm14;
        hzm hzm15;
        hzm hzm16;
        hzm hzm17;
        hzm hzm18;
        hzm hzm19;
        a = hzm19 = new hzm("DOUBLE", 0, hzn.d, 1);
        b = hzm18 = new hzm("FLOAT", 1, hzn.c, 5);
        c = hzm17 = new hzm("INT64", 2, hzn.b, 0);
        d = hzm16 = new hzm("UINT64", 3, hzn.b, 0);
        e = hzm15 = new hzm("INT32", 4, hzn.a, 0);
        f = hzm14 = new hzm("FIXED64", 5, hzn.b, 1);
        g = hzm13 = new hzm("FIXED32", 6, hzn.a, 5);
        h = hzm12 = new hzm("BOOL", 7, hzn.e, 0);
        i = hzm11 = new hzm("STRING", 8, hzn.f, 2);
        j = hzm10 = new hzm("GROUP", 9, hzn.i, 3);
        k = hzm9 = new hzm("MESSAGE", 10, hzn.i, 2);
        l = hzm8 = new hzm("BYTES", 11, hzn.g, 2);
        m = hzm7 = new hzm("UINT32", 12, hzn.a, 0);
        n = hzm6 = new hzm("ENUM", 13, hzn.h, 0);
        o = hzm5 = new hzm("SFIXED32", 14, hzn.a, 5);
        p = hzm4 = new hzm("SFIXED64", 15, hzn.b, 1);
        q = hzm3 = new hzm("SINT32", 16, hzn.a, 0);
        r = hzm2 = new hzm("SINT64", 17, hzn.b, 0);
        u = new hzm[]{hzm19, hzm18, hzm17, hzm16, hzm15, hzm14, hzm13, hzm12, hzm11, hzm10, hzm9, hzm8, hzm7, hzm6, hzm5, hzm4, hzm3, hzm2};
    }

    /*
     * WARNING - void declaration
     */
    private hzm() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.s = var3_2;
        this.t = var4_1;
    }

    public static hzm[] values() {
        return (hzm[])u.clone();
    }
}

