/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  hom
 */
import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.concurrent.Executor;

final class doj
extends doc
implements dmw {
    private final dmt a;
    private final Context b;
    private final Executor c;
    private final dny d;
    private final jnu e;
    private final iku f;
    private final jnu g;
    private final jnu h;
    private final jnu i;

    public doj(dmu dmu2, Context context, Executor executor, dny dny2, jnu jnu2, iku iku2, dkn dkn2, jnu jnu3, jnu jnu4, jnu jnu5) {
        this.a = dmu2.a(executor, iku2, null);
        this.b = context;
        this.c = executor;
        this.d = dny2;
        this.e = jnu2;
        this.f = iku2;
        this.g = jnu3;
        this.h = jnu4;
        this.i = jnu5;
    }

    public static /* synthetic */ hpn i(doj object) {
        if (!((dnx)((doj)object).f.b()).b()) {
            object = hpj.a;
        } else {
            Object object2 = ((doj)object).b;
            Object object3 = ((doj)object).f;
            object2 = object2.getPackageName();
            object3 = ((dnx)object3.b()).a;
            object2 = String.valueOf(object2);
            object3 = String.valueOf(object3);
            object = !fs$$ExternalSyntheticApiModelOutline0.m().equals(((String)object2).concat((String)object3)) ? hpj.a : ((Boolean)((doj)object).g.b() == false ? hpj.a : hno.g(((doj)object).d.a(0, 0, ((SharedPreferences)((doj)object).e.b()).getString("lastExitProcessName", null), ((SharedPreferences)((doj)object).e.b()).getLong("lastExitTimestamp", -1L)), new dod((doj)object), (Executor)hom.a));
        }
        return object;
    }

    @Override
    public void L() {
        this.r();
        hhk.N(new doe(this), this.c);
    }

    public /* synthetic */ hpn j() {
        dog dog2 = new dog(this);
        return crt.b(this.b, dog2);
    }

    public /* synthetic */ hpn n(gzx gzx2) {
        Object object;
        int n2;
        int n3;
        if (gzx2.isEmpty()) {
            return hpj.a;
        }
        Object object2 = (kdb)this.h.b();
        hyg hyg2 = kda.a.l();
        int n4 = gzx2.size();
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        Object object3 = ((hwp)hyg2).b;
        hwv hwv2 = (kda)object3;
        hwv2.b |= 2;
        hwv2.e = n4;
        if (!((hwv)object3).B()) {
            ((hwp)hyg2).u();
        }
        object3 = (kda)((hwp)hyg2).b;
        object2.getClass();
        ((kda)object3).d = object2;
        ((kda)object3).b |= 1;
        object3 = new HashSet();
        int n5 = 0;
        for (n4 = 0; n4 < ((kdb)object2).b.size(); ++n4) {
            n2 = n3 = jsl.y(((kdb)object2).b.e(n4));
            if (n3 == 0) {
                n2 = 1;
            }
            object3.add(n2 - 1);
        }
        n3 = gzx2.size();
        for (n4 = n5; n4 < n3; ++n4) {
            object = (kcz)gzx2.get(n4);
            n2 = n5 = jsl.y(((kcz)object).d);
            if (n5 == 0) {
                n2 = 1;
            }
            if (!object3.contains(n2 - 1)) continue;
            if (!((hwp)hyg2).b.B()) {
                ((hwp)hyg2).u();
            }
            hwv2 = (kda)((hwp)hyg2).b;
            object.getClass();
            object2 = hwv2.c;
            if (!object2.c()) {
                hwv2.c = hwv.s((hxk)object2);
            }
            hwv2.c.add(object);
        }
        hyg2 = (kda)((hwp)hyg2).o();
        object = this.a;
        object3 = dmq.a();
        object2 = kfl.a.l();
        if (!((hwp)object2).b.B()) {
            ((hwp)object2).u();
        }
        hwv2 = (kfl)((hwp)object2).b;
        hyg2.getClass();
        ((kfl)hwv2).o = hyg2;
        ((kfl)hwv2).b |= 0x10000;
        ((fhc)object3).i((kfl)((hwp)object2).o());
        return hno.f(((dmt)object).b(((fhc)object3).e()), new doh(this, gzx2), this.c);
    }

    public /* synthetic */ Void o(gzx object, Void object2) {
        block1: {
            int n2;
            int n3 = 0;
            object = (kcz)object.get(0);
            do {
                object2 = ((kcz)object).c;
                long l2 = ((kcz)object).g;
                if (((SharedPreferences)this.e.b()).edit().putString("lastExitProcessName", (String)object2).putLong("lastExitTimestamp", l2).commit()) break block1;
                n3 = n2 = n3 + 1;
            } while (n2 < 3);
            ((heg)((heg)dkc.a.h()).j("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitMetricServiceImpl", "updateLastRecordedAppExit", 213, "ApplicationExitMetricServiceImpl.java")).r("Failed to persist most recent App Exit");
        }
        return null;
    }

    public /* synthetic */ void p() {
        ((Boolean)this.i.b()).booleanValue();
    }

    public /* synthetic */ void q() {
        hhk.P(new doi(this), this.c);
    }

    public void r() {
        hhk.P(new dof(this), this.c);
    }
}

