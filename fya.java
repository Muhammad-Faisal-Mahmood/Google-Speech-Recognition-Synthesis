/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.GradientDrawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.widget.FrameLayout
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class fya
extends FrameLayout {
    private static final View.OnTouchListener b = new fxz();
    fxm a;
    private final float c;
    private final int d;
    private ColorStateList e;
    private PorterDuff.Mode f;

    protected fya(Context context) {
        this(context, null);
    }

    protected fya(Context object, AttributeSet attributeSet) {
        super(fyl.a((Context)object, attributeSet, 0, 0), attributeSet);
        float f2;
        object = this.getContext();
        TypedArray typedArray = object.obtainStyledAttributes(attributeSet, fyc.a);
        if (typedArray.hasValue(6)) {
            wa.j((View)this, typedArray.getDimensionPixelSize(6, 0));
        }
        typedArray.getInt(2, 0);
        if (typedArray.hasValue(8) || typedArray.hasValue(9)) {
            this.a = new fxm(fxm.f((Context)object, attributeSet, 0, 0));
        }
        this.c = f2 = typedArray.getFloat(3, 1.0f);
        this.setBackgroundTintList(fvc.o((Context)object, typedArray, 4));
        this.setBackgroundTintMode(a.e(typedArray.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        typedArray.getFloat(1, 1.0f);
        this.d = typedArray.getDimensionPixelSize(0, -1);
        typedArray.getDimensionPixelSize(7, -1);
        typedArray.recycle();
        this.setOnTouchListener(b);
        this.setFocusable(true);
        if (this.getBackground() == null) {
            int n2 = fvc.i(fvc.h((View)this, 2130968966), fvc.h((View)this, 2130968924), f2);
            object = this.a;
            if (object != null) {
                int n3 = fyb.a;
                object = new fxi((fxm)object);
                ((fxi)object).l(ColorStateList.valueOf((int)n2));
            } else {
                object = this.getResources();
                int n4 = fyb.a;
                f2 = object.getDimension(2131166517);
                object = new GradientDrawable();
                object.setShape(0);
                object.setCornerRadius(f2);
                object.setColor(n2);
            }
            attributeSet = this.e;
            if (attributeSet != null) {
                object.setTintList((ColorStateList)attributeSet);
            }
            this.setBackgroundDrawable((Drawable)object);
        }
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        vy.d((View)this);
    }

    protected void onMeasure(int n2, int n3) {
        int n4;
        super.onMeasure(n2, n3);
        if (this.d > 0 && (n4 = this.getMeasuredWidth()) > (n2 = this.d)) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int)n2, (int)0x40000000), n3);
        }
    }

    public final void setBackground(Drawable drawable) {
        this.setBackgroundDrawable(drawable);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        Drawable drawable2 = drawable;
        if (drawable != null) {
            drawable2 = drawable;
            if (this.e != null) {
                drawable2 = drawable.mutate();
                drawable2.setTintList(this.e);
                drawable2.setTintMode(this.f);
            }
        }
        super.setBackgroundDrawable(drawable2);
    }

    public final void setBackgroundTintList(ColorStateList colorStateList) {
        this.e = colorStateList;
        if (this.getBackground() != null) {
            Drawable drawable = this.getBackground().mutate();
            drawable.setTintList(colorStateList);
            drawable.setTintMode(this.f);
            if (drawable != this.getBackground()) {
                super.setBackgroundDrawable(drawable);
            }
        }
    }

    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f = mode;
        if (this.getBackground() != null) {
            Drawable drawable = this.getBackground().mutate();
            drawable.setTintMode(mode);
            if (drawable != this.getBackground()) {
                super.setBackgroundDrawable(drawable);
            }
        }
    }

    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            layoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
            new Rect(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
        }
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        View.OnTouchListener onTouchListener = onClickListener != null ? null : b;
        this.setOnTouchListener(onTouchListener);
        super.setOnClickListener(onClickListener);
    }
}

