/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package androidx.work.impl.workers;

import android.content.Context;
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public final class CombineContinuationsWorker
extends Worker {
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        jse.e(context, "context");
        jse.e(workerParameters, "workerParams");
        super(context, workerParameters);
    }

    @Override
    public final AmbientLifecycleObserverKt c() {
        return new bbg(this.d());
    }
}

