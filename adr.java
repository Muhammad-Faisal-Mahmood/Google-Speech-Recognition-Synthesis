/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources$NotFoundException
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.util.SparseBooleanArray
 *  android.view.View
 *  android.widget.CheckedTextView
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.wear.ambient.AmbientDelegate;

public final class adr {
    public boolean a;
    private final Object b;

    public adr() {
        this.b = new SparseBooleanArray();
    }

    public adr(CheckedTextView checkedTextView) {
        this.b = checkedTextView;
    }

    public final ads a() {
        abr.f(this.a ^ true);
        this.a = true;
        return new ads((SparseBooleanArray)this.b);
    }

    public final void b(int n2) {
        abr.f(this.a ^ true);
        ((SparseBooleanArray)this.b).append(n2, true);
    }

    public final void c() {
        ((CheckedTextView)this.b).getCheckMarkDrawable();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(AttributeSet object) {
        AmbientDelegate ambientDelegate = AmbientDelegate.A(((CheckedTextView)this.b).getContext(), object, er.l, 2130968822, 0);
        Object object2 = ambientDelegate.b;
        Object object3 = this.b;
        Context context = ((CheckedTextView)object3).getContext();
        int[] nArray = er.l;
        wj.l((View)object3, context, nArray, object, (TypedArray)object2, 2130968822, 0);
        try {
            block8: {
                int n2;
                if (ambientDelegate.x(1) && (n2 = ambientDelegate.p(1, 0)) != 0) {
                    try {
                        Object object4 = this.b;
                        Drawable drawable = kh.g(((CheckedTextView)object4).getContext(), n2);
                        ((CheckedTextView)object4).setCheckMarkDrawable(drawable);
                        break block8;
                    }
                    catch (Resources.NotFoundException notFoundException) {}
                }
                if (ambientDelegate.x(0) && (n2 = ambientDelegate.p(0, 0)) != 0) {
                    Object object5 = this.b;
                    Drawable drawable = kh.g(((CheckedTextView)object5).getContext(), n2);
                    ((CheckedTextView)object5).setCheckMarkDrawable(drawable);
                }
            }
            if (ambientDelegate.x(2)) {
                Object object6 = this.b;
                ColorStateList colorStateList = ambientDelegate.q(2);
                ((CheckedTextView)object6).setCheckMarkTintList(colorStateList);
            }
            if (!ambientDelegate.x(3)) return;
            Object object7 = this.b;
            PorterDuff.Mode mode = a.e(ambientDelegate.m(3, -1), null);
            ((CheckedTextView)object7).setCheckMarkTintMode(mode);
            return;
        }
        finally {
            ambientDelegate.v();
        }
    }
}

