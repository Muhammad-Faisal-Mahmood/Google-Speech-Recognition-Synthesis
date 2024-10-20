/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package androidx.work;

import android.content.Context;
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import androidx.wear.ambient.WearableControllerProvider;
import androidx.work.WorkerParameters;
import java.util.concurrent.Executor;

public abstract class Worker
extends bbh {
    public Worker(Context context, WorkerParameters workerParameters) {
        jse.e(context, "context");
        jse.e(workerParameters, "workerParams");
        super(context, workerParameters);
    }

    @Override
    public final hpn a() {
        Executor executor = this.f();
        jse.d(executor, "backgroundExecutor");
        return WearableControllerProvider.a(executor, new aud(6));
    }

    @Override
    public final hpn b() {
        Executor executor = this.f();
        jse.d(executor, "backgroundExecutor");
        return WearableControllerProvider.a(executor, new mq(this, 12));
    }

    public abstract AmbientLifecycleObserverKt c();
}

