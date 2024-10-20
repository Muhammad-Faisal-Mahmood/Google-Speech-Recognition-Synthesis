/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 */
import android.os.Binder;
import java.util.concurrent.Executor;
import java.util.logging.Level;

public class dpf {
    public dpf() {
    }

    public /* synthetic */ dpf(byte[] byArray) {
    }

    public static void c(Level level, Executor executor, Throwable throwable, String string, Object ... objectArray) {
        executor.execute(gqk.i(new ww(level, throwable, string, objectArray, 9)));
    }

    public static void d(Level level, Executor executor, String string, Object ... objectArray) {
        dpf.c(level, executor, null, string, objectArray);
    }

    public static Object e(dtr object) {
        long l2;
        try {
            Object object2;
            object = object2 = object.a();
        }
        catch (SecurityException securityException) {
            l2 = Binder.clearCallingIdentity();
            object = object.a();
            return object;
        }
        return object;
        {
            finally {
                Binder.restoreCallingIdentity((long)l2);
            }
        }
    }

    public static int f(int n2) {
        if (n2 != 0) {
            if (n2 != 12) {
                if (n2 != 14) {
                    return 0;
                }
                return 2;
            }
            return 1;
        }
        return 3;
    }

    public static /* synthetic */ dlm g(hwr hwr2) {
        jse.e(hwr2, "builder");
        return new dlm((Object)hwr2, null);
    }

    public static /* synthetic */ void h(gpm gpm2, Object object, hwr hwr2) {
        jse.e(gpm2, "extension");
        jse.e(object, "value");
        hwr2.aH(gpm2, object);
    }

    public static /* synthetic */ dlm k(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new dlm((Object)hwp2, null);
    }

    public static edp l(ebm ebm2, eae hyg2) {
        jse.e(ebm2, "<this>");
        jse.e(hyg2, "audioLibInputParams");
        cxt cxt2 = dpf.s(edp.a.l());
        bzo bzo2 = dpf.p(edq.a.l());
        bzo2.n((eae)hyg2);
        if ((ebm2.b & 1) != 0) {
            jse.e(ebm2, "value");
            hyg2 = (hwp)bzo2.a;
            if (!((hwp)hyg2).b.B()) {
                ((hwp)hyg2).u();
            }
            hyg2 = (edq)((hwp)hyg2).b;
            ebm2.getClass();
            ((edq)hyg2).e = ebm2;
            ((edq)hyg2).b |= 4;
        }
        cxt2.t(bzo2.m());
        return cxt2.r();
    }

    public static edp m(ebm object, eao object2) {
        jse.e(object, "<this>");
        jse.e(object2, "audioRequestMicInputParams");
        eae eae2 = ((eao)object2).g;
        Object object3 = eae2;
        if (eae2 == null) {
            object3 = eae.a;
        }
        jse.d(object3, "getAudioLibInputParams(...)");
        object3 = dpf.l((ebm)object, (eae)object3);
        object = (hwp)((hwv)object3).C(5);
        ((hwp)object).x((hwv)object3);
        object3 = dpf.s((hwp)object);
        if (((eao)object2).e == 14) {
            object = object2 = eyf.b((Integer)((eao)object2).f);
            if (object2 == null) {
                object = eyf.a;
            }
        } else {
            object = eyf.a;
        }
        ((cxt)object3).s((eyf)object);
        return ((cxt)object3).r();
    }

    public static edp n(gto object, eae eae2) {
        cxt cxt2;
        block5: {
            block4: {
                jse.e(eae2, "audioLibInputParams");
                cxt2 = dpf.s(edp.a.l());
                hwv hwv2 = (edb)((gto)object).f();
                if (hwv2 == null) break block4;
                object = dpf.p(edq.a.l());
                hyg hyg2 = (hwp)((bzo)object).a;
                if (!hyg2.b.B()) {
                    hyg2.u();
                }
                hyg2 = (edq)hyg2.b;
                ((edq)hyg2).c = hwv2;
                ((edq)hyg2).b |= 1;
                ((bzo)object).n(eae2);
                hwv2 = ((bzo)object).m();
                object = hwv2;
                if (hwv2 != null) break block5;
            }
            object = dpf.p(edq.a.l());
            ((bzo)object).n(eae2);
            object = ((bzo)object).m();
        }
        cxt2.t((edq)object);
        return cxt2.r();
    }

    public static eln o(edo edo2) {
        dlm dlm2 = cqq.aw(eln.a.l());
        dlm2.n("ref-route@".concat(String.valueOf(edo2.name())));
        return dlm2.m();
    }

    public static /* synthetic */ bzo p(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new bzo(hwp2);
    }

    public static /* synthetic */ bzo q(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new bzo(hwp2);
    }

    public static /* synthetic */ bzo r(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new bzo(hwp2);
    }

    public static /* synthetic */ cxt s(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new cxt(hwp2);
    }

    public static /* synthetic */ cxt t(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new cxt(hwp2);
    }

    public static /* synthetic */ cxt u(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new cxt(hwp2);
    }

    public static /* synthetic */ cxt v(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new cxt(hwp2);
    }
}

