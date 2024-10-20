/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 */
import android.graphics.drawable.Drawable;

final class fvg
extends Drawable.ConstantState {
    final fvh a;

    public fvg(fvh fvh2) {
        this.a = fvh2;
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public final Drawable newDrawable() {
        return this.a;
    }
}

