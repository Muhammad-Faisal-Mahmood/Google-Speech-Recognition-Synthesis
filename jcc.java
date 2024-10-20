/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class jcc
implements Runnable,
ium {
    public final boolean a;
    public final boolean b;
    public final long c;
    public volatile ScheduledFuture d;
    public volatile boolean e;
    final jci f;

    /*
     * Enabled aggressive block sorting
     */
    public jcc(jci jci2, iut iut2, boolean bl2) {
        long l2;
        this.f = jci2;
        this.a = bl2;
        if (iut2 == null) {
            this.b = false;
            l2 = 0L;
        } else {
            this.b = true;
            l2 = iut2.b(TimeUnit.NANOSECONDS);
        }
        this.c = l2;
    }

    @Override
    public final void a(ius ius2) {
        if (this.b && this.a && ius2.c() instanceof TimeoutException) {
            this.f.h.c(this.b());
            return;
        }
        this.f.h.c(kmp.R(ius2));
    }

    final iyh b() {
        long l2 = Math.abs(this.c) / TimeUnit.SECONDS.toNanos(1L);
        long l3 = Math.abs(this.c);
        long l4 = TimeUnit.SECONDS.toNanos(1L);
        StringBuilder stringBuilder = new StringBuilder();
        Object object = true != this.a ? "CallOptions" : "Context";
        stringBuilder.append((String)object);
        stringBuilder.append(" deadline exceeded after ");
        if (this.c < 0L) {
            stringBuilder.append('-');
        }
        stringBuilder.append(l2);
        stringBuilder.append(String.format(Locale.US, ".%09d", l3 % l4));
        stringBuilder.append("s. ");
        Long l5 = (Long)this.f.g.g(iuc.f);
        object = Locale.US;
        double d2 = l5 == null ? 0.0 : (double)l5.longValue() / jci.a;
        stringBuilder.append(String.format((Locale)object, "Name resolution delay %.9f seconds.", d2));
        if (this.f.h != null) {
            object = new jeh();
            this.f.h.b((jeh)object);
            stringBuilder.append(" ");
            stringBuilder.append(object);
        }
        return iyh.e.e(stringBuilder.toString());
    }

    final void c() {
        this.e = true;
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f.e.g(this);
    }

    @Override
    public final void run() {
        this.f.h.c(this.b());
    }
}

