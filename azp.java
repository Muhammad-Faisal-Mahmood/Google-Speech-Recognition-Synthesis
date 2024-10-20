/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.graphics.drawable.VectorDrawable
 */
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

final class azp
extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public azp(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    public final Drawable newDrawable() {
        azq azq2 = new azq();
        azq2.e = (VectorDrawable)this.a.newDrawable();
        return azq2;
    }

    public final Drawable newDrawable(Resources resources) {
        azq azq2 = new azq();
        azq2.e = (VectorDrawable)this.a.newDrawable(resources);
        return azq2;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        azq azq2 = new azq();
        azq2.e = (VectorDrawable)this.a.newDrawable(resources, theme);
        return azq2;
    }
}

