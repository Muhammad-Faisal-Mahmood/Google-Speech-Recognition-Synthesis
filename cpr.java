/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class cpr
extends AbstractExecutorService {
    public final cpt a;
    public final cpv b;
    public final cpz c;
    public final boolean d;
    public final hpr e;
    private final AtomicInteger f;
    private final ExecutorService g;
    private final AmbientModeSupport$AmbientController h;

    public cpr(cpv cpv2, cpz cpz2, boolean bl2, hpr hpr2, cpt cpt2, ExecutorService executorService, AmbientModeSupport$AmbientController ambientModeSupport$AmbientController) {
        this.a = cpt2;
        this.g = executorService;
        this.h = ambientModeSupport$AmbientController;
        this.b = cpv2;
        this.c = cpz2;
        this.d = bl2;
        this.e = hpr2;
        this.f = new AtomicInteger(1000);
    }

    @Override
    public final boolean awaitTermination(long l2, TimeUnit timeUnit) {
        return this.g.awaitTermination(l2, timeUnit);
    }

    @Override
    public final void execute(Runnable object) {
        this.c.c();
        if (cpu.b()) {
            this.g.execute(new cpq(this, (Runnable)object));
        } else {
            this.g.execute((Runnable)object);
        }
        this.c.a();
        if (cpu.b()) {
            object = ((hjt)this.h.a).d;
            cpz cpz2 = this.c;
            int n2 = ((AtomicInteger)object).get();
            cpz2.b();
            if (n2 >= 1000) {
                int n3;
                while (n2 >= (n3 = this.f.get())) {
                    if (!this.f.compareAndSet(n3, n3 + n3)) continue;
                    this.c.b();
                    object = new cpw(a.ah(n2, "Queue size of ", " exceeds starvation threshold of 1000"));
                    cpu.a(this.b, this.a.a(), (RuntimeException)object);
                }
            }
        }
    }

    @Override
    public final boolean isShutdown() {
        return this.g.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return this.g.isTerminated();
    }

    @Override
    public final void shutdown() {
        this.g.shutdown();
    }

    public final List shutdownNow() {
        return this.g.shutdownNow();
    }

    public final String toString() {
        String string = this.g.toString();
        StringBuilder stringBuilder = new StringBuilder("Monitoring[");
        stringBuilder.append(string);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

