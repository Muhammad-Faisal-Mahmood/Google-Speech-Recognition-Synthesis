/*
 * Decompiled with CFR 0.152.
 */
public final class bpw
implements Runnable {
    private final int a;

    public /* synthetic */ bpw(int n2) {
        this.a = n2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                ((heg)((heg)gld.a.f()).j("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "sync", 210, "SyncManagerImpl.java")).r("#sync() complete");
            }
            case 19: {
                return;
            }
            case 18: {
                Throwable throwable = new Throwable();
                throwable.fillInStackTrace();
                a.as(gbx.a.g(), "b/66999648 detected", "com/google/apps/tiktok/concurrent/futuresmixin/FuturesMixinImpl$1", "run", '\u00ec', "FuturesMixinImpl.java", throwable);
                return;
            }
            case 17: {
                ((heg)((heg)fix.a.h().h(hfo.a, "GoogleAsrService")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/GoogleAsrServiceImpl", "checkModelAvailability", 156, "GoogleAsrServiceImpl.java")).r("#checkModelAvailability cancelled by client.");
                return;
            }
            case 16: {
                ((heg)((heg)fix.a.h().h(hfo.a, "GoogleAsrService")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/GoogleAsrServiceImpl", "downloadModel", 187, "GoogleAsrServiceImpl.java")).r("#downloadModel cancelled by client.");
                return;
            }
            case 15: {
                ((heg)((heg)fix.a.h().h(hfo.a, "GoogleAsrService")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/GoogleAsrServiceImpl", "queryServiceStatus", 115, "GoogleAsrServiceImpl.java")).r("#queryServiceStatus cancelled by client.");
                return;
            }
            case 14: {
                ((heg)((heg)ffv.a.c()).j("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onHeartbeat", 308, "RecognitionClient.java")).r("#onHeartbeat");
            }
            case 13: {
                return;
            }
            case 12: {
                dul.e();
                return;
            }
            case 11: {
                throw new RuntimeException("Someone quit the @LightweightExecutor looper");
            }
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
        }
    }
}

