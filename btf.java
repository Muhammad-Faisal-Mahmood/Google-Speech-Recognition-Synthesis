/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

public final class btf
implements hnx {
    public final btj a;

    public /* synthetic */ btf(btj btj2) {
        this.a = btj2;
    }

    @Override
    public final hpn a() {
        ((heg)((heg)btj.a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataDownloader", "init", 246, "VoiceDataDownloader.java")).r("Not already initialized. Initializing Superpacks.");
        Object object = this.a;
        Object object2 = ((btj)object).c;
        Object object3 = ddv.a;
        ArrayList arrayList = ddw.a;
        fxf.K(object2);
        fxf.K(((btj)object).p);
        Context context = ((btj)object).c;
        object2 = new dch(context.getApplicationContext());
        Object object4 = new dbn((hpq)object3);
        int n2 = 0;
        ((dch)object2).a((dej)object4, 0);
        ((dch)object2).a(((btj)object).e, 0);
        ((dch)object2).a(((btj)object).f, 0);
        ((dch)object2).a(((btj)object).g, 0);
        ((dch)object2).a(((btj)object).h, 0);
        object4 = new ArrayList();
        dhc dhc2 = new dhc();
        dhc2.a = context;
        Object object5 = ((btj)object).p;
        dhc2.d = ((bxf)object5).h();
        dhc2.b = arrayList;
        object4.add(dhc2.a());
        ((dch)object2).a(dly.E((ScheduledExecutorService)object3, (List)object4), 1);
        object4 = new dim();
        ((dim)object4).a = context;
        ((dim)object4).c = ((bxf)object5).h();
        object5 = new dii();
        ((dii)object5).b = context;
        ((dim)object4).b = ((dii)object5).a();
        if (((dim)object4).e == null) {
            ((dim)object4).e = new bzq((Object)dfp.b(((dim)object4).a), null);
        }
        if (((dim)object4).b == null) {
            object5 = new dii();
            ((dii)object5).b = ((dim)object4).a;
            ((dim)object4).b = ((dii)object5).a();
        }
        ((dch)object2).a(new din((dim)object4), 2);
        object4 = new bum((hpq)((Object)arrayList));
        ((dch)object2).c.a(object4, 0);
        arrayList = new dgh((hpq)((Object)arrayList), dgl.a);
        ((dch)object2).d.a(arrayList, 0);
        ((dch)object2).g = 1;
        ((dch)object2).k = dbk.a;
        ((dch)object2).f = object3;
        ((dch)object2).h = new File(btj.f(context));
        dec.o("maxAllowedValidationFailureCount", 8L);
        ((dch)object2).j = 8;
        ((btj)object).q = new egg((dch)object2);
        ((heg)((heg)btj.a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataDownloader", "createSuperpacks", 801, "VoiceDataDownloader.java")).r("Superpack object built.");
        ((btj)object).q.g("ttsvoices", new btd());
        ((heg)((heg)btj.a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataDownloader", "createSuperpacks", 806, "VoiceDataDownloader.java")).r("Superpack slicing strategy registered");
        ((btj)object).q.h("ttsvoices");
        fxf.K(((btj)object).r);
        arrayList = new ArrayList(((btj)object).r.l().a().values());
        int n3 = arrayList.size();
        while (n2 < n3) {
            object3 = (buc)arrayList.get(n2);
            ((btj)object).q.h(((buc)object3).c);
            ++n2;
        }
        ((heg)((heg)btj.a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataDownloader", "createSuperpacks", 814, "VoiceDataDownloader.java")).r("Superpack quota set for all voices.");
        ((btj)object).g();
        fxf.K(((btj)object).q);
        object3 = ((btj)object).q;
        n2 = ((btj)object).i;
        object = ((btj)object).n;
        return ((egg)object3).c(ded.c("ttsvoices", n2), btj.a((dbx)object));
    }
}

