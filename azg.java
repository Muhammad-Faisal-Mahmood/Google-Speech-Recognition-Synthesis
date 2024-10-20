/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 */
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public final class azg
extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public azg(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    public final Drawable newDrawable() {
        azh azh2 = new azh();
        azh2.e = this.a.newDrawable();
        azh2.e.setCallback(azh2.d);
        return azh2;
    }

    public final Drawable newDrawable(Resources resources) {
        azh azh2 = new azh();
        azh2.e = this.a.newDrawable(resources);
        azh2.e.setCallback(azh2.d);
        return azh2;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        azh azh2 = new azh();
        azh2.e = this.a.newDrawable(resources, theme);
        azh2.e.setCallback(azh2.d);
        return azh2;
    }
}

