/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public final class esv {
    private static final hei d = hei.m("com/google/android/libraries/search/audio/policies/controller/impl/SourcePolicyControllerImpl");
    public final boolean a;
    public final boolean b;
    public final egs c;
    private final Map e;
    private final euf f;
    private final czh g;

    public esv(Map map, euf euf2, egs egs2, czh czh2, boolean bl2, boolean bl3) {
        jse.e(map, "sourcePolicyMap");
        jse.e(euf2, "defaultPolicy");
        jse.e(egs2, "audioSourceAvailability");
        this.e = map;
        this.f = euf2;
        this.c = egs2;
        this.g = czh2;
        this.a = bl2;
        this.b = bl3;
    }

    public static /* synthetic */ void a(esv esv2, eam eam2) {
        esv2.b(eam2, false);
    }

    public final void b(eam object, boolean bl2) {
        Object object2;
        Object object3 = object2 = ((eam)object).c;
        if (object2 == null) {
            object3 = eip.a;
        }
        int n2 = eio.a((int)((eip)object3).b).K;
        object3 = object2 = eal.b(((eam)object).d);
        if (object2 == null) {
            object3 = eal.a;
        }
        object2 = this.e;
        jse.d(object3, "getIntent(...)");
        object3 = object2 = object2.get(new esu(n2, (eal)object3));
        if (object2 == null) {
            if (bl2) {
                Object object4;
                czh czh2 = this.g;
                object3 = object2 = ((eam)object).c;
                if (object2 == null) {
                    object3 = eip.a;
                }
                jse.d(object3, "getClientInfo(...)");
                object2 = object4 = eal.b(((eam)object).d);
                if (object4 == null) {
                    object2 = eal.a;
                }
                jse.d(object2, "getIntent(...)");
                jse.e(object3, "clientInfo");
                jse.e(object2, "intent");
                object4 = (eng)((enc)czh2.b).b.b();
                object2 = ((Enum)object2).name();
                object3 = eio.a(((eip)object3).b).name();
                ((fsx)((eng)object4).o.a()).b(object2, object3);
                object4 = (heg)d.h().h(hfo.a, "ALT.SourcePolicyCtlr").j("com/google/android/libraries/search/audio/policies/controller/impl/SourcePolicyControllerImpl", "logMissingPolicy", 91, "SourcePolicyControllerImpl.kt");
                object3 = object2 = ((eam)object).c;
                if (object2 == null) {
                    object3 = eip.a;
                }
                object2 = eio.a(((eip)object3).b).name();
                object = object3 = eal.b(((eam)object).d);
                if (object3 == null) {
                    object = eal.a;
                }
                object4.C("#audio# Audio source policy missing for client(%s) intent(%s)", object2, ((Enum)object).name());
            }
            object3 = this.f;
        }
        object = (euf)object3;
    }
}

