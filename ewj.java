/*
 * Decompiled with CFR 0.152.
 */
public final class ewj {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/utils/AudioParamsOptimizationUtils");

    public static int a(int n2) {
        try {
            int n3 = ewj.b(n2);
            return n3;
        }
        catch (RuntimeException runtimeException) {
            ((heg)((heg)a.h().h(hfo.a, "ALT.OptimizationUtils")).j("com/google/android/libraries/search/audio/utils/AudioParamsOptimizationUtils", "getBytesPerSample", 120, "AudioParamsOptimizationUtils.java")).s("#audio# invalid encoding(%d), fallback to PCM_16BIT", n2);
            return 2;
        }
    }

    public static int b(int n2) {
        if (n2 != 2) {
            if (n2 != 3) {
                if (n2 != 4 && n2 != 22) {
                    throw new IllegalArgumentException();
                }
                return 4;
            }
            return 1;
        }
        return 2;
    }

    public static int c(eae eae2) {
        return ewj.a(eae2.f) * Integer.bitCount(eae2.e) * eae2.d;
    }

    public static int d(eae eae2) {
        int n2 = ewj.a(eae2.f);
        double d2 = ewj.c(eae2);
        double d3 = n2;
        return Long.valueOf((long)Math.floor(d2 * 2.0E7 / 1.0E9 / d3) * (long)n2).intValue();
    }
}

