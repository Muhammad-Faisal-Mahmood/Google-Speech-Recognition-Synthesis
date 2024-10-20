/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.app.Activity
 *  android.app.LocaleManager
 *  android.graphics.text.LineBreakConfig
 *  android.graphics.text.LineBreakConfig$Builder
 *  android.os.Bundle
 *  android.os.LocaleList
 *  android.os.Process
 *  android.speech.RecognitionService$Callback
 *  android.speech.RecognitionService$SupportCallback
 *  android.speech.RecognitionSupport
 *  android.speech.RecognitionSupport$Builder
 *  android.text.StaticLayout$Builder
 *  android.view.View
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 *  android.widget.AbsListView
 *  android.window.OnBackInvokedDispatcher
 */
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$DurationScaleChangeListener;
import android.app.Activity;
import android.app.LocaleManager;
import android.graphics.text.LineBreakConfig;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Process;
import android.speech.RecognitionService;
import android.speech.RecognitionSupport;
import android.text.StaticLayout;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AbsListView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.List;

public final class a$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ float m() {
        return ValueAnimator.getDurationScale();
    }

    public static /* bridge */ /* synthetic */ LocaleManager m(Object object) {
        return (LocaleManager)object;
    }

    public static /* bridge */ /* synthetic */ LineBreakConfig.Builder m(LineBreakConfig.Builder builder, int n2) {
        return builder.setLineBreakWordStyle(n2);
    }

    public static /* bridge */ /* synthetic */ LineBreakConfig m(LineBreakConfig.Builder builder) {
        return builder.build();
    }

    public static /* bridge */ /* synthetic */ LocaleList m(LocaleManager localeManager) {
        return localeManager.getApplicationLocales();
    }

    public static /* bridge */ /* synthetic */ RecognitionSupport.Builder m(RecognitionSupport.Builder builder, List list) {
        return builder.setSupportedOnDeviceLanguages(list);
    }

    public static /* bridge */ /* synthetic */ RecognitionSupport m(RecognitionSupport.Builder builder) {
        return builder.build();
    }

    public static /* bridge */ /* synthetic */ StaticLayout.Builder m(StaticLayout.Builder builder, LineBreakConfig lineBreakConfig) {
        return builder.setLineBreakConfig(lineBreakConfig);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher m(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher m(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher m(ms ms2) {
        return ms2.getOnBackInvokedDispatcher();
    }

    public static /* bridge */ /* synthetic */ Object m(Bundle bundle, String string, Class clazz) {
        return bundle.getParcelable(string, clazz);
    }

    public static /* bridge */ /* synthetic */ String m(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static /* bridge */ /* synthetic */ void m(LocaleManager localeManager, LocaleList localeList) {
        localeManager.setApplicationLocales(localeList);
    }

    public static /* bridge */ /* synthetic */ void m(RecognitionService.Callback callback) {
        callback.endOfSegmentedSession();
    }

    public static /* bridge */ /* synthetic */ void m(RecognitionService.Callback callback, Bundle bundle) {
        callback.segmentResults(bundle);
    }

    public static /* bridge */ /* synthetic */ void m(RecognitionService.SupportCallback supportCallback, int n2) {
        supportCallback.onError(n2);
    }

    public static /* bridge */ /* synthetic */ void m(RecognitionService.SupportCallback supportCallback, RecognitionSupport recognitionSupport) {
        supportCallback.onSupportResult(recognitionSupport);
    }

    public static /* bridge */ /* synthetic */ void m(AbsListView absListView, boolean bl2) {
        absListView.setSelectedChildViewEnabled(bl2);
    }

    public static /* bridge */ /* synthetic */ void m(OnBackInvokedDispatcher onBackInvokedDispatcher, int n2, OnBackInvokedCallback onBackInvokedCallback) {
        onBackInvokedDispatcher.registerOnBackInvokedCallback(n2, onBackInvokedCallback);
    }

    public static /* bridge */ /* synthetic */ void m(OnBackInvokedDispatcher onBackInvokedDispatcher, OnBackInvokedCallback onBackInvokedCallback) {
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
    }

    public static /* bridge */ /* synthetic */ boolean m() {
        return Process.isSdkSandbox();
    }

    public static /* bridge */ /* synthetic */ boolean m(ValueAnimator.DurationScaleChangeListener durationScaleChangeListener) {
        return ValueAnimator.unregisterDurationScaleChangeListener((ValueAnimator.DurationScaleChangeListener)durationScaleChangeListener);
    }

    public static /* bridge */ /* synthetic */ boolean m(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static /* bridge */ /* synthetic */ boolean m(AbsListView absListView) {
        return absListView.isSelectedChildViewEnabled();
    }

    public static /* bridge */ /* synthetic */ RecognitionSupport.Builder m$1(RecognitionSupport.Builder builder, List list) {
        return builder.setPendingOnDeviceLanguages(list);
    }

    public static /* bridge */ /* synthetic */ boolean m$1(ValueAnimator.DurationScaleChangeListener durationScaleChangeListener) {
        return ValueAnimator.registerDurationScaleChangeListener((ValueAnimator.DurationScaleChangeListener)durationScaleChangeListener);
    }

    public static /* bridge */ /* synthetic */ RecognitionSupport.Builder m$2(RecognitionSupport.Builder builder, List list) {
        return builder.setInstalledOnDeviceLanguages(list);
    }
}

