/*
 * Decompiled with CFR 0.152.
 */
public final class qd
extends qk {
    public int a = 0;
    public boolean b = true;
    public int c = 0;
    boolean d = false;

    public final int a() {
        int n2 = this.a;
        if (n2 != 0 && n2 != 1) {
            if (n2 != 2 && n2 != 3) {
                return -1;
            }
            return 1;
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final void b(px var1_1, boolean var2_2) {
        block19: {
            block23: {
                block25: {
                    block24: {
                        block22: {
                            block18: {
                                block20: {
                                    block21: {
                                        var9_3 /* !! */  = this.R;
                                        var9_3 /* !! */ [0] = this.J;
                                        var9_3 /* !! */ [2] = this.K;
                                        var9_3 /* !! */ [1] = this.L;
                                        var9_3 /* !! */ [3] = this.M;
                                        var3_4 = 0;
                                        while (true) {
                                            var9_3 /* !! */  = this.R;
                                            var4_5 = var9_3 /* !! */ .length;
                                            if (var3_4 >= 6) break;
                                            var9_3 /* !! */  = var9_3 /* !! */ [var3_4];
                                            var9_3 /* !! */ .h = var1_1.b(var9_3 /* !! */ );
                                            ++var3_4;
                                        }
                                        var3_4 = this.a;
                                        if (var3_4 < 0 || var3_4 >= 4) break block19;
                                        var9_3 /* !! */  = var9_3 /* !! */ [var3_4];
                                        if (!this.d) {
                                            this.c();
                                        }
                                        if (!this.d) break block20;
                                        this.d = false;
                                        var3_4 = this.a;
                                        if (var3_4 == 0 || var3_4 == 1) break block21;
                                        if (var3_4 == 2 || var3_4 == 3) {
                                            var1_1.f(this.K.h, this.aa);
                                            var1_1.f(this.M.h, this.aa);
                                            return;
                                        }
                                        break block19;
                                    }
                                    var1_1.f(this.J.h, this.Z);
                                    var1_1.f(this.L.h, this.Z);
                                    return;
                                }
                                for (var3_4 = 0; var3_4 < this.as; ++var3_4) {
                                    var10_6 = this.ar[var3_4];
                                    if (!this.b && !var10_6.d()) continue;
                                    var4_5 = this.a;
                                    if ((var4_5 == 0 || var4_5 == 1) && var10_6.M() == 3 && var10_6.J.e != null && var10_6.L.e != null) {
                                        while (true) {
                                            var5_7 = 1;
                                            break block18;
                                            break;
                                        }
                                    }
                                    if (((var4_5 = this.a) == 2 || var4_5 == 3) && var10_6.N() == 3 && var10_6.K.e != null && var10_6.M.e != null) ** continue;
                                }
                                var5_7 = 0;
                            }
                            var4_5 = !this.J.f() && !this.L.f() ? 0 : 1;
                            var3_4 = !this.K.f() && !this.M.f() ? 0 : 1;
                            if (var5_7 != 0) ** GOTO lbl-1000
                            var5_7 = this.a;
                            var8_8 = 5;
                            var7_9 = var5_7;
                            var6_10 = var4_5;
                            if (var5_7 != 0) break block22;
                            var5_7 = var8_8;
                            if (var4_5 != 0) break block23;
                            var7_9 = 0;
                            var6_10 = 0;
                        }
                        var4_5 = var3_4;
                        if (var7_9 != 2) break block24;
                        var5_7 = var8_8;
                        if (var3_4 != 0) break block23;
                        var4_5 = 0;
                    }
                    if (var7_9 != 1) break block25;
                    var5_7 = var8_8;
                    if (var6_10 != 0) break block23;
                }
                ** if (var7_9 != 3 || var4_5 == 0) goto lbl-1000
lbl-1000:
                // 1 sources

                {
                    var5_7 = var8_8;
                    ** GOTO lbl75
                }
lbl-1000:
                // 2 sources

                {
                    var5_7 = 4;
                }
            }
            for (var3_4 = 0; var3_4 < this.as; ++var3_4) {
                var11_11 = this.ar[var3_4];
                if (!this.b && !var11_11.d()) continue;
                var10_6 = var1_1.b(var11_11.R[this.a]);
                var11_11 = var11_11.R;
                var6_10 = this.a;
                var12_12 = var11_11[var6_10];
                var12_12.h = var10_6;
                var11_11 = var12_12.e;
                var4_5 = var11_11 != null && var11_11.d == this ? var12_12.f : 0;
                if (var6_10 != 0 && var6_10 != 2) {
                    var13_13 = var9_3 /* !! */ .h;
                    var6_10 = this.c;
                    var11_11 = var1_1.a();
                    var12_12 = var1_1.c();
                    var12_12.e = 0;
                    var11_11.h(var13_13, (qb)var10_6, (qb)var12_12, var6_10 + var4_5);
                    var1_1.e((pw)var11_11);
                } else {
                    var11_11 = var9_3 /* !! */ .h;
                    var6_10 = this.c;
                    var12_12 = var1_1.a();
                    var13_13 = var1_1.c();
                    var13_13.e = 0;
                    var12_12.i((qb)var11_11, (qb)var10_6, var13_13, var6_10 - var4_5);
                    var1_1.e((pw)var12_12);
                }
                var1_1.m(var9_3 /* !! */ .h, (qb)var10_6, this.c + var4_5, var5_7);
            }
            var3_4 = this.a;
            if (var3_4 == 0) {
                var9_3 /* !! */  = this.L;
                var10_6 = this.J;
                var1_1.m(var9_3 /* !! */ .h, var10_6.h, 0, 8);
                var1_1.m(this.J.h, this.U.L.h, 0, 4);
                var1_1.m(this.J.h, this.U.J.h, 0, 0);
                return;
            }
            if (var3_4 == 1) {
                var9_3 /* !! */  = this.J;
                var10_6 = this.L;
                var1_1.m(var9_3 /* !! */ .h, var10_6.h, 0, 8);
                var1_1.m(this.J.h, this.U.J.h, 0, 4);
                var1_1.m(this.J.h, this.U.L.h, 0, 0);
                return;
            }
            if (var3_4 == 2) {
                var9_3 /* !! */  = this.M;
                var10_6 = this.K;
                var1_1.m(var9_3 /* !! */ .h, var10_6.h, 0, 8);
                var1_1.m(this.K.h, this.U.M.h, 0, 4);
                var1_1.m(this.K.h, this.U.K.h, 0, 0);
                return;
            }
            if (var3_4 == 3) {
                var10_6 = this.K;
                var9_3 /* !! */  = this.M;
                var1_1.m(var10_6.h, var9_3 /* !! */ .h, 0, 8);
                var1_1.m(this.K.h, this.U.K.h, 0, 4);
                var1_1.m(this.K.h, this.U.M.h, 0, 0);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean c() {
        int n2;
        qg qg2;
        int n3;
        int n4;
        int n5 = 0;
        int n6 = 1;
        for (n4 = 0; n4 < (n3 = this.as); ++n4) {
            block25: {
                block26: {
                    block27: {
                        block24: {
                            qg2 = this.ar[n4];
                            if (this.b) break block24;
                            n3 = n6;
                            if (!qg2.d()) break block25;
                        }
                        if (((n3 = this.a) == 0 || n3 == 1) && !qg2.e()) break block26;
                        n2 = this.a;
                        if (n2 == 2) break block27;
                        n3 = n6;
                        if (n2 != 3) break block25;
                    }
                    n3 = n6;
                    if (qg2.f()) break block25;
                }
                n3 = 0;
            }
            n6 = n3;
        }
        if (n6 != 0 && n3 > 0) {
            n6 = 0;
            n2 = 0;
        } else {
            return false;
        }
        for (n3 = n5; n3 < this.as; ++n3) {
            qg2 = this.ar[n3];
            if (!this.b && !qg2.d()) continue;
            n4 = n6;
            if (n2 == 0) {
                n2 = this.a;
                if (n2 == 0) {
                    n4 = qg2.K(2).a();
                } else if (n2 == 1) {
                    n4 = qg2.K(4).a();
                } else if (n2 == 2) {
                    n4 = qg2.K(3).a();
                } else {
                    n4 = n6;
                    if (n2 == 3) {
                        n4 = qg2.K(5).a();
                    }
                }
            }
            if ((n2 = this.a) == 0) {
                n6 = Math.min(n4, qg2.K(2).a());
            } else if (n2 == 1) {
                n6 = Math.max(n4, qg2.K(4).a());
            } else if (n2 == 2) {
                n6 = Math.min(n4, qg2.K(3).a());
            } else {
                n6 = n4;
                if (n2 == 3) {
                    n6 = Math.max(n4, qg2.K(5).a());
                }
            }
            n2 = 1;
        }
        n6 += this.c;
        n4 = this.a;
        if (n4 != 0 && n4 != 1) {
            this.w(n6, n6);
        } else {
            this.v(n6, n6);
        }
        this.d = true;
        return true;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final boolean e() {
        return this.d;
    }

    @Override
    public final boolean f() {
        return this.d;
    }

    @Override
    public final String toString() {
        CharSequence charSequence = new StringBuilder("[Barrier] ");
        ((StringBuilder)charSequence).append(this.ai);
        ((StringBuilder)charSequence).append(" {");
        charSequence = ((StringBuilder)charSequence).toString();
        for (int i2 = 0; i2 < this.as; ++i2) {
            qg qg2 = this.ar[i2];
            CharSequence charSequence2 = charSequence;
            if (i2 > 0) {
                charSequence2 = ((String)charSequence).concat(", ");
            }
            charSequence = ((String)charSequence2).concat(String.valueOf(qg2.ai));
        }
        return ((String)charSequence).concat("}");
    }
}

