/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class guh {
    public boolean a;
    private final gup b;
    private long c;
    private long d;

    public guh() {
        this.b = gup.a;
    }

    public guh(gup gup2) {
        a.s(gup2, "ticker");
        this.b = gup2;
    }

    public static guh b(gup object) {
        object = new guh((gup)object);
        ((guh)object).d();
        return object;
    }

    private final long f() {
        long l2 = this.a ? this.b.a() - this.d + this.c : this.c;
        return l2;
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(this.f(), TimeUnit.NANOSECONDS);
    }

    public final void c() {
        this.c = 0L;
        this.a = false;
    }

    public final void d() {
        fxf.B(this.a ^ true, "This stopwatch is already running.");
        this.a = true;
        this.d = this.b.a();
    }

    public final void e() {
        long l2 = this.b.a();
        fxf.B(this.a, "This stopwatch is already stopped.");
        this.a = false;
        this.c += l2 - this.d;
    }

    public final String toString() {
        long l2 = this.f();
        Object object = TimeUnit.DAYS.convert(l2, TimeUnit.NANOSECONDS) > 0L ? TimeUnit.DAYS : (TimeUnit.HOURS.convert(l2, TimeUnit.NANOSECONDS) > 0L ? TimeUnit.HOURS : (TimeUnit.MINUTES.convert(l2, TimeUnit.NANOSECONDS) > 0L ? TimeUnit.MINUTES : (TimeUnit.SECONDS.convert(l2, TimeUnit.NANOSECONDS) > 0L ? TimeUnit.SECONDS : (TimeUnit.MILLISECONDS.convert(l2, TimeUnit.NANOSECONDS) > 0L ? TimeUnit.MILLISECONDS : (TimeUnit.MICROSECONDS.convert(l2, TimeUnit.NANOSECONDS) > 0L ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS)))));
        double d2 = l2;
        double d3 = TimeUnit.NANOSECONDS.convert(1L, (TimeUnit)((Object)object));
        String string = String.format(Locale.ROOT, "%.4g", d2 / d3);
        switch (gug.a[object.ordinal()]) {
            default: {
                throw new AssertionError();
            }
            case 7: {
                object = "d";
                break;
            }
            case 6: {
                object = "h";
                break;
            }
            case 5: {
                object = "min";
                break;
            }
            case 4: {
                object = "s";
                break;
            }
            case 3: {
                object = "ms";
                break;
            }
            case 2: {
                object = "\u03bcs";
                break;
            }
            case 1: {
                object = "ns";
            }
        }
        return a.ao((String)object, string, " ");
    }
}

