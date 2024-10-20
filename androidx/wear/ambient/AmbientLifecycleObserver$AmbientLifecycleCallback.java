/*
 * Decompiled with CFR 0.152.
 */
package androidx.wear.ambient;

import androidx.wear.ambient.AmbientLifecycleObserver$AmbientDetails;

public interface AmbientLifecycleObserver$AmbientLifecycleCallback {
    public void onEnterAmbient(AmbientLifecycleObserver$AmbientDetails var1);

    public void onExitAmbient();

    public void onUpdateAmbient();
}

