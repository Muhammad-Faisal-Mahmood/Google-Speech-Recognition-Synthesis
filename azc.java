/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Animatable2$AnimationCallback
 *  android.graphics.drawable.Drawable
 */
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

final class azc
extends Animatable2.AnimationCallback {
    final azd a;

    public azc(azd azd2) {
        this.a = azd2;
    }

    public final void onAnimationEnd(Drawable drawable) {
        this.a.b(drawable);
    }

    public final void onAnimationStart(Drawable drawable) {
        this.a.c(drawable);
    }
}

