/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.ProgressBar
 *  android.widget.RatingBar
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RatingBar;

public final class hr
extends RatingBar {
    private final hp a;

    public hr(Context object, AttributeSet attributeSet) {
        super((Context)object, attributeSet, 2130969752);
        lt.d((View)this, this.getContext());
        object = new hp((ProgressBar)this);
        this.a = object;
        ((hp)object).b(attributeSet, 2130969752);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final void onMeasure(int n2, int n3) {
        synchronized (this) {
            super.onMeasure(n2, n3);
            Bitmap bitmap = this.a.a;
            if (bitmap != null) {
                this.setMeasuredDimension(View.resolveSizeAndState((int)(bitmap.getWidth() * this.getNumStars()), (int)n2, (int)0), this.getMeasuredHeight());
                return;
            }
            return;
        }
    }
}

