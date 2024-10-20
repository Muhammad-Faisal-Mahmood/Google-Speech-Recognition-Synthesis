/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.AppOpsManager
 *  android.app.ApplicationExitInfo
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.graphics.Insets
 *  android.graphics.Outline
 *  android.graphics.Path
 *  android.graphics.drawable.Icon
 *  android.net.Uri
 *  android.os.UserHandle
 *  android.os.ext.SdkExtensions
 *  android.os.storage.StorageVolume
 *  android.telephony.TelephonyDisplayInfo
 *  android.view.Display
 *  android.view.SurfaceControlViewHost
 *  android.view.SurfaceControlViewHost$SurfacePackage
 *  android.view.View
 *  android.view.Window
 *  android.view.WindowInsets
 *  android.view.WindowInsets$Builder
 *  android.view.WindowInsets$Type
 *  android.view.WindowInsetsAnimation
 *  android.view.WindowInsetsAnimation$Bounds
 *  android.view.WindowInsetsController
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  android.view.WindowMetrics
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 *  android.view.inputmethod.EditorInfo
 */
import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.UserHandle;
import android.os.ext.SdkExtensions;
import android.os.storage.StorageVolume;
import android.telephony.TelephonyDisplayInfo;
import android.view.Display;
import android.view.SurfaceControlViewHost;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.WindowInsetsController;
import android.view.WindowInsetsController$OnControllableInsetsChangedListener;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import java.io.File;
import java.io.InputStream;
import java.util.List;

public final class sk$$ExternalSyntheticApiModelOutline1 {
    public static /* bridge */ /* synthetic */ float m(WindowInsetsAnimation windowInsetsAnimation) {
        return windowInsetsAnimation.getFraction();
    }

    public static /* bridge */ /* synthetic */ int m() {
        return WindowInsets.Type.ime();
    }

    public static /* bridge */ /* synthetic */ int m(int n2) {
        return SdkExtensions.getExtensionVersion((int)n2);
    }

    public static /* bridge */ /* synthetic */ int m(AppOpsManager appOpsManager, String string, int n2, String string2, String string3, String string4) {
        return appOpsManager.noteOp(string, n2, string2, string3, string4);
    }

    public static /* bridge */ /* synthetic */ int m(ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo.getReason();
    }

    public static /* bridge */ /* synthetic */ int m(TelephonyDisplayInfo telephonyDisplayInfo) {
        return telephonyDisplayInfo.getOverrideNetworkType();
    }

    public static /* bridge */ /* synthetic */ int m(WindowInsetsAnimation windowInsetsAnimation) {
        return windowInsetsAnimation.getTypeMask();
    }

    public static /* bridge */ /* synthetic */ int m(WindowInsetsController windowInsetsController) {
        return windowInsetsController.getSystemBarsBehavior();
    }

    public static /* bridge */ /* synthetic */ long m(ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo.getTimestamp();
    }

    public static /* bridge */ /* synthetic */ long m(WindowInsetsAnimation windowInsetsAnimation) {
        return windowInsetsAnimation.getDurationMillis();
    }

    public static /* bridge */ /* synthetic */ ApplicationExitInfo m(Object object) {
        return (ApplicationExitInfo)object;
    }

    public static /* bridge */ /* synthetic */ Context m(Context context, String string) {
        return context.createAttributionContext(string);
    }

    public static /* bridge */ /* synthetic */ Insets m(WindowInsets windowInsets, int n2) {
        return windowInsets.getInsets(n2);
    }

    public static /* bridge */ /* synthetic */ Insets m(WindowInsetsAnimation.Bounds bounds) {
        return bounds.getLowerBound();
    }

    public static /* bridge */ /* synthetic */ Icon m(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri((Uri)uri);
    }

    public static /* bridge */ /* synthetic */ Display m(Context context) {
        return context.getDisplay();
    }

