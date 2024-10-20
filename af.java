/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

public final class af
extends AnimatorListenerAdapter {
    final ViewGroup a;
    final View b;
    final boolean c;
    final cy d;
    final ag e;

    public af(ViewGroup viewGroup, View view, boolean bl2, cy cy2, ag ag2) {
        this.a = viewGroup;
        this.b = view;
        this.c = bl2;
        this.d = cy2;
        this.e = ag2;
    }

    public final void onAnimationEnd(Animator object) {
        jse.e(object, "anim");
        this.a.endViewTransition(this.b);
        if (this.c) {
            Object object2 = this.d;
            object = this.b;
            object2 = ((cy)object2).a;
            jse.d(object, "viewToAnimate");
            ((cx)((Object)object2)).a((View)object, this.a);
        }
        object = this.e;
        object.a.a.f((cu)object);
        if (by.S(2)) {
            Objects.toString(this.d);
        }
    }
}

