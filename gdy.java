/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.util.concurrent.TimeUnit;

public final class gdy
implements hpb {
    final Object a;
    final Object b;
    final Object c;
    final Object d;
    private final int e;

    public gdy(bmu bmu2, Object object, geb geb2, gto gto2, int n2) {
        this.e = n2;
        this.a = object;
        this.b = geb2;
        this.c = gto2;
        this.d = bmu2;
    }

    public gdy(enc enc2, guh guh2, eip eip2, eaz eaz2, int n2) {
        this.e = n2;
        this.a = guh2;
        this.b = eip2;
        this.d = eaz2;
        this.c = enc2;
    }

    @Override
    public final void a(Throwable throwable) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b(Object object) {
        int n2;
        Object object2;
        if (this.e != 0) {
            object = (guh)this.a;
            ((guh)object).e();
            double d2 = ((guh)object).a(TimeUnit.MILLISECONDS);
            eng eng2 = (eng)((enc)this.c).b.b();
            object = eio.a(((eip)this.b).b).name();
            Object object3 = ((enc)this.c).d;
            String string = crh.P((eaz)this.d);
            object3 = (String)object3.a();
            ((fsu)eng2.i.a()).b(d2, object, string, object3);
            ((hfk)((hfk)enc.a.f()).j("com/google/android/libraries/search/audio/logging/impl/MonitoringLoggerImpl$10", "onSuccess", 621, "MonitoringLoggerImpl.java")).G("#audio# starting listening client(%s) route(%s) took %d(ms)", eio.a(((eip)this.b).b).name(), crh.L((eaz)this.d), (long)d2);
            return;
        }
        Object object4 = this.a;
        object = this.b;
        Object object5 = this.d;
        Object object6 = ((bmu)object5).a;
        synchronized (object6) {
            object2 = new ham();
            object4 = (hap)((bmu)object5).c.get(object4);
            if (object4 != null) {
                ((ham)object2).b((Iterable)object4);
            }
            object2 = ((ham)object2).a().n();
            if (((gto)((bmu)object5).b).g()) {
                n2 = ((geb)object).c.ordinal();
                if (n2 != 0) {
                    if (n2 != 1) {
                        object = new IllegalStateException("Unrecognized CallReason");
                        throw object;
                    }
                    ((gdw)((gto)((bmu)object5).b).c()).b();
                } else {
                    ((gdw)((gto)((bmu)object5).b).c()).a();
                }
            }
        }
        object5 = ((hba)object2).k();
        while (object5.hasNext()) {
            boolean bl2;
            object6 = this.c;
            object2 = (AmbientModeSupport$AmbientController)object5.next();
            if (((gto)object6).f() == object2) continue;
            n2 = ((geb)object).c.ordinal();
            if (n2 != 0) {
                if (n2 != 1) {
                    throw new IllegalStateException("Unrecognized CallReason: ".concat(object.toString()));
                }
                if (a.l(((gem)((AmbientModeSupport$AmbientController)object2).a).c, (Object)gdz.a, (Object)gdz.b)) continue;
                bl2 = a.l(((gem)((AmbientModeSupport$AmbientController)object2).a).c, null, (Object)gdz.b);
            } else {
                bl2 = a.l(((gem)((AmbientModeSupport$AmbientController)object2).a).c, null, (Object)gdz.a);
            }
            if (!bl2) continue;
            ((gem)((AmbientModeSupport$AmbientController)object2).a).a.execute(new ffd(object2, 16));
        }
        return;
    }
}

