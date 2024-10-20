/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package androidx.wear.ambient;

import android.os.Bundle;
import androidx.wear.ambient.AmbientDelegate$AmbientCallback;
import androidx.wear.ambient.AmbientLifecycleObserver$AmbientDetails;
import androidx.wear.ambient.AmbientLifecycleObserver$AmbientLifecycleCallback;

public final class AmbientLifecycleObserverImpl$callbackTranslator$1
implements AmbientDelegate$AmbientCallback {
    final AmbientLifecycleObserver$AmbientLifecycleCallback a;

    public AmbientLifecycleObserverImpl$callbackTranslator$1(AmbientLifecycleObserver$AmbientLifecycleCallback ambientLifecycleObserver$AmbientLifecycleCallback) {
        this.a = ambientLifecycleObserver$AmbientLifecycleCallback;
    }

    @Override
    public final void onAmbientOffloadInvalidated() {
    }

    @Override
    public final void onEnterAmbient(Bundle bundle) {
        boolean bl2 = false;
        boolean bl3 = bundle != null ? bundle.getBoolean("com.google.android.wearable.compat.extra.BURN_IN_PROTECTION") : false;
        if (bundle != null) {
            bl2 = bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT");
        }
        this.a.onEnterAmbient(new AmbientLifecycleObserver$AmbientDetails(bl3, bl2));
    }

    @Override
    public final void onExitAmbient() {
        this.a.onExitAmbient();
    }

    @Override
    public final void onUpdateAmbient() {
        this.a.onUpdateAmbient();
    }
}

