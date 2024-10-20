/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicBoolean;

public final class cry {
    private static final AtomicBoolean a = new AtomicBoolean(false);

    public static void a() {
        if (a.compareAndSet(false, true)) {
            hwj hwj2 = hwj.a();
            a.s(hwj2, "newRegistry");
            jmj.a = hwj2;
        }
    }
}

