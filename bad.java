/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 */
import android.graphics.drawable.Drawable;
import androidx.wear.widget.CircledImageView;

public final class bad
implements Drawable.Callback {
    final Object a;
    private final int b;

    public bad(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public final void invalidateDrawable(Drawable drawable) {
        if (this.b != 0) {
            ((azh)((Object)this.a)).invalidateSelf();
            return;
        }
        ((CircledImageView)((Object)this.a)).invalidate();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long l2) {
        if (this.b != 0) {
            ((azh)((Object)this.a)).scheduleSelf(runnable, l2);
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (this.b != 0) {
            ((azh)((Object)this.a)).unscheduleSelf(runnable);
        }
    }
}