    public static /* bridge */ /* synthetic */ SurfaceControlViewHost.SurfacePackage m(SurfaceControlViewHost surfaceControlViewHost) {
        return surfaceControlViewHost.getSurfacePackage();
    }

    public static /* bridge */ /* synthetic */ View m(SurfaceControlViewHost surfaceControlViewHost) {
        return surfaceControlViewHost.getView();
    }

    public static /* bridge */ /* synthetic */ WindowInsets.Builder m(WindowInsets.Builder builder, int n2, Insets insets) {
        return builder.setInsets(n2, insets);
    }

    public static /* bridge */ /* synthetic */ WindowInsets m() {
        return WindowInsets.CONSUMED;
    }

    public static /* bridge */ /* synthetic */ WindowInsets m(WindowMetrics windowMetrics) {
        return windowMetrics.getWindowInsets();
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation m(Object object) {
        return (WindowInsetsAnimation)object;
    }

    public static /* bridge */ /* synthetic */ WindowInsetsController m(View view) {
        return view.getWindowInsetsController();
    }

    public static /* bridge */ /* synthetic */ WindowInsetsController m(Window window) {
        return window.getInsetsController();
    }

    public static /* bridge */ /* synthetic */ WindowMetrics m(WindowManager windowManager) {
        return windowManager.getCurrentWindowMetrics();
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
    }

    public static /* bridge */ /* synthetic */ File m(StorageVolume storageVolume) {
        return storageVolume.getDirectory();
    }

    public static /* bridge */ /* synthetic */ InputStream m(ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo.getTraceInputStream();
    }

    public static /* bridge */ /* synthetic */ CharSequence m(View view) {
        return view.getStateDescription();
    }

    public static /* bridge */ /* synthetic */ CharSequence m(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static /* bridge */ /* synthetic */ String m(ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo.getDescription();
    }

    public static /* bridge */ /* synthetic */ String m(Context context) {
        return context.getAttributionTag();
    }

    public static /* bridge */ /* synthetic */ List m(ActivityManager activityManager, String string, int n2, int n3) {
        return activityManager.getHistoricalProcessExitReasons(string, n2, n3);
    }

    public static /* bridge */ /* synthetic */ void m(AppOpsManager appOpsManager, String string, int n2, String string2, String string3) {
        appOpsManager.finishOp(string, n2, string2, string3);
    }

    public static /* bridge */ /* synthetic */ void m(Outline outline, Path path) {
        outline.setPath(path);
    }

    public static /* bridge */ /* synthetic */ void m(SurfaceControlViewHost surfaceControlViewHost, int n2, int n3) {
        surfaceControlViewHost.relayout(n2, n3);
    }

    public static /* bridge */ /* synthetic */ void m(SurfaceControlViewHost surfaceControlViewHost, View view, int n2, int n3) {
        surfaceControlViewHost.setView(view, n2, n3);
    }

    public static /* bridge */ /* synthetic */ void m(View view, WindowInsetsAnimation$Callback windowInsetsAnimation$Callback) {
        view.setWindowInsetsAnimationCallback(windowInsetsAnimation$Callback);
    }

    public static /* bridge */ /* synthetic */ void m(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }

    public static /* bridge */ /* synthetic */ void m(Window window, boolean bl2) {
        window.setDecorFitsSystemWindows(bl2);
    }

    public static /* bridge */ /* synthetic */ void m(WindowInsetsAnimation windowInsetsAnimation, float f2) {
        windowInsetsAnimation.setFraction(f2);
    }

    public static /* bridge */ /* synthetic */ void m(WindowInsetsController windowInsetsController, int n2) {
        windowInsetsController.show(n2);
    }

    public static /* bridge */ /* synthetic */ void m(WindowInsetsController windowInsetsController, int n2, int n3) {
        windowInsetsController.setSystemBarsAppearance(n2, n3);
    }

    public static /* bridge */ /* synthetic */ void m(WindowInsetsController windowInsetsController, WindowInsetsController$OnControllableInsetsChangedListener windowInsetsController$OnControllableInsetsChangedListener) {
        windowInsetsController.addOnControllableInsetsChangedListener(windowInsetsController$OnControllableInsetsChangedListener);
    }

    public static /* bridge */ /* synthetic */ void m(WindowManager.LayoutParams layoutParams, int n2) {
        layoutParams.setFitInsetsTypes(n2);
    }

    public static /* bridge */ /* synthetic */ void m(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static /* bridge */ /* synthetic */ void m(EditorInfo editorInfo, CharSequence charSequence, int n2) {
        editorInfo.setInitialSurroundingSubText(charSequence, n2);
    }

    public static /* bridge */ /* synthetic */ boolean m() {
        return ActivityManager.isLowMemoryKillReportSupported();
    }

    public static /* bridge */ /* synthetic */ boolean m(Context context, Intent intent, ServiceConnection serviceConnection, int n2, UserHandle userHandle) {
        return context.bindServiceAsUser(intent, serviceConnection, n2, userHandle);
    }

    public static /* bridge */ /* synthetic */ boolean m(WindowInsets windowInsets, int n2) {
        return windowInsets.isVisible(n2);
    }

    public static /* bridge */ /* synthetic */ float m$1(WindowInsetsAnimation windowInsetsAnimation) {
        return windowInsetsAnimation.getInterpolatedFraction();
    }

    public static /* bridge */ /* synthetic */ int m$1() {
        return WindowInsets.Type.statusBars();
    }

    public static /* bridge */ /* synthetic */ int m$1(AppOpsManager appOpsManager, String string, int n2, String string2, String string3, String string4) {
        return appOpsManager.startOp(string, n2, string2, string3, string4);
    }

    public static /* bridge */ /* synthetic */ int m$1(ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo.getImportance();
    }

    public static /* bridge */ /* synthetic */ long m$1(ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo.getPss();
    }

    public static /* bridge */ /* synthetic */ Insets m$1(WindowInsetsAnimation.Bounds bounds) {
        return bounds.getUpperBound();
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m$1() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
    }

    public static /* bridge */ /* synthetic */ String m$1(ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo.getProcessName();
    }

    public static /* bridge */ /* synthetic */ void m$1(WindowInsetsController windowInsetsController, int n2) {
        windowInsetsController.hide(n2);
    }

    public static /* bridge */ /* synthetic */ void m$1(WindowInsetsController windowInsetsController, WindowInsetsController$OnControllableInsetsChangedListener windowInsetsController$OnControllableInsetsChangedListener) {
        windowInsetsController.removeOnControllableInsetsChangedListener(windowInsetsController$OnControllableInsetsChangedListener);
    }

    public static /* bridge */ /* synthetic */ int m$2() {
        return WindowInsets.Type.navigationBars();
    }

    public static /* bridge */ /* synthetic */ int m$2(ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo.getPid();
    }

    public static /* bridge */ /* synthetic */ long m$2(ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo.getRss();
    }

    public static /* bridge */ /* synthetic */ void m$2(WindowInsetsController windowInsetsController, int n2) {
        windowInsetsController.setSystemBarsBehavior(n2);
    }

    public static /* bridge */ /* synthetic */ int m$3() {
        return WindowInsets.Type.displayCutout();
    }

    public static /* bridge */ /* synthetic */ int m$3(ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo.getStatus();
    }

    public static /* bridge */ /* synthetic */ int m$4() {
        return WindowInsets.Type.systemBars();
    }

    public static /* bridge */ /* synthetic */ int m$5() {
        return WindowInsets.Type.tappableElement();
    }

    public static /* bridge */ /* synthetic */ int m$6() {
        return WindowInsets.Type.mandatorySystemGestures();
    }

    public static /* bridge */ /* synthetic */ int m$7() {
        return WindowInsets.Type.systemGestures();
    }

    public static /* bridge */ /* synthetic */ int m$8() {
        return WindowInsets.Type.captionBar();
    }
}

