/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioManager
 */
import android.media.AudioManager;

public final class gdb
implements imb {
    private final jnu a;

    public gdb(jnu jnu2) {
        this.a = jnu2;
    }

    public final AudioManager a() {
        AudioManager audioManager = (AudioManager)((ilt)this.a).a().getSystemService("audio");
        idi.m(audioManager);
        return audioManager;
    }
}

