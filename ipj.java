/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class ipj
implements ipi {
    public static final dwc a;
    public static final dwc b;
    public static final dwc c;
    public static final dwc d;
    public static final dwc e;
    public static final dwc f;

    static {
        hav hav2 = hdc.a;
        hav2 = new hdq("CLIENT_LOGGING_PROD");
        a = dwg.a("45641094", 2L, "com.google.android.libraries.performance.primes", hav2, true, true);
        b = dwg.c("3", false, "com.google.android.libraries.performance.primes", hav2, true, true);
        c = dwg.a("45357887", 1L, "com.google.android.libraries.performance.primes", hav2, true, true);
        d = dwg.d("19", new dwe(13), "EAAYAg", "com.google.android.libraries.performance.primes", hav2, true, true);
        e = dwg.c("45641093", false, "com.google.android.libraries.performance.primes", hav2, true, true);
        f = dwg.a("45628530", 0L, "com.google.android.libraries.performance.primes", hav2, true, true);
    }

    @Override
    public final long a(Context context) {
        return (Long)a.b(context);
    }

    @Override
    public final long b(Context context) {
        return (Long)c.b(context);
    }

    @Override
    public final long c(Context context) {
        return (Long)f.b(context);
    }

    @Override
    public final ket d(Context context) {
        return (ket)d.b(context);
    }

    @Override
    public final boolean e(Context context) {
        return (Boolean)b.b(context);
    }

    @Override
    public final boolean f(Context context) {
        return (Boolean)e.b(context);
    }
}

