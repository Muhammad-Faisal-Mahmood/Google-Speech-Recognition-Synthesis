/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 *  android.media.AudioFocusRequest$Builder
 *  android.media.AudioManager$OnAudioFocusChangeListener
 *  android.os.Handler
 */
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.media.AudioAttributesCompat;
import j$.util.Objects;

public final class adf {
    public static final int b = 0;
    public final Object a;
    private final int c;
    private final AudioManager.OnAudioFocusChangeListener d;
    private final Handler e;
    private final AudioAttributesCompat f;
    private final boolean g;

    static {
        int n2 = AudioAttributesCompat.b;
        bzb bzb2 = new bzb(null, null, null);
        xm.j(1, bzb2);
        xm.i(bzb2);
    }

    public adf(int n2, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributesCompat object) {
        this.c = n2;
        this.e = handler;
        this.f = object;
        this.g = false;
        this.d = onAudioFocusChangeListener;
        object = ((AudioAttributesCompat)object).a.a();
        this.a = ag$$ExternalSyntheticApiModelOutline0.m(ag$$ExternalSyntheticApiModelOutline0.m(ag$$ExternalSyntheticApiModelOutline0.m(ag$$ExternalSyntheticApiModelOutline0.m(new AudioFocusRequest.Builder(n2), (AudioAttributes)object), false), onAudioFocusChangeListener, handler));
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof adf)) {
            return false;
        }
        object = (adf)object;
        if (this.c == ((adf)object).c) {
            boolean bl2 = ((adf)object).g;
            if (Objects.equals(this.d, ((adf)object).d) && Objects.equals(this.e, ((adf)object).e) && Objects.equals(this.f, ((adf)object).f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, this.f, false);
    }
}

