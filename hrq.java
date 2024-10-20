/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageManager
 */
import android.content.pm.PackageManager;

public final class hrq
extends iyx {
    final PackageManager a;
    final hav b;
    final cch c;

    public hrq(PackageManager packageManager, hav hav2, cch cch2) {
        this.a = packageManager;
        this.b = hav2;
        this.c = cch2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final iyh a(int var1_1) {
        block6: {
            block7: {
                var4_2 = this.a.getPackagesForUid(var1_1);
                if (var4_2 == null) break block7;
                var3_3 = 0;
                for (var2_4 = 0; var2_4 < ((String[])var4_2).length; ++var2_4) {
                    block5: {
                        if (!this.b.contains(var4_2[var2_4])) continue;
                        var7_5 = this.c;
                        var6_6 = var7_5.a.getPackageManager().getPackagesForUid(var1_1);
                        var4_2 = null;
                        if (var6_6 == null) ** GOTO lbl-1000
                        var2_4 = var6_6.length;
                        if (var2_4 != 0) {
                            for (var1_1 = var3_3; var1_1 < var2_4; ++var1_1) {
                                var5_7 = var7_5.a(var6_6[var1_1]);
                                var4_2 = var5_7;
                                if (!var5_7.b) {
                                    var4_2 = var5_7;
                                    continue;
                                }
                                break block5;
                            }
                            kl.at(var4_2);
                        } else lbl-1000:
                        // 2 sources

                        {
                            var4_2 = new ccd(false, null);
                        }
                    }
                    var4_2.b();
                    if (!var4_2.b) break;
                    var4_2 = iyh.b;
                    break block6;
                }
            }
            var4_2 = iyh.f.e("Rejected by (1st-party only Allowlist) security policy");
        }
        return var4_2;
    }
}

