/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

final class iuq {
    static final iur a;

    static {
        Object object;
        AtomicReference<ClassNotFoundException> atomicReference = new AtomicReference<ClassNotFoundException>();
        try {
            object = Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(iur.class).getConstructor(null).newInstance(null);
        }
        catch (Exception exception) {
            throw new RuntimeException("Storage override failed to initialize", exception);
        }
        catch (ClassNotFoundException classNotFoundException) {
            atomicReference.set(classNotFoundException);
            object = new iyn();
        }
        a = object;
        object = (Throwable)atomicReference.get();
        if (object != null) {
            ius.c.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", (Throwable)object);
        }
    }
}

