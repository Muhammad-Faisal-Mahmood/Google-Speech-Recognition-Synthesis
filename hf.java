/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 */
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.wear.ambient.AmbientDelegate;

public final class hf {
    public lw a;
    private final View b;
    private final hj c;
    private int d = -1;
    private lw e;
    private lw f;

    public hf(View view) {
        this.b = view;
        this.c = hj.d();
    }

    public final void a() {
        Drawable drawable = this.b.getBackground();
        if (drawable != null) {
            lw lw2;
            if (this.e != null) {
                if (this.f == null) {
                    this.f = new lw();
                }
                lw2 = this.f;
                lw2.a = null;
                lw2.d = false;
                lw2.b = null;
                lw2.c = false;
                ColorStateList colorStateList = wa.c(this.b);
                if (colorStateList != null) {
                    lw2.d = true;
                    lw2.a = colorStateList;
                }
                if ((colorStateList = wa.d(this.b)) != null) {
                    lw2.c = true;
                    lw2.b = colorStateList;
                }
                if (lw2.d || lw2.c) {
                    lj.g(drawable, lw2, this.b.getDrawableState());
                    return;
                }
            }
            if ((lw2 = this.a) != null) {
                lj.g(drawable, lw2, this.b.getDrawableState());
                return;
            }
            lw2 = this.e;
            if (lw2 != null) {
                lj.g(drawable, lw2, this.b.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int n2) {
        AmbientDelegate ambientDelegate = AmbientDelegate.A(this.b.getContext(), attributeSet, er.z, n2, 0);
        Object object = ambientDelegate.b;
        View view = this.b;
        wj.l(view, view.getContext(), er.z, attributeSet, (TypedArray)object, n2, 0);
        try {
            if (ambientDelegate.x(0)) {
                this.d = ambientDelegate.p(0, -1);
                attributeSet = this.c.a(this.b.getContext(), this.d);
                if (attributeSet != null) {
                    this.d((ColorStateList)attributeSet);
                }
            }
            if (ambientDelegate.x(1)) {
                wa.h(this.b, ambientDelegate.q(1));
            }
            if (ambientDelegate.x(2)) {
                wa.i(this.b, a.e(ambientDelegate.m(2, -1), null));
            }
            return;
        }
        finally {
            ambientDelegate.v();
        }
    }

    public final void c(int n2) {
        this.d = n2;
        hj hj2 = this.c;
        hj2 = hj2 != null ? hj2.a(this.b.getContext(), n2) : null;
        this.d((ColorStateList)hj2);
        this.a();
    }

    final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.e == null) {
                this.e = new lw();
            }
            lw lw2 = this.e;
            lw2.a = colorStateList;
            lw2.d = true;
        } else {
            this.e = null;
        }
        this.a();
    }

    public final void e() {
        this.d = -1;
        this.d(null);
        this.a();
    }
}

