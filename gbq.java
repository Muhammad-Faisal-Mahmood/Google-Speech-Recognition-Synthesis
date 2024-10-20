/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class gbq {
    public final AtomicLong a = new AtomicLong(gbq.b(Integer.MIN_VALUE, Integer.MIN_VALUE));
    public final AtomicReference b = new AtomicReference<Object>(null);
    public final hqa c;
    public final hpd d;
    private final AtomicReference e = new AtomicReference<Object>(null);
    private final Executor f = new hpz((Executor)hom.a);

    public gbq(hnx object, Executor executor) {
        hqa hqa2;
        this.c = hqa2 = new hqa();
        this.d = object = new hpd((hnx)object, executor, 1);
        hqa2.c((Runnable)object, (Executor)hom.a);
    }

    public static int a(long l2) {
        return (int)(l2 >>> 32);
    }

    public static long b(int n2, int n3) {
        long l2 = n2;
        return (long)n3 & 0xFFFFFFFFL | l2 << 32;
    }

    public final hpn c() {
        if (!this.c.isDone()) {
            int n2;
            int n3;
            long l2;
            while (!this.a.compareAndSet(l2 = this.a.get(), gbq.b(n3 = gbq.a(l2), (n2 = (int)l2) + 1))) {
            }
            hqa hqa2 = new hqa();
            hpn hpn2 = this.e.getAndSet(hqa2);
            hpn2 = hpn2 == null ? hhk.P(gqk.c(new cyy(this, n3, 2)), (Executor)hom.a) : hmv.g(hpn2, Throwable.class, gqk.d(new fbc(this, n3, 3)), this.f);
            hqa2.o(hpn2);
            hpn2 = new gbo(this, n3);
            hqa2.c(new gbn(this, hqa2, (gbo)hpn2), (Executor)hom.a);
            return hpn2;
        }
        return this.c;
    }

    public final hpn d(int n2) {
        Object object;
        if (gbq.a(this.a.get()) > n2) {
            return hhk.I();
        }
        gbp gbp2 = new gbp(n2);
        do {
            if ((object = (gbp)this.b.get()) == null || ((gbp)object).a <= n2) continue;
            return hhk.I();
        } while (!a.l(this.b, object, gbp2));
        if (gbq.a(this.a.get()) > n2) {
            gbp2.cancel(true);
            a.l(this.b, gbp2, null);
            return gbp2;
        }
        Object object2 = this.d;
        object = ((hpd)object2).a;
        object2 = ((hpd)object2).b;
        if (object != null && object2 != null) {
            gbp2.o(hhk.P(gqk.c((hnx)object), (Executor)object2));
        } else {
            gbp2.o(this.c);
        }
        return gbp2;
    }

    public final boolean e() {
        return this.c.isDone();
    }
}

