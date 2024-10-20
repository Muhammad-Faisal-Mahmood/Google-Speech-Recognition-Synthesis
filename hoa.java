/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.util.concurrent.Executor;

public final class hoa
implements hny {
    final Object a;
    final Object b;
    private final int c;

    public hoa(gpc gpc2, hny hny2, int n2) {
        this.c = n2;
        this.a = gpc2;
        this.b = hny2;
    }

    public hoa(hog hog2, Object object, int n2) {
        this.c = n2;
        this.a = object;
        this.b = hog2;
    }

    @Override
    public final hpn a(Object object) {
        int n2 = this.c;
        if (n2 != 0) {
            block13: {
                if (n2 != 1) {
                    hod hod2 = new hod();
                    Object object2 = this.a;
                    hod hod3 = ((hog)this.b).c;
                    try {
                        object = object2.a(hod2.a, object);
                        ((hog)object).d(hod2);
                        object = ((hog)object).d;
                        return object;
                    }
                    finally {
                        hod3.a(hod2, (Executor)hom.a);
                    }
                }
                Object object3 = this.a;
                goz goz2 = gno.a();
                object3 = gno.f(goz2, (gpc)object3);
                Object object4 = this.b;
                try {
                    object = object4.a(object);
                    if (object == null) break block13;
                }
                catch (Throwable throwable) {
                    try {
                        gne.c(throwable);
                        throw throwable;
                    }
                    catch (Throwable throwable2) {
                        gno.f(goz2, (gpc)object3);
                        throw throwable2;
                    }
                }
                gno.f(goz2, (gpc)object3);
                return object;
            }
            object = new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
            throw object;
        }
        hod hod4 = new hod();
        Object object5 = this.a;
        hod hod5 = ((hog)this.b).c;
        try {
            object = hhk.K(object5.a(hod4.a, object));
            return object;
        }
        finally {
            hod5.a(hod4, (Executor)hom.a);
        }
    }

    public final String toString() {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                return this.a.toString();
            }
            StringBuilder stringBuilder = new StringBuilder("propagating=[");
            stringBuilder.append(this.b);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
        return this.a.toString();
    }
}

