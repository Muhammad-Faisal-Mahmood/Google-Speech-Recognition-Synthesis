/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.drawable.Drawable
 */
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

final class ja
extends es {
    public boolean a = true;

    public ja(Drawable drawable) {
        super(drawable);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.a) {
            super.draw(canvas);
        }
    }

    @Override
    public final void setHotspot(float f2, float f3) {
        if (this.a) {
            super.setHotspot(f2, f3);
        }
    }

    @Override
    public final void setHotspotBounds(int n2, int n3, int n4, int n5) {
        if (this.a) {
            super.setHotspotBounds(n2, n3, n4, n5);
        }
    }

    @Override
    public final boolean setState(int[] nArray) {
        if (this.a) {
            return super.setState(nArray);
        }
        return false;
    }

    @Override
    public final boolean setVisible(boolean bl2, boolean bl3) {
        if (this.a) {
            return super.setVisible(bl2, bl3);
        }
        return false;
    }
}

