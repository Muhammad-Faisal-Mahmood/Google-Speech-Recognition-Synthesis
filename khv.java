/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.RippleDrawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.ImageView
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.wear.ambient.AmbientDelegate;
import java.util.List;
import java.util.NoSuchElementException;

public final class khv {
    public int a;
    public final Object b;

    public khv() {
        this.b = new int[10];
    }

    public khv(ImageView imageView) {
        this.a = 0;
        this.b = imageView;
    }

    public khv(List list) {
        this.b = list;
    }

    public khv(byte[] byArray) {
        this.b = new Object[256];
    }

    public final kgy a() {
        if (this.b()) {
            Object object = this.b;
            int n2 = this.a;
            this.a = n2 + 1;
            return (kgy)object.get(n2);
        }
        throw new NoSuchElementException();
    }

    public final boolean b() {
        Object object = this.b;
        return this.a < object.size();
    }

    public final int c(int n2) {
        return ((int[])this.b)[n2];
    }

    public final int d() {
        if ((this.a & 2) != 0) {
            return ((int[])this.b)[1];
        }
        return -1;
    }

    public final boolean e(int n2) {
        return (1 << n2 & this.a) != 0;
    }

    public final void f(int n2, int n3) {
        if (n2 >= 10) {
            return;
        }
        this.a = 1 << n2 | this.a;
        ((int[])this.b)[n2] = n3;
    }

    public final void g() {
        if (((ImageView)this.b).getDrawable() != null) {
            ((ImageView)this.b).getDrawable().setLevel(this.a);
        }
    }

    public final void h() {
        Drawable drawable = ((ImageView)this.b).getDrawable();
        if (drawable != null) {
            iy.b(drawable);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i(AttributeSet object, int n2) {
        int n3;
        AmbientDelegate ambientDelegate = AmbientDelegate.A(((ImageView)this.b).getContext(), object, er.f, n3, 0);
        Object object2 = ambientDelegate.b;
        Object object3 = this.b;
        Context context = ((ImageView)object3).getContext();
        int[] nArray = er.f;
        wj.l((View)object3, context, nArray, object, (TypedArray)object2, n3, 0);
        try {
            void var1_6;
            Object object4 = object3 = ((ImageView)this.b).getDrawable();
            if (object3 == null) {
                n3 = ambientDelegate.p(1, -1);
                Object object5 = object3;
                if (n3 != -1) {
                    Object object6 = object3 = kh.g(((ImageView)this.b).getContext(), n3);
                    if (object3 != null) {
                        ((ImageView)this.b).setImageDrawable((Drawable)object3);
                        Object object7 = object3;
                    }
                }
            }
            if (var1_6 != null) {
                iy.b((Drawable)var1_6);
            }
            if (ambientDelegate.x(2)) {
                Object object8 = this.b;
                object3 = ambientDelegate.q(2);
                ((ImageView)object8).setImageTintList((ColorStateList)object3);
            }
            if (!ambientDelegate.x(3)) return;
            Object object9 = this.b;
            object3 = a.e(ambientDelegate.m(3, -1), null);
            ((ImageView)object9).setImageTintMode((PorterDuff.Mode)object3);
            return;
        }
        finally {
            ambientDelegate.v();
        }
    }

    public final void j(Drawable drawable) {
        this.a = drawable.getLevel();
    }

    public final void k(int n2) {
        if (n2 != 0) {
            Drawable drawable = kh.g(((ImageView)this.b).getContext(), n2);
            if (drawable != null) {
                iy.b(drawable);
            }
            ((ImageView)this.b).setImageDrawable(drawable);
        } else {
            ((ImageView)this.b).setImageDrawable(null);
        }
        this.h();
    }

    public final boolean l() {
        return !(((ImageView)this.b).getBackground() instanceof RippleDrawable);
    }

    public final Object m() {
        int n2 = this.a;
        if (n2 > 0) {
            Object[] objectArray = (Object[])this.b;
            Object object = objectArray[--n2];
            objectArray[n2] = null;
            this.a = n2;
            return object;
        }
        return null;
    }

    public final void n(Object object) {
        int n2 = this.a;
        if (n2 < 256) {
            ((Object[])this.b)[n2] = object;
            this.a = n2 + 1;
        }
    }
}

