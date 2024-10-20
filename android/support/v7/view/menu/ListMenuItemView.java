/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.AbsListView$SelectionBoundsAdjuster
 *  android.widget.CheckBox
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.RadioButton
 *  android.widget.TextView
 */
package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.wear.ambient.AmbientDelegate;

public class ListMenuItemView
extends LinearLayout
implements AbsListView.SelectionBoundsAdjuster,
gf {
    public fu a;
    public ImageView b;
    public boolean c;
    public boolean d;
    public boolean e;
    private ImageView f;
    private RadioButton g;
    private TextView h;
    private CheckBox i;
    private TextView j;
    private ImageView k;
    private LinearLayout l;
    private Drawable m;
    private int n;
    private Context o;
    private Drawable p;
    private LayoutInflater q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969488);
    }

    public ListMenuItemView(Context context, AttributeSet object, int n2) {
        super(context, (AttributeSet)object);
        object = AmbientDelegate.A(this.getContext(), (AttributeSet)object, er.r, n2, 0);
        this.m = ((AmbientDelegate)object).r(5);
        this.n = ((AmbientDelegate)object).p(1, -1);
        this.c = ((AmbientDelegate)object).w(7, false);
        this.o = context;
        this.p = ((AmbientDelegate)object).r(8);
        context = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, 2130969109, 0);
        this.d = context.hasValue(0);
        ((AmbientDelegate)object).v();
        context.recycle();
    }

    private final LayoutInflater b() {
        if (this.q == null) {
            this.q = LayoutInflater.from((Context)this.getContext());
        }
        return this.q;
    }

    private final void c(View view) {
        this.d(view, -1);
    }

    private final void d(View view, int n2) {
        LinearLayout linearLayout = this.l;
        if (linearLayout != null) {
            linearLayout.addView(view, n2);
            return;
        }
        this.addView(view, n2);
    }

    @Override
    public final fu a() {
        return this.a;
    }

    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.b;
        if (imageView != null && imageView.getVisibility() == 0) {
            imageView = (LinearLayout.LayoutParams)this.b.getLayoutParams();
            rect.top += this.b.getHeight() + imageView.topMargin + imageView.bottomMargin;
        }
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final void f(fu fu2) {
        Object object;
        Object object2;
        this.a = fu2;
        boolean bl2 = fu2.isVisible();
        int n2 = 0;
        int n3 = true != bl2 ? 8 : 0;
        this.setVisibility(n3);
        Object object3 = fu2.f(this);
        if (object3 != null) {
            this.h.setText((CharSequence)object3);
            if (this.h.getVisibility() != 0) {
                this.h.setVisibility(0);
            }
        } else if (this.h.getVisibility() != 8) {
            this.h.setVisibility(8);
        }
        if ((bl2 = fu2.isCheckable()) || this.g != null || this.i != null) {
            if (this.a.p()) {
                if (this.g == null) {
                    object3 = (RadioButton)this.b().inflate(2131623953, (ViewGroup)this, false);
                    this.g = object3;
                    this.c((View)object3);
                }
                object3 = this.g;
                object2 = this.i;
                object = object2;
            } else {
                if (this.i == null) {
                    object3 = (CheckBox)this.b().inflate(2131623950, (ViewGroup)this, false);
                    this.i = object3;
                    this.c((View)object3);
                }
                object3 = this.i;
                object = this.g;
                object2 = object3;
            }
            if (bl2) {
                object3.setChecked(this.a.isChecked());
                if (object3.getVisibility() != 0) {
                    object3.setVisibility(0);
                }
                if (object != null && object.getVisibility() != 8) {
                    object.setVisibility(8);
                }
            } else {
                if (object2 != null) {
                    object2.setVisibility(8);
                }
                if ((object3 = this.g) != null) {
                    object3.setVisibility(8);
                }
            }
        }
        bl2 = fu2.t();
        fu2.e();
        n3 = bl2 && this.a.t() ? 0 : 8;
        if (n3 == 0) {
            object = this.j;
            object3 = this.a;
            char c2 = ((fu)object3).e();
            if (c2 == '\u0000') {
                object3 = "";
            } else {
                object2 = ((fu)object3).j.a.getResources();
                StringBuilder stringBuilder = new StringBuilder();
                if (ViewConfiguration.get((Context)((fu)object3).j.a).hasPermanentMenuKey()) {
                    stringBuilder.append(object2.getString(2132017169));
                }
                int n4 = ((fu)object3).j.x() ? ((fu)object3).i : ((fu)object3).g;
                fu.g(stringBuilder, n4, 65536, object2.getString(2132017165));
                fu.g(stringBuilder, n4, 4096, object2.getString(2132017161));
                fu.g(stringBuilder, n4, 2, object2.getString(2132017160));
                fu.g(stringBuilder, n4, 1, object2.getString(2132017166));
                fu.g(stringBuilder, n4, 4, object2.getString(2132017168));
                fu.g(stringBuilder, n4, 8, object2.getString(2132017164));
                if (c2 != '\b') {
                    if (c2 != '\n') {
                        if (c2 != ' ') {
                            stringBuilder.append(c2);
                        } else {
                            stringBuilder.append(object2.getString(2132017167));
                        }
                    } else {
                        stringBuilder.append(object2.getString(2132017163));
                    }
                } else {
                    stringBuilder.append(object2.getString(2132017162));
                }
                object3 = stringBuilder.toString();
            }
            object.setText((CharSequence)object3);
        }
        if (this.j.getVisibility() != n3) {
            this.j.setVisibility(n3);
        }
        object3 = fu2.getIcon();
        object = this.a.j;
        bl2 = this.e;
        if ((bl2 || this.c) && ((object = this.f) != null || object3 != null || this.c)) {
            if (object == null) {
                object = (ImageView)this.b().inflate(2131623951, (ViewGroup)this, false);
                this.f = object;
                this.d((View)object, 0);
            }
            if (object3 == null && !this.c) {
                this.f.setVisibility(8);
            } else {
                object = this.f;
                if (!bl2) {
                    object3 = null;
                }
                object.setImageDrawable((Drawable)object3);
                if (this.f.getVisibility() != 0) {
                    this.f.setVisibility(0);
                }
            }
        }
        this.setEnabled(fu2.isEnabled());
        bl2 = fu2.hasSubMenu();
        object3 = this.k;
        if (object3 != null) {
            n3 = n2;
            if (!bl2) {
                n3 = 8;
            }
            object3.setVisibility(n3);
        }
        this.setContentDescription(fu2.l);
    }

    protected final void onFinishInflate() {
        TextView textView;
        super.onFinishInflate();
        this.setBackground(this.m);
        this.h = textView = (TextView)this.findViewById(2131427952);
        int n2 = this.n;
        if (n2 != -1) {
            textView.setTextAppearance(this.o, n2);
        }
        this.j = (TextView)this.findViewById(2131427871);
        textView = (ImageView)this.findViewById(2131427909);
        this.k = textView;
        if (textView != null) {
            textView.setImageDrawable(this.p);
        }
        this.b = (ImageView)this.findViewById(2131427669);
        this.l = (LinearLayout)this.findViewById(2131427578);
    }

    protected final void onMeasure(int n2, int n3) {
        if (this.f != null && this.c) {
            ViewGroup.LayoutParams layoutParams = this.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams)this.f.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(n2, n3);
    }
}

