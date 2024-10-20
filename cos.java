/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public final class cos
extends hpa
implements hpr {
    public static final int b = 0;
    public final hpr a;
    private final hpq c;

    public cos(hpq hpq2, hpr hpr2) {
        this.c = hpq2;
        this.a = hpr2;
    }

    @Override
    public final /* synthetic */ Object a() {
        return this.c;
    }

    @Override
    public final hpp b(Runnable runnable, long l2, TimeUnit timeUnit) {
        hpo hpo2 = new hpo(runnable);
        if (l2 <= 0L) {
            return new cor(this.c.be(runnable), System.nanoTime());
        }
        return new coq(hpo2, this.a.b(new ckr((Object)this, (Object)hpo2, 10, null), l2, timeUnit));
    }

    @Override
    public final hpp c(Callable object, long l2, TimeUnit timeUnit) {
        if (l2 <= 0L) {
            return new cor(this.c.bf((Callable)object), System.nanoTime());
        }
        object = new hpo((Callable)object);
        return new coq((hpn)object, this.a.b(new ckr((Object)this, object, 11, null), l2, timeUnit));
    }

    @Override
    public final hpp d(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        hpz hpz2 = new hpz(this);
        hqa hqa2 = new hqa();
        runnable = new con_(hpz2, runnable, hqa2);
        return new coq(hqa2, this.a.d(runnable, l2, l3, timeUnit));
    }

    @Override
    public final hpp e(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        hqa hqa2 = new hqa();
        coq coq2 = new coq(hqa2, null);
        runnable = new cop(this, runnable, hqa2, coq2, l3, timeUnit);
        coq2.a = this.a.b(runnable, l2, timeUnit);
        return coq2;
    }

    @Override
    public final hpq f() {
        return this.c;
    }

    @Override
    public final /* synthetic */ ExecutorService g() {
        return this.c;
    }
}

