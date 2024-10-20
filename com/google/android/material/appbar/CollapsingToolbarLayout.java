/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Configuration
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.Region$Op
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.text.TextUtils
 *  android.text.TextUtils$TruncateAt
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.animation.AnimationUtils
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.Toolbar
 */
package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.Toolbar;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;

public class CollapsingToolbarLayout
extends FrameLayout {
    private int A;
    private int B;
    private boolean C;
    private int D;
    private boolean E;
    private AmbientModeSupport$AmbientController F;
    public final fwe a;
    final fve b;
    Drawable c;
    int d;
    public xn e;
    private boolean f;
    private int g;
    private ViewGroup h;
    private View i;
    private View j;
    private int k;
    private int l;
    private int m;
    private int n;
    private final Rect o;
    private boolean p;
    private boolean q;
    private Drawable r;
    private int s;
    private boolean t;
    private ValueAnimator u;
    private long v;
    private final TimeInterpolator w;
    private final TimeInterpolator x;
    private int y;
    private int z;

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130968881);
    }

    public CollapsingToolbarLayout(Context object, AttributeSet attributeSet, int n2) {
        super(fyl.a(object, attributeSet, n2, 2132084254), attributeSet, n2);
        fve fve2;
        fwe fwe2;
        boolean bl2 = true;
        this.f = true;
        this.o = new Rect();
        this.y = -1;
        this.B = 0;
        this.D = 0;
        Context context = this.getContext();
        this.z = this.getResources().getConfiguration().orientation;
        this.a = fwe2 = new fwe((View)this);
        fwe2.C = ftf.e;
        fwe2.f();
        fwe2.x = false;
        this.b = fve2 = new fve(context);
        TypedArray typedArray = fwl.c(context, attributeSet, ftw.c, n2, 2132084254);
        n2 = typedArray.getInt(4, 8388691);
        if (fwe2.i != n2) {
            fwe2.i = n2;
            fwe2.f();
        }
        if (fwe2.j != (n2 = typedArray.getInt(0, 8388627))) {
            fwe2.j = n2;
            fwe2.f();
        }
        this.n = n2 = typedArray.getDimensionPixelSize(5, 0);
        this.m = n2;
        this.l = n2;
        this.k = n2;
        if (typedArray.hasValue(8)) {
            this.k = typedArray.getDimensionPixelSize(8, 0);
        }
        if (typedArray.hasValue(7)) {
            this.m = typedArray.getDimensionPixelSize(7, 0);
        }
        if (typedArray.hasValue(9)) {
            this.l = typedArray.getDimensionPixelSize(9, 0);
        }
        if (typedArray.hasValue(6)) {
            this.n = typedArray.getDimensionPixelSize(6, 0);
        }
        this.p = typedArray.getBoolean(20, true);
        this.e(typedArray.getText(18));
        fwe2.i(2132083443);
        fwe2.h(2132083395);
        if (typedArray.hasValue(10)) {
            fwe2.i(typedArray.getResourceId(10, 0));
        }
        if (typedArray.hasValue(1)) {
            fwe2.h(typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(22)) {
            n2 = typedArray.getInt(22, -1);
            object = n2 != 0 ? (n2 != 1 ? (n2 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE) : TextUtils.TruncateAt.MIDDLE) : TextUtils.TruncateAt.START;
            fwe2.u = object;
            fwe2.f();
        }
        if (typedArray.hasValue(11) && fwe2.l != (object = fvc.o(context, typedArray, 11))) {
            fwe2.l = object;
            fwe2.f();
        }
        if (typedArray.hasValue(2) && fwe2.m != (object = fvc.o(context, typedArray, 2))) {
            fwe2.m = object;
            fwe2.f();
        }
        this.y = typedArray.getDimensionPixelSize(16, -1);
        if (typedArray.hasValue(14) && (n2 = typedArray.getInt(14, 1)) != fwe2.E) {
            fwe2.E = n2;
            fwe2.f();
        }
        if (typedArray.hasValue(21)) {
            fwe2.B = AnimationUtils.loadInterpolator((Context)context, (int)typedArray.getResourceId(21, 0));
            fwe2.f();
        }
        this.v = typedArray.getInt(15, 600);
        this.w = fvc.t(context, 2130969620, ftf.c);
        this.x = fvc.t(context, 2130969620, ftf.d);
        this.c(typedArray.getDrawable(3));
        context = typedArray.getDrawable(17);
        object = this.c;
        attributeSet = null;
        if (object != context) {
            if (object != null) {
                object.setCallback(null);
            }
            object = context != null ? context.mutate() : null;
            this.c = object;
            if (object != null) {
                if (object.isStateful()) {
                    this.c.setState(this.getDrawableState());
                }
                this.c.setLayoutDirection(this.getLayoutDirection());
                object = this.c;
                if (this.getVisibility() != 0) {
                    bl2 = false;
                }
                object.setVisible(bl2, false);
                this.c.setCallback((Drawable.Callback)this);
                this.c.setAlpha(this.s);
            }
            this.postInvalidateOnAnimation();
        }
        this.A = typedArray.getInt(19, 0);
        fwe2.c = bl2 = this.o();
        object = this.getParent();
        if (object instanceof AppBarLayout) {
            this.i((AppBarLayout)object);
        }
        if (bl2 && this.r == null) {
            object = this.getContext();
            fwe2 = fvc.q(object, 2130968968);
            if (fwe2 == null) {
                object = attributeSet;
            } else if (((TypedValue)fwe2).resourceId != 0) {
                object = ye.f(object, ((TypedValue)fwe2).resourceId);
            } else {
                object = attributeSet;
                if (((TypedValue)fwe2).data != 0) {
                    object = ColorStateList.valueOf((int)((TypedValue)fwe2).data);
                }
            }
            if (object != null) {
                n2 = object.getDefaultColor();
            } else {
                float f2 = this.getResources().getDimension(2131165453);
                n2 = fve2.a(fve2.b, f2);
            }
            this.c((Drawable)new ColorDrawable(n2));
        }
        this.g = typedArray.getResourceId(23, -1);
        this.C = typedArray.getBoolean(13, false);
        this.E = typedArray.getBoolean(12, false);
        typedArray.recycle();
        this.setWillNotDraw(false);
        wa.k((View)this, new ftr(this));
    }

    static hvz g(View view) {
        hvz hvz2;
        hvz hvz3 = hvz2 = (hvz)view.getTag(2131428007);
        if (hvz2 == null) {
            hvz3 = new hvz(view);
            view.setTag(2131428007, (Object)hvz3);
        }
        return hvz3;
    }

    private static int h(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            layoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
            return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
        return view.getMeasuredHeight();
    }

    private final void i(AppBarLayout appBarLayout) {
        if (this.o()) {
            appBarLayout.f = false;
        }
    }

    private final void j() {
        View view;
        if (!this.f) {
            return;
        }
        Object var5_1 = null;
        this.h = null;
        this.i = null;
        int n2 = this.g;
        if (n2 != -1) {
            ViewGroup viewGroup;
            this.h = viewGroup = (ViewGroup)this.findViewById(n2);
            if (viewGroup != null) {
                for (view = viewGroup.getParent(); view != this && view != null; view = view.getParent()) {
                    if (!(view instanceof View)) continue;
                    viewGroup = view;
                }
                this.i = viewGroup;
            }
        }
        if (this.h == null) {
            block10: {
                int n3 = this.getChildCount();
                n2 = 0;
                while (true) {
                    view = var5_1;
                    if (n2 >= n3) break block10;
                    view = this.getChildAt(n2);
                    if (view instanceof android.support.v7.widget.Toolbar || view instanceof Toolbar) break;
                    ++n2;
                }
                view = (ViewGroup)view;
            }
            this.h = view;
        }
        if (!this.p && (view = this.j) != null && (view = view.getParent()) instanceof ViewGroup) {
            ((ViewGroup)view).removeView(this.j);
        }
        if (this.p && this.h != null) {
            if (this.j == null) {
                this.j = new View(this.getContext());
            }
            if (this.j.getParent() == null) {
                this.h.addView(this.j, -1, -1);
            }
        }
        this.f = false;
    }

    private final void k(Drawable drawable, int n2, int n3) {
        this.l(drawable, (View)this.h, n2, n3);
    }

    private final void l(Drawable drawable, View view, int n2, int n3) {
        int n4 = n3;
        if (this.o()) {
            n4 = n3;
            if (view != null) {
                n4 = n3;
                if (this.p) {
                    n4 = view.getBottom();
                }
            }
        }
        drawable.setBounds(0, 0, n2, n4);
    }

    private final void m(int n2, int n3, int n4, int n5, boolean bl2) {
        block11: {
            int n6;
            int n7;
            int n8;
            View view;
            int n9;
            int n10;
            Object object;
            block12: {
                if (!this.p || (object = this.j) == null) break block11;
                boolean bl3 = object.isAttachedToWindow();
                n10 = 0;
                bl3 = bl3 && this.j.getVisibility() == 0;
                this.q = bl3;
                if (bl3) break block12;
                if (!bl2) break block11;
                bl2 = true;
            }
            boolean bl4 = (n9 = this.getLayoutDirection()) == 1;
            object = view = this.i;
            if (view == null) {
                object = this.h;
            }
            int n11 = this.a((View)object);
            fwf.a((ViewGroup)this, this.j, this.o);
            object = this.h;
            if (object instanceof android.support.v7.widget.Toolbar) {
                object = (android.support.v7.widget.Toolbar)object;
                n10 = object.o;
                n8 = object.p;
                n7 = object.q;
                n6 = object.r;
            } else if (object instanceof Toolbar) {
                object = (Toolbar)object;
                n10 = ag$$ExternalSyntheticApiModelOutline1.m((Toolbar)object);
                n8 = ag$$ExternalSyntheticApiModelOutline1.m$1((Toolbar)object);
                n7 = ag$$ExternalSyntheticApiModelOutline1.m$2((Toolbar)object);
                n6 = ag$$ExternalSyntheticApiModelOutline1.m$3((Toolbar)object);
            } else {
                n6 = 0;
                n7 = n8 = 0;
            }
            object = this.a;
            view = this.o;
            int n12 = n9 == 1 ? n8 : n10;
            n12 = view.left + n12;
            int n13 = this.o.top;
            view = this.o;
            if (n9 != 1) {
                n10 = n8;
            }
            n10 = view.right - n10;
            n8 = this.o.bottom;
            if (!fwe.j(object.h, n12, n7 = n13 + n11 + n7, n10, n8 = n8 + n11 - n6)) {
                object.h.set(n12, n7, n10, n8);
                object.z = true;
            }
            object = this.a;
            n10 = bl4 ? this.m : this.k;
            if (!fwe.j(object.g, n10, n6 = this.o.top + this.l, n2 = n4 - n2 - (n8 = bl4 ? this.k : this.m), n3 = n5 - n3 - this.n)) {
                object.g.set(n10, n6, n2, n3);
                object.z = true;
            }
            this.a.g(bl2);
        }
    }

    private final void n() {
        if (this.h != null && this.p && TextUtils.isEmpty((CharSequence)this.a.v)) {
            Object object = this.h;
            object = object instanceof android.support.v7.widget.Toolbar ? ((android.support.v7.widget.Toolbar)object).t : (object instanceof Toolbar ? ((Toolbar)object).getTitle() : null);
            this.e((CharSequence)object);
        }
    }

    private final boolean o() {
        return this.A == 1;
    }

    final int a(View view) {
        hvz hvz2 = CollapsingToolbarLayout.g(view);
        fts fts2 = (fts)view.getLayoutParams();
        return this.getHeight() - hvz2.b - view.getHeight() - fts2.bottomMargin;
    }

    public final int b() {
        int n2 = this.y;
        if (n2 >= 0) {
            return n2 + this.B + this.D;
        }
        xn xn2 = this.e;
        n2 = xn2 != null ? xn2.d() : 0;
        int n3 = this.getMinimumHeight();
        if (n3 > 0) {
            return Math.min(n3 + n3 + n2, this.getHeight());
        }
        return this.getHeight() / 3;
    }

    public final void c(Drawable drawable) {
        Drawable drawable2 = this.r;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.r = drawable3;
            if (drawable3 != null) {
                this.k(drawable3, this.getWidth(), this.getHeight());
                this.r.setCallback((Drawable.Callback)this);
                this.r.setAlpha(this.s);
            }
            this.postInvalidateOnAnimation();
        }
    }

    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof fts;
    }

    public final void d(int n2) {
        if (n2 != this.s) {
            ViewGroup viewGroup;
            if (this.r != null && (viewGroup = this.h) != null) {
                viewGroup.postInvalidateOnAnimation();
            }
            this.s = n2;
            this.postInvalidateOnAnimation();
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void draw(Canvas var1_1) {
        block4: {
            super.draw(var1_1);
            this.j();
            if (this.h == null && (var3_2 = this.r) != null && this.s > 0) {
                var3_2.mutate().setAlpha(this.s);
                this.r.draw(var1_1);
            }
            if (!this.p || !this.q) break block4;
            if (this.h == null || this.r == null || this.s <= 0 || !this.o()) ** GOTO lbl-1000
            var3_2 = this.a;
            if (var3_2.b < var3_2.e) {
                var2_3 = var1_1.save();
                var1_1.clipRect(this.r.getBounds(), Region.Op.DIFFERENCE);
                this.a.d(var1_1);
                var1_1.restoreToCount(var2_3);
            } else lbl-1000:
            // 2 sources

            {
                this.a.d(var1_1);
            }
        }
        if (this.c != null && this.s > 0 && (var2_3 = (var3_2 = this.e) != null ? var3_2.d() : 0) > 0) {
            this.c.setBounds(0, -this.d, this.getWidth(), var2_3 - this.d);
            this.c.mutate().setAlpha(this.s);
            this.c.draw(var1_1);
        }
    }

    protected final boolean drawChild(Canvas canvas, View view, long l2) {
        boolean bl2;
        View view2;
        Drawable drawable = this.r;
        if (drawable != null && this.s > 0 && !((view2 = this.i) == null || view2 == this ? view != this.h : view != view2)) {
            this.l(drawable, view, this.getWidth(), this.getHeight());
            this.r.mutate().setAlpha(this.s);
            this.r.draw(canvas);
            bl2 = true;
        } else {
            bl2 = false;
        }
        return super.drawChild(canvas, view, l2) || bl2;
        {
        }
    }

    protected final void drawableStateChanged() {
        boolean bl2;
        block6: {
            boolean bl3;
            boolean bl4;
            block8: {
                Object object;
                block7: {
                    super.drawableStateChanged();
                    Object object2 = this.getDrawableState();
                    object = this.c;
                    boolean bl5 = false;
                    bl2 = object != null && object.isStateful() ? object.setState(object2) : false;
                    object = this.r;
                    bl4 = bl2;
                    if (object != null) {
                        bl4 = bl2;
                        if (object.isStateful()) {
                            bl4 = bl2 | object.setState(object2);
                        }
                    }
                    object = this.a;
                    bl2 = bl4;
                    if (object == null) break block6;
                    ((fwe)object).y = object2;
                    object2 = ((fwe)object).m;
                    if (object2 != null && object2.isStateful()) break block7;
                    object2 = ((fwe)object).l;
                    bl3 = bl5;
                    if (object2 == null) break block8;
                    bl3 = bl5;
                    if (!object2.isStateful()) break block8;
                }
                ((fwe)object).f();
                bl3 = true;
            }
            bl2 = bl4 | bl3;
        }
        if (bl2) {
            this.invalidate();
        }
    }

    public final void e(CharSequence charSequence) {
        fwe fwe2 = this.a;
        Object var2_3 = null;
        if (charSequence == null || !TextUtils.equals((CharSequence)fwe2.v, (CharSequence)charSequence)) {
            fwe2.v = charSequence;
            fwe2.w = null;
            fwe2.f();
        }
        charSequence = var2_3;
        if (this.p) {
            charSequence = this.a.v;
        }
        this.setContentDescription(charSequence);
    }

    final void f() {
        if (this.r != null || this.c != null) {
            int n2 = this.getHeight() + this.d;
            int n3 = this.b();
            int n4 = 0;
            boolean bl2 = n2 < n3;
            boolean bl3 = this.isLaidOut() && !this.isInEditMode();
            if (this.t != bl2) {
                if (n2 < n3) {
                    n4 = 255;
                }
                if (bl3) {
                    this.j();
                    ValueAnimator valueAnimator = this.u;
                    if (valueAnimator == null) {
                        ValueAnimator valueAnimator2;
                        this.u = valueAnimator2 = new ValueAnimator();
                        valueAnimator = n4 > this.s ? this.w : this.x;
                        valueAnimator2.setInterpolator((TimeInterpolator)valueAnimator);
                        this.u.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new fud((Object)this, 1));
                    } else if (valueAnimator.isRunning()) {
                        this.u.cancel();
                    }
                    this.u.setDuration(this.v);
                    this.u.setIntValues(new int[]{this.s, n4});
                    this.u.start();
                } else {
                    this.d(n4);
                }
                this.t = bl2;
            }
        }
    }

    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new fts();
    }

    protected final /* synthetic */ FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new fts();
    }

    protected final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new fts(layoutParams);
    }

    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new fts(this.getContext(), attributeSet);
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object object = this.getParent();
        if (object instanceof AppBarLayout) {
            object = (AppBarLayout)object;
            this.i((AppBarLayout)object);
            this.setFitsSystemWindows(object.getFitsSystemWindows());
            if (this.F == null) {
                this.F = new AmbientModeSupport$AmbientController((Object)this);
            }
            AmbientModeSupport$AmbientController ambientModeSupport$AmbientController = this.F;
            if (object.d == null) {
                object.d = new ArrayList();
            }
            if (ambientModeSupport$AmbientController != null && !object.d.contains(ambientModeSupport$AmbientController)) {
                object.d.add(ambientModeSupport$AmbientController);
            }
            vy.d((View)this);
        }
    }

    protected final void onConfigurationChanged(Configuration configuration) {
        Object object;
        super.onConfigurationChanged(configuration);
        this.a.e(configuration);
        if (this.z != configuration.orientation && this.E && this.a.b == 1.0f && (object = this.getParent()) instanceof AppBarLayout) {
            object = (AppBarLayout)object;
            if (object.b == 0) {
                object.b = 2;
            }
        }
        this.z = configuration.orientation;
    }

    protected final void onDetachedFromWindow() {
        Object object = this.getParent();
        AmbientModeSupport$AmbientController ambientModeSupport$AmbientController = this.F;
        if (ambientModeSupport$AmbientController != null && object instanceof AppBarLayout && (object = ((AppBarLayout)object).d) != null) {
            object.remove(ambientModeSupport$AmbientController);
        }
        super.onDetachedFromWindow();
    }

    protected final void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        int n6;
        int n7;
        super.onLayout(bl2, n2, n3, n4, n5);
        xn xn2 = this.e;
        int n8 = 0;
        if (xn2 != null) {
            int n9 = xn2.d();
            n7 = this.getChildCount();
            for (n6 = 0; n6 < n7; ++n6) {
                xn2 = this.getChildAt(n6);
                if (xn2.getFitsSystemWindows() || xn2.getTop() >= n9) continue;
                int[] nArray = wj.a;
                xn2.offsetTopAndBottom(n9);
            }
        }
        n7 = this.getChildCount();
        for (n6 = 0; n6 < n7; ++n6) {
            CollapsingToolbarLayout.g(this.getChildAt(n6)).R();
        }
        this.m(n2, n3, n4, n5, false);
        this.n();
        this.f();
        n3 = this.getChildCount();
        for (n2 = n8; n2 < n3; ++n2) {
            CollapsingToolbarLayout.g(this.getChildAt(n2)).Q();
        }
    }

    protected final void onMeasure(int n2, int n3) {
        Object object;
        this.j();
        super.onMeasure(n2, n3);
        int n4 = View.MeasureSpec.getMode((int)n3);
        xn xn2 = this.e;
        n3 = xn2 != null ? xn2.d() : 0;
        if ((n4 == 0 || this.C) && n3 > 0) {
            this.B = n3;
            super.onMeasure(n2, View.MeasureSpec.makeMeasureSpec((int)(this.getMeasuredHeight() + n3), (int)0x40000000));
        }
        if (this.E && this.a.E > 1) {
            this.n();
            this.m(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight(), true);
            object = this.a;
            n3 = object.n;
            if (n3 > 1) {
                xn2 = object.A;
                xn2.setTextSize(object.k);
                xn2.setTypeface(object.r);
                xn2.setLetterSpacing(object.D);
                this.D = Math.round(-object.A.ascent() + object.A.descent()) * (n3 - 1);
                super.onMeasure(n2, View.MeasureSpec.makeMeasureSpec((int)(this.getMeasuredHeight() + this.D), (int)0x40000000));
            } else {
                this.D = 0;
            }
        }
        if ((xn2 = this.h) != null) {
            object = this.i;
            if (object != null && object != this) {
                this.setMinimumHeight(CollapsingToolbarLayout.h(object));
                return;
            }
            this.setMinimumHeight(CollapsingToolbarLayout.h((View)xn2));
        }
    }

    protected final void onSizeChanged(int n2, int n3, int n4, int n5) {
        super.onSizeChanged(n2, n3, n4, n5);
        Drawable drawable = this.r;
        if (drawable != null) {
            this.k(drawable, n2, n3);
        }
    }

    public final void setVisibility(int n2) {
        super.setVisibility(n2);
        Drawable drawable = this.c;
        boolean bl2 = n2 == 0;
        if (drawable != null && drawable.isVisible() != bl2) {
            this.c.setVisible(bl2, false);
        }
        if ((drawable = this.r) != null && drawable.isVisible() != bl2) {
            this.r.setVisible(bl2, false);
        }
    }

    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.r || drawable == this.c;
        {
        }
    }
}

