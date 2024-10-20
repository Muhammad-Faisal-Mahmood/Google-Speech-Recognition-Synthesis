/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.Drawable
 */
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

final class fuu
extends azd {
    final fux b;

    public fuu(fux fux2) {
        this.b = fux2;
    }

    @Override
    public final void b(Drawable drawable) {
        ColorStateList colorStateList = this.b.b;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override
    public final void c(Drawable drawable) {
        fux fux2 = this.b;
        ColorStateList colorStateList = fux2.b;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(fux2.d, colorStateList.getDefaultColor()));
        }
    }
}

