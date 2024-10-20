/*
 * Decompiled with CFR 0.152.
 */
public final class esw {
    private static final hei a = hei.m("com/google/android/libraries/search/audio/policies/utils/PolicySourceExtensionsKt");

    public static final esg a(esg hwv2, eaw hwv3) {
        Object object;
        jse.e(hwv2, "<this>");
        jse.e(hwv3, "params");
        Object object2 = object = hwv3.c;
        if (object == null) {
            object2 = eaz.a;
        }
        switch (eay.a(((eaz)object2).b).ordinal()) {
            default: {
                throw new joa();
            }
            case 6: {
                object2 = hwv3.c;
                hwv3 = object2;
                if (object2 == null) {
                    hwv3 = eaz.a;
                }
                hwv3 = ((eaz)hwv3).b == 7 ? (ebf)((eaz)hwv3).c : ebf.a;
                jse.d(hwv3, "getCarAudioRoute(...)");
                if ((((ebf)hwv3).b & 1) != 0) {
                    object2 = (hwp)hwv2.C(5);
                    ((hwp)object2).x(hwv2);
                    bzb bzb2 = euf.v((hwp)object2);
                    object = euf.x((hwr)esf.a.l());
                    object2 = euf.w((hwr)ese.a.l());
                    gpm gpm2 = eso.a;
                    jse.d(gpm2, "carSource");
                    hwp hwp2 = esn.a.l();
                    jse.e(hwp2, "builder");
                    hwv3 = ((ebf)hwv3).c;
                    hwv2 = hwv3;
                    if (hwv3 == null) {
                        hwv2 = ebm.a;
                    }
                    jse.e(hwv2, "value");
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv3 = (esn)hwp2.b;
                    hwv2.getClass();
                    ((esn)hwv3).c = hwv2;
                    ((esn)hwv3).b |= 1;
                    hwv2 = hwp2.o();
                    jse.d(hwv2, "build(...)");
                    ((bzq)object2).W(gpm2, (esn)hwv2);
                    ((cxt)object).M(((bzq)object2).P());
                    bzb2.B(((cxt)object).L());
                    hwv2 = bzb2.A();
                    break;
                }
                ((heg)a.h().h(hfo.a, "ALT.Policy-SourceExt").j("com/google/android/libraries/search/audio/policies/utils/PolicySourceExtensionsKt", "maybeAddCurrentSource", 135, "PolicySourceExtensions.kt")).r("#audio# CAR route with no buffer ID, not using as current");
                break;
            }
            case 4: {
                object2 = hwv3.c;
                hwv3 = object2;
                if (object2 == null) {
                    hwv3 = eaz.a;
                }
                hwv3 = ((eaz)hwv3).b == 5 ? (ebj)((eaz)hwv3).c : ebj.a;
                jse.d(hwv3, "getHandoverRoute(...)");
                if ((((ebj)hwv3).b & 1) != 0) {
                    object2 = (hwp)hwv2.C(5);
                    ((hwp)object2).x(hwv2);
                    bzb bzb3 = euf.v((hwp)object2);
                    object2 = euf.x((hwr)esf.a.l());
                    bzq bzq2 = euf.w((hwr)ese.a.l());
                    object = esr.a;
                    jse.d(object, "handoverSource");
                    hwp hwp3 = esq.a.l();
                    jse.e(hwp3, "builder");
                    hwv3 = ((ebj)hwv3).c;
                    hwv2 = hwv3;
                    if (hwv3 == null) {
                        hwv2 = ecq.a;
                    }
                    jse.e(hwv2, "value");
                    if (!hwp3.b.B()) {
                        hwp3.u();
                    }
                    hwv3 = (esq)hwp3.b;
                    hwv2.getClass();
                    ((esq)hwv3).c = hwv2;
                    ((esq)hwv3).b |= 1;
                    hwv2 = hwp3.o();
                    jse.d(hwv2, "build(...)");
                    bzq2.W((gpm)object, (esq)hwv2);
                    ((cxt)object2).M(bzq2.P());
                    bzb3.B(((cxt)object2).L());
                    hwv2 = bzb3.A();
                    break;
                }
                ((heg)a.h().h(hfo.a, "ALT.Policy-SourceExt").j("com/google/android/libraries/search/audio/policies/utils/PolicySourceExtensionsKt", "maybeAddCurrentSource", 149, "PolicySourceExtensions.kt")).r("#audio# HANDOVER route with no handoff data, not using as current");
                break;
            }
            case 3: {
                object2 = hwv3.c;
                hwv3 = object2;
                if (object2 == null) {
                    hwv3 = eaz.a;
                }
                hwv3 = ((eaz)hwv3).b == 4 ? (eba)((eaz)hwv3).c : eba.a;
                jse.d(hwv3, "getBistoAudioRoute(...)");
                if ((((eba)hwv3).b & 2) != 0) {
                    object2 = (hwp)hwv2.C(5);
                    ((hwp)object2).x(hwv2);
                    object = euf.v((hwp)object2);
                    object2 = euf.x((hwr)esf.a.l());
                    bzq bzq3 = euf.w((hwr)ese.a.l());
                    gpm gpm3 = esi.a;
                    jse.d(gpm3, "bistoSource");
                    hwp hwp4 = esh.a.l();
                    jse.e(hwp4, "builder");
                    hwv3 = ((eba)hwv3).d;
                    hwv2 = hwv3;
                    if (hwv3 == null) {
                        hwv2 = ebm.a;
                    }
                    jse.e(hwv2, "value");
                    if (!hwp4.b.B()) {
                        hwp4.u();
                    }
                    hwv3 = (esh)hwp4.b;
                    hwv2.getClass();
                    ((esh)hwv3).c = hwv2;
                    ((esh)hwv3).b |= 1;
                    hwv2 = hwp4.o();
                    jse.d(hwv2, "build(...)");
                    bzq3.W(gpm3, (esh)hwv2);
                    ((cxt)object2).M(bzq3.P());
                    ((bzb)object).B(((cxt)object2).L());
                    hwv2 = ((bzb)object).A();
                    break;
                }
                ((heg)a.h().h(hfo.a, "ALT.Policy-SourceExt").j("com/google/android/libraries/search/audio/policies/utils/PolicySourceExtensionsKt", "maybeAddCurrentSource", 119, "PolicySourceExtensions.kt")).r("#audio# BISTO route with no buffer ID, not using as current");
                break;
            }
            case 0: 
            case 1: 
            case 2: 
            case 5: 
            case 7: 
            case 8: {
                hwv2 = euf.v(esg.a.l()).A();
            }
        }
        return hwv2;
    }
}

