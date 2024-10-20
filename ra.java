/*
 * Decompiled with CFR 0.152.
 */
public abstract class ra
implements qq {
    public int c;
    public qg d;
    public final qt e = new qt(this);
    public int f = 0;
    public boolean g = false;
    public final qs h = new qs(this);
    public final qs i = new qs(this);
    protected int j;
    protected int k = 1;
    awf l;

    public ra(qg qg2) {
        this.d = qg2;
    }

    protected static final void j(qs qs2, qs qs3, int n2) {
        qs2.k.add(qs3);
        qs2.e = n2;
        qs3.j.add(qs2);
    }

    protected static final qs k(qf object) {
        block3: {
            block4: {
                block5: {
                    block6: {
                        block7: {
                            block2: {
                                object = ((qf)object).e;
                                if (object == null) break block2;
                                int n2 = ((qf)object).i;
                                object = ((qf)object).d;
                                if (--n2 == 1) break block3;
                                if (n2 == 2) break block4;
                                if (n2 == 3) break block5;
                                if (n2 == 4) break block6;
                                if (n2 == 5) break block7;
                            }
                            return null;
                        }
                        return ((qg)object).i.a;
                    }
                    return ((qg)object).i.i;
                }
                return ((qg)object).h.i;
            }
            return ((qg)object).i.h;
        }
        return ((qg)object).h.h;
    }

    protected static final qs l(qf object, int n2) {
        block3: {
            block4: {
                block2: {
                    qf qf2 = ((qf)object).e;
                    if (qf2 == null) break block2;
                    object = qf2.d;
                    object = n2 == 0 ? ((qg)object).h : ((qg)object).i;
                    n2 = qf2.i - 1;
                    if (n2 == 1 || n2 == 2) break block3;
                    if (n2 == 3 || n2 == 4) break block4;
                }
                return null;
            }
            return ((ra)object).i;
        }
        return ((ra)object).h;
    }

    public long a() {
        qt qt2 = this.e;
        if (qt2.i) {
            return qt2.f;
        }
        return 0L;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract boolean e();

    @Override
    public void f() {
        throw null;
    }

    protected final int h(int n2, int n3) {
        block9: {
            block8: {
                block7: {
                    if (n3 != 0) break block7;
                    qg qg2 = this.d;
                    int n4 = qg2.w;
                    n3 = Math.max(qg2.v, n2);
                    if (n4 > 0) {
                        n3 = Math.min(n4, n2);
                    }
                    if (n3 != n2) {
                        n2 = n3;
                    }
                    break block8;
                }
                qg qg3 = this.d;
                int n5 = qg3.z;
                n3 = Math.max(qg3.y, n2);
                if (n5 > 0) {
                    n3 = Math.min(n5, n2);
                }
                if (n3 != n2) break block9;
            }
            return n2;
        }
        return n3;
    }

    protected final void i(qs qs2, qs qs3, int n2, qt qt2) {
        qs2.k.add(qs3);
        qs2.k.add(this.e);
        qs2.g = n2;
        qs2.h = qt2;
        qs3.j.add(qs2);
        qt2.j.add(qs2);
    }

    /*
     * Unable to fully structure code
     */
    protected final void m(qf var1_1, qf var2_2, int var3_3) {
        block10: {
            block11: {
                block12: {
                    block13: {
                        block14: {
                            block16: {
                                block15: {
                                    var13_4 = ra.k((qf)var1_1);
                                    var12_5 = ra.k((qf)var2_2);
                                    if (!var13_4.i || !var12_5.i) break block10;
                                    var8_6 = var13_4.f + var1_1.b();
                                    var7_7 = var12_5.f - var2_2.b();
                                    var2_2 = this.e;
                                    var11_8 = var7_7 - var8_6;
                                    var5_9 = var3_3;
                                    if (var2_2.i) break block11;
                                    var5_9 = var3_3;
                                    if (this.j != 3) break block11;
                                    var5_9 = this.c;
                                    if (var5_9 == 0) break block12;
                                    var9_10 = 1;
                                    if (var5_9 == 1) break block13;
                                    var6_11 = 0;
                                    var10_12 = 0;
                                    if (var5_9 == 2) break block14;
                                    if (var5_9 == 3) break block15;
                                    var5_9 = var3_3;
                                    break block11;
                                }
                                var14_13 = this.d;
                                var1_1 = var14_13.h;
                                if (var1_1.j != 3 || var1_1.c != 3) break block16;
                                var15_15 = var14_13.i;
                                if (var15_15.j != 3) break block16;
                                var5_9 = var3_3;
                                if (var15_15.c == 3) break block11;
                            }
                            if (var3_3 == 0) {
                                var1_1 = var14_13.i;
                                var5_9 = 0;
                                var6_11 = var10_12;
                            } else {
                                var5_9 = 1;
                                var6_11 = 1;
                            }
                            var1_1 = var1_1.e;
                            if (!var1_1.i) ** GOTO lbl-1000
                            var4_16 = var14_13.X;
                            var3_3 = var5_9 == 1 ? (int)((float)var1_1.f / var4_16 + 0.5f) : (int)(var4_16 * (float)var1_1.f + 0.5f);
                            var2_2.c(var3_3);
                            break block11;
                        }
                        var14_14 = this.d;
                        var1_1 = var14_14.U;
                        var5_9 = var3_3;
                        if (var1_1 != null) {
                            if (var3_3 == 0) {
                                var1_1 = var1_1.h;
                                var3_3 = 0;
                            } else {
                                var1_1 = var1_1.i;
                                var6_11 = 1;
                                var3_3 = var9_10;
                            }
                            var1_1 = var1_1.e;
                            ** if (!var1_1.i) goto lbl-1000
lbl-1000:
                            // 1 sources

                            {
                                var4_16 = var3_3 == 0 ? var14_14.x : var14_14.A;
                                var2_2.c((int)this.h((int)((int)((float)var1_1.f * var4_16 + 0.5f)), (int)var3_3));
                                var5_9 = var3_3;
                                ** GOTO lbl73
                            }
                        }
                        break block11;
lbl-1000:
                        // 2 sources

                        {
                            var5_9 = var6_11;
                        }
                        break block11;
                    }
                    var5_9 = this.h(var2_2.m, var3_3);
                    this.e.c(Math.min(var5_9, var11_8));
                    var5_9 = var3_3;
                    break block11;
                }
                var2_2.c(this.h(var11_8, var3_3));
                var5_9 = var3_3;
            }
            var1_1 = this.e;
            if (var1_1.i) {
                var6_11 = var1_1.f;
                if (var6_11 == var11_8) {
                    this.h.c(var8_6);
                    this.i.c(var7_7);
                    return;
                }
                var4_16 = var5_9 == 0 ? this.d.ae : this.d.af;
                var3_3 = var8_6;
                var5_9 = var7_7;
                if (var13_4 == var12_5) {
                    var3_3 = var13_4.f;
                    var5_9 = var12_5.f;
                    var4_16 = 0.5f;
                }
                this.h.c((int)((float)var3_3 + 0.5f + (float)(var5_9 - var3_3 - var6_11) * var4_16));
                var2_2 = this.i;
                var1_1 = this.h;
                var12_5 = this.e;
                var2_2.c(var1_1.f + var12_5.f);
            }
        }
    }
}

