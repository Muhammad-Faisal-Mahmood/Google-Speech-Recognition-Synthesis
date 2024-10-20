/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

public final class hkb
extends hnk {
    public static final Object a;
    public final gui b;
    public final hjy c;
    public final gtq d;
    public final guh e;
    public final hka f;
    public volatile int g = 0;
    private final Executor k;
    private final AtomicReference l = new AtomicReference<hpn>(hhk.K(new Object()));

    static {
        Logger.getLogger(hkb.class.getCanonicalName());
        a = new Object();
    }

    public hkb(gui gui2, hjy hjy2, gtq gtq2, Executor executor, ScheduledExecutorService scheduledExecutorService, gup gup2, hka hka2) {
        this.b = gui2;
        this.c = hjy2;
        fxf.K(gtq2);
        this.d = gtq2;
        this.k = new gaj(this, executor, 3);
        hhk.F(scheduledExecutorService);
        this.f = hka2;
        this.e = guh.b(gup2);
        this.d();
        this.c(new gni(4), executor);
    }

    @Override
    protected final String a() {
        Object object = (hpn)this.l.get();
        String string = object.toString();
        Object object2 = this.c;
        Object object3 = this.d;
        String string2 = this.b.toString();
        object3 = object3.toString();
        object2 = object2.toString();
        int n2 = this.g;
        string = object.isDone() ? "" : a.aj(string, ", activeTry=[", "]");
        object = new StringBuilder("futureSupplier=[");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append("], shouldContinue=[");
        ((StringBuilder)object).append((String)object3);
        ((StringBuilder)object).append("], strategy=[");
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append("], tries=[");
        ((StringBuilder)object).append(n2);
        ((StringBuilder)object).append("]");
        ((StringBuilder)object).append(string);
        return ((StringBuilder)object).toString();
    }

    @Override
    protected final void b() {
        hpn hpn2 = this.l.getAndSet(hhk.I());
        if (hpn2 != null) {
            boolean bl2;
            boolean bl3 = this.isCancelled();
            boolean bl4 = bl2 = true;
            if (bl3) {
                bl4 = this.p() ? bl2 : false;
            }
            hpn2.cancel(bl4);
        }
    }

    public final void d() {
        hqa hqa2 = new hqa();
        hpn hpn2 = hno.g(this.l.getAndSet(hqa2), new ghi(this, 8), this.k);
        hqa2.o(hmv.g(hpn2, Exception.class, new fbk(this, hpn2, 18, null), this.k));
        hqa2.c(new hjz(this, hqa2), (Executor)hom.a);
    }
}

