/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.os.Bundle
 */
package com.google.android.apps.speech.tts.googletts.settings;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public final class GetSampleText
extends Activity {
    protected final void onCreate(Bundle object) {
        super.onCreate(object);
        Intent intent = new Intent();
        if (this.getIntent() != null && this.getIntent().getExtras() != null && this.getIntent().getExtras().containsKey("language")) {
            object = this.getIntent().getExtras().getString("language");
            String string = kh.t(this.getResources(), (String)object);
            if (string != null) {
                intent.putExtra("sampleText", string);
                this.setResult(0, intent);
            } else {
                intent.putExtra("sampleText", kh.s(this.getResources(), (String)object));
                this.setResult(-2, intent);
            }
            this.finish();
            return;
        }
        this.setResult(-2, intent);
        this.finish();
    }
}

