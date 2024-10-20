/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources$Theme
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.Region
 *  android.graphics.drawable.Drawable
 */
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

abstract class azi
extends Drawable {
    public Drawable e;

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    public final void clearColorFilter() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.clearColorFilter();
            return;
        }
        super.clearColorFilter();
    }

    public final Drawable getCurrent() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getCurrent();
        }
        return super.getCurrent();
    }

    public final int getMinimumHeight() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    public final int[] getState() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getState();
        }
        return super.getState();
    }

    public final Region getTransparentRegion() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public final void jumpToCurrentState() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
            return;
        }
        super.onBoundsChange(rect);
    }

    protected boolean onLevelChange(int n2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setLevel(n2);
        }
        return super.onLevelChange(n2);
    }

    public final void setChangingConfigurations(int n2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setChangingConfigurations(n2);
            return;
        }
        super.setChangingConfigurations(n2);
    }

    public final void setColorFilter(int n2, PorterDuff.Mode mode) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(n2, mode);
            return;
        }
        super.setColorFilter(n2, mode);
    }

    public final void setFilterBitmap(boolean bl2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setFilterBitmap(bl2);
        }
    }

    public final void setHotspot(float f2, float f3) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    public final void setHotspotBounds(int n2, int n3, int n4, int n5) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setHotspotBounds(n2, n3, n4, n5);
        }
    }

    public final boolean setState(int[] nArray) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(nArray);
        }
        return super.setState(nArray);
    }
}

