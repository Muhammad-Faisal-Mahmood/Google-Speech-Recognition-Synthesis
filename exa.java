/*
 * Decompiled with CFR 0.152.
 */
final class exa
implements dzd {
    private final exe a;

    public exa(exe exe2) {
        this.a = exe2;
    }

    @Override
    public final hpn a(dzc object) {
        Object object2;
        Object object3;
        Object object4 = new gzs();
        if (!((dzc)object).e.isEmpty()) {
            object3 = ((dzc)object).e;
            int n2 = ((hct)object3).c;
            for (int i2 = 0; i2 < n2; ++i2) {
                object2 = (dxh)object3.get(i2);
                if (!(((dxh)object2).b().c instanceof hkp) || !(((dxh)object2).a() instanceof iap)) continue;
                ((gzs)object4).h(object2);
            }
        }
        object3 = this.a;
        object2 = ((gzs)object4).g();
        object4 = (heg)((heg)exf.a.c().h(hfo.a, "TngEventLogger")).j("com/google/android/libraries/search/logging/clearcut/StandaloneEventLoggerModule$Impl", "logGenericAppFlowEvent", 155, "StandaloneEventLoggerModule.java");
        object = ((dzc)object).a;
        object3 = (exf)object3;
        object4.H("[%s](%s) Generic AppFlow event: %s with metadata: %s", ((exf)object3).b, ((exf)object3).c, object, object2);
        return hpj.a;
    }
}

