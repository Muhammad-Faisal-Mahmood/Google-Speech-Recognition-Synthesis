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
import androidx.media.AudioAttributesImplApi26;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(azs azs2) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes)azs2.b((Parcelable)audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = azs2.a(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, azs azs2) {
        azs2.i((Parcelable)audioAttributesImplApi26.a, 1);
        azs2.h(audioAttributesImplApi26.b, 2);
    }
}

