/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobScheduler
 *  android.graphics.Rect
 *  android.os.Bundle
 *  android.speech.ModelDownloadListener
 *  android.speech.RecognitionPart
 *  android.speech.RecognitionPart$Builder
 *  android.speech.RecognitionService$Callback
 *  android.view.VelocityTracker
 *  android.view.ViewConfiguration
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 *  android.widget.TextView
 *  android.window.BackEvent
 */
import android.app.job.JobScheduler;
import android.graphics.Rect;
import android.os.Bundle;
import android.speech.ModelDownloadListener;
import android.speech.RecognitionPart;
import android.speech.RecognitionService;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import android.window.BackEvent;

public final class mk$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ float m(VelocityTracker velocityTracker, int n2) {
        return velocityTracker.getAxisVelocity(n2);
    }

    public static /* bridge */ /* synthetic */ float m(BackEvent backEvent) {
        return backEvent.getTouchX();
    }

    public static /* bridge */ /* synthetic */ int m(ViewConfiguration viewConfiguration, int n2, int n3, int n4) {
        return viewConfiguration.getScaledMinimumFlingVelocity(n2, n3, n4);
    }

    public static /* bridge */ /* synthetic */ int m(BackEvent backEvent) {
        return backEvent.getSwipeEdge();
    }

    public static /* bridge */ /* synthetic */ JobScheduler m(JobScheduler jobScheduler, String string) {
        return jobScheduler.forNamespace(string);
    }

    public static /* bridge */ /* synthetic */ ModelDownloadListener m(Object object) {
        return (ModelDownloadListener)object;
    }

    public static /* bridge */ /* synthetic */ RecognitionPart.Builder m(RecognitionPart.Builder builder, int n2) {
        return builder.setConfidenceLevel(n2);
    }

    public static /* bridge */ /* synthetic */ RecognitionPart.Builder m(RecognitionPart.Builder builder, long l2) {
        return builder.setTimestampMillis(l2);
    }

    public static /* bridge */ /* synthetic */ RecognitionPart.Builder m(RecognitionPart.Builder builder, String string) {
        return builder.setFormattedText(string);
    }

    public static /* bridge */ /* synthetic */ RecognitionPart m(RecognitionPart.Builder builder) {
        return builder.build();
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static /* bridge */ /* synthetic */ CharSequence m(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static /* bridge */ /* synthetic */ Object m(kar kar2, Class clazz) {
        return kar2.get(clazz);
    }

    public static /* bridge */ /* synthetic */ void m(ModelDownloadListener modelDownloadListener) {
        modelDownloadListener.onScheduled();
    }

    public static /* bridge */ /* synthetic */ void m(ModelDownloadListener modelDownloadListener, int n2) {
        modelDownloadListener.onError(n2);
    }

    public static /* bridge */ /* synthetic */ void m(RecognitionService.Callback callback, Bundle bundle) {
        callback.languageDetection(bundle);
    }

    public static /* bridge */ /* synthetic */ void m(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static /* bridge */ /* synthetic */ void m(TextView textView, int n2, float f2) {
        textView.setLineHeight(n2, f2);
    }

    public static /* bridge */ /* synthetic */ boolean m(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static /* bridge */ /* synthetic */ float m$1(BackEvent backEvent) {
        return backEvent.getTouchY();
    }

    public static /* bridge */ /* synthetic */ int m$1(ViewConfiguration viewConfiguration, int n2, int n3, int n4) {
        return viewConfiguration.getScaledMaximumFlingVelocity(n2, n3, n4);
    }

    public static /* bridge */ /* synthetic */ void m$1(ModelDownloadListener modelDownloadListener) {
        modelDownloadListener.onSuccess();
    }

    public static /* bridge */ /* synthetic */ void m$1(ModelDownloadListener modelDownloadListener, int n2) {
        modelDownloadListener.onProgress(n2);
    }

    public static /* bridge */ /* synthetic */ float m$2(BackEvent backEvent) {
        return backEvent.getProgress();
    }
}

