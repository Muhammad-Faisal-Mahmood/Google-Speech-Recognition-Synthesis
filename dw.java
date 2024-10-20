/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;

final class dw
extends wr {
    final dx a;

    public dw(dx dx2) {
        this.a = dx2;
    }

    @Override
    public final void a() {
        this.a.a.r.setVisibility(8);
        eg eg2 = this.a.a;
        Object object = eg2.s;
        if (object != null) {
            object.dismiss();
        } else if (eg2.r.getParent() instanceof View) {
            vy.d((View)this.a.a.r.getParent());
        }
        this.a.a.r.i();
        this.a.a.M.X(null);
        object = this.a.a;
        object.M = null;
        vy.d((View)object.w);
    }
}

