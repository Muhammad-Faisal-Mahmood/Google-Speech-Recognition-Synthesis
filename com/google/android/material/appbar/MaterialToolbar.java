/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.util.Pair
 *  android.view.Menu
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  android.widget.TextView
 */
package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Collections;
import java.util.List;

public class MaterialToolbar
extends Toolbar {
    private static final ImageView.ScaleType[] A = new ImageView.ScaleType[]{ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private Integer B;
    private boolean C;
    private boolean D;
    private ImageView.ScaleType E;
    private Boolean F;

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130970110);
    }

    public MaterialToolbar(Context context, AttributeSet object, int n2) {
        super(fyl.a(context, (AttributeSet)object, n2, 2132084919), (AttributeSet)object, n2);
        Context context2 = this.getContext();
        context = fwl.c(context2, (AttributeSet)object, ftw.e, n2, 2132084919);
        if (context.hasValue(2)) {
            this.B = context.getColor(2, -1);
            object = this.e();
            if (object != null) {
                ((Toolbar)this).q((Drawable)object);
            }
        }
        this.C = context.getBoolean(4, false);
        this.D = context.getBoolean(3, false);
        n2 = context.getInt(1, -1);
        if (n2 >= 0 && n2 < 8) {
            this.E = A[n2];
        }
        if (context.hasValue(0)) {
            this.F = context.getBoolean(0, false);
        }
        context.recycle();
        context = this.getBackground();
        context = context == null ? ColorStateList.valueOf((int)0) : fvc.d((Drawable)context);
        if (context != null) {
            object = new fxi();
            ((fxi)object).l((ColorStateList)context);
            ((fxi)object).i(context2);
            ((fxi)object).k(wa.a((View)this));
            this.setBackground((Drawable)object);
        }
    }

    private final void C(View view, Pair pair) {
        int n2 = this.getMeasuredWidth() / 2;
        int n3 = view.getMeasuredWidth();
        int n4 = n2 - n3 / 2;
        int n5 = n3 + n4;
        int n6 = Math.max(Math.max((Integer)pair.first - n4, 0), Math.max(n5 - (Integer)pair.second, 0));
        n2 = n4;
        n3 = n5;
        if (n6 > 0) {
            n2 = n4 + n6;
            n3 = n5 - n6;
            view.measure(View.MeasureSpec.makeMeasureSpec((int)(n3 - n2), (int)0x40000000), view.getMeasuredHeightAndState());
        }
        view.layout(n2, view.getTop(), n3, view.getBottom());
    }

    @Override
    public final void n(int n2) {
        Menu menu = this.f();
        boolean bl2 = menu instanceof fs;
        if (bl2) {
            ((fs)menu).s();
        }
        super.n(n2);
        if (bl2) {
            ((fs)menu).r();
        }
    }

    @Override
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fxf.c((View)this);
    }

    @Override
    protected final void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        Drawable drawable;
        List list;
        Object object;
        super.onLayout(bl2, n2, n3, n4, n5);
        bl2 = this.C;
        int n6 = 0;
        Object var12_7 = null;
        if (bl2 || this.D) {
            object = fwm.a(this, this.t);
            object = object.isEmpty() ? null : (TextView)Collections.min(object, fwm.a);
            list = fwm.a(this, this.u);
            list = list.isEmpty() ? null : (TextView)Collections.max(list, fwm.a);
            if (object != null || list != null) {
                n3 = this.getMeasuredWidth();
                int n7 = n3 / 2;
                n2 = this.getPaddingLeft();
                n4 = n3 - this.getPaddingRight();
                for (n5 = 0; n5 < this.getChildCount(); ++n5) {
                    drawable = this.getChildAt(n5);
                    int n8 = n2;
                    int n9 = n4;
                    if (drawable.getVisibility() != 8) {
                        n8 = n2;
                        n9 = n4;
                        if (drawable != object) {
                            n8 = n2;
                            n9 = n4;
                            if (drawable != list) {
                                n3 = n2;
                                if (drawable.getRight() < n7) {
                                    n3 = n2;
                                    if (drawable.getRight() > n2) {
                                        n3 = drawable.getRight();
                                    }
                                }
                                n8 = n3;
                                n9 = n4;
                                if (drawable.getLeft() > n7) {
                                    n8 = n3;
                                    n9 = n4;
                                    if (drawable.getLeft() < n4) {
                                        n9 = drawable.getLeft();
                                        n8 = n3;
                                    }
                                }
                            }
                        }
                    }
                    n2 = n8;
                    n4 = n9;
                }
                drawable = new Pair((Object)n2, (Object)n4);
                if (this.C && object != null) {
                    this.C((View)object, (Pair)drawable);
                }
                if (this.D && list != null) {
                    this.C((View)list, (Pair)drawable);
                }
            }
        }
        object = (object = this.e) != null ? object.getDrawable() : null;
        n2 = n6;
        if (object == null) {
            list = var12_7;
        } else {
            while (true) {
                list = var12_7;
                if (n2 >= this.getChildCount() || (list = this.getChildAt(n2)) instanceof ImageView && (drawable = (list = (ImageView)list).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(object.getConstantState())) break;
                ++n2;
            }
        }
        if (list != null) {
            object = this.F;
            if (object != null) {
                list.setAdjustViewBounds((Boolean)object);
            }
            if ((object = this.E) != null) {
                list.setScaleType((ImageView.ScaleType)object);
            }
        }
    }

    @Override
    public final void q(Drawable drawable) {
        Drawable drawable2 = drawable;
        if (drawable != null) {
            drawable2 = drawable;
            if (this.B != null) {
                drawable2 = drawable.mutate();
                drawable2.setTint(this.B.intValue());
            }
        }
        super.q(drawable2);
    }

    public final void setElevation(float f2) {
        super.setElevation(f2);
        fxf.b((View)this, f2);
    }
}

