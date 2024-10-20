/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
import android.content.Context;
import android.view.View;

public final class gu
extends gc {
    final gy d;

    public gu(gy gy2, Context object, gl object2, View view) {
        this.d = gy2;
        super((Context)object, (fs)object2, view, false);
        if (!((gl)object2).l.o()) {
            object2 = gy2.g;
            object = object2;
            if (object2 == null) {
                object = (View)gy2.f;
            }
            this.a = object;
        }
        this.e(gy2.l);
    }

    @Override
    protected final void c() {
        this.d.j = null;
        super.c();
    }
}

