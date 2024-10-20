/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.View
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

final class gw
extends hm
implements gz {
    final gy a;

    public gw(gy gy2, Context context) {
        this.a = gy2;
        super(context, null, 2130968612);
        this.setClickable(true);
        this.setFocusable(true);
        this.setVisibility(0);
        this.setEnabled(true);
        ag$$ExternalSyntheticApiModelOutline0.m((View)this, this.getContentDescription());
        this.setOnTouchListener(new gv(this, (View)this));
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final boolean d() {
        return false;
    }

    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        this.playSoundEffect(0);
        this.a.m();
        return true;
    }

    protected final boolean setFrame(int n2, int n3, int n4, int n5) {
        boolean bl2 = super.setFrame(n2, n3, n4, n5);
        Drawable drawable = this.getDrawable();
        Drawable drawable2 = this.getBackground();
        if (drawable != null && drawable2 != null) {
            int n6 = this.getWidth();
            n3 = this.getHeight();
            n2 = Math.max(n6, n3) / 2;
            int n7 = this.getPaddingLeft();
            int n8 = this.getPaddingRight();
            n4 = this.getPaddingTop();
            n5 = this.getPaddingBottom();
            n7 = (n6 + (n7 - n8)) / 2;
            n3 = (n3 + (n4 - n5)) / 2;
            drawable2.setHotspotBounds(n7 - n2, n3 - n2, n7 + n2, n3 + n2);
        }
        return bl2;
    }
}

