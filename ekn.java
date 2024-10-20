/*
 * Decompiled with CFR 0.152.
 */
public final class ekn {
    private static final hei a = hei.m("com/google/android/libraries/search/audio/core/common/AudioBufferUtils");

    public static int a(eae eae2, int n2) {
        return ewj.c(eae2) * n2;
    }

    public static int b(eae eae2) {
        int n2 = eae2.b;
        int n3 = 8;
        if ((n2 = (n2 & 0x10) != 0 ? eae2.g : 8) <= 0) {
            ((heg)((heg)a.h().h(hfo.a, "ALT.BufferCalcUtils")).j("com/google/android/libraries/search/audio/core/common/AudioBufferUtils", "getCustomAudioBufferSize", 88, "AudioBufferUtils.java")).r("#audio# The length of buffered audio cannot be 0 or less, using the default.");
            n2 = n3;
        }
        n3 = n2;
        if (n2 > 20) {
            ((heg)((heg)a.h().h(hfo.a, "ALT.BufferCalcUtils")).j("com/google/android/libraries/search/audio/core/common/AudioBufferUtils", "getCustomAudioBufferSize", 93, "AudioBufferUtils.java")).r("#audio# The length of buffered audio cannot exceed 20 seconds.");
            n3 = 20;
        }
        return ekn.a(eae2, n3);
    }

    public static long c(int n2, eae eae2) {
        long l2 = ewj.c(eae2);
        return (long)n2 * 1000000000L / l2;
    }
}

