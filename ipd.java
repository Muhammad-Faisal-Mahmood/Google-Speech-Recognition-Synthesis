/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class ipd
implements ipc {
    public static final dwc a;
    public static final dwc b;

    static {
        hav hav2 = hdc.a;
        hav2 = new hdq("CLIENT_LOGGING_PROD");
        a = dwg.c("45359255", false, "com.google.android.libraries.performance.primes", hav2, true, true);
        b = dwg.c("36", true, "com.google.android.libraries.performance.primes", hav2, true, true);
    }

    @Override
    public final boolean a(Context context) {
        return (Boolean)a.b(context);
    }

    @Override
    public final boolean b(Context context) {
        return (Boolean)b.b(context);
    }
}

