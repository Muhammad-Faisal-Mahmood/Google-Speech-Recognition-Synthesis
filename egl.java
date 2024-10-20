/*
 * Decompiled with CFR 0.152.
 */
final class egl
implements efq {
    public final hpn a;
    private final hpn b;
    private final hei c;
    private final jur d;
    private final jur e;

    public egl() {
        jur jur2;
        this.d = jur2 = new jur();
        this.a = jsd.k(jur2);
        this.e = jur2 = new jur();
        this.b = jsd.k(jur2);
        this.c = hei.m("com/google/android/libraries/search/audio/audiosource/impl/AudioSourceMetadataHolderImpl");
    }

    public egl(efs efs2) {
        jse.e(efs2, "initialSource");
        this();
        this.d.O(efs2);
    }

    private final void f(gto gto2) {
        this.e.O(gto2);
    }

    @Override
    public final hpn a() {
        return this.b;
    }

    @Override
    public final hpn b() {
        return this.a;
    }

    public final void c(int n2) {
        ((heg)this.c.c().h(hfo.a, "ALT.SourceDataHolder").j("com/google/android/libraries/search/audio/audiosource/impl/AudioSourceMetadataHolderImpl", "holdAudioRecordId", 59, "AudioSourceMetadataHolder.kt")).s("#audio# hold audio record id(%d)", n2);
        gto gto2 = n2 > 0 ? gto.h(n2) : gsl.a;
        this.f(gto2);
    }

    public final void d() {
        ((heg)this.c.c().h(hfo.a, "ALT.SourceDataHolder").j("com/google/android/libraries/search/audio/audiosource/impl/AudioSourceMetadataHolderImpl", "holdEmpty", 64, "AudioSourceMetadataHolder.kt")).r("#audio# hold no data");
        this.f(gsl.a);
        this.e(efs.a);
    }

    public final void e(efs efs2) {
        jse.e(efs2, "initialSource");
        ((heg)this.c.c().h(hfo.a, "ALT.SourceDataHolder").j("com/google/android/libraries/search/audio/audiosource/impl/AudioSourceMetadataHolderImpl", "holdInitialSource", 54, "AudioSourceMetadataHolder.kt")).u("#audio# hold an initial audio source(%s)", efs2.name());
        this.d.O(efs2);
    }
}

