/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.AnimatorInflater
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.ViewOutlineProvider
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 */
package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.LinearLayout;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class AppBarLayout
extends LinearLayout
implements rv {
    public boolean a;
    public int b = 0;
    public xn c;
    public List d;
    public boolean e;
    public boolean f;
    public final List g = new ArrayList();
    public Drawable h;
    public Integer i;
    private int j;
    private int k = -1;
    private int l = -1;
    private int m = -1;
    private boolean n;
    private int o;
    private WeakReference p;
    private final boolean q;
    private ValueAnimator r;
    private ValueAnimator.AnimatorUpdateListener s;
    private final long t;
    private final TimeInterpolator u;
    private int[] v;
    private final float w;
    private AppBarLayout$Behavior x;

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130968646);
    }

    public AppBarLayout(Context object, AttributeSet object2, int n2) {
        super(fyl.a(object, (AttributeSet)object2, n2, 2132084251), (AttributeSet)object2, n2);
        Object object3;
        object = this.getContext();
        boolean bl2 = true;
        this.setOrientation(1);
        if (this.getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            object3 = fty.a;
            this.setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        object3 = fty.a;
        Context context = this.getContext();
        object3 = fwl.c(context, (AttributeSet)object2, fty.a, n2, 2132084251);
        if (object3.hasValue(0)) {
            this.setStateListAnimator(AnimatorInflater.loadStateListAnimator((Context)context, (int)object3.getResourceId(0, 0)));
        }
        object3 = fwl.c(object, (AttributeSet)object2, ftw.a, n2, 2132084251);
        this.setBackground(object3.getDrawable(0));
        context = fvc.o(object, (TypedArray)object3, 6);
        boolean bl3 = context != null;
        this.q = bl3;
        ColorStateList colorStateList = fvc.d(this.getBackground());
        if (colorStateList != null) {
            object2 = new fxi();
            ((fxi)object2).l(colorStateList);
            if (context != null) {
                this.s = new ftk(this, colorStateList, (ColorStateList)context, (fxi)object2, fvc.k(this.getContext(), 2130968966));
                this.setBackground((Drawable)object2);
            } else {
                ((fxi)object2).i((Context)object);
                this.s = new ftl(this, (fxi)object2, 0);
                this.setBackground((Drawable)object2);
            }
        }
        this.t = fvc.p(object, 2130969602, this.getResources().getInteger(2131492866));
        this.u = fvc.t(object, 2130969620, ftf.a);
        if (object3.hasValue(4)) {
            this.p(object3.getBoolean(4, false), false, false);
        }
        if (object3.hasValue(3)) {
            fty.a((View)this, object3.getDimensionPixelSize(3, 0));
        }
        if (object3.hasValue(2)) {
            ag$$ExternalSyntheticApiModelOutline0.m(this, object3.getBoolean(2, false));
        }
        if (object3.hasValue(1)) {
            this.setTouchscreenBlocksFocus(object3.getBoolean(1, false));
        }
        this.w = this.getResources().getDimension(2131165453);
        this.f = object3.getBoolean(5, false);
        this.o = object3.getResourceId(7, -1);
        object = this.h;
        context = object3.getDrawable(8);
        if (object != context) {
            object2 = null;
            if (object != null) {
                object.setCallback(null);
            }
            object = context != null ? context.mutate() : null;
            this.h = object;
            if (object instanceof fxi) {
                object = ((fxi)object).g;
            } else {
                context = fvc.d((Drawable)object);
                object = object2;
                if (context != null) {
                    object = context.getDefaultColor();
                }
            }
            this.i = object;
            object = this.h;
            if (object != null) {
                if (object.isStateful()) {
                    this.h.setState(this.getDrawableState());
                }
                this.h.setLayoutDirection(this.getLayoutDirection());
                object = this.h;
                bl3 = this.getVisibility() == 0 ? bl2 : false;
                object.setVisible(bl3, false);
                this.h.setCallback((Drawable.Callback)this);
            }
            this.k();
            this.postInvalidateOnAnimation();
        }
        object3.recycle();
        wa.k((View)this, new bon((ViewGroup)this, 2));
        return;
        finally {
            object3.recycle();
        }
    }

    protected static final ftp n(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new ftp((LinearLayout.LayoutParams)layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new ftp((ViewGroup.MarginLayoutParams)layoutParams);
        }
        return new ftp(layoutParams);
    }

    private final void o() {
        fto fto2;
        AppBarLayout$Behavior appBarLayout$Behavior = this.x;
        fto fto3 = fto2 = null;
        if (appBarLayout$Behavior != null) {
            fto3 = fto2;
            if (this.k != -1) {
                fto3 = this.b != 0 ? fto2 : appBarLayout$Behavior.L(yq.c, this);
            }
        }
        this.k = -1;
        this.l = -1;
        this.m = -1;
        if (fto3 != null) {
            this.x.N(fto3, false);
        }
    }

    private final void p(boolean bl2, boolean bl3, boolean bl4) {
        int n2 = true != bl2 ? 2 : 1;
        int n3 = 0;
        int n4 = true != bl3 ? 0 : 4;
        if (bl4) {
            n3 = 8;
        }
        this.b = n2 | n4 | n3;
        this.requestLayout();
    }

    private final void q(float f2, float f3) {
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.r = valueAnimator = ValueAnimator.ofFloat((float[])new float[]{f2, f3});
        valueAnimator.setDuration(this.t);
        this.r.setInterpolator(this.u);
        valueAnimator = this.s;
        if (valueAnimator != null) {
            this.r.addUpdateListener((ValueAnimator.AnimatorUpdateListener)valueAnimator);
        }
        this.r.start();
    }

    private final boolean r() {
        return this.h != null && this.e() > 0;
    }

    private final boolean s() {
        View view;
        return this.getChildCount() > 0 && (view = this.getChildAt(0)).getVisibility() != 8 && !view.getFitsSystemWindows();
    }

    @Override
    public final rw a() {
        AppBarLayout$Behavior appBarLayout$Behavior;
        this.x = appBarLayout$Behavior = new AppBarLayout$Behavior();
        return appBarLayout$Behavior;
    }

    /*
     * Unable to fully structure code
     */
    public final int b() {
        var1_1 = this.l;
        if (var1_1 != -1) {
            return var1_1;
        }
        var2_3 = 0;
        for (var3_2 = this.getChildCount() - 1; var3_2 >= 0; --var3_2) {
            var7_7 = this.getChildAt(var3_2);
            var1_1 = var2_3;
            if (var7_7.getVisibility() != 8) {
                var6_6 = (ftp)var7_7.getLayoutParams();
                var5_5 = var7_7.getMeasuredHeight();
                var1_1 = var6_6.a;
                if ((var1_1 & 5) == 5) {
                    var4_4 = var6_6.topMargin + var6_6.bottomMargin;
                    if ((var1_1 & 8) != 0) {
                        var1_1 = var7_7.getMinimumHeight();
lbl16:
                        // 2 sources

                        while (true) {
                            var1_1 = var4_4 + var1_1;
                            break;
                        }
                    } else {
                        if ((var1_1 & 2) != 0) {
                            var1_1 = var5_5 - var7_7.getMinimumHeight();
                            ** continue;
                        }
                        var1_1 = var4_4 + var5_5;
                    }
                    var4_4 = var1_1;
                    if (var3_2 == 0) {
                        var4_4 = var1_1;
                        if (var7_7.getFitsSystemWindows()) {
                            var4_4 = Math.min(var1_1, var5_5 - this.e());
                        }
                    }
                    var1_1 = var2_3 + var4_4;
                } else {
                    var1_1 = var2_3;
                    if (var2_3 > 0) break;
                }
            }
            var2_3 = var1_1;
        }
        this.l = var1_1 = Math.max(0, var2_3);
        return var1_1;
    }

    final int c() {
        int n2;
        int n3 = this.m;
        if (n3 != -1) {
            return n3;
        }
        int n4 = this.getChildCount();
        int n5 = 0;
        n3 = 0;
        while (true) {
            n2 = n3;
            if (n5 >= n4) break;
            View view = this.getChildAt(n5);
            n2 = n3;
            if (view.getVisibility() != 8) {
                ftp ftp2 = (ftp)view.getLayoutParams();
                int n6 = view.getMeasuredHeight();
                int n7 = ftp2.topMargin;
                int n8 = ftp2.bottomMargin;
                int n9 = ftp2.a;
                n2 = n3;
                if ((n9 & 1) == 0) break;
                n2 = n3 += n6 + (n7 + n8);
                if ((n9 & 2) != 0) {
                    n2 = n3 - view.getMinimumHeight();
                    break;
                }
            }
            ++n5;
            n3 = n2;
        }
        this.m = n3 = Math.max(0, n2);
        return n3;
    }

    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ftp;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int d() {
        int n2 = this.e();
        int n3 = this.getMinimumHeight();
        if (n3 != 0) {
            return n3 + n3 + n2;
        }
        n3 = this.getChildCount();
        n3 = n3 > 0 ? this.getChildAt(n3 - 1).getMinimumHeight() : 0;
        if (n3 == 0) return this.getHeight() / 3;
        return n3 + n3 + n2;
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.r()) {
            int n2 = canvas.save();
            canvas.translate(0.0f, (float)(-this.j));
            this.h.draw(canvas);
            canvas.restoreToCount(n2);
        }
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] nArray = this.getDrawableState();
        Drawable drawable = this.h;
        if (drawable != null && drawable.isStateful() && drawable.setState(nArray)) {
            this.invalidateDrawable(drawable);
        }
    }

    final int e() {
        xn xn2 = this.c;
        if (xn2 != null) {
            return xn2.d();
        }
        return 0;
    }

    public final int f() {
        int n2;
        int n3 = this.k;
        if (n3 != -1) {
            return n3;
        }
        int n4 = this.getChildCount();
        n3 = 0;
        int n5 = 0;
        while (true) {
            n2 = n5;
            if (n3 >= n4) break;
            View view = this.getChildAt(n3);
            int n6 = n3;
            n2 = n5;
            if (view.getVisibility() != 8) {
                ftp ftp2 = (ftp)view.getLayoutParams();
                n6 = view.getMeasuredHeight();
                int n7 = ftp2.a;
                n2 = n5;
                if ((n7 & 1) == 0) break;
                n6 = n5 + (n6 + ftp2.topMargin + ftp2.bottomMargin);
                n2 = n3;
                n5 = n6;
                if (n3 == 0) {
                    n5 = n6;
                    if (view.getFitsSystemWindows()) {
                        n5 = n6 - this.e();
                    }
                    n2 = 0;
                }
                n6 = n2;
                n2 = n5;
                if ((n7 & 2) != 0) {
                    n2 = n5 - view.getMinimumHeight();
                    break;
                }
            }
            n3 = n6 + 1;
            n5 = n2;
        }
        this.k = n3 = Math.max(0, n2);
        return n3;
    }

    public final ftp g(AttributeSet attributeSet) {
        return new ftp(this.getContext(), attributeSet);
    }

    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ftp();
    }

    protected final /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new ftp();
    }

    final void h(int n2) {
        Object object;
        this.j = n2;
        if (!this.willNotDraw()) {
            this.postInvalidateOnAnimation();
        }
        if ((object = this.d) != null) {
            int n3 = object.size();
            for (int i2 = 0; i2 < n3; ++i2) {
                float f2;
                int n4;
                int n5;
                object = (AmbientModeSupport$AmbientController)this.d.get(i2);
                if (object == null) continue;
                Object object2 = (CollapsingToolbarLayout)((Object)((AmbientModeSupport$AmbientController)object).a);
                ((CollapsingToolbarLayout)((Object)object2)).d = n2;
                object2 = ((CollapsingToolbarLayout)((Object)object2)).e;
                int n6 = object2 != null ? ((xn)object2).d() : 0;
                int n7 = ((CollapsingToolbarLayout)((Object)((AmbientModeSupport$AmbientController)object).a)).getChildCount();
                for (n5 = 0; n5 < n7; ++n5) {
                    View view = ((CollapsingToolbarLayout)((Object)((AmbientModeSupport$AmbientController)object).a)).getChildAt(n5);
                    object2 = (fts)view.getLayoutParams();
                    hvz hvz2 = CollapsingToolbarLayout.g(view);
                    n4 = ((fts)((Object)object2)).a;
                    if (n4 != 1) {
                        if (n4 != 2) continue;
                        n4 = -n2;
                        f2 = ((fts)((Object)object2)).b;
                        hvz2.S(Math.round((float)n4 * f2));
                        continue;
                    }
                    hvz2.S(rw.z(-n2, 0, ((CollapsingToolbarLayout)((Object)((AmbientModeSupport$AmbientController)object).a)).a(view)));
                }
                ((CollapsingToolbarLayout)((Object)((AmbientModeSupport$AmbientController)object).a)).f();
                object2 = (CollapsingToolbarLayout)((Object)((AmbientModeSupport$AmbientController)object).a);
                if (((CollapsingToolbarLayout)((Object)object2)).c != null && n6 > 0) {
                    object2.postInvalidateOnAnimation();
                }
                object2 = (CollapsingToolbarLayout)((Object)((AmbientModeSupport$AmbientController)object).a);
                n7 = object2.getHeight();
                n4 = object2.getMinimumHeight();
                n5 = ((CollapsingToolbarLayout)((Object)((AmbientModeSupport$AmbientController)object).a)).b();
                object2 = ((AmbientModeSupport$AmbientController)object).a;
                n6 = n7 - n4 - n6;
                float f3 = n7 - n5;
                f2 = n6;
                f3 = Math.min(1.0f, f3 / f2);
                object2 = ((CollapsingToolbarLayout)((Object)object2)).a;
                ((fwe)object2).d = f3;
                ((fwe)object2).e = ((fwe)object2).a();
                object = (CollapsingToolbarLayout)((Object)((AmbientModeSupport$AmbientController)object).a);
                n5 = ((CollapsingToolbarLayout)((Object)object)).d;
                object = ((CollapsingToolbarLayout)((Object)object)).a;
                ((fwe)object).f = n5 + n6;
                f2 = rw.A((float)Math.abs(n2) / f2, 1.0f);
                if (f2 == ((fwe)object).b) continue;
                ((fwe)object).b = f2;
                ((fwe)object).c();
            }
        }
    }

    public final void i(boolean bl2) {
        this.j(bl2, this.isLaidOut());
    }

    public final void j(boolean bl2, boolean bl3) {
        this.p(bl2, bl3, true);
    }

    public final void k() {
        this.setWillNotDraw(this.r() ^ true);
    }

    final boolean l(boolean bl2) {
        boolean bl3;
        if (this.e != bl2) {
            boolean bl4;
            this.e = bl2;
            this.refreshDrawableState();
            boolean bl5 = this.getBackground() instanceof fxi;
            bl3 = bl4 = true;
            if (bl5) {
                bl3 = this.q;
                float f2 = 0.0f;
                float f3 = 0.0f;
                if (bl3) {
                    float f4 = true != bl2 ? 1.0f : 0.0f;
                    f2 = true != bl2 ? f3 : 1.0f;
                    this.q(f4, f2);
                    bl3 = bl4;
                } else {
                    bl3 = bl4;
                    if (this.f) {
                        float f5 = bl2 ? 0.0f : this.w;
                        if (bl2) {
                            f2 = this.w;
                        }
                        this.q(f5, f2);
                        bl3 = bl4;
                    }
                }
            }
        } else {
            bl3 = false;
        }
        return bl3;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final boolean m(View object) {
        void var1_3;
        boolean bl2;
        void var5_11;
        WeakReference weakReference;
        int n2;
        WeakReference weakReference2 = this.p;
        Object var7_12 = null;
        if (weakReference2 == null && (n2 = this.o) != -1) {
            void var5_7;
            if (object != null) {
                View view = object.findViewById(n2);
            } else {
                Object var5_6 = null;
            }
            weakReference = var5_7;
            if (var5_7 == null) {
                weakReference = var5_7;
                if (this.getParent() instanceof ViewGroup) {
                    weakReference = ((ViewGroup)this.getParent()).findViewById(this.o);
                }
            }
            if (weakReference != null) {
                this.p = new WeakReference<WeakReference>(weakReference);
            }
        }
        weakReference = this.p;
        Object var5_9 = var7_12;
        if (weakReference != null) {
            View view = (View)weakReference.get();
        }
        if (var5_11 != null) {
            void var1_2 = var5_11;
        }
        boolean bl3 = bl2 = false;
        if (var1_3 == null) return bl3;
        if (var1_3.canScrollVertically(-1)) return true;
        if (var1_3.getScrollY() > 0) return true;
        return bl2;
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fxf.c((View)this);
    }

    protected final int[] onCreateDrawableState(int n2) {
        if (this.v == null) {
            this.v = new int[4];
        }
        int[] nArray = this.v;
        int n3 = nArray.length;
        int[] nArray2 = super.onCreateDrawableState(n2 + 4);
        boolean bl2 = this.n;
        n2 = true != bl2 ? -2130969898 : 2130969898;
        int n4 = 0;
        nArray[0] = n2;
        n2 = -2130969899;
        if (bl2) {
            if (this.e) {
                n2 = 2130969899;
            }
            n3 = 1;
        } else {
            n3 = 0;
            n4 = 1;
        }
        nArray[1] = n2;
        n2 = 1 != n4 ? 2130969894 : -2130969894;
        nArray[2] = n2;
        n2 = n4 = -2130969893;
        if (n3 != 0) {
            n2 = n4;
            if (this.e) {
                n2 = 2130969893;
            }
        }
        nArray[3] = n2;
        return AppBarLayout.mergeDrawableStates((int[])nArray2, (int[])nArray);
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.p;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.p = null;
    }

    protected final void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        View view;
        super.onLayout(bl2, n2, n3, n4, n5);
        if (this.getFitsSystemWindows() && this.s()) {
            n3 = this.e();
            n2 = this.getChildCount();
            while (--n2 >= 0) {
                view = this.getChildAt(n2);
                int[] nArray = wj.a;
                view.offsetTopAndBottom(n3);
            }
        }
        this.o();
        boolean bl3 = false;
        this.a = false;
        n3 = this.getChildCount();
        for (n2 = 0; n2 < n3; ++n2) {
            if (((ftp)this.getChildAt((int)n2).getLayoutParams()).b == null) continue;
            this.a = true;
            break;
        }
        if ((view = this.h) != null) {
            view.setBounds(0, 0, this.getWidth(), this.e());
        }
        if (!this.f) {
            n3 = this.getChildCount();
            n2 = 0;
            while (true) {
                bl2 = bl3;
                if (n2 < n3) {
                    n4 = ((ftp)this.getChildAt((int)n2).getLayoutParams()).a;
                    if ((n4 & 1) == 1 && (n4 & 0xA) != 0) break;
                    ++n2;
                    continue;
                }
                break;
            }
        } else {
            bl2 = true;
        }
        if (this.n != bl2) {
            this.n = bl2;
            this.refreshDrawableState();
        }
    }

    protected final void onMeasure(int n2, int n3) {
        super.onMeasure(n2, n3);
        int n4 = View.MeasureSpec.getMode((int)n3);
        if (n4 != 0x40000000 && this.getFitsSystemWindows() && this.s()) {
            n2 = this.getMeasuredHeight();
            if (n4 != Integer.MIN_VALUE) {
                if (n4 == 0) {
                    n2 += this.e();
                }
            } else {
                n2 = rw.z(this.getMeasuredHeight() + this.e(), 0, View.MeasureSpec.getSize((int)n3));
            }
            this.setMeasuredDimension(this.getMeasuredWidth(), n2);
        }
        this.o();
    }

    public final void setElevation(float f2) {
        super.setElevation(f2);
        fxf.b((View)this, f2);
    }

    public final void setOrientation(int n2) {
        if (n2 == 1) {
            super.setOrientation(1);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public final void setVisibility(int n2) {
        super.setVisibility(n2);
        Drawable drawable = this.h;
        if (drawable != null) {
            boolean bl2 = n2 == 0;
            drawable.setVisible(bl2, false);
        }
    }

    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.h;
        {
        }
    }
}

