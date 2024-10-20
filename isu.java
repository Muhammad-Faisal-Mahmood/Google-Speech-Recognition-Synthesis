/*
 * Decompiled with CFR 0.152.
 */
public final class isu
implements ist {
    public static final dwc a;
    public static final dwc b;
    public static final dwc c;
    public static final dwc d;

    static {
        hav hav2 = hdc.a;
        hav2 = hav.p("GOOGLETTS", "GOOGLETTS_ANDROID_PRIMES");
        a = dwg.c("Lemonbalm__enable_compile_on_device", false, "com.google.android.tts", hav2, true, true);
        b = dwg.c("Lemonbalm__enable_lemonbalm_cpu", false, "com.google.android.tts", hav2, true, true);
        c = dwg.c("Lemonbalm__enable_lemonbalm_darwinn_janeiro", false, "com.google.android.tts", hav2, true, true);
        d = dwg.c("Lemonbalm__enable_lemonbalm_darwinn_rio", false, "com.google.android.tts", hav2, true, true);
    }

    @Override
    public final boolean a() {
        return (Boolean)b.a();
    }

    @Override
    public final boolean b() {
        return (Boolean)c.a();
    }

    @Override
    public final boolean c() {
        return (Boolean)d.a();
    }
}

