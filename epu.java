/*
 * Decompiled with CFR 0.152.
 */
public final class epu
implements elo {
    public final epp a;
    public final epw b;

    public /* synthetic */ epu(epp epp2, epw epw2) {
        this.a = epp2;
        this.b = epw2;
    }

    @Override
    public final void a() {
        heg heg2 = (heg)epw.a.f().h(hfo.a, "ALT.HotwordSessionsRegy").j("com/google/android/libraries/search/audio/microphone/registry/HotwordSessionsRegistry", "scheduleHandoverTimeout$lambda$6", 219, "HotwordSessionsRegistry.kt");
        epq epq2 = (epq)this.a;
        heg2.s("#audio# seamless timeout, cleaning up session(%s) -- NO ISSUE if source handed-off", epq2.c);
        this.b.c(epq2.c, ebv.h);
    }
}

