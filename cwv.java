/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.accounts.AccountManager
 *  hom
 */
import android.accounts.Account;
import android.accounts.AccountManager;
import java.util.ArrayList;
import java.util.concurrent.Executor;

public final class cwv
implements hny {
    public final cwz a;

    public /* synthetic */ cwv(cwz cwz2) {
        this.a = cwz2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn a(Object object) {
        int n2;
        Object object2;
        Object object3 = (Integer)object;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        cyr.c("%s checkResetTrigger", "MDDManager");
        cwz cwz2 = this.a;
        arrayList.add(fxf.ak(cwz2.f(), new cwu(cwz2, 9), cwz2.i));
        if (inw.a.b().p()) {
            object = cwz2.c;
            arrayList.add(((cwj)object).m(new cvv(object, 12)));
        }
        if (inw.a.b().s()) {
            object = cwz2.c;
            arrayList.add(((cwj)object).q(((cwj)object).c.d(), new cvv(object, 5)));
        }
        if (inw.a.b().r()) {
            block15: {
                object = cwz2.c;
                if (!((cwj)object).d.g()) {
                    object = hpj.a;
                } else {
                    hat hat2;
                    try {
                        object2 = (cxu)((cwj)object).d.c();
                        Object object4 = ((cxu)object2).b;
                        object2 = gzx.p(((AccountManager)((cxu)object2).a).getAccountsByTypeForPackage("com.google", (String)object4));
                        hat2 = new hat();
                        int n3 = ((hct)object2).c;
                        for (n2 = 0; n2 < n3; ++n2) {
                            Object object5 = (Account)object2.get(n2);
                            if (((Account)object5).name == null || ((Account)object5).type == null) continue;
                            object4 = ((Account)object5).type;
                            String string = ((Account)object5).name;
                            object5 = new StringBuilder();
                            ((StringBuilder)object5).append((String)object4);
                            ((StringBuilder)object5).append(":");
                            ((StringBuilder)object5).append(string);
                            hat2.j(((StringBuilder)object5).toString());
                        }
                    }
                    catch (RuntimeException runtimeException) {
                        object = hhk.J(runtimeException);
                        break block15;
                    }
                    {
                        object2 = hat2.g();
                    }
                    object = ((cwj)object).q(((cwj)object).c.d(), new bpu(object, object2, 17));
                }
            }
            arrayList.add(object);
        }
        if (cqq.j()) {
            object = cwz2.c;
            arrayList.add(((cwj)object).m(new cvv(object, 10)));
        }
        if (inw.a.b().u()) {
            object = cwz2.p;
            arrayList.add(fxf.ak(fxf.ak(((dmt)object).i.e(), new bps(object, 16), (Executor)((dmt)object).c), new bps(object, 14), (Executor)((dmt)object).c));
            cwz2.m.d(1053);
        }
        object2 = cwz2.n;
        object = new cqg(new cyy(object2, (Integer)object3, 1), 5);
        n2 = (int)ioa.a.b().b();
        arrayList.add(((cyu)((czh)object2).c).b(1046, (hnx)object, n2));
        object = cwz2.g;
        object3 = new cqg(new cyy(object, (Integer)object3, 0), 7);
        n2 = (int)ioa.a.b().g();
        arrayList.add(((czd)object).f.b(1057, (hnx)object3, n2));
        object3 = cwz2.o;
        if (!cqq.n()) {
            object = hpj.a;
        } else {
            object = ((cxv)object3).b;
            object3 = ((cxv)object3).a;
            object = new cqg(new cqg(object.a(), 8), 6);
            n2 = (int)ioa.a.b().e();
            object = ((cyu)object3).b(1058, (hnx)object, n2);
        }
        arrayList.add(object);
        if (cwz2.j.g()) {
            object = cwz2.c;
            arrayList.add(((cwj)object).q(((cwj)object).c.d(), new cvv(object, 9)));
        }
        cqq.z(cwz2.b, "gms_icing_mdd_manager_metadata", cwz2.h).edit().remove("gms_icing_mdd_manager_ph_config_version").remove("gms_icing_mdd_manager_ph_config_version_timestamp").commit();
        if (!inw.a.b().e()) {
            arrayList.add(crh.x(dah.e(cwz2.d.c()).f(new cwt(4), cwz2.i).g(new cwu(cwz2, 2), cwz2.i), dah.e(cwz2.d.e()).f(new cws(cwz2, 2), cwz2.i).g(new buf(9), cwz2.i)).u(new cuh(11), (Executor)hom.a));
        }
        return crh.w(arrayList).u(new cuh(10), cwz2.i);
    }
}

