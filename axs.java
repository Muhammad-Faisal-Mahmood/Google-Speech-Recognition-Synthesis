/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import java.util.ArrayList;

public final class axs
implements axz {
    final View a;
    final ArrayList b;

    public axs(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    @Override
    public final void a(ayc ayc2) {
    }

    @Override
    public final void b(ayc ayc2) {
        ayc2.F(this);
        this.a.setVisibility(8);
        int n2 = this.b.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ((View)this.b.get(i2)).setVisibility(0);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void d() {
    }

    @Override
    public final void e(ayc ayc2) {
        ayc2.F(this);
        ayc2.D(this);
    }

    @Override
    public final /* synthetic */ void f(ayc ayc2) {
        aay.i(this, ayc2);
    }

    @Override
    public final /* synthetic */ void g(ayc ayc2) {
        aay.j(this, ayc2);
    }
}

