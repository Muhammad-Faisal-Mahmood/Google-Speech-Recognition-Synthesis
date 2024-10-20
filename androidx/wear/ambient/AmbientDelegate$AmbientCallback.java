/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package androidx.wear.ambient;

import android.os.Bundle;

interface AmbientDelegate$AmbientCallback {
    public void onAmbientOffloadInvalidated();

    public void onEnterAmbient(Bundle var1);

    public void onExitAmbient();

    public void onUpdateAmbient();
}

