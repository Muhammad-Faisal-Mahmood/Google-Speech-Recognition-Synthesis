/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReference;

public final class htj
extends iva {
    private final AtomicReference a = new AtomicReference<hti>(hti.b(1));

    public htj(itz itz2) {
        super(itz2);
    }

    @Override
    public final void a(fvc object, iwx object2) {
        Object object3;
        hti hti2;
        while (!a.l(this.a, hti2 = (hti)this.a.get(), object3 = hti2.a == 1 ? hti.b(2) : hti2)) {
        }
        int n2 = hti2.a;
        if (n2 != 1) {
            if (n2 == 4) {
                object2 = hti2.b;
                object3 = new iwx();
                ((fvc)object).a((iyh)object2, (iwx)object3);
                return;
            }
            object = new IllegalStateException("Already started");
            this.c.c("start() called more than once", (Throwable)object);
            throw object;
        }
        this.c.a((fvc)object, (iwx)object2);
    }

    @Override
    public final void c(String string, Throwable throwable) {
        int n2;
        hti hti2;
        iyh iyh2 = iyh.c;
        Object object = iyh2;
        if (string != null) {
            object = iyh2.e(string);
        }
        iyh2 = object;
        if (throwable != null) {
            iyh2 = ((iyh)object).d(throwable);
        }
        while (!a.l(this.a, hti2 = (hti)this.a.get(), object = (n2 = hti2.a) == 4 ? hti2 : (n2 == 1 ? hti.a(4, iyh2) : hti.a(5, iyh2)))) {
        }
        this.c.c(string, throwable);
    }

    @Override
    public final void d() {
        block1: {
            hti hti2;
            do {
                hti2 = (hti)this.a.get();
                if (hti2.a != 2) break block1;
            } while (!a.l(this.a, hti2, hti.b(3)));
            this.c.d();
            return;
        }
        throw new IllegalStateException("Call was either not started or already half-closed.");
    }

    @Override
    public final void e(int n2) {
        int n3 = ((hti)this.a.get()).a;
        if (n3 != 1 && n3 != 4) {
            fxf.r(true, "Number requested must be non-negative");
            this.c.e(n2);
            return;
        }
        throw new IllegalStateException("Not started");
    }

    @Override
    public final void f(Object object) {
        a.s(object, "Message must be non-null");
        int n2 = ((hti)this.a.get()).a;
        if (n2 == 2) {
            this.c.f(object);
            return;
        }
        if (n2 == 5) {
            return;
        }
        throw new IllegalStateException("Call was either not started or already half-closed.");
    }
}

