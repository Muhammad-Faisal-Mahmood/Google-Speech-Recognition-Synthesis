/*
 * Decompiled with CFR 0.152.
 */
import android.media.AudioManager$AudioPlaybackCallback;
import java.util.List;

final class enm
extends AudioManager$AudioPlaybackCallback {
    final enn a;

    public enm(enn enn2) {
        this.a = enn2;
    }

    public final void onPlaybackConfigChanged(List list) {
        this.a.c(list);
    }
}

