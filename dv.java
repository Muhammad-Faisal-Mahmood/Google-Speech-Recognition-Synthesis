/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;

final class dv
extends wr {
    final eg a;

    public dv(eg eg2) {
        this.a = eg2;
    }

    @Override
    public final void a() {
        this.a.r.setAlpha(1.0f);
        this.a.M.X(null);
        this.a.M = null;
    }

    @Override
    public final void b() {
        this.a.r.setVisibility(0);
        if (this.a.r.getParent() instanceof View) {
            vy.d((View)this.a.r.getParent());
        }
    }
}

