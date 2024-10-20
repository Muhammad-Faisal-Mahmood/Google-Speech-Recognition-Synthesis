/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.util.concurrent.Executor;

public final class gqg
implements hnx {
    final Object a;
    final Object b;
    private final int c;

    public gqg(hot hot2, hnx hnx2, int n2) {
        this.c = n2;
        this.b = hot2;
        this.a = hnx2;
    }

    public gqg(Object object, Object object2, int n2) {
        this.c = n2;
        this.a = object;
        this.b = object2;
    }

    @Override
    public final hpn a() {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    Object object = this.b;
                    hos hos2 = hos.a;
                    Object object2 = hos.c;
                    object2 = !((hot)object).compareAndSet(hos2, object2) ? hhk.I() : this.a.a();
                    return object2;
                }
                hod hod2 = new hod();
                try {
                    Object object = this.a.a();
                    ((hog)object).d((hod)this.b);
                    object = ((hog)object).d;
                    return object;
                }
                finally {
                    Object object = this.b;
                    hom hom2 = hom.a;
                    ((hod)object).a(hod2, (Executor)hom2);
                }
            }
            return this.a.a();
        }
        goz goz2 = gno.a();
        gpc gpc2 = gno.f(goz2, (gpc)this.a);
        Object object = this.b;
        try {
            object = object.a();
        }
        catch (Throwable throwable) {
            try {
                gne.c(throwable);
                throw throwable;
            }
            catch (Throwable throwable2) {
                gno.f(goz2, gpc2);
                throw throwable2;
            }
        }
        gno.f(goz2, gpc2);
        jse.d(object, "wrapInTrace(...)");
        return object;
    }

    public final String toString() {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    return this.a.toString();
                }
                return this.a.toString();
            }
            Object object = this.a;
            Object object2 = this.b;
            object = object.toString();
            String string = String.valueOf(object2);
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(", input=[");
            ((StringBuilder)object2).append(string);
            ((StringBuilder)object2).append("]");
            return ((StringBuilder)object2).toString();
        }
        StringBuilder stringBuilder = new StringBuilder("propagating=[");
        stringBuilder.append(this.b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

