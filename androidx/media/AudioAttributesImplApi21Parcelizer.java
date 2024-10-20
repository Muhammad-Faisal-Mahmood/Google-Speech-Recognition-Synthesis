/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 *  android.os.Parcelable
 */
package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import androidx.media.AudioAttributesImplApi21;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(azs azs2) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes)azs2.b((Parcelable)audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = azs2.a(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, azs azs2) {
        azs2.i((Parcelable)audioAttributesImplApi21.a, 1);
        azs2.h(audioAttributesImplApi21.b, 2);
    }
}

