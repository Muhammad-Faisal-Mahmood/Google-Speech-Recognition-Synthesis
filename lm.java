/*
 * Decompiled with CFR 0.152.
 */
import android.support.v7.widget.RecyclerView;

final class lm
extends kt {
    boolean a;
    final kr b;

    public lm(kr kr2) {
        this.b = kr2;
        this.a = false;
    }

    @Override
    public final void a(RecyclerView recyclerView, int n2, int n3) {
        if (n2 == 0 && n3 == 0) {
            return;
        }
        this.a = true;
    }

    @Override
    public final void b(int n2) {
        if (n2 == 0 && this.a) {
            this.a = false;
            this.b.a();
        }
    }
}

