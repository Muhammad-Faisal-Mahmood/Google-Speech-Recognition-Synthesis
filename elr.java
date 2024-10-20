/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioRecord
 *  android.media.AudioTimestamp
 *  android.os.SystemClock
 */
import android.media.AudioRecord;
import android.media.AudioTimestamp;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

public final class elr {
    private static final hei a = hei.m("com/google/android/libraries/search/audio/core/timestamp/AudioTimestampAdjuster");
    private final eae b;
    private final int c;
    private final long d;
    private long e;
    private long f;
    private long g;
    private final dlm h;

    public elr(AudioRecord object, eae hwv2) {
        long l2;
        jse.e(object, "audioRecord");
        jse.e(hwv2, "audioInputParams");
        object = new dlm((AudioRecord)object);
        jse.e(hwv2, "audioInputParams");
        this.h = object;
        this.b = hwv2;
        this.c = 1000000000 / hwv2.d;
        hwv2 = hwv2.j;
        object = hwv2;
        if (hwv2 == null) {
            object = ead.a;
        }
        long l3 = l2 = (long)object.c;
        if (l2 < 50L) {
            ((heg)((heg)ewj.a.h().h(hfo.a, "ALT.OptimizationUtils")).j("com/google/android/libraries/search/audio/utils/AudioParamsOptimizationUtils", "getTimestampPollingIntervalMillis", 107, "AudioParamsOptimizationUtils.java")).t("#audio# timestamp polling interval is smaller than min value(%s), using min value", 50L);
            l3 = 50L;
        }
        this.d = l3;
        this.e = -l3;
        this.f = cgw.o();
    }

    private final long b(long l2) {
        return l2 * (long)this.c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final elq a(int n2) {
        synchronized (this) {
            Object var9_2 = null;
            if (n2 <= 0) {
                return new elq(this.f, null);
            }
            Object object = this.b;
            long l2 = n2 / (ewj.a(((eae)object).f) * Integer.bitCount(((eae)object).e));
            long l3 = this.g + l2;
            long l4 = SystemClock.elapsedRealtime();
            object = var9_2;
            if (l4 - this.e >= this.d) {
                block10: {
                    this.e = l4;
                    dlm dlm2 = this.h;
                    object = new AudioTimestamp();
                    try {
                        n2 = ag$$ExternalSyntheticApiModelOutline1.m((AudioRecord)dlm2.a, (AudioTimestamp)object, 1);
                        if (n2 != 0) break block10;
                    }
                    catch (RuntimeException runtimeException) {}
                }
                object = null;
                if (object == null) {
                    ((heg)((heg)a.h().h(hfo.a, "ALT.TimestampAdjuster")).g(1, TimeUnit.SECONDS).j("com/google/android/libraries/search/audio/core/timestamp/AudioTimestampAdjuster", "getAndroidTimestampOrNull", 103, "AudioTimestampAdjuster.kt")).r("#audio# unable to retrieve audio timestamp");
                    object = var9_2;
                }
            }
            if (object != null) {
                if (((AudioTimestamp)object).framePosition != l3) {
                    ((heg)((heg)a.c().h(hfo.a, "ALT.TimestampAdjuster")).g(1, TimeUnit.SECONDS).j("com/google/android/libraries/search/audio/core/timestamp/AudioTimestampAdjuster", "getTimestampElapsedNanos", 79, "AudioTimestampAdjuster.kt")).y("#audio# timestamps: received(frame@%d) vs expected(frame@%d)", ((AudioTimestamp)object).framePosition, l3);
                }
                l2 = ((AudioTimestamp)object).framePosition;
                l4 = ((AudioTimestamp)object).nanoTime;
                l2 = this.b(l3 - l2);
            } else {
                l4 = this.f;
                l2 = this.b(l2);
            }
            this.f = l2 = l4 + l2;
            this.g = l3;
            return new elq(l2, (AudioTimestamp)object);
        }
    }
}

