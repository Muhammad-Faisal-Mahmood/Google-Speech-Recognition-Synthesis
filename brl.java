/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.apps.speech.tts.googletts.audio.AndroidDecoder;
import java.nio.ByteBuffer;

public final class brl
implements brn {
    final AndroidDecoder a;

    public brl(AndroidDecoder androidDecoder) {
        this.a = androidDecoder;
    }

    @Override
    public final void a() {
        AndroidDecoder androidDecoder = this.a;
        androidDecoder.jniDecoderCompleted(androidDecoder.c);
    }

    @Override
    public final void b(iim iim2) {
        AndroidDecoder androidDecoder = this.a;
        androidDecoder.jniDecoderStopped(androidDecoder.c, iim2.g);
        this.a.directAudioBuffer.clear();
    }

    @Override
    public final boolean c(ByteBuffer byteBuffer) {
        int n2 = byteBuffer.limit();
        for (int i2 = byteBuffer.position(); i2 < n2; i2 += this.a.b) {
            int n3 = Math.min(n2, this.a.b + i2);
            byteBuffer.position(i2).limit(n3);
            this.a.directAudioBuffer.put(byteBuffer).flip();
            AndroidDecoder androidDecoder = this.a;
            n3 = androidDecoder.jniDecoderAudioAvailable(androidDecoder.c, androidDecoder.directAudioBuffer.limit());
            if (n3 < 0) {
                ((heg)((heg)AndroidDecoder.a.g()).j("com/google/android/apps/speech/tts/googletts/audio/AndroidDecoder$AndroidDecoderCallback", "audioAvailable", 178, "AndroidDecoder.java")).r("Native code failed to process audio buffer");
                return false;
            }
            this.a.directAudioBuffer.position(n3);
            if (this.a.directAudioBuffer.hasRemaining()) {
                ((heg)((heg)AndroidDecoder.a.g()).j("com/google/android/apps/speech/tts/googletts/audio/AndroidDecoder$AndroidDecoderCallback", "audioAvailable", 185, "AndroidDecoder.java")).r("Audio buffer has audio remaining from last call");
                return false;
            }
            this.a.directAudioBuffer.clear();
        }
        return true;
    }

    @Override
    public final void d() {
    }
}

