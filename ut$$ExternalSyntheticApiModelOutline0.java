/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification$Action$Builder
 *  android.app.job.JobInfo$Builder
 *  android.app.job.JobParameters
 *  android.bluetooth.BluetoothDevice
 *  android.bluetooth.BluetoothHeadset
 *  android.content.AttributionSource
 *  android.content.ClipData
 *  android.content.Context
 *  android.content.ContextParams
 *  android.content.ContextParams$Builder
 *  android.content.res.Configuration
 *  android.media.AudioDeviceInfo
 *  android.media.AudioManager
 *  android.media.AudioRecord$Builder
 *  android.media.metrics.LogSessionId
 *  android.media.metrics.MediaMetricsManager
 *  android.media.metrics.NetworkEvent
 *  android.media.metrics.NetworkEvent$Builder
 *  android.media.metrics.PlaybackErrorEvent
 *  android.media.metrics.PlaybackErrorEvent$Builder
 *  android.media.metrics.PlaybackMetrics
 *  android.media.metrics.PlaybackMetrics$Builder
 *  android.media.metrics.PlaybackSession
 *  android.media.metrics.PlaybackStateEvent
 *  android.media.metrics.PlaybackStateEvent$Builder
 *  android.media.metrics.TrackChangeEvent
 *  android.media.metrics.TrackChangeEvent$Builder
 *  android.net.NetworkRequest
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Bundle
 *  android.os.Parcelable$Creator
 *  android.os.StrictMode$VmPolicy$Builder
 *  android.speech.RecognitionService$Callback
 *  android.telephony.TelephonyManager
 *  android.view.ContentInfo
 *  android.view.ContentInfo$Builder
 *  android.view.RoundedCorner
 *  android.view.View
 *  android.view.WindowInsets
 *  android.widget.EdgeEffect
 */
import android.app.Notification;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.content.AttributionSource;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextParams;
import android.content.res.Configuration;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioManager$OnCommunicationDeviceChangedListener;
import android.media.AudioRecord;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.StrictMode;
import android.speech.RecognitionService;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;
import android.view.ContentInfo;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.widget.EdgeEffect;
import java.util.List;
import java.util.concurrent.Executor;

