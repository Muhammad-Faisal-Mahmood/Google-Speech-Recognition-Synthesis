/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.speech.RecognitionService$Callback
 */
import android.os.Bundle;
import android.speech.RecognitionService;

public final class fkf
implements fkh {
    public final RecognitionService.Callback a;
    private final int b;

    public /* synthetic */ fkf(RecognitionService.Callback callback, int n2) {
        this.b = n2;
        this.a = callback;
    }

    @Override
    public final void a() {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    this.a.endOfSpeech();
                    return;
                }
                this.a.beginningOfSpeech();
                return;
            }
            this.a.results(Bundle.EMPTY);
            return;
        }
        a$$ExternalSyntheticApiModelOutline0.m(this.a);
    }
}

