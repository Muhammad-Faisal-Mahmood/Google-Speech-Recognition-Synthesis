/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

public final class eer
implements Callable {
    public final eev a;
    public final long b;
    public final int c;

    public /* synthetic */ eer(eev eev2, long l2, int n2) {
        this.a = eev2;
        this.b = l2;
        this.c = n2;
    }

    /*
     * Unable to fully structure code
     */
    public final Object call() {
        block11: {
            var9_1 = this.a;
            if (var9_1.h.get() || var9_1.l.bH()) break block11;
            var6_2 = this.b;
            if (eev.f(var9_1.j)) {
                var9_1.j = var6_2;
                ((heg)eev.a.c().h(hfo.a, "ALT.ProcStartTime").j("com/google/android/libraries/search/audio/audiobuffer/processing/AudioStartTimeProcessor", "processInternal", 107, "AudioStartTimeProcessor.kt")).u("#audio# processor(%s) audio start time computation started", var9_1.g);
            }
            if ((var1_3 = this.c) <= 0) ** GOTO lbl-1000
            var2_5 = var4_4 = var9_1.k;
            if (eev.f(var4_4)) {
                var2_5 = var9_1.j;
            }
            if (var6_2 - var2_5 >= jse.m((var4_4 = ekn.c(var1_3, var9_1.f)) - eev.d.toNanos(), var4_4 / 2L)) {
                var8_6 = eev.f(var9_1.k) ? ews.c : ews.b;
            } else if (ekn.c(var9_1.i + var1_3, var9_1.f) >= eev.b.toNanos()) {
                ((heg)eev.a.h().h(hfo.a, "ALT.ProcStartTime").j("com/google/android/libraries/search/audio/audiobuffer/processing/AudioStartTimeProcessor", "maybeEnoughProcessedForCompletion", 147, "AudioStartTimeProcessor.kt")).u("#audio# processor(%s) reached maximum received audio", var9_1.g);
                var8_6 = ews.d;
            } else if (cgw.o() - var9_1.j >= eev.c.toNanos()) {
                ((heg)eev.a.h().h(hfo.a, "ALT.ProcStartTime").j("com/google/android/libraries/search/audio/audiobuffer/processing/AudioStartTimeProcessor", "maybeEnoughProcessedForCompletion", 153, "AudioStartTimeProcessor.kt")).u("#audio# processor(%s) reached maximum computation time", var9_1.g);
                var8_6 = ews.e;
            } else {
                var8_6 = null;
            }
            if (var8_6 != null) {
                if (var8_6 != ews.b) {
                    var9_1.e(var6_2, var1_3);
                }
                var9_1.d(var8_6);
            } else {
                var9_1.e(var6_2, var1_3);
            }
        }
        return jon.a;
    }
}

