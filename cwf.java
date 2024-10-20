/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.io.IOException;
import java.util.List;

public final class cwf
implements hny {
    public final boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    private final int e;

    public /* synthetic */ cwf(Object object, boolean bl2, Object object2, Object object3, int n2) {
        this.e = n2;
        this.b = object;
        this.a = bl2;
        this.c = object2;
        this.d = object3;
    }

    public /* synthetic */ cwf(List list, boolean bl2, bmu bmu2, hwp hwp2, int n2) {
        this.e = n2;
        this.d = list;
        this.a = bl2;
        this.c = bmu2;
        this.b = hwp2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final hpn a(Object var1_1) {
        block31: {
            block30: {
                block28: {
                    block29: {
                        block25: {
                            var2_3 = this.e;
                            if (var2_3 == 0) break block29;
                            if (var2_3 != 1) {
                                var11_4 = (Throwable)var1_1;
                                var1_1 = this.c;
                                if (this.a) {
                                    var10_7 = this.d;
                                    ((dhz)this.b).a((ddu)var1_1, var10_7);
                                }
                                ((hfk)((hfk)((hfk)ddd.a.g()).i(var11_4)).j("com/google/android/libraries/micore/superpacks/scheduling/DownloadJob", "onStartJob", 109, "DownloadJob.java")).u("DownloadJob#onStartJob: failure for %s", var1_1);
                                return hhk.K(null);
                            }
                            var12_10 = (hac)var1_1;
                            var1_1 = this.d;
                            var11_5 = this.c;
                            var13_11 = var1_1.iterator();
                            while (var13_11.hasNext()) {
                                block27: {
                                    block26: {
                                        var1_1 = (ctf)var13_11.next();
                                        if (!var12_10.containsKey(var1_1)) {
                                            var1_1 = css.a();
                                            var1_1.b = csr.A;
                                            var1_1.c = "getDataFileUris() resolved to null";
                                            var1_1 = hhk.J(var1_1.a());
                                            break block25;
                                        }
                                        var14_15 = (Uri)var12_10.get(var1_1);
                                        var4_13 = cqq.aa((ctf)var1_1);
                                        var15_16 = this.b;
                                        if (!var4_13 || this.a) ** GOTO lbl41
                                        if (!((bmu)var11_5).C(var14_15)) ** GOTO lbl41
                                        var1_1 = var14_15.getPath();
                                        if (var1_1 == null) continue;
                                        var1_1 = cuq.p((bmu)var11_5, var14_15, (String)var1_1);
                                        if (!((hwp)var15_16).b.B()) {
                                            ((hwp)var15_16).u();
                                        }
                                        var10_8 = (csg)((hwp)var15_16).b;
                                        var15_16 = csg.a;
                                        var10_8.b();
                                        hvc.g((Iterable)var1_1, var10_8.h);
                                        continue;
lbl41:
                                        // 2 sources

                                        var16_17 = var1_1.c;
                                        var3_12 = var1_1.e;
                                        var2_3 = var1_1.j;
                                        var17_18 = var14_15.toString();
                                        if ((var1_1.b & 8192) == 0) break block26;
                                        var10_8 = var1_1.q;
                                        var1_1 = var10_8;
                                        if (var10_8 != null) break block27;
                                        var1_1 = hvi.a;
                                        break block27;
                                    }
                                    var1_1 = null;
                                }
                                try {
                                    var1_1 = cuq.j(var16_17, var3_12, var2_3, var17_18, (hvi)var1_1, true);
                                    ((hwp)var15_16).A((csf)var1_1);
                                }
                                catch (IOException var1_2) {
                                    cyr.q(var1_2, "Failed to list files under directory:".concat(String.valueOf(String.valueOf(var14_15))));
                                }
                            }
                            var1_1 = hpj.a;
                        }
                        return var1_1;
                    }
                    if ((var1_1 = (cth)var1_1) == null || (var2_3 = cqq.y(var1_1.r)) != 0 && var2_3 != 1) break block30;
                    var10_9 = var11_6 = var1_1.m;
                    if (var11_6 == null) {
                        var10_9 = ctj.a;
                    }
                    if ((var2_3 = a.t(var10_9.d)) != 0 && var2_3 == 2) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var4_14 = true;
                            break block28;
                            break;
                        }
                    }
                    var10_9 = var11_6 = var1_1.m;
                    if (var11_6 == null) {
                        var10_9 = ctj.a;
                    }
                    if ((var2_3 = a.t(var10_9.d)) == 0) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            var4_14 = false;
                            break block28;
                            break;
                        }
                    }
                    if (var2_3 != 3) ** GOTO lbl-1000
                    var6_19 = cqq.x();
                    var10_9 = var11_6 = var1_1.c;
                    if (var11_6 == null) {
                        var10_9 = ctg.a;
                    }
                    var8_20 = var10_9.d;
                    var10_9 = var11_6 = var1_1.m;
                    if (var11_6 == null) {
                        var10_9 = ctj.a;
                    }
                    if ((var6_19 - var8_20) / 1000L > var10_9.e) ** break;
                    ** while (true)
                    var11_6 = (hwp)var1_1.C(5);
                    var11_6.x((hwv)var1_1);
                    var1_1 = var10_9 = var1_1.m;
                    if (var10_9 == null) {
                        var1_1 = ctj.a;
                    }
                    var10_9 = (hwp)var1_1.C(5);
                    var10_9.x((hwv)var1_1);
                    if (!var10_9.b.B()) {
                        var10_9.u();
                    }
                    var1_1 = (ctj)var10_9.b;
                    var1_1.d = 1;
                    var1_1.b |= 2;
                    if (!var11_6.b.B()) {
                        var11_6.u();
                    }
                    var1_1 = (cth)var11_6.b;
                    var10_9 = (ctj)var10_9.o();
                    var10_9.getClass();
                    var1_1.m = var10_9;
                    var1_1.b |= 2048;
                    var1_1 = (cth)var11_6.o();
                    ** while (true)
                }
                var5_21 = this.a;
                cyr.e("%s: Try to download pending file group: %s, download over cellular = %s", new Object[]{"FileGroupManager", var1_1.d, var4_14});
                if (!var5_21 && !var4_14) {
                    var1_1 = hhk.K(null);
                } else {
                    var1_1 = var10_9 = var1_1.m;
                    if (var10_9 == null) {
                        var1_1 = ctj.a;
                    }
                    var10_9 = this.d;
                    var11_6 = this.c;
                    var1_1 = ((cwj)this.b).e((ctq)var11_6, (ctj)var1_1, (hny)var10_9);
                }
                break block31;
            }
            var1_1 = hhk.K(null);
        }
        return var1_1;
    }
}

