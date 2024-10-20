/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class czw
implements czo {
    final gto a;
    final Context b;
    private final int c;

    public czw(gto gto2, Context context, int n2) {
        this.c = n2;
        this.a = gto2;
        this.b = context;
    }

    @Override
    public final void a(String string, int n2) {
        gto gto2;
        if (this.c != 0) {
            if (n2 == 1 && this.a.g()) {
                cqq.f(this.b, (Class)this.a.c(), string);
            }
            return;
        }
        if (n2 == 1 && (gto2 = this.a).g()) {
            cqq.f(this.b, (Class)gto2.c(), string);
        }
    }

    @Override
    public final void b(String string, int n2) {
        gto gto2;
        if (this.c != 0) {
            if (n2 == 0 && this.a.g()) {
                cqq.g(this.b, (Class)this.a.c(), string);
            }
            return;
        }
        if (n2 == 0 && (gto2 = this.a).g()) {
            cqq.g(this.b, (Class)gto2.c(), string);
        }
    }
}

