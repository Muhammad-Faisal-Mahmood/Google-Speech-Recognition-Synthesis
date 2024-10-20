/*
 * Decompiled with CFR 0.152.
 */
public final class enz
implements eaj {
    private static final hei d = hei.m("com/google/android/libraries/search/audio/microphone/impl/AudioRequestListeningSessionImpl");
    public final hpn a;
    public final hpn b;
    public final hpn c;
    private final int e;
    private final int f;
    private final czh g;

    public enz(int n2, int n3, hpn hpn2, hpn hpn3, hpn hpn4, czh czh2) {
        this.f = n2;
        this.e = n3;
        this.a = hpn2;
        this.b = hpn3;
        this.g = czh2;
        this.c = hpn4;
    }

    @Override
    public final eai a() {
        ((heg)((heg)d.f().h(hfo.a, "ALT.ARCSession")).j("com/google/android/libraries/search/audio/microphone/impl/AudioRequestListeningSessionImpl", "stopListening", 53, "AudioRequestListeningSessionImpl.java")).v("#audio# stop listening audio request client(token(%d)) session(token(%d))", this.f, this.e);
        this.g.N(this.f, this.e, ebv.b);
        return new emc(this, 2);
    }

    @Override
    public final hpn b() {
        return this.a;
    }

    @Override
    public final hpn c() {
        return this.b;
    }

    @Override
    public final /* synthetic */ Object d() {
        return new emc(this, 3);
    }
}

