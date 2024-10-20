/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.FrameMetrics
 */
import android.os.Build;
import android.view.FrameMetrics;

final class dpk {
    long a;

    static boolean b() {
        return Build.VERSION.SDK_INT <= 30;
    }

    public long a(FrameMetrics frameMetrics, long l2) {
        long l3;
        long l4 = ag$$ExternalSyntheticApiModelOutline1.m(frameMetrics, 10);
        long l5 = ag$$ExternalSyntheticApiModelOutline1.m(frameMetrics, 8);
        long l6 = l4 + l5;
        this.a = l3 = Math.max(this.a + l2, l4 + l2);
        if (l6 >= l3 && l5 >= l2) {
            this.a = l6 - (l6 - ag$$ExternalSyntheticApiModelOutline1.m(frameMetrics, 11)) % l2 + l2;
        }
        return l3 - l4;
    }
}

