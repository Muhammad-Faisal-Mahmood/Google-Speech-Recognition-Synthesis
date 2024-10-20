/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.ProgressBar
 *  android.widget.SeekBar
 */
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import androidx.wear.ambient.AmbientDelegate;

final class ht
extends hp {
    public final SeekBar b;
    public Drawable c;
    private ColorStateList d = null;
    private PorterDuff.Mode e = null;
    private boolean f = false;
    private boolean g = false;

    public ht(SeekBar seekBar) {
        super((ProgressBar)seekBar);
        this.b = seekBar;
    }

    private final void c() {
        Drawable drawable = this.c;
        if (drawable != null && (this.f || this.g)) {
            this.c = drawable = drawable.mutate();
            if (this.f) {
                drawable.setTintList(this.d);
            }
            if (this.g) {
                this.c.setTintMode(this.e);
            }
            if (this.c.isStateful()) {
                this.c.setState(this.b.getDrawableState());
            }
        }
    }

    @Override
    public final void b(AttributeSet attributeSet, int n2) {
        super.b(attributeSet, 2130969794);
        AmbientDelegate ambientDelegate = AmbientDelegate.A(this.b.getContext(), attributeSet, er.g, 2130969794, 0);
        Object object = ambientDelegate.b;
        SeekBar seekBar = this.b;
        wj.l((View)seekBar, seekBar.getContext(), er.g, attributeSet, (TypedArray)object, 2130969794, 0);
        attributeSet = ambientDelegate.s(0);
        if (attributeSet != null) {
            this.b.setThumb((Drawable)attributeSet);
        }
        seekBar = ambientDelegate.r(1);
        attributeSet = this.c;
        if (attributeSet != null) {
            attributeSet.setCallback(null);
        }
        this.c = seekBar;
        if (seekBar != null) {
            seekBar.setCallback((Drawable.Callback)this.b);
            seekBar.setLayoutDirection(this.b.getLayoutDirection());
            if (seekBar.isStateful()) {
                seekBar.setState(this.b.getDrawableState());
            }
            this.c();
        }
        this.b.invalidate();
        if (ambientDelegate.x(3)) {
            this.e = a.e(ambientDelegate.m(3, -1), this.e);
            this.g = true;
        }
        if (ambientDelegate.x(2)) {
            this.d = ambientDelegate.q(2);
            this.f = true;
        }
        ambientDelegate.v();
        this.c();
    }
}

