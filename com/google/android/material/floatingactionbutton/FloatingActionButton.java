/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.LayerDrawable
 *  android.graphics.drawable.RippleDrawable
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.MotionEvent
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 */
package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import com.google.android.material.floatingactionbutton.FloatingActionButton$Behavior;

public class FloatingActionButton
extends fwq
implements fxx,
rv {
    public int a;
    public boolean b;
    public final Rect c = new Rect();
    private ColorStateList e;
    private PorterDuff.Mode f;
    private ColorStateList g;
    private int h;
    private int i;
    private int j;
    private int k;
    private final Rect l = new Rect();
    private final fvf m;
    private fvx n;
    private final khv o;

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969214);
    }

    public FloatingActionButton(Context object, AttributeSet attributeSet, int n2) {
        super(fyl.a(object, attributeSet, n2, 2132084255), attributeSet, n2);
        int n3;
        Object object2 = this.getContext();
        object = fwl.c(object2, attributeSet, fwa.b, n2, 2132084255);
        this.e = fvc.o(object2, (TypedArray)object, 1);
        this.f = a.e(object.getInt(2, -1), null);
        this.g = fvc.o(object2, (TypedArray)object, 12);
        this.i = object.getInt(7, -1);
        this.j = object.getDimensionPixelSize(6, 0);
        this.h = object.getDimensionPixelSize(3, 0);
        float f2 = object.getDimension(4, 0.0f);
        float f3 = object.getDimension(9, 0.0f);
        float f4 = object.getDimension(11, 0.0f);
        this.b = object.getBoolean(16, false);
        int n4 = this.getResources().getDimensionPixelSize(2131166435);
        this.k = n3 = object.getDimensionPixelSize(10, 0);
        Object object3 = this.i();
        if (((fvx)object3).z != n3) {
            ((fvx)object3).z = n3;
            ((fvx)object3).j();
        }
        object3 = fti.a(object2, (TypedArray)object, 15);
        fti fti2 = fti.a(object2, (TypedArray)object, 8);
        object2 = new fxm(fxm.g(object2, attributeSet, n2, 2132084255, fxm.a));
        boolean bl2 = object.getBoolean(5, false);
        this.setEnabled(object.getBoolean(0, true));
        object.recycle();
        object = new khv((ImageView)this);
        this.o = object;
        object.i(attributeSet, n2);
        this.m = new fvf(this);
        this.i().i((fxm)object2);
        object2 = this.i();
        object = this.e;
        Object object4 = this.f;
        attributeSet = this.g;
        int n5 = this.h;
        object2 = (fvz)object2;
        Object object5 = object2.l;
        a.Y(object5);
        object2.m = new fvy((fxm)object5);
        object2.m.setTintList((ColorStateList)object);
        if (object4 != null) {
            object2.m.setTintMode((PorterDuff.Mode)object4);
        }
        object2.m.i(object2.B.getContext());
        if (n5 > 0) {
            object4 = object2.B.getContext();
            object5 = object2.l;
            a.Y(object5);
            object5 = new fvh((fxm)object5);
            n3 = object4.getColor(2131099917);
            int n6 = object4.getColor(2131099916);
            n2 = object4.getColor(2131099914);
            int n7 = object4.getColor(2131099915);
            ((fvh)((Object)object5)).c = n3;
            ((fvh)((Object)object5)).d = n6;
            ((fvh)((Object)object5)).e = n2;
            ((fvh)((Object)object5)).f = n7;
            float f5 = ((fvh)((Object)object5)).b;
            float f6 = n5;
            if (f5 != f6) {
                ((fvh)((Object)object5)).b = f6;
                ((fvh)((Object)object5)).a.setStrokeWidth(f6 * 1.3333f);
                ((fvh)((Object)object5)).g = true;
                object5.invalidateSelf();
            }
            ((fvh)((Object)object5)).b((ColorStateList)object);
            object2.o = object5;
            object = object2.o;
            a.Y(object);
            object4 = object2.m;
            a.Y(object4);
            object = new LayerDrawable(new Drawable[]{object, object4});
        } else {
            object2.o = null;
            object = object2.m;
        }
        object2.p = object2.n = new RippleDrawable(fwx.a((ColorStateList)attributeSet), (Drawable)object, null);
        this.i().u = n4;
        object = this.i();
        if (object.r != f2) {
            object.r = f2;
            object.g(f2, object.s, object.t);
        }
        object = this.i();
        if (object.s != f3) {
            object.s = f3;
            object.g(object.r, f3, object.t);
        }
        object = this.i();
        if (object.t != f4) {
            object.t = f4;
            object.g(object.r, object.s, f4);
        }
        this.i().w = object3;
        this.i().x = fti2;
        this.i().q = bl2;
        this.setScaleType(ImageView.ScaleType.MATRIX);
    }

    public static /* synthetic */ void d(FloatingActionButton floatingActionButton, Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    private final int h(int n2) {
        int n3 = this.j;
        if (n3 != 0) {
            return n3;
        }
        Resources resources = this.getResources();
        if (n2 != -1) {
            if (n2 != 1) {
                return resources.getDimensionPixelSize(2131165473);
            }
            return resources.getDimensionPixelSize(2131165472);
        }
        n2 = Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? this.h(1) : this.h(0);
        return n2;
    }

    private final fvx i() {
        if (this.n == null) {
            this.n = new fvz(this, new AmbientModeSupport$AmbientController(this));
        }
        return this.n;
    }

    @Override
    public final rw a() {
        return new FloatingActionButton$Behavior();
    }

    public final int b() {
        return this.h(this.i);
    }

    @Override
    public final void c(fxm fxm2) {
        this.i().i(fxm2);
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        this.i();
        this.getDrawableState();
    }

    final void e() {
        fvx fvx2 = this.i();
        if (!(fvx2.B.getVisibility() != 0 ? fvx2.A == 2 : fvx2.A != 1)) {
            return;
        }
        Object object = fvx2.v;
        if (object != null) {
            object.cancel();
        }
        if (fvx2.n()) {
            object = fvx2.x;
            object = object != null ? fvx2.c((fti)object, 0.0f, 0.0f, 0.0f) : fvx2.d(0.0f, 0.4f, 0.4f, fvx.d, fvx.e);
            object.addListener((Animator.AnimatorListener)new fvn(fvx2));
            object.start();
            return;
        }
        fvx2.B.g(4, false);
    }

    final void f() {
        fvx fvx2 = this.i();
        if (!(fvx2.B.getVisibility() == 0 ? fvx2.A == 1 : fvx2.A != 2)) {
            return;
        }
        Object object = fvx2.v;
        if (object != null) {
            object.cancel();
        }
        object = fvx2.w;
        if (fvx2.n()) {
            if (fvx2.B.getVisibility() != 0) {
                FloatingActionButton floatingActionButton = fvx2.B;
                float f2 = 0.0f;
                floatingActionButton.setAlpha(0.0f);
                floatingActionButton = fvx2.B;
                if (object == null) {
                    f2 = 0.4f;
                }
                floatingActionButton.setScaleY(f2);
                fvx2.B.setScaleX(f2);
                fvx2.h(f2);
            }
            object = (object = fvx2.w) != null ? fvx2.c((fti)object, 1.0f, 1.0f, 1.0f) : fvx2.d(1.0f, 1.0f, 1.0f, fvx.b, fvx.c);
            object.addListener((Animator.AnimatorListener)new fvo(fvx2));
            object.start();
            return;
        }
        fvx2.B.g(0, false);
        fvx2.B.setAlpha(1.0f);
        fvx2.B.setScaleY(1.0f);
        fvx2.B.setScaleX(1.0f);
        fvx2.h(1.0f);
    }

    public final CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    public final ColorStateList getBackgroundTintList() {
        return this.e;
    }

    public final PorterDuff.Mode getBackgroundTintMode() {
        return this.f;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.i();
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fvx fvx2 = this.i();
        fxi fxi2 = fvx2.m;
        if (fxi2 != null) {
            fxf.d((View)fvx2.B, fxi2);
        }
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fvx fvx2 = this.i();
        fvx2.B.getViewTreeObserver();
        fvx2 = fvx2.C;
    }

    protected final void onMeasure(int n2, int n3) {
        int n4 = this.b();
        this.a = (n4 - this.k) / 2;
        this.i().k();
        n2 = Math.min(View.resolveSize((int)n4, (int)n2), View.resolveSize((int)n4, (int)n3));
        this.setMeasuredDimension(this.c.left + n2 + this.c.right, n2 + this.c.top + this.c.bottom);
    }

    protected final void onRestoreInstanceState(Parcelable object) {
        if (!(object instanceof fye)) {
            super.onRestoreInstanceState(object);
            return;
        }
        fye fye2 = (fye)object;
        super.onRestoreInstanceState(fye2.d);
        object = this.m;
        fye2 = (Bundle)fye2.a.get("expandableWidgetHelper");
        a.Y(fye2);
        object.b = fye2.getBoolean("expanded", false);
        object.c = fye2.getInt("expandedComponentIdHint", 0);
        if (object.b && (fye2 = object.a.getParent()) instanceof CoordinatorLayout) {
            ((CoordinatorLayout)((Object)fye2)).b(object.a);
        }
    }

    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelable;
        Parcelable parcelable2 = parcelable = super.onSaveInstanceState();
        if (parcelable == null) {
            parcelable2 = new Bundle();
        }
        parcelable = new fye(parcelable2);
        pa pa2 = parcelable.a;
        fvf fvf2 = this.m;
        parcelable2 = new Bundle();
        parcelable2.putBoolean("expanded", fvf2.b);
        parcelable2.putInt("expandedComponentIdHint", fvf2.c);
        pa2.put("expandableWidgetHelper", parcelable2);
        return parcelable;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.l;
            rect.set(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
            Rect rect2 = this.c;
            rect.left += rect2.left;
            rect2 = this.c;
            rect.top += rect2.top;
            rect2 = this.c;
            rect.right -= rect2.right;
            rect2 = this.c;
            rect.bottom -= rect2.bottom;
            int n2 = -this.n.b();
            rect.inset(n2, n2);
            if (!this.l.contains((int)motionEvent.getX(), (int)motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setBackgroundColor(int n2) {
        Log.i((String)"FloatingActionButton", (String)"Setting a custom background is not supported.");
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        Log.i((String)"FloatingActionButton", (String)"Setting a custom background is not supported.");
    }

    public final void setBackgroundResource(int n2) {
        Log.i((String)"FloatingActionButton", (String)"Setting a custom background is not supported.");
    }

    public final void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            fvx fvx2 = this.i();
            Drawable drawable = fvx2.m;
            if (drawable != null) {
                drawable.setTintList(colorStateList);
            }
            if ((drawable = fvx2.o) != null) {
                drawable.b(colorStateList);
            }
        }
    }

    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            fxi fxi2 = this.i().m;
            if (fxi2 != null) {
                fxi2.setTintMode(mode);
            }
        }
    }

    public final void setElevation(float f2) {
        super.setElevation(f2);
        this.i().l(f2);
    }

    public final void setImageDrawable(Drawable drawable) {
        if (this.getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            this.i().j();
        }
    }

    public final void setImageResource(int n2) {
        this.o.k(n2);
        Drawable drawable = this.getDrawable();
        if (drawable == null) {
            return;
        }
        drawable.clearColorFilter();
    }

    public final void setScaleX(float f2) {
        super.setScaleX(f2);
        this.i();
    }

    public final void setScaleY(float f2) {
        super.setScaleY(f2);
        this.i();
    }

    public final void setTranslationX(float f2) {
        super.setTranslationX(f2);
        this.i();
    }

    public final void setTranslationY(float f2) {
        super.setTranslationY(f2);
        this.i();
    }

    public final void setTranslationZ(float f2) {
        super.setTranslationZ(f2);
        this.i();
    }
}

