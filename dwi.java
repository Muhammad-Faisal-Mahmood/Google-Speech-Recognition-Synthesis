/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicBoolean;

public final class dwi {
    public static final int a = 0;
    private static final AtomicBoolean b = new AtomicBoolean(false);

    public static void a(int ... nArray) {
        if (b.compareAndSet(false, true)) {
            caj.f(new dwh(nArray));
        }
    }
}

