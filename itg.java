/*
 * Decompiled with CFR 0.152.
 */
public final class itg
implements itf {
    public static final dwc a;
    public static final dwc b;

    static {
        hav hav2 = hdc.a;
        hav2 = hav.p("GOOGLETTS", "GOOGLETTS_ANDROID_PRIMES");
        a = dwg.c("Settings__allow_enabling_tnt_components_at_runtime", true, "com.google.android.tts", hav2, true, true);
        b = dwg.c("Settings__enable_asr_settings", true, "com.google.android.tts", hav2, true, true);
    }

    @Override
    public final boolean a() {
        return (Boolean)a.a();
    }

    @Override
    public final boolean b() {
        return (Boolean)b.a();
    }
}

