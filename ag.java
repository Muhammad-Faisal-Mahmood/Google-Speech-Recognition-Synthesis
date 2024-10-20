/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorSet
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

final class ag
extends cu {
    public final ae a;
    private AnimatorSet b;

    public ag(ae ae2) {
        jse.e(ae2, "animatorInfo");
        this.a = ae2;
    }

    @Override
    public final void a(ViewGroup viewGroup) {
        jse.e(viewGroup, "container");
        viewGroup = this.b;
        if (viewGroup == null) {
            this.a.a.f(this);
            return;
        }
        cy cy2 = this.a.a;
        if (cy2.f) {
            ag$$ExternalSyntheticApiModelOutline0.m((AnimatorSet)viewGroup);
        } else {
            viewGroup.end();
        }
        if (by.S(2)) {
            Objects.toString(cy2);
            boolean bl2 = cy2.f;
        }
    }

    @Override
    public final void b(ViewGroup object) {
        jse.e(object, "container");
        object = this.a.a;
        AnimatorSet animatorSet = this.b;
        if (animatorSet == null) {
            ((cy)object).f(this);
            return;
        }
        animatorSet.start();
        if (by.S(2)) {
            Objects.toString(object);
        }
    }

    @Override
    public final void c(mk mk2, ViewGroup viewGroup) {
        jse.e(mk2, "backEvent");
        jse.e(viewGroup, "container");
        cy cy2 = this.a.a;
        viewGroup = this.b;
        if (viewGroup == null) {
            cy2.f(this);
            return;
        }
        if (Build.VERSION.SDK_INT >= 34 && cy2.c.s) {
            long l2;
            if (by.S(2)) {
                Objects.toString(cy2);
            }
            long l3 = ag$$ExternalSyntheticApiModelOutline1.m((AnimatorSet)viewGroup);
            long l4 = l2 = (long)(mk2.a * (float)l3);
            if (l2 == 0L) {
                l4 = 1L;
            }
            l2 = l4;
            if (l4 == l3) {
                l2 = -1L + l3;
            }
            if (by.S(2)) {
                Objects.toString(viewGroup);
                Objects.toString(cy2);
            }
            ag$$ExternalSyntheticApiModelOutline0.m((AnimatorSet)viewGroup, l2);
        }
    }

    @Override
    public final void d(ViewGroup viewGroup) {
        jse.e(viewGroup, "container");
        if (!this.a.b()) {
            Object object = viewGroup.getContext();
            Object object2 = this.a;
            jse.d(object, "context");
            object = ((ae)object2).a((Context)object);
            object = object != null ? object.a : null;
            this.b = (AnimatorSet)object;
            object2 = this.a.a;
            object = ((cy)object2).c;
            boolean bl2 = ((cy)object2).a == cx.c;
            object = object.P;
            viewGroup.startViewTransition((View)object);
            AnimatorSet animatorSet = this.b;
            if (animatorSet != null) {
                animatorSet.addListener((Animator.AnimatorListener)new af(viewGroup, (View)object, bl2, (cy)object2, this));
            }
            if ((viewGroup = this.b) != null) {
                viewGroup.setTarget(object);
            }
        }
    }

    @Override
    public final boolean e() {
        return true;
    }
}

