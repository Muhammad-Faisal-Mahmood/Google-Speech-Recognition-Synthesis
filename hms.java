/*
 * Decompiled with CFR 0.152.
 */
import j$.time.Instant;
import java.math.RoundingMode;

public final class hms {
    static {
        Instant.ofEpochMilli(Long.MAX_VALUE);
        Instant.ofEpochMilli(Long.MIN_VALUE);
        hms.b(Long.MAX_VALUE);
        hms.b(Long.MIN_VALUE);
        hms.a(Long.MAX_VALUE);
        hms.a(Long.MIN_VALUE);
        Instant.MIN.getEpochSecond();
        Instant.MAX.getEpochSecond();
    }

    public static Instant a(long l2) {
        return Instant.ofEpochSecond(hhk.as(l2, 1000000000L, RoundingMode.FLOOR), hhk.ao(l2, 1000000000));
    }

    public static void b(long l2) {
        Instant.ofEpochSecond(hhk.as(l2, 1000000L, RoundingMode.FLOOR), hhk.ao(l2, 1000000) * 1000);
    }
}

