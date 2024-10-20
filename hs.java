/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.SeekBar
 */
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;

public final class hs
extends SeekBar {
    private final ht a;

    public hs(Context object, AttributeSet attributeSet) {
        super((Context)object, attributeSet, 2130969794);
        lt.d((View)this, this.getContext());
        object = new ht(this);
        this.a = object;
        ((hp)object).b(attributeSet, 2130969794);
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        ht ht2 = this.a;
        Drawable drawable = ht2.c;
        if (drawable != null && drawable.isStateful() && drawable.setState(ht2.b.getDrawableState())) {
            ht2.b.invalidateDrawable(drawable);
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final void onDraw(Canvas canvas) {
        synchronized (this) {
            super.onDraw(canvas);
            ht ht2 = this.a;
            if (ht2.c != null) {
                int n2 = ht2.b.getMax();
                int n3 = 1;
                if (n2 > 1) {
                    int n4 = ht2.c.getIntrinsicWidth();
                    int n5 = ht2.c.getIntrinsicHeight();
                    n4 = n4 >= 0 ? (n4 >>= 1) : 1;
                    if (n5 >= 0) {
                        n3 = n5 >> 1;
                    }
                    ht2.c.setBounds(-n4, -n3, n4, n3);
                    n3 = ht2.b.getWidth();
                    n5 = ht2.b.getPaddingLeft();
                    int n6 = ht2.b.getPaddingRight();
                    int n7 = canvas.save();
                    canvas.translate((float)ht2.b.getPaddingLeft(), (float)(ht2.b.getHeight() / 2));
                    n4 = 0;
                    while (true) {
                        if (n4 > n2) {
                            canvas.restoreToCount(n7);
                            return;
                        }
                        float f2 = n2;
                        float f3 = n3 - n5 - n6;
                        ht2.c.draw(canvas);
                        canvas.translate(f3 / f2, 0.0f);
                        ++n4;
                    }
                }
            }
            return;
        }
    }
}

