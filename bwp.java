/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.concurrent.ExecutionException;

public final class bwp {
    public static final hei a = hei.m("com/google/android/apps/speech/tts/googletts/service/NativeLibraryLoader");
    public final Context b;
    public hpn c;

    public bwp(Context context) {
        this.b = context;
    }

    public final void a() {
        hpn hpn2 = this.c;
        if (hpn2 != null) {
            try {
                hpn2.get();
                return;
            }
            catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Interrupted while awaiting native library loading", interruptedException);
            }
            catch (ExecutionException executionException) {
                throw new IllegalStateException("Failed to await native library loading", executionException);
            }
        }
        throw new IllegalStateException("Native library loading not started");
    }
}

