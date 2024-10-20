/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.AsyncTask
 *  android.os.Looper
 *  android.os.SystemClock
 *  android.util.Log
 */
import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class adb
extends adc {
    public volatile ada a;
    public volatile ada b;
    public List c;
    private Executor k;

    public adb(Context context) {
        super(context.getApplicationContext());
    }

    public final void a() {
        if (this.b == null && this.a != null) {
            boolean bl2 = this.a.a;
            if (this.k == null) {
                this.k = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            ada ada2 = this.a;
            Executor executor = this.k;
            if (ada2.f != 1) {
                int n2 = ada2.f;
                int n3 = n2 - 1;
                if (n2 != 0) {
                    if (n3 != 1) {
                        if (n3 != 2) {
                            throw new IllegalStateException("We should never reach this state");
                        }
                        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                    }
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                }
                throw null;
            }
            ada2.f = 2;
            executor.execute(ada2.c);
        }
    }

    public final void b(List list) {
        this.c = list;
        acw acw2 = this.j;
        if (acw2 != null) {
            if (acv.b(2)) {
                Objects.toString(acw2);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                acw2.g(list);
                return;
            }
            if (acv.b(4)) {
                Log.i((String)"LoaderManager", (String)"onLoadComplete was incorrectly called on a background thread");
            }
            acw2.h(list);
        }
    }

    final void c(ada ada2) {
        if (this.b == ada2) {
            SystemClock.uptimeMillis();
            this.b = null;
            this.a();
        }
    }

    @Override
    public final void d() {
        if (this.a != null) {
            if (!this.f) {
                this.i = true;
            }
            if (this.b != null) {
                boolean bl2 = this.a.a;
            } else {
                boolean bl3 = this.a.a;
                ada ada2 = this.a;
                ada2.d.set(true);
                if (ada2.c.cancel(false)) {
                    this.b = this.a;
                }
            }
            this.a = null;
        }
    }
}

