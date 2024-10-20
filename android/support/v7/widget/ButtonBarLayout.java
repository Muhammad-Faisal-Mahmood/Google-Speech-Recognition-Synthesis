/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 */
package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class ButtonBarLayout
extends LinearLayout {
    private final boolean a;
    private boolean b;
    private int c = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean bl2;
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, er.k);
        wj.l((View)this, context, er.k, attributeSet, typedArray, 0, 0);
        this.a = bl2 = typedArray.getBoolean(0, true);
        typedArray.recycle();
        if (this.getOrientation() == 1) {
            this.b(bl2);
        }
    }

    private final int a(int n2) {
        int n3 = this.getChildCount();
        while (n2 < n3) {
            if (this.getChildAt(n2).getVisibility() == 0) {
                return n2;
            }
            ++n2;
        }
        return -1;
    }

    private final void b(boolean n2) {
        if (this.b != n2 && (n2 == 0 || this.a)) {
            this.b = n2;
            this.setOrientation(n2);
            int n3 = 1 != n2 ? 80 : 0x800005;
            this.setGravity(n3);
            View view = this.findViewById(2131427886);
            if (view != null) {
                n2 = 1 != n2 ? 4 : 8;
                view.setVisibility(n2);
            }
            for (n2 = this.getChildCount() - 2; n2 >= 0; --n2) {
                this.bringChildToFront(this.getChildAt(n2));
            }
        }
    }

    protected final void onMeasure(int n2, int n3) {
        Object object;
        int n4;
        block14: {
            block12: {
                int n5;
                block15: {
                    block13: {
                        block11: {
                            block10: {
                                block9: {
                                    n4 = View.MeasureSpec.getSize((int)n2);
                                    if (this.a) {
                                        if (n4 > this.c && this.b) {
                                            this.b(false);
                                        }
                                        this.c = n4;
                                    }
                                    if (!this.b && View.MeasureSpec.getMode((int)n2) == 0x40000000) {
                                        n5 = View.MeasureSpec.makeMeasureSpec((int)n4, (int)Integer.MIN_VALUE);
                                        n4 = 1;
                                    } else {
                                        n5 = n2;
                                        n4 = 0;
                                    }
                                    super.onMeasure(n5, n3);
                                    if (!this.a || this.b || (this.getMeasuredWidthAndState() & 0xFF000000) != 0x1000000) break block9;
                                    this.b(true);
                                    break block10;
                                }
                                if (n4 == 0) break block11;
                            }
                            super.onMeasure(n2, n3);
                        }
                        if ((n4 = this.a(0)) < 0) break block12;
                        object = this.getChildAt(n4);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)object.getLayoutParams();
                        n5 = this.getPaddingTop() + object.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                        if (!this.b) break block13;
                        int n6 = this.a(n4 + 1);
                        n4 = n5;
                        if (n6 < 0) break block14;
                        n4 = this.getChildAt(n6).getPaddingTop() + (int)(this.getResources().getDisplayMetrics().density * 16.0f);
                        break block15;
                    }
                    n4 = this.getPaddingBottom();
                }
                n4 = n5 + n4;
                break block14;
            }
            n4 = 0;
        }
        object = wj.a;
        if (this.getMinimumHeight() != n4) {
            this.setMinimumHeight(n4);
            if (n3 == 0) {
                super.onMeasure(n2, 0);
            }
        }
    }
}

