/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;

public final class kch {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;

    static {
        String string;
        String string2 = string = kbu.a("kotlinx.coroutines.scheduler.default.name");
        if (string == null) {
            string2 = "DefaultDispatcher";
        }
        a = string2;
        b = jse.aq("kotlinx.coroutines.scheduler.resolution.ns", 100000L);
        c = jse.ap("kotlinx.coroutines.scheduler.core.pool.size", jse.k(kbu.a, 2), 1, 0, 8);
        d = jse.ap("kotlinx.coroutines.scheduler.max.pool.size", 0x1FFFFE, 0, 0x1FFFFE, 4);
        e = TimeUnit.SECONDS.toNanos(jse.aq("kotlinx.coroutines.scheduler.keep.alive.sec", 60L));
    }
}

