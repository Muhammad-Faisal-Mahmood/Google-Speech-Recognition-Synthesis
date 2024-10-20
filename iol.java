/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class iol
implements iok {
    public static final dwc a;

    static {
        hav hav2 = hdc.a;
        hav2 = new hdq("CLIENT_LOGGING_PROD");
        a = dwg.d("16", new dwe(4), "EAAYAg", "com.google.android.libraries.performance.primes", hav2, true, true);
    }

    @Override
    public final ket a(Context context) {
        return (ket)a.b(context);
    }
}

