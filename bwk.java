/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.android.apps.speech.tts.googletts.dispatch.VoicePolicyManager;
import com.google.android.apps.speech.tts.googletts.service.GoogleTtsService;
import java.util.concurrent.atomic.AtomicBoolean;

public final class bwk
extends bwl {
    public static final hei a = hei.m("com/google/android/apps/speech/tts/googletts/service/GoogleTtsServicePeer");
    public final GoogleTtsService b;
    public bwi c;
    public bzs d;
    public final jnu e;
    public final bwq f;
    public final btn g;
    public final Context h;
    public final bvo i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public final bxf k;
    public final VoicePolicyManager l;
    public final bwp m;

    public bwk(GoogleTtsService googleTtsService, jnu jnu2, bwp bwp2, bvo bvo2, bwq bwq2, bxf bxf2, btn btn2, VoicePolicyManager voicePolicyManager, Context context) {
        this.b = googleTtsService;
        this.e = jnu2;
        this.m = bwp2;
        this.i = bvo2;
        this.f = bwq2;
        this.k = bxf2;
        this.g = btn2;
        this.l = voicePolicyManager;
        this.h = context;
    }
}

