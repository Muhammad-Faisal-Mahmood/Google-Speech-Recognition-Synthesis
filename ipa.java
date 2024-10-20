/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class ipa
implements ioz {
    public static final dwc a;
    public static final dwc b;
    public static final dwc c;
    public static final dwc d;

    static {
        hav hav2 = hdc.a;
        hav2 = new hdq("CLIENT_LOGGING_PROD");
        a = dwg.c("45415027", true, "com.google.android.libraries.performance.primes", hav2, true, true);
        b = dwg.d("8", new dwe(11), "EOgHGAQ", "com.google.android.libraries.performance.primes", hav2, true, true);
        c = dwg.a("45401381", 3600000L, "com.google.android.libraries.performance.primes", hav2, true, true);
        d = dwg.c("45420903", false, "com.google.android.libraries.performance.primes", hav2, true, true);
    }

    @Override
    public final long a(Context context) {
        return (Long)c.b(context);
    }

    @Override
    public final ket b(Context context) {
        return (ket)b.b(context);
    }

    @Override
    public final boolean c(Context context) {
        return (Boolean)a.b(context);
    }

    @Override
    public final boolean d(Context context) {
        return (Boolean)d.b(context);
    }
}

