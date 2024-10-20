/*
 * Decompiled with CFR 0.152.
 */
public final class ego
implements efo {
    private static final hei a = hei.m("com/google/android/libraries/search/audio/audiosource/impl/RouteAwareAudioSource");
    private final ekk b;
    private final efo c;
    private final String d;

    public ego(ekk ekk2, efo efo2) {
        this.b = ekk2;
        this.c = efo2;
        this.d = crh.K(this);
    }

    @Override
    public final ebq a() {
        ebq ebq2 = this.c.a();
        jse.d(ebq2, "closeAudioSource(...)");
        return ebq2;
    }

    @Override
    public final efq b() {
        efq efq2 = this.c.b();
        jse.d(efq2, "getAudioSourceMetadata(...)");
        return efq2;
    }

    @Override
    public final gto c() {
        if (!this.b.a.isDone()) {
            ((heg)a.f().h(hfo.a, "ALT.RouteAwareSource").j("com/google/android/libraries/search/audio/audiosource/impl/RouteAwareAudioSource", "openAudioSource", 39, "RouteAwareAudioSource.kt")).C("#audio# delegating source(%s) opening to(%s)", this.d, crh.K(this.c));
            return this.c.c();
        }
        throw new elx("#openAudioSource failed: routing failed.", ekr.g(ebs.f));
    }
}

