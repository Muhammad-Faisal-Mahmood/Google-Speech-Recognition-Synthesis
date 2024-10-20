/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.Region
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 */
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public class es
extends Drawable
implements Drawable.Callback {
    private final Drawable a;

    public es(Drawable drawable) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.a = drawable;
        drawable.setCallback((Drawable.Callback)this);
    }

    public void draw(Canvas canvas) {
        this.a.draw(canvas);
    }

    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    public final Drawable getCurrent() {
        return this.a.getCurrent();
    }

    public final int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    public final int getMinimumHeight() {
        return this.a.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.a.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.a.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        return this.a.getPadding(rect);
    }

    public final int[] getState() {
        return this.a.getState();
    }

    public final Region getTransparentRegion() {
        return this.a.getTransparentRegion();
    }

    public final void invalidateDrawable(Drawable drawable) {
        this.invalidateSelf();
    }

    public final boolean isAutoMirrored() {
        return this.a.isAutoMirrored();
    }

    public final boolean isStateful() {
        return this.a.isStateful();
    }

    public final void jumpToCurrentState() {
        this.a.jumpToCurrentState();
    }

    protected final void onBoundsChange(Rect rect) {
        this.a.setBounds(rect);
    }

    protected final boolean onLevelChange(int n2) {
        return this.a.setLevel(n2);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long l2) {
        this.scheduleSelf(runnable, l2);
    }

    public final void setAlpha(int n2) {
        this.a.setAlpha(n2);
    }

    public final void setAutoMirrored(boolean bl2) {
        this.a.setAutoMirrored(bl2);
    }

    public final void setChangingConfigurations(int n2) {
        this.a.setChangingConfigurations(n2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public final void setDither(boolean bl2) {
        this.a.setDither(bl2);
    }

    public final void setFilterBitmap(boolean bl2) {
        this.a.setFilterBitmap(bl2);
    }

    public void setHotspot(float f2, float f3) {
        this.a.setHotspot(f2, f3);
    }

    public void setHotspotBounds(int n2, int n3, int n4, int n5) {
        this.a.setHotspotBounds(n2, n3, n4, n5);
    }

    public boolean setState(int[] nArray) {
        return this.a.setState(nArray);
    }

    public final void setTint(int n2) {
        this.a.setTint(n2);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.a.setTintList(colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.a.setTintMode(mode);
    }

    public boolean setVisible(boolean bl2, boolean bl3) {
        return super.setVisible(bl2, bl3) || this.a.setVisible(bl2, bl3);
        {
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.unscheduleSelf(runnable);
    }
}

