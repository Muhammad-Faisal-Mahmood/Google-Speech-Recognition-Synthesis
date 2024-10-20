/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.AnimatorSet
 *  android.app.Application
 *  android.app.Notification$Builder
 *  android.app.NotificationChannel
 *  android.app.NotificationManager
 *  android.app.PendingIntent
 *  android.app.admin.DevicePolicyManager
 *  android.app.job.JobInfo$Builder
 *  android.app.usage.StorageStats
 *  android.app.usage.StorageStatsManager
 *  android.content.BroadcastReceiver
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.content.ServiceConnection
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.res.ColorStateList
 *  android.content.res.Configuration
 *  android.graphics.Bitmap
 *  android.graphics.Paint
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Typeface
 *  android.graphics.Typeface$Builder
 *  android.graphics.drawable.Icon
 *  android.graphics.fonts.FontVariationAxis
 *  android.media.AudioAttributes
 *  android.media.AudioFocusRequest
 *  android.media.AudioFocusRequest$Builder
 *  android.media.AudioManager
 *  android.media.AudioManager$OnAudioFocusChangeListener
 *  android.media.AudioPlaybackConfiguration
 *  android.net.ConnectivityManager
 *  android.net.ConnectivityManager$NetworkCallback
 *  android.net.NetworkRequest
 *  android.os.Handler
 *  android.os.Parcel
 *  android.os.StrictMode$ThreadPolicy$Builder
 *  android.os.UserHandle
 *  android.os.storage.StorageManager
 *  android.speech.tts.SynthesisCallback
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.Window$Callback
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 *  android.view.autofill.AutofillManager
 *  android.view.textclassifier.TextClassificationManager
 *  android.view.textclassifier.TextClassifier
 *  android.widget.TextView
 */
import android.animation.AnimatorSet;
import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobInfo;
import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.graphics.fonts.FontVariationAxis;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.AudioManager$AudioPlaybackCallback;
import android.media.AudioPlaybackConfiguration;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Parcel;
import android.os.StrictMode;
import android.os.UserHandle;
import android.os.storage.StorageManager;
import android.speech.tts.SynthesisCallback;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import com.android.car.ui.FocusParkingView;
import com.google.android.material.appbar.AppBarLayout;
import java.util.List;
import java.util.UUID;

