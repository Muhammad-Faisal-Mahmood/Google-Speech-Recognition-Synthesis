/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.speech.RecognitionService$Callback
 */
import android.os.Bundle;
import android.speech.RecognitionService;

public final class fke
implements fkh {
    public final RecognitionService.Callback a;
    public final Bundle b;
    private final int c;

    public /* synthetic */ fke(RecognitionService.Callback callback, Bundle bundle, int n2) {
        this.c = n2;
        this.a = callback;
        this.b = bundle;
    }

    @Override
    public final void a() {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 != 5) {
                                Bundle bundle = this.b;
                                this.a.results(bundle);
                                return;
                            }
                            Bundle bundle = this.b;
                            a$$ExternalSyntheticApiModelOutline0.m(this.a, bundle);
                            return;
                        }
                        Bundle bundle = this.b;
                        this.a.partialResults(bundle);
                        return;
                    }
                    Bundle bundle = this.b;
                    this.a.partialResults(bundle);
                    return;
                }
                Bundle bundle = this.b;
                this.a.readyForSpeech(bundle);
                return;
            }
            Bundle bundle = this.b;
            mk$$ExternalSyntheticApiModelOutline0.m(this.a, bundle);
            return;
        }
        Bundle bundle = this.b;
        this.a.partialResults(bundle);
    }
}

