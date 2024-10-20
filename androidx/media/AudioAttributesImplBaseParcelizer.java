/*
 * Decompiled with CFR 0.152.
 */
package androidx.media;

import androidx.media.AudioAttributesImplBase;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(azs azs2) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = azs2.a(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = azs2.a(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = azs2.a(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = azs2.a(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, azs azs2) {
        azs2.h(audioAttributesImplBase.a, 1);
        azs2.h(audioAttributesImplBase.b, 2);
        azs2.h(audioAttributesImplBase.c, 3);
        azs2.h(audioAttributesImplBase.d, 4);
    }
}

