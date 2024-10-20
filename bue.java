/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 */
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import androidx.wear.ambient.AmbientMode$AmbientCallback;
import java.util.LinkedHashMap;
import java.util.Locale;

public final class bue
implements gjj {
    private static final hei a = hei.m("com/google/android/apps/speech/tts/googletts/local/voicepack/VoicepackUpdater");
    private final Configuration b;
    private final gcv c;

    public bue(Context context, gcv gcv2) {
        this.c = gcv2;
        this.b = context.getResources().getConfiguration();
    }

    @Override
    public final hpn a(Intent object) {
        if (!ito.c()) {
            return hhk.K(null);
        }
        object = a;
        ((heg)((heg)((hdz)object).f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoicepackUpdater", "onReceive", 55, "VoicepackUpdater.java")).r("Starting voicepack update.");
        Object object2 = brz.h(ag$$ExternalSyntheticApiModelOutline1.m(ag$$ExternalSyntheticApiModelOutline1.m(this.b), 0));
        ((heg)((heg)((hdz)object).f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoicepackUpdater", "onReceive", 61, "VoicepackUpdater.java")).r("Retrieved system locale.");
        object = this.c;
        object2 = ((Locale)object2).toLanguageTag();
        Object object3 = new LinkedHashMap();
        AmbientMode$AmbientCallback.d("locale_to_sync", (String)object2, object3);
        object3 = AmbientMode$AmbientCallback.a(object3);
        gch gch2 = gcl.a(bug.class);
        gch2.f(new gck("voicepack_updater_worker", 1));
        gch2.f = object3;
        gch2.d(hav.p("en-US", object2));
        return ((gcv)object).b(gch2.a());
    }
}

