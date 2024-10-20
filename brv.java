/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import java.util.List;
import java.util.Locale;

public final class brv {
    private static final hei p = hei.m("com/google/android/apps/speech/tts/googletts/common/GoogleTTSRequest");
    public final CharSequence a;
    public String b;
    public String c;
    public final int d;
    public final int e;
    public final int f;
    public final Bundle g;
    public ikd h;
    public String i;
    public final String j;
    public final List k;
    public final float l;
    public String m = null;
    public final boolean n;
    public boolean o;
    private String q;

    public brv(CharSequence stringArray, String string, String string2, String string3, int n2, int n3, int n4, List list, Bundle bundle, float f2, Locale locale, String string4) {
        float f3;
        this.a = stringArray;
        stringArray = stringArray.toString();
        boolean bl2 = stringArray != null && stringArray.contains("<speak") && ith.a.b().a();
        this.n = bl2;
        this.b = fxf.T(string);
        stringArray = (String[])bundle.getByteArray("com.google.android.tts:TextProto");
        if (stringArray != null) {
            try {
                hwj hwj2 = hwj.a();
                stringArray = hwv.o(ikd.a, (byte[])stringArray, 0, stringArray.length, hwj2);
                hwv.D((hwv)stringArray);
                this.h = (ikd)stringArray;
            }
            catch (hxn hxn2) {
                a.as(p.g(), "Could not parse text proto", "com/google/android/apps/speech/tts/googletts/common/GoogleTTSRequest", "<init>", '\u00a7', "GoogleTTSRequest.java", hxn2);
            }
        }
        this.c = locale != null && string.equalsIgnoreCase(locale.getLanguage()) && string2.isEmpty() ? fxf.T(locale.getCountry()) : fxf.T(string2);
        this.d = n2;
        this.e = n3;
        this.f = n4;
        this.k = list;
        this.g = bundle;
        this.j = string4;
        this.q = null;
        if (string3 != null) {
            n3 = string3.indexOf("-local");
            n4 = string3.indexOf("-network");
            n2 = string3.indexOf("-language");
            if (n3 != -1) {
                this.i = string3.substring(0, n3);
            } else if (n4 != -1) {
                this.i = string3.substring(0, n4);
                this.q = "NetworkFirst";
            } else if (n2 != -1) {
                stringArray = string3.split("-");
                n2 = stringArray.length;
                if (n2 == 3) {
                    this.b = fxf.T(stringArray[0]);
                    this.c = fxf.T(stringArray[1]);
                    ((heg)((heg)p.c()).j("com/google/android/apps/speech/tts/googletts/common/GoogleTTSRequest", "<init>", 202, "GoogleTTSRequest.java")).G("Interpreting request for %s as request for %s-%s", string3, this.b, this.c);
                } else if (n2 == 2) {
                    this.b = fxf.T(stringArray[0]);
                    this.c = "";
                    ((heg)((heg)p.c()).j("com/google/android/apps/speech/tts/googletts/common/GoogleTTSRequest", "<init>", 208, "GoogleTTSRequest.java")).C("Interpreting request for %s as request for %s", string3, this.b);
                } else {
                    ((heg)((heg)p.g()).j("com/google/android/apps/speech/tts/googletts/common/GoogleTTSRequest", "<init>", 211, "GoogleTTSRequest.java")).u("Invalid voice name: %s", string3);
                }
                this.i = null;
            }
        } else {
            this.i = null;
        }
        try {
            f3 = Float.parseFloat(bundle.getString("com.google.android.tts:LoudnessGain", "0.0f"));
        }
        catch (NumberFormatException numberFormatException) {
            f3 = 0.0f;
        }
        if (!(f3 < 1.0f)) {
            f2 = f3;
        }
        this.l = Math.min(Math.max(f2, 1.0f), 316.22f);
    }

    public static final int n(String string, Bundle bundle) {
        Object object = bundle.get(string);
        if (object instanceof Integer) {
            return (Integer)object;
        }
        return Integer.parseInt(bundle.getString(string));
    }

    public static final boolean o(String string, Bundle bundle) {
        return bundle != null && bundle.get(string) != null;
    }

    private final String p() {
        String string;
        String string2 = string = this.g.getString("com.google.android.tts:Mode");
        if (string == null) {
            string2 = this.q;
        }
        return string2;
    }

