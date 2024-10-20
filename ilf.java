/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import j$.util.Objects;

public final class ilf
implements ack {
    final Object a;
    private final int b;

    public ilf(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final /* synthetic */ ach a(Class clazz) {
        if (this.b != 0) {
            return we.h(clazz);
        }
        return we.h(clazz);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final ach b(Class object, acr object2) {
        Object object3;
        if (this.b == 0) {
            object = new ilo(object3);
            object3 = ((ilg)idi.d((Context)this.a, ilg.class)).N();
            ((awf)object3).b = object;
            idi.k(((awf)object3).b, ilo.class);
            return new ilh(new brc((brg)((awf)object3).a), (ilo)object);
        }
        Object object4 = new ilc();
        Object object5 = acb.a((acr)object3);
        Object object6 = (bqz)this.a;
        ((bqz)object6).a = object5;
        ((bqz)object6).b = object4;
        idi.k(((bqz)object6).a, abw.class);
        idi.k(((bqz)object6).b, ikv.class);
        object5 = ((bqz)object6).a;
        object5 = new brh(((bqz)object6).c, (abw)object5);
        object6 = (jnu)((ila)idi.e(object5, ila.class)).b().get(object);
        object3 = (jrk)((acr)object3).a(ilb.a);
        object5 = ((ila)idi.e(object5, ila.class)).a().get(object);
        if (object5 == null) {
            if (object3 != null) {
                object3 = ((Class)object).getName();
                object = new StringBuilder("Found creation callback but class ");
                ((StringBuilder)object).append((String)object3);
                ((StringBuilder)object).append(" does not have an assisted factory specified in @HiltViewModel.");
                throw new IllegalStateException(((StringBuilder)object).toString());
            }
            if (object6 == null) {
                object3 = ((Class)object).getName();
                object = new StringBuilder("Expected the @HiltViewModel-annotated class ");
                ((StringBuilder)object).append((String)object3);
                ((StringBuilder)object).append(" to be available in the multi-binding of @HiltViewModelMap but none was found.");
                throw new IllegalStateException(((StringBuilder)object).toString());
            }
            object = (ach)object6.b();
        } else {
            if (object6 != null) {
                object3 = ((Class)object).getName();
                object = new StringBuilder("Found the @HiltViewModel-annotated class ");
                ((StringBuilder)object).append((String)object3);
                ((StringBuilder)object).append(" in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                throw new AssertionError((Object)((StringBuilder)object).toString());
            }
            if (object3 == null) {
                object3 = ((Class)object).getName();
                object = new StringBuilder("Found @HiltViewModel-annotated class ");
                ((StringBuilder)object).append((String)object3);
                ((StringBuilder)object).append(" using @AssistedInject but no creation callback was provided in CreationExtras.");
                throw new IllegalStateException(((StringBuilder)object).toString());
            }
            object = (ach)object3.a(object5);
        }
        Objects.requireNonNull(object4);
        object4 = new ikz((ilc)object4);
        object6 = ((ach)object).h;
        if (((acu)object6).c) {
            acu.a((AutoCloseable)object4);
            return object;
        }
        object3 = ((acu)object6).d;
        synchronized (object3) {
            ((acu)object6).b.add(object4);
            return object;
        }
    }

    @Override
    public final /* synthetic */ ach c(jta jta2, acr acr2) {
        if (this.b != 0) {
            return we.g(this, jta2, acr2);
        }
        return we.g(this, jta2, acr2);
    }
}

