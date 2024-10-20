/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package androidx.work;

import android.content.Context;
import androidx.wear.ambient.AmbientLifecycleObserver$AmbientLifecycleCallback$_CC;
import androidx.work.WorkerParameters;

public abstract class CoroutineWorker
extends bbh {
    private final WorkerParameters e;
    private final juy f;

    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        jse.e(context, "appContext");
        jse.e(workerParameters, "params");
        super(context, workerParameters);
        this.e = workerParameters;
        this.f = bar.a;
    }

    @Override
    public final hpn a() {
        jwk jwk2 = new jwk();
        return AmbientLifecycleObserver$AmbientLifecycleCallback$_CC.b(this.f.plus(jwk2), new aus(this, null, 2));
    }

    @Override
    public final hpn b() {
        jqf jqf2 = !jse.i(this.f, bar.a) ? this.f : this.e.e;
        jse.d(jqf2, "if (coroutineContext != \u2026rkerContext\n            }");
        return AmbientLifecycleObserver$AmbientLifecycleCallback$_CC.b(jqf2.plus(new jwk()), new aus(this, null, 3, null));
    }

    public abstract Object c(jqb var1);
}

