/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.apps.speech.tts.googletts.settings;

import android.os.Bundle;
import androidx.wear.ambient.AmbientMode$AmbientCallback;

public final class AaeAnalyticsActivity
extends dp {
    @Override
    protected final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = AmbientMode$AmbientCallback.g(this);
        object.setTitle(this.getString(2132017191));
        object.setNavButtonMode(bmp.a);
        object = new y(this.bb());
        ((ce)object).p(0x1020002, new bwv(), bwv.class.getSimpleName());
        ((ce)object).b();
    }
}

