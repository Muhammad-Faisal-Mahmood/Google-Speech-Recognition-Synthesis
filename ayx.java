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

final class ayx
extends AnimatorListenerAdapter
implements axz {
    boolean a = false;
    private final View b;
    private final int c;
    private final ViewGroup d;
    private final boolean e;
    private boolean f;

    public ayx(View view, int n2) {
        this.b = view;
        this.c = n2;
        this.d = (ViewGroup)view.getParent();
        this.e = true;
        this.i(true);
    }

    private final void h() {
        if (!this.a) {
            ayr.d(this.b, this.c);
            ViewGroup viewGroup = this.d;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        this.i(false);
    }

    private final void i(boolean bl2) {
        ViewGroup viewGroup;
        if (this.e && this.f != bl2 && (viewGroup = this.d) != null) {
            this.f = bl2;
            ayo.a(viewGroup, bl2);
        }
    }

    @Override
    public final void a(ayc ayc2) {
    }

    @Override
    public final void b(ayc ayc2) {
        ayc2.F(this);
    }

    @Override
    public final void c() {
        this.i(false);
        if (!this.a) {
            ayr.d(this.b, this.c);
        }
    }

    @Override
    public final void d() {
        this.i(true);
        if (!this.a) {
            ayr.d(this.b, 0);
        }
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

    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        this.h();
    }

    public final void onAnimationEnd(Animator animator, boolean bl2) {
        if (!bl2) {
            this.h();
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationStart(Animator animator, boolean bl2) {
        if (bl2) {
            ayr.d(this.b, 0);
            animator = this.d;
            if (animator != null) {
                animator.invalidate();
            }
        }
    }
}

