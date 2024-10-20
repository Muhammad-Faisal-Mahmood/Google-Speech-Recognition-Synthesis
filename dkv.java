/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import java.util.logging.Level;

public final class dkv
extends hgw {
    private final cxu a;

    public dkv(cxu object, gto gto2) {
        super("");
        this.a = object;
        object = (dly)gto2.e(new dly(null));
    }

    @Override
    public final void a(RuntimeException runtimeException, hfu hfu2) {
        Log.e((String)"PrimesFloggerBackend", (String)"Internal logging error", (Throwable)runtimeException);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void b(hfu var1_1) {
        var7_2 = (Boolean)var1_1.l().d(dkr.a);
        if (var7_2 == null || !var7_2.booleanValue()) ** GOTO lbl-1000
        var7_2 = var1_1.m();
        var7_2 = var7_2 == null ? var1_1.n().toString() : var7_2.b;
        var8_3 = var1_1.f().c();
        if (var8_3 != null) {
            var7_2 = new dks(var1_1.o(), (String)var7_2, (String)var8_3);
        } else lbl-1000:
        // 2 sources

        {
            var7_2 = null;
        }
        if (var1_1.m() == null) {
            var1_1 = new dkt(var1_1.f().b(), var1_1.f().d(), var1_1.f().a(), var1_1.e(), (dks)var7_2);
        } else {
            var9_4 = var1_1.O();
            var6_5 = var9_4.length;
            var5_6 = 0;
            var2_8 = 0;
            for (var4_7 = 0; var4_7 < var6_5; ++var4_7) {
                var3_9 = var2_8;
                if (dkt.a(var9_4[var4_7])) {
                    var3_9 = var2_8 + 1;
                }
                var2_8 = var3_9;
            }
            if (var2_8 == 0) {
                var1_1 = new dkt(var1_1.f().b(), var1_1.f().d(), var1_1.f().a(), var1_1.e(), (dks)var7_2);
            } else {
                var11_10 = new int[var2_8];
                var10_11 = new String[var2_8];
                var3_9 = 0;
                for (var2_8 = var5_6; var2_8 < var9_4.length; ++var2_8) {
                    var8_3 = var9_4[var2_8];
                    var4_7 = var3_9;
                    if (dkt.a(var8_3)) {
                        var11_10[var3_9] = var2_8;
                        var8_3 = var8_3 == null ? "null" : ((dlb)var8_3).a;
                        var10_11[var3_9] = var8_3;
                        var4_7 = var3_9 + 1;
                    }
                    var3_9 = var4_7;
                }
                var1_1 = new dkt(var1_1.f().b(), var1_1.f().d(), var1_1.f().a(), var1_1.e(), var11_10, var10_11, (dks)var7_2);
            }
        }
        var7_2 = (dla)((ThreadLocal)this.a.a).get();
        var2_8 = var7_2.b;
        var7_2.a.set(var2_8 % 20, var1_1);
        if (var2_8 == 0x7FFFFFFF) {
            var2_8 = var7_2.d;
            var2_8 = 28;
        } else {
            ++var2_8;
        }
        var7_2.b = var2_8;
        var7_2.c = var2_8;
    }

    @Override
    public final boolean c(Level level) {
        return true;
    }
}

