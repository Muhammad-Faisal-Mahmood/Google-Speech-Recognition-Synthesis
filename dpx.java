/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;

final class dpx
implements dle {
    final hpr a;
    final dpz b;

    public dpx(dpz dpz2, hpr hpr2) {
        this.a = hpr2;
        this.b = dpz2;
    }

    @Override
    public final void i(djt object) {
        this.b.d.a(3, ((djt)object).a);
        this.b.a();
        object = new dpw(this, object, 0);
        this.b.f = object = this.a.b((Runnable)object, 10L, TimeUnit.SECONDS);
    }

    @Override
    public final void j(djt object) {
        this.b.d.a(4, ((djt)object).a);
        this.b.a();
        object = new dpw(this, object, 2);
        this.b.e = object = this.a.b((Runnable)object, 10L, TimeUnit.SECONDS);
    }
}

