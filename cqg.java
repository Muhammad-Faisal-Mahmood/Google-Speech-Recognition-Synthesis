/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  hom
 */
import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class cqg
implements hnx {
    public final Object a;
    private final int b;

    public /* synthetic */ cqg(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final hpn a() {
        switch (this.b) {
            default: {
                return ((fma)this.a).c();
            }
            case 19: {
                fby fby2 = (fby)this.a;
                if (!fby2.i) {
                    fby2.i = true;
                    heg heg2 = (heg)((heg)fby.a.f().h(hfo.a, "ModelDownloadCallback")).j("com/google/android/libraries/speech/modelmanager/languagepack/ModelDownloadCallback", "onComplete", 122, "ModelDownloadCallback.java");
                    ezj ezj2 = fby2.b;
                    heg2.A("Language pack %s[%s] download MDD complete", ezj2.a, ezj2.b);
                    fby2.e("onComplete", 2);
                    fby2.e.ifPresent(new fbw(2));
                }
                return hpj.a;
            }
            case 18: {
                fby fby3 = (fby)this.a;
                if (!fby3.i) {
                    fby3.i = true;
                    heg heg3 = (heg)((heg)fby.a.f().h(hfo.a, "ModelDownloadCallback")).j("com/google/android/libraries/speech/modelmanager/languagepack/ModelDownloadCallback", "pausedForConnectivity", 160, "ModelDownloadCallback.java");
                    ezj ezj3 = fby3.b;
                    heg3.A("Language pack %s[%s] download MDD paused for connectivity", ezj3.a, ezj3.b);
                    fby3.e("onSchedule", 4);
                    fby3.e.ifPresent(new fbw(0));
                }
                return hpj.a;
            }
            case 17: {
                fby fby4 = (fby)this.a;
                if (!fby4.i) {
                    fby4.i = true;
                    long l2 = fby4.c;
                    StringBuilder stringBuilder = new StringBuilder("onSchedule: ");
                    stringBuilder.append(l2 / 1000L);
                    stringBuilder.append(" sec timeout.");
                    fby4.e(stringBuilder.toString(), 1);
                    fby4.e.ifPresent(new fbw(0));
                }
                return hpj.a;
            }
            case 16: {
                return cqq.ap((eon)this.a);
            }
            case 15: {
                Object object = this.a;
                jse.e(object, "$source");
                return cqq.ap((eon)object);
            }
            case 14: {
                ebu ebu2 = ebu.c;
                eol eol2 = new eol(0);
                return this.a.i(ebu2, eol2);
            }
            case 13: {
                return ((dqp)this.a).c();
            }
            case 12: {
                dpt dpt2 = (dpt)((dpz)this.a).a.b();
                return hpj.a;
            }
            case 11: {
                Object object = (dnr)this.a;
                if (((dnr)object).m()) {
                    object = ((dnr)object).g;
                    if (!((AtomicBoolean)((gcv)object).f).getAndSet(false)) {
                        object = hpj.a;
                    } else {
                        hhk.P(new cqg(object, 9), (Executor)((gcv)object).a);
                    }
                }
                return hpj.a;
            }
            case 10: {
                Object object = (dnr)this.a;
                object = ((dnr)object).m() && !((dnr)object).c.getAndSet(true) ? ((dnr)object).o(6, (dnf)((dnr)object).b.b(), ((dnh)((dnr)object).e.b()).f) : hpj.a;
                return object;
            }
            case 9: {
                Object object = (gcv)this.a;
                Object object2 = (gto)((gcv)object).c.a();
                boolean bl2 = ((gto)object2).g();
                Object object3 = ((gcv)object).b.a();
                if (bl2 && ((gto)(object3 = (gto)object3)).g()) {
                    object2 = ((gto)object2).c();
                    object3 = (String)((gto)object3).c();
                    object3 = new dng((File)object2, (String)object3);
                    int n2 = ((dng)object3).a();
                    ((dng)object3).b().delete();
                    ((dng)object3).b = 0;
                    ((dng)object3).c = true;
                    if (n2 >= ((dnh)((gcv)object).g.b()).c) {
                        object = ((gcv)object).e;
                        object2 = dmq.a();
                        object3 = kfl.a.l();
                        hyg hyg2 = kfk.a.l();
                        if (!((hwp)hyg2).b.B()) {
                            ((hwp)hyg2).u();
                        }
                        hwv hwv2 = (kfk)((hwp)hyg2).b;
                        hwv2.c = 6;
                        hwv2.b |= 1;
                        if (!((hwp)object3).b.B()) {
                            ((hwp)object3).u();
                        }
                        hwv2 = (kfl)((hwp)object3).b;
                        hyg2 = (kfk)((hwp)hyg2).o();
                        hyg2.getClass();
                        ((kfl)hwv2).u = hyg2;
                        ((kfl)hwv2).b |= 0x800000;
                        ((fhc)object2).i((kfl)((hwp)object3).o());
                        object3 = ((fhc)object2).e();
                        object = ((dmt)object).b((dmq)object3);
                    } else {
                        object = hpj.a;
                    }
                } else {
                    object = hpj.a;
                }
                return object;
            }
            case 8: {
                cyv cyv2 = new cyv();
                return fxf.aj((hpn)this.a, cyv2, (Executor)hom.a);
            }
            case 7: {
                return fxf.aj(this.a.a(), new cxc(5), (Executor)hom.a);
            }
            case 6: {
                return fxf.aj(this.a.a(), new cxc(7), (Executor)hom.a);
            }
            case 5: {
                return fxf.aj(this.a.a(), new cxc(6), (Executor)hom.a);
            }
            case 4: {
                return ((egg)this.a).k();
            }
            case 3: {
                cxt cxt2 = (cxt)((cus)this.a).i.c();
                Object object = (Context)cxt2.a;
                object = object.getPackageName().equals("com.google.android.gms") ? "com.google.android.gms.icing.mdd" : "com.google.android.gms.icing.mdd#".concat(String.valueOf(object.getPackageName()));
                return crh.a(new cka((Context)cxt2.a).m((String)object));
            }
            case 2: {
                cyr.c("%s Running maintenance", "MDDManager");
                Object object = this.a;
                cwz cwz2 = (cwz)object;
                return dah.e(cwz2.f()).g(new cwu(object, 7), (Executor)hom.a).g(new cwv(cwz2), cwz2.i);
            }
            case 1: {
                Object object = this.a;
                return hno.g(hph.q(hhk.P(gqk.c(new btf((btj)object)), btj.b)), new bps(object, 4), btj.b);
            }
            case 0: 
        }
        Object object = this.a;
        jse.e(object, "$task");
        object.run();
        return hpj.a;
    }
}

