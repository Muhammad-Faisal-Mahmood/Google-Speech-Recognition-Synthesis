/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.speech.RecognitionService$Callback
 */
import android.speech.RecognitionService;

public final class fkc
implements fkh {
    public final RecognitionService.Callback a;
    public final float b;

    public /* synthetic */ fkc(RecognitionService.Callback callback, float f2) {
        this.a = callback;
        this.b = f2;
    }

    @Override
    public final void a() {
        this.a.rmsChanged(this.b);
    }
}

