/*
 * Decompiled with CFR 0.152.
 */
public final class hwm
extends Enum {
    public static final /* enum */ hwm A;
    public static final /* enum */ hwm B;
    public static final /* enum */ hwm C;
    public static final /* enum */ hwm D;
    public static final /* enum */ hwm E;
    public static final /* enum */ hwm F;
    public static final /* enum */ hwm G;
    public static final /* enum */ hwm H;
    public static final /* enum */ hwm I;
    public static final /* enum */ hwm J;
    public static final /* enum */ hwm K;
    public static final /* enum */ hwm L;
    public static final /* enum */ hwm M;
    public static final /* enum */ hwm N;
    public static final /* enum */ hwm O;
    public static final /* enum */ hwm P;
    public static final /* enum */ hwm Q;
    public static final /* enum */ hwm R;
    public static final /* enum */ hwm S;
    public static final /* enum */ hwm T;
    public static final /* enum */ hwm U;
    public static final /* enum */ hwm V;
    public static final /* enum */ hwm W;
    public static final /* enum */ hwm X;
    public static final /* enum */ hwm Y;
    public static final /* enum */ hwm a;
    private static final hwm[] aa;
    private static final hwm[] ab;
    public static final /* enum */ hwm b;
    public static final /* enum */ hwm c;
    public static final /* enum */ hwm d;
    public static final /* enum */ hwm e;
    public static final /* enum */ hwm f;
    public static final /* enum */ hwm g;
    public static final /* enum */ hwm h;
    public static final /* enum */ hwm i;
    public static final /* enum */ hwm j;
    public static final /* enum */ hwm k;
    public static final /* enum */ hwm l;
    public static final /* enum */ hwm m;
    public static final /* enum */ hwm n;
    public static final /* enum */ hwm o;
    public static final /* enum */ hwm p;
    public static final /* enum */ hwm q;
    public static final /* enum */ hwm r;
    public static final /* enum */ hwm s;
    public static final /* enum */ hwm t;
    public static final /* enum */ hwm u;
    public static final /* enum */ hwm v;
    public static final /* enum */ hwm w;
    public static final /* enum */ hwm x;
    public static final /* enum */ hwm y;
    public static final /* enum */ hwm z;
    public final int Z;

    static {
        hwm hwm2;
        hwm hwm3;
        hwm hwm4;
        hwm hwm5;
        hwm hwm6;
        hwm hwm7;
        hwm hwm8;
        hwm hwm9;
        hwm hwm10;
        hwm hwm11;
        hwm hwm12;
        hwm hwm13;
        hwm hwm14;
        hwm hwm15;
        hwm hwm16;
        hwm hwm17;
        hwm hwm18;
        hwm hwm19;
        hwm hwm20;
        hwm hwm21;
        hwm hwm22;
        hwm hwm23;
        hwm hwm24;
        hwm hwm25;
        hwm hwm26;
        hwm hwm27;
        hwm hwm28;
        hwm hwm29;
        hwm hwm30;
        hwm hwm31;
        hwm hwm32;
        hwm hwm33;
        hwm hwm34;
        hwm hwm35;
        hwm hwm36;
        hwm hwm37;
        hwm hwm38;
        hwm hwm39;
        hwm hwm40;
        hwm hwm41;
        hwm hwm42;
        hwm hwm43;
        hwm hwm44;
        hwm hwm45;
        hwm hwm46;
        hwm hwm47;
        hwm hwm48;
        hwm hwm49;
        hwm hwm50;
        hwm hwm51;
        a = hwm51 = new hwm("DOUBLE", 0, 0, 1, hxp.e);
        b = hwm50 = new hwm("FLOAT", 1, 1, 1, hxp.d);
        c = hwm49 = new hwm("INT64", 2, 2, 1, hxp.c);
        d = hwm48 = new hwm("UINT64", 3, 3, 1, hxp.c);
        e = hwm47 = new hwm("INT32", 4, 4, 1, hxp.b);
        f = hwm46 = new hwm("FIXED64", 5, 5, 1, hxp.c);
        g = hwm45 = new hwm("FIXED32", 6, 6, 1, hxp.b);
        h = hwm44 = new hwm("BOOL", 7, 7, 1, hxp.f);
        i = hwm43 = new hwm("STRING", 8, 8, 1, hxp.g);
        j = hwm42 = new hwm("MESSAGE", 9, 9, 1, hxp.j);
        k = hwm41 = new hwm("BYTES", 10, 10, 1, hxp.h);
        l = hwm40 = new hwm("UINT32", 11, 11, 1, hxp.b);
        m = hwm39 = new hwm("ENUM", 12, 12, 1, hxp.i);
        n = hwm38 = new hwm("SFIXED32", 13, 13, 1, hxp.b);
        o = hwm37 = new hwm("SFIXED64", 14, 14, 1, hxp.c);
        p = hwm36 = new hwm("SINT32", 15, 15, 1, hxp.b);
        q = hwm35 = new hwm("SINT64", 16, 16, 1, hxp.c);
        r = hwm34 = new hwm("GROUP", 17, 17, 1, hxp.j);
        s = hwm33 = new hwm("DOUBLE_LIST", 18, 18, 2, hxp.e);
        t = hwm32 = new hwm("FLOAT_LIST", 19, 19, 2, hxp.d);
        u = hwm31 = new hwm("INT64_LIST", 20, 20, 2, hxp.c);
        v = hwm30 = new hwm("UINT64_LIST", 21, 21, 2, hxp.c);
        w = hwm29 = new hwm("INT32_LIST", 22, 22, 2, hxp.b);
        x = hwm28 = new hwm("FIXED64_LIST", 23, 23, 2, hxp.c);
        y = hwm27 = new hwm("FIXED32_LIST", 24, 24, 2, hxp.b);
        z = hwm26 = new hwm("BOOL_LIST", 25, 25, 2, hxp.f);
        A = hwm25 = new hwm("STRING_LIST", 26, 26, 2, hxp.g);
        B = hwm24 = new hwm("MESSAGE_LIST", 27, 27, 2, hxp.j);
        C = hwm23 = new hwm("BYTES_LIST", 28, 28, 2, hxp.h);
        D = hwm22 = new hwm("UINT32_LIST", 29, 29, 2, hxp.b);
        E = hwm21 = new hwm("ENUM_LIST", 30, 30, 2, hxp.i);
        F = hwm20 = new hwm("SFIXED32_LIST", 31, 31, 2, hxp.b);
        G = hwm19 = new hwm("SFIXED64_LIST", 32, 32, 2, hxp.c);
        H = hwm18 = new hwm("SINT32_LIST", 33, 33, 2, hxp.b);
        I = hwm17 = new hwm("SINT64_LIST", 34, 34, 2, hxp.c);
        J = hwm16 = new hwm("DOUBLE_LIST_PACKED", 35, 35, 3, hxp.e);
        K = hwm15 = new hwm("FLOAT_LIST_PACKED", 36, 36, 3, hxp.d);
        L = hwm14 = new hwm("INT64_LIST_PACKED", 37, 37, 3, hxp.c);
        M = hwm13 = new hwm("UINT64_LIST_PACKED", 38, 38, 3, hxp.c);
        N = hwm12 = new hwm("INT32_LIST_PACKED", 39, 39, 3, hxp.b);
        hwm[] hwmArray = new hwm("FIXED64_LIST_PACKED", 40, 40, 3, hxp.c);
        O = hwmArray;
        P = hwm11 = new hwm("FIXED32_LIST_PACKED", 41, 41, 3, hxp.b);
        Q = hwm10 = new hwm("BOOL_LIST_PACKED", 42, 42, 3, hxp.f);
        R = hwm9 = new hwm("UINT32_LIST_PACKED", 43, 43, 3, hxp.b);
        S = hwm8 = new hwm("ENUM_LIST_PACKED", 44, 44, 3, hxp.i);
        T = hwm7 = new hwm("SFIXED32_LIST_PACKED", 45, 45, 3, hxp.b);
        U = hwm6 = new hwm("SFIXED64_LIST_PACKED", 46, 46, 3, hxp.c);
        V = hwm5 = new hwm("SINT32_LIST_PACKED", 47, 47, 3, hxp.b);
        W = hwm4 = new hwm("SINT64_LIST_PACKED", 48, 48, 3, hxp.c);
        X = hwm3 = new hwm("GROUP_LIST", 49, 49, 2, hxp.j);
        Y = hwm2 = new hwm("MAP", 50, 50, 4, hxp.a);
        ab = new hwm[]{hwm51, hwm50, hwm49, hwm48, hwm47, hwm46, hwm45, hwm44, hwm43, hwm42, hwm41, hwm40, hwm39, hwm38, hwm37, hwm36, hwm35, hwm34, hwm33, hwm32, hwm31, hwm30, hwm29, hwm28, hwm27, hwm26, hwm25, hwm24, hwm23, hwm22, hwm21, hwm20, hwm19, hwm18, hwm17, hwm16, hwm15, hwm14, hwm13, hwm12, hwmArray, hwm11, hwm10, hwm9, hwm8, hwm7, hwm6, hwm5, hwm4, hwm3, hwm2};
        hwmArray = hwm.values();
        int n2 = hwmArray.length;
        aa = new hwm[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            hwm19 = hwmArray[i2];
            int n3 = hwm19.Z;
            hwm.aa[n3] = hwm19;
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hwm(hxp hxp2) {
        Object object;
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
        this.Z = (int)hxp2;
        void var2_4 = var4_2 - true;
        if (var2_4 == true || var2_4 == 3) {
            object = var5_3.k;
        }
        if (var4_2 == true) {
            object = hxp.a;
            var5_3.ordinal();
        }
    }

    public static hwm[] values() {
        return (hwm[])ab.clone();
    }
}

