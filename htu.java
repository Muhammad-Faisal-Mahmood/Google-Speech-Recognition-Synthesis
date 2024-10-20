/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Context
 *  android.os.IBinder
 */
import android.app.Service;
import android.content.Context;
import android.os.IBinder;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;

public final class htu {
    private static final hei a = hei.m("com/google/frameworks/client/data/android/server/Endpoint");
    private final abi b;
    private final ScheduledExecutorService c;
    private final ive d;
    private final gto e;
    private final iys f;

    public htu(Service service, ScheduledExecutorService scheduledExecutorService, ive ive2, gto gto2) {
        fxf.r(service instanceof abi, "A service hosting an Endpoint must be a LifecycleService");
        this.b = (abi)service;
        this.c = scheduledExecutorService;
        this.d = ive2;
        this.e = gto2;
        this.f = new iys();
        ((heg)((heg)a.f()).j("com/google/frameworks/client/data/android/server/Endpoint", "<init>", 59, "Endpoint.java")).u("Created gRPC endpoint for service %s", service.getClass());
    }

    public final IBinder a() {
        Object object = this.f.a;
        fxf.K(object);
        return object;
    }

    public final void b(ksb object, iyu object2) {
        cry.a();
        ivc ivc2 = new ivc(iyp.a((Context)this.b), this.f);
        Object object3 = ivc2.b;
        ((izd)object3).f = object;
        a.s(object2, "inboundParcelablePolicy");
        ((izd)object3).e = object2;
        object2 = ivc2.a;
        object = this.c;
        object = object != null ? new jjn(object, 1) : jjc.b;
        ((jjc)object2).h = object;
        object = this.c;
        object2 = ivc2.b;
        a.s(object, "scheduledExecutorService");
        ((izd)object2).d = new jjn(object, 1);
        object2 = this.d;
        object3 = ivc2.a;
        object = object2;
        if (object2 == null) {
            object = jjc.c;
        }
        ((jjc)object3).g = object;
        ivc2.a.i = object = new iuw();
        ivc2.a.j = object = new iug(new iuf[0]);
        object = ((gtt)this.e).a.iterator();
        while (object.hasNext()) {
            ((kmp)ivc2).Y((ixz)object.next());
        }
        object = ivc2.j();
        try {
            ((ixw)object).b();
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Failed to start Server for Endpoint Service ".concat(String.valueOf(String.valueOf(this.b.getClass()))), iOException);
        }
        kmp.K(this.b.getLifecycle(), (ixw)object);
    }
}

