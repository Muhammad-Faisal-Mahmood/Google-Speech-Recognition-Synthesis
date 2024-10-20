/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Notification$Action$Builder
 *  android.app.job.JobInfo$Builder
 *  android.app.job.JobParameters
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.graphics.Bitmap
 *  android.graphics.Picture
 *  android.graphics.Typeface
 *  android.graphics.drawable.Icon
 *  android.media.AudioDeviceInfo
 *  android.net.LinkProperties
 *  android.net.Network
 *  android.net.NetworkRequest
 *  android.net.TrafficStats
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Process
 *  android.telephony.SignalStrength
 *  android.telephony.TelephonyManager
 *  android.view.DisplayCutout
 *  android.view.View
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.WindowInsets
 *  android.view.WindowManager$LayoutParams
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 *  android.widget.TextView
 */
import android.app.Application;
import android.app.Notification;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.media.AudioDeviceInfo;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.lang.ref.Reference;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

public final class fs$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ int m() {
        return TrafficStats.getThreadStatsUid();
    }

    public static /* bridge */ /* synthetic */ int m(Typeface typeface) {
        return typeface.getWeight();
    }

    public static /* bridge */ /* synthetic */ int m(Icon icon) {
        return icon.getResId();
    }

    public static /* bridge */ /* synthetic */ int m(DisplayCutout displayCutout) {
        return displayCutout.hashCode();
    }

    public static /* bridge */ /* synthetic */ int m(WindowManager.LayoutParams layoutParams) {
        return layoutParams.layoutInDisplayCutoutMode;
    }

    public static /* bridge */ /* synthetic */ long m(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static /* bridge */ /* synthetic */ Notification.Action.Builder m(Notification.Action.Builder builder, int n2) {
        return builder.setSemanticAction(n2);
    }

    public static /* bridge */ /* synthetic */ JobInfo.Builder m(JobInfo.Builder builder, NetworkRequest networkRequest) {
        return builder.setRequiredNetwork(networkRequest);
    }

    public static /* bridge */ /* synthetic */ JobInfo.Builder m(JobInfo.Builder builder, boolean bl2) {
        return builder.setImportantWhileForeground(bl2);
    }

    public static /* bridge */ /* synthetic */ Bitmap m(Picture picture) {
        return Bitmap.createBitmap((Picture)picture);
    }

    public static /* bridge */ /* synthetic */ Typeface m(Typeface typeface, int n2, boolean bl2) {
        return Typeface.create((Typeface)typeface, (int)n2, (boolean)bl2);
    }

    public static /* bridge */ /* synthetic */ Network m(long l2) {
        return Network.fromNetworkHandle((long)l2);
    }

    public static /* bridge */ /* synthetic */ Network m(JobParameters jobParameters) {
        return jobParameters.getNetwork();
    }

    public static /* bridge */ /* synthetic */ Uri m(Icon icon) {
        return icon.getUri();
    }

    public static /* bridge */ /* synthetic */ Handler m(Looper looper) {
        return Handler.createAsync((Looper)looper);
    }

    public static /* bridge */ /* synthetic */ SignalStrength m(TelephonyManager telephonyManager) {
        return telephonyManager.getSignalStrength();
    }

    public static /* bridge */ /* synthetic */ DisplayCutout m(WindowInsets windowInsets) {
        return windowInsets.getDisplayCutout();
    }

    public static /* bridge */ /* synthetic */ View m(ViewGroup viewGroup, int n2) {
        return viewGroup.requireViewById(n2);
    }

    public static /* bridge */ /* synthetic */ WindowInsets m(WindowInsets windowInsets) {
        return windowInsets.consumeDisplayCutout();
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
    }

    public static /* bridge */ /* synthetic */ CharSequence m(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static /* bridge */ /* synthetic */ CharSequence m(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getTooltipText();
    }

    public static /* bridge */ /* synthetic */ String m() {
        return Application.getProcessName();
    }

    public static /* bridge */ /* synthetic */ String m(Icon icon) {
        return icon.getResPackage();
    }

    public static /* bridge */ /* synthetic */ String m(AudioDeviceInfo audioDeviceInfo) {
        return audioDeviceInfo.getAddress();
    }

    public static /* bridge */ /* synthetic */ String m(LinkProperties linkProperties) {
        return linkProperties.getPrivateDnsServerName();
    }

    public static /* bridge */ /* synthetic */ String m(Type type) {
        return type.getTypeName();
    }

    public static /* bridge */ /* synthetic */ Executor m(Context context) {
        return context.getMainExecutor();
    }

    public static /* bridge */ /* synthetic */ void m() {
        TrafficStats.clearThreadStatsUid();
    }

    public static /* bridge */ /* synthetic */ void m(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static /* bridge */ /* synthetic */ void m(View view, boolean bl2) {
        view.setAccessibilityHeading(bl2);
    }

    public static /* bridge */ /* synthetic */ void m(WindowManager.LayoutParams layoutParams, int n2) {
        layoutParams.layoutInDisplayCutoutMode = n2;
    }

    public static /* bridge */ /* synthetic */ void m(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setPaneTitle(charSequence);
    }

    public static /* bridge */ /* synthetic */ void m(AccessibilityNodeInfo accessibilityNodeInfo, boolean bl2) {
        accessibilityNodeInfo.setScreenReaderFocusable(bl2);
    }

    public static /* bridge */ /* synthetic */ void m(TextView textView, int n2) {
        textView.setFirstBaselineToTopHeight(n2);
    }

    public static /* bridge */ /* synthetic */ void m(Object object) {
        Reference.reachabilityFence(object);
    }

    public static /* bridge */ /* synthetic */ boolean m() {
        return Process.isIsolated();
    }

    public static /* bridge */ /* synthetic */ boolean m(LinkProperties linkProperties) {
        return linkProperties.isPrivateDnsActive();
    }

    public static /* bridge */ /* synthetic */ boolean m(NetworkRequest networkRequest, int n2) {
        return networkRequest.hasCapability(n2);
    }

    public static /* bridge */ /* synthetic */ boolean m(View view) {
        return view.isAccessibilityHeading();
    }

    public static /* bridge */ /* synthetic */ boolean m(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static /* bridge */ /* synthetic */ int m$1(Icon icon) {
        return icon.getType();
    }

    public static /* bridge */ /* synthetic */ int m$1(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m$1() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
    }

    public static /* bridge */ /* synthetic */ void m$1(View view, boolean bl2) {
        view.setScreenReaderFocusable(bl2);
    }

    public static /* bridge */ /* synthetic */ void m$1(AccessibilityNodeInfo accessibilityNodeInfo, boolean bl2) {
        accessibilityNodeInfo.setHeading(bl2);
    }

    public static /* bridge */ /* synthetic */ boolean m$1(NetworkRequest networkRequest, int n2) {
        return networkRequest.hasTransport(n2);
    }

    public static /* bridge */ /* synthetic */ boolean m$1(View view) {
        return view.isScreenReaderFocusable();
    }

    public static /* bridge */ /* synthetic */ int m$2(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static /* bridge */ /* synthetic */ int m$3(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static /* bridge */ /* synthetic */ int m$4(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }
}

