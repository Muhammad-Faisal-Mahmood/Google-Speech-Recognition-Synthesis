/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioRecord
 *  android.media.audiofx.AudioEffect
 */
import android.media.AudioRecord;
import android.media.audiofx.AudioEffect;
import java.util.function.Function;

public final class ega {
    private static final hei a = hei.m("com/google/android/libraries/search/audio/audiosource/impl/AudioEffectUtils");

    public static gto a(AudioRecord object, Function object2) {
        block5: {
            AudioEffect audioEffect = (AudioEffect)ag$$ExternalSyntheticApiModelOutline1.m((Function)object2, (Object)object.getAudioSessionId());
            if (audioEffect.setEnabled(true) != 0) {
                object = gsl.a;
                ((heg)((heg)a.f()).j("com/google/android/libraries/search/audio/audiosource/impl/AudioEffectUtils", "createAudioEffect", 42, "AudioEffectUtils.java")).u("#audio# Failed to enable audio effect: %s", audioEffect.getDescriptor().uuid);
                break block5;
            }
            object2 = gto.i(audioEffect);
            object = object2;
            try {
                if (audioEffect.getDescriptor() != null) {
                    ((heg)((heg)a.f()).j("com/google/android/libraries/search/audio/audiosource/impl/AudioEffectUtils", "createAudioEffect", 47, "AudioEffectUtils.java")).u("#audio# Using audio effect: %s", audioEffect.getDescriptor().uuid);
                    object = object2;
                }
            }
            catch (RuntimeException runtimeException) {
                object = gsl.a;
                ((heg)((heg)a.f()).j("com/google/android/libraries/search/audio/audiosource/impl/AudioEffectUtils", "createAudioEffect", 52, "AudioEffectUtils.java")).r("#audio# Error in initializing the audio effect.");
            }
        }
        return object;
    }
}

