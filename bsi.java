/*
 * Decompiled with CFR 0.152.
 */
public final class bsi {
    public static final hei a = hei.m("com/google/android/apps/speech/tts/googletts/dispatch/SynthesisCache");
    public final gur b;
    public volatile boolean c = false;

    public bsi() {
        guw guw2 = new guw();
        guw2.g(3000000L);
        guw2.i(new bsf());
        this.b = guw2.a();
    }

    public final void a() {
        ((gvr)this.b).a.clear();
        this.b.l();
    }
}

