/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioManager
 */
import android.media.AudioManager;
import java.util.concurrent.Executor;

public final class efi {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/audiofocus/impl/AudioFocusManager");
    public final Executor b;
    public final AudioManager c;
    public final hou d = new hou();

    public efi(Executor executor, AudioManager audioManager) {
        this.b = new hpz(executor);
        this.c = audioManager;
    }
}

