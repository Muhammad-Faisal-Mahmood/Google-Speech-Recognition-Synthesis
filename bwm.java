/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.speech.RecognitionService
 */
import android.app.Service;
import android.speech.RecognitionService;
import com.google.android.apps.speech.tts.googletts.service.GoogleTTSRecognitionService;

public abstract class bwm
extends RecognitionService
implements ilw {
    private volatile ilq a;
    private final Object b = new Object();
    private boolean c = false;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object bn() {
        if (this.a != null) return this.a.bn();
        Object object = this.b;
        synchronized (object) {
            ilq ilq2;
            if (this.a != null) return this.a.bn();
            this.a = ilq2 = new ilq((Service)this);
            return this.a.bn();
        }
    }

    public void onCreate() {
        if (!this.c) {
            this.c = true;
            this.bn();
            GoogleTTSRecognitionService googleTTSRecognitionService = (GoogleTTSRecognitionService)this;
        }
        super.onCreate();
    }
}

