/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.android.apps.speech.tts.googletts.local.greco3.AndroidComposerImpl;

public final class bsv
implements imb {
    private final jnu a;
    private final jnu b;

    public bsv(jnu jnu2, jnu jnu3) {
        this.a = jnu2;
        this.b = jnu3;
    }

    public final AndroidComposerImpl a() {
        Context context = (Context)this.a.b();
        buj.c().intValue();
        buj.a().intValue();
        return new AndroidComposerImpl(context, 1024, 24000, ((brm)this.b).a());
    }
}

