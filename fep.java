/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.concurrent.Callable;

public final class fep {
    public static final hei a = hei.m("com/google/android/libraries/speech/transcription/languages/VoiceLanguageHelper");
    public final Context b;
    public final hpq c;
    public feo d;

    public fep(Context context, hpq hpq2) {
        this.b = context;
        this.c = hpq2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hpn a() {
        synchronized (this) {
            Object object = this.d;
            if (object != null) return hhk.K(object);
            hpq hpq2 = this.c;
            object = new bdr(this, 19);
            return hpq2.bf(gqk.j((Callable)object));
        }
    }
}

