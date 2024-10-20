/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  hom
 */
import android.text.TextUtils;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class drs
extends dro
implements dmw,
dri {
    private static final Callable a = new cuh(20);
    private final drr b;
    private final dsc c;

    public drs(drr drr2, gto gto2) {
        this.b = drr2;
        this.c = (dsc)gto2.c().b();
    }

    @Override
    public final /* synthetic */ void L() {
    }

    @Override
    public final hpn a(djt djt2, long l2, long l3) {
        return this.b.a(djt2, l2, l3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final drn b() {
        synchronized (this) {
            drn drn2 = this.b.b();
            if (!drn.b(drn2) && ((dsj)this.c.g.get()).a()) {
                dsa dsa2;
                AtomicReference atomicReference;
                if (dsd.c.get() == null && a.i(atomicReference = dsd.c, dsa2 = new dsa())) {
                    dsd.a = 5;
                    dsd.b = 1000;
                    drn2.c = true;
                } else {
                    ((heg)((heg)dkc.a.e()).j("com/google/android/libraries/performance/primes/metrics/trace/Tracer", "start", 66, "Tracer.java")).r("Ignore Tracer.start(), current active trace...");
                }
            }
            return drn2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn c(drn object, djt object2) {
        hpn hpn2 = this.b.c((drn)object, (djt)object2);
        if (object != null && !drn.b((drn)object)) {
            object2 = ((djt)object2).a;
            if (((drn)object).c) {
                dsc dsc2 = this.c;
                object = object2;
                if (!TextUtils.isEmpty(null)) {
                    object = null;
                }
                fxf.A(TextUtils.isEmpty((CharSequence)object) ^ true);
                object2 = dsd.c.getAndSet(null);
                if (object2 != null) {
                    ((dsa)object2).b.b = object;
                }
                object = object2 == null ? hpj.a : hhk.P(new ctz(dsc2, object2, 14), dsc2.c);
                return hhk.ab(new hpn[]{hpn2, object}).a(a, (Executor)hom.a);
            } else {
                Object object3 = ((drn)object).b;
                long l2 = ((drn)object).a();
                if (!TextUtils.isEmpty((CharSequence)object2) && l2 > 0L && (object = (dsa)dsd.c.get()) != null) {
                    object3 = ((dmy)object3).a;
                    long l3 = ((dsa)object).b.c;
                    long l4 = ((dmz)object3).a;
                    if (l3 <= l4) {
                        ((heg)((heg)dkc.a.e()).j("com/google/android/libraries/performance/primes/metrics/trace/TraceData", "sideLoadSpan", 115, "TraceData.java")).G("Sideload span: %s. startMs: %d, durationMs: %d", object2, l4, l2);
                        object3 = new dru((String)object2, l4, l4 + l2, Thread.currentThread().getId(), 4);
                        object2 = ((dsa)object).d;
                        synchronized (object2) {
                            ((dsa)object).d.add(object3);
                        }
                        ((dsa)object).b();
                    }
                }
                object = hpj.a;
            }
            return hhk.ab(new hpn[]{hpn2, object}).a(a, (Executor)hom.a);
        }
        object = hpj.a;
        return hhk.ab(new hpn[]{hpn2, object}).a(a, (Executor)hom.a);
    }
}

