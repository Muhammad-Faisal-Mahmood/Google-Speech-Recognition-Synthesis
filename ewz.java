/*
 * Decompiled with CFR 0.152.
 */
final class ewz
implements dzd {
    private static final hei a = hei.m("com/google/android/libraries/search/logging/appflows/AppFlowLoggerTransport");
    private final exe b;

    public ewz(exe exe2) {
        this.b = exe2;
    }

    @Override
    public final hpn a(dzc dzc2) {
        ((heg)((heg)a.f()).j("com/google/android/libraries/search/logging/appflows/AppFlowLoggerTransport", "send", 21, "AppFlowLoggerTransport.java")).u("AppFlow %s is about to be transmitted", dzc2.c);
        heg heg2 = (heg)((heg)exf.a.c().h(hfo.a, "TngEventLogger")).j("com/google/android/libraries/search/logging/clearcut/StandaloneEventLoggerModule$Impl", "logGenericAppFlowEvent", 147, "StandaloneEventLoggerModule.java");
        exf exf2 = (exf)this.b;
        heg2.G("[%s](%s) Generic AppFlow event: %s", exf2.b, exf2.c, dzc2.a);
        return hpj.a;
    }
}

