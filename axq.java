/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.view.View
 */
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class axq
extends AnimatorListenerAdapter
implements axz {
    private final View a;
    private boolean b = false;

    public axq(View view) {
        this.a = view;
    }

    @Override
    public final void a(ayc ayc2) {
    }

    @Override
    public final void b(ayc ayc2) {
    }

    @Override
    public final void c() {
        float f2 = this.a.getVisibility() == 0 ? ayr.a(this.a) : 0.0f;
        this.a.setTag(2131427990, (Object)Float.valueOf(f2));
    }

    @Override
    public final void d() {
        this.a.setTag(2131427990, null);
    }

    @Override
    public final void e(ayc ayc2) {
    }

    @Override
    public final /* synthetic */ void f(ayc ayc2) {
        aay.i(this, ayc2);
    }

    @Override
    public final void g(ayc ayc2) {
    }

    public final void onAnimationCancel(Animator animator) {
        ayr.c(this.a, 1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.onAnimationEnd(animator, false);
    }

    public final void onAnimationEnd(Animator animator, boolean bl2) {
        if (this.b) {
            this.a.setLayerType(0, null);
        }
        if (!bl2) {
            ayr.c(this.a, 1.0f);
        }
    }

    public final void onAnimationStart(Animator animator) {
        if (this.a.hasOverlappingRendering() && this.a.getLayerType() == 0) {
            this.b = true;
            this.a.setLayerType(2, null);
        }
    }
}

