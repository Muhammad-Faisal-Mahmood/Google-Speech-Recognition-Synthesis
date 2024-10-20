/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class cgp
extends ccs {
    private static final bxt a;
    private static final ki l;

    static {
        cgo cgo2 = new cgo();
        l = cgo2;
        a = new bxt((Object)"ClientTelemetry.API", cgo2, null);
    }

    public cgp(Context context, cgj cgj2) {
        super(context, a, cgj2, ccr.a);
    }

    public final void a(cgh cgh2) {
        cer cer2 = new cer();
        cer2.b = new cbm[]{cbj.a};
        cer2.b();
        cer2.a = new cgn(cgh2, 0);
        this.g(cer2.a());
    }
}

