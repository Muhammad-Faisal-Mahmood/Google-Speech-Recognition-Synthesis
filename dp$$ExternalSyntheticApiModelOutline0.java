/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.ActivityManager
 *  android.app.AppOpsManager
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.app.Notification
 *  android.app.Notification$Action$Builder
 *  android.app.Notification$BubbleMetadata
 *  android.app.Notification$Builder
 *  android.app.Service
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.Insets
 *  android.graphics.Matrix
 *  android.graphics.Rect
 *  android.graphics.Typeface
 *  android.graphics.Typeface$CustomFallbackBuilder
 *  android.graphics.drawable.ColorStateListDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.fonts.Font
 *  android.graphics.fonts.Font$Builder
 *  android.graphics.fonts.FontFamily
 *  android.graphics.fonts.FontFamily$Builder
 *  android.graphics.fonts.FontStyle
 *  android.media.AudioAttributes$Builder
 *  android.media.MediaCodecInfo
 *  android.net.NetworkCapabilities
 *  android.net.TransportInfo
 *  android.net.Uri
 *  android.net.ssl.SSLSockets
 *  android.os.Bundle
 *  android.os.Trace
 *  android.os.storage.StorageManager
 *  android.os.storage.StorageVolume
 *  android.provider.MediaStore
 *  android.text.TextDirectionHeuristic
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 *  android.view.ViewGroup
 *  android.view.Window
 *  android.view.WindowInsets
 *  android.view.WindowInsets$Builder
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 *  android.widget.PopupWindow
 *  android.widget.TextView
 */
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.Application;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.media.AudioAttributes;
import android.media.MediaCodecInfo;
import android.net.NetworkCapabilities;
import android.net.TransportInfo;
import android.net.Uri;
import android.net.ssl.SSLSockets;
import android.os.Bundle;
import android.os.Trace;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.MediaStore;
import android.text.TextDirectionHeuristic;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.Set;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

