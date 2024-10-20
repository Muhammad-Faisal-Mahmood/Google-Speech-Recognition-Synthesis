/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class jea
implements iwn {
    private final int a;

    public jea(int n2) {
        this.a = n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final /* synthetic */ Object a(String object) {
        if (this.a != 0) {
            return object;
        }
        boolean bl2 = ((String)object).length() > 0;
        fxf.r(bl2, "empty timeout");
        bl2 = ((String)object).length() <= 9;
        fxf.r(bl2, "bad timeout format");
        long l2 = Long.parseLong(((String)object).substring(0, ((String)object).length() - 1));
        char c2 = ((String)object).charAt(((String)object).length() - 1);
        if (c2 == 'H') return TimeUnit.HOURS.toNanos(l2);
        if (c2 == 'M') return TimeUnit.MINUTES.toNanos(l2);
        if (c2 == 'S') return TimeUnit.SECONDS.toNanos(l2);
        if (c2 == 'u') return TimeUnit.MICROSECONDS.toNanos(l2);
        if (c2 == 'm') return TimeUnit.MILLISECONDS.toNanos(l2);
        if (c2 != 'n') throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(c2)));
        return l2;
    }

    @Override
    public final /* synthetic */ String b(Object object) {
        if (this.a != 0) {
            return (String)object;
        }
        object = (Long)object;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if ((Long)object >= 0L) {
            if ((Long)object < 100000000L) {
                Objects.toString(object);
                object = String.valueOf(object).concat("n");
            } else if ((Long)object < 100000000000L) {
                long l2 = timeUnit.toMicros((Long)object);
                object = new StringBuilder();
                ((StringBuilder)object).append(l2);
                ((StringBuilder)object).append("u");
                object = ((StringBuilder)object).toString();
            } else if ((Long)object < 100000000000000L) {
                long l3 = timeUnit.toMillis((Long)object);
                object = new StringBuilder();
                ((StringBuilder)object).append(l3);
                ((StringBuilder)object).append("m");
                object = ((StringBuilder)object).toString();
            } else if ((Long)object < 100000000000000000L) {
                long l4 = timeUnit.toSeconds((Long)object);
                object = new StringBuilder();
                ((StringBuilder)object).append(l4);
                ((StringBuilder)object).append("S");
                object = ((StringBuilder)object).toString();
            } else if ((Long)object < 6000000000000000000L) {
                long l5 = timeUnit.toMinutes((Long)object);
                object = new StringBuilder();
                ((StringBuilder)object).append(l5);
                ((StringBuilder)object).append("M");
                object = ((StringBuilder)object).toString();
            } else {
                long l6 = timeUnit.toHours((Long)object);
                object = new StringBuilder();
                ((StringBuilder)object).append(l6);
                ((StringBuilder)object).append("H");
                object = ((StringBuilder)object).toString();
            }
            return object;
        }
        throw new IllegalArgumentException("Timeout too small");
    }
}

