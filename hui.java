/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class hui
implements dxa {
    private static final AtomicBoolean a = new AtomicBoolean(false);
    private final hug b;
    private final gto c;

    public hui(hug hug2, gto gto2) {
        this.b = hug2;
        this.c = gto2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a() {
        if (fs$$ExternalSyntheticApiModelOutline0.m()) {
            return;
        }
        if (a.getAndSet(true)) return;
        gol gol2 = fxf.aq("AndroidLoggerConfig");
        try {
            Object object = this.b;
            Object object2 = this.c.g() ? (hhk)this.c.c() : null;
            if (hgz.a.compareAndSet(false, true)) {
                if (!a.i(hhf.d, object)) {
                    object2 = new IllegalStateException("Logger backends can only be configured once.");
                    throw object2;
                }
                hhf.e();
                AtomicReference atomicReference = hhg.a.b;
                object = object2;
                if (object2 == null) {
                    object = hhm.a;
                }
                atomicReference.set(object);
                return;
            }
            object2 = new IllegalStateException("Logger backend configuration may only occur once.");
            throw object2;
        }
        finally {
            gol2.close();
        }
    }
}

