/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReference;

final class az
extends bc {
    final oj a;
    final AtomicReference b;
    final nu c;
    final nl d;
    final be e;

    public az(be be2, oj oj2, AtomicReference atomicReference, nu nu2, nl nl2) {
        this.e = be2;
        this.a = oj2;
        this.b = atomicReference;
        this.c = nu2;
        this.d = nl2;
    }

    @Override
    public final void a() {
        Object object = new StringBuilder("fragment_");
        Object object2 = this.e;
        ((StringBuilder)object).append(((be)object2).k);
        ((StringBuilder)object).append("_rq#");
        ((StringBuilder)object).append(((be)object2).ae.getAndIncrement());
        String string = ((StringBuilder)object).toString();
        nu nu2 = this.c;
        object2 = this.a.a();
        jse.e(nu2, "contract");
        Object object3 = this.d;
        jse.e(object3, "callback");
        object = this.e;
        abb abb2 = object.getLifecycle();
        if (!abb2.a().a(aba.d)) {
            nq nq2 = (nq)object2;
            nq2.c(string);
            object = object2 = (bxt)nq2.c.get(string);
            if (object2 == null) {
                object = new bxt(abb2);
            }
            object2 = this.b;
            object3 = new nn(nq2, string, (nl)object3, nu2);
            ((abb)((bxt)object).a).b((abd)object3);
            ((bxt)object).b.add(object3);
            nq2.c.put(string, object);
            ((AtomicReference)object2).set(new no());
            return;
        }
        object2 = new StringBuilder("LifecycleOwner ");
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append(" is attempting to register while current state is ");
        ((StringBuilder)object2).append((Object)abb2.a());
        ((StringBuilder)object2).append(". LifecycleOwners must call register before they are STARTED.");
        throw new IllegalStateException(((StringBuilder)object2).toString());
    }
}

