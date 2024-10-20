/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
import android.view.ViewGroup;

final class axn
extends ayd {
    boolean a = false;
    final ViewGroup b;

    public axn(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override
    public final void a(ayc ayc2) {
        ayo.a(this.b, false);
        this.a = true;
    }

    @Override
    public final void b(ayc ayc2) {
        if (!this.a) {
            ayo.a(this.b, false);
        }
        ayc2.F(this);
    }

    @Override
    public final void c() {
        ayo.a(this.b, false);
    }

    @Override
    public final void d() {
        ayo.a(this.b, true);
    }
}

