/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.net.ConnectivityManager
 *  android.telephony.TelephonyManager
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;

public final class afz
extends BroadcastReceiver {
    final jle a;

    public afz(jle jle2) {
        this.a = jle2;
    }

    /*
     * Unable to fully structure code
     */
    public final void onReceive(Context var1_1, Intent var2_3) {
        block16: {
            block17: {
                block18: {
                    block19: {
                        block20: {
                            var2_3 = (ConnectivityManager)var1_1.getSystemService("connectivity");
                            var3_5 = 0;
                            if (var2_3 == null) break block16;
                            try {
                                var2_3 = var2_3.getActiveNetworkInfo();
                            }
                            catch (SecurityException var2_4) {
                                ** continue;
                            }
                            if (var2_3 == null || !var2_3.isConnected()) break block17;
                            var4_6 = var2_3.getType();
                            if (var4_6 == 0) break block18;
                            if (var4_6 == 1) break block19;
                            if (var4_6 == 4 || var4_6 == 5) break block18;
                            if (var4_6 == 6) break block20;
                            var3_5 = var4_6 != 9 ? 8 : 7;
                            break block16;
                        }
lbl15:
                        // 2 sources

                        while (true) {
                            var3_5 = 5;
                            break block16;
                            break;
                        }
                    }
lbl19:
                    // 2 sources

                    while (true) {
                        var3_5 = 2;
                        break block16;
                        break;
                    }
                }
                switch (var2_3.getSubtype()) {
                    case 13: {
                        ** continue;
                    }
                    case 18: {
                        ** continue;
                    }
                    default: {
                        var3_5 = 6;
                        break;
                    }
                    case 20: {
                        if (agf.a >= 29) {
                            var3_5 = 9;
                            break;
                        }
                        break block16;
                    }
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: 
                    case 7: 
                    case 8: 
                    case 9: 
                    case 10: 
                    case 11: 
                    case 12: 
                    case 14: 
                    case 15: 
                    case 17: {
                        var3_5 = 4;
                        break;
                    }
                    case 1: 
                    case 2: {
                        var3_5 = 3;
                        break;
                    }
                }
                break block16;
            }
            var3_5 = 1;
        }
lbl46:
        // 2 sources

        while (true) {
            if (agf.a >= 31 && var3_5 == 5) {
                var2_3 = this.a;
                try {
                    var5_7 = (TelephonyManager)var1_1.getSystemService("phone");
                    abr.i(var5_7);
                    var6_8 = new afy((jle)var2_3);
                    ut$$ExternalSyntheticApiModelOutline0.m(var5_7, fs$$ExternalSyntheticApiModelOutline0.m(var1_1), var6_8);
                    ut$$ExternalSyntheticApiModelOutline0.m(var5_7, var6_8);
                    return;
                }
                catch (RuntimeException var1_2) {
                    var2_3.f(5);
                    return;
                }
            }
            this.a.f(var3_5);
            return;
        }
    }
}