public final class ut$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ float m(EdgeEffect edgeEffect) {
        return edgeEffect.getDistance();
    }

    public static /* bridge */ /* synthetic */ float m(EdgeEffect edgeEffect, float f2, float f3) {
        return edgeEffect.onPullDistance(f2, f3);
    }

    public static /* bridge */ /* synthetic */ int m(JobParameters jobParameters) {
        return jobParameters.getStopReason();
    }

    public static /* bridge */ /* synthetic */ int m(AttributionSource attributionSource) {
        return attributionSource.getUid();
    }

    public static /* bridge */ /* synthetic */ int m(Configuration configuration) {
        return configuration.fontWeightAdjustment;
    }

    public static /* bridge */ /* synthetic */ int m(ContentInfo contentInfo) {
        return contentInfo.getFlags();
    }

    public static /* bridge */ /* synthetic */ int m(RoundedCorner roundedCorner) {
        return roundedCorner.getRadius();
    }

    public static /* bridge */ /* synthetic */ Notification.Action.Builder m(Notification.Action.Builder builder, boolean bl2) {
        return builder.setAuthenticationRequired(bl2);
    }

    public static /* bridge */ /* synthetic */ JobInfo.Builder m(JobInfo.Builder builder, boolean bl2) {
        return builder.setExpedited(bl2);
    }

    public static /* bridge */ /* synthetic */ AttributionSource m(Context context) {
        return context.getAttributionSource();
    }

    public static /* bridge */ /* synthetic */ AttributionSource m(RecognitionService.Callback callback) {
        return callback.getCallingAttributionSource();
    }

    public static /* bridge */ /* synthetic */ AttributionSource m(Object object) {
        return (AttributionSource)object;
    }

    public static /* bridge */ /* synthetic */ ClipData m(ContentInfo contentInfo) {
        return contentInfo.getClip();
    }

    public static /* bridge */ /* synthetic */ Context m(Context context, ContextParams contextParams) {
        return context.createContext(contextParams);
    }

    public static /* bridge */ /* synthetic */ ContextParams.Builder m(ContextParams.Builder builder, AttributionSource attributionSource) {
        return builder.setNextAttributionSource(attributionSource);
    }

    public static /* bridge */ /* synthetic */ ContextParams m(ContextParams.Builder builder) {
        return builder.build();
    }

    public static /* bridge */ /* synthetic */ AudioRecord.Builder m(AudioRecord.Builder builder, Context context) {
        return builder.setContext(context);
    }

    public static /* bridge */ /* synthetic */ LogSessionId m() {
        return LogSessionId.LOG_SESSION_ID_NONE;
    }

    public static /* bridge */ /* synthetic */ LogSessionId m(PlaybackSession playbackSession) {
        return playbackSession.getSessionId();
    }

    public static /* bridge */ /* synthetic */ MediaMetricsManager m(Object object) {
        return (MediaMetricsManager)object;
    }

    public static /* bridge */ /* synthetic */ NetworkEvent.Builder m(NetworkEvent.Builder builder, int n2) {
        return builder.setNetworkType(n2);
    }

    public static /* bridge */ /* synthetic */ NetworkEvent.Builder m(NetworkEvent.Builder builder, long l2) {
        return builder.setTimeSinceCreatedMillis(l2);
    }

    public static /* bridge */ /* synthetic */ NetworkEvent m(NetworkEvent.Builder builder) {
        return builder.build();
    }

    public static /* bridge */ /* synthetic */ PlaybackErrorEvent.Builder m(PlaybackErrorEvent.Builder builder, int n2) {
        return builder.setErrorCode(n2);
    }

    public static /* bridge */ /* synthetic */ PlaybackErrorEvent.Builder m(PlaybackErrorEvent.Builder builder, long l2) {
        return builder.setTimeSinceCreatedMillis(l2);
    }

    public static /* bridge */ /* synthetic */ PlaybackErrorEvent.Builder m(PlaybackErrorEvent.Builder builder, Exception exception) {
        return builder.setException(exception);
    }

    public static /* bridge */ /* synthetic */ PlaybackErrorEvent m(PlaybackErrorEvent.Builder builder) {
        return builder.build();
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder m(PlaybackMetrics.Builder builder, int n2) {
        return builder.setStreamType(n2);
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder m(PlaybackMetrics.Builder builder, long l2) {
        return builder.setMediaDurationMillis(l2);
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder m(PlaybackMetrics.Builder builder, String string) {
        return builder.setPlayerName(string);
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics m(PlaybackMetrics.Builder builder) {
        return builder.build();
    }

    public static /* bridge */ /* synthetic */ PlaybackSession m(MediaMetricsManager mediaMetricsManager) {
        return mediaMetricsManager.createPlaybackSession();
    }

    public static /* bridge */ /* synthetic */ PlaybackStateEvent.Builder m(PlaybackStateEvent.Builder builder, int n2) {
        return builder.setState(n2);
    }

    public static /* bridge */ /* synthetic */ PlaybackStateEvent.Builder m(PlaybackStateEvent.Builder builder, long l2) {
        return builder.setTimeSinceCreatedMillis(l2);
    }

    public static /* bridge */ /* synthetic */ PlaybackStateEvent m(PlaybackStateEvent.Builder builder) {
        return builder.build();
    }

    public static /* bridge */ /* synthetic */ TrackChangeEvent.Builder m(TrackChangeEvent.Builder builder, int n2) {
        return builder.setTrackState(n2);
    }

    public static /* bridge */ /* synthetic */ TrackChangeEvent.Builder m(TrackChangeEvent.Builder builder, long l2) {
        return builder.setTimeSinceCreatedMillis(l2);
    }

    public static /* bridge */ /* synthetic */ TrackChangeEvent.Builder m(TrackChangeEvent.Builder builder, String string) {
        return builder.setSampleMimeType(string);
    }

    public static /* bridge */ /* synthetic */ TrackChangeEvent m(TrackChangeEvent.Builder builder) {
        return builder.build();
    }

    public static /* bridge */ /* synthetic */ Parcelable.Creator m() {
        return AttributionSource.CREATOR;
    }

    public static /* bridge */ /* synthetic */ StrictMode.VmPolicy.Builder m(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }

    public static /* bridge */ /* synthetic */ ContentInfo.Builder m(ContentInfo.Builder builder, int n2) {
        return builder.setFlags(n2);
    }

    public static /* bridge */ /* synthetic */ ContentInfo.Builder m(ContentInfo.Builder builder, Uri uri) {
        return builder.setLinkUri(uri);
    }

    public static /* bridge */ /* synthetic */ ContentInfo.Builder m(ContentInfo.Builder builder, Bundle bundle) {
        return builder.setExtras(bundle);
    }

    public static /* bridge */ /* synthetic */ ContentInfo m(ContentInfo.Builder builder) {
        return builder.build();
    }

    public static /* bridge */ /* synthetic */ ContentInfo m(View view, ContentInfo contentInfo) {
        return view.performReceiveContent(contentInfo);
    }

    public static /* bridge */ /* synthetic */ ContentInfo m(Object object) {
        return (ContentInfo)object;
    }

    public static /* bridge */ /* synthetic */ RoundedCorner m(WindowInsets windowInsets, int n2) {
        return windowInsets.getRoundedCorner(n2);
    }

    public static /* bridge */ /* synthetic */ String m() {
        return Build.SOC_MANUFACTURER;
    }

    public static /* bridge */ /* synthetic */ String m(AttributionSource attributionSource) {
        return attributionSource.getAttributionTag();
    }

    public static /* bridge */ /* synthetic */ String m(LogSessionId logSessionId) {
        return logSessionId.getStringId();
    }

    public static /* bridge */ /* synthetic */ List m(AudioManager audioManager) {
        return audioManager.getAvailableCommunicationDevices();
    }

    public static /* bridge */ /* synthetic */ void m(AudioManager audioManager) {
        audioManager.clearCommunicationDevice();
    }

    public static /* bridge */ /* synthetic */ void m(AudioManager audioManager, AudioManager$OnCommunicationDeviceChangedListener audioManager$OnCommunicationDeviceChangedListener) {
        audioManager.removeOnCommunicationDeviceChangedListener(audioManager$OnCommunicationDeviceChangedListener);
    }

    public static /* bridge */ /* synthetic */ void m(AudioManager audioManager, Executor executor, AudioManager$OnCommunicationDeviceChangedListener audioManager$OnCommunicationDeviceChangedListener) {
        audioManager.addOnCommunicationDeviceChangedListener(executor, audioManager$OnCommunicationDeviceChangedListener);
    }

    public static /* bridge */ /* synthetic */ void m(PlaybackSession playbackSession, NetworkEvent networkEvent) {
        playbackSession.reportNetworkEvent(networkEvent);
    }

    public static /* bridge */ /* synthetic */ void m(PlaybackSession playbackSession, PlaybackErrorEvent playbackErrorEvent) {
        playbackSession.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    public static /* bridge */ /* synthetic */ void m(PlaybackSession playbackSession, PlaybackMetrics playbackMetrics) {
        playbackSession.reportPlaybackMetrics(playbackMetrics);
    }

    public static /* bridge */ /* synthetic */ void m(PlaybackSession playbackSession, PlaybackStateEvent playbackStateEvent) {
        playbackSession.reportPlaybackStateEvent(playbackStateEvent);
    }

    public static /* bridge */ /* synthetic */ void m(PlaybackSession playbackSession, TrackChangeEvent trackChangeEvent) {
        playbackSession.reportTrackChangeEvent(trackChangeEvent);
    }

    public static /* bridge */ /* synthetic */ void m(TelephonyManager telephonyManager, TelephonyCallback telephonyCallback) {
        telephonyManager.unregisterTelephonyCallback(telephonyCallback);
    }

    public static /* bridge */ /* synthetic */ void m(TelephonyManager telephonyManager, Executor executor, TelephonyCallback telephonyCallback) {
        telephonyManager.registerTelephonyCallback(executor, telephonyCallback);
    }

    public static /* bridge */ /* synthetic */ boolean m(BluetoothHeadset bluetoothHeadset, BluetoothDevice bluetoothDevice) {
        return bluetoothHeadset.isVoiceRecognitionSupported(bluetoothDevice);
    }

    public static /* bridge */ /* synthetic */ boolean m(AudioManager audioManager, AudioDeviceInfo audioDeviceInfo) {
        return audioManager.setCommunicationDevice(audioDeviceInfo);
    }

    public static /* bridge */ /* synthetic */ boolean m(LogSessionId logSessionId, Object object) {
        return logSessionId.equals(object);
    }

    public static /* bridge */ /* synthetic */ int[] m(NetworkRequest networkRequest) {
        return networkRequest.getTransportTypes();
    }

    public static /* bridge */ /* synthetic */ String[] m(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static /* bridge */ /* synthetic */ int m$1(ContentInfo contentInfo) {
        return contentInfo.getSource();
    }

    public static /* bridge */ /* synthetic */ PlaybackErrorEvent.Builder m$1(PlaybackErrorEvent.Builder builder, int n2) {
        return builder.setSubErrorCode(n2);
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder m$1(PlaybackMetrics.Builder builder, int n2) {
        return builder.setStreamSource(n2);
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder m$1(PlaybackMetrics.Builder builder, long l2) {
        return builder.setNetworkTransferDurationMillis(l2);
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder m$1(PlaybackMetrics.Builder builder, String string) {
        return builder.setPlayerVersion(string);
    }

    public static /* bridge */ /* synthetic */ TrackChangeEvent.Builder m$1(TrackChangeEvent.Builder builder, int n2) {
        return builder.setTrackChangeReason(n2);
    }

    public static /* bridge */ /* synthetic */ TrackChangeEvent.Builder m$1(TrackChangeEvent.Builder builder, String string) {
        return builder.setLanguage(string);
    }

    public static /* bridge */ /* synthetic */ int[] m$1(NetworkRequest networkRequest) {
        return networkRequest.getCapabilities();
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder m$2(PlaybackMetrics.Builder builder, int n2) {
        return builder.setPlaybackType(n2);
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder m$2(PlaybackMetrics.Builder builder, long l2) {
        return builder.setNetworkBytesRead(l2);
    }

    public static /* bridge */ /* synthetic */ TrackChangeEvent.Builder m$2(TrackChangeEvent.Builder builder, int n2) {
        return builder.setAudioSampleRate(n2);
    }

    public static /* bridge */ /* synthetic */ TrackChangeEvent.Builder m$2(TrackChangeEvent.Builder builder, String string) {
        return builder.setLanguageRegion(string);
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder m$3(PlaybackMetrics.Builder builder, int n2) {
        return builder.setAudioUnderrunCount(n2);
    }

    public static /* bridge */ /* synthetic */ TrackChangeEvent.Builder m$3(TrackChangeEvent.Builder builder, int n2) {
        return builder.setBitrate(n2);
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder m$4(PlaybackMetrics.Builder builder, int n2) {
        return builder.setVideoFramesDropped(n2);
    }

    public static /* bridge */ /* synthetic */ TrackChangeEvent.Builder m$4(TrackChangeEvent.Builder builder, int n2) {
        return builder.setChannelCount(n2);
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder m$5(PlaybackMetrics.Builder builder, int n2) {
        return builder.setVideoFramesPlayed(n2);
    }
}