    private static final boolean q(String string, Bundle bundle) {
        Object object = bundle.get(string);
        if (object instanceof Boolean) {
            return (Boolean)object;
        }
        return Boolean.parseBoolean(bundle.getString(string));
    }

    public final float a() {
        float f2;
        float f3 = this.e;
        if (f3 >= 100.0f) {
            f2 = f3;
            if (f3 > 400.0f) {
                f2 = 400.0f;
            }
            f3 = (f2 - 100.0f) / 300.0f * 3.0f;
            f2 = 1.0f;
        } else {
            f2 = f3;
            if (f3 < 20.0f) {
                f2 = 20.0f;
            }
            f3 = (f2 - 20.0f) / 80.0f;
            f2 = 0.5f;
            f3 *= 0.5f;
        }
        return f3 + f2;
    }

    public final int b() {
        String string = brv.q("networkTts", this.g) ? "NetworkOnly" : (brv.q("embeddedTts", this.g) ? "LocalOnly" : (!fxf.P(this.g.getString("com.google.android.tts:Mode")) ? this.g.getString("com.google.android.tts:Mode") : "LocalFirst"));
        String string2 = this.j;
        int n2 = string2 != null ? string2.hashCode() + 37 : 1;
        int n3 = string.hashCode();
        int n4 = true != this.f() ? 4177 : 4159;
        return ((((n2 * 37 + n3) * 37 + n4) * 37 + this.k.hashCode()) * 37 + this.e) * 37 + this.d;
    }

    public final String c() {
        return this.g.getString("com.google.android.tts:VuiId");
    }

    public final Locale d() {
        return new Locale(this.b, this.c);
    }

    public final boolean e() {
        return "x-detect".equals(this.g.getString("com.google.android.tts:LanguageDetection"));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        if (!(object instanceof brv)) {
            return false;
        }
        object = (brv)object;
        if (!this.a.toString().contentEquals(((brv)object).a)) {
            return false;
        }
        if (!this.b.equals(((brv)object).b)) {
            return false;
        }
        if (!this.c.equals(((brv)object).c)) {
            return false;
        }
        if (this.d != ((brv)object).d) {
            return false;
        }
        if (this.e != ((brv)object).e) {
            return false;
        }
        if (this.f != ((brv)object).f) {
            return false;
        }
        Bundle bundle = this.g;
        Bundle bundle2 = ((brv)object).g;
        Object object2 = bundle.keySet();
        if (!object2.containsAll(bundle2.keySet())) return false;
        object2 = object2.iterator();
        while (object2.hasNext()) {
            String string = (String)object2.next();
            if (bundle.get(string).equals(bundle2.get(string))) continue;
            return false;
        }
        if (!a.k(this.i, ((brv)object).i)) {
            return false;
        }
        if (this.k == ((brv)object).k) return this.l == ((brv)object).l;
        return false;
    }

    public final boolean f() {
        return "hol".equals(this.g.getString("com.google.android.tts:UseGoogleOnlyVoice"));
    }

    public final boolean g() {
        return this.i != null;
    }

    public final boolean h() {
        String string = this.g.getString("com.google.android.tts:EnableEnUsVoiceSelectionFallback");
        return string != null && fxf.V("true", string);
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        int n3 = this.b.hashCode();
        int n4 = this.c.hashCode();
        Object object = this.g;
        int n5 = this.d;
        int n6 = this.e;
        int n7 = this.f;
        int n8 = object.size();
        object = this.i;
        int n9 = object == null ? 0 : ((String)object).hashCode();
        return (((((((((n2 + 31) * 31 + n3) * 31 + n4) * 31 + n5) * 31 + n6) * 31 + n7) * 31 + n8) * 31 + n9) * 31 + this.k.hashCode()) * 31 + Float.floatToRawIntBits(this.l);
    }

    public final boolean i() {
        String string = this.g.getString("com.google.android.tts:DisableInterLanguageFallback");
        return string != null && fxf.V("true", string);
    }

    public final boolean j() {
        return "LocalOnly".equals(this.p()) || brv.q("embeddedTts", this.g);
        {
        }
    }

    public final boolean k() {
        return "NetworkFirst".equals(this.p());
    }

    public final boolean l() {
        return "NetworkOnly".equals(this.p()) || brv.q("networkTts", this.g);
        {
        }
    }

    public final boolean m() {
        String string = this.g.getString("com.google.android.tts:DisableVoiceSelectionFallback");
        return string != null && fxf.V("true", string);
    }
}

