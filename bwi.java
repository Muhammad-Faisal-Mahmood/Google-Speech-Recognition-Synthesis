/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.android.apps.speech.tts.googletts.dispatch.VoicePolicyManager;
import java.util.Locale;

public final class bwi {
    public static final hei a = hei.m("com/google/android/apps/speech/tts/googletts/service/GoogleTTSServiceImpl");
    public final bss b;
    public final bvo c;
    public final Context d;
    public final bsi e;
    public final bwq f;
    public final bzs g;
    public String h = null;
    public final bse i;
    public final btn j;
    public final VoicePolicyManager k;
    public final bxf l;
    public final bxt m;

    public bwi(btn object, bss bss2, bvo bvo2, VoicePolicyManager voicePolicyManager, bwq bwq2, bxf bxf2, bzs bzs2, Context context) {
        this.j = object;
        this.i = object = new bse((btn)object, bxf2, context);
        this.b = bss2;
        this.c = bvo2;
        this.e = new bsi();
        this.k = voicePolicyManager;
        this.f = bwq2;
        this.l = bxf2;
        this.g = bzs2;
        this.d = context;
        this.m = new bxt(context, object, null);
    }

    public final int a(bso object, Locale object2) {
        int n2;
        block5: {
            String string;
            Locale locale = this.i.a((Locale)object2);
            Locale locale2 = Locale.forLanguageTag(locale.getLanguage().replace('_', '-'));
            gzx gzx2 = ((bso)object).j();
            int n3 = gzx2.size();
            int n4 = -2;
            int n5 = 0;
            while (true) {
                n2 = n4;
                if (n5 >= n3) break block5;
                string = (String)gzx2.get(n5);
                object2 = brz.g(string);
                object = object2;
                if (object2.getCountry().isEmpty()) {
                    object = null;
                }
                if ((object2 = (Locale)brz.a.get(string)) == null) {
                    object2 = brz.k(string);
                    if (((String[])object2).length <= 0) break;
                    object2 = Locale.forLanguageTag(object2[0].replace('_', '-'));
                    brz.a.put(string, object2);
                }
                if (locale.equals(object)) {
                    n2 = 1;
                    break block5;
                }
                if (locale2.equals(object2)) {
                    n4 = 0;
                }
                ++n5;
            }
            throw new IllegalArgumentException("Invalid locale: ".concat(String.valueOf(string)));
        }
        return n2;
    }

    public final int b(String string, String string2, String string3) {
        return this.c(this.m, string, string2, string3);
    }

    public final int c(bxt object, String string, String string2, String object2) {
        if ((object2 = ((bxt)object).h(null, string, string2, this.k.a((String)object2), (String)object2)) != null) {
            this.h = (String)((bso)object2).j().get(0);
            object = a;
            ((heg)((heg)((hdz)object).f()).j("com/google/android/apps/speech/tts/googletts/service/GoogleTTSServiceImpl", "onIsLanguageAvailable", 440, "GoogleTTSServiceImpl.java")).u("currentLocale = %s", this.h);
            int n2 = this.a((bso)object2, brz.f(string, string2));
            ((heg)((heg)((hdz)object).c()).j("com/google/android/apps/speech/tts/googletts/service/GoogleTTSServiceImpl", "onIsLanguageAvailable", 444, "GoogleTTSServiceImpl.java")).G("onIsLanguageAvailable(%s-%s): %d", string, string2, n2);
            return n2;
        }
        ((heg)((heg)a.c()).j("com/google/android/apps/speech/tts/googletts/service/GoogleTTSServiceImpl", "onIsLanguageAvailable", 447, "GoogleTTSServiceImpl.java")).C("onIsLanguageAvailable(%s-%s): LANG_NOT_SUPPORTED", string, string2);
        return -2;
    }
}

