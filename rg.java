/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 */
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class rg {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    final ConstraintLayout h;

    public rg(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    private static final boolean b(int n2, int n3, int n4) {
        if (n2 == n3) {
            return true;
        }
        n2 = View.MeasureSpec.getMode((int)n2);
        int n5 = View.MeasureSpec.getMode((int)n3);
        n3 = View.MeasureSpec.getSize((int)n3);
        return n5 == 0x40000000 && (n2 == Integer.MIN_VALUE || n2 == 0) && n4 == n3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(qg var1_1, qo var2_2) {
        block31: {
            block30: {
                block32: {
                    block39: {
                        block47: {
                            block48: {
                                block46: {
                                    block43: {
                                        block40: {
                                            block41: {
                                                block45: {
                                                    block44: {
                                                        block42: {
                                                            block36: {
                                                                block33: {
                                                                    block34: {
                                                                        block38: {
                                                                            block37: {
                                                                                block35: {
                                                                                    if (var1_1 == null) break block30;
                                                                                    if (var1_1.ah == 8) break block31;
                                                                                    if (var1_1.U == null) break block30;
                                                                                    var8_3 = var2_2.i;
                                                                                    var9_4 = var2_2.j;
                                                                                    var4_5 = var2_2.a;
                                                                                    var6_6 = var2_2.b;
                                                                                    var7_7 = this.b + this.c;
                                                                                    var10_8 = this.d;
                                                                                    var18_9 = var1_1.ag;
                                                                                    var5_10 = var8_3 - 1;
                                                                                    if (var8_3 == 0) break block32;
                                                                                    if (var5_10 == 0) break block33;
                                                                                    if (var5_10 == 1) break block34;
                                                                                    if (var5_10 == 2) break block35;
                                                                                    if (var5_10 != 3) {
                                                                                        var4_5 = 0;
                                                                                    } else {
                                                                                        var11_11 = this.f;
                                                                                        var19_12 = var1_1.J;
                                                                                        var4_5 = var19_12 != null ? var19_12.f : 0;
                                                                                        var19_12 = var1_1.L;
                                                                                        var5_10 = var4_5;
                                                                                        if (var19_12 != null) {
                                                                                            var5_10 = var4_5 + var19_12.f;
                                                                                        }
                                                                                        var4_5 = ViewGroup.getChildMeasureSpec((int)var11_11, (int)(var10_8 + var5_10), (int)-1);
                                                                                    }
                                                                                    break block36;
                                                                                }
                                                                                var5_10 = ViewGroup.getChildMeasureSpec((int)this.f, (int)var10_8, (int)-2);
                                                                                var10_8 = var1_1.s;
                                                                                var11_11 = var2_2.h;
                                                                                if (var11_11 == 1) break block37;
                                                                                var4_5 = var5_10;
                                                                                if (var11_11 != 2) break block36;
                                                                            }
                                                                            var4_5 = ((View)var18_9).getMeasuredHeight();
                                                                            var11_11 = var1_1.h();
                                                                            if (var2_2.h == 2 || var10_8 != 1 || var4_5 == var11_11 || var18_9 instanceof rq) break block38;
                                                                            var4_5 = var5_10;
                                                                            if (!var1_1.e()) break block36;
                                                                        }
                                                                        var4_5 = View.MeasureSpec.makeMeasureSpec((int)var1_1.j(), (int)0x40000000);
                                                                        break block36;
                                                                    }
                                                                    var4_5 = ViewGroup.getChildMeasureSpec((int)this.f, (int)var10_8, (int)-2);
                                                                    break block36;
                                                                }
                                                                var4_5 = View.MeasureSpec.makeMeasureSpec((int)var4_5, (int)0x40000000);
                                                            }
                                                            var5_10 = var9_4 - 1;
                                                            if (var9_4 == 0) break block39;
                                                            if (var5_10 == 0) break block40;
                                                            if (var5_10 == 1) break block41;
                                                            if (var5_10 == 2) break block42;
                                                            if (var5_10 != 3) {
                                                                var5_10 = 0;
                                                            } else {
                                                                var10_8 = this.g;
                                                                var5_10 = var1_1.J != null ? var1_1.K.f : 0;
                                                                var6_6 = var5_10;
                                                                if (var1_1.L != null) {
                                                                    var6_6 = var5_10 + var1_1.M.f;
                                                                }
                                                                var5_10 = ViewGroup.getChildMeasureSpec((int)var10_8, (int)(var7_7 + var6_6), (int)-1);
                                                            }
                                                            break block43;
                                                        }
                                                        var6_6 = ViewGroup.getChildMeasureSpec((int)this.g, (int)var7_7, (int)-2);
                                                        var7_7 = var1_1.t;
                                                        var10_8 = var2_2.h;
                                                        if (var10_8 == 1) break block44;
                                                        var5_10 = var6_6;
                                                        if (var10_8 != 2) break block43;
                                                    }
                                                    var5_10 = ((View)var18_9).getMeasuredWidth();
                                                    var10_8 = var1_1.j();
                                                    if (var2_2.h == 2 || var7_7 != 1 || var5_10 == var10_8 || var18_9 instanceof rq) break block45;
                                                    var5_10 = var6_6;
                                                    if (!var1_1.f()) break block43;
                                                }
                                                var5_10 = View.MeasureSpec.makeMeasureSpec((int)var1_1.h(), (int)0x40000000);
                                                break block43;
                                            }
                                            var5_10 = ViewGroup.getChildMeasureSpec((int)this.g, (int)var7_7, (int)-2);
                                            break block43;
                                        }
                                        var5_10 = View.MeasureSpec.makeMeasureSpec((int)var6_6, (int)0x40000000);
                                    }
                                    var19_12 = var1_1.U;
                                    if (var19_12 != null && ql.b(this.h.e, 256) && (var20_13 /* !! */  = (View)var18_9).getMeasuredWidth() == var1_1.j() && var20_13 /* !! */ .getMeasuredWidth() < var19_12.j() && var20_13 /* !! */ .getMeasuredHeight() == var1_1.h() && var20_13 /* !! */ .getMeasuredHeight() < var19_12.h() && var20_13 /* !! */ .getBaseline() == var1_1.ab && !var1_1.J() && rg.b(var1_1.H, var4_5, var1_1.j()) && rg.b(var1_1.I, var5_10, var1_1.h())) {
                                        var2_2.c = var1_1.j();
                                        var2_2.d = var1_1.h();
                                        var2_2.e = var1_1.ab;
                                        return;
                                    }
                                    var6_6 = var8_3 == 3 ? 1 : 0;
                                    var7_7 = var9_4 == 3 ? 1 : 0;
                                    var10_8 = var9_4 != 4 && var9_4 != 1 ? 0 : 1;
                                    var11_11 = var8_3 != 4 && var8_3 != 1 ? 0 : 1;
                                    var12_14 = var6_6 != 0 && var1_1.X > 0.0f;
                                    var13_15 = var7_7 != 0 && var1_1.X > 0.0f;
                                    if (var18_9 == null) break block30;
                                    var19_12 = (View)var18_9;
                                    var20_13 /* !! */  = (rf)var19_12.getLayoutParams();
                                    var8_3 = var2_2.h;
                                    if (var8_3 == 1 || var8_3 == 2 || var6_6 == 0 || var1_1.s != 0 || var7_7 == 0 || var1_1.t != 0) break block46;
                                    var10_8 = 0;
                                    var6_6 = 0;
                                    var9_4 = 0;
                                    break block47;
                                }
                                if (var18_9 instanceof rt && var1_1 instanceof qm) {
                                    var1_1 = (qm)var1_1;
                                    var1_1 = (rt)var18_9;
                                    throw null;
                                }
                                var19_12.measure(var4_5, var5_10);
                                var1_1.z(var4_5, var5_10);
                                var15_16 = var19_12.getMeasuredWidth();
                                var14_17 = var19_12.getMeasuredHeight();
                                var16_18 = var19_12.getBaseline();
                                var6_6 = var1_1.v;
                                var7_7 = var6_6 > 0 ? Math.max(var6_6, var15_16) : var15_16;
                                var8_3 = var1_1.w;
                                var6_6 = var7_7;
                                if (var8_3 > 0) {
                                    var6_6 = Math.min(var8_3, var7_7);
                                }
                                var7_7 = (var7_7 = var1_1.y) > 0 ? Math.max(var7_7, var14_17) : var14_17;
                                var8_3 = var1_1.z;
                                var9_4 = var7_7;
                                if (var8_3 > 0) {
                                    var9_4 = Math.min(var8_3, var7_7);
                                }
                                var8_3 = var6_6;
                                var7_7 = var9_4;
                                if (!ql.b(this.h.e, 1)) {
                                    if (var12_14 && var10_8 != 0) {
                                        var3_19 = var1_1.X;
                                        var8_3 = (int)((float)var9_4 * var3_19 + 0.5f);
                                        var7_7 = var9_4;
                                    } else {
                                        var8_3 = var6_6;
                                        var7_7 = var9_4;
                                        if (var13_15) {
                                            var8_3 = var6_6;
                                            var7_7 = var9_4;
                                            if (var11_11 != 0) {
                                                var3_20 = var1_1.X;
                                                var7_7 = (int)((float)var6_6 / var3_20 + 0.5f);
                                                var8_3 = var6_6;
                                            }
                                        }
                                    }
                                }
                                if (var15_16 != var8_3) break block48;
                                var10_8 = var16_18;
                                var6_6 = var8_3;
                                var9_4 = var7_7;
                                if (var14_17 == var7_7) break block47;
                            }
                            if (var15_16 != var8_3) {
                                var4_5 = View.MeasureSpec.makeMeasureSpec((int)var8_3, (int)0x40000000);
                            }
                            if (var14_17 != var7_7) {
                                var5_10 = View.MeasureSpec.makeMeasureSpec((int)var7_7, (int)0x40000000);
                            }
                            var19_12.measure(var4_5, var5_10);
                            var1_1.z(var4_5, var5_10);
                            var6_6 = var19_12.getMeasuredWidth();
                            var9_4 = var19_12.getMeasuredHeight();
                            var10_8 = var19_12.getBaseline();
                        }
                        var4_5 = var10_8 == -1 ? 0 : 1;
                        var17_21 = var6_6 == var2_2.a && var9_4 == var2_2.b ? 0 : 1;
                        var2_2.g = var17_21;
                        var17_21 = var4_5 | var20_13 /* !! */ .ag;
                        if (var17_21 == 0) ** GOTO lbl174
                        if (var10_8 == -1) {
                            var4_5 = -1;
                        } else {
                            if (var1_1.ab != var10_8) {
                                var2_2.g = true;
                            }
lbl174:
                            // 4 sources

                            var4_5 = var10_8;
                        }
                        var2_2.c = var6_6;
                        var2_2.d = var9_4;
                        var2_2.f = var17_21;
                        var2_2.e = var4_5;
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            return;
        }
        var2_2.c = 0;
        var2_2.d = 0;
        var2_2.e = 0;
    }
}

