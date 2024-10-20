/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.util.AttributeSet
 *  android.view.ContextThemeWrapper
 *  android.view.Menu
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup$LayoutParams
 *  android.view.accessibility.AccessibilityEvent
 */
package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.view.menu.ActionMenuItemView;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.wear.ambient.AmbientMode$AmbientController;

public class ActionMenuView
extends jp
implements fr,
gg {
    public fs a;
    public boolean b;
    public gy c;
    public fq d;
    public AmbientMode$AmbientController e;
    private Context i;
    private int j;
    private boolean k;
    private int l;
    private int m;
    private int n;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s();
        float f2 = context.getResources().getDisplayMetrics().density;
        this.m = (int)(56.0f * f2);
        this.n = (int)(f2 * 4.0f);
        this.i = context;
        this.j = 0;
    }

    public static final hb m() {
        hb hb2 = new hb();
        hb2.gravity = 16;
        return hb2;
    }

    public static final hb n(ViewGroup.LayoutParams object) {
        if (object != null) {
            object = object instanceof hb ? new hb((hb)((Object)object)) : new hb((ViewGroup.LayoutParams)object);
            if (object.gravity <= 0) {
                object.gravity = 16;
            }
            return object;
        }
        return ActionMenuView.m();
    }

    @Override
    public final void a(fs fs2) {
        this.a = fs2;
    }

    @Override
    public final boolean b(fu fu2) {
        return this.a.z(fu2, 0);
    }

    public final hb c(AttributeSet attributeSet) {
        return new hb(this.getContext(), attributeSet);
    }

    @Override
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof hb;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final Menu g() {
        if (this.a == null) {
            fs fs2;
            Object object = this.getContext();
            this.a = fs2 = new fs((Context)object);
            fs2.p(new ly(this, 1));
            object = new gy((Context)object);
            this.c = object;
            ((gy)object).p();
            object = this.c;
            ((fi)object).e = new ha();
            this.a.h((ge)object, this.i);
            this.c.j(this);
        }
        return this.a;
    }

    public final void h() {
        gy gy2 = this.c;
        if (gy2 != null) {
            gy2.n();
        }
    }

    public final void i(int n2) {
        if (this.j != n2) {
            this.j = n2;
            if (n2 == 0) {
                this.i = this.getContext();
                return;
            }
            this.i = new ContextThemeWrapper(this.getContext(), n2);
        }
    }

    public final void j(gy gy2) {
        this.c = gy2;
        gy2.j(this);
    }

    protected final boolean k(int n2) {
        boolean bl2 = false;
        if (n2 == 0) {
            return false;
        }
        View view = this.getChildAt(n2 - 1);
        View view2 = this.getChildAt(n2);
        boolean bl3 = bl2;
        if (n2 < this.getChildCount()) {
            bl3 = bl2;
            if (view instanceof gz) {
                bl3 = ((gz)view).c();
            }
        }
        if (n2 > 0 && view2 instanceof gz) {
            return ((gz)view2).d() | bl3;
        }
        return bl3;
    }

    public final boolean l() {
        gy gy2 = this.c;
        return gy2 != null && gy2.l();
    }

    public final void onConfigurationChanged(Configuration object) {
        super.onConfigurationChanged((Configuration)object);
        object = this.c;
        if (object != null) {
            ((fi)object).i();
            if (this.c.l()) {
                this.c.k();
                this.c.m();
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h();
    }

    @Override
    protected final void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        hb hb2;
        View view;
        int n6;
        if (!this.k) {
            super.onLayout(bl2, n2, n3, n4, n5);
            return;
        }
        int n7 = this.getChildCount();
        int n8 = this.h;
        int n9 = n4 - n2;
        int n10 = n9 - this.getPaddingRight() - this.getPaddingLeft();
        bl2 = mi.a((View)this);
        int n11 = 0;
        int n12 = 0;
        n4 = 0;
        while (true) {
            n6 = (n5 - n3) / 2;
            if (n11 >= n7) break;
            view = this.getChildAt(n11);
            n2 = n10;
            int n13 = n12;
            int n14 = n4;
            if (view.getVisibility() != 8) {
                hb2 = (hb)view.getLayoutParams();
                if (hb2.a) {
                    n2 = n12 = view.getMeasuredWidth();
                    if (this.k(n11)) {
                        n2 = n12 + n8;
                    }
                    n13 = view.getMeasuredHeight();
                    if (bl2) {
                        n14 = this.getPaddingLeft() + hb2.leftMargin;
                        n12 = n14 + n2;
                    } else {
                        n12 = this.getWidth() - this.getPaddingRight() - hb2.rightMargin;
                        n14 = n12 - n2;
                    }
                    view.layout(n14, n6 -= n13 / 2, n12, n13 + n6);
                    n2 = n10 - n2;
                    n13 = 1;
                    n14 = n4;
                } else {
                    n2 = n10 - (view.getMeasuredWidth() + hb2.leftMargin + hb2.rightMargin);
                    this.k(n11);
                    n14 = n4 + 1;
                    n13 = n12;
                }
            }
            ++n11;
            n10 = n2;
            n12 = n13;
            n4 = n14;
        }
        n2 = n7;
        if (n7 == 1) {
            if (n12 != 0) {
                n2 = 1;
            } else {
                view = this.getChildAt(0);
                n3 = view.getMeasuredWidth();
                n2 = view.getMeasuredHeight();
                n4 = n9 / 2;
                n11 = n3 / 2;
                n5 = n6 - n2 / 2;
                view.layout(n4 -= n11, n5, n3 + n4, n2 + n5);
                return;
            }
        }
        n3 = (n3 = n4 - (n12 ^ 1)) > 0 ? n10 / n3 : 0;
        n11 = Math.max(0, n3);
        if (bl2) {
            n4 = this.getWidth() - this.getPaddingRight();
            for (n3 = 0; n3 < n2; ++n3) {
                view = this.getChildAt(n3);
                hb2 = (hb)view.getLayoutParams();
                n5 = n4;
                if (view.getVisibility() != 8) {
                    n5 = n4;
                    if (!hb2.a) {
                        n5 = n4 - hb2.rightMargin;
                        n12 = view.getMeasuredWidth();
                        n10 = view.getMeasuredHeight();
                        n4 = n6 - n10 / 2;
                        view.layout(n5 - n12, n4, n5, n10 + n4);
                        n5 -= n12 + hb2.leftMargin + n11;
                    }
                }
                n4 = n5;
            }
        } else {
            n5 = this.getPaddingLeft();
            for (n3 = 0; n3 < n2; ++n3) {
                view = this.getChildAt(n3);
                hb2 = (hb)view.getLayoutParams();
                n4 = n5;
                if (view.getVisibility() != 8) {
                    n4 = n5;
                    if (!hb2.a) {
                        n12 = n5 + hb2.leftMargin;
                        n5 = view.getMeasuredWidth();
                        n4 = view.getMeasuredHeight();
                        n10 = n6 - n4 / 2;
                        view.layout(n12, n10, n12 + n5, n4 + n10);
                        n4 = n12 + (n5 + hb2.rightMargin + n11);
                    }
                }
                n5 = n4;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    protected final void onMeasure(int var1_1, int var2_2) {
        block48: {
            block49: {
                block50: {
                    block47: {
                        var33_3 = this.k;
                        var32_4 = View.MeasureSpec.getMode((int)var1_1) == 0x40000000;
                        this.k = var32_4;
                        if (var33_3 != var32_4) {
                            this.l = 0;
                        }
                        var6_5 = View.MeasureSpec.getSize((int)var1_1);
                        if (this.k && (var34_6 /* !! */  = this.a) != null && var6_5 != this.l) {
                            this.l = var6_5;
                            var34_6 /* !! */ .l(true);
                        }
                        var7_7 = this.getChildCount();
                        if (!this.k || var7_7 <= 0) break block48;
                        var20_8 = View.MeasureSpec.getMode((int)var2_2);
                        var6_5 = View.MeasureSpec.getSize((int)var1_1);
                        var9_9 = View.MeasureSpec.getSize((int)var2_2);
                        var1_1 = this.getPaddingLeft();
                        var7_7 = this.getPaddingRight();
                        var15_10 = this.getPaddingTop() + this.getPaddingBottom();
                        var21_11 = ActionMenuView.getChildMeasureSpec((int)var2_2, (int)var15_10, (int)-2);
                        var11_12 = var6_5 - (var1_1 + var7_7);
                        var10_13 = var11_12 / (var1_1 = this.m);
                        if (var10_13 == 0) {
                            this.setMeasuredDimension(var11_12, 0);
                            return;
                        }
                        var22_14 = var1_1 + var11_12 % var1_1 / var10_13;
                        var23_15 = this.getChildCount();
                        var16_16 = 0;
                        var7_7 = var6_5 = (var2_2 = (var1_1 = (var8_17 = 0)));
                        var24_18 = 0L;
                        var12_19 = var6_5;
                        var13_20 = var2_2;
                        var14_21 = var1_1;
                        var2_2 = var8_17;
                        var8_17 = var16_16;
                        var1_1 = var10_13;
                        var6_5 = var9_9;
                        while (var14_21 < var23_15) {
                            var36_26 = this.getChildAt(var14_21);
                            if (var36_26.getVisibility() != 8) {
                                var33_3 = var36_26 instanceof ActionMenuItemView;
                                if (var33_3) {
                                    var9_9 = this.n;
                                    var36_26.setPadding(var9_9, 0, var9_9, 0);
                                    var9_9 = 1;
                                } else {
                                    var9_9 = 0;
                                }
                                var37_27 = (hb)var36_26.getLayoutParams();
                                var37_27.f = false;
                                var37_27.c = 0;
                                var37_27.b = 0;
                                var37_27.d = false;
                                var37_27.leftMargin = 0;
                                var37_27.rightMargin = 0;
                                var32_4 = var9_9 != 0 && ((ActionMenuItemView)var36_26).b() != false;
                                var37_27.e = var32_4;
                                var9_9 = true != var37_27.a ? var1_1 : 1;
                                var35_25 /* !! */  = (hb)var36_26.getLayoutParams();
                                var17_22 = View.MeasureSpec.makeMeasureSpec((int)(View.MeasureSpec.getSize((int)var21_11) - var15_10), (int)View.MeasureSpec.getMode((int)var21_11));
                                var34_6 /* !! */  = var33_3 != false ? (ActionMenuItemView)var36_26 : null;
                                var16_16 = var34_6 /* !! */  != null && var34_6 /* !! */ .b() != false ? 1 : 0;
                                if (var9_9 > 0 && (var16_16 == 0 || var9_9 >= 2)) {
                                    var36_26.measure(View.MeasureSpec.makeMeasureSpec((int)(var9_9 * var22_14), (int)-2147483648), var17_22);
                                    var18_23 = var36_26.getMeasuredWidth();
                                    var10_13 = var9_9 = var18_23 / var22_14;
                                    if (var18_23 % var22_14 != 0) {
                                        var10_13 = var9_9 + 1;
                                    }
                                    var9_9 = var10_13;
                                    if (var16_16 != 0) {
                                        var9_9 = var10_13;
                                        if (var10_13 < 2) {
                                            var9_9 = 2;
                                        }
                                    }
                                } else {
                                    var9_9 = 0;
                                }
                                var32_4 = var35_25 /* !! */ .a == false && var16_16 != 0;
                                var35_25 /* !! */ .d = var32_4;
                                var35_25 /* !! */ .b = var9_9;
                                var36_26.measure(View.MeasureSpec.makeMeasureSpec((int)(var9_9 * var22_14), (int)0x40000000), var17_22);
                                var12_19 = Math.max(var12_19, var9_9);
                                var10_13 = var2_2;
                                if (var37_27.d) {
                                    var10_13 = var2_2 + 1;
                                }
                                var13_20 |= var37_27.a;
                                var1_1 -= var9_9;
                                var7_7 = Math.max(var7_7, var36_26.getMeasuredHeight());
                                var26_24 = var24_18;
                                if (var9_9 == 1) {
                                    var26_24 = var24_18 | (long)(1 << var14_21);
                                }
                                ++var8_17;
                                var24_18 = var26_24;
                                var2_2 = var10_13;
                            }
                            ++var14_21;
                        }
                        var9_9 = var7_7;
                        if (var13_20 != 0 && var8_17 == 2) {
                            var10_13 = 1;
                            var7_7 = 2;
                        } else {
                            var10_13 = 0;
                            var7_7 = var8_17;
                        }
                        var15_10 = 0;
                        var8_17 = var2_2;
                        var14_21 = var1_1;
                        var2_2 = var15_10;
                        var1_1 = var9_9;
                        while (var8_17 > 0 && var14_21 > 0) {
                            var15_10 = 0x7FFFFFFF;
                            var17_22 = 0;
                            var28_29 = 0L;
                            var9_9 = var2_2;
                            for (var16_16 = 0; var16_16 < var23_15; ++var16_16) {
                                var34_6 /* !! */  = (hb)this.getChildAt(var16_16).getLayoutParams();
                                if (!var34_6 /* !! */ .d) {
                                    var18_23 = var15_10;
                                    var2_2 = var17_22;
                                    var26_24 = var28_29;
                                } else {
                                    var19_28 = var34_6 /* !! */ .b;
                                    if (var19_28 < var15_10) {
                                        var26_24 = 1L << var16_16;
                                        var2_2 = 1;
                                        var18_23 = var19_28;
                                    } else {
                                        var18_23 = var15_10;
                                        var2_2 = var17_22;
                                        var26_24 = var28_29;
                                        if (var19_28 == var15_10) {
                                            var26_24 = var28_29 | 1L << var16_16;
                                            var2_2 = var17_22 + 1;
                                            var18_23 = var15_10;
                                        }
                                    }
                                }
                                var15_10 = var18_23;
                                var17_22 = var2_2;
                                var28_29 = var26_24;
                            }
                            var2_2 = var1_1;
                            var1_1 = var9_9;
                            var24_18 |= var28_29;
                            if (var17_22 <= var14_21) {
                                var9_9 = var14_21;
                                for (var1_1 = 0; var1_1 < var23_15; ++var1_1) {
                                    var35_25 /* !! */  = this.getChildAt(var1_1);
                                    var34_6 /* !! */  = (hb)var35_25 /* !! */ .getLayoutParams();
                                    var30_30 = 1 << var1_1;
                                    if ((var28_29 & var30_30) == 0L) {
                                        var26_24 = var24_18;
                                        if (var34_6 /* !! */ .b == var15_10 + 1) {
                                            var26_24 = var24_18 | var30_30;
                                        }
                                        var24_18 = var26_24;
                                        continue;
                                    }
                                    var14_21 = var9_9;
                                    if (var10_13 != 0) {
                                        var14_21 = var9_9;
                                        if (var34_6 /* !! */ .e) {
                                            var14_21 = var9_9;
                                            if (var9_9 == 1) {
                                                var9_9 = this.n;
                                                var35_25 /* !! */ .setPadding(var9_9 + var22_14, 0, var9_9, 0);
                                                var14_21 = 1;
                                            }
                                        }
                                    }
                                    ++var34_6 /* !! */ .b;
                                    var34_6 /* !! */ .f = true;
                                    var9_9 = var14_21 - 1;
                                }
                                var14_21 = 1;
                                var1_1 = var2_2;
                                var2_2 = var14_21;
                                var14_21 = var9_9;
                                continue;
                            }
                            break block47;
                        }
                        var8_17 = var1_1;
                        var1_1 = var2_2;
                        var2_2 = var8_17;
                    }
                    if (var13_20 == 0 && var7_7 == 1) {
                        var7_7 = 1;
                        var8_17 = 1;
                    } else {
                        var9_9 = 0;
                        var8_17 = var7_7;
                        var7_7 = var9_9;
                    }
                    var9_9 = var1_1;
                    if (var14_21 <= 0) break block49;
                    var9_9 = var1_1;
                    if (var24_18 == 0L) break block49;
                    if (var14_21 < var8_17 - 1 || var7_7 != 0) break block50;
                    var9_9 = var1_1;
                    if (var12_19 <= 1) break block49;
                }
                var4_32 = var5_31 = (float)Long.bitCount(var24_18);
                if (var7_7 == 0) {
                    var7_7 = var23_15 - 1;
                    var3_33 = var5_31;
                    if ((var24_18 & 1L) != 0L) {
                        var3_33 = var5_31;
                        if (!((hb)this.getChildAt((int)0).getLayoutParams()).e) {
                            var3_33 = var5_31 - 0.5f;
                        }
                    }
                    var4_32 = var3_33;
                    if ((var24_18 & (long)(1 << var7_7)) != 0L) {
                        var4_32 = var3_33;
                        if (!((hb)this.getChildAt((int)var7_7).getLayoutParams()).e) {
                            var4_32 = var3_33 - 0.5f;
                        }
                    }
                }
                var8_17 = var4_32 > 0.0f ? (int)((float)(var14_21 * var22_14) / var4_32) : 0;
                var9_9 = 0;
                var7_7 = var1_1;
                var1_1 = var9_9;
                while (true) {
                    block51: {
                        block52: {
                            var9_9 = var7_7;
                            if (var1_1 >= var23_15) break;
                            if ((var24_18 & (long)(1 << var1_1)) == 0L) break block51;
                            var35_25 /* !! */  = this.getChildAt(var1_1);
                            var34_6 /* !! */  = (hb)var35_25 /* !! */ .getLayoutParams();
                            if (!(var35_25 /* !! */  instanceof ActionMenuItemView)) break block52;
                            var34_6 /* !! */ .c = var8_17;
                            var34_6 /* !! */ .f = true;
                            if (var1_1 == 0) {
                                if (!var34_6 /* !! */ .e) {
                                    var34_6 /* !! */ .leftMargin = -var8_17 / 2;
                                }
                                var1_1 = 0;
                            }
                            ** GOTO lbl223
                        }
                        if (var34_6 /* !! */ .a) {
                            var7_7 = -var8_17;
                            var34_6 /* !! */ .c = var8_17;
                            var34_6 /* !! */ .f = true;
                            var34_6 /* !! */ .rightMargin = var7_7 / 2;
lbl223:
                            // 2 sources

                            var7_7 = 1;
                        } else {
                            if (var1_1 != 0) {
                                var34_6 /* !! */ .leftMargin = var8_17 / 2;
                            }
                            if (var1_1 != var23_15 - 1) {
                                var34_6 /* !! */ .rightMargin = var8_17 / 2;
                            }
                        }
                    }
                    ++var1_1;
                }
            }
            if (var9_9 != 0) {
                for (var1_1 = 0; var1_1 < var23_15; ++var1_1) {
                    var35_25 /* !! */  = this.getChildAt(var1_1);
                    var34_6 /* !! */  = (hb)var35_25 /* !! */ .getLayoutParams();
                    if (!var34_6 /* !! */ .f) continue;
                    var35_25 /* !! */ .measure(View.MeasureSpec.makeMeasureSpec((int)(var34_6 /* !! */ .b * var22_14 + var34_6 /* !! */ .c), (int)0x40000000), var21_11);
                }
            }
            var1_1 = var20_8 == 0x40000000 ? var6_5 : var2_2;
            this.setMeasuredDimension(var11_12, var1_1);
            return;
        }
        for (var6_5 = 0; var6_5 < var7_7; ++var6_5) {
            var34_6 /* !! */  = (hb)this.getChildAt(var6_5).getLayoutParams();
            var34_6 /* !! */ .rightMargin = 0;
            var34_6 /* !! */ .leftMargin = 0;
        }
        super.onMeasure(var1_1, var2_2);
    }
}

