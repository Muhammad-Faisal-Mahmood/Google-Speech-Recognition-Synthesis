/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.ArrayMap
 *  android.view.FrameMetrics
 *  android.view.Window
 */
import android.content.Context;
import android.util.ArrayMap;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;

public final class doy
implements Window$OnFrameMetricsAvailableListener {
    private boolean a;
    private long b;
    private dpk c;
    private final ArrayMap d;
    private final gui e;
    private final jnu f;

    public doy(Context context, ArrayMap arrayMap, jnu jnu2) {
        this.e = fvd.ap(new aim(context, 15));
        this.d = arrayMap;
        this.f = jnu2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onFrameMetricsAvailable(Window object, FrameMetrics object2, int n2) {
        Object object3;
        if (!this.a) {
            this.a = true;
            object3 = dpk.b() ? new dpk() : null;
            this.c = object3;
            this.b = this.f.b() != null && (Boolean)this.f.b() != false ? (long)(1.0E9f / object.getWindowManager().getDefaultDisplay().getRefreshRate()) : (Long)this.e.a();
        }
        if (ag$$ExternalSyntheticApiModelOutline1.m(object2, 9) == 1L) {
            object = this.c;
            if (object != null) {
                ((dpk)object).a((FrameMetrics)object2, this.b);
            }
            return;
        }
        long l2 = ag$$ExternalSyntheticApiModelOutline1.m(object2, 8);
        object = this.c;
        long l3 = object != null ? ((dpk)object).a((FrameMetrics)object2, this.b) : this.b;
        long l4 = ag$$ExternalSyntheticApiModelOutline1.m(object2, 13);
        object = this.d;
        synchronized (object) {
            int n3 = object.size();
            int n4 = 0;
            while (n4 < n3) {
                object2 = (dpb)object.valueAt(n4);
                int n5 = (int)(l2 / 1000000L);
                if ((long)n5 < 0L) {
                    ((heg)((heg)dkc.a.e()).j("com/google/android/libraries/performance/primes/metrics/jank/FrameTimeHistogram", "addFrame", 84, "FrameTimeHistogram.java")).t("Invalid frame time: %d", l2);
                    ++object2.i;
                } else {
                    int n6;
                    ++object2.h;
                    if (l4 > 0L) {
                        n6 = (int)((l2 - l4) / 1000000L);
                        if (object2.n < n6) {
                            object2.n = n6;
                        }
                        object3 = object2.e;
                        n6 = n6 < 20 ? (n6 >= -20 ? (n6 + 20 >> 1) + 12 : (n6 >= -30 ? (n6 + 30) / 5 + 10 : (n6 >= -100 ? (n6 + 100) / 10 + 3 : (n6 >= -200 ? (n6 + 200) / 50 + 1 : 0)))) : (n6 < 30 ? (n6 - 20) / 5 + 32 : (n6 < 100 ? (n6 - 30) / 10 + 34 : (n6 < 200 ? (n6 - 50) / 100 + 41 : (n6 < 1000 ? (n6 - 200) / 100 + 43 : 51))));
                        object3[n6] = object3[n6] + true;
                        if (l2 > l4) {
                            ++object2.f;
                            object2.k += n5;
                        }
                        if (l2 > l3) {
                            ++object2.g;
                            object2.l += n5;
                        }
                    } else if (l2 > l3) {
                        ++object2.f;
                        object2.k += n5;
                    }
                    object3 = object2.d;
                    n6 = n5 <= 20 ? (n5 >= 8 ? (n5 >> 1) - 2 : n5 / 4) : (n5 <= 30 ? n5 / 5 + 4 : (n5 <= 100 ? n5 / 10 + 7 : (n5 <= 200 ? n5 / 50 + 15 : (n5 <= 1000 ? n5 / 100 + 17 : 27))));
                    object3[n6] = object3[n6] + true;
                    object2.i += n2;
                    if (object2.j < n5) {
                        object2.j = n5;
                    }
                    object2.m += n5;
                }
                ++n4;
            }
            return;
        }
    }
}

