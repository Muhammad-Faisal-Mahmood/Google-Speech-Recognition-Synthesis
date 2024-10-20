/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioTimestamp
 *  android.view.View
 */
import android.media.AudioTimestamp;
import android.view.View;
import com.android.car.ui.FocusArea;
import java.lang.ref.WeakReference;

public final class elq {
    public final long a;
    public final Object b;

    public elq(long l2, AudioTimestamp audioTimestamp) {
        this.a = l2;
        this.b = audioTimestamp;
    }

    private elq(long l2, String string) {
        this.a = l2;
        this.b = string;
    }

    public elq(View view, long l2) {
        this.b = new WeakReference<View>(view);
        this.a = l2;
    }

    public elq(FocusArea focusArea, long l2) {
        this.b = new WeakReference<FocusArea>(focusArea);
        this.a = l2;
    }

    public static elq a(long l2, String string) {
        dde.f(string);
        dec.o("compressedSize", l2);
        return new elq(l2, string);
    }

    public static elq b(den den2) {
        return elq.a(den2.c(), den2.k());
    }

    public static elq c() {
        return elq.a(0L, null);
    }
}

