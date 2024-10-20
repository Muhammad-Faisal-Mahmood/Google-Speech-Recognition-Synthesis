/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package android.support.v7.widget;

import android.content.Context;
import android.support.v7.widget.ActionMenuView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.wear.ambient.AmbientDelegate;

public class ActionBarContextView
extends gn {
    public CharSequence g;
    public CharSequence h;
    public View i;
    public boolean j;
    private View k;
    private View l;
    private LinearLayout m;
    private TextView n;
    private TextView o;
    private int p;
    private int q;
    private int r;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130968609);
    }

    public ActionBarContextView(Context object, AttributeSet attributeSet, int n2) {
        super((Context)object, attributeSet, n2);
        object = AmbientDelegate.A((Context)object, attributeSet, er.d, n2, 0);
        this.setBackground(((AmbientDelegate)object).r(0));
        this.p = ((AmbientDelegate)object).p(5, 0);
        this.q = ((AmbientDelegate)object).p(4, 0);
        this.e = ((AmbientDelegate)object).o(3, 0);
        this.r = ((AmbientDelegate)object).p(2, 2131623941);
        ((AmbientDelegate)object).v();
    }

    private final void o() {
        int n2;
        LinearLayout linearLayout;
        block8: {
            block7: {
                if (this.m == null) {
                    LayoutInflater.from((Context)this.getContext()).inflate(2131623936, (ViewGroup)this);
                    this.m = linearLayout = (LinearLayout)this.getChildAt(this.getChildCount() - 1);
                    this.n = (TextView)linearLayout.findViewById(2131427396);
                    this.o = (TextView)this.m.findViewById(2131427395);
                    if (this.p != 0) {
                        this.n.setTextAppearance(this.getContext(), this.p);
                    }
                    if (this.q != 0) {
                        this.o.setTextAppearance(this.getContext(), this.q);
                    }
                }
                this.n.setText(this.g);
                this.o.setText(this.h);
                boolean bl2 = TextUtils.isEmpty((CharSequence)this.g);
                boolean bl3 = TextUtils.isEmpty((CharSequence)this.h);
                linearLayout = this.o;
                int n3 = 8;
                n2 = true != bl3 ? 0 : 8;
                linearLayout.setVisibility(n2);
                linearLayout = this.m;
                if (!bl2) break block7;
                n2 = n3;
                if (bl3) break block8;
            }
            n2 = 0;
        }
        linearLayout.setVisibility(n2);
        if (this.m.getParent() == null) {
            this.addView((View)this.m);
        }
    }

    @Override
    public final void c(int n2) {
        this.e = n2;
    }

    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(this.getContext(), attributeSet);
    }

    public final void h(ew object) {
        Object object2 = this.i;
        if (object2 == null) {
            object2 = LayoutInflater.from((Context)this.getContext()).inflate(this.r, (ViewGroup)this, false);
            this.i = object2;
            this.addView((View)object2);
        } else if (object2.getParent() == null) {
            this.addView(this.i);
        }
        object2 = this.i.findViewById(2131427407);
        this.k = object2;
        object2.setOnClickListener((View.OnClickListener)new gp(object, 0));
        object2 = ((ew)object).a();
        object = this.d;
        if (object != null) {
            ((gy)object).n();
        }
        this.d = new gy(this.getContext());
        this.d.p();
        object = new ViewGroup.LayoutParams(-2, -1);
        Object object3 = this.d;
        Object object4 = this.b;
        ((fs)object2).h((ge)object3, (Context)object4);
        object2 = this.d;
        object4 = ((gy)object2).f;
        if (((fi)object2).f == null) {
            ((fi)object2).f = (gg)((fi)object2).d.inflate(2131623939, (ViewGroup)this, false);
            ((fi)object2).f.a(((fi)object2).c);
            ((fi)object2).i();
        }
        if (object4 != (object3 = ((fi)object2).f)) {
            ((ActionMenuView)object3).j((gy)object2);
        }
        this.c = (ActionMenuView)object3;
        this.c.setBackground(null);
        this.addView((View)this.c, (ViewGroup.LayoutParams)object);
    }

    public final void i() {
        this.removeAllViews();
        this.l = null;
        this.c = null;
        this.d = null;
        View view = this.k;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public final void j(View view) {
        View view2 = this.l;
        if (view2 != null) {
            this.removeView(view2);
        }
        this.l = view;
        if (view != null && (view2 = this.m) != null) {
            this.removeView(view2);
            this.m = null;
        }
        if (view != null) {
            this.addView(view);
        }
        this.requestLayout();
    }

    public final void k(CharSequence charSequence) {
        this.h = charSequence;
        this.o();
    }

    public final void l(CharSequence charSequence) {
        this.g = charSequence;
        this.o();
        wj.n((View)this, charSequence);
    }

    public final void m(boolean bl2) {
        if (bl2 != this.j) {
            this.requestLayout();
        }
        this.j = bl2;
    }

    public final void n() {
        gy gy2 = this.d;
        if (gy2 != null) {
            gy2.m();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gy gy2 = this.d;
        if (gy2 != null) {
            gy2.k();
            this.d.q();
        }
    }

    protected final void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        bl2 = mi.a((View)this);
        int n6 = bl2 ? n4 - n2 - this.getPaddingRight() : this.getPaddingLeft();
        int n7 = this.getPaddingTop();
        int n8 = n5 - n3 - this.getPaddingTop() - this.getPaddingBottom();
        Object object = this.i;
        n3 = n6;
        if (object != null) {
            n3 = n6;
            if (object.getVisibility() != 8) {
                object = (ViewGroup.MarginLayoutParams)this.i.getLayoutParams();
                n3 = bl2 ? object.rightMargin : object.leftMargin;
                n5 = bl2 ? object.leftMargin : object.rightMargin;
                n3 = ActionBarContextView.a(n6, n3, bl2);
                n3 = ActionBarContextView.a(n3 + ActionBarContextView.f(this.i, n3, n7, n8, bl2), n5, bl2);
            }
        }
        object = this.m;
        n5 = n3;
        if (object != null) {
            n5 = n3;
            if (this.l == null) {
                n5 = n3;
                if (object.getVisibility() != 8) {
                    n5 = n3 + ActionBarContextView.f((View)this.m, n3, n7, n8, bl2);
                }
            }
        }
        if ((object = this.l) != null) {
            ActionBarContextView.f(object, n5, n7, n8, bl2);
        }
        n2 = bl2 ? this.getPaddingLeft() : n4 - n2 - this.getPaddingRight();
        object = this.c;
        if (object != null) {
            ActionBarContextView.f(object, n2, n7, n8, bl2 ^ true);
        }
    }

    protected final void onMeasure(int n2, int n3) {
        int n4 = View.MeasureSpec.getMode((int)n2);
        int n5 = 0x40000000;
        if (n4 == 0x40000000) {
            if (View.MeasureSpec.getMode((int)n3) != 0) {
                int n6 = View.MeasureSpec.getSize((int)n2);
                n4 = n2 = this.e;
                if (n2 <= 0) {
                    n4 = View.MeasureSpec.getSize((int)n3);
                }
                int n7 = this.getPaddingTop() + this.getPaddingBottom();
                n2 = n6 - this.getPaddingLeft() - this.getPaddingRight();
                int n8 = n4 - n7;
                int n9 = View.MeasureSpec.makeMeasureSpec((int)n8, (int)Integer.MIN_VALUE);
                Object object = this.i;
                n3 = n2;
                if (object != null) {
                    n2 = ActionBarContextView.e(object, n2, n9);
                    object = (ViewGroup.MarginLayoutParams)this.i.getLayoutParams();
                    n3 = n2 - (object.leftMargin + object.rightMargin);
                }
                object = this.c;
                n2 = n3;
                if (object != null) {
                    n2 = n3;
                    if (object.getParent() == this) {
                        n2 = ActionBarContextView.e((View)this.c, n3, n9);
                    }
                }
                object = this.m;
                int n10 = 0;
                n3 = n2;
                if (object != null) {
                    n3 = n2;
                    if (this.l == null) {
                        if (this.j) {
                            n3 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
                            this.m.measure(n3, n9);
                            int n11 = this.m.getMeasuredWidth();
                            n9 = n11 <= n2 ? 1 : 0;
                            n3 = n2;
                            if (n9 != 0) {
                                n3 = n2 - n11;
                            }
                            object = this.m;
                            n2 = 1 != n9 ? 8 : 0;
                            object.setVisibility(n2);
                        } else {
                            n3 = ActionBarContextView.e(object, n2, n9);
                        }
                    }
                }
                if ((object = this.l) != null) {
                    object = object.getLayoutParams();
                    n2 = object.width != -2 ? 0x40000000 : Integer.MIN_VALUE;
                    n9 = n3;
                    if (object.width >= 0) {
                        n9 = Math.min(object.width, n3);
                    }
                    n3 = object.height != -2 ? n5 : Integer.MIN_VALUE;
                    n5 = n8;
                    if (object.height >= 0) {
                        n5 = Math.min(object.height, n8);
                    }
                    this.l.measure(View.MeasureSpec.makeMeasureSpec((int)n9, (int)n2), View.MeasureSpec.makeMeasureSpec((int)n5, (int)n3));
                }
                if (this.e <= 0) {
                    n5 = this.getChildCount();
                    n4 = 0;
                    for (n2 = n10; n2 < n5; ++n2) {
                        n9 = this.getChildAt(n2).getMeasuredHeight() + n7;
                        n3 = n4;
                        if (n9 > n4) {
                            n3 = n9;
                        }
                        n4 = n3;
                    }
                    this.setMeasuredDimension(n6, n4);
                    return;
                }
                this.setMeasuredDimension(n6, n4);
                return;
            }
            throw new IllegalStateException(String.valueOf(((Object)((Object)this)).getClass().getSimpleName()).concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        throw new IllegalStateException(String.valueOf(((Object)((Object)this)).getClass().getSimpleName()).concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

