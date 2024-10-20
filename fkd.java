/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.speech.RecognitionService$Callback
 */
import android.speech.RecognitionService;

public final class fkd
implements fkh {
    public final RecognitionService.Callback a;
    public final int b;

    public /* synthetic */ fkd(RecognitionService.Callback callback, int n2) {
        this.a = callback;
        this.b = n2;
    }

    @Override
    public final void a() {
        this.a.error(this.b);
    }
}

