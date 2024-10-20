/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

public final class jbn {
    public static final Logger a = Logger.getLogger(jbn.class.getName());
    public final String b;
    public final AtomicLong c;

    public jbn() {
        AtomicLong atomicLong;
        this.c = atomicLong = new AtomicLong();
        fxf.r(true, "value must be positive");
        this.b = "keepalive time nanos";
        atomicLong.set(Long.MAX_VALUE);
    }
}

