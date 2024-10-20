/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 *  android.view.animation.AnimationSet
 *  android.view.animation.Transformation
 */
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

final class bi
extends AnimationSet
implements Runnable {
    private final ViewGroup a;
    private final View b;
    private boolean c;
    private boolean d;
    private boolean e = true;

    public bi(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.a = viewGroup;
        this.b = view;
        this.addAnimation(animation);
        viewGroup.post((Runnable)this);
    }

    public final boolean getTransformation(long l2, Transformation transformation) {
        this.e = true;
        if (this.c) {
            return !this.d;
        }
        if (!super.getTransformation(l2, transformation)) {
            this.c = true;
            vl.a((View)this.a, this);
        }
        return true;
    }

    public final boolean getTransformation(long l2, Transformation transformation, float f2) {
        this.e = true;
        if (this.c) {
            return !this.d;
        }
        if (!super.getTransformation(l2, transformation, f2)) {
            this.c = true;
            vl.a((View)this.a, this);
        }
        return true;
    }

    @Override
    public final void run() {
        if (!this.c && this.e) {
            this.e = false;
            this.a.post((Runnable)this);
            return;
        }
        this.a.endViewTransition(this.b);
        this.d = true;
    }
}

