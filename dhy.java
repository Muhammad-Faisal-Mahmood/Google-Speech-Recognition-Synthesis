/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

public final class dhy
implements Callable {
    public final dhz a;
    public final boolean b;
    public final ddu c;
    public final Object d;

    public /* synthetic */ dhy(dhz dhz2, boolean bl2, ddu ddu2, Object object) {
        this.a = dhz2;
        this.b = bl2;
        this.c = ddu2;
        this.d = object;
    }

    public final Object call() {
        if (!this.b) {
            Object object = this.d;
            ddu ddu2 = this.c;
            this.a.a(ddu2, object);
        }
        return hhk.K(null);
    }
}