public final class dp$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ float m(View view) {
        return view.getTransitionAlpha();
    }

    public static /* bridge */ /* synthetic */ int m(AppOpsManager appOpsManager, String string, int n2, String string2) {
        return appOpsManager.unsafeCheckOpNoThrow(string, n2, string2);
    }

    public static /* bridge */ /* synthetic */ int m(Insets insets) {
        return insets.right;
    }

    public static /* bridge */ /* synthetic */ int m(FontFamily fontFamily) {
        return fontFamily.getSize();
    }

    public static /* bridge */ /* synthetic */ int m(FontStyle fontStyle) {
        return fontStyle.getWeight();
    }

    public static /* bridge */ /* synthetic */ Notification.Action.Builder m(Notification.Action.Builder builder, boolean bl2) {
        return builder.setContextual(bl2);
    }

    public static /* bridge */ /* synthetic */ Notification.Builder m(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
        return builder.setBubbleMetadata(bubbleMetadata);
    }

    public static /* bridge */ /* synthetic */ Notification.Builder m(Notification.Builder builder, boolean bl2) {
        return builder.setAllowSystemGeneratedContextualActions(bl2);
    }

    public static /* bridge */ /* synthetic */ ColorStateList m(ColorStateListDrawable colorStateListDrawable) {
        return colorStateListDrawable.getColorStateList();
    }

    public static /* bridge */ /* synthetic */ Insets m() {
        return Insets.NONE;
    }

    public static /* bridge */ /* synthetic */ Insets m(int n2, int n3, int n4, int n5) {
        return Insets.of((int)n2, (int)n3, (int)n4, (int)n5);
    }

    public static /* bridge */ /* synthetic */ Insets m(Rect rect) {
        return Insets.of((Rect)rect);
    }

    public static /* bridge */ /* synthetic */ Insets m(Drawable drawable) {
        return drawable.getOpticalInsets();
    }

    public static /* bridge */ /* synthetic */ Insets m(WindowInsets windowInsets) {
        return windowInsets.getSystemWindowInsets();
    }

    public static /* bridge */ /* synthetic */ Typeface.CustomFallbackBuilder m(Typeface.CustomFallbackBuilder customFallbackBuilder, FontFamily fontFamily) {
        return customFallbackBuilder.addCustomFallback(fontFamily);
    }

    public static /* bridge */ /* synthetic */ Typeface.CustomFallbackBuilder m(Typeface.CustomFallbackBuilder customFallbackBuilder, FontStyle fontStyle) {
        return customFallbackBuilder.setStyle(fontStyle);
    }

    public static /* bridge */ /* synthetic */ Typeface m(Typeface.CustomFallbackBuilder customFallbackBuilder) {
        return customFallbackBuilder.build();
    }

    public static /* bridge */ /* synthetic */ ColorStateListDrawable m(Object object) {
        return (ColorStateListDrawable)object;
    }

    public static /* bridge */ /* synthetic */ Drawable m(blp blp2) {
        return blp2.getVerticalScrollbarThumbDrawable();
    }

    public static /* bridge */ /* synthetic */ Font.Builder m(Font.Builder builder, int n2) {
        return builder.setWeight(n2);
    }

    public static /* bridge */ /* synthetic */ Font.Builder m(Font.Builder builder, String string) {
        return builder.setFontVariationSettings(string);
    }

    public static /* bridge */ /* synthetic */ Font m(Font.Builder builder) {
        return builder.build();
    }

    public static /* bridge */ /* synthetic */ Font m(FontFamily fontFamily, int n2) {
        return fontFamily.getFont(n2);
    }

    public static /* bridge */ /* synthetic */ FontFamily.Builder m(FontFamily.Builder builder, Font font) {
        return builder.addFont(font);
    }

    public static /* bridge */ /* synthetic */ FontFamily m(FontFamily.Builder builder) {
        return builder.build();
    }

    public static /* bridge */ /* synthetic */ FontStyle m(Font font) {
        return font.getStyle();
    }

    public static /* bridge */ /* synthetic */ AudioAttributes.Builder m(AudioAttributes.Builder builder, int n2) {
        return builder.setAllowedCapturePolicy(n2);
    }

    public static /* bridge */ /* synthetic */ TransportInfo m(NetworkCapabilities networkCapabilities) {
        return networkCapabilities.getTransportInfo();
    }

    public static /* bridge */ /* synthetic */ StorageVolume m(StorageManager storageManager, Uri uri) {
        return storageManager.getStorageVolume(uri);
    }

    public static /* bridge */ /* synthetic */ TextDirectionHeuristic m(TextView textView) {
        return textView.getTextDirectionHeuristic();
    }

    public static /* bridge */ /* synthetic */ View.AccessibilityDelegate m(View view) {
        return view.getAccessibilityDelegate();
    }

    public static /* bridge */ /* synthetic */ WindowInsets.Builder m(WindowInsets.Builder builder, Insets insets) {
        return builder.setSystemWindowInsets(insets);
    }

    public static /* bridge */ /* synthetic */ WindowInsets m(WindowInsets.Builder builder) {
        return builder.build();
    }

    public static /* bridge */ /* synthetic */ WindowInsets m(WindowInsets windowInsets, int n2, int n3, int n4, int n5) {
        return windowInsets.inset(n2, n3, n4, n5);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
    }

    public static /* bridge */ /* synthetic */ String m(Context context) {
        return context.getOpPackageName();
    }

    public static /* bridge */ /* synthetic */ String m(SSLSocket sSLSocket) {
        return sSLSocket.getApplicationProtocol();
    }

    public static /* bridge */ /* synthetic */ Set m(Context context) {
        return MediaStore.getExternalVolumeNames((Context)context);
    }

    public static /* bridge */ /* synthetic */ void m(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }

    public static /* bridge */ /* synthetic */ void m(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks, Activity activity) {
        activityLifecycleCallbacks.onActivityPrePaused(activity);
    }

    public static /* bridge */ /* synthetic */ void m(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks, Activity activity, Bundle bundle) {
        activityLifecycleCallbacks.onActivityPreCreated(activity, bundle);
    }

    public static /* bridge */ /* synthetic */ void m(Service service, int n2, Notification notification, int n3) {
        service.startForeground(n2, notification, n3);
    }

    public static /* bridge */ /* synthetic */ void m(Resources.Theme theme) {
        theme.rebase();
    }

    public static /* bridge */ /* synthetic */ void m(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    public static /* bridge */ /* synthetic */ void m(View view, int n2) {
        view.setTransitionVisibility(n2);
    }

    public static /* bridge */ /* synthetic */ void m(View view, int n2, int n3, int n4, int n5) {
        view.setLeftTopRightBottom(n2, n3, n4, n5);
    }

    public static /* bridge */ /* synthetic */ void m(View view, Context context, int[] nArray, AttributeSet attributeSet, TypedArray typedArray, int n2, int n3) {
        view.saveAttributeDataForStyleable(context, nArray, attributeSet, typedArray, n2, n3);
    }

    public static /* bridge */ /* synthetic */ void m(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public static /* bridge */ /* synthetic */ void m(ViewGroup viewGroup, boolean bl2) {
        viewGroup.suppressLayout(bl2);
    }

    public static /* bridge */ /* synthetic */ void m(Window window, boolean bl2) {
        window.setStatusBarContrastEnforced(bl2);
    }

    public static /* bridge */ /* synthetic */ void m(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    public static /* bridge */ /* synthetic */ void m(PopupWindow popupWindow, boolean bl2) {
        popupWindow.setTouchModal(bl2);
    }

    public static /* bridge */ /* synthetic */ void m(String string, int n2) {
        Trace.endAsyncSection((String)string, (int)n2);
    }

    public static /* bridge */ /* synthetic */ void m(String string, long l2) {
        Trace.setCounter((String)string, (long)l2);
    }

    public static /* bridge */ /* synthetic */ void m(SSLParameters sSLParameters, String[] stringArray) {
        sSLParameters.setApplicationProtocols(stringArray);
    }

    public static /* bridge */ /* synthetic */ void m(SSLSocket sSLSocket, boolean bl2) {
        SSLSockets.setUseSessionTickets((SSLSocket)sSLSocket, (boolean)bl2);
    }

    public static /* bridge */ /* synthetic */ boolean m() {
        return ActivityManager.isRunningInUserTestHarness();
    }

    public static /* bridge */ /* synthetic */ boolean m(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    public static /* bridge */ /* synthetic */ boolean m(TextView textView) {
        return textView.isHorizontallyScrollable();
    }

    public static /* bridge */ /* synthetic */ boolean m(Object object) {
        return object instanceof ColorStateListDrawable;
    }

    public static /* bridge */ /* synthetic */ boolean m(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket((SSLSocket)sSLSocket);
    }

    public static /* bridge */ /* synthetic */ int m$1(Insets insets) {
        return insets.top;
    }

    public static /* bridge */ /* synthetic */ int m$1(FontStyle fontStyle) {
        return fontStyle.getSlant();
    }

    public static /* bridge */ /* synthetic */ Insets m$1(WindowInsets windowInsets) {
        return windowInsets.getSystemGestureInsets();
    }

    public static /* bridge */ /* synthetic */ Drawable m$1(blp blp2) {
        return blp2.getHorizontalScrollbarThumbDrawable();
    }

    public static /* bridge */ /* synthetic */ Font.Builder m$1(Font.Builder builder, int n2) {
        return builder.setSlant(n2);
    }

    public static /* bridge */ /* synthetic */ WindowInsets.Builder m$1(WindowInsets.Builder builder, Insets insets) {
        return builder.setSystemGestureInsets(insets);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m$1() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
    }

    public static /* bridge */ /* synthetic */ void m$1(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks, Activity activity) {
        activityLifecycleCallbacks.onActivityPreDestroyed(activity);
    }

    public static /* bridge */ /* synthetic */ void m$1(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks, Activity activity, Bundle bundle) {
        activityLifecycleCallbacks.onActivityPostCreated(activity, bundle);
    }

    public static /* bridge */ /* synthetic */ void m$1(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    public static /* bridge */ /* synthetic */ void m$1(Window window, boolean bl2) {
        window.setNavigationBarContrastEnforced(bl2);
    }

    public static /* bridge */ /* synthetic */ void m$1(PopupWindow popupWindow, boolean bl2) {
        popupWindow.setIsClippedToScreen(bl2);
    }

    public static /* bridge */ /* synthetic */ void m$1(String string, int n2) {
        Trace.beginAsyncSection((String)string, (int)n2);
    }

    public static /* bridge */ /* synthetic */ boolean m$1() {
        return Trace.isEnabled();
    }

    public static /* bridge */ /* synthetic */ boolean m$1(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    public static /* bridge */ /* synthetic */ int m$2(Insets insets) {
        return insets.bottom;
    }

    public static /* bridge */ /* synthetic */ Insets m$2(WindowInsets windowInsets) {
        return windowInsets.getMandatorySystemGestureInsets();
    }

    public static /* bridge */ /* synthetic */ Drawable m$2(blp blp2) {
        return blp2.getVerticalScrollbarTrackDrawable();
    }

    public static /* bridge */ /* synthetic */ Font.Builder m$2(Font.Builder builder, int n2) {
        return builder.setTtcIndex(n2);
    }

    public static /* bridge */ /* synthetic */ WindowInsets.Builder m$2(WindowInsets.Builder builder, Insets insets) {
        return builder.setMandatorySystemGestureInsets(insets);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m$2() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
    }

    public static /* bridge */ /* synthetic */ void m$2(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks, Activity activity) {
        activityLifecycleCallbacks.onActivityPostPaused(activity);
    }

    public static /* bridge */ /* synthetic */ void m$2(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks, Activity activity, Bundle bundle) {
        activityLifecycleCallbacks.onActivityPostSaveInstanceState(activity, bundle);
    }

    public static /* bridge */ /* synthetic */ boolean m$2(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static /* bridge */ /* synthetic */ int m$3(Insets insets) {
        return insets.left;
    }

    public static /* bridge */ /* synthetic */ Insets m$3(WindowInsets windowInsets) {
        return windowInsets.getTappableElementInsets();
    }

    public static /* bridge */ /* synthetic */ Drawable m$3(blp blp2) {
        return blp2.getHorizontalScrollbarTrackDrawable();
    }

    public static /* bridge */ /* synthetic */ WindowInsets.Builder m$3(WindowInsets.Builder builder, Insets insets) {
        return builder.setStableInsets(insets);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m$3() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
    }

    public static /* bridge */ /* synthetic */ void m$3(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks, Activity activity) {
        activityLifecycleCallbacks.onActivityPostDestroyed(activity);
    }

    public static /* bridge */ /* synthetic */ void m$3(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks, Activity activity, Bundle bundle) {
        activityLifecycleCallbacks.onActivityPreSaveInstanceState(activity, bundle);
    }

    public static /* bridge */ /* synthetic */ boolean m$3(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    public static /* bridge */ /* synthetic */ WindowInsets.Builder m$4(WindowInsets.Builder builder, Insets insets) {
        return builder.setTappableElementInsets(insets);
    }

    public static /* bridge */ /* synthetic */ void m$4(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks, Activity activity) {
        activityLifecycleCallbacks.onActivityPreStarted(activity);
    }

    public static /* bridge */ /* synthetic */ void m$5(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks, Activity activity) {
        activityLifecycleCallbacks.onActivityPreResumed(activity);
    }

    public static /* bridge */ /* synthetic */ void m$6(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks, Activity activity) {
        activityLifecycleCallbacks.onActivityPostResumed(activity);
    }

    public static /* bridge */ /* synthetic */ void m$7(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks, Activity activity) {
        activityLifecycleCallbacks.onActivityPostStopped(activity);
    }

    public static /* bridge */ /* synthetic */ void m$8(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks, Activity activity) {
        activityLifecycleCallbacks.onActivityPreStopped(activity);
    }

    public static /* bridge */ /* synthetic */ void m$9(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks, Activity activity) {
        activityLifecycleCallbacks.onActivityPostStarted(activity);
    }
}

