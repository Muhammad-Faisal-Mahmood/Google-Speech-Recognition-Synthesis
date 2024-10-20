/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 *  android.os.Looper
 *  android.os.MessageQueue$IdleHandler
 */
import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class djs
implements Executor,
dll {
    public final hpr a;
    private final dlm b;
    private final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    private volatile boolean d = false;
    private final jnu e;
    private final AtomicBoolean f = new AtomicBoolean();

    public djs(hpr object, dlm dlm2, jnu jnu2) {
        this.a = object;
        this.b = dlm2;
        this.e = jnu2;
        object = ((dlm)dlm2.a).a;
        int n2 = dln.c;
        if (((dln)object).b.get() > 0) {
            this.k();
            return;
        }
        dlm2.a(this);
    }

    private final void j() {
        Runnable runnable;
        while ((runnable = (Runnable)this.c.poll()) != null) {
            this.a.execute(runnable);
        }
    }

    private final void k() {
        bdr bdr2 = new bdr(this, 9);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a.c(bdr2, 3000L, timeUnit);
    }

    @Override
    public final /* synthetic */ void a(Activity activity, Bundle bundle) {
    }

    @Override
    public final /* synthetic */ void b(Activity activity) {
    }

    @Override
    public final /* synthetic */ void c(Activity activity) {
    }

    @Override
    public final void d(Activity activity) {
        this.b.b(this);
        this.k();
    }

    @Override
    public final /* synthetic */ void e(Activity activity, Bundle bundle) {
    }

    @Override
    public final void execute(Runnable runnable) {
        if (this.d) {
            this.a.execute(runnable);
            return;
        }
        this.c.add(runnable);
        if (this.d) {
            this.j();
            return;
        }
        if (!this.f.getAndSet(true)) {
            if (((Boolean)((gto)((imc)this.e).a).e(false)).booleanValue()) {
                Looper.getMainLooper().getQueue().addIdleHandler((MessageQueue.IdleHandler)new ggs(this, 1));
                return;
            }
            this.a.c(new bdr(this, 8), 7000L, TimeUnit.MILLISECONDS);
        }
    }

    @Override
    public final /* synthetic */ void f(Activity activity) {
    }

    @Override
    public final /* synthetic */ void g(Activity activity) {
    }

    @Override
    public final /* synthetic */ void h(int n2) {
    }

    public final void i() {
        this.d = true;
        this.j();
    }
}

