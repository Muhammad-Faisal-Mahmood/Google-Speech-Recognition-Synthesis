/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

final class cpp
implements Serializable,
cpz {
    private static final TimeUnit a = TimeUnit.MINUTES;
    private static final long serialVersionUID = 0L;

    @Override
    public final int a() {
        return 1;
    }

    public final Class annotationType() {
        return cpz.class;
    }

    @Override
    public final int b() {
        return 1000;
    }

    @Override
    public final int c() {
        return 1;
    }

    @Override
    public final int d() {
        return 1;
    }

    @Override
    public final int e() {
        return 1000;
    }

    @Override
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof cpz) {
            object = (cpz)object;
            object.d();
            object.e();
            object.a();
            object.b();
            object.c();
            object.f();
            if (a.equals((Object)object.g())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final long f() {
        return 1L;
    }

    @Override
    public final TimeUnit g() {
        return a;
    }

    @Override
    public final int hashCode() {
        return (a.hashCode() ^ 0xCFAFA0CD) - 1944263094;
    }

    @Override
    public final String toString() {
        return "@com.google.android.libraries.concurrent.monitoring.ThreadMonitoringConfiguration()";
    }
}

