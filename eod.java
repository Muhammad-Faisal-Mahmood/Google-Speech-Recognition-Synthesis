/*
 * Decompiled with CFR 0.152.
 */
public final class eod
implements ecu {
    private static final hei c = hei.m("com/google/android/libraries/search/audio/microphone/impl/HotwordListeningSessionImpl");
    public final hpn a;
    public final hpn b;
    private final int d;
    private final czh e;

    public eod(int n2, hpn hpn2, hpn hpn3, czh czh2) {
        this.d = n2;
        this.a = hpn2;
        this.b = hpn3;
        this.e = czh2;
    }

    @Override
    public final ect a() {
        return new eoc(this, 1);
    }

    @Override
    public final ect b() {
        ((heg)((heg)c.f().h(hfo.a, "ALT.HWCSession")).j("com/google/android/libraries/search/audio/microphone/impl/HotwordListeningSessionImpl", "stopListening", 46, "HotwordListeningSessionImpl.java")).s("#audio# stop listening hotword client session(token(%d))", this.d);
        this.e.O(this.d, ebv.b);
        return new eoc(this, 0);
    }

    @Override
    public final hpn c() {
        return this.a;
    }

    @Override
    public final eky d() {
        ((heg)((heg)c.f().h(hfo.a, "ALT.HWCSession")).j("com/google/android/libraries/search/audio/microphone/impl/HotwordListeningSessionImpl", "stopListeningForSeamlessMode", 54, "HotwordListeningSessionImpl.java")).s("#audio# stop listening hotword client session(token(%d)) seamlessly", this.d);
        return this.e.P(this.d, ebv.b);
    }
}

