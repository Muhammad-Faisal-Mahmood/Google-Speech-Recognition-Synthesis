/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioManager$OnAudioFocusChangeListener
 */
import android.media.AudioManager;
import j$.util.OptionalInt;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class eff
implements AudioManager.OnAudioFocusChangeListener {
    public static final int a = 0;
    private static final hei b = hei.m("com/google/android/libraries/search/audio/audiofocus/impl/AudioFocusChangeDelegatingListener");
    private final dzx c;
    private final efn d;
    private final efl e;
    private final Executor f;
    private final Set g = new HashSet();
    private final Map h = new HashMap();

    public eff(dzx dzx2, efn efn2, efl efl2, Executor executor) {
        OptionalInt.empty();
        this.c = dzx2;
        this.d = efn2;
        this.e = efl2;
        this.f = executor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onAudioFocusChange(int n2) {
        synchronized (this) {
            ((heg)((heg)b.c().h(hfo.a, "ALT.AFChangeListener")).j("com/google/android/libraries/search/audio/audiofocus/impl/AudioFocusChangeDelegatingListener", "onAudioFocusChange", 64, "AudioFocusChangeDelegatingListener.java")).s("#audio# Audio focus changed: status=%d", n2);
            OptionalInt.of(n2);
            for (AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener : this.g) {
                hou hou2;
                if (!this.h.containsKey(onAudioFocusChangeListener)) {
                    hou2 = new hou();
                    this.h.put(onAudioFocusChangeListener, hou2);
                }
                hou2 = (hou)this.h.get(onAudioFocusChangeListener);
                fjh fjh2 = new fjh(onAudioFocusChangeListener, n2, 1);
                gax.c(hou2.a(gqk.j(fjh2), this.f), "Failed to notify OnAudioFocusChangeListener.", new Object[0]);
            }
            if ((n2 == -1 || n2 == -2 || n2 == -3) && this.c.e) {
                gax.c(this.e.b(this.d, dzw.c), "Failed to release audio focus.", new Object[0]);
                return;
            }
            return;
        }
    }
}

