/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.util.concurrent.Callable;

public final class fjg
implements Callable {
    public final fjj a;
    public final boolean b;

    public /* synthetic */ fjg(fjj fjj2, boolean bl2) {
        this.a = fjj2;
        this.b = bl2;
    }

    public final Object call() {
        Object object = (heg)((heg)fjj.a.f()).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionSession", "onDataDonationResponse", 466, "RecognitionSession.java");
        Object object2 = this.a;
        Object object3 = ((fjj)object2).g;
        boolean bl2 = this.b;
        object.D("[%s] #onDataDonationResponse: %b", object3, bl2);
        object3 = (hwr)fiq.a.l();
        gpm gpm2 = fhk.d;
        object = fhk.a.l();
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        object2 = ((fjj)object2).l;
        fhk fhk2 = (fhk)((hwp)object).b;
        fhk2.b |= 1;
        fhk2.c = bl2;
        ((hwr)object3).aH(gpm2, (fhk)((hwp)object).o());
        ((AmbientModeSupport$AmbientController)object2).f((fiq)((hwp)object3).o());
        return null;
    }
}

