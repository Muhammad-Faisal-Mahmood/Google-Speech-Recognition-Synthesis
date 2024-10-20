/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources$NotFoundException
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.CompoundButton
 */
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import androidx.wear.ambient.AmbientDelegate;

public final class hi {
    public PorterDuff.Mode a = null;
    public boolean b = false;
    public boolean c = false;
    private final CompoundButton d;
    private boolean e;

    public hi(CompoundButton compoundButton) {
        this.d = compoundButton;
    }

    public final void a() {
        Drawable drawable = this.d.getButtonDrawable();
        if (drawable != null && (this.b || this.c)) {
            drawable = drawable.mutate();
            if (this.b) {
                drawable.setTintList(null);
            }
            if (this.c) {
                drawable.setTintMode(this.a);
            }
            if (drawable.isStateful()) {
                drawable.setState(this.d.getDrawableState());
            }
            this.d.setButtonDrawable(drawable);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void b(AttributeSet attributeSet, int n2) {
        AmbientDelegate ambientDelegate = AmbientDelegate.A(this.d.getContext(), attributeSet, er.m, n2, 0);
        Object object = ambientDelegate.b;
        CompoundButton compoundButton = this.d;
        wj.l((View)compoundButton, compoundButton.getContext(), er.m, attributeSet, (TypedArray)object, n2, 0);
        try {
            block8: {
                if (ambientDelegate.x(1) && (n2 = ambientDelegate.p(1, 0)) != 0) {
                    try {
                        attributeSet = this.d;
                        attributeSet.setButtonDrawable(kh.g(attributeSet.getContext(), n2));
                        break block8;
                    }
                    catch (Resources.NotFoundException notFoundException) {}
                }
                if (ambientDelegate.x(0) && (n2 = ambientDelegate.p(0, 0)) != 0) {
                    attributeSet = this.d;
                    attributeSet.setButtonDrawable(kh.g(attributeSet.getContext(), n2));
                }
            }
            if (ambientDelegate.x(2)) {
                this.d.setButtonTintList(ambientDelegate.q(2));
            }
            if (!ambientDelegate.x(3)) return;
            this.d.setButtonTintMode(a.e(ambientDelegate.m(3, -1), null));
            return;
        }
        finally {
            ambientDelegate.v();
        }
    }

    final void c() {
        if (this.e) {
            this.e = false;
            return;
        }
        this.e = true;
        this.a();
    }
}

