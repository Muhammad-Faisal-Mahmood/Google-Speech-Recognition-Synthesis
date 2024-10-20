/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class bbh {
    public Context a;
    public WorkerParameters b;
    public final AtomicInteger c = new AtomicInteger(-256);
    public boolean d;

    public bbh(Context context, WorkerParameters workerParameters) {
        if (context != null) {
            if (workerParameters != null) {
                this.a = context;
                this.b = workerParameters;
                return;
            }
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        throw new IllegalArgumentException("Application Context is null");
    }

    public hpn a() {
        return kl.o(new bbd());
    }

    public abstract hpn b();

    public final bas d() {
        return this.b.b;
    }

    public final UUID e() {
        return this.b.a;
    }

    public final Executor f() {
        return this.b.d;
    }

    public final void g(int n2) {
        this.c.compareAndSet(-256, n2);
    }

    public final boolean h() {
        return this.c.get() != -256;
    }
}

