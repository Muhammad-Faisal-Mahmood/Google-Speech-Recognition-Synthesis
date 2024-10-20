/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 */
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;

final class ad
extends cu {
    public final ae a;

    public ad(ae ae2) {
        jse.e(ae2, "animationInfo");
        this.a = ae2;
    }

    @Override
    public final void a(ViewGroup viewGroup) {
        jse.e(viewGroup, "container");
        cy cy2 = this.a.a;
        View view = cy2.c.P;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        this.a.a.f(this);
        if (by.S(2)) {
            Objects.toString(cy2);
        }
    }

    @Override
    public final void b(ViewGroup viewGroup) {
        jse.e(viewGroup, "container");
        if (this.a.b()) {
            this.a.a.f(this);
            return;
        }
        Context context = viewGroup.getContext();
        Object object = this.a;
        cy cy2 = ((ah)object).a;
        View view = cy2.c.P;
        jse.d(context, "context");
        object = ((ae)object).a(context);
        if (object != null && (object = ((awg)object).b) != null) {
            if (cy2.a != cx.a) {
                view.startAnimation((Animation)object);
                this.a.a.f(this);
                return;
            }
            viewGroup.startViewTransition(view);
            object = new bi((Animation)object, viewGroup, view);
            object.setAnimationListener((Animation.AnimationListener)new ac(cy2, viewGroup, view, this));
            view.startAnimation((Animation)object);
            if (by.S(2)) {
                Objects.toString(cy2);
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}

