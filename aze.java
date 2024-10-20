/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

public final class aze
extends AnimatorListenerAdapter {
    final azh a;

    public aze(azh azh2) {
        this.a = azh2;
    }

    public final void onAnimationEnd(Animator object) {
        object = new ArrayList(this.a.c);
        int n2 = ((ArrayList)object).size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ((azd)((ArrayList)object).get(i2)).b(this.a);
        }
    }

    public final void onAnimationStart(Animator object) {
        object = new ArrayList(this.a.c);
        int n2 = ((ArrayList)object).size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ((azd)((ArrayList)object).get(i2)).c(this.a);
        }
    }
}

