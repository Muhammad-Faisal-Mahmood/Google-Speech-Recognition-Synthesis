/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  gqv
 *  hom
 */
import android.content.Intent;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class gez
implements gjj,
gje {
    private final Set a;
    private final gpm b;

    public gez(Map map, gpm gpm2, hpr hpr2) {
        jse.e(map, "packages");
        jse.e(gpm2, "configurationUpdater");
        jse.e(hpr2, "lightweightExecutor");
        this.b = gpm2;
        this.a = map.keySet();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final hpn a(Intent var1_1) {
        jse.e(var1_1 /* !! */ , "intent");
        var3_3 = var1_1 /* !! */ .getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        var1_1 /* !! */  = goo.a;
        var2_5 = fxf.at("Updating experiments", gqv.a, (gop)var1_1 /* !! */ );
        if (var3_3 != null) ** GOTO lbl9
        try {
            block4: {
                var1_1 /* !! */  = this.b.v(false);
                break block4;
lbl9:
                // 1 sources

                var1_1 /* !! */  = this.a.contains(var3_3) != false ? this.b.u((String)var3_3, false) : hhk.K(null);
            }
            gax.c((hpn)var1_1 /* !! */ , "Failed updating experiments for package %s", new Object[]{var3_3});
            var4_6 = ero.h;
            var3_3 = new fmi(var4_6, 13);
            var1_1 /* !! */  = fxf.ae((hpn)var1_1 /* !! */ , Exception.class, (gte)var3_3, (Executor)hom.a);
        }
        catch (Throwable var3_4) {
            try {
                throw var3_4;
            }
            catch (Throwable var1_2) {
                jsd.f(var2_5, var3_4);
                throw var1_2;
            }
        }
        jsd.f(var2_5, null);
        return var1_1 /* !! */ ;
    }

    @Override
    public final long b() {
        return 25000L;
    }

    @Override
    public final long ba() {
        return 25000L;
    }
}

