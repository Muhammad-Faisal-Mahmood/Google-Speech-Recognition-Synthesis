/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class ioi
implements ioh {
    public static final dwc a;
    public static final dwc b;
    public static final dwc c;
    public static final dwc d;

    static {
        hav hav2 = hdc.a;
        hav2 = new hdq("CLIENT_LOGGING_PROD");
        a = dwg.c("45352228", true, "com.google.android.libraries.performance.primes", hav2, true, true);
        b = dwg.d("45352241", new dwe(3), "CAYIBAgFCAM", "com.google.android.libraries.performance.primes", hav2, true, true);
        c = dwg.c("45633315", false, "com.google.android.libraries.performance.primes", hav2, true, true);
        d = dwg.a("45646085", 175500L, "com.google.android.libraries.performance.primes", hav2, true, true);
    }

    @Override
    public final long a(Context context) {
        return (Long)d.b(context);
    }

    @Override
    public final kdb b(Context context) {
        return (kdb)b.b(context);
    }

    @Override
    public final boolean c(Context context) {
        return (Boolean)a.b(context);
    }

    @Override
    public final boolean d(Context context) {
        return (Boolean)c.b(context);
    }
}

