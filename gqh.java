/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class gqh
implements Callable {
    final Object a;
    final Object b;
    private final int c;

    public gqh(Object object, Object object2, int n2) {
        this.c = n2;
        this.a = object;
        this.b = object2;
    }

    public final Object call() {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                for (n2 = 0; n2 <= 0; ++n2) {
                    Object object = this.b;
                    Closeable closeable = ((Closeable[])((AmbientModeSupport$AmbientController)this.a).a)[n2];
                    hom hom2 = hom.a;
                    ((hod)object).a.F(closeable, (Executor)hom2);
                }
                return null;
            }
            goz goz2 = gno.a();
            gpc gpc2 = gno.f(goz2, (gpc)this.a);
            Object object = this.b;
            try {
                object = object.call();
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
            return object;
        }
        Object object = this.a;
        goz goz3 = gno.a();
        object = gno.g(goz3, (gpc)object);
        Object object2 = this.b;
        try {
            object2 = object2.call();
        }
        catch (Throwable throwable) {
            try {
                gne.c(throwable);
                throw throwable;
            }
            catch (Throwable throwable3) {
                gno.g(goz3, (gpc)object);
                throw throwable3;
            }
        }
        gno.g(goz3, (gpc)object);
        return object2;
    }

    public final String toString() {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                return ((AmbientModeSupport$AmbientController)this.a).toString();
            }
            StringBuilder stringBuilder = new StringBuilder("propagating=[");
            stringBuilder.append(this.b);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder = new StringBuilder("propagating=[");
        stringBuilder.append(this.b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

