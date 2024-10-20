/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 */
package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;

public class ConstraintLayout
extends ViewGroup {
    final SparseArray a = new SparseArray();
    final n b;
    private final ArrayList c = new ArrayList(100);
    private int d = 0;
    private int e = 0;
    private int f;
    private int g;
    private boolean h = true;
    private int i = 2;
    private d j = null;

    public ConstraintLayout(Context context) {
        super(context);
        this.b = new n();
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.d(null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new n();
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.d(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        this.b = new n();
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.d(attributeSet);
    }

    private final m b(int n2) {
        View view;
        if (n2 != 0 && (view = (View)this.a.get(n2)) != this) {
            if (view == null) {
                return null;
            }
            return ((b)view.getLayoutParams()).Y;
        }
        return this.b;
    }

    private final m c(View view) {
        if (view == this) {
            return this.b;
        }
        if (view == null) {
            return null;
        }
        return ((b)view.getLayoutParams()).Y;
    }

    private final void d(AttributeSet object) {
        this.b.J = this;
        this.a.put(this.getId(), (Object)this);
        this.j = null;
        if (object != null) {
            TypedArray typedArray = this.getContext().obtainStyledAttributes((AttributeSet)object, f.a);
            int n2 = typedArray.getIndexCount();
            for (int i2 = 0; i2 < n2; ++i2) {
                int n3 = typedArray.getIndex(i2);
                if (n3 == 16) {
                    this.d = typedArray.getDimensionPixelOffset(16, this.d);
                    continue;
                }
                if (n3 == 17) {
                    this.e = typedArray.getDimensionPixelOffset(17, this.e);
                    continue;
                }
                if (n3 == 14) {
                    this.f = typedArray.getDimensionPixelOffset(14, this.f);
                    continue;
                }
                if (n3 == 15) {
                    this.g = typedArray.getDimensionPixelOffset(15, this.g);
                    continue;
                }
                if (n3 == 113) {
                    this.i = typedArray.getInt(113, this.i);
                    continue;
                }
                if (n3 != 34) continue;
                n3 = typedArray.getResourceId(34, 0);
                object = new d();
                this.j = object;
                ((d)object).a(this.getContext(), n3);
            }
            typedArray.recycle();
        }
        this.b.ai = this.i;
    }

    protected final void a() {
        ((r)this.b).D();
    }

    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    protected final void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        n3 = this.getChildCount();
        bl2 = this.isInEditMode();
        for (n2 = 0; n2 < n3; ++n2) {
            View view = this.getChildAt(n2);
            Object object = (b)view.getLayoutParams();
            if (view.getVisibility() == 8 && !((b)((Object)object)).Q && !bl2) continue;
            object = ((b)((Object)object)).Y;
            n4 = ((m)object).b();
            n5 = ((m)object).c();
            view.layout(n4, n5, ((m)object).h() + n4, ((m)object).d() + n5);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected final void onMeasure(int var1_1, int var2_2) {
        block80: {
            var16_3 = this.b;
            var10_4 = this.getPaddingLeft();
            var11_5 = this.getPaddingTop();
            var16_3.w = var10_4;
            var16_3.x = var11_5;
            var15_6 = View.MeasureSpec.getMode((int)var1_1);
            var6_7 = View.MeasureSpec.getSize((int)var1_1);
            var9_8 = View.MeasureSpec.getMode((int)var2_2);
            var8_9 = View.MeasureSpec.getSize((int)var2_2);
            var12_10 = this.getPaddingTop();
            var13_11 = this.getPaddingBottom();
            var14_12 = this.getPaddingLeft();
            var7_13 = this.getPaddingRight();
            this.getLayoutParams();
            var5_14 = var6_7;
            if (var15_6 == -2147483648) ** GOTO lbl24
            if (var15_6 != 0) {
                var5_14 = var15_6 != 0x40000000 ? 0 : Math.min(this.f, var6_7) - (var14_12 + var7_13);
                var6_7 = 1;
                var7_13 = var5_14;
            } else {
                var5_14 = 0;
lbl24:
                // 2 sources

                var6_7 = 2;
                var7_13 = var5_14;
            }
            var5_14 = var8_9;
            if (var9_8 == -2147483648) ** GOTO lbl33
            if (var9_8 != 0) {
                var5_14 = var9_8 != 0x40000000 ? 0 : Math.min(this.g, var8_9) - (var12_10 + var13_11);
                var8_9 = 1;
            } else {
                var5_14 = 0;
lbl33:
                // 2 sources

                var8_9 = 2;
            }
            this.b.m(0);
            this.b.l(0);
            this.b.v(var6_7);
            this.b.p(var7_13);
            this.b.w(var8_9);
            this.b.j(var5_14);
            this.b.m(this.d - this.getPaddingLeft() - this.getPaddingRight());
            this.b.l(this.e - this.getPaddingTop() - this.getPaddingBottom());
            if (!this.h) break block80;
            this.h = false;
            var6_7 = this.getChildCount();
            for (var5_14 = 0; var5_14 < var6_7; ++var5_14) {
                if (!this.getChildAt(var5_14).isLayoutRequested()) continue;
                this.c.clear();
                var16_3 = this.j;
                if (var16_3 != null) {
                    var6_7 = this.getChildCount();
                    var18_15 = new HashSet<K>(var16_3.a.keySet());
                    for (var5_14 = 0; var5_14 < var6_7; ++var5_14) {
                        var19_18 = var16_3.a;
                        var17_17 = this.getChildAt(var5_14);
                        var7_13 = var17_17.getId();
                        var20_19 /* !! */  = var7_13;
                        if (!var19_18.containsKey(var20_19 /* !! */ )) continue;
                        var18_15.remove(var20_19 /* !! */ );
                        var19_18 = (c)var16_3.a.get(var20_19 /* !! */ );
                        var20_19 /* !! */  = (b)var17_17.getLayoutParams();
                        var19_18.a((b)var20_19 /* !! */ );
                        var17_17.setLayoutParams((ViewGroup.LayoutParams)var20_19 /* !! */ );
                        var17_17.setVisibility(var19_18.G);
                        var17_17.setAlpha(var19_18.R);
                        var17_17.setRotationX(var19_18.U);
                        var17_17.setRotationY(var19_18.V);
                        var17_17.setScaleX(var19_18.W);
                        var17_17.setScaleY(var19_18.X);
                        var17_17.setPivotX(var19_18.Y);
                        var17_17.setPivotY(var19_18.Z);
                        var17_17.setTranslationX(var19_18.aa);
                        var17_17.setTranslationY(var19_18.ab);
                        var17_17.setTranslationZ(var19_18.ac);
                        if (!var19_18.S) continue;
                        var17_17.setElevation(var19_18.T);
                    }
                    var18_15 = var18_15.iterator();
                    while (var18_15.hasNext()) {
                        var20_19 /* !! */  = (Integer)var18_15.next();
                        var17_17 = (c)var16_3.a.get(var20_19 /* !! */ );
                        if (!var17_17.a) continue;
                        var19_18 = new e(this.getContext());
                        var19_18.setId(var20_19 /* !! */ .intValue());
                        var20_19 /* !! */  = new b();
                        var17_17.a((b)var20_19 /* !! */ );
                        this.addView((View)var19_18, (ViewGroup.LayoutParams)var20_19 /* !! */ );
                    }
                }
                var7_13 = this.getChildCount();
                this.b.al.clear();
                block7: for (var6_7 = 0; var6_7 < var7_13; ++var6_7) {
                    block85: {
                        block84: {
                            block83: {
                                block81: {
                                    block82: {
                                        var18_15 = this.getChildAt(var6_7);
                                        var17_17 = this.c((View)var18_15);
                                        if (var17_17 == null) continue;
                                        var16_3 = (b)var18_15.getLayoutParams();
                                        var17_17.i();
                                        var17_17.K = var18_15.getVisibility();
                                        var17_17.J = var18_15;
                                        var19_18 = this.b;
                                        var19_18.al.add(var17_17);
                                        var18_15 = var17_17.r;
                                        if (var18_15 != null) {
                                            ((r)var18_15).F((m)var17_17);
                                        }
                                        var17_17.r = var19_18;
                                        if (!var16_3.O || !var16_3.N) {
                                            this.c.add(var17_17);
                                        }
                                        if (var16_3.Q) {
                                            var17_17 = (o)var17_17;
                                            var5_14 = var16_3.a;
                                            if (var5_14 != -1 && var5_14 >= 0) {
                                                var17_17.af = -1.0f;
                                                var17_17.ag = var5_14;
                                                var17_17.ah = -1;
                                            }
                                            if ((var5_14 = var16_3.b) != -1 && var5_14 >= 0) {
                                                var17_17.af = -1.0f;
                                                var17_17.ag = -1;
                                                var17_17.ah = var5_14;
                                            }
                                            if ((var5_14 = (int)((cfr_temp_0 = (var3_20 = var16_3.c) - -1.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1))) == 0 || var5_14 <= 0) continue;
                                            var17_17.af = var3_20;
                                            var17_17.ag = -1;
                                            var17_17.ah = -1;
                                            continue;
                                        }
                                        if (var16_3.R == -1 && var16_3.S == -1 && var16_3.T == -1 && var16_3.U == -1 && var16_3.h == -1 && var16_3.i == -1 && var16_3.j == -1 && var16_3.k == -1 && var16_3.l == -1 && var16_3.K == -1 && var16_3.L == -1 && var16_3.width != -1 && var16_3.height != -1) continue;
                                        var14_12 = var16_3.R;
                                        var12_10 = var16_3.S;
                                        var8_9 = var16_3.T;
                                        var5_14 = var16_3.U;
                                        var13_11 = var16_3.V;
                                        var9_8 = var16_3.W;
                                        var3_20 = var16_3.X;
                                        if (var14_12 != -1) {
                                            var18_15 = this.b(var14_12);
                                            if (var18_15 != null) {
                                                var17_17.u(2, (m)var18_15, 2, var16_3.leftMargin, var13_11);
                                            }
                                        } else if (var12_10 != -1 && (var18_15 = this.b(var12_10)) != null) {
                                            var17_17.u(2, (m)var18_15, 4, var16_3.leftMargin, var13_11);
                                        }
                                        if (var8_9 != -1) {
                                            var18_15 = this.b(var8_9);
                                            if (var18_15 != null) {
                                                var17_17.u(4, (m)var18_15, 2, var16_3.rightMargin, var9_8);
                                            }
                                        } else if (var5_14 != -1 && (var18_15 = this.b(var5_14)) != null) {
                                            var17_17.u(4, (m)var18_15, 4, var16_3.rightMargin, var9_8);
                                        }
                                        if ((var5_14 = var16_3.h) != -1) {
                                            var18_15 = this.b(var5_14);
                                            if (var18_15 != null) {
                                                var17_17.u(3, (m)var18_15, 3, var16_3.topMargin, var16_3.r);
                                            }
                                        } else {
                                            var5_14 = var16_3.i;
                                            if (var5_14 != -1 && (var18_15 = this.b(var5_14)) != null) {
                                                var17_17.u(3, (m)var18_15, 5, var16_3.topMargin, var16_3.r);
                                            }
                                        }
                                        if ((var5_14 = var16_3.j) != -1) {
                                            var18_15 = this.b(var5_14);
                                            if (var18_15 != null) {
                                                var17_17.u(5, (m)var18_15, 3, var16_3.bottomMargin, var16_3.t);
                                            }
                                        } else {
                                            var5_14 = var16_3.k;
                                            if (var5_14 != -1 && (var18_15 = this.b(var5_14)) != null) {
                                                var17_17.u(5, (m)var18_15, 5, var16_3.bottomMargin, var16_3.t);
                                            }
                                        }
                                        if ((var5_14 = var16_3.l) != -1) {
                                            var19_18 = (View)this.a.get(var5_14);
                                            var18_15 = this.b(var16_3.l);
                                            if (var18_15 != null && var19_18 != null && var19_18.getLayoutParams() instanceof b) {
                                                var19_18 = (b)var19_18.getLayoutParams();
                                                var16_3.P = true;
                                                var19_18.P = true;
                                                var17_17.t(6).d(var18_15.t(6), 0, -1, 2, 0, true);
                                                var17_17.t(3).b();
                                                var17_17.t(5).b();
                                            }
                                        }
                                        if (var3_20 >= 0.0f && var3_20 != 0.5f) {
                                            var17_17.H = var3_20;
                                        }
                                        if ((var3_20 = var16_3.x) >= 0.0f && var3_20 != 0.5f) {
                                            var17_17.I = var3_20;
                                        }
                                        if (!this.isInEditMode()) break block81;
                                        var5_14 = var8_9 = var16_3.K;
                                        if (var8_9 != -1) break block82;
                                        if (var16_3.L == -1) break block81;
                                        var5_14 = -1;
                                    }
                                    var8_9 = var16_3.L;
                                    var17_17.w = var5_14;
                                    var17_17.x = var8_9;
                                }
                                if (!var16_3.N) {
                                    if (var16_3.width == -1) {
                                        var17_17.v(4);
                                        var17_17.t((int)2).c = var16_3.leftMargin;
                                        var17_17.t((int)4).c = var16_3.rightMargin;
                                    } else {
                                        var17_17.v(3);
                                        var17_17.p(0);
                                    }
                                } else {
                                    var17_17.v(1);
                                    var17_17.p(var16_3.width);
                                }
                                if (!var16_3.O) {
                                    if (var16_3.height == -1) {
                                        var17_17.w(4);
                                        var17_17.t((int)3).c = var16_3.topMargin;
                                        var17_17.t((int)5).c = var16_3.bottomMargin;
                                    } else {
                                        var17_17.w(3);
                                        var17_17.j(0);
                                    }
                                } else {
                                    var17_17.w(1);
                                    var17_17.j(var16_3.height);
                                }
                                var19_18 = var16_3.y;
                                if (var19_18 == null) ** GOTO lbl251
                                if (var19_18.length() != 0) break block83;
                                var17_17.u = 0.0f;
                                ** GOTO lbl251
                            }
                            var9_8 = var19_18.length();
                            var8_9 = var19_18.indexOf(44);
                            if (var8_9 > 0 && var8_9 < var9_8 - 1) {
                                var18_15 = var19_18.substring(0, var8_9);
                                var5_14 = var18_15.equalsIgnoreCase("W") != false ? 0 : (var18_15.equalsIgnoreCase("H") != false ? 1 : -1);
                                ++var8_9;
                            } else {
                                var5_14 = -1;
                                var8_9 = 0;
                            }
                            var12_10 = var19_18.indexOf(58);
                            if (var12_10 < 0 || var12_10 >= var9_8 - 1) break block84;
                            var18_15 = var19_18.substring(var8_9, var12_10);
                            var19_18 = var19_18.substring(var12_10 + 1);
                            if (var18_15.length() <= 0 || var19_18.length() <= 0) break block85;
                            var4_21 = Float.parseFloat((String)var18_15);
                            var3_20 = Float.parseFloat((String)var19_18);
                            if (!(var4_21 > 0.0f) || !(var3_20 > 0.0f)) break block85;
                            if (var5_14 != 1) ** GOTO lbl237
                            var3_20 = Math.abs(var3_20 / var4_21);
                            ** GOTO lbl248
lbl237:
                            // 1 sources

                            var3_20 = Math.abs(var4_21 / var3_20);
                            ** GOTO lbl248
                        }
                        var18_15 = var19_18.substring(var8_9);
                        if (var18_15.length() <= 0) break block85;
                        var3_20 = Float.parseFloat((String)var18_15);
                        ** GOTO lbl248
                    }
lbl246:
                    // 2 sources

                    while (true) {
                        var3_20 = 0.0f;
lbl248:
                        // 4 sources

                        if (var3_20 > 0.0f) {
                            var17_17.u = var3_20;
                            var17_17.v = var5_14;
                        }
lbl251:
                        // 5 sources

                        var17_17.Z = var16_3.A;
                        var17_17.aa = var16_3.B;
                        var17_17.V = var16_3.C;
                        var17_17.W = var16_3.D;
                        var8_9 = var16_3.E;
                        var5_14 = var16_3.G;
                        var9_8 = var16_3.I;
                        var17_17.c = var8_9;
                        var17_17.e = var5_14;
                        var17_17.f = var9_8;
                        var9_8 = var16_3.F;
                        var5_14 = var16_3.H;
                        var8_9 = var16_3.J;
                        var17_17.d = var9_8;
                        var17_17.g = var5_14;
                        var17_17.h = var8_9;
                        continue block7;
                        break;
                    }
                }
                break;
            }
        }
        var13_11 = this.getPaddingTop() + this.getPaddingBottom();
        var12_10 = this.getPaddingLeft() + this.getPaddingRight();
        var14_12 = this.getChildCount();
        for (var7_13 = 0; var7_13 < var14_12; ++var7_13) {
            var16_3 = this.getChildAt(var7_13);
            if (var16_3.getVisibility() == 8) continue;
            var18_15 = (b)var16_3.getLayoutParams();
            var17_17 = var18_15.Y;
            if (var18_15.Q) continue;
            var8_9 = var18_15.width;
            var9_8 = var18_15.height;
            if (!var18_15.N && !var18_15.O && var18_15.E != 1 && var18_15.width != -1 && (var18_15.O || var18_15.F != 1 && var18_15.height != -1)) {
                var6_7 = 0;
                var5_14 = 0;
            } else {
                if (var8_9 != 0 && var8_9 != -1) {
                    var8_9 = ConstraintLayout.getChildMeasureSpec((int)var1_1, (int)var12_10, (int)var8_9);
                    var5_14 = 0;
                } else {
                    var8_9 = ConstraintLayout.getChildMeasureSpec((int)var1_1, (int)var12_10, (int)-2);
                    var5_14 = 1;
                }
                if (var9_8 != 0 && var9_8 != -1) {
                    var9_8 = ConstraintLayout.getChildMeasureSpec((int)var2_2, (int)var13_11, (int)var9_8);
                    var6_7 = 0;
                } else {
                    var9_8 = ConstraintLayout.getChildMeasureSpec((int)var2_2, (int)var13_11, (int)-2);
                    var6_7 = 1;
                }
                var16_3.measure(var8_9, var9_8);
                var8_9 = var16_3.getMeasuredWidth();
                var9_8 = var16_3.getMeasuredHeight();
            }
            var17_17.p(var8_9);
            var17_17.j(var9_8);
            if (var5_14 != 0) {
                var17_17.F = var8_9;
            }
            if (var6_7 != 0) {
                var17_17.G = var9_8;
            }
            if (!var18_15.P || (var5_14 = var16_3.getBaseline()) == -1) continue;
            var17_17.C = var5_14;
        }
        if (this.getChildCount() > 0) {
            this.a();
        }
        var9_8 = this.c.size();
        var11_5 += this.getPaddingBottom();
        var12_10 = var10_4 + this.getPaddingRight();
        if (var9_8 > 0) {
            var16_3 = this.b;
            var13_11 = var16_3.ad;
            var14_12 = var16_3.ae;
            var5_14 = 0;
            var6_7 = 0;
            for (var8_9 = 0; var8_9 < var9_8; ++var8_9) {
                var16_3 = (m)this.c.get(var8_9);
                if (var16_3 instanceof o || (var17_17 = var16_3.J) == null || (var18_15 = (View)var17_17).getVisibility() == 8) continue;
                var17_17 = (b)var18_15.getLayoutParams();
                var7_13 = var17_17.width == -2 ? ConstraintLayout.getChildMeasureSpec((int)var1_1, (int)var12_10, (int)var17_17.width) : View.MeasureSpec.makeMeasureSpec((int)var16_3.h(), (int)0x40000000);
                var10_4 = var17_17.height == -2 ? ConstraintLayout.getChildMeasureSpec((int)var2_2, (int)var11_5, (int)var17_17.height) : View.MeasureSpec.makeMeasureSpec((int)var16_3.d(), (int)0x40000000);
                var18_15.measure(var7_13, var10_4);
                var10_4 = var18_15.getMeasuredWidth();
                var7_13 = var18_15.getMeasuredHeight();
                if (var10_4 != var16_3.h()) {
                    var16_3.p(var10_4);
                    if (var13_11 == 2 && var16_3.g() > this.b.h()) {
                        var10_4 = var16_3.g();
                        var6_7 = var16_3.t(4).a();
                        this.b.p(Math.max(this.d, var10_4 + var6_7));
                    }
                    var6_7 = 1;
                }
                if (var7_13 != var16_3.d()) {
                    var16_3.j(var7_13);
                    if (var14_12 == 2 && var16_3.a() > this.b.d()) {
                        var7_13 = var16_3.a();
                        var6_7 = var16_3.t(5).a();
                        this.b.j(Math.max(this.e, var7_13 + var6_7));
                    }
                    var7_13 = 1;
                } else {
                    var7_13 = var6_7;
                }
                if (var17_17.P) {
                    var10_4 = var18_15.getBaseline();
                    var6_7 = var7_13;
                    if (var10_4 != -1) {
                        var6_7 = var7_13;
                        if (var10_4 != var16_3.C) {
                            var16_3.C = var10_4;
                            var6_7 = 1;
                        }
                    }
                } else {
                    var6_7 = var7_13;
                }
                var5_14 = ConstraintLayout.combineMeasuredStates((int)var5_14, (int)var18_15.getMeasuredState());
            }
            if (var6_7 != 0) {
                this.a();
            }
        } else {
            var5_14 = 0;
        }
        var7_13 = this.b.h();
        var6_7 = this.b.d();
        var1_1 = ConstraintLayout.resolveSizeAndState((int)(var7_13 + var12_10), (int)var1_1, (int)var5_14);
        var2_2 = ConstraintLayout.resolveSizeAndState((int)(var6_7 + var11_5), (int)var2_2, (int)(var5_14 << 16));
        var5_14 = Math.min(this.f, var1_1);
        var1_1 = Math.min(this.g, var2_2);
        var2_2 = var5_14 & 0xFFFFFF;
        var5_14 = var1_1 & 0xFFFFFF;
        var16_3 = this.b;
        var1_1 = var2_2;
        if (var16_3.aj) {
            var1_1 = var2_2 | 0x1000000;
        }
        var2_2 = var5_14;
        if (var16_3.ak) {
            var2_2 = var5_14 | 0x1000000;
        }
        this.setMeasuredDimension(var1_1, var2_2);
        return;
        catch (NumberFormatException var18_16) {
            ** continue;
        }
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        boolean bl2 = view instanceof e;
        Object object = this.c(view);
        if (bl2 && !(object instanceof o)) {
            object = (b)view.getLayoutParams();
            ((b)((Object)object)).Y = new o();
            ((b)((Object)object)).Q = true;
            ((o)((b)((Object)object)).Y).A(((b)((Object)object)).M);
            object = ((b)((Object)object)).Y;
        }
        this.a.put(view.getId(), (Object)view);
        this.h = true;
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.b.F(this.c(view));
        this.h = true;
    }

    public final void requestLayout() {
        super.requestLayout();
        this.h = true;
    }

    public final void setId(int n2) {
        this.a.remove(this.getId());
        super.setId(n2);
        this.a.put(this.getId(), (Object)this);
    }
}

