/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.Gravity
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 */
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.wear.ambient.AmbientDelegate;

public class jp
extends ViewGroup {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    public int f;
    public Drawable g;
    public int h;
    private float i;
    private boolean j;
    private int[] k;
    private int[] l;
    private int m;
    private int n;
    private int o;

    public jp(Context context) {
        this(context, null);
    }

    public jp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public jp(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        int n3;
        boolean bl2 = true;
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.f = 0x800033;
        AmbientDelegate ambientDelegate = AmbientDelegate.A(context, attributeSet, er.n, n2, 0);
        wj.l((View)this, context, er.n, attributeSet, (TypedArray)ambientDelegate.b, n2, 0);
        n2 = ambientDelegate.m(1, -1);
        if (n2 >= 0) {
            this.q(n2);
        }
        if ((n3 = ambientDelegate.m(0, -1)) >= 0 && this.f != n3) {
            n2 = n3;
            if ((0x800007 & n3) == 0) {
                n2 = n3 | 0x800003;
            }
            n3 = n2;
            if ((n2 & 0x70) == 0) {
                n3 = n2 | 0x30;
            }
            this.f = n3;
            this.requestLayout();
        }
        if (!ambientDelegate.w(2, true)) {
            this.s();
        }
        this.i = ((TypedArray)ambientDelegate.b).getFloat(4, -1.0f);
        this.b = ambientDelegate.m(3, -1);
        this.j = ambientDelegate.w(7, false);
        context = ambientDelegate.r(5);
        if (context != this.g) {
            this.g = context;
            if (context != null) {
                this.h = context.getIntrinsicWidth();
                this.m = context.getIntrinsicHeight();
            } else {
                this.h = 0;
                this.m = 0;
            }
            if (context != null) {
                bl2 = false;
            }
            this.setWillNotDraw(bl2);
            this.requestLayout();
        }
        this.n = ambientDelegate.m(8, 0);
        this.o = ambientDelegate.l(6, 0);
        ambientDelegate.v();
    }

    private static void a(View view, int n2, int n3, int n4, int n5) {
        view.layout(n2, n3, n4 + n2, n5 + n3);
    }

    public jo bl(AttributeSet attributeSet) {
        return new jo(this.getContext(), attributeSet);
    }

    protected jo bm(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof jo) {
            return new jo((ViewGroup.MarginLayoutParams)((jo)layoutParams));
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new jo((ViewGroup.MarginLayoutParams)layoutParams);
        }
        return new jo(layoutParams);
    }

    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof jo;
    }

    protected jo d() {
        int n2 = this.d;
        if (n2 == 0) {
            return new jo(-2);
        }
        if (n2 == 1) {
            return new jo(-1);
        }
        return null;
    }

    public final int getBaseline() {
        int n2;
        if (this.b < 0) {
            return super.getBaseline();
        }
        int n3 = this.getChildCount();
        if (n3 > (n2 = this.b)) {
            View view = this.getChildAt(n2);
            int n4 = view.getBaseline();
            if (n4 == -1) {
                if (this.b == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            n3 = n2 = this.c;
            if (this.d == 1) {
                int n5 = this.f & 0x70;
                n3 = n2;
                if (n5 != 48) {
                    n3 = n5 != 16 ? (n5 != 80 ? n2 : this.getBottom() - this.getTop() - this.getPaddingBottom() - this.e) : n2 + (this.getBottom() - this.getTop() - this.getPaddingTop() - this.getPaddingBottom() - this.e) / 2;
                }
            }
            return n3 + ((jo)view.getLayoutParams()).topMargin + n4;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    final void o(Canvas canvas, int n2) {
        this.g.setBounds(this.getPaddingLeft() + this.o, n2, this.getWidth() - this.getPaddingRight() - this.o, this.m + n2);
        this.g.draw(canvas);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected final void onDraw(Canvas var1_1) {
        block7: {
            block11: {
                block9: {
                    block10: {
                        block8: {
                            if (this.g == null) break block7;
                            var4_2 = this.d;
                            var3_4 = 0;
                            if (var4_2 != 1) break block8;
                            var4_2 = this.getChildCount();
                            for (var2_3 = var3_4; var2_3 < var4_2; ++var2_3) {
                                var7_7 /* !! */  = this.getChildAt(var2_3);
                                if (var7_7 /* !! */  == null || var7_7 /* !! */ .getVisibility() == 8 || !this.r(var2_3)) continue;
                                var6_5 /* !! */  = (jo)var7_7 /* !! */ .getLayoutParams();
                                this.o(var1_1, var7_7 /* !! */ .getTop() - var6_5 /* !! */ .topMargin - this.m);
                            }
                            if (this.r(var4_2)) {
                                var6_5 /* !! */  = this.getChildAt(var4_2 - 1);
                                if (var6_5 /* !! */  == null) {
                                    var2_3 = this.getHeight() - this.getPaddingBottom() - this.m;
                                } else {
                                    var7_7 /* !! */  = (jo)var6_5 /* !! */ .getLayoutParams();
                                    var2_3 = var6_5 /* !! */ .getBottom() + var7_7 /* !! */ .bottomMargin;
                                }
                                this.o(var1_1, var2_3);
                                return;
                            }
                            break block7;
                        }
                        var4_2 = this.getChildCount();
                        var5_9 = mi.a((View)this);
                        for (var2_3 = 0; var2_3 < var4_2; ++var2_3) {
                            var6_6 = this.getChildAt(var2_3);
                            if (var6_6 == null || var6_6.getVisibility() == 8 || !this.r(var2_3)) continue;
                            var7_8 = (jo)var6_6.getLayoutParams();
                            var3_4 = var5_9 != false ? var6_6.getRight() + var7_8.rightMargin : var6_6.getLeft() - var7_8.leftMargin - this.h;
                            this.p(var1_1, var3_4);
                        }
                        if (!this.r(var4_2)) break block7;
                        var6_6 = this.getChildAt(var4_2 - 1);
                        if (var6_6 != null) break block9;
                        if (!var5_9) break block10;
                        var2_3 = this.getPaddingLeft();
                        break block11;
                    }
                    var2_3 = this.getWidth() - this.getPaddingRight();
                    var3_4 = this.h;
                    ** GOTO lbl47
                }
                var7_8 = (jo)var6_6.getLayoutParams();
                if (var5_9) {
                    var2_3 = var6_6.getLeft() - var7_8.leftMargin;
                    var3_4 = this.h;
lbl47:
                    // 2 sources

                    var2_3 -= var3_4;
                } else {
                    var2_3 = var6_6.getRight() + var7_8.rightMargin;
                }
            }
            this.p(var1_1, var2_3);
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)"android.support.v7.widget.LinearLayoutCompat");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)"android.support.v7.widget.LinearLayoutCompat");
    }

    protected void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        block26: {
            block20: {
                if (this.d != 1) break block20;
                int n6 = n4 - n2;
                int n7 = this.getPaddingLeft();
                int n8 = this.getPaddingRight();
                int n9 = this.getPaddingRight();
                int n10 = this.getChildCount();
                int n11 = this.f;
                n2 = n11 & 0x70;
                if (n2 != 16) {
                    n2 = n2 != 80 ? this.getPaddingTop() : this.getPaddingTop() + n5 - n3 - this.e;
                } else {
                    n2 = this.getPaddingTop();
                    n2 = (n5 - n3 - this.e) / 2 + n2;
                }
                for (n3 = 0; n3 < n10; ++n3) {
                    block21: {
                        jo jo2;
                        int n12;
                        int n13;
                        View view;
                        block24: {
                            block25: {
                                block22: {
                                    block23: {
                                        view = this.getChildAt(n3);
                                        n4 = n2;
                                        if (view == null) break block21;
                                        n4 = n2;
                                        if (view.getVisibility() == 8) break block21;
                                        n13 = view.getMeasuredWidth();
                                        n12 = view.getMeasuredHeight();
                                        jo2 = (jo)view.getLayoutParams();
                                        n4 = n5 = jo2.gravity;
                                        if (n5 < 0) {
                                            n4 = 0x800007 & n11;
                                        }
                                        if ((n4 = Gravity.getAbsoluteGravity((int)n4, (int)this.getLayoutDirection()) & 7) == 1) break block22;
                                        if (n4 == 5) break block23;
                                        n4 = jo2.leftMargin + n7;
                                        break block24;
                                    }
                                    n5 = n6 - n8 - n13;
                                    n4 = jo2.rightMargin;
                                    break block25;
                                }
                                n5 = (n6 - n7 - n9 - n13) / 2 + n7 + jo2.leftMargin;
                                n4 = jo2.rightMargin;
                            }
                            n4 = n5 - n4;
                        }
                        n5 = n2;
                        if (this.r(n3)) {
                            n5 = n2 + this.m;
                        }
                        n2 = n5 + jo2.topMargin;
                        jp.a(view, n4, n2, n13, n12);
                        n4 = n2 + (n12 + jo2.bottomMargin);
                    }
                    n2 = n4;
                }
                break block26;
            }
            int n14 = n5 - n3;
            boolean bl3 = mi.a((View)this);
            int n15 = this.getPaddingTop();
            int n16 = this.getPaddingBottom();
            int n17 = this.getPaddingBottom();
            int n18 = this.getChildCount();
            n5 = this.f;
            n3 = n5 & 0x70;
            bl2 = this.a;
            int[] nArray = this.k;
            int[] nArray2 = this.l;
            if ((n5 = Gravity.getAbsoluteGravity((int)(0x800007 & n5), (int)this.getLayoutDirection())) != 1) {
                n2 = n5 != 5 ? this.getPaddingLeft() : this.getPaddingLeft() + n4 - n2 - this.e;
            } else {
                n5 = this.getPaddingLeft();
                n2 = (n4 - n2 - this.e) / 2 + n5;
            }
            if (bl3) {
                n5 = n18 - 1;
                n4 = -1;
            } else {
                n4 = 1;
                n5 = 0;
            }
            int n19 = n4;
            n4 = n2;
            for (int i2 = 0; i2 < n18; ++i2) {
                int n20;
                int n21 = n5 + n19 * i2;
                View view = this.getChildAt(n21);
                if (view == null || view.getVisibility() == 8) continue;
                int n22 = view.getMeasuredWidth();
                int n23 = view.getMeasuredHeight();
                jo jo3 = (jo)view.getLayoutParams();
                int n24 = bl2 && jo3.height != -1 ? view.getBaseline() : -1;
                n2 = n20 = jo3.gravity;
                if (n20 < 0) {
                    n2 = n3;
                }
                if ((n2 &= 0x70) != 16) {
                    if (n2 != 48) {
                        if (n2 != 80) {
                            n2 = n15;
                        } else {
                            n2 = n20 = n14 - n16 - n23 - jo3.bottomMargin;
                            if (n24 != -1) {
                                n2 = view.getMeasuredHeight();
                                n2 = n20 - (nArray2[2] - (n2 - n24));
                            }
                        }
                    } else {
                        n2 = n20 = jo3.topMargin + n15;
                        if (n24 != -1) {
                            n2 = n20 + (nArray[1] - n24);
                        }
                    }
                } else {
                    n2 = (n14 - n15 - n17 - n23) / 2 + n15 + jo3.topMargin - jo3.bottomMargin;
                }
                n24 = n4;
                if (this.r(n21)) {
                    n24 = n4 + this.h;
                }
                n4 = n24 + jo3.leftMargin;
                jp.a(view, n4, n2, n22, n23);
                n4 += n22 + jo3.rightMargin;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void onMeasure(int var1_1, int var2_2) {
        block83: {
            block91: {
                block90: {
                    block81: {
                        block89: {
                            block82: {
                                block80: {
                                    var7_3 = this.d;
                                    var15_4 = 1;
                                    if (var7_3 != 1) break block82;
                                    this.e = 0;
                                    var19_5 = this.getChildCount();
                                    var7_3 = View.MeasureSpec.getMode((int)var1_1);
                                    var11_7 = View.MeasureSpec.getMode((int)var2_2);
                                    var21_9 = this.b;
                                    var25_11 = this.j;
                                    var9_13 = 1;
                                    var16_29 = var13_27 = (var14_25 = (var12_23 = (var17_21 = (var10_19 = (var8_17 = 0)))));
                                    var3_31 = 0.0f;
                                    for (var20_15 = 0; var20_15 < var19_5; ++var20_15) {
                                        var28_40 /* !! */  = this.getChildAt(var20_15);
                                        if (var28_40 /* !! */  == null) ** GOTO lbl75
                                        if (var28_40 /* !! */ .getVisibility() != 8) {
                                            if (this.r(var20_15)) {
                                                this.e += this.m;
                                            }
                                            var29_42 = (jo)var28_40 /* !! */ .getLayoutParams();
                                            var3_31 += var29_42.weight;
                                            if (var11_7 == 0x40000000 && var29_42.height == 0 && var29_42.weight > 0.0f) {
                                                var15_4 = this.e;
                                                this.e = Math.max(var15_4, var29_42.topMargin + var15_4 + var29_42.bottomMargin);
                                                var18_33 = 1;
                                                var15_4 = var12_23;
                                            } else {
                                                if (var29_42.height == 0 && var29_42.weight > 0.0f) {
                                                    var29_42.height = -2;
                                                    var15_4 = 0;
                                                } else {
                                                    var15_4 = -2147483648;
                                                }
                                                var18_33 = var3_31 == 0.0f ? this.e : 0;
                                                this.measureChildWithMargins(var28_40 /* !! */ , var1_1, 0, var2_2, var18_33);
                                                if (var15_4 != -2147483648) {
                                                    var29_42.height = 0;
                                                }
                                                var22_35 = var28_40 /* !! */ .getMeasuredHeight();
                                                var15_4 = this.e;
                                                this.e = Math.max(var15_4, var15_4 + var22_35 + var29_42.topMargin + var29_42.bottomMargin);
                                                var18_33 = var17_21;
                                                var15_4 = var12_23;
                                                if (var25_11) {
                                                    var15_4 = Math.max(var22_35, var12_23);
                                                    var18_33 = var17_21;
                                                }
                                            }
                                            if (var21_9 >= 0 && var21_9 == var20_15 + 1) {
                                                this.c = this.e;
                                            }
                                            if (var20_15 < var21_9 && var29_42.weight > 0.0f) {
                                                throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                                            }
                                            var12_23 = var7_3;
                                            if (var12_23 != 0x40000000 && var29_42.width == -1) {
                                                var12_23 = 1;
                                                var16_29 = 1;
                                            } else {
                                                var12_23 = 0;
                                            }
                                            var24_39 = var29_42.leftMargin + var29_42.rightMargin;
                                            var22_35 = var28_40 /* !! */ .getMeasuredWidth() + var24_39;
                                            var14_25 = Math.max(var14_25, var22_35);
                                            var17_21 = View.combineMeasuredStates((int)var13_27, (int)var28_40 /* !! */ .getMeasuredState());
                                            var9_13 = var9_13 != 0 && var29_42.width == -1 ? 1 : 0;
                                            var23_37 = 1;
                                            var13_27 = var24_39;
                                            if (1 != var12_23) {
                                                var13_27 = var22_35;
                                            }
                                            if (var29_42.weight > 0.0f) {
                                                var10_19 = Math.max(var10_19, var13_27);
                                            } else {
                                                var8_17 = Math.max(var8_17, var13_27);
                                            }
                                            var13_27 = var17_21;
                                            var22_35 = var9_13;
                                            var9_13 = var23_37;
                                            var17_21 = var18_33;
                                            var12_23 = var15_4;
                                            var18_33 = var22_35;
                                        } else {
                                            var15_4 = 1;
lbl75:
                                            // 2 sources

                                            var18_33 = var7_3;
                                            var18_33 = var9_13;
                                            var9_13 = var15_4;
                                        }
                                        var15_4 = var9_13;
                                        var9_13 = var18_33;
                                    }
                                    var20_15 = var8_17;
                                    var8_17 = var13_27;
                                    if (this.e > 0 && this.r(var19_5)) {
                                        this.e += this.m;
                                    }
                                    if (var25_11) {
                                        var11_7 = var18_33 = var11_7;
                                        if (var18_33 != -2147483648) {
                                            var13_27 = var18_33;
                                            if (var18_33 == 0) {
                                                var11_7 = 0;
                                            } else {
                                                while (true) {
                                                    var11_7 = var13_27;
                                                    var13_27 = var15_4;
                                                    break block80;
                                                    break;
                                                }
                                            }
                                        }
                                        this.e = 0;
                                        var18_33 = 0;
                                        while (true) {
                                            var13_27 = var11_7;
                                            if (var18_33 >= var19_5) ** continue;
                                            var28_40 /* !! */  = this.getChildAt(var18_33);
                                            if (var28_40 /* !! */  != null && var28_40 /* !! */ .getVisibility() != 8) {
                                                var28_40 /* !! */  = (jo)var28_40 /* !! */ .getLayoutParams();
                                                var13_27 = this.e;
                                                this.e = Math.max(var13_27, var13_27 + var12_23 + var28_40 /* !! */ .topMargin + var28_40 /* !! */ .bottomMargin);
                                            }
                                            ++var18_33;
                                        }
                                    }
                                    var13_27 = 0;
                                }
                                this.e = var15_4 = this.e + (this.getPaddingTop() + this.getPaddingBottom());
                                var21_9 = View.resolveSizeAndState((int)Math.max(var15_4, this.getSuggestedMinimumHeight()), (int)var2_2, (int)0);
                                var15_4 = (0xFFFFFF & var21_9) - this.e;
                                if (!(var17_21 != 0 || var15_4 != 0 && var3_31 > 0.0f)) {
                                    var15_4 = Math.max(var20_15, var10_19);
                                    if (var13_27 != 0 && var11_7 != 0x40000000) {
                                        for (var10_19 = 0; var10_19 < var19_5; ++var10_19) {
                                            var28_40 /* !! */  = this.getChildAt(var10_19);
                                            if (var28_40 /* !! */  == null || var28_40 /* !! */ .getVisibility() == 8 || !(((jo)var28_40 /* !! */ .getLayoutParams()).weight > 0.0f)) continue;
                                            var28_40 /* !! */ .measure(View.MeasureSpec.makeMeasureSpec((int)var28_40 /* !! */ .getMeasuredWidth(), (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)var12_23, (int)0x40000000));
                                        }
                                    }
                                    var11_7 = var14_25;
                                    var10_19 = var15_4;
                                } else {
                                    var4_44 = this.i;
                                    if (var4_44 > 0.0f) {
                                        var3_31 = var4_44;
                                    }
                                    this.e = 0;
                                    var10_19 = 0;
                                    var12_23 = var15_4;
                                    var15_4 = var10_19;
                                    var10_19 = var20_15;
                                    var17_21 = var11_7;
                                    while (var15_4 < var19_5) {
                                        var28_40 /* !! */  = this.getChildAt(var15_4);
                                        if (var28_40 /* !! */ .getVisibility() != 8) {
                                            var29_42 = (jo)var28_40 /* !! */ .getLayoutParams();
                                            var5_46 = var29_42.weight;
                                            var13_27 = var12_23;
                                            var11_7 = var8_17;
                                            var4_44 = var3_31;
                                            if (var5_46 > 0.0f) {
                                                var6_47 = (float)var12_23 * var5_46 / var3_31;
                                                var4_44 = var3_31 - var5_46;
                                                var13_27 = (int)var6_47;
                                                var20_15 = jp.getChildMeasureSpec((int)var1_1, (int)(this.getPaddingLeft() + this.getPaddingRight() + var29_42.leftMargin + var29_42.rightMargin), (int)var29_42.width);
                                                if (var29_42.height == 0 && var17_21 == 0x40000000) {
                                                    var11_7 = var13_27 > 0 ? var13_27 : 0;
                                                    var28_40 /* !! */ .measure(var20_15, View.MeasureSpec.makeMeasureSpec((int)var11_7, (int)0x40000000));
                                                } else {
                                                    var11_7 = var18_33 = var28_40 /* !! */ .getMeasuredHeight() + var13_27;
                                                    if (var18_33 < 0) {
                                                        var11_7 = 0;
                                                    }
                                                    var28_40 /* !! */ .measure(var20_15, View.MeasureSpec.makeMeasureSpec((int)var11_7, (int)0x40000000));
                                                }
                                                var11_7 = View.combineMeasuredStates((int)var8_17, (int)(var28_40 /* !! */ .getMeasuredState() & -256));
                                                var13_27 = var12_23 - var13_27;
                                            }
                                            var12_23 = var29_42.leftMargin + var29_42.rightMargin;
                                            var8_17 = var28_40 /* !! */ .getMeasuredWidth() + var12_23;
                                            var14_25 = Math.max(var14_25, var8_17);
                                            if (var7_3 != 0x40000000 && var29_42.width == -1) {
                                                var8_17 = var12_23;
                                            }
                                            var10_19 = Math.max(var10_19, var8_17);
                                            var8_17 = var9_13 != 0 && var29_42.width == -1 ? 1 : 0;
                                            var9_13 = this.e;
                                            this.e = Math.max(var9_13, var28_40 /* !! */ .getMeasuredHeight() + var9_13 + var29_42.topMargin + var29_42.bottomMargin);
                                            var9_13 = var8_17;
                                            var12_23 = var13_27;
                                            var8_17 = var11_7;
                                            var3_31 = var4_44;
                                        }
                                        ++var15_4;
                                    }
                                    this.e += this.getPaddingTop() + this.getPaddingBottom();
                                    var11_7 = var14_25;
                                }
                                if (var9_13 != 0 || var7_3 == 0x40000000) {
                                    var10_19 = var11_7;
                                }
                                this.setMeasuredDimension(View.resolveSizeAndState((int)Math.max(var10_19 + (this.getPaddingLeft() + this.getPaddingRight()), this.getSuggestedMinimumWidth()), (int)var1_1, (int)var8_17), var21_9);
                                if (var16_29 == 0) break block83;
                                var7_3 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredWidth(), (int)0x40000000);
                                for (var1_1 = 0; var1_1 < var19_5; ++var1_1) {
                                    var29_42 = this.getChildAt(var1_1);
                                    if (var29_42.getVisibility() == 8) continue;
                                    var28_40 /* !! */  = (jo)var29_42.getLayoutParams();
                                    if (var28_40 /* !! */ .width != -1) continue;
                                    var8_17 = var28_40 /* !! */ .height;
                                    var28_40 /* !! */ .height = var29_42.getMeasuredHeight();
                                    this.measureChildWithMargins((View)var29_42, var7_3, 0, var2_2, 0);
                                    var28_40 /* !! */ .height = var8_17;
                                }
                                break block83;
                            }
                            this.e = 0;
                            var18_34 = this.getChildCount();
                            var8_18 = View.MeasureSpec.getMode((int)var1_1);
                            var21_10 = View.MeasureSpec.getMode((int)var2_2);
                            if (this.k == null || this.l == null) {
                                this.k = new int[4];
                                this.l = new int[4];
                            }
                            var28_41 /* !! */  = this.k;
                            var29_43 /* !! */  = this.l;
                            var28_41 /* !! */ [3] = -1;
                            var28_41 /* !! */ [2] = -1;
                            var28_41 /* !! */ [1] = -1;
                            var28_41 /* !! */ [0] = -1;
                            var29_43 /* !! */ [3] = -1;
                            var29_43 /* !! */ [2] = -1;
                            var29_43 /* !! */ [1] = -1;
                            var29_43 /* !! */ [0] = -1;
                            var25_12 = this.a;
                            var27_48 = this.j;
                            var9_14 = 0;
                            var3_32 = 0.0f;
                            var14_26 = 0;
                            var16_30 = 0;
                            var12_24 = 1;
                            var13_28 = 0;
                            var15_4 = 0;
                            var11_8 = 0;
                            var10_20 = 0;
                            for (var7_3 = 0; var7_3 < var18_34; ++var7_3) {
                                block84: {
                                    block87: {
                                        block88: {
                                            block85: {
                                                block86: {
                                                    var30_50 /* !! */  = this.getChildAt(var7_3);
                                                    if (var30_50 /* !! */  == null || var30_50 /* !! */ .getVisibility() == 8) break block84;
                                                    if (this.r(var7_3)) {
                                                        this.e += this.h;
                                                    }
                                                    var31_51 = (jo)var30_50 /* !! */ .getLayoutParams();
                                                    var3_32 += var31_51.weight;
                                                    if (var8_18 != 0x40000000) break block85;
                                                    if (var31_51.width != 0 || !(var31_51.weight > 0.0f)) break block86;
                                                    this.e += var31_51.leftMargin + var31_51.rightMargin;
                                                    if (var25_12) {
                                                        var17_22 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
                                                        var30_50 /* !! */ .measure(var17_22, var17_22);
                                                        var17_22 = var7_3;
                                                        var26_49 = true;
                                                    } else {
                                                        var13_28 = var7_3;
                                                        var26_49 = false;
                                                        var13_28 = 1;
                                                    }
                                                    break block87;
                                                }
                                                var17_22 = 0x40000000;
                                                break block88;
                                            }
                                            var17_22 = var8_18;
                                        }
                                        if (var31_51.width == 0 && var31_51.weight > 0.0f) {
                                            var31_51.width = -2;
                                            var19_6 = 0;
                                        } else {
                                            var19_6 = -2147483648;
                                        }
                                        var20_16 = var3_32 == 0.0f ? this.e : 0;
                                        var22_36 = var7_3;
                                        this.measureChildWithMargins(var30_50 /* !! */ , var1_1, var20_16, var2_2, 0);
                                        if (var19_6 != -2147483648) {
                                            var31_51.width = 0;
                                        }
                                        var19_6 = var30_50 /* !! */ .getMeasuredWidth();
                                        if (var17_22 == 0x40000000) {
                                            this.e += var31_51.leftMargin + var19_6 + var31_51.rightMargin;
                                        } else {
                                            var17_22 = this.e;
                                            this.e = Math.max(var17_22, var17_22 + var19_6 + var31_51.leftMargin + var31_51.rightMargin);
                                        }
                                        if (var27_48) {
                                            var11_8 = Math.max(var19_6, var11_8);
                                        }
                                        var26_49 = var25_12;
                                    }
                                    var17_22 = var7_3;
                                    if (var21_10 != 0x40000000 && var31_51.height == -1) {
                                        var17_22 = 1;
                                        var15_4 = 1;
                                    } else {
                                        var17_22 = 0;
                                    }
                                    var20_16 = var31_51.topMargin + var31_51.bottomMargin;
                                    var22_36 = var30_50 /* !! */ .getMeasuredHeight() + var20_16;
                                    var19_6 = View.combineMeasuredStates((int)var10_20, (int)var30_50 /* !! */ .getMeasuredState());
                                    if (var26_49 && (var23_38 = var30_50 /* !! */ .getBaseline()) != -1) {
                                        var10_20 = var31_51.gravity < 0 ? this.f : var31_51.gravity;
                                        var10_20 = (var10_20 & 112) >> 5;
                                        var28_41 /* !! */ [var10_20] = Math.max(var28_41 /* !! */ [var10_20], var23_38);
                                        var29_43 /* !! */ [var10_20] = Math.max(var29_43 /* !! */ [var10_20], var22_36 - var23_38);
                                    }
                                    var14_26 = Math.max(var14_26, var22_36);
                                    var10_20 = var12_24 != 0 && var31_51.height == -1 ? 1 : 0;
                                    var12_24 = 1 != var17_22 ? var22_36 : var20_16;
                                    if (var31_51.weight > 0.0f) {
                                        var16_30 = Math.max(var16_30, var12_24);
                                    } else {
                                        var9_14 = Math.max(var9_14, var12_24);
                                    }
                                    var17_22 = var19_6;
                                    var12_24 = var10_20;
                                    var10_20 = var17_22;
                                    continue;
                                }
                                var17_22 = var7_3;
                            }
                            if (this.e > 0 && this.r(var18_34)) {
                                this.e += this.h;
                            }
                            if ((var7_3 = var28_41 /* !! */ [1]) != -1) ** GOTO lbl299
                            if (var28_41 /* !! */ [0] == -1 && var28_41 /* !! */ [2] == -1 && var28_41 /* !! */ [3] == -1) {
                                var7_3 = var14_26;
                            } else {
                                var7_3 = -1;
lbl299:
                                // 2 sources

                                var7_3 = Math.max(var14_26, Math.max(var28_41 /* !! */ [3], Math.max(var28_41 /* !! */ [0], Math.max(var7_3, var28_41 /* !! */ [2]))) + Math.max(var29_43 /* !! */ [3], Math.max(var29_43 /* !! */ [0], Math.max(var29_43 /* !! */ [1], var29_43 /* !! */ [2]))));
                            }
                            var14_26 = var21_10;
                            if (!var27_48) break block89;
                            if (var8_18 == -2147483648) ** GOTO lbl312
                            if (var8_18 == 0) {
                                var8_18 = 0;
                                var17_22 = 0;
                            } else {
                                var17_22 = var8_18;
                                while (true) {
                                    var20_16 = 1;
                                    var19_6 = var8_18;
                                    break block81;
                                    break;
                                }
lbl312:
                                // 1 sources

                                var19_6 = var8_18;
                                var17_22 = var8_18;
                                var8_18 = var19_6;
                            }
                            this.e = 0;
                            var19_6 = 0;
                            while (true) {
                                if (var19_6 >= var18_34) ** continue;
                                var30_50 /* !! */  = this.getChildAt(var19_6);
                                if (var30_50 /* !! */  != null && var30_50 /* !! */ .getVisibility() != 8) {
                                    var30_50 /* !! */  = (jo)var30_50 /* !! */ .getLayoutParams();
                                    var20_16 = this.e;
                                    this.e = Math.max(var20_16, var20_16 + var11_8 + var30_50 /* !! */ .leftMargin + var30_50 /* !! */ .rightMargin);
                                }
                                ++var19_6;
                            }
                        }
                        var17_22 = var8_18;
                        var20_16 = 0;
                        var19_6 = var8_18;
                    }
                    this.e = var8_18 = this.e + (this.getPaddingLeft() + this.getPaddingRight());
                    var22_36 = View.resolveSizeAndState((int)Math.max(var8_18, this.getSuggestedMinimumWidth()), (int)var1_1, (int)0);
                    var8_18 = (0xFFFFFF & var22_36) - this.e;
                    if (var13_28 != 0 || var8_18 != 0 && var3_32 > 0.0f) break block90;
                    var9_14 = Math.max(var9_14, var16_30);
                    if (var20_16 != 0 && var19_6 != 0x40000000) {
                        for (var8_18 = 0; var8_18 < var18_34; ++var8_18) {
                            var28_41 /* !! */  = (int[])this.getChildAt(var8_18);
                            if (var28_41 /* !! */  == null || var28_41 /* !! */ .getVisibility() == 8 || !(((jo)var28_41 /* !! */ .getLayoutParams()).weight > 0.0f)) continue;
                            var28_41 /* !! */ .measure(View.MeasureSpec.makeMeasureSpec((int)var11_8, (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)var28_41 /* !! */ .getMeasuredHeight(), (int)0x40000000));
                        }
                    }
                    var11_8 = var18_34;
                    var8_18 = var10_20;
                    var10_20 = var14_26;
                    break block91;
                }
                var4_45 = this.i;
                if (var4_45 > 0.0f) {
                    var3_32 = var4_45;
                }
                var28_41 /* !! */ [3] = -1;
                var28_41 /* !! */ [2] = -1;
                var28_41 /* !! */ [1] = -1;
                var28_41 /* !! */ [0] = -1;
                var29_43 /* !! */ [3] = -1;
                var29_43 /* !! */ [2] = -1;
                var29_43 /* !! */ [1] = -1;
                var29_43 /* !! */ [0] = -1;
                this.e = 0;
                var7_3 = var10_20;
                var13_28 = -1;
                var10_20 = var14_26;
                var11_8 = var18_34;
                for (var16_30 = 0; var16_30 < var11_8; ++var16_30) {
                    var31_51 = this.getChildAt(var16_30);
                    if (var31_51 == null || var31_51.getVisibility() == 8) continue;
                    var30_50 /* !! */  = (jo)var31_51.getLayoutParams();
                    var4_45 = var30_50 /* !! */ .weight;
                    if (var4_45 > 0.0f) {
                        var18_34 = (int)((float)var8_18 * var4_45 / var3_32);
                        var21_10 = jp.getChildMeasureSpec((int)var2_2, (int)(this.getPaddingTop() + this.getPaddingBottom() + var30_50 /* !! */ .topMargin + var30_50 /* !! */ .bottomMargin), (int)var30_50 /* !! */ .height);
                        if (var30_50 /* !! */ .width == 0 && var19_6 == 0x40000000) {
                            var14_26 = var18_34 > 0 ? var18_34 : 0;
                            var31_51.measure(View.MeasureSpec.makeMeasureSpec((int)var14_26, (int)0x40000000), var21_10);
                        } else {
                            var14_26 = var20_16 = var31_51.getMeasuredWidth() + var18_34;
                            if (var20_16 < 0) {
                                var14_26 = 0;
                            }
                            var31_51.measure(View.MeasureSpec.makeMeasureSpec((int)var14_26, (int)0x40000000), var21_10);
                        }
                        var7_3 = View.combineMeasuredStates((int)var7_3, (int)(var31_51.getMeasuredState() & -16777216));
                        var3_32 -= var4_45;
                        var8_18 -= var18_34;
                    }
                    if (var17_22 == 0x40000000) {
                        this.e += var31_51.getMeasuredWidth() + var30_50 /* !! */ .leftMargin + var30_50 /* !! */ .rightMargin;
                    } else {
                        var14_26 = this.e;
                        this.e = Math.max(var14_26, var31_51.getMeasuredWidth() + var14_26 + var30_50 /* !! */ .leftMargin + var30_50 /* !! */ .rightMargin);
                    }
                    var14_26 = var10_20 != 0x40000000 && var30_50 /* !! */ .height == -1 ? 1 : 0;
                    var21_10 = var30_50 /* !! */ .topMargin + var30_50 /* !! */ .bottomMargin;
                    var20_16 = var31_51.getMeasuredHeight() + var21_10;
                    var18_34 = Math.max(var13_28, var20_16);
                    var13_28 = var21_10;
                    if (1 != var14_26) {
                        var13_28 = var20_16;
                    }
                    var14_26 = Math.max(var9_14, var13_28);
                    var9_14 = var12_24 != 0 && var30_50 /* !! */ .height == -1 ? 1 : 0;
                    if (var25_12 && (var13_28 = var31_51.getBaseline()) != -1) {
                        var12_24 = var30_50 /* !! */ .gravity < 0 ? this.f : var30_50 /* !! */ .gravity;
                        var12_24 = (var12_24 & 112) >> 5;
                        var28_41 /* !! */ [var12_24] = Math.max(var28_41 /* !! */ [var12_24], var13_28);
                        var29_43 /* !! */ [var12_24] = Math.max(var29_43 /* !! */ [var12_24], var20_16 - var13_28);
                    }
                    var12_24 = var9_14;
                    var13_28 = var18_34;
                    var9_14 = var14_26;
                }
                this.e += this.getPaddingLeft() + this.getPaddingRight();
                var8_18 = var28_41 /* !! */ [1];
                if (var8_18 != -1) ** GOTO lbl413
                if (var28_41 /* !! */ [0] == -1 && var28_41 /* !! */ [2] == -1 && var28_41 /* !! */ [3] == -1) {
                    var8_18 = var7_3;
                    var7_3 = var13_28;
                } else {
                    var8_18 = -1;
lbl413:
                    // 2 sources

                    var13_28 = Math.max(var13_28, Math.max(var28_41 /* !! */ [3], Math.max(var28_41 /* !! */ [0], Math.max(var8_18, var28_41 /* !! */ [2]))) + Math.max(var29_43 /* !! */ [3], Math.max(var29_43 /* !! */ [0], Math.max(var29_43 /* !! */ [1], var29_43 /* !! */ [2]))));
                    var8_18 = var7_3;
                    var7_3 = var13_28;
                }
            }
            var13_28 = 0;
            if (var12_24 == 0 && var10_20 != 0x40000000) {
                var7_3 = var9_14;
            }
            this.setMeasuredDimension(var8_18 & -16777216 | var22_36, View.resolveSizeAndState((int)Math.max(var7_3 + (this.getPaddingTop() + this.getPaddingBottom()), this.getSuggestedMinimumHeight()), (int)var2_2, (int)(var8_18 << 16)));
            if (var15_4 != 0) {
                var7_3 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredHeight(), (int)0x40000000);
                for (var2_2 = var13_28; var2_2 < var11_8; ++var2_2) {
                    var28_41 /* !! */  = (int[])this.getChildAt(var2_2);
                    if (var28_41 /* !! */ .getVisibility() == 8) continue;
                    var29_43 /* !! */  = (int[])((jo)var28_41 /* !! */ .getLayoutParams());
                    if (var29_43 /* !! */ .height != -1) continue;
                    var8_18 = var29_43 /* !! */ .width;
                    var29_43 /* !! */ .width = var28_41 /* !! */ .getMeasuredWidth();
                    this.measureChildWithMargins((View)var28_41 /* !! */ , var1_1, 0, var7_3, 0);
                    var29_43 /* !! */ .width = var8_18;
                }
            }
        }
    }

    final void p(Canvas canvas, int n2) {
        this.g.setBounds(n2, this.getPaddingTop() + this.o, this.h + n2, this.getHeight() - this.getPaddingBottom() - this.o);
        this.g.draw(canvas);
    }

    public final void q(int n2) {
        if (this.d != n2) {
            this.d = n2;
            this.requestLayout();
        }
    }

    protected final boolean r(int n2) {
        boolean bl2;
        block4: {
            boolean bl3 = false;
            if (n2 == 0) {
                return (this.n & 1) != 0;
            }
            if (n2 == this.getChildCount()) {
                return (this.n & 4) != 0;
            }
            bl2 = bl3;
            if ((this.n & 2) != 0) {
                int n3;
                do {
                    n3 = n2 - 1;
                    bl2 = bl3;
                    if (n3 < 0) break block4;
                    n2 = n3;
                } while (this.getChildAt(n3).getVisibility() == 8);
                bl2 = true;
            }
        }
        return bl2;
    }

    public final void s() {
        this.a = false;
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

