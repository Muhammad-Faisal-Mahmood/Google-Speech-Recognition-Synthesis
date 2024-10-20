/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public final class ewl {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/utils/SeamlessUtils");
    public static final Set b = jns.T(new Integer[]{1, 16});

    public static final gto a(eaw hwv2) {
        jse.e(hwv2, "audioRouteRequestParams");
        hwv hwv3 = hwv2.c;
        hwv2 = hwv3;
        if (hwv3 == null) {
            hwv2 = eaz.a;
        }
        hwv2 = ((eaz)hwv2).b == 5 ? (ebj)((eaz)hwv2).c : ebj.a;
        jse.d(hwv2, "getHandoverRoute(...)");
        jse.e(hwv2, "<this>");
        if ((((ebj)hwv2).b & 1) != 0) {
            hwv3 = ((ebj)hwv2).c;
            hwv2 = hwv3;
            if (hwv3 == null) {
                hwv2 = ecq.a;
            }
        } else {
            hwv2 = null;
        }
        return gto.h(hwv2);
    }

    public static final ecq b(ekk ekk2, eao hwv2) {
        jse.e(ekk2, "audioRouteData");
        jse.e(hwv2, "params");
        jse.e(hwv2, "<this>");
        hwv2 = hwv2.c == 3 ? (ecq)hwv2.d : null;
        if (hwv2 == null) {
            return (ecq)ekk2.c.f();
        }
        return hwv2;
    }
}

