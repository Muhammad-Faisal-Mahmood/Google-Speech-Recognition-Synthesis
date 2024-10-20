/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class hou {
    public bmt a;
    private final AtomicReference b = new AtomicReference<hpn>(hpj.a);

    public hou() {
        this.a = new bmt();
    }

    public final hpn a(Callable callable, Executor executor) {
        fxf.K(executor);
        return this.b(new hor(callable), executor);
    }

    public final hpn b(hnx object, Executor object2) {
        fxf.K(object2);
        object2 = new hot((Executor)object2, this);
        object = new gqg((hot)object2, (hnx)object, 3);
        hqa hqa2 = new hqa();
        hpn hpn2 = this.b.getAndSet(hqa2);
        hqh hqh2 = new hqh((hnx)object);
        hpn2.c(hqh2, (Executor)object2);
        object = hhk.L(hqh2);
        object2 = new hoq(hqh2, hqa2, hpn2, (hpn)object, (hot)object2);
        object.c((Runnable)object2, (Executor)hom.a);
        hqh2.c((Runnable)object2, (Executor)hom.a);
        return object;
    }
}

