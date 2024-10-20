/*
 * Decompiled with CFR 0.152.
 */
final class eur
implements hpb {
    final jnf a;
    final int b;
    final int c;

    public eur(jnf jnf2, int n2, int n3) {
        this.a = jnf2;
        this.b = n2;
        this.c = n3;
    }

    @Override
    public final void a(Throwable throwable) {
        ((heg)((heg)euu.a.h().h(hfo.a, "ALT.AudioService")).j("com/google/android/libraries/search/audio/service/impl/AudioServiceImpl$1", "onFailure", 224, "AudioServiceImpl.java")).v("#audio# Failed to get StopListeningStatus. clientToken: %d, sessionToken: %d", this.b, this.c);
        eas eas2 = elb.a(ebp.l, ebv.b);
        this.a.c(eas2);
        this.a.b(throwable);
    }
}

