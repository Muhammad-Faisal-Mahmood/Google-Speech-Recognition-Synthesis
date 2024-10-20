/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobInfo$Builder
 *  android.media.LoudnessCodecController
 *  android.media.MediaCodec
 *  android.view.View
 */
import android.app.job.JobInfo;
import android.media.LoudnessCodecController;
import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.view.View;
import java.util.concurrent.Executor;

public final class ki$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ JobInfo.Builder m(JobInfo.Builder builder, String string) {
        return builder.setTraceTag(string);
    }

    public static /* bridge */ /* synthetic */ LoudnessCodecController m(int n2, Executor executor, LoudnessCodecController$OnLoudnessCodecUpdateListener loudnessCodecController$OnLoudnessCodecUpdateListener) {
        return LoudnessCodecController.create((int)n2, (Executor)executor, (LoudnessCodecController$OnLoudnessCodecUpdateListener)loudnessCodecController$OnLoudnessCodecUpdateListener);
    }

    public static /* bridge */ /* synthetic */ LoudnessCodecController m(Object object) {
        return (LoudnessCodecController)object;
    }

    public static /* bridge */ /* synthetic */ void m(LoudnessCodecController loudnessCodecController) {
        loudnessCodecController.close();
    }

    public static /* bridge */ /* synthetic */ void m(LoudnessCodecController loudnessCodecController, MediaCodec mediaCodec) {
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public static /* bridge */ /* synthetic */ void m(View view, float f2) {
        view.setFrameContentVelocity(f2);
    }

    public static /* bridge */ /* synthetic */ boolean m(LoudnessCodecController loudnessCodecController, MediaCodec mediaCodec) {
        return loudnessCodecController.addMediaCodec(mediaCodec);
    }
}

