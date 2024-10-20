/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;

public final class hji
implements Closeable {
    private final Deque a = new ArrayDeque(4);
    private Throwable b;

    public final RuntimeException a(Throwable throwable) {
        this.b = throwable;
        gun.a(throwable, IOException.class);
        gun.b(throwable);
        throw new RuntimeException(throwable);
    }

    public final RuntimeException b(Throwable throwable, Class clazz) {
        this.b = throwable;
        gun.a(throwable, IOException.class);
        gun.a(throwable, clazz);
        gun.b(throwable);
        throw new RuntimeException(throwable);
    }

    public final void c(Closeable closeable) {
        if (closeable != null) {
            this.a.addFirst(closeable);
        }
    }

    @Override
    public final void close() {
        Throwable throwable = this.b;
        while (!this.a.isEmpty()) {
            Closeable closeable = (Closeable)this.a.removeFirst();
            try {
                closeable.close();
            }
            catch (Throwable throwable2) {
                if (throwable == null) {
                    throwable = throwable2;
                    continue;
                }
                if (throwable == throwable2) continue;
                try {
                    throwable.addSuppressed(throwable2);
                }
                catch (Throwable throwable3) {
                    hjh.a.logp(Level.WARNING, "com.google.common.io.Closer", "<init>", "Suppressing exception thrown when closing ".concat(String.valueOf(String.valueOf(closeable))), throwable2);
                }
            }
        }
        if (this.b == null && throwable != null) {
            gun.a(throwable, IOException.class);
            gun.b(throwable);
            throw new AssertionError((Object)throwable);
        }
    }
}

