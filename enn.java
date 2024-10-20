/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioManager
 *  android.media.AudioPlaybackConfiguration
 *  android.os.Build$VERSION
 *  android.os.Parcel
 */
import android.media.AudioManager;
import android.media.AudioManager$AudioPlaybackCallback;
import android.media.AudioPlaybackConfiguration;
import android.os.Build;
import android.os.Parcel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class enn {
    private static final hei b = hei.m("com/google/android/libraries/search/audio/micmuter/MicMuter");
    public final AtomicBoolean a = new AtomicBoolean();
    private final AudioManager c;
    private final boolean d;
    private AudioManager$AudioPlaybackCallback e;

    public enn(eao eao2, AudioManager audioManager) {
        this.c = audioManager;
        this.d = eao2.i;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void d() {
        synchronized (this) {
            AudioManager$AudioPlaybackCallback audioManager$AudioPlaybackCallback = this.e;
            if (audioManager$AudioPlaybackCallback != null) {
                return;
            }
            this.e = audioManager$AudioPlaybackCallback = new enm(this);
            ag$$ExternalSyntheticApiModelOutline0.m(this.c, audioManager$AudioPlaybackCallback, null);
            this.c(ag$$ExternalSyntheticApiModelOutline0.m(this.c));
            return;
        }
    }

    private final void e(boolean bl2) {
        if (this.a.getAndSet(bl2) != bl2) {
            heg heg2 = (heg)((heg)b.f().h(hfo.a, "ALT.MicMuter")).j("com/google/android/libraries/search/audio/micmuter/MicMuter", "setIsTalkbackAudioActive", 93, "MicMuter.java");
            String string = true != bl2 ? "stopped" : "started";
            heg2.u("#audio# Talkback audio %s", string);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void f() {
        synchronized (this) {
            this.a.set(false);
            AudioManager$AudioPlaybackCallback audioManager$AudioPlaybackCallback = this.e;
            if (audioManager$AudioPlaybackCallback != null) {
                ag$$ExternalSyntheticApiModelOutline0.m(this.c, audioManager$AudioPlaybackCallback);
                this.e = null;
                return;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        synchronized (this) {
            this.f();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        synchronized (this) {
            if (this.d) {
                this.d();
                return;
            }
            return;
        }
    }

    public final void c(List list) {
        block3: {
            int n2;
            int n3;
            int n4;
            Iterator iterator = list.iterator();
            do {
                boolean bl2 = iterator.hasNext();
                int n5 = 0;
                if (!bl2) break block3;
                list = ag$$ExternalSyntheticApiModelOutline0.m(iterator.next());
                n4 = ag$$ExternalSyntheticApiModelOutline0.m((AudioPlaybackConfiguration)list).getUsage();
                n3 = ag$$ExternalSyntheticApiModelOutline0.m((AudioPlaybackConfiguration)list).getContentType();
                if (Build.VERSION.SDK_INT >= 30) {
                    Parcel parcel = Parcel.obtain();
                    ag$$ExternalSyntheticApiModelOutline0.m((AudioPlaybackConfiguration)list, parcel, 0);
                    parcel.setDataPosition(0);
                    n2 = Build.VERSION.SDK_INT >= 34 ? 6 : (Build.VERSION.SDK_INT >= 31 ? 5 : 4);
                    for (int i2 = 0; i2 < n2; ++i2) {
                        parcel.readInt();
                    }
                    n2 = n5;
                    if (parcel.readInt() != 2) continue;
                }
                n2 = 1;
            } while (n4 != 11 || n3 == 4 || n2 == 0);
            this.e(true);
            return;
        }
        this.e(false);
    }
}

