/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  com.google.android.wearable.compat.WearableActivityController$AmbientCallback
 */
package androidx.wear.ambient;

import android.os.Bundle;
import androidx.wear.ambient.AmbientDelegate$AmbientCallback;
import com.google.android.wearable.compat.WearableActivityController;

final class WearableControllerProvider$1
extends WearableActivityController.AmbientCallback {
    final AmbientDelegate$AmbientCallback a;

    public WearableControllerProvider$1(AmbientDelegate$AmbientCallback ambientDelegate$AmbientCallback) {
        this.a = ambientDelegate$AmbientCallback;
    }

    public final void onEnterAmbient(Bundle bundle) {
        this.a.onEnterAmbient(bundle);
    }

    public final void onExitAmbient() {
        this.a.onExitAmbient();
    }

    public final void onInvalidateAmbientOffload() {
        this.a.onAmbientOffloadInvalidated();
    }

    public final void onUpdateAmbient() {
        this.a.onUpdateAmbient();
    }
}

