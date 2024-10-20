/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 */
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.concurrent.atomic.AtomicBoolean;

public final class byo {
    public static final hei a = hei.m("com/google/android/apps/speech/tts/googletts/settings/asr/TntComponentsEnabler");
    public final Context b;
    public final PackageManager c;
    public final AtomicBoolean d = new AtomicBoolean(false);

    public byo(Context context, PackageManager packageManager) {
        this.b = context;
        this.c = packageManager;
    }
}

