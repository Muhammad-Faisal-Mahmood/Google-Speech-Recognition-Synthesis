/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
import android.app.Activity;
import android.content.Context;

public final class fkx {
    public static final hei a = hei.m("com/google/android/libraries/speech/transcription/ui/TranscriptionInitializationFragmentPeer");
    public final fkw b;
    public final Activity c;
    public final Context d;

    public fkx(Activity activity, Context context, fkw fkw2) {
        this.c = activity;
        this.d = context;
        this.b = fkw2;
    }

    public final void a() {
        y y2 = new y(this.b.getChildFragmentManager());
        y2.p(2131427963, fkr.e(fhq.k()), "transcriptionFragment");
        ((ce)y2).b();
    }
}

