/*
 * Decompiled with CFR 0.152.
 */
public final class isr
implements isq {
    public static final duy a;
    public static final duy b;

    static {
        Object object = hdc.a;
        hav.p("GOOGLETTS", "GOOGLETTS_ANDROID_PRIMES");
        object = new gzy();
        ((gzy)object).d("VocaineSilenceMuter__enable_muting", itn.a);
        ((gzy)object).d("Darwinn__enable_darwinn", isl.b);
        ((gzy)object).d("Darwinn__compile_on_device", isl.a);
        ((gzy)object).d("Lemonbalm__enable_compile_on_device", isu.a);
        ((gzy)object).d("Lemonbalm__enable_lemonbalm_darwinn_rio", isu.d);
        ((gzy)object).d("Locomel__enable_compile_on_device", isx.b);
        ((gzy)object).d("Locomel__enable_havoc_on_32bit", isx.c);
        ((gzy)object).d("Locomel__enable_havoc_on_64bit", isx.d);
        a = new duy(((gzy)object).b());
        object = new gzy();
        ((gzy)object).d("Locomel__duration_delegate", isx.a);
        ((gzy)object).d("Locomel__mel_delegate", isx.f);
        ((gzy)object).d("Locomel__nvoc_delegate", isx.g);
        b = new duy(((gzy)object).b());
    }

    @Override
    public final duy a() {
        return a;
    }

    @Override
    public final duy b() {
        return b;
    }
}

