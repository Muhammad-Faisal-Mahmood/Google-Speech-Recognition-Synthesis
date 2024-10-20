/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorSet
 *  android.app.Activity
 *  android.app.Notification$Action$Builder
 *  android.app.Notification$Builder
 *  android.app.NotificationManager
 *  android.app.job.JobInfo$Builder
 *  android.app.job.JobInfo$TriggerContentUri
 *  android.app.job.JobParameters
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.FeatureInfo
 *  android.content.pm.ServiceInfo
 *  android.content.res.Configuration
 *  android.media.AudioManager
 *  android.media.AudioRecord
 *  android.media.AudioRecordingConfiguration
 *  android.media.AudioTimestamp
 *  android.media.MediaCodec$CryptoInfo
 *  android.media.MediaCodec$CryptoInfo$Pattern
 *  android.net.ConnectivityManager
 *  android.net.ConnectivityManager$NetworkCallback
 *  android.net.Uri
 *  android.os.DeadSystemException
 *  android.os.Handler
 *  android.os.LocaleList
 *  android.os.Process
 *  android.os.UserManager
 *  android.os.health.HealthStats
 *  android.os.health.SystemHealthManager
 *  android.os.health.TimerStat
 *  android.os.storage.StorageManager
 *  android.os.storage.StorageVolume
 *  android.security.NetworkSecurityPolicy
 *  android.view.DragAndDropPermissions
 *  android.view.DragEvent
 *  android.view.FrameMetrics
 *  android.view.Menu
 *  android.view.View
 *  android.view.Window
 *  android.view.Window$Callback
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 *  android.view.inputmethod.EditorInfo
 *  android.widget.PopupWindow
 *  android.widget.TextView
 *  android.widget.Toolbar
 */
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.media.MediaCodec;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.DeadSystemException;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Process;
import android.os.UserManager;
import android.os.health.HealthStats;
import android.os.health.SystemHealthManager;
import android.os.health.TimerStat;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.security.NetworkSecurityPolicy;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import android.view.FrameMetrics;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toolbar;
import com.google.android.apps.speech.tts.googletts.settings.TTSBackupAgent;
import java.io.File;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public final class ag$$ExternalSyntheticApiModelOutline1 {
    public static /* bridge */ /* synthetic */ int m(FeatureInfo featureInfo) {
        return featureInfo.version;
    }

    public static /* bridge */ /* synthetic */ int m(AudioRecord audioRecord, AudioTimestamp audioTimestamp, int n2) {
        return audioRecord.getTimestamp(audioTimestamp, n2);
    }

    public static /* bridge */ /* synthetic */ int m(AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.getClientAudioSessionId();
    }

    public static /* bridge */ /* synthetic */ int m(LocaleList localeList) {
        return localeList.size();
    }

    public static /* bridge */ /* synthetic */ int m(TimerStat timerStat) {
        return timerStat.getCount();
    }

    public static /* bridge */ /* synthetic */ int m(PopupWindow popupWindow, View view, int n2, boolean bl2) {
        return popupWindow.getMaxAvailableHeight(view, n2, bl2);
    }

    public static /* bridge */ /* synthetic */ int m(Toolbar toolbar) {
        return toolbar.getTitleMarginStart();
    }

    public static /* bridge */ /* synthetic */ long m() {
        return Process.getStartElapsedRealtime();
    }

    public static /* bridge */ /* synthetic */ long m(Animator animator) {
        return animator.getTotalDuration();
    }

    public static /* bridge */ /* synthetic */ long m(AnimatorSet animatorSet) {
        return animatorSet.getTotalDuration();
    }

    public static /* bridge */ /* synthetic */ long m(HealthStats healthStats, int n2) {
        return healthStats.getMeasurement(n2);
    }

    public static /* bridge */ /* synthetic */ long m(TimerStat timerStat) {
        return timerStat.getTime();
    }

    public static /* bridge */ /* synthetic */ long m(FrameMetrics frameMetrics, int n2) {
        return frameMetrics.getMetric(n2);
    }

    public static /* bridge */ /* synthetic */ long m(HttpURLConnection httpURLConnection) {
        return httpURLConnection.getContentLengthLong();
    }

    public static /* bridge */ /* synthetic */ long m(HttpURLConnection httpURLConnection, String string, long l2) {
        return httpURLConnection.getHeaderFieldLong(string, l2);
    }

    public static /* bridge */ /* synthetic */ Notification.Action.Builder m(Notification.Action.Builder builder, boolean bl2) {
        return builder.setAllowGeneratedReplies(bl2);
    }

    public static /* bridge */ /* synthetic */ Notification.Builder m(Notification.Builder builder, CharSequence[] charSequenceArray) {
        return builder.setRemoteInputHistory(charSequenceArray);
    }

    public static /* bridge */ /* synthetic */ JobInfo.Builder m(JobInfo.Builder builder, long l2) {
        return builder.setTriggerContentUpdateDelay(l2);
    }

    public static /* bridge */ /* synthetic */ JobInfo.Builder m(JobInfo.Builder builder, long l2, long l3) {
        return builder.setPeriodic(l2, l3);
    }

    public static /* bridge */ /* synthetic */ JobInfo.Builder m(JobInfo.Builder builder, JobInfo.TriggerContentUri triggerContentUri) {
        return builder.addTriggerContentUri(triggerContentUri);
    }

    public static /* bridge */ /* synthetic */ Context m(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static /* bridge */ /* synthetic */ Context m(TTSBackupAgent tTSBackupAgent) {
        return tTSBackupAgent.createDeviceProtectedStorageContext();
    }

    public static /* bridge */ /* synthetic */ AudioRecordingConfiguration m(Object object) {
        return (AudioRecordingConfiguration)object;
    }

    public static /* bridge */ /* synthetic */ LocaleList m() {
        return LocaleList.getDefault();
    }

    public static /* bridge */ /* synthetic */ LocaleList m(Configuration configuration) {
        return configuration.getLocales();
    }

    public static /* bridge */ /* synthetic */ LocaleList m(EditorInfo editorInfo) {
        return editorInfo.hintLocales;
    }

    public static /* bridge */ /* synthetic */ LocaleList m(Object object) {
        return (LocaleList)object;
    }

    public static /* bridge */ /* synthetic */ LocaleList m(String string) {
        return LocaleList.forLanguageTags((String)string);
    }

    public static /* bridge */ /* synthetic */ HealthStats m(SystemHealthManager systemHealthManager) {
        return systemHealthManager.takeMyUidSnapshot();
    }

    public static /* bridge */ /* synthetic */ HealthStats m(Object object) {
        return (HealthStats)object;
    }

    public static /* bridge */ /* synthetic */ SystemHealthManager m(Object object) {
        return (SystemHealthManager)object;
    }

    public static /* bridge */ /* synthetic */ TimerStat m(HealthStats healthStats, int n2) {
        return healthStats.getTimer(n2);
    }

    public static /* bridge */ /* synthetic */ TimerStat m(Object object) {
        return (TimerStat)object;
    }

    public static /* bridge */ /* synthetic */ StorageVolume m(Object object) {
        return (StorageVolume)object;
    }

    public static /* bridge */ /* synthetic */ DragAndDropPermissions m(Activity activity, DragEvent dragEvent) {
        return activity.requestDragAndDropPermissions(dragEvent);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
    }

    public static /* bridge */ /* synthetic */ File m(Context context) {
        return context.getDataDir();
    }

    public static /* bridge */ /* synthetic */ Object m(BiFunction biFunction, Object object, Object object2) {
        return biFunction.apply(object, object2);
    }

    public static /* bridge */ /* synthetic */ Object m(Function function, Object object) {
        return function.apply(object);
    }

    public static /* bridge */ /* synthetic */ Object m(Supplier supplier) {
        return supplier.get();
    }

    public static /* bridge */ /* synthetic */ String m(ApplicationInfo applicationInfo) {
        return applicationInfo.deviceProtectedDataDir;
    }

    public static /* bridge */ /* synthetic */ String m(LocaleList localeList) {
        return localeList.toLanguageTags();
    }

    public static /* bridge */ /* synthetic */ String m(StorageVolume storageVolume) {
        return storageVolume.getUuid();
    }

    public static /* bridge */ /* synthetic */ List m(AudioManager audioManager) {
        return audioManager.getActiveRecordingConfigurations();
    }

    public static /* bridge */ /* synthetic */ List m(StorageManager storageManager) {
        return storageManager.getStorageVolumes();
    }

    public static /* bridge */ /* synthetic */ Locale m(LocaleList localeList, int n2) {
        return localeList.get(n2);
    }

    public static /* bridge */ /* synthetic */ Map m(HealthStats healthStats, int n2) {
        return healthStats.getStats(n2);
    }

    public static /* bridge */ /* synthetic */ Consumer m(Object object) {
        return (Consumer)object;
    }

    public static /* bridge */ /* synthetic */ Supplier m(Object object) {
        return (Supplier)object;
    }

    public static /* bridge */ /* synthetic */ void m(Configuration configuration, LocaleList localeList) {
        configuration.setLocales(localeList);
    }

    public static /* bridge */ /* synthetic */ void m(MediaCodec.CryptoInfo cryptoInfo, MediaCodec.CryptoInfo.Pattern pattern) {
        cryptoInfo.setPattern(pattern);
    }

    public static /* bridge */ /* synthetic */ void m(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }

    public static /* bridge */ /* synthetic */ void m(LocaleList localeList) {
        LocaleList.setDefault((LocaleList)localeList);
    }

    public static /* bridge */ /* synthetic */ void m(Window.Callback callback, List list, Menu menu, int n2) {
        callback.onProvideKeyboardShortcuts(list, menu, n2);
    }

    public static /* bridge */ /* synthetic */ void m(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
        window.removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
    }

    public static /* bridge */ /* synthetic */ void m(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, Handler handler) {
        window.addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, handler);
    }

    public static /* bridge */ /* synthetic */ void m(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }

    public static /* bridge */ /* synthetic */ void m(BiConsumer biConsumer, Object object, Object object2) {
        biConsumer.accept(object, object2);
    }

    public static /* bridge */ /* synthetic */ void m(Consumer consumer, Object object) {
        consumer.accept(object);
    }

    public static /* bridge */ /* synthetic */ boolean m(int n2) {
        return Process.isApplicationUid((int)n2);
    }

    public static /* bridge */ /* synthetic */ boolean m(Activity activity) {
        return activity.isInMultiWindowMode();
    }

    public static /* bridge */ /* synthetic */ boolean m(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static /* bridge */ /* synthetic */ boolean m(Context context) {
        return context.isDeviceProtectedStorage();
    }

    public static /* bridge */ /* synthetic */ boolean m(ServiceInfo serviceInfo) {
        return serviceInfo.directBootAware;
    }

    public static /* bridge */ /* synthetic */ boolean m(LocaleList localeList) {
        return localeList.isEmpty();
    }

    public static /* bridge */ /* synthetic */ boolean m(LocaleList localeList, Object object) {
        return localeList.equals(object);
    }

    public static /* bridge */ /* synthetic */ boolean m(UserManager userManager) {
        return userManager.isUserUnlocked();
    }

    public static /* bridge */ /* synthetic */ boolean m(HealthStats healthStats, int n2) {
        return healthStats.hasStats(n2);
    }

    public static /* bridge */ /* synthetic */ boolean m(NetworkSecurityPolicy networkSecurityPolicy, String string) {
        return networkSecurityPolicy.isCleartextTrafficPermitted(string);
    }

    public static /* bridge */ /* synthetic */ boolean m(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isImportantForAccessibility();
    }

    public static /* bridge */ /* synthetic */ boolean m(Object object) {
        return object instanceof DeadSystemException;
    }

    public static /* bridge */ /* synthetic */ boolean m(BiPredicate biPredicate, Object object, Object object2) {
        return biPredicate.test(object, object2);
    }

    public static /* bridge */ /* synthetic */ boolean m(Predicate predicate, Object object) {
        return predicate.test(object);
    }

    public static /* bridge */ /* synthetic */ Uri[] m(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentUris();
    }

    public static /* bridge */ /* synthetic */ String[] m(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentAuthorities();
    }

    public static /* bridge */ /* synthetic */ int m$1(AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.getClientAudioSource();
    }

    public static /* bridge */ /* synthetic */ int m$1(LocaleList localeList) {
        return localeList.hashCode();
    }

    public static /* bridge */ /* synthetic */ int m$1(Toolbar toolbar) {
        return toolbar.getTitleMarginEnd();
    }

    public static /* bridge */ /* synthetic */ JobInfo.Builder m$1(JobInfo.Builder builder, long l2) {
        return builder.setTriggerContentMaxDelay(l2);
    }

    public static /* bridge */ /* synthetic */ String m$1(LocaleList localeList) {
        return localeList.toString();
    }

    public static /* bridge */ /* synthetic */ String m$1(StorageVolume storageVolume) {
        return storageVolume.getState();
    }

    public static /* bridge */ /* synthetic */ Map m$1(HealthStats healthStats, int n2) {
        return healthStats.getTimers(n2);
    }

    public static /* bridge */ /* synthetic */ boolean m$1(HealthStats healthStats, int n2) {
        return healthStats.hasTimers(n2);
    }

    public static /* bridge */ /* synthetic */ int m$2(Toolbar toolbar) {
        return toolbar.getTitleMarginTop();
    }

    public static /* bridge */ /* synthetic */ Map m$2(HealthStats healthStats, int n2) {
        return healthStats.getMeasurements(n2);
    }

    public static /* bridge */ /* synthetic */ boolean m$2(HealthStats healthStats, int n2) {
        return healthStats.hasTimer(n2);
    }

    public static /* bridge */ /* synthetic */ int m$3(Toolbar toolbar) {
        return toolbar.getTitleMarginBottom();
    }

    public static /* bridge */ /* synthetic */ boolean m$3(HealthStats healthStats, int n2) {
        return healthStats.hasMeasurement(n2);
    }

    public static /* bridge */ /* synthetic */ boolean m$4(HealthStats healthStats, int n2) {
        return healthStats.hasMeasurements(n2);
    }
}

