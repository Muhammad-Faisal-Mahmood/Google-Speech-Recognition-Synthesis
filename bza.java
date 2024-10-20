/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.inputmethodservice.InputMethodService
 */
import android.app.Service;
import android.inputmethodservice.InputMethodService;
import com.google.android.apps.speech.tts.googletts.settings.asr.voiceime.VoiceInputMethodService;

public class bza
extends InputMethodService
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
            VoiceInputMethodService voiceInputMethodService = (VoiceInputMethodService)this;
        }
        super.onCreate();
    }
}

