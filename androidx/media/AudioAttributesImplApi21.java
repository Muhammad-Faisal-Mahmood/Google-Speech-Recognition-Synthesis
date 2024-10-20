/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 */
package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;
import java.util.Objects;

public class AudioAttributesImplApi21
implements AudioAttributesImpl {
    public AudioAttributes a;
    public int b = -1;

    public AudioAttributesImplApi21() {
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this.a = audioAttributes;
    }

    @Override
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof AudioAttributesImplApi21)) {
            return false;
        }
        object = (AudioAttributesImplApi21)object;
        return this.a.equals((Object)((AudioAttributesImplApi21)object).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        AudioAttributes audioAttributes = this.a;
        Objects.toString(audioAttributes);
        return "AudioAttributesCompat: audioattributes=".concat(String.valueOf(audioAttributes));
    }
}