public final class ag$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ float m(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static /* bridge */ /* synthetic */ int m(Configuration configuration) {
        return configuration.colorMode;
    }

    public static /* bridge */ /* synthetic */ int m(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        return audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public static /* bridge */ /* synthetic */ int m(View view) {
        return view.getImportantForAutofill();
    }

    public static /* bridge */ /* synthetic */ int m(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static /* bridge */ /* synthetic */ long m(StorageStats storageStats) {
        return storageStats.getCacheBytes();
    }

    public static /* bridge */ /* synthetic */ Notification.Builder m(Notification.Builder builder, int n2) {
        return builder.setBadgeIconType(n2);
    }

    public static /* bridge */ /* synthetic */ Notification.Builder m(Notification.Builder builder, long l2) {
        return builder.setTimeoutAfter(l2);
    }

    public static /* bridge */ /* synthetic */ Notification.Builder m(Notification.Builder builder, CharSequence charSequence) {
        return builder.setSettingsText(charSequence);
    }

    public static /* bridge */ /* synthetic */ Notification.Builder m(Notification.Builder builder, String string) {
        return builder.setShortcutId(string);
    }

    public static /* bridge */ /* synthetic */ NotificationChannel m(NotificationManager notificationManager, String string) {
        return notificationManager.getNotificationChannel(string);
    }

    public static /* bridge */ /* synthetic */ PendingIntent m(Context context, int n2, Intent intent, int n3) {
        return PendingIntent.getForegroundService((Context)context, (int)n2, (Intent)intent, (int)n3);
    }

    public static /* bridge */ /* synthetic */ JobInfo.Builder m(JobInfo.Builder builder, boolean bl2) {
        return builder.setRequiresBatteryNotLow(bl2);
    }

    public static /* bridge */ /* synthetic */ StorageStats m(StorageStatsManager storageStatsManager, UUID uUID, String string, UserHandle userHandle) {
        return storageStatsManager.queryStatsForPackage(uUID, string, userHandle);
    }

    public static /* bridge */ /* synthetic */ StorageStatsManager m(Object object) {
        return (StorageStatsManager)object;
    }

    public static /* bridge */ /* synthetic */ ComponentName m(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }

    public static /* bridge */ /* synthetic */ Context m(Context context, String string) {
        return context.createContextForSplit(string);
    }

    public static /* bridge */ /* synthetic */ Intent m(Application application, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int n2) {
        return application.registerReceiver(broadcastReceiver, intentFilter, n2);
    }

    public static /* bridge */ /* synthetic */ Intent m(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int n2) {
        return context.registerReceiver(broadcastReceiver, intentFilter, n2);
    }

    public static /* bridge */ /* synthetic */ Intent m(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String string, Handler handler, int n2) {
        return context.registerReceiver(broadcastReceiver, intentFilter, string, handler, n2);
    }

    public static /* bridge */ /* synthetic */ Typeface.Builder m(Typeface.Builder builder, int n2) {
        return builder.setWeight(n2);
    }

    public static /* bridge */ /* synthetic */ Typeface.Builder m(Typeface.Builder builder, boolean bl2) {
        return builder.setItalic(bl2);
    }

    public static /* bridge */ /* synthetic */ Typeface m(Typeface.Builder builder) {
        return builder.build();
    }

    public static /* bridge */ /* synthetic */ Icon m(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap((Bitmap)bitmap);
    }

    public static /* bridge */ /* synthetic */ AudioAttributes m(AudioPlaybackConfiguration audioPlaybackConfiguration) {
        return audioPlaybackConfiguration.getAudioAttributes();
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest.Builder m(AudioFocusRequest.Builder builder, AudioAttributes audioAttributes) {
        return builder.setAudioAttributes(audioAttributes);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest.Builder m(AudioFocusRequest.Builder builder, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        return builder.setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest.Builder m(AudioFocusRequest.Builder builder, boolean bl2) {
        return builder.setWillPauseWhenDucked(bl2);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest m(AudioFocusRequest.Builder builder) {
        return builder.build();
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest m(Object object) {
        return (AudioFocusRequest)object;
    }

    public static /* bridge */ /* synthetic */ AudioPlaybackConfiguration m(Object object) {
        return (AudioPlaybackConfiguration)object;
    }

    public static /* bridge */ /* synthetic */ StrictMode.ThreadPolicy.Builder m(StrictMode.ThreadPolicy.Builder builder) {
        return builder.detectUnbufferedIo();
    }

    public static /* bridge */ /* synthetic */ MenuItem m(MenuItem menuItem, char c2, int n2) {
        return menuItem.setNumericShortcut(c2, n2);
    }

    public static /* bridge */ /* synthetic */ MenuItem m(MenuItem menuItem, ColorStateList colorStateList) {
        return menuItem.setIconTintList(colorStateList);
    }

    public static /* bridge */ /* synthetic */ MenuItem m(MenuItem menuItem, PorterDuff.Mode mode) {
        return menuItem.setIconTintMode(mode);
    }

    public static /* bridge */ /* synthetic */ MenuItem m(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setTooltipText(charSequence);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
    }

    public static /* bridge */ /* synthetic */ AutofillManager m(Object object) {
        return (AutofillManager)object;
    }

    public static /* bridge */ /* synthetic */ TextClassificationManager m(Object object) {
        return (TextClassificationManager)object;
    }

    public static /* bridge */ /* synthetic */ TextClassifier m() {
        return TextClassifier.NO_OP;
    }

    public static /* bridge */ /* synthetic */ TextClassifier m(TextClassificationManager textClassificationManager) {
        return textClassificationManager.getTextClassifier();
    }

    public static /* bridge */ /* synthetic */ CharSequence m(NotificationChannel notificationChannel) {
        return notificationChannel.getName();
    }

    public static /* bridge */ /* synthetic */ Class m() {
        return TextClassificationManager.class;
    }

    public static /* bridge */ /* synthetic */ String m(Paint paint) {
        return paint.getFontVariationSettings();
    }

    public static /* bridge */ /* synthetic */ String m(TextView textView) {
        return textView.getFontVariationSettings();
    }

    public static /* bridge */ /* synthetic */ String m(Class clazz) {
        return clazz.getTypeName();
    }

    public static /* bridge */ /* synthetic */ List m(AudioManager audioManager) {
        return audioManager.getActivePlaybackConfigurations();
    }

    public static /* bridge */ /* synthetic */ UUID m() {
        return StorageManager.UUID_DEFAULT;
    }

    public static /* bridge */ /* synthetic */ void m(AnimatorSet animatorSet) {
        animatorSet.reverse();
    }

    public static /* bridge */ /* synthetic */ void m(AnimatorSet animatorSet, long l2) {
        animatorSet.setCurrentPlayTime(l2);
    }

    public static /* bridge */ /* synthetic */ void m(NotificationChannel notificationChannel, CharSequence charSequence) {
        notificationChannel.setName(charSequence);
    }

    public static /* bridge */ /* synthetic */ void m(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static /* bridge */ /* synthetic */ void m(Configuration configuration, int n2) {
        configuration.colorMode = n2;
    }

    public static /* bridge */ /* synthetic */ void m(AudioManager audioManager, AudioManager.AudioPlaybackCallback audioPlaybackCallback) {
        audioManager.unregisterAudioPlaybackCallback(audioPlaybackCallback);
    }

    public static /* bridge */ /* synthetic */ void m(AudioManager audioManager, AudioManager.AudioPlaybackCallback audioPlaybackCallback, Handler handler) {
        audioManager.registerAudioPlaybackCallback(audioPlaybackCallback, handler);
    }

    public static /* bridge */ /* synthetic */ void m(AudioPlaybackConfiguration audioPlaybackConfiguration, Parcel parcel, int n2) {
        audioPlaybackConfiguration.writeToParcel(parcel, n2);
    }

    public static /* bridge */ /* synthetic */ void m(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback, Handler handler) {
        connectivityManager.registerDefaultNetworkCallback(networkCallback, handler);
    }

    public static /* bridge */ /* synthetic */ void m(ConnectivityManager connectivityManager, NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback, Handler handler) {
        connectivityManager.registerNetworkCallback(networkRequest, networkCallback, handler);
    }

    public static /* bridge */ /* synthetic */ void m(SynthesisCallback synthesisCallback, int n2, int n3, int n4) {
        synthesisCallback.rangeStart(n2, n3, n4);
    }

    public static /* bridge */ /* synthetic */ void m(View view, int n2) {
        view.setImportantForAutofill(n2);
    }

    public static /* bridge */ /* synthetic */ void m(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }

    public static /* bridge */ /* synthetic */ void m(ViewGroup viewGroup, boolean bl2) {
        viewGroup.setDefaultFocusHighlightEnabled(bl2);
    }

    public static /* bridge */ /* synthetic */ void m(Window.Callback callback, boolean bl2) {
        callback.onPointerCaptureChanged(bl2);
    }

    public static /* bridge */ /* synthetic */ void m(AutofillManager autofillManager, View view) {
        autofillManager.notifyValueChanged(view);
    }

    public static /* bridge */ /* synthetic */ void m(TextView textView, int n2, int n3, int n4, int n5) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(n2, n3, n4, n5);
    }

    public static /* bridge */ /* synthetic */ void m(TextView textView, int[] nArray, int n2) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(nArray, n2);
    }

    public static /* bridge */ /* synthetic */ void m(FocusParkingView focusParkingView, int n2) {
        focusParkingView.setFocusable(n2);
    }

    public static /* bridge */ /* synthetic */ void m(FocusParkingView focusParkingView, boolean bl2) {
        focusParkingView.setDefaultFocusHighlightEnabled(bl2);
    }

    public static /* bridge */ /* synthetic */ void m(AppBarLayout appBarLayout, boolean bl2) {
        appBarLayout.setKeyboardNavigationCluster(bl2);
    }

    public static /* bridge */ /* synthetic */ boolean m(DevicePolicyManager devicePolicyManager, ComponentName componentName, Intent intent, ServiceConnection serviceConnection, int n2, UserHandle userHandle) {
        return devicePolicyManager.bindDeviceAdminServiceAsUser(componentName, intent, serviceConnection, n2, userHandle);
    }

    public static /* bridge */ /* synthetic */ boolean m(PackageManager packageManager) {
        return packageManager.isInstantApp();
    }

    public static /* bridge */ /* synthetic */ boolean m(Paint paint, String string) {
        return paint.setFontVariationSettings(string);
    }

    public static /* bridge */ /* synthetic */ boolean m(View view) {
        return view.isFocusedByDefault();
    }

    public static /* bridge */ /* synthetic */ boolean m(TextView textView, String string) {
        return textView.setFontVariationSettings(string);
    }

    public static /* bridge */ /* synthetic */ FontVariationAxis[] m(String string) {
        return FontVariationAxis.fromFontVariationSettings((String)string);
    }

    public static /* bridge */ /* synthetic */ String[] m(ApplicationInfo applicationInfo) {
        return applicationInfo.splitNames;
    }

    public static /* bridge */ /* synthetic */ float m$1(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static /* bridge */ /* synthetic */ int m$1(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        return audioManager.requestAudioFocus(audioFocusRequest);
    }

    public static /* bridge */ /* synthetic */ long m$1(StorageStats storageStats) {
        return storageStats.getAppBytes();
    }

    public static /* bridge */ /* synthetic */ Notification.Builder m$1(Notification.Builder builder, int n2) {
        return builder.setGroupAlertBehavior(n2);
    }

    public static /* bridge */ /* synthetic */ JobInfo.Builder m$1(JobInfo.Builder builder, boolean bl2) {
        return builder.setRequiresStorageNotLow(bl2);
    }

    public static /* bridge */ /* synthetic */ MenuItem m$1(MenuItem menuItem, char c2, int n2) {
        return menuItem.setAlphabeticShortcut(c2, n2);
    }

    public static /* bridge */ /* synthetic */ MenuItem m$1(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setContentDescription(charSequence);
    }

    public static /* bridge */ /* synthetic */ Class m$1() {
        return StorageStatsManager.class;
    }

    public static /* bridge */ /* synthetic */ long m$2(StorageStats storageStats) {
        return storageStats.getDataBytes();
    }

    public static /* bridge */ /* synthetic */ Class m$2() {
        return AutofillManager.class;
    }
}

