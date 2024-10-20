/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.Gravity
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.WindowInsets
 */
package androidx.wear.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

public class BoxInsetLayout
extends ViewGroup {
    private final int a;
    private final int b;
    private boolean c;
    private Rect d;
    private Rect e;
    private Drawable f;

    public BoxInsetLayout(Context context) {
        this(context, null);
    }

    public BoxInsetLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BoxInsetLayout(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        if (this.d == null) {
            this.d = new Rect();
        }
        if (this.e == null) {
            this.e = new Rect();
        }
        this.a = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.b = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    private final int a(bac bac2, int n2, int n3) {
        if (this.c && (bac2.a & 8) != 0 && (bac2.height == -1 || n2 == 80)) {
            return bac2.bottomMargin + n3;
        }
        return bac2.bottomMargin;
    }

    private final int b(bac bac2, int n2, int n3) {
        if (this.c && (bac2.a & 1) != 0 && (bac2.width == -1 || n2 == 3)) {
            return bac2.leftMargin + n3;
        }
        return bac2.leftMargin;
    }

    private final int c(bac bac2, int n2, int n3) {
        if (this.c && (bac2.a & 4) != 0 && (bac2.width == -1 || n2 == 5)) {
            return bac2.rightMargin + n3;
        }
        return bac2.rightMargin;
    }

    private final int d(bac bac2, int n2, int n3) {
        if (this.c && (bac2.a & 2) != 0 && (bac2.height == -1 || n2 == 48)) {
            return bac2.topMargin + n3;
        }
        return bac2.topMargin;
    }

    private final int e(int n2, int n3) {
        int n4 = this.a;
        return (int)((float)Math.max(Math.min(n2, this.b), Math.min(n3, n4)) * 0.146447f);
    }

    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof bac;
    }

    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new bac(layoutParams);
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c = this.getResources().getConfiguration().isScreenRound();
        WindowInsets windowInsets = this.getRootWindowInsets();
        this.e.set(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
    }

    /*
     * Enabled aggressive block sorting
     */
    protected final void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        int n6 = this.getChildCount();
        int n7 = this.getPaddingLeft() + this.d.left;
        int n8 = n4 - n2 - this.getPaddingRight() - this.d.right;
        int n9 = this.getPaddingTop() + this.d.top;
        int n10 = n5 - n3 - this.getPaddingBottom() - this.d.bottom;
        n3 = 0;
        n2 = n6;
        while (true) {
            block3: {
                int n11;
                View view;
                block12: {
                    int n12;
                    block13: {
                        int n13;
                        block10: {
                            block11: {
                                block9: {
                                    bac bac2;
                                    block7: {
                                        block8: {
                                            int n14;
                                            block5: {
                                                block6: {
                                                    block4: {
                                                        if (n3 >= n2) {
                                                            return;
                                                        }
                                                        view = this.getChildAt(n3);
                                                        if (view.getVisibility() == 8) break block3;
                                                        bac2 = (bac)view.getLayoutParams();
                                                        n11 = view.getMeasuredWidth();
                                                        n6 = view.getMeasuredHeight();
                                                        n4 = n5 = bac2.gravity;
                                                        if (n5 == -1) {
                                                            n4 = 0x800033;
                                                        }
                                                        n5 = Gravity.getAbsoluteGravity((int)n4, (int)this.getLayoutDirection());
                                                        n12 = this.getMeasuredWidth();
                                                        n14 = this.getMeasuredHeight();
                                                        n13 = n4 & 7;
                                                        n12 = this.e(n12, n14);
                                                        n14 = this.b(bac2, n13, n12);
                                                        n13 = this.c(bac2, n13, n12);
                                                        if (bac2.width == -1) break block4;
                                                        if ((n5 &= 7) == 1) break block5;
                                                        if (n5 == 5) break block6;
                                                    }
                                                    n5 = n14 + n7;
                                                    break block7;
                                                }
                                                n5 = n8 - n11;
                                                break block8;
                                            }
                                            n5 = (n8 - n7 - n11) / 2 + n7 + n14;
                                        }
                                        n5 -= n13;
                                    }
                                    n13 = this.d(bac2, n4 &= 0x70, n12);
                                    n12 = this.a(bac2, n4, n12);
                                    if (bac2.height == -1) break block9;
                                    if (n4 == 16) break block10;
                                    if (n4 == 80) break block11;
                                }
                                n4 = n13 + n9;
                                break block12;
                            }
                            n4 = n10 - n6;
                            break block13;
                        }
                        n4 = (n10 - n9 - n6) / 2 + n9 + n13;
                    }
                    n4 -= n12;
                }
                view.layout(n5, n4, n11 + n5, n6 + n4);
            }
            ++n3;
        }
    }

    protected final void onMeasure(int n2, int n3) {
        int n4;
        int n5;
        bac bac2;
        int n6;
        int n7;
        View view;
        int n8;
        int n9;
        int n10;
        int n11 = this.getChildCount();
        int n12 = 0;
        int n13 = n10 = (n9 = 0);
        int n14 = n10;
        for (n8 = 0; n8 < n11; ++n8) {
            block4: {
                block8: {
                    block7: {
                        block5: {
                            block6: {
                                view = this.getChildAt(n8);
                                n7 = n9;
                                n6 = n14;
                                n10 = n13;
                                if (view.getVisibility() == 8) break block4;
                                bac2 = (bac)view.getLayoutParams();
                                if (!this.c) break block5;
                                n10 = (bac2.a & 1) == 0 ? bac2.leftMargin : 0;
                                n6 = (bac2.a & 4) == 0 ? bac2.rightMargin : 0;
                                n7 = (bac2.a & 2) == 0 ? bac2.topMargin : 0;
                                if ((8 & bac2.a) != 0) break block6;
                                n5 = bac2.bottomMargin;
                                break block7;
                            }
                            n4 = n10;
                            n10 = n7;
                            n5 = 0;
                            break block8;
                        }
                        n10 = bac2.leftMargin;
                        n7 = bac2.topMargin;
                        n6 = bac2.rightMargin;
                        n5 = bac2.bottomMargin;
                    }
                    n4 = n10;
                    n10 = n7;
                }
                this.measureChildWithMargins(view, n2, 0, n3, 0);
                n7 = Math.max(n9, view.getMeasuredWidth() + n4 + n6);
                n6 = Math.max(n14, view.getMeasuredHeight() + n10 + n5);
                n10 = BoxInsetLayout.combineMeasuredStates((int)n13, (int)view.getMeasuredState());
            }
            n9 = n7;
            n14 = n6;
            n13 = n10;
        }
        n6 = this.getPaddingLeft();
        n8 = this.d.left;
        n5 = this.getPaddingRight();
        n10 = this.d.right;
        n7 = Math.max(n14 + (this.getPaddingTop() + this.d.top + this.getPaddingBottom() + this.d.bottom), this.getSuggestedMinimumHeight());
        n5 = Math.max(n9 + (n6 + n8 + n5 + n10), this.getSuggestedMinimumWidth());
        view = this.f;
        n10 = n7;
        n6 = n5;
        if (view != null) {
            n10 = Math.max(n7, view.getMinimumHeight());
            n6 = Math.max(n5, this.f.getMinimumWidth());
        }
        n6 = BoxInsetLayout.resolveSizeAndState((int)n6, (int)n2, (int)n13);
        n10 = BoxInsetLayout.resolveSizeAndState((int)n10, (int)n3, (int)(n13 << 16));
        this.setMeasuredDimension(n6, n10);
        n5 = this.e(n6, n10);
        for (n10 = n12; n10 < n11; ++n10) {
            view = this.getChildAt(n10);
            bac2 = (bac)view.getLayoutParams();
            n6 = n7 = bac2.gravity;
            if (n7 == -1) {
                n6 = 0x800033;
            }
            n4 = this.getPaddingLeft();
            int n15 = this.d.left;
            n9 = this.getPaddingRight();
            n12 = this.d.right;
            n7 = this.getPaddingTop();
            n8 = this.d.top;
            n14 = this.getPaddingBottom();
            n13 = this.d.bottom;
            int n16 = n6 & 7;
            n9 = n4 + n15 + (n9 + n12) + this.b(bac2, n16, n5) + this.c(bac2, n16, n5);
            n14 = n7 + n8 + (n14 + n13) + this.d(bac2, n6 &= 0x70, n5) + this.a(bac2, n6, n5);
            n8 = BoxInsetLayout.getChildMeasureSpec((int)n2, (int)n9, (int)bac2.width);
            n6 = BoxInsetLayout.getChildMeasureSpec((int)n3, (int)n14, (int)bac2.height);
            n13 = this.getMeasuredWidth();
            n7 = this.getMeasuredHeight();
            if (view.getMeasuredWidth() <= n13 - n9 && view.getMeasuredHeight() <= n7 - n14) continue;
            view.measure(n8, n6);
        }
    }

    public final void setForeground(Drawable drawable) {
        super.setForeground(drawable);
        this.f = drawable;
        if (this.d == null) {
            this.d = new Rect();
        }
        if (this.f != null) {
            drawable.getPadding(this.d);
        }
    }
}

