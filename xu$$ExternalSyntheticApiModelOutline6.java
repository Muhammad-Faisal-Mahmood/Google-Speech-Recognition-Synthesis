/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 *  android.media.AudioAttributes$Builder
 *  android.media.AudioFormat
 *  android.media.AudioManager
 *  android.media.Spatializer
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 */
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.concurrent.Executor;

public final class xu$$ExternalSyntheticApiModelOutline6 {
    public static /* bridge */ /* synthetic */ int m(Spatializer spatializer) {
        return spatializer.getImmersiveAudioLevel();
    }

    public static /* bridge */ /* synthetic */ AudioAttributes.Builder m(AudioAttributes.Builder builder, int n2) {
        return builder.setSpatializationBehavior(n2);
    }

    public static /* bridge */ /* synthetic */ Spatializer m(AudioManager audioManager) {
        return audioManager.getSpatializer();
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
    }

    public static /* bridge */ /* synthetic */ void m(Spatializer spatializer, Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener) {
        spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
    }

    public static /* bridge */ /* synthetic */ void m(Spatializer spatializer, Executor executor, Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener) {
        spatializer.addOnSpatializerStateChangedListener(executor, spatializer$OnSpatializerStateChangedListener);
    }

    public static /* bridge */ /* synthetic */ boolean m(Spatializer spatializer) {
        return spatializer.isAvailable();
    }

    public static /* bridge */ /* synthetic */ boolean m(Spatializer spatializer, AudioAttributes audioAttributes, AudioFormat audioFormat) {
        return spatializer.canBeSpatialized(audioAttributes, audioFormat);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m$1() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
    }

    public static /* bridge */ /* synthetic */ boolean m$1(Spatializer spatializer) {
        return spatializer.isEnabled();
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m$2() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
    }
}

