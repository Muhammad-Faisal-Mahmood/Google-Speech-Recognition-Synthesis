/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class ior
implements ioq {
    public static final dwc a;
    public static final dwc b;
    public static final dwc c;
    public static final dwc d;
    public static final dwc e;

    static {
        hav hav2 = hdc.a;
        hav2 = new hdq("CLIENT_LOGGING_PROD");
        a = dwg.d("45390627", new dwe(6), "CAAQAxgGIJBOLQrXIzw", "com.google.android.libraries.performance.primes", hav2, true, true);
        b = dwg.d("45376983", new dwe(7), "CAEQZBj0AyDoBw", "com.google.android.libraries.performance.primes", hav2, true, true);
        c = dwg.c("45625683", false, "com.google.android.libraries.performance.primes", hav2, true, true);
        d = dwg.c("33", false, "com.google.android.libraries.performance.primes", hav2, true, true);
        e = dwg.d("45371370", new dwe(8), "CJYBEMgB", "com.google.android.libraries.performance.primes", hav2, true, true);
    }

    @Override
    public final dnh a(Context context) {
        return (dnh)a.b(context);
    }

    @Override
    public final dns b(Context context) {
        return (dns)e.b(context);
    }

    @Override
    public final dnt c(Context context) {
        return (dnt)b.b(context);
    }

    @Override
    public final boolean d(Context context) {
        return (Boolean)c.b(context);
    }

    @Override
    public final boolean e(Context context) {
        return (Boolean)d.b(context);
    }
}

