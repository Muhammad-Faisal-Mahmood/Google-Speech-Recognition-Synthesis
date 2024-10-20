/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import java.util.Objects;

final class cv
extends cy {
    private final gbb j;

    public cv(cx cx2, cw cw2, gbb gbb2) {
        jse.e((Object)cx2, "finalState");
        jse.e((Object)cw2, "lifecycleImpact");
        Object object = gbb2.c;
        jse.d(object, "fragmentStateManager.fragment");
        super(cx2, cw2, (be)object);
        this.j = gbb2;
    }

    @Override
    public final void a() {
        super.a();
        this.c.s = false;
        this.j.e();
    }

    @Override
    public final void b() {
        if (!this.g) {
            super.b();
            Object object = this.b;
            if (object == cw.b) {
                Object object2 = this.j.c;
                jse.d(object2, "fragmentStateManager.fragment");
                object = (be)object2;
                View view = ((be)object).P.findFocus();
                if (view != null) {
                    ((be)object).t(view);
                    if (by.S(2)) {
                        Objects.toString(view);
                        Objects.toString(object2);
                    }
                }
                if ((object2 = this.c.requireView()).getParent() == null) {
                    this.j.b();
                    object2.setAlpha(0.0f);
                }
                if (object2.getAlpha() == 0.0f && object2.getVisibility() == 0) {
                    object2.setVisibility(4);
                }
                float f2 = (object = ((be)object).S) == null ? 1.0f : ((ba)object).q;
                object2.setAlpha(f2);
                return;
            }
            if (object == cw.c) {
                Object object3 = this.j.c;
                jse.d(object3, "fragmentStateManager.fragment");
                object = ((be)object3).requireView();
                if (by.S(2)) {
                    Objects.toString(object.findFocus());
                    Objects.toString(object);
                    Objects.toString(object3);
                }
                object.clearFocus();
            }
        }
    }
}

