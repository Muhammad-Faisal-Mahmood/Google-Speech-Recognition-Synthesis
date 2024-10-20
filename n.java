/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class n
extends r {
    protected final j af = new j();
    int ag;
    int ah;
    public int ai = 2;
    public boolean aj = false;
    public boolean ak = false;
    private q am;
    private int an = 0;
    private int ao = 0;
    private m[] ap = new m[4];
    private m[] aq = new m[4];
    private m[] ar = new m[4];
    private final boolean[] as = new boolean[3];
    private final m[] at = new m[4];

    private final int G(j object, m[] mArray, m m2, int n2, boolean[] blArray) {
        int n3;
        blArray[0] = true;
        blArray[1] = false;
        mArray[0] = null;
        mArray[2] = null;
        mArray[1] = null;
        mArray[3] = null;
        if (n2 == 0) {
            Object object2;
            Object object3;
            Object object4 = m2.i.b;
            boolean bl2 = object4 == null || object4.a == this;
            m2.ab = null;
            Object object5 = m2.K != 8 ? m2 : null;
            object4 = m2;
            n2 = 0;
            Object object6 = null;
            Object object7 = object5;
            while (true) {
                object3 = object5;
                object2 = object7;
                n3 = n2;
                if (object4.k.b == null) break;
                object4.ab = null;
                if (object4.K != 8) {
                    object3 = object5;
                    if (object5 == null) {
                        object3 = object4;
                    }
                    if (object7 != null && object7 != object4) {
                        ((m)object7).ab = object4;
                    }
                    object7 = object4;
                    object5 = object3;
                } else {
                    object3 = object4.i;
                    ((j)object).n(object3.f, object3.b.f, 0, 5);
                    ((j)object).n(object4.k.f, object4.i.f, 0, 5);
                }
                int n4 = n2;
                if (object4.K != 8) {
                    n4 = n2;
                    if (object4.ad == 3) {
                        if (object4.ae == 3) {
                            blArray[0] = false;
                        }
                        n4 = n2;
                        if (object4.u <= 0.0f) {
                            blArray[0] = false;
                            n4 = n2 + 1;
                            object3 = this.ap;
                            n3 = ((m[])object3).length;
                            if (n4 >= n3) {
                                this.ap = Arrays.copyOf(object3, n3 + n3);
                            }
                            this.ap[n2] = object4;
                        }
                    }
                }
                m m3 = object4.k.b.a;
                l l2 = m3.i.b;
                if (l2 == null) {
                    object3 = object5;
                    object2 = object7;
                    n3 = n4;
                    break;
                }
                object3 = object5;
                object2 = object7;
                n3 = n4;
                if (l2.a != object4) break;
                object3 = object5;
                object2 = object7;
                n3 = n4;
                if (m3 == object4) break;
                object3 = object4 = m3;
                object6 = object4;
                object4 = object3;
                n2 = n4;
            }
            object = object4.k.b;
            boolean bl3 = bl2;
            if (object != null) {
                bl3 = bl2;
                if (((l)object).a != this) {
                    bl3 = false;
                }
            }
            if (m2.i.b == null || ((m)object6).k.b == null) {
                blArray[1] = true;
            }
            m2.X = bl3;
            ((m)object6).ab = null;
            mArray[0] = m2;
            mArray[2] = object3;
            mArray[1] = object6;
            mArray[3] = object2;
        } else {
            Object object8;
            Object object9;
            Object object10 = m2.j.b;
            boolean bl4 = object10 == null || object10.a == this;
            m2.ac = null;
            Object object11 = m2.K != 8 ? m2 : null;
            object10 = m2;
            n2 = 0;
            Object object12 = null;
            Object object13 = object11;
            while (true) {
                int n5;
                object9 = object11;
                object8 = object13;
                n3 = n2;
                if (object10.l.b == null) break;
                object10.ac = null;
                if (object10.K != 8) {
                    object9 = object11;
                    if (object11 == null) {
                        object9 = object10;
                    }
                    if (object13 != null && object13 != object10) {
                        ((m)object13).ac = object10;
                    }
                    object13 = object10;
                    object11 = object9;
                } else {
                    object9 = object10.j;
                    ((j)object).n(object9.f, object9.b.f, 0, 5);
                    ((j)object).n(object10.l.f, object10.j.f, 0, 5);
                }
                if (object10.K != 8 && object10.ae == 3) {
                    if (object10.ad == 3) {
                        blArray[0] = false;
                    }
                    n5 = n2;
                    if (object10.u <= 0.0f) {
                        blArray[0] = false;
                        n5 = n2 + 1;
                        object9 = this.ap;
                        n3 = ((m[])object9).length;
                        if (n5 >= n3) {
                            this.ap = Arrays.copyOf(object9, n3 + n3);
                        }
                        this.ap[n2] = object10;
                    }
                } else {
                    n5 = n2;
                }
                m m4 = object10.l.b.a;
                l l3 = m4.j.b;
                if (l3 == null) {
                    object9 = object11;
                    object8 = object13;
                    n3 = n5;
                    break;
                }
                object9 = object11;
                object8 = object13;
                n3 = n5;
                if (l3.a != object10) break;
                object9 = object11;
                object8 = object13;
                n3 = n5;
                if (m4 == object10) break;
                object9 = object10 = m4;
                object12 = object10;
                object10 = object9;
                n2 = n5;
            }
            object = object10.l.b;
            boolean bl5 = bl4;
            if (object != null) {
                bl5 = bl4;
                if (((l)object).a != this) {
                    bl5 = false;
                }
            }
            if (m2.j.b == null || ((m)object12).l.b == null) {
                blArray[1] = true;
            }
            m2.Y = bl5;
            ((m)object12).ac = null;
            mArray[0] = m2;
            mArray[2] = object9;
            mArray[1] = object12;
            mArray[3] = object8;
        }
        return n3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final void H(j var1_1) {
        var9_2 = 0;
        block0: for (var10_3 = 0; var10_3 < this.an; ++var10_3) {
            block79: {
                block77: {
                    block80: {
                        block81: {
                            block78: {
                                block68: {
                                    block67: {
                                        var20_20 = this.ar[var10_3];
                                        var15_15 = this.G(var1_1, this.at, (m)var20_20, 0, this.as);
                                        var18_18 = this.at[2];
                                        if (var18_18 == null) {
                                            var11_11 = var9_2;
lbl8:
                                            // 6 sources

                                            while (true) {
                                                var9_2 = var11_11;
                                                continue block0;
                                                break;
                                            }
                                        }
                                        var17_17 /* !! */  = this.as;
                                        if (!var17_17 /* !! */ [1]) break block67;
                                        var12_12 = var20_20.b();
                                        while (true) {
                                            var11_11 = var9_2;
                                            if (var18_18 == null) ** GOTO lbl8
                                            var1_1.h(var18_18.i.f, var12_12);
                                            var19_19 = var18_18.i;
                                            var17_17 /* !! */  = (boolean[])var18_18.ab;
                                            var12_12 += var19_19.a() + var18_18.h() + var18_18.k.a();
                                            var18_18 = var17_17 /* !! */ ;
                                        }
                                    }
                                    var13_13 = var20_20.V;
                                    var12_12 = var13_13 == 0 ? 1 : var9_2;
                                    var11_11 = var13_13 == 2 ? 1 : var9_2;
                                    var14_14 = this.ad;
                                    var16_16 = this.ai;
                                    var2_4 = 0.0f;
                                    if (var16_16 != 2 && var16_16 != 8 || !var17_17 /* !! */ [var9_2] || !var20_20.X || var11_11 != 0 || var14_14 == 2 || var13_13 != 0) break block68;
                                    var3_5 = 0.0f;
                                    var17_17 /* !! */  = (boolean[])var20_20;
                                    var13_13 = var11_11 = var9_2;
                                    var19_19 = null;
                                    var14_14 = var11_11;
                                    while (var17_17 /* !! */  != null) {
                                        block69: {
                                            block70: {
                                                if (var17_17 /* !! */ .K != 8) {
                                                    ++var14_14;
                                                    if (var17_17 /* !! */ .ad != 3) {
                                                        var16_16 = var17_17 /* !! */ .h();
                                                        var18_18 = var17_17 /* !! */ .i;
                                                        var11_11 = var18_18.b != null ? var18_18.a() : var9_2;
                                                        var18_18 = var17_17 /* !! */ .k;
                                                        var12_12 = var18_18.b != null ? var18_18.a() : var9_2;
                                                        var13_13 = var13_13 + var16_16 + var11_11 + var12_12;
                                                    } else {
                                                        var3_5 += var17_17 /* !! */ .Z;
                                                    }
                                                }
                                                var18_18 = var17_17 /* !! */ .k.b;
                                                var19_19 = var18_18 != null ? var18_18.a : null;
                                                var18_18 = var19_19;
                                                if (var19_19 == null) break block69;
                                                var21_21 = var19_19.i.b;
                                                if (var21_21 == null) break block70;
                                                var18_18 = var19_19;
                                                if (var21_21.a == var17_17 /* !! */ ) break block69;
                                            }
                                            var18_18 = null;
                                        }
                                        var19_19 = var17_17 /* !! */ ;
                                        var17_17 /* !! */  = var18_18;
                                    }
                                    if (var19_19 != null) {
                                        var17_17 /* !! */  = (boolean[])var19_19.k.b;
                                        var11_11 = var17_17 /* !! */  != null ? var17_17 /* !! */ .a.w : var9_2;
                                        var12_12 = var11_11;
                                        if (var17_17 /* !! */  != null) {
                                            var12_12 = var11_11;
                                            if (var17_17 /* !! */ .a == this) {
                                                var12_12 = this.g();
                                            }
                                        }
                                    } else {
                                        var12_12 = var9_2;
                                    }
                                    var4_6 = var13_13;
                                    var2_4 = var14_14 + 1;
                                    var6_8 = (float)var12_12 - var4_6;
                                    if (var15_15 == 0) {
                                        var4_6 = var2_4 = var6_8 / var2_4;
                                    } else {
                                        var4_6 = var6_8 / (float)var15_15;
                                        var2_4 = 0.0f;
                                    }
                                    while (true) {
                                        block76: {
                                            block71: {
                                                block75: {
                                                    block74: {
                                                        block72: {
                                                            block73: {
                                                                var11_11 = var9_2;
                                                                if (var20_20 == null) ** GOTO lbl8
                                                                var17_17 /* !! */  = var20_20.i;
                                                                var11_11 = var17_17 /* !! */ .b != null ? var17_17 /* !! */ .a() : var9_2;
                                                                var17_17 /* !! */  = var20_20.k;
                                                                var12_12 = var17_17 /* !! */ .b != null ? var17_17 /* !! */ .a() : var9_2;
                                                                if (var20_20.K == 8) break block71;
                                                                var7_9 = var12_12;
                                                                var8_10 = var11_11;
                                                                var5_7 = var2_4 + var8_10;
                                                                var1_1.h(var20_20.i.f, (int)(var5_7 + 0.5f));
                                                                if (var20_20.ad != 3) break block72;
                                                                if (var3_5 != 0.0f) break block73;
                                                                var2_4 = var4_6 - var8_10 - var7_9;
                                                                break block74;
                                                            }
                                                            var2_4 = var5_7 + (var20_20.Z * var6_8 / var3_5 - var8_10 - var7_9);
                                                            break block75;
                                                        }
                                                        var2_4 = var20_20.h();
                                                    }
                                                    var2_4 = var5_7 + var2_4;
                                                }
                                                var1_1.h(var20_20.k.f, (int)(var2_4 + 0.5f));
                                                var5_7 = var2_4;
                                                if (var15_15 == 0) {
                                                    var5_7 = var2_4 + var4_6;
                                                }
                                                var2_4 = var5_7 + var7_9;
                                                break block76;
                                            }
                                            var5_7 = var4_6 / 2.0f;
                                            var17_17 /* !! */  = var20_20.i.f;
                                            var11_11 = (int)(var2_4 - var5_7 + 0.5f);
                                            var1_1.h((k)var17_17 /* !! */ , var11_11);
                                            var1_1.h(var20_20.k.f, var11_11);
                                        }
                                        var17_17 /* !! */  = var20_20.k.b;
                                        var17_17 /* !! */  = var17_17 /* !! */  != null ? var17_17 /* !! */ .a : null;
                                        var18_18 = var17_17 /* !! */  != null && (var18_18 = var17_17 /* !! */ .i.b) != null && var18_18.a != var20_20 ? null : var17_17 /* !! */ ;
                                        var17_17 /* !! */  = var18_18;
                                        if (var18_18 == this) {
                                            var17_17 /* !! */  = null;
                                        }
                                        var20_20 = var17_17 /* !! */ ;
                                    }
                                }
                                if (var15_15 == 0) break block77;
                                if (var11_11 == 0) break block78;
                                var19_19 = var18_18;
                                var21_21 = null;
                                var17_17 /* !! */  = null;
                                var22_22 = var20_20;
                                break block79;
                            }
                            var17_17 /* !! */  = null;
                            while (var18_18 != null) {
                                if (var18_18.ad != 3) {
                                    var11_11 = var12_12 = var18_18.i.a();
                                    if (var17_17 /* !! */  != null) {
                                        var11_11 = var12_12 + var17_17 /* !! */ .k.a();
                                    }
                                    var19_19 = var18_18.i;
                                    var17_17 /* !! */  = (boolean[])var19_19.b;
                                    var12_12 = var17_17 /* !! */ .a.ad == 3 ? 2 : 3;
                                    var1_1.i(var19_19.f, var17_17 /* !! */ .f, var11_11, var12_12);
                                    var17_17 /* !! */  = var18_18.k;
                                    var12_12 = var17_17 /* !! */ .a();
                                    var17_17 /* !! */  = var17_17 /* !! */ .b.a.i;
                                    var19_19 = var17_17 /* !! */ .b;
                                    var11_11 = var12_12;
                                    if (var19_19 != null) {
                                        var11_11 = var12_12;
                                        if (var19_19.a == var18_18) {
                                            var11_11 = var12_12 + var17_17 /* !! */ .a();
                                        }
                                    }
                                    var19_19 = var18_18.k;
                                    var17_17 /* !! */  = var19_19.b;
                                    var12_12 = var17_17 /* !! */ .a.ad == 3 ? 2 : 3;
                                    var1_1.j(var19_19.f, var17_17 /* !! */ .f, -var11_11, var12_12);
                                } else {
                                    var2_4 += var18_18.Z;
                                    var17_17 /* !! */  = (boolean[])var18_18.k;
                                    if (var17_17 /* !! */ .b != null) {
                                        var11_11 = var12_12 = var17_17 /* !! */ .a();
                                        if (var18_18 != this.at[3]) {
                                            var11_11 = var12_12 + var18_18.k.b.a.i.a();
                                        }
                                    } else {
                                        var11_11 = var9_2;
                                    }
                                    var17_17 /* !! */  = (boolean[])var18_18.k;
                                    var19_19 = var18_18.i;
                                    var1_1.i(var17_17 /* !! */ .f, var19_19.f, var9_2, 1);
                                    var17_17 /* !! */  = var18_18.k;
                                    var1_1.j(var17_17 /* !! */ .f, var17_17 /* !! */ .b.f, -var11_11, 1);
                                }
                                var19_19 = var18_18.ab;
                                var17_17 /* !! */  = var18_18;
                                var18_18 = var19_19;
                            }
                            if (var15_15 != 1) break block80;
                            var18_18 = this.ap[var9_2];
                            var12_12 = var18_18.i.a();
                            var17_17 /* !! */  = (boolean[])var18_18.i.b;
                            var11_11 = var12_12;
                            if (var17_17 /* !! */  != null) {
                                var11_11 = var12_12 + var17_17 /* !! */ .a();
                            }
                            var13_13 = var18_18.k.a();
                            var17_17 /* !! */  = var18_18.k.b;
                            var12_12 = var13_13;
                            if (var17_17 /* !! */  != null) {
                                var12_12 = var13_13 + var17_17 /* !! */ .a();
                            }
                            var17_17 /* !! */  = var20_20.k.b.f;
                            var19_19 = this.at;
                            if (var18_18 == var19_19[3]) {
                                var17_17 /* !! */  = var19_19[1].k.b.f;
                            }
                            var12_12 = -var12_12;
                            if (var18_18.c != 1) break block81;
                            var18_18 = var20_20.i;
                            var1_1.i(var18_18.f, var18_18.b.f, var11_11, 1);
                            var1_1.j(var20_20.k.f, (k)var17_17 /* !! */ , var12_12, 1);
                            var1_1.n(var20_20.k.f, var20_20.i.f, var20_20.h(), 2);
                            var11_11 = var9_2;
                            ** GOTO lbl8
                        }
                        var19_19 = var18_18.i;
                        var1_1.n(var19_19.f, var19_19.b.f, var11_11, 1);
                        var1_1.n(var18_18.k.f, (k)var17_17 /* !! */ , var12_12, 1);
                        var11_11 = var9_2;
                        ** GOTO lbl8
                    }
                    var13_13 = var9_2;
                    var12_12 = var15_15;
                    while (true) {
                        var14_14 = var12_12 - 1;
                        var11_11 = var9_2;
                        if (var13_13 < var14_14) ** break;
                        ** continue;
                        var17_17 /* !! */  = (boolean[])this.ap;
                        var19_19 = var17_17 /* !! */ [var13_13];
                        var21_21 = var17_17 /* !! */ [++var13_13];
                        var18_18 = var19_19.i;
                        var24_24 = var18_18.f;
                        var23_23 = var19_19.k.f;
                        var22_22 = var21_21.i.f;
                        var17_17 /* !! */  = var21_21.k.f;
                        var25_25 = this.at;
                        if (var21_21 == var25_25[3]) {
                            var17_17 /* !! */  = var25_25[1].k.f;
                        }
                        var11_11 = var18_18.a();
                        var18_18 = var19_19.i.b;
                        var9_2 = var11_11;
                        if (var18_18 != null) {
                            var25_25 = var18_18.a.k;
                            var18_18 = var25_25.b;
                            var9_2 = var11_11;
                            if (var18_18 != null) {
                                var9_2 = var11_11;
                                if (var18_18.a == var19_19) {
                                    var9_2 = var11_11 + var25_25.a();
                                }
                            }
                        }
                        var1_1.i((k)var24_24, var19_19.i.b.f, var9_2, 2);
                        var9_2 = var11_11 = var19_19.k.a();
                        if (var19_19.k.b != null) {
                            var18_18 = var19_19.ab;
                            var9_2 = var11_11;
                            if (var18_18 != null) {
                                var18_18 = var18_18.i;
                                var9_2 = var18_18.b != null ? var18_18.a() : 0;
                                var9_2 = var11_11 + var9_2;
                            }
                        }
                        var1_1.j((k)var23_23, var19_19.k.b.f, -var9_2, 2);
                        if (var13_13 == var14_14) {
                            var11_11 = var21_21.i.a();
                            var18_18 = var21_21.i.b;
                            var9_2 = var11_11;
                            if (var18_18 != null) {
                                var25_25 = var18_18.a.k;
                                var18_18 = var25_25.b;
                                var9_2 = var11_11;
                                if (var18_18 != null) {
                                    var9_2 = var11_11;
                                    if (var18_18.a == var21_21) {
                                        var9_2 = var11_11 + var25_25.a();
                                    }
                                }
                            }
                            var1_1.i((k)var22_22, var21_21.i.b.f, var9_2, 2);
                            var18_18 = var21_21.k;
                            var25_25 = this.at;
                            if (var21_21 == var25_25[3]) {
                                var18_18 = var25_25[1].k;
                            }
                            var11_11 = var18_18.a();
                            var25_25 = var18_18.b;
                            var9_2 = var11_11;
                            if (var25_25 != null) {
                                var26_26 = var25_25.a.i;
                                var25_25 = var26_26.b;
                                var9_2 = var11_11;
                                if (var25_25 != null) {
                                    var9_2 = var11_11;
                                    if (var25_25.a == var21_21) {
                                        var9_2 = var11_11 + var26_26.a();
                                    }
                                }
                            }
                            var1_1.j((k)var17_17 /* !! */ , var18_18.b.f, -var9_2, 2);
                        }
                        if ((var9_2 = var20_20.f) > 0) {
                            var1_1.j((k)var23_23, (k)var24_24, var9_2, 2);
                        }
                        var18_18 = var1_1.a();
                        var18_18.f(var19_19.Z, var2_4, var21_21.Z, (k)var24_24, var19_19.i.a(), (k)var23_23, var19_19.k.a(), (k)var22_22, var21_21.i.a(), (k)var17_17 /* !! */ , var21_21.k.a());
                        var1_1.g((h)var18_18);
                        var9_2 = 0;
                    }
                }
                var19_19 = var18_18;
                var21_21 = null;
                var17_17 /* !! */  = null;
                var9_2 = 0;
                var22_22 = var20_20;
            }
            while ((var23_23 = var19_19) != null) {
                block66: {
                    block86: {
                        block83: {
                            block84: {
                                block85: {
                                    block82: {
                                        var19_19 = var23_23.ab;
                                        if (var19_19 == null) {
                                            var21_21 = this.at[1];
                                            var9_2 = 1;
                                        }
                                        if (var11_11 == 0) break block82;
                                        var20_20 = var23_23.i;
                                        var13_13 = var14_14 = var20_20.a();
                                        if (var17_17 /* !! */  != null) {
                                            var13_13 = var14_14 + var17_17 /* !! */ .k.a();
                                        }
                                        var14_14 = var18_18 != var23_23 ? 3 : 1;
                                        var1_1.i(var20_20.f, var20_20.b.f, var13_13, var14_14);
                                        if (var23_23.ad == 3) {
                                            var17_17 /* !! */  = var23_23.k;
                                            if (var23_23.c == 1) {
                                                var13_13 = Math.max(var23_23.e, var23_23.h());
                                                var1_1.n(var17_17 /* !! */ .f, var20_20.f, var13_13, 3);
                                            } else {
                                                var1_1.i(var20_20.f, var20_20.b.f, var20_20.c, 3);
                                                var1_1.j(var17_17 /* !! */ .f, var20_20.f, var23_23.e, 3);
                                            }
                                        }
                                        break block83;
                                    }
                                    var20_20 = var17_17 /* !! */ ;
                                    if (var12_12 != 0) break block84;
                                    var20_20 = var17_17 /* !! */ ;
                                    if (var9_2 == 0) break block84;
                                    if (var17_17 /* !! */  == null) break block85;
                                    var17_17 /* !! */  = var23_23.k;
                                    if (var17_17 /* !! */ .b == null) {
                                        var1_1.h(var17_17 /* !! */ .f, var23_23.b() + var23_23.y);
                                    } else {
                                        var13_13 = var17_17 /* !! */ .a();
                                        var1_1.n(var23_23.k.f, var21_21.k.b.f, -var13_13, 5);
                                    }
                                    break block83;
                                }
                                var20_20 = null;
                            }
                            if (var12_12 != 0 || var9_2 != 0 || var20_20 != null) break block86;
                            var17_17 /* !! */  = var23_23.i;
                            if (var17_17 /* !! */ .b == null) {
                                var1_1.h(var17_17 /* !! */ .f, var23_23.b());
                            } else {
                                var13_13 = var17_17 /* !! */ .a();
                                var1_1.n(var23_23.i.f, var22_22.i.b.f, var13_13, 5);
                            }
                        }
lbl333:
                        // 4 sources

                        while (true) {
                            var17_17 /* !! */  = var19_19;
                            break block66;
                            break;
                        }
                    }
                    var25_25 = var23_23.i;
                    var26_26 = var23_23.k;
                    var13_13 = var25_25.a();
                    var14_14 = var26_26.a();
                    var1_1.i(var25_25.f, var25_25.b.f, var13_13, 1);
                    var1_1.j(var26_26.f, var26_26.b.f, -var14_14, 1);
                    var17_17 /* !! */  = var25_25.b;
                    var17_17 /* !! */  = var17_17 /* !! */  != null ? var17_17 /* !! */ .f : null;
                    if (var20_20 != null) ** GOTO lbl351
                    var17_17 /* !! */  = (boolean[])var22_22.i.b;
                    if (var17_17 /* !! */  == null) {
                        var24_24 = null;
                    } else {
                        var17_17 /* !! */  = var17_17 /* !! */ .f;
lbl351:
                        // 2 sources

                        var24_24 = var17_17 /* !! */ ;
                    }
                    var17_17 /* !! */  = var19_19;
                    if (var19_19 == null) {
                        var17_17 /* !! */  = (boolean[])var21_21.k.b;
                        var17_17 /* !! */  = var17_17 /* !! */  != null ? var17_17 /* !! */ .a : null;
                    }
                    var19_19 = var17_17 /* !! */ ;
                    if (var17_17 /* !! */  == null) ** GOTO lbl333
                    var20_20 = var17_17 /* !! */ .i.f;
                    if (var9_2 != 0) {
                        var19_19 = var21_21.k.b;
                        var20_20 = var19_19 != null ? var19_19.f : null;
                    }
                    var19_19 = var17_17 /* !! */ ;
                    if (var24_24 == null) ** GOTO lbl333
                    var19_19 = var17_17 /* !! */ ;
                    if (var20_20 != null) ** break;
                    ** continue;
                    var1_1.m(var25_25.f, (k)var24_24, var13_13, 0.5f, (k)var20_20, var26_26.f, var14_14);
                }
                if (1 == var9_2) {
                    var17_17 /* !! */  = null;
                }
                var19_19 = var17_17 /* !! */ ;
                var17_17 /* !! */  = var23_23;
            }
            var12_12 = var10_3;
            var13_13 = 0;
            var10_3 = var12_12;
            var9_2 = var13_13;
            if (var11_11 == 0) continue;
            var20_20 = var18_18.i;
            var19_19 = var21_21.k;
            var14_14 = var20_20.a();
            var11_11 = var19_19.a();
            var17_17 /* !! */  = (boolean[])var22_22.i.b;
            var17_17 /* !! */  = var17_17 /* !! */  != null ? var17_17 /* !! */ .f : null;
            var18_18 = var21_21.k.b;
            var18_18 = var18_18 != null ? var18_18.f : null;
            var10_3 = var12_12;
            var9_2 = var13_13;
            if (var17_17 /* !! */  == null) continue;
            var10_3 = var12_12;
            var9_2 = var13_13;
            if (var18_18 == null) continue;
            var1_1.j(var19_19.f, (k)var18_18, -var11_11, 1);
            var1_1.m(var20_20.f, (k)var17_17 /* !! */ , var14_14, var22_22.H, (k)var18_18, var19_19.f, var11_11);
            var9_2 = var13_13;
            var10_3 = var12_12;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final void I(j var1_1) {
        var9_2 = 0;
        block0: for (var10_3 = 0; var10_3 < this.ao; ++var10_3) {
            block84: {
                block82: {
                    block85: {
                        block86: {
                            block83: {
                                block73: {
                                    block72: {
                                        var20_20 = this.aq[var10_3];
                                        var15_15 = this.G(var1_1, this.at, (m)var20_20, 1, this.as);
                                        var18_18 = this.at[2];
                                        if (var18_18 == null) {
                                            var11_11 = var9_2;
lbl8:
                                            // 6 sources

                                            while (true) {
                                                var9_2 = var11_11;
                                                continue block0;
                                                break;
                                            }
                                        }
                                        var17_17 /* !! */  = this.as;
                                        if (!var17_17 /* !! */ [1]) break block72;
                                        var12_12 = var20_20.c();
                                        while (true) {
                                            var11_11 = var9_2;
                                            if (var18_18 == null) ** GOTO lbl8
                                            var1_1.h(var18_18.j.f, var12_12);
                                            var19_19 = var18_18.j;
                                            var17_17 /* !! */  = (boolean[])var18_18.ac;
                                            var12_12 += var19_19.a() + var18_18.d() + var18_18.l.a();
                                            var18_18 = var17_17 /* !! */ ;
                                        }
                                    }
                                    var11_11 = var20_20.W;
                                    var13_13 = var11_11 == 0 ? 1 : var9_2;
                                    var12_12 = var11_11 == 2 ? 1 : var9_2;
                                    var16_16 = this.ae;
                                    var14_14 = this.ai;
                                    var2_4 = 0.0f;
                                    if (var14_14 != 2 && var14_14 != 8 || !var17_17 /* !! */ [var9_2] || !var20_20.Y || var12_12 != 0 || var16_16 == 2 || var11_11 != 0) break block73;
                                    var3_5 = 0.0f;
                                    var17_17 /* !! */  = (boolean[])var20_20;
                                    var13_13 = var11_11 = var9_2;
                                    var19_19 = null;
                                    var14_14 = var11_11;
                                    while (var17_17 /* !! */  != null) {
                                        block74: {
                                            block75: {
                                                if (var17_17 /* !! */ .K != 8) {
                                                    ++var14_14;
                                                    if (var17_17 /* !! */ .ae != 3) {
                                                        var16_16 = var17_17 /* !! */ .d();
                                                        var18_18 = var17_17 /* !! */ .j;
                                                        var11_11 = var18_18.b != null ? var18_18.a() : var9_2;
                                                        var18_18 = var17_17 /* !! */ .l;
                                                        var12_12 = var18_18.b != null ? var18_18.a() : var9_2;
                                                        var13_13 = var13_13 + var16_16 + var11_11 + var12_12;
                                                    } else {
                                                        var3_5 += var17_17 /* !! */ .aa;
                                                    }
                                                }
                                                var18_18 = var17_17 /* !! */ .l.b;
                                                var19_19 = var18_18 != null ? var18_18.a : null;
                                                var18_18 = var19_19;
                                                if (var19_19 == null) break block74;
                                                var21_21 = var19_19.j.b;
                                                if (var21_21 == null) break block75;
                                                var18_18 = var19_19;
                                                if (var21_21.a == var17_17 /* !! */ ) break block74;
                                            }
                                            var18_18 = null;
                                        }
                                        var19_19 = var17_17 /* !! */ ;
                                        var17_17 /* !! */  = var18_18;
                                    }
                                    if (var19_19 != null) {
                                        var17_17 /* !! */  = (boolean[])var19_19.l.b;
                                        var12_12 = var17_17 /* !! */  != null ? var17_17 /* !! */ .a.w : var9_2;
                                        var11_11 = var12_12;
                                        if (var17_17 /* !! */  != null) {
                                            var11_11 = var12_12;
                                            if (var17_17 /* !! */ .a == this) {
                                                var11_11 = this.a();
                                            }
                                        }
                                    } else {
                                        var11_11 = var9_2;
                                    }
                                    var4_6 = var13_13;
                                    var2_4 = var14_14 + 1;
                                    var6_8 = (float)var11_11 - var4_6;
                                    if (var15_15 == 0) {
                                        var4_6 = var2_4 = var6_8 / var2_4;
                                        var18_18 = var20_20;
                                    } else {
                                        var4_6 = var6_8 / (float)var15_15;
                                        var2_4 = 0.0f;
                                        var18_18 = var20_20;
                                    }
                                    while (true) {
                                        block81: {
                                            block76: {
                                                block80: {
                                                    block79: {
                                                        block77: {
                                                            block78: {
                                                                var11_11 = var9_2;
                                                                if (var18_18 == null) ** GOTO lbl8
                                                                var17_17 /* !! */  = var18_18.j;
                                                                var11_11 = var17_17 /* !! */ .b != null ? var17_17 /* !! */ .a() : var9_2;
                                                                var17_17 /* !! */  = var18_18.l;
                                                                var12_12 = var17_17 /* !! */ .b != null ? var17_17 /* !! */ .a() : var9_2;
                                                                if (var18_18.K == 8) break block76;
                                                                var7_9 = var12_12;
                                                                var8_10 = var11_11;
                                                                var5_7 = var2_4 + var8_10;
                                                                var1_1.h(var18_18.j.f, (int)(var5_7 + 0.5f));
                                                                if (var18_18.ae != 3) break block77;
                                                                if (var3_5 != 0.0f) break block78;
                                                                var2_4 = var4_6 - var8_10 - var7_9;
                                                                break block79;
                                                            }
                                                            var2_4 = var5_7 + (var18_18.aa * var6_8 / var3_5 - var8_10 - var7_9);
                                                            break block80;
                                                        }
                                                        var2_4 = var18_18.d();
                                                    }
                                                    var2_4 = var5_7 + var2_4;
                                                }
                                                var1_1.h(var18_18.l.f, (int)(var2_4 + 0.5f));
                                                var5_7 = var2_4;
                                                if (var15_15 == 0) {
                                                    var5_7 = var2_4 + var4_6;
                                                }
                                                var2_4 = var5_7 + var7_9;
                                                break block81;
                                            }
                                            var5_7 = var4_6 / 2.0f;
                                            var17_17 /* !! */  = var18_18.j.f;
                                            var11_11 = (int)(var2_4 - var5_7 + 0.5f);
                                            var1_1.h((k)var17_17 /* !! */ , var11_11);
                                            var1_1.h(var18_18.l.f, var11_11);
                                        }
                                        var17_17 /* !! */  = var18_18.l.b;
                                        var17_17 /* !! */  = var17_17 /* !! */  != null ? var17_17 /* !! */ .a : null;
                                        if (var17_17 /* !! */  != null && (var19_19 = var17_17 /* !! */ .j.b) != null && var19_19.a != var18_18) {
                                            var17_17 /* !! */  = null;
                                        }
                                        var18_18 = var17_17 /* !! */ ;
                                        if (var17_17 /* !! */  != this) continue;
                                        var18_18 = null;
                                    }
                                }
                                if (var15_15 == 0) break block82;
                                if (var12_12 == 0) break block83;
                                var19_19 = var18_18;
                                var21_21 = null;
                                var17_17 /* !! */  = null;
                                var22_22 = var20_20;
                                break block84;
                            }
                            var17_17 /* !! */  = null;
                            while (var18_18 != null) {
                                if (var18_18.ae != 3) {
                                    var11_11 = var12_12 = var18_18.j.a();
                                    if (var17_17 /* !! */  != null) {
                                        var11_11 = var12_12 + var17_17 /* !! */ .l.a();
                                    }
                                    var19_19 = var18_18.j;
                                    var17_17 /* !! */  = (boolean[])var19_19.b;
                                    var12_12 = var17_17 /* !! */ .a.ae == 3 ? 2 : 3;
                                    var1_1.i(var19_19.f, var17_17 /* !! */ .f, var11_11, var12_12);
                                    var17_17 /* !! */  = var18_18.l;
                                    var12_12 = var17_17 /* !! */ .a();
                                    var17_17 /* !! */  = var17_17 /* !! */ .b.a.j;
                                    var19_19 = var17_17 /* !! */ .b;
                                    var11_11 = var12_12;
                                    if (var19_19 != null) {
                                        var11_11 = var12_12;
                                        if (var19_19.a == var18_18) {
                                            var11_11 = var12_12 + var17_17 /* !! */ .a();
                                        }
                                    }
                                    var17_17 /* !! */  = var18_18.l;
                                    var19_19 = var17_17 /* !! */ .b;
                                    var12_12 = var19_19.a.ae == 3 ? 2 : 3;
                                    var1_1.j(var17_17 /* !! */ .f, var19_19.f, -var11_11, var12_12);
                                } else {
                                    var2_4 += var18_18.aa;
                                    var17_17 /* !! */  = (boolean[])var18_18.l;
                                    if (var17_17 /* !! */ .b != null) {
                                        var11_11 = var12_12 = var17_17 /* !! */ .a();
                                        if (var18_18 != this.at[3]) {
                                            var11_11 = var12_12 + var18_18.l.b.a.j.a();
                                        }
                                    } else {
                                        var11_11 = var9_2;
                                    }
                                    var17_17 /* !! */  = (boolean[])var18_18.l;
                                    var19_19 = var18_18.j;
                                    var1_1.i(var17_17 /* !! */ .f, var19_19.f, var9_2, 1);
                                    var17_17 /* !! */  = var18_18.l;
                                    var1_1.j(var17_17 /* !! */ .f, var17_17 /* !! */ .b.f, -var11_11, 1);
                                }
                                var19_19 = var18_18.ac;
                                var17_17 /* !! */  = var18_18;
                                var18_18 = var19_19;
                            }
                            if (var15_15 != 1) break block85;
                            var18_18 = this.ap[var9_2];
                            var12_12 = var18_18.j.a();
                            var17_17 /* !! */  = (boolean[])var18_18.j.b;
                            var11_11 = var12_12;
                            if (var17_17 /* !! */  != null) {
                                var11_11 = var12_12 + var17_17 /* !! */ .a();
                            }
                            var13_13 = var18_18.l.a();
                            var17_17 /* !! */  = var18_18.l.b;
                            var12_12 = var13_13;
                            if (var17_17 /* !! */  != null) {
                                var12_12 = var13_13 + var17_17 /* !! */ .a();
                            }
                            var17_17 /* !! */  = var20_20.l.b.f;
                            var19_19 = this.at;
                            if (var18_18 == var19_19[3]) {
                                var17_17 /* !! */  = var19_19[1].l.b.f;
                            }
                            var12_12 = -var12_12;
                            if (var18_18.d != 1) break block86;
                            var18_18 = var20_20.j;
                            var1_1.i(var18_18.f, var18_18.b.f, var11_11, 1);
                            var1_1.j(var20_20.l.f, (k)var17_17 /* !! */ , var12_12, 1);
                            var1_1.n(var20_20.l.f, var20_20.j.f, var20_20.d(), 2);
                            var11_11 = var9_2;
                            ** GOTO lbl8
                        }
                        var19_19 = var18_18.j;
                        var1_1.n(var19_19.f, var19_19.b.f, var11_11, 1);
                        var1_1.n(var18_18.l.f, (k)var17_17 /* !! */ , var12_12, 1);
                        var11_11 = var9_2;
                        ** GOTO lbl8
                    }
                    var13_13 = var9_2;
                    var12_12 = var15_15;
                    while (true) {
                        var14_14 = var12_12 - 1;
                        var11_11 = var9_2;
                        if (var13_13 < var14_14) ** break;
                        ** continue;
                        var17_17 /* !! */  = (boolean[])this.ap;
                        var19_19 = var17_17 /* !! */ [var13_13];
                        var21_21 = var17_17 /* !! */ [++var13_13];
                        var18_18 = var19_19.j;
                        var23_23 = var18_18.f;
                        var24_24 = var19_19.l.f;
                        var22_22 = var21_21.j.f;
                        var17_17 /* !! */  = var21_21.l.f;
                        var25_25 = this.at;
                        if (var21_21 == var25_25[3]) {
                            var17_17 /* !! */  = var25_25[1].l.f;
                        }
                        var11_11 = var18_18.a();
                        var18_18 = var19_19.j.b;
                        var9_2 = var11_11;
                        if (var18_18 != null) {
                            var18_18 = var18_18.a.l;
                            var25_25 = var18_18.b;
                            var9_2 = var11_11;
                            if (var25_25 != null) {
                                var9_2 = var11_11;
                                if (var25_25.a == var19_19) {
                                    var9_2 = var11_11 + var18_18.a();
                                }
                            }
                        }
                        var1_1.i((k)var23_23, var19_19.j.b.f, var9_2, 2);
                        var9_2 = var11_11 = var19_19.l.a();
                        if (var19_19.l.b != null) {
                            var18_18 = var19_19.ac;
                            var9_2 = var11_11;
                            if (var18_18 != null) {
                                var18_18 = var18_18.j;
                                var9_2 = var18_18.b != null ? var18_18.a() : 0;
                                var9_2 = var11_11 + var9_2;
                            }
                        }
                        var1_1.j((k)var24_24, var19_19.l.b.f, -var9_2, 2);
                        if (var13_13 == var14_14) {
                            var11_11 = var21_21.j.a();
                            var18_18 = var21_21.j.b;
                            var9_2 = var11_11;
                            if (var18_18 != null) {
                                var25_25 = var18_18.a.l;
                                var18_18 = var25_25.b;
                                var9_2 = var11_11;
                                if (var18_18 != null) {
                                    var9_2 = var11_11;
                                    if (var18_18.a == var21_21) {
                                        var9_2 = var11_11 + var25_25.a();
                                    }
                                }
                            }
                            var1_1.i((k)var22_22, var21_21.j.b.f, var9_2, 2);
                            var18_18 = var21_21.l;
                            var25_25 = this.at;
                            if (var21_21 == var25_25[3]) {
                                var18_18 = var25_25[1].l;
                            }
                            var11_11 = var18_18.a();
                            var25_25 = var18_18.b;
                            var9_2 = var11_11;
                            if (var25_25 != null) {
                                var26_26 = var25_25.a.j;
                                var25_25 = var26_26.b;
                                var9_2 = var11_11;
                                if (var25_25 != null) {
                                    var9_2 = var11_11;
                                    if (var25_25.a == var21_21) {
                                        var9_2 = var11_11 + var26_26.a();
                                    }
                                }
                            }
                            var1_1.j((k)var17_17 /* !! */ , var18_18.b.f, -var9_2, 2);
                        }
                        if ((var9_2 = var20_20.h) > 0) {
                            var1_1.j((k)var24_24, (k)var23_23, var9_2, 2);
                        }
                        var18_18 = var1_1.a();
                        var18_18.f(var19_19.aa, var2_4, var21_21.aa, (k)var23_23, var19_19.j.a(), (k)var24_24, var19_19.l.a(), (k)var22_22, var21_21.j.a(), (k)var17_17 /* !! */ , var21_21.l.a());
                        var1_1.g((h)var18_18);
                        var9_2 = 0;
                    }
                }
                var19_19 = var18_18;
                var21_21 = null;
                var17_17 /* !! */  = null;
                var9_2 = 0;
                var22_22 = var20_20;
            }
            while ((var23_23 = var19_19) != null) {
                block71: {
                    block91: {
                        block88: {
                            block89: {
                                block90: {
                                    block87: {
                                        var20_20 = var23_23.ac;
                                        if (var20_20 == null) {
                                            var21_21 = this.at[1];
                                            var9_2 = 1;
                                        }
                                        if (var12_12 == 0) break block87;
                                        var24_24 = var23_23.j;
                                        var11_11 = var14_14 = var24_24.a();
                                        if (var17_17 /* !! */  != null) {
                                            var11_11 = var14_14 + var17_17 /* !! */ .l.a();
                                        }
                                        var14_14 = var18_18 != var23_23 ? 3 : 1;
                                        var17_17 /* !! */  = (boolean[])var24_24.b;
                                        if (var17_17 /* !! */  != null) {
                                            var19_19 = var24_24.f;
                                            var17_17 /* !! */  = var17_17 /* !! */ .f;
                                        } else {
                                            var19_19 = var23_23.m;
                                            var17_17 /* !! */  = (boolean[])var19_19.b;
                                            if (var17_17 /* !! */  != null) {
                                                var19_19 = var19_19.f;
                                                var17_17 /* !! */  = var17_17 /* !! */ .f;
                                                var11_11 -= var24_24.a();
                                            } else {
                                                var17_17 /* !! */  = null;
                                                var19_19 = null;
                                            }
                                        }
                                        if (var19_19 != null && var17_17 /* !! */  != null) {
                                            var1_1.i((k)var19_19, (k)var17_17 /* !! */ , var11_11, var14_14);
                                        }
                                        if (var23_23.ae == 3) {
                                            var17_17 /* !! */  = var23_23.l;
                                            if (var23_23.d == 1) {
                                                var11_11 = Math.max(var23_23.g, var23_23.d());
                                                var1_1.n(var17_17 /* !! */ .f, var24_24.f, var11_11, 3);
                                            } else {
                                                var1_1.i(var24_24.f, var24_24.b.f, var24_24.c, 3);
                                                var1_1.j(var17_17 /* !! */ .f, var24_24.f, var23_23.g, 3);
                                            }
                                        }
                                        break block88;
                                    }
                                    var19_19 = var17_17 /* !! */ ;
                                    if (var13_13 != 0) break block89;
                                    var19_19 = var17_17 /* !! */ ;
                                    if (var9_2 == 0) break block89;
                                    if (var17_17 /* !! */  == null) break block90;
                                    var17_17 /* !! */  = var23_23.l;
                                    if (var17_17 /* !! */ .b == null) {
                                        var1_1.h(var17_17 /* !! */ .f, var23_23.c() + var23_23.z);
                                    } else {
                                        var11_11 = var17_17 /* !! */ .a();
                                        var1_1.n(var23_23.l.f, var21_21.l.b.f, -var11_11, 5);
                                    }
                                    break block88;
                                }
                                var19_19 = null;
                            }
                            if (var13_13 != 0 || var9_2 != 0 || var19_19 != null) break block91;
                            var17_17 /* !! */  = var23_23.j;
                            if (var17_17 /* !! */ .b == null) {
                                var1_1.h(var17_17 /* !! */ .f, var23_23.c());
                            } else {
                                var11_11 = var17_17 /* !! */ .a();
                                var1_1.n(var23_23.j.f, var22_22.j.b.f, var11_11, 5);
                            }
                        }
lbl350:
                        // 4 sources

                        while (true) {
                            var17_17 /* !! */  = var20_20;
                            break block71;
                            break;
                        }
                    }
                    var25_25 = var23_23.j;
                    var26_26 = var23_23.l;
                    var11_11 = var25_25.a();
                    var14_14 = var26_26.a();
                    var1_1.i(var25_25.f, var25_25.b.f, var11_11, 1);
                    var1_1.j(var26_26.f, var26_26.b.f, -var14_14, 1);
                    var17_17 /* !! */  = var25_25.b;
                    var17_17 /* !! */  = var17_17 /* !! */  != null ? var17_17 /* !! */ .f : null;
                    if (var19_19 != null) ** GOTO lbl368
                    var17_17 /* !! */  = (boolean[])var22_22.j.b;
                    if (var17_17 /* !! */  == null) {
                        var24_24 = null;
                    } else {
                        var17_17 /* !! */  = var17_17 /* !! */ .f;
lbl368:
                        // 2 sources

                        var24_24 = var17_17 /* !! */ ;
                    }
                    var17_17 /* !! */  = var20_20;
                    if (var20_20 == null) {
                        var17_17 /* !! */  = (boolean[])var21_21.l.b;
                        var17_17 /* !! */  = var17_17 /* !! */  != null ? var17_17 /* !! */ .a : null;
                    }
                    var20_20 = var17_17 /* !! */ ;
                    if (var17_17 /* !! */  == null) ** GOTO lbl350
                    var19_19 = var17_17 /* !! */ .j.f;
                    if (var9_2 != 0) {
                        var19_19 = var21_21.l.b;
                        var19_19 = var19_19 != null ? var19_19.f : null;
                    }
                    var20_20 = var17_17 /* !! */ ;
                    if (var24_24 == null) ** GOTO lbl350
                    var20_20 = var17_17 /* !! */ ;
                    if (var19_19 != null) ** break;
                    ** continue;
                    var1_1.m(var25_25.f, (k)var24_24, var11_11, 0.5f, (k)var19_19, var26_26.f, var14_14);
                }
                if (1 == var9_2) {
                    var17_17 /* !! */  = null;
                }
                var19_19 = var17_17 /* !! */ ;
                var17_17 /* !! */  = var23_23;
            }
            var11_11 = var10_3;
            var13_13 = 0;
            var10_3 = var11_11;
            var9_2 = var13_13;
            if (var12_12 == 0) continue;
            var20_20 = var18_18.j;
            var19_19 = var21_21.l;
            var12_12 = var20_20.a();
            var14_14 = var19_19.a();
            var17_17 /* !! */  = (boolean[])var22_22.j.b;
            var17_17 /* !! */  = var17_17 /* !! */  != null ? var17_17 /* !! */ .f : null;
            var18_18 = var21_21.l.b;
            var18_18 = var18_18 != null ? var18_18.f : null;
            var10_3 = var11_11;
            var9_2 = var13_13;
            if (var17_17 /* !! */  == null) continue;
            var10_3 = var11_11;
            var9_2 = var13_13;
            if (var18_18 == null) continue;
            var1_1.j(var19_19.f, (k)var18_18, -var14_14, 1);
            var1_1.m(var20_20.f, (k)var17_17 /* !! */ , var12_12, var22_22.I, (k)var18_18, var19_19.f, var14_14);
            var9_2 = var13_13;
            var10_3 = var11_11;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final void A(m object, int n2) {
        int n3 = 0;
        int n4 = 0;
        Object object2 = object;
        if (n2 == 0) {
            while (true) {
                l l2 = object.i;
                object2 = l2.b;
                n2 = n4;
                if (object2 == null) break;
                object2 = object2.a;
                l l3 = object2.k.b;
                n2 = n4;
                if (l3 == null) break;
                n2 = n4;
                if (l3 != l2) break;
                n2 = n4;
                if (object2 == object) break;
                object = object2;
            }
            while (n2 < (n3 = this.an)) {
                if (this.ar[n2] == object) return;
                ++n2;
            }
            object2 = this.ar;
            n2 = ((m[])object2).length;
            if (n3 + 1 >= n2) {
                this.ar = Arrays.copyOf(object2, n2 + n2);
            }
            object2 = this.ar;
            n2 = this.an;
            object2[n2] = object;
            this.an = n2 + 1;
            return;
        }
        while (true) {
            l l4 = object2.j;
            object = l4.b;
            n2 = n3;
            if (object == null) break;
            object = object.a;
            l l5 = object.l.b;
            n2 = n3;
            if (l5 == null) break;
            n2 = n3;
            if (l5 != l4) break;
            n2 = n3;
            if (object == object2) break;
            object2 = object;
        }
        while (n2 < (n3 = this.ao)) {
            if (this.aq[n2] == object2) return;
            ++n2;
        }
        object = this.aq;
        n2 = ((m[])object).length;
        if (n3 + 1 >= n2) {
            this.aq = Arrays.copyOf(object, n2 + n2);
        }
        object = this.aq;
        n2 = this.ao;
        object[n2] = object2;
        this.ao = n2 + 1;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void B(m var1_1, boolean[] var2_2) {
        block32: {
            block40: {
                block39: {
                    block37: {
                        block38: {
                            block36: {
                                block33: {
                                    block35: {
                                        block34: {
                                            var4_3 = var1_1.ad;
                                            var9_4 = false;
                                            var5_5 = 0;
                                            var3_6 = 0;
                                            if (var4_3 == 3 && var1_1.ae == 3 && var1_1.u > 0.0f) {
                                                var2_2 /* !! */ [0] = false;
                                                return;
                                            }
                                            var4_3 = var1_1.f();
                                            if (var1_1.ad == 3 && var1_1.ae != 3 && var1_1.u > 0.0f) {
                                                var2_2 /* !! */ [0] = false;
                                                return;
                                            }
                                            var1_1.T = true;
                                            if (!(var1_1 instanceof o)) break block33;
                                            var2_2 /* !! */  = (boolean[])((o)var1_1);
                                            if (var2_2 /* !! */ .ai != 1) break block34;
                                            var4_3 = var2_2 /* !! */ .ag;
                                            if (var4_3 != -1) {
                                                var6_7 = 0;
                                                var5_5 = var4_3;
lbl20:
                                                // 5 sources

                                                while (true) {
                                                    var3_6 = var5_5;
                                                    var4_3 = var6_7;
                                                    break block32;
                                                    break;
                                                }
                                            }
                                            var4_3 = var2_2 /* !! */ .ah;
                                            if (var4_3 == -1) break block35;
                                            var3_6 = var5_5;
                                            break block32;
                                        }
                                        var3_6 = var4_3;
                                    }
                                    var4_3 = var3_6;
                                    break block32;
                                }
                                if (var1_1.k.c() || var1_1.i.c()) break block36;
                                var3_6 = var4_3 + var1_1.w;
                                break block32;
                            }
                            var12_8 = var1_1.k;
                            var10_9 = var12_8.b;
                            if (var10_9 != null && (var13_10 = var1_1.i.b) != null && (var10_9 == var13_10 || (var11_11 = var10_9.a) == var13_10.a && var11_11 != var1_1.r)) {
                                var2_2 /* !! */ [0] = false;
                                return;
                            }
                            var11_11 = null;
                            if (var10_9 != null) {
                                var3_6 = var12_8.a() + var4_3;
                                var12_8 = var10_9.a;
                                var5_5 = var3_6;
                                var10_9 = var12_8;
                                if (!var12_8.s()) {
                                    var5_5 = var3_6;
                                    var10_9 = var12_8;
                                    if (!var12_8.T) {
                                        this.B((m)var12_8, var2_2 /* !! */ );
                                        var5_5 = var3_6;
                                        var10_9 = var12_8;
                                    }
                                }
                            } else {
                                var5_5 = var4_3;
                                var10_9 = null;
                            }
                            var13_10 = var1_1.i;
                            var12_8 = var13_10.b;
                            var3_6 = var4_3;
                            if (var12_8 != null) {
                                var12_8 = var12_8.a;
                                var3_6 = var4_3 += var13_10.a();
                                var11_11 = var12_8;
                                if (!var12_8.s()) {
                                    var3_6 = var4_3;
                                    var11_11 = var12_8;
                                    if (!var12_8.T) {
                                        this.B((m)var12_8, var2_2 /* !! */ );
                                        var11_11 = var12_8;
                                        var3_6 = var4_3;
                                    }
                                }
                            }
                            var4_3 = var5_5;
                            if (var1_1.k.b == null) break block37;
                            var4_3 = var5_5;
                            if (var10_9.s()) break block37;
                            var4_3 = var1_1.k.b.g;
                            if (var4_3 == 4) {
                                var4_3 = var10_9.N - var10_9.f();
lbl80:
                                // 2 sources

                                while (true) {
                                    var6_7 = var5_5 + var4_3;
                                    break;
                                }
                            } else {
                                var6_7 = var5_5;
                                if (var4_3 == 2) {
                                    var4_3 = var10_9.N;
                                    ** continue;
                                }
                            }
                            var8_12 = var10_9.Q || var10_9.i.b != null && var10_9.k.b != null && var10_9.ad != 3;
                            var1_1.Q = var8_12;
                            var4_3 = var6_7;
                            if (!var8_12) break block37;
                            var2_2 /* !! */  = (boolean[])var10_9.i.b;
                            if (var2_2 /* !! */  == null) break block38;
                            var4_3 = var6_7;
                            if (var2_2 /* !! */ .a == var1_1) break block37;
                        }
                        var4_3 = var6_7 + (var6_7 - var10_9.N);
                    }
                    var5_5 = var3_6;
                    var6_7 = var4_3;
                    if (var1_1.i.b == null) ** GOTO lbl20
                    var5_5 = var3_6;
                    var6_7 = var4_3;
                    if (var11_11.s()) ** GOTO lbl20
                    var5_5 = var1_1.i.b.g;
                    if (var5_5 == 2) {
                        var5_5 = var11_11.M - var11_11.f();
lbl107:
                        // 2 sources

                        while (true) {
                            var7_13 = var3_6 + var5_5;
                            break;
                        }
                    } else {
                        var7_13 = var3_6;
                        if (var5_5 == 4) {
                            var5_5 = var11_11.M;
                            ** continue;
                        }
                    }
                    if (var11_11.P) break block39;
                    var8_12 = var9_4;
                    if (var11_11.i.b == null) break block40;
                    var8_12 = var9_4;
                    if (var11_11.k.b == null) break block40;
                    var8_12 = var9_4;
                    if (var11_11.ad == 3) break block40;
                }
                var8_12 = true;
            }
            var1_1.P = var8_12;
            var5_5 = var7_13;
            var6_7 = var4_3;
            if (!var8_12) ** GOTO lbl20
            var2_2 /* !! */  = (boolean[])var11_11.k.b;
            if (var2_2 /* !! */  != null && var2_2 /* !! */ .a == var1_1) {
                var5_5 = var7_13;
                var6_7 = var4_3;
                ** continue;
            }
            var3_6 = var7_13 + (var7_13 - var11_11.M);
        }
        var6_7 = var3_6;
        var5_5 = var4_3;
        if (var1_1.K == 8) {
            var5_5 = var1_1.s;
            var6_7 = var3_6 - var5_5;
            var5_5 = var4_3 - var5_5;
        }
        var1_1.M = var6_7;
        var1_1.N = var5_5;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void C(m var1_1, boolean[] var2_2) {
        block37: {
            block42: {
                block41: {
                    block39: {
                        block40: {
                            block38: {
                                var4_3 = var1_1.ae;
                                var3_4 = 0;
                                var9_5 = false;
                                if (var4_3 == 3 && var1_1.ad != 3 && var1_1.u > 0.0f) {
                                    var2_2 /* !! */ [0] = false;
                                    return;
                                }
                                var4_3 = var1_1.e();
                                var1_1.U = true;
                                if (!(var1_1 instanceof o)) break block38;
                                var2_2 /* !! */  = (boolean[])((o)var1_1);
                                if (var2_2 /* !! */ .ai == 0) {
                                    var4_3 = var2_2 /* !! */ .ag;
                                    if (var4_3 == -1) {
                                        var6_6 = var2_2 /* !! */ .ah;
                                        var4_3 = var5_8 = 0;
                                        if (var6_6 != -1) {
                                            var3_4 = var6_6;
                                            var4_3 = var5_8;
                                        }
                                    }
                                } else {
                                    var4_3 = var3_4 = var4_3;
                                }
                                break block37;
                            }
                            var10_10 = var1_1.m;
                            if (var10_10.b == null && var1_1.j.b == null && var1_1.l.b == null) {
                                var6_6 = var4_3 + var1_1.x;
                                var5_8 = var4_3;
lbl27:
                                // 5 sources

                                while (true) {
                                    var3_4 = var5_8;
                                    var4_3 = var6_6;
                                    break block37;
                                    break;
                                }
                            }
                            var12_11 = var1_1.l.b;
                            if (var12_11 != null && (var11_12 = var1_1.j.b) != null && (var12_11 == var11_12 || (var12_11 = var12_11.a) == var11_12.a && var12_11 != var1_1.r)) {
                                var2_2 /* !! */ [0] = false;
                                return;
                            }
                            if (var10_10.c()) {
                                var10_10 = var1_1.m.b.a;
                                if (!var10_10.U) {
                                    this.C((m)var10_10, var2_2 /* !! */ );
                                }
                                var5_9 = Math.max(var10_10.L - var10_10.t + var4_3, var4_3);
                                var4_3 = var6_7 = Math.max(var10_10.O - var10_10.t + var4_3, var4_3);
                                var3_4 = var5_9;
                                if (var1_1.K == 8) {
                                    var4_3 = var1_1.t;
                                    var3_4 = var5_9 - var4_3;
                                    var4_3 = var6_7 - var4_3;
                                }
                                var1_1.L = var3_4;
                                var1_1.O = var4_3;
                                return;
                            }
                            var8_13 = var1_1.j.c();
                            var11_12 = null;
                            if (var8_13) {
                                var10_10 = var1_1.j;
                                var12_11 = var10_10.b.a;
                                var5_8 = var3_4 = var10_10.a() + var4_3;
                                var10_10 = var12_11;
                                if (!var12_11.s()) {
                                    var5_8 = var3_4;
                                    var10_10 = var12_11;
                                    if (!var12_11.U) {
                                        this.C((m)var12_11, var2_2 /* !! */ );
                                        var5_8 = var3_4;
                                        var10_10 = var12_11;
                                    }
                                }
                            } else {
                                var5_8 = var4_3;
                                var10_10 = null;
                            }
                            var3_4 = var4_3;
                            if (var1_1.l.c()) {
                                var12_11 = var1_1.l;
                                var11_12 = var12_11.b.a;
                                var3_4 = var4_3 + var12_11.a();
                                if (!var11_12.s() && !var11_12.U) {
                                    this.C((m)var11_12, var2_2 /* !! */ );
                                }
                            }
                            var4_3 = var5_8;
                            if (var1_1.j.b == null) break block39;
                            var4_3 = var5_8;
                            if (var10_10.s()) break block39;
                            var4_3 = var1_1.j.b.g;
                            if (var4_3 == 3) {
                                var4_3 = var10_10.L - var10_10.e();
lbl80:
                                // 2 sources

                                while (true) {
                                    var6_6 = var5_8 + var4_3;
                                    break;
                                }
                            } else {
                                var6_6 = var5_8;
                                if (var4_3 == 5) {
                                    var4_3 = var10_10.L;
                                    ** continue;
                                }
                            }
                            var8_13 = var10_10.R || (var2_2 /* !! */  = (boolean[])var10_10.j.b) != null && var2_2 /* !! */ .a != var1_1 && (var2_2 /* !! */  = (boolean[])var10_10.l.b) != null && var2_2 /* !! */ .a != var1_1 && var10_10.ae != 3;
                            var1_1.R = var8_13;
                            var4_3 = var6_6;
                            if (!var8_13) break block39;
                            var2_2 /* !! */  = (boolean[])var10_10.l.b;
                            if (var2_2 /* !! */  == null) break block40;
                            var4_3 = var6_6;
                            if (var2_2 /* !! */ .a == var1_1) break block39;
                        }
                        var4_3 = var6_6 + (var6_6 - var10_10.L);
                    }
                    var5_8 = var3_4;
                    var6_6 = var4_3;
                    if (var1_1.l.b == null) ** GOTO lbl27
                    var5_8 = var3_4;
                    var6_6 = var4_3;
                    if (var11_12.s()) ** GOTO lbl27
                    var5_8 = var1_1.l.b.g;
                    if (var5_8 == 5) {
                        var5_8 = var11_12.O - var11_12.e();
lbl107:
                        // 2 sources

                        while (true) {
                            var7_14 = var3_4 + var5_8;
                            break;
                        }
                    } else {
                        var7_14 = var3_4;
                        if (var5_8 == 3) {
                            var5_8 = var11_12.O;
                            ** continue;
                        }
                    }
                    if (var11_12.S) break block41;
                    var2_2 /* !! */  = (boolean[])var11_12.j.b;
                    var8_13 = var9_5;
                    if (var2_2 /* !! */  == null) break block42;
                    var8_13 = var9_5;
                    if (var2_2 /* !! */ .a == var1_1) break block42;
                    var2_2 /* !! */  = (boolean[])var11_12.l.b;
                    var8_13 = var9_5;
                    if (var2_2 /* !! */  == null) break block42;
                    var8_13 = var9_5;
                    if (var2_2 /* !! */ .a == var1_1) break block42;
                    var8_13 = var9_5;
                    if (var11_12.ae == 3) break block42;
                }
                var8_13 = true;
            }
            var1_1.S = var8_13;
            var5_8 = var7_14;
            var6_6 = var4_3;
            if (!var8_13) ** GOTO lbl27
            var2_2 /* !! */  = (boolean[])var11_12.j.b;
            if (var2_2 /* !! */  != null && var2_2 /* !! */ .a == var1_1) {
                var5_8 = var7_14;
                var6_6 = var4_3;
                ** continue;
            }
            var3_4 = var7_14 + (var7_14 - var11_12.O);
        }
        var6_6 = var3_4;
        var5_8 = var4_3;
        if (var1_1.K == 8) {
            var6_6 = var1_1.t;
            var5_8 = var4_3 - var6_6;
            var6_6 = var3_4 - var6_6;
        }
        var1_1.L = var5_8;
        var1_1.O = var6_6;
    }

    /*
     * Exception decompiling
     */
    @Override
    public final void D() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 13[TRYBLOCK] [13 : 1801->1811)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     */
    public final boolean E(j var1_1) {
        block96: {
            block95: {
                this.x(var1_1);
                var12_2 = this.al.size();
                var5_3 = this.ai;
                if (var5_3 == 2 || var5_3 == 4) break block95;
                var6_4 = 1;
                var5_3 = 0;
                break block96;
            }
            var13_5 = this.al.size();
            for (var5_3 = 0; var5_3 < var13_5; ++var5_3) {
                var16_6 = (m)this.al.get(var5_3);
                var16_6.a = -1;
                var16_6.b = -1;
                if (var16_6.ad != 3 && var16_6.ae != 3) continue;
                var16_6.a = 1;
                var16_6.b = 1;
            }
            var5_3 = 0;
            var8_7 = 0;
            var7_8 = 0;
            while (var5_3 == 0) {
                block94: {
                    var5_3 = 0;
                    var6_4 = 0;
                    for (var9_12 = 0; var9_12 < var13_5; ++var9_12) {
                        var16_6 = (m)this.al.get(var9_12);
                        if (var16_6.a == -1) {
                            var11_14 = this.ad;
                            if (var11_14 == 2) {
                                var16_6.a = 1;
                            } else {
                                var10_13 = var16_6.ad;
                                if (var10_13 == 3) {
                                    var16_6.a = 1;
                                } else if (var11_14 != 2 && var10_13 == 4) {
                                    var17_17 = var16_6.i;
                                    var17_17.f = var1_1.e(var17_17);
                                    var17_17 = var16_6.k;
                                    var17_17.f = var1_1.e(var17_17);
                                    var17_17 = var16_6.i;
                                    var11_14 = var17_17.c;
                                    var10_13 = this.h() - var16_6.k.c;
                                    var1_1.h(var17_17.f, var11_14);
                                    var1_1.h(var16_6.k.f, var10_13);
                                    var16_6.k(var11_14, var10_13);
                                    var16_6.a = 2;
                                } else {
                                    var17_17 = var16_6.i;
                                    var18_18 = var17_17.b;
                                    if (var18_18 != null && (var19_19 = var16_6.k.b) != null) {
                                        if (var18_18.a == this && var19_19.a == this) {
                                            var10_13 = var17_17.a();
                                            var14_15 = var16_6.k.a();
                                            if (this.ad == 3) {
                                                var11_14 = this.h() - var14_15;
                                            } else {
                                                var15_16 = var16_6.h();
                                                var11_14 = this.h();
                                                var2_9 = var16_6.H;
                                                var10_13 += (int)((float)(var11_14 - var10_13 - var14_15 - var15_16) * var2_9 + 0.5f);
                                                var11_14 = var10_13 + var16_6.h();
                                            }
                                            var17_17 = var16_6.i;
                                            var17_17.f = var1_1.e(var17_17);
                                            var17_17 = var16_6.k;
                                            var17_17.f = var1_1.e(var17_17);
                                            var1_1.h(var16_6.i.f, var10_13);
                                            var1_1.h(var16_6.k.f, var11_14);
                                            var16_6.a = 2;
                                            var16_6.k(var10_13, var11_14);
                                        } else {
                                            var16_6.a = 1;
                                        }
                                    } else if (var18_18 != null && var18_18.a == this) {
                                        var10_13 = var17_17.a();
                                        var11_14 = var16_6.h() + var10_13;
                                        var17_17 = var16_6.i;
                                        var17_17.f = var1_1.e(var17_17);
                                        var17_17 = var16_6.k;
                                        var17_17.f = var1_1.e(var17_17);
                                        var1_1.h(var16_6.i.f, var10_13);
                                        var1_1.h(var16_6.k.f, var11_14);
                                        var16_6.a = 2;
                                        var16_6.k(var10_13, var11_14);
                                    } else {
                                        var19_19 = var16_6.k.b;
                                        if (var19_19 != null && var19_19.a == this) {
                                            var17_17.f = var1_1.e(var17_17);
                                            var17_17 = var16_6.k;
                                            var17_17.f = var1_1.e(var17_17);
                                            var10_13 = this.h() - var16_6.k.a();
                                            var11_14 = var10_13 - var16_6.h();
                                            var1_1.h(var16_6.i.f, var11_14);
                                            var1_1.h(var16_6.k.f, var10_13);
                                            var16_6.a = 2;
                                            var16_6.k(var11_14, var10_13);
                                        } else if (var18_18 != null && var18_18.a.a == 2) {
                                            var18_18 = var18_18.f;
                                            var17_17.f = var1_1.e(var17_17);
                                            var17_17 = var16_6.k;
                                            var17_17.f = var1_1.e(var17_17);
                                            var2_9 = var18_18.d;
                                            var3_10 = var16_6.i.a();
                                            var11_14 = var16_6.h();
                                            var10_13 = (int)(var2_9 + var3_10 + 0.5f);
                                            var1_1.h(var16_6.i.f, var10_13);
                                            var1_1.h(var16_6.k.f, var11_14 += var10_13);
                                            var16_6.a = 2;
                                            var16_6.k(var10_13, var11_14);
                                        } else if (var19_19 != null && var19_19.a.a == 2) {
                                            var18_18 = var19_19.f;
                                            var17_17.f = var1_1.e(var17_17);
                                            var17_17 = var16_6.k;
                                            var17_17.f = var1_1.e(var17_17);
                                            var2_9 = var18_18.d;
                                            var3_10 = var16_6.k.a();
                                            var11_14 = var16_6.h();
                                            var10_13 = (int)(var2_9 - var3_10 + 0.5f);
                                            var11_14 = var10_13 - var11_14;
                                            var1_1.h(var16_6.i.f, var11_14);
                                            var1_1.h(var16_6.k.f, var10_13);
                                            var16_6.a = 2;
                                            var16_6.k(var11_14, var10_13);
                                        } else if (var18_18 == null && var19_19 == null) {
                                            if (var16_6 instanceof o) {
                                                var18_18 = (o)var16_6;
                                                if (var18_18.ai == 1) {
                                                    var17_17.f = var1_1.e(var17_17);
                                                    var17_17 = var16_6.k;
                                                    var17_17.f = var1_1.e(var17_17);
                                                    var10_13 = var18_18.ag;
                                                    var2_9 = var10_13 != -1 ? (float)var10_13 : ((var10_13 = var18_18.ah) != -1 ? (float)(this.h() - var10_13) : (float)this.h() * var18_18.af);
                                                    var17_17 = var16_6.i.f;
                                                    var10_13 = (int)(var2_9 + 0.5f);
                                                    var1_1.h((k)var17_17, var10_13);
                                                    var1_1.h(var16_6.k.f, var10_13);
                                                    var16_6.a = 2;
                                                    var16_6.b = 2;
                                                    var16_6.k(var10_13, var10_13);
                                                    var16_6.o(0, this.d());
                                                }
                                            } else {
                                                var17_17.f = var1_1.e(var17_17);
                                                var17_17 = var16_6.k;
                                                var17_17.f = var1_1.e(var17_17);
                                                var11_14 = var16_6.w;
                                                var10_13 = var16_6.h();
                                                var1_1.h(var16_6.i.f, var11_14);
                                                var1_1.h(var16_6.k.f, var10_13 + var11_14);
                                                var16_6.a = 2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (var16_6.b == -1) {
                            var10_13 = this.ae;
                            if (var10_13 == 2) {
                                var16_6.b = 1;
                            } else {
                                var11_14 = var16_6.ae;
                                if (var11_14 == 3) {
                                    var16_6.b = 1;
                                } else if (var10_13 != 2 && var11_14 == 4) {
                                    var17_17 = var16_6.j;
                                    var17_17.f = var1_1.e(var17_17);
                                    var17_17 = var16_6.l;
                                    var17_17.f = var1_1.e(var17_17);
                                    var17_17 = var16_6.j;
                                    var11_14 = var17_17.c;
                                    var10_13 = this.d() - var16_6.l.c;
                                    var1_1.h(var17_17.f, var11_14);
                                    var1_1.h(var16_6.l.f, var10_13);
                                    if (var16_6.C > 0 || var16_6.K == 8) {
                                        var17_17 = var16_6.m;
                                        var17_17.f = var1_1.e(var17_17);
                                        var1_1.h(var16_6.m.f, var16_6.C + var11_14);
                                    }
                                    var16_6.o(var11_14, var10_13);
                                    var16_6.b = 2;
                                } else {
                                    var17_17 = var16_6.j;
                                    var18_18 = var17_17.b;
                                    if (var18_18 != null && (var19_19 = var16_6.l.b) != null) {
                                        if (var18_18.a == this && var19_19.a == this) {
                                            var10_13 = var17_17.a();
                                            var11_14 = var16_6.l.a();
                                            if (this.ae == 3) {
                                                var11_14 = var16_6.d();
                                            } else {
                                                var15_16 = var16_6.d();
                                                var14_15 = this.d();
                                                var2_9 = var10_13;
                                                var3_10 = var16_6.I;
                                                var4_11 = var14_15 - var10_13 - var11_14 - var15_16;
                                                var11_14 = var16_6.d();
                                                var10_13 = (int)(var2_9 + var4_11 * var3_10 + 0.5f);
                                            }
                                            var11_14 += var10_13;
                                            var17_17 = var16_6.j;
                                            var17_17.f = var1_1.e(var17_17);
                                            var17_17 = var16_6.l;
                                            var17_17.f = var1_1.e(var17_17);
                                            var1_1.h(var16_6.j.f, var10_13);
                                            var1_1.h(var16_6.l.f, var11_14);
                                            if (var16_6.C > 0 || var16_6.K == 8) {
                                                var17_17 = var16_6.m;
                                                var17_17.f = var1_1.e(var17_17);
                                                var1_1.h(var16_6.m.f, var16_6.C + var10_13);
                                            }
                                            var16_6.b = 2;
                                            var16_6.o(var10_13, var11_14);
                                        } else {
                                            var16_6.b = 1;
                                        }
                                    } else if (var18_18 != null && var18_18.a == this) {
                                        var10_13 = var17_17.a();
                                        var11_14 = var16_6.d() + var10_13;
                                        var17_17 = var16_6.j;
                                        var17_17.f = var1_1.e(var17_17);
                                        var17_17 = var16_6.l;
                                        var17_17.f = var1_1.e(var17_17);
                                        var1_1.h(var16_6.j.f, var10_13);
                                        var1_1.h(var16_6.l.f, var11_14);
                                        if (var16_6.C > 0 || var16_6.K == 8) {
                                            var17_17 = var16_6.m;
                                            var17_17.f = var1_1.e(var17_17);
                                            var1_1.h(var16_6.m.f, var16_6.C + var10_13);
                                        }
                                        var16_6.b = 2;
                                        var16_6.o(var10_13, var11_14);
                                    } else {
                                        var19_19 = var16_6.l.b;
                                        if (var19_19 != null && var19_19.a == this) {
                                            var17_17.f = var1_1.e(var17_17);
                                            var17_17 = var16_6.l;
                                            var17_17.f = var1_1.e(var17_17);
                                            var10_13 = this.d() - var16_6.l.a();
                                            var11_14 = var10_13 - var16_6.d();
                                            var1_1.h(var16_6.j.f, var11_14);
                                            var1_1.h(var16_6.l.f, var10_13);
                                            if (var16_6.C > 0 || var16_6.K == 8) {
                                                var17_17 = var16_6.m;
                                                var17_17.f = var1_1.e(var17_17);
                                                var1_1.h(var16_6.m.f, var16_6.C + var11_14);
                                            }
                                            var16_6.b = 2;
                                            var16_6.o(var11_14, var10_13);
                                        } else if (var18_18 != null && var18_18.a.b == 2) {
                                            var18_18 = var18_18.f;
                                            var17_17.f = var1_1.e(var17_17);
                                            var17_17 = var16_6.l;
                                            var17_17.f = var1_1.e(var17_17);
                                            var2_9 = var18_18.d;
                                            var3_10 = var16_6.j.a();
                                            var11_14 = var16_6.d();
                                            var10_13 = (int)(var2_9 + var3_10 + 0.5f);
                                            var1_1.h(var16_6.j.f, var10_13);
                                            var1_1.h(var16_6.l.f, var11_14 += var10_13);
                                            if (var16_6.C > 0 || var16_6.K == 8) {
                                                var17_17 = var16_6.m;
                                                var17_17.f = var1_1.e(var17_17);
                                                var1_1.h(var16_6.m.f, var16_6.C + var10_13);
                                            }
                                            var16_6.b = 2;
                                            var16_6.o(var10_13, var11_14);
                                        } else if (var19_19 != null && var19_19.a.b == 2) {
                                            var18_18 = var19_19.f;
                                            var17_17.f = var1_1.e(var17_17);
                                            var17_17 = var16_6.l;
                                            var17_17.f = var1_1.e(var17_17);
                                            var2_9 = var18_18.d;
                                            var3_10 = var16_6.l.a();
                                            var11_14 = var16_6.d();
                                            var10_13 = (int)(var2_9 - var3_10 + 0.5f);
                                            var11_14 = var10_13 - var11_14;
                                            var1_1.h(var16_6.j.f, var11_14);
                                            var1_1.h(var16_6.l.f, var10_13);
                                            if (var16_6.C > 0 || var16_6.K == 8) {
                                                var17_17 = var16_6.m;
                                                var17_17.f = var1_1.e(var17_17);
                                                var1_1.h(var16_6.m.f, var16_6.C + var11_14);
                                            }
                                            var16_6.b = 2;
                                            var16_6.o(var11_14, var10_13);
                                        } else {
                                            var20_20 = var16_6.m.b;
                                            if (var20_20 != null && var20_20.a.b == 2) {
                                                var18_18 = var20_20.f;
                                                var17_17.f = var1_1.e(var17_17);
                                                var17_17 = var16_6.l;
                                                var17_17.f = var1_1.e(var17_17);
                                                var2_9 = var18_18.d;
                                                var3_10 = var16_6.C;
                                                var11_14 = var16_6.d();
                                                var10_13 = (int)(var2_9 - var3_10 + 0.5f);
                                                var1_1.h(var16_6.j.f, var10_13);
                                                var1_1.h(var16_6.l.f, var11_14 += var10_13);
                                                var17_17 = var16_6.m;
                                                var17_17.f = var1_1.e(var17_17);
                                                var1_1.h(var16_6.m.f, var16_6.C + var10_13);
                                                var16_6.b = 2;
                                                var16_6.o(var10_13, var11_14);
                                            } else if (var20_20 == null && var18_18 == null && var19_19 == null) {
                                                if (var16_6 instanceof o) {
                                                    var18_18 = (o)var16_6;
                                                    if (var18_18.ai == 0) {
                                                        var17_17.f = var1_1.e(var17_17);
                                                        var17_17 = var16_6.l;
                                                        var17_17.f = var1_1.e(var17_17);
                                                        var10_13 = var18_18.ag;
                                                        var2_9 = var10_13 != -1 ? (float)var10_13 : ((var10_13 = var18_18.ah) != -1 ? (float)(this.d() - var10_13) : (float)this.d() * var18_18.af);
                                                        var17_17 = var16_6.j.f;
                                                        var10_13 = (int)(var2_9 + 0.5f);
                                                        var1_1.h((k)var17_17, var10_13);
                                                        var1_1.h(var16_6.l.f, var10_13);
                                                        var16_6.b = 2;
                                                        var16_6.a = 2;
                                                        var16_6.o(var10_13, var10_13);
                                                        var16_6.k(0, this.h());
                                                    }
                                                } else {
                                                    var17_17.f = var1_1.e(var17_17);
                                                    var17_17 = var16_6.l;
                                                    var17_17.f = var1_1.e(var17_17);
                                                    var11_14 = var16_6.x;
                                                    var10_13 = var16_6.d();
                                                    var1_1.h(var16_6.j.f, var11_14);
                                                    var1_1.h(var16_6.l.f, var10_13 + var11_14);
                                                    if (var16_6.C > 0 || var16_6.K == 8) {
                                                        var17_17 = var16_6.m;
                                                        var17_17.f = var1_1.e(var17_17);
                                                        var1_1.h(var16_6.m.f, var11_14 + var16_6.C);
                                                    }
                                                    var16_6.b = 2;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        var10_13 = var5_3;
                        if (var16_6.b == -1) {
                            var10_13 = var5_3 + 1;
                        }
                        var11_14 = var6_4;
                        if (var16_6.a == -1) {
                            var11_14 = var6_4 + 1;
                        }
                        var5_3 = var10_13;
                        var6_4 = var11_14;
                    }
                    if (var5_3 == 0) {
                        if (var6_4 == 0) {
                            while (true) {
                                var7_8 = 1;
                                break block94;
                                break;
                            }
                        }
                        var9_12 = 0;
                    } else {
                        var9_12 = var5_3;
                    }
                    if (var8_7 == var9_12 && var7_8 == var6_4) ** continue;
                    var7_8 = 0;
                }
                var8_7 = var5_3;
                var5_3 = var7_8;
                var7_8 = var6_4;
            }
            var8_7 = 0;
            var6_4 = 0;
            for (var5_3 = 0; var5_3 < var13_5; ++var5_3) {
                block100: {
                    block99: {
                        block98: {
                            block97: {
                                var16_6 = (m)this.al.get(var5_3);
                                var9_12 = var16_6.a;
                                if (var9_12 == 1) break block97;
                                var7_8 = var8_7;
                                if (var9_12 != -1) break block98;
                            }
                            var7_8 = var8_7 + 1;
                        }
                        if ((var8_7 = var16_6.b) == 1) break block99;
                        var9_12 = var6_4;
                        if (var8_7 != -1) break block100;
                    }
                    var9_12 = var6_4 + 1;
                }
                var8_7 = var7_8;
                var6_4 = var9_12;
            }
            if (var8_7 != 0) ** GOTO lbl377
            if (var6_4 != 0) {
                var5_3 = 0;
                var6_4 = 0;
            } else {
                return false;
lbl377:
                // 1 sources

                var5_3 = 0;
                var6_4 = 0;
            }
        }
        while (var5_3 < var12_2) {
            var16_6 = (m)this.al.get(var5_3);
            if (var16_6 instanceof n) {
                var8_7 = var16_6.ad;
                var9_12 = var16_6.ae;
                var7_8 = var8_7;
                if (var8_7 == 2) {
                    var16_6.v(1);
                    var7_8 = 2;
                }
                var8_7 = var9_12;
                if (var9_12 == 2) {
                    var16_6.w(1);
                    var8_7 = 2;
                }
                var16_6.x(var1_1);
                if (var7_8 == 2) {
                    var16_6.v(2);
                }
                if (var8_7 == 2) {
                    var16_6.w(2);
                }
            } else {
                if (var6_4 != 0) {
                    if (this.ad != 2 && var16_6.ad == 4) {
                        var17_17 = var16_6.i;
                        var17_17.f = var1_1.e(var17_17);
                        var17_17 = var16_6.k;
                        var17_17.f = var1_1.e(var17_17);
                        var17_17 = var16_6.i;
                        var7_8 = var17_17.c;
                        var8_7 = this.h() - var16_6.k.c;
                        var1_1.h(var17_17.f, var7_8);
                        var1_1.h(var16_6.k.f, var8_7);
                        var16_6.k(var7_8, var8_7);
                        var16_6.a = 2;
                    }
                    if (this.ae != 2 && var16_6.ae == 4) {
                        var17_17 = var16_6.j;
                        var17_17.f = var1_1.e(var17_17);
                        var17_17 = var16_6.l;
                        var17_17.f = var1_1.e(var17_17);
                        var17_17 = var16_6.j;
                        var7_8 = var17_17.c;
                        var8_7 = this.d() - var16_6.l.c;
                        var1_1.h(var17_17.f, var7_8);
                        var1_1.h(var16_6.l.f, var8_7);
                        if (var16_6.C > 0 || var16_6.K == 8) {
                            var17_17 = var16_6.m;
                            var17_17.f = var1_1.e(var17_17);
                            var1_1.h(var16_6.m.f, var16_6.C + var7_8);
                        }
                        var16_6.o(var7_8, var8_7);
                        var16_6.b = 2;
                    }
                }
                var16_6.x(var1_1);
            }
            ++var5_3;
        }
        if (this.an > 0) {
            this.H(var1_1);
        }
        if (this.ao > 0) {
            this.I(var1_1);
        }
        return true;
    }

    @Override
    public final void i() {
        this.af.l();
        super.i();
    }
}

