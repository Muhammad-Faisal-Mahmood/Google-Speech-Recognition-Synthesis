/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import androidx.wear.ambient.SharedLibraryVersion;

public final class bwo
implements pq {
    public final Object a;
    private final int b;

    public /* synthetic */ bwo(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final Object a(po object) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 != 5) {
                                ((eti)this.a).a = object;
                                return "createAudioRouteDisconnectFuture";
                            }
                            ((eth)this.a).a = object;
                            return "createAudioRouteDisconnectFuture";
                        }
                        ((eou)this.a).d = object;
                        return "createHotwordStopListeningStatusFuture";
                    }
                    ((jsj)this.a).a = object;
                    return "createStopListeningStatusFuture";
                }
                ((efj)this.a).g = object;
                return "releaseAudioFocusStatusFuture";
            }
            Object object2 = this.a;
            object = new aks(object2, object, 16, null);
            ((brq)object2).d.post((Runnable)object);
            return "ExoPlayer idle future after preparing media";
        }
        awf awf2 = SharedLibraryVersion.e(new eza(1));
        object = new AmbientModeSupport$AmbientController(object);
        awf2.q(((bwp)this.a).b, "tts_android", (AmbientModeSupport$AmbientController)object);
        return "relinker_future";
    }
}

