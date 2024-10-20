/*
 * Decompiled with CFR 0.152.
 */
public final class bsq {
    public static final hei a = hei.m("com/google/android/apps/speech/tts/googletts/local/ComposerEventProcessor");
    public final bws b;
    public final int c;
    public final int d;
    public boolean e;
    public final bsj f;
    public final jld g;
    public final bxt h;

    public bsq(bsj bsj2, bws bws2, jld jld2, bxt bxt2, int n2) {
        this.f = bsj2;
        this.b = bws2;
        this.g = jld2;
        this.h = bxt2;
        this.c = n2;
        this.e = false;
        this.d = jld2.a / 2;
    }

    public final void a(String string) {
        this.e = true;
        this.b.a(string);
    }
}

