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

final class ayy
extends AnimatorListenerAdapter
implements axz {
    final aza a;
    private final ViewGroup b;
    private final View c;
    private final View d;
    private boolean e;

    public ayy(aza aza2, ViewGroup viewGroup, View view, View view2) {
        this.a = aza2;
        this.e = true;
        this.b = viewGroup;
        this.c = view;
        this.d = view2;
    }

    private final void h() {
        this.d.setTag(2131427839, null);
        this.b.getOverlay().remove(this.c);
        this.e = false;
    }

    @Override
    public final void a(ayc ayc2) {
        if (this.e) {
            this.h();
        }
    }

    @Override
    public final void b(ayc ayc2) {
        ayc2.F(this);
    }

    @Override
    public final void c() {
    }

    @Override
    public final void d() {
    }

    @Override
    public final void e(ayc ayc2) {
    }

    @Override
    public final /* synthetic */ void f(ayc ayc2) {
        aay.i(this, ayc2);
    }

    @Override
    public final /* synthetic */ void g(ayc ayc2) {
        aay.j(this, ayc2);
    }

    public final void onAnimationEnd(Animator animator) {
        this.h();
    }

    public final void onAnimationEnd(Animator animator, boolean bl2) {
        if (!bl2) {
            this.h();
        }
    }

    public final void onAnimationPause(Animator animator) {
        this.b.getOverlay().remove(this.c);
    }

    public final void onAnimationResume(Animator animator) {
        if (this.c.getParent() == null) {
            ViewGroup viewGroup = this.b;
            animator = this.c;
            viewGroup.getOverlay().add((View)animator);
            return;
        }
        this.a.n();
    }

    public final void onAnimationStart(Animator animator, boolean bl2) {
        if (bl2) {
            this.d.setTag(2131427839, (Object)this.c);
            ViewGroup viewGroup = this.b;
            animator = this.c;
            viewGroup.getOverlay().add((View)animator);
            this.e = true;
        }
    }
}

