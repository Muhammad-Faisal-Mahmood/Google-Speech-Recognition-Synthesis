/*
 * Decompiled with CFR 0.152.
 */
public final class eza
implements bop {
    private final int a;

    public /* synthetic */ eza(int n2) {
        this.a = n2;
    }

    @Override
    public final void a(String string) {
        if (this.a != 0) {
            ((heg)((heg)bwp.a.f()).j("com/google/android/apps/speech/tts/googletts/service/NativeLibraryLoader", "start", 37, "NativeLibraryLoader.java")).u("%s", string);
            return;
        }
        ((heg)((heg)ezb.a.h()).j("com/google/android/libraries/speech/encoding/OggOpusInputStream", "maybeInitNativeOggOpusLib", 57, "OggOpusInputStream.java")).u("%s", string);
    }
}

