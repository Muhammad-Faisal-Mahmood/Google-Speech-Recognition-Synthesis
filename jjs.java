/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;

final class jjs
implements jjt {
    @Override
    public final long a() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }
}

