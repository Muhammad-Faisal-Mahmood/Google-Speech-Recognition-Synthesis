/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;

final class en
extends wr {
    final eq a;

    public en(eq eq2) {
        this.a = eq2;
    }

    @Override
    public final void a() {
        Object object = this.a;
        if (((eq)object).j && (object = ((eq)object).e) != null) {
            object.setTranslationY(0.0f);
            this.a.c.setTranslationY(0.0f);
        }
        this.a.c.setVisibility(8);
        this.a.c.a(false);
        eq eq2 = this.a;
        eq2.l = null;
        object = eq2.h;
        if (object != null) {
            object.a(eq2.g);
            eq2.g = null;
            eq2.h = null;
        }
        if ((object = this.a.b) != null) {
            vy.d((View)object);
        }
    }
}

