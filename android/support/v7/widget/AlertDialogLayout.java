/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.Gravity
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 */
package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;

public class AlertDialogLayout
extends jp {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static int a(View view) {
        int[] nArray = wj.a;
        int n2 = view.getMinimumHeight();
        if (n2 > 0) {
            return n2;
        }
        if (view instanceof ViewGroup && (view = (ViewGroup)view).getChildCount() == 1) {
            return AlertDialogLayout.a(view.getChildAt(0));
        }
        return 0;
    }

    @Override
    protected final void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        int n6 = n4 - n2;
        int n7 = this.getPaddingLeft();
        int n8 = this.getPaddingRight();
        int n9 = this.getPaddingRight();
        n2 = this.getMeasuredHeight();
        int n10 = this.getChildCount();
        int n11 = this.f;
        n4 = n11 & 0x70;
        n2 = n4 != 16 ? (n4 != 80 ? this.getPaddingTop() : this.getPaddingTop() + n5 - n3 - n2) : this.getPaddingTop() + (n5 - n3 - n2) / 2;
        Drawable drawable = this.g;
        n3 = drawable == null ? 0 : drawable.getIntrinsicHeight();
        for (n4 = 0; n4 < n10; ++n4) {
            block3: {
                int n12;
                jo jo2;
                int n13;
                int n14;
                block6: {
                    block7: {
                        block4: {
                            block5: {
                                drawable = this.getChildAt(n4);
                                n5 = n2;
                                if (drawable == null) break block3;
                                n5 = n2;
                                if (drawable.getVisibility() == 8) break block3;
                                n14 = drawable.getMeasuredWidth();
                                n13 = drawable.getMeasuredHeight();
                                jo2 = (jo)drawable.getLayoutParams();
                                n5 = n12 = jo2.gravity;
                                if (n12 < 0) {
                                    n5 = n11 & 0x800007;
                                }
                                if ((n5 = Gravity.getAbsoluteGravity((int)n5, (int)this.getLayoutDirection()) & 7) == 1) break block4;
                                if (n5 == 5) break block5;
                                n5 = jo2.leftMargin + n7;
                                break block6;
                            }
                            n12 = n6 - n8 - n14;
                            n5 = jo2.rightMargin;
                            break block7;
                        }
                        n12 = (n6 - n7 - n9 - n14) / 2 + n7 + jo2.leftMargin;
                        n5 = jo2.rightMargin;
                    }
                    n5 = n12 - n5;
                }
                n12 = n2;
                if (this.r(n4)) {
                    n12 = n2 + n3;
                }
                n2 = n12 + jo2.topMargin;
                drawable.layout(n5, n2, n14 + n5, n2 + n13);
                n5 = n2 + (n13 + jo2.bottomMargin);
            }
            n2 = n5;
        }
    }

    @Override
    protected final void onMeasure(int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        Object object;
        int n8;
        View view;
        int n9 = this.getChildCount();
        Object var22_4 = null;
        View view2 = null;
        View view3 = view = null;
        for (n8 = 0; n8 < n9; ++n8) {
            object = this.getChildAt(n8);
            View view4 = view2;
            View view5 = view;
            View view6 = view3;
            if (object.getVisibility() != 8) {
                n7 = object.getId();
                if (n7 == 2131427958) {
                    view4 = object;
                    view5 = view;
                    view6 = view3;
                } else if (n7 == 2131427457) {
                    view4 = view2;
                    view5 = object;
                    view6 = view3;
                } else if ((n7 == 2131427579 || n7 == 2131427590) && view3 == null) {
                    view4 = view2;
                    view5 = view;
                    view6 = object;
                } else {
                    super.onMeasure(n2, n3);
                    return;
                }
            }
            view2 = view4;
            view = view5;
            view3 = view6;
        }
        int n10 = View.MeasureSpec.getMode((int)n3);
        int n11 = View.MeasureSpec.getSize((int)n3);
        int n12 = View.MeasureSpec.getMode((int)n2);
        int n13 = this.getPaddingTop() + this.getPaddingBottom();
        if (view2 != null) {
            view2.measure(n2, 0);
            n13 += view2.getMeasuredHeight();
            n7 = View.combineMeasuredStates((int)0, (int)view2.getMeasuredState());
        } else {
            n7 = 0;
        }
        if (view != null) {
            view.measure(n2, 0);
            n8 = AlertDialogLayout.a(view);
            n6 = view.getMeasuredHeight() - n8;
            n13 += n8;
            n7 = View.combineMeasuredStates((int)n7, (int)view.getMeasuredState());
        } else {
            n8 = 0;
            n6 = 0;
        }
        if (view3 != null) {
            n5 = n10 == 0 ? 0 : View.MeasureSpec.makeMeasureSpec((int)Math.max(0, n11 - n13), (int)n10);
            view3.measure(n2, n5);
            n4 = view3.getMeasuredHeight();
            n13 += n4;
            n7 = View.combineMeasuredStates((int)n7, (int)view3.getMeasuredState());
        } else {
            n4 = 0;
            view3 = var22_4;
        }
        int n14 = n11 - n13;
        n11 = n7;
        int n15 = n14;
        n5 = n13;
        if (view != null) {
            n6 = Math.min(n14, n6);
            n11 = n14;
            n5 = n8;
            if (n6 > 0) {
                n11 = n14 - n6;
                n5 = n8 + n6;
            }
            view.measure(n2, View.MeasureSpec.makeMeasureSpec((int)n5, (int)0x40000000));
            n5 = n13 - n8 + view.getMeasuredHeight();
            n8 = View.combineMeasuredStates((int)n7, (int)view.getMeasuredState());
            n15 = n11;
            n11 = n8;
        }
        n7 = n11;
        n8 = n5;
        if (view3 != null) {
            n7 = n11;
            n8 = n5;
            if (n15 > 0) {
                view3.measure(n2, View.MeasureSpec.makeMeasureSpec((int)(n4 + n15), (int)n10));
                n8 = n5 - n4 + view3.getMeasuredHeight();
                n7 = View.combineMeasuredStates((int)n11, (int)view3.getMeasuredState());
            }
        }
        n5 = 0;
        for (n11 = 0; n11 < n9; ++n11) {
            view3 = this.getChildAt(n11);
            n13 = n5;
            if (view3.getVisibility() != 8) {
                n13 = Math.max(n5, view3.getMeasuredWidth());
            }
            n5 = n13;
        }
        this.setMeasuredDimension(View.resolveSizeAndState((int)(n5 + (this.getPaddingLeft() + this.getPaddingRight())), (int)n2, (int)n7), View.resolveSizeAndState((int)n8, (int)n3, (int)0));
        if (n12 != 0x40000000) {
            n8 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredWidth(), (int)0x40000000);
            for (n2 = 0; n2 < n9; ++n2) {
                view3 = this.getChildAt(n2);
                if (view3.getVisibility() == 8) continue;
                object = (jo)view3.getLayoutParams();
                if (object.width != -1) continue;
                n7 = object.height;
                object.height = view3.getMeasuredHeight();
                this.measureChildWithMargins(view3, n8, 0, n3, 0);
                object.height = n7;
            }
        }
    }
}

