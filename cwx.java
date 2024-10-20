/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

public final class cwx
implements hny {
    public final cwz a;
    public final cth b;
    public final ctq c;
    public final hny d;

    public /* synthetic */ cwx(cwz cwz2, cth cth2, ctq ctq2, hny hny2) {
        this.a = cwz2;
        this.b = cth2;
        this.c = ctq2;
        this.d = hny2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final hpn a(Object var1_1) {
        block51: {
            block58: {
                block50: {
                    block57: {
                        block49: {
                            block56: {
                                block55: {
                                    block54: {
                                        block53: {
                                            var1_1 = (Void)var1_1;
                                            var7_6 = this.b;
                                            var5_7 = var7_6.d.isEmpty();
                                            var9_8 = this.d;
                                            var8_9 = this.a;
                                            if (!var5_7) break block53;
                                            cyr.g("%s Group name missing in added group", "DataFileGroupValidator");
                                            break block49;
                                        }
                                        if (!var7_6.d.contains("|")) break block54;
                                        cyr.h("%s Group name = %s contains '|'", "DataFileGroupValidator", var7_6.d);
                                        break block49;
                                    }
                                    if (!var7_6.e.contains("|")) break block55;
                                    cyr.h("%s Owner package = %s contains '|'", "DataFileGroupValidator", var7_6.e);
                                    break block49;
                                }
                                for (Object var11_15 : var7_6.o) {
                                    if (!var11_15.c.isEmpty() && !var11_15.c.contains("|")) {
                                        var2_11 = (cqq.aa((ctf)var11_15) != false ? (var11_15.b & 64) != 0 && var11_15.i.isEmpty() == false : (var11_15.b & 16) != 0 && var11_15.g.isEmpty() == false) ? 1 : 0;
                                        var3_12 = var4_13 = a.w(var11_15.f);
                                        if (var4_13 == 0) {
                                            var3_12 = 1;
                                        }
                                        var3_12 = var3_12 - 1 != 0 ? var2_11 ^ 1 : var2_11;
                                        var2_11 = cqq.aa((ctf)var11_15) != false && var2_11 == 0 ? 1 : 0;
                                        var4_13 = a.w(var11_15.n);
                                        if (var4_13 == 0) {
                                            while (true) {
                                                var4_13 = 1;
                                                break;
                                            }
                                        } else {
                                            if (var4_13 != 2 || !var11_15.o.isEmpty()) ** continue;
                                            var4_13 = 0;
                                        }
                                        if (!(var11_15.d.isEmpty() || var11_15.d.contains("|") || var11_15.e < 0 || (var2_11 | var3_12) == 0 || var4_13 == 0 || cqq.Z((ctf)var11_15).contains("|"))) {
                                            if ((var11_15.b & 32) != 0) {
                                                var1_1 = var6_14 = var11_15.h;
                                                if (var6_14 == null) {
                                                    var1_1 = ikm.a;
                                                }
                                                if (!cqq.w((ikm)var1_1)) break block49;
                                                var12_16 = var7_6.d;
                                                if (cqq.aa((ctf)var11_15)) {
                                                    if (!inw.a.b().o()) {
                                                        cyr.h("Feature enableZipFolder is not enabled. Group = %s, file id = %s", var12_16, var11_15.c);
                                                        break block49;
                                                    }
                                                    var1_1 = var6_14 = var11_15.h;
                                                    if (var6_14 == null) {
                                                        var1_1 = ikm.a;
                                                    }
                                                    if (var1_1.b.size() > 1) {
                                                        cyr.h("Download zip folder transform cannot not be applied with other transforms. Group = %s, file id = %s", var12_16, var11_15.c);
                                                        break block49;
                                                    }
                                                    var1_1 = var6_14 = var11_15.h;
                                                    if (var6_14 == null) {
                                                        var1_1 = ikm.a;
                                                    }
                                                    var1_1 = (ikl)var1_1.b.get(0);
                                                    var1_1 = var1_1.b == 4 ? (ikn)var1_1.c : ikn.a;
                                                    if (!"*".equals(var1_1.c)) {
                                                        cyr.h("Download zip folder transform can only have * as target. Group = %s, file id = %s", var12_16, var11_15.c);
                                                        break block49;
                                                    }
                                                }
                                                if (((var2_11 = a.w(var11_15.f)) == 0 || var2_11 != 2) && (var11_15.b & 64) == 0) {
                                                    cyr.h("Download checksum must be provided. Group = %s, file id = %s", var7_6.d, var11_15.c);
                                                    break block49;
                                                }
                                            }
                                            if ((var11_15.b & 256) != 0) {
                                                var1_1 = var6_14 = var11_15.k;
                                                if (var6_14 == null) {
                                                    var1_1 = ikm.a;
                                                }
                                                if (!cqq.w((ikm)var1_1)) break block49;
                                            }
                                            var12_16 = var7_6.d;
                                            for (cti var14_18 : var11_15.l) {
                                                if (!(var14_18.c.isEmpty() || var14_18.c.contains("|") || (var14_18.b & 2) == 0 || var14_18.d < 0 || var14_18.e.isEmpty() || var14_18.e.contains("|") || ((var2_11 = var14_18.b) & 8) == 0 || (var3_12 = a.w(var14_18.f)) == 0 || var3_12 == 1 || (var2_11 & 16) == 0)) {
                                                    var1_1 = var6_14 = var14_18.g;
                                                    if (var6_14 == null) {
                                                        var1_1 = cte.a;
                                                    }
                                                    if (!var1_1.b.isEmpty()) {
                                                        var1_1 = var6_14 = var14_18.g;
                                                        if (var6_14 == null) {
                                                            var1_1 = cte.a;
                                                        }
                                                        if (!var1_1.b.contains("|")) continue;
                                                    }
                                                }
                                                cyr.i("%s Delta File of Datafile details missing in added group = %s, file id = %s, delta file UrlToDownload = %s.", new Object[]{"DataFileGroupValidator", var12_16, var11_15.c, var14_18.c});
                                                break block49;
                                            }
                                            if (!cqq.ae((ctf)var11_15) || inw.a.b().n()) continue;
                                            cyr.i("%s File detected as sideloaded, but sideloading is not enabled. group = %s, file id = %s, file url = %s", new Object[]{"DataFileGroupValidator", var7_6.d, var11_15.c, var11_15.d});
                                            break block49;
                                        }
                                    }
                                    cyr.i("%s File details missing in added group = %s, file id = %s", new Object[]{"DataFileGroupValidator", var7_6.d, var11_15.c});
                                    break block49;
                                }
                                var2_11 = 0;
                                while (var2_11 < var7_6.o.size()) {
                                    for (var4_13 = var3_12 = var2_11 + 1; var4_13 < var7_6.o.size(); ++var4_13) {
                                        if (!((ctf)var7_6.o.get((int)var2_11)).c.equals(((ctf)var7_6.o.get((int)var4_13)).c)) continue;
                                        cyr.i("%s Repeated file id in added group = %s, file id = %s", new Object[]{"DataFileGroupValidator", var7_6.d, ((ctf)var7_6.o.get((int)var2_11)).c});
                                        break block49;
                                    }
                                    var2_11 = var3_12;
                                }
                                var1_1 = var6_14 = var7_6.m;
                                if (var6_14 == null) {
                                    var1_1 = ctj.a;
                                }
                                if ((var2_11 = a.t(var1_1.d)) == 0 || var2_11 != 3) break block56;
                                var1_1 = var6_14 = var7_6.m;
                                if (var6_14 == null) {
                                    var1_1 = ctj.a;
                                }
                                if (var1_1.e > 0L) break block56;
                                cyr.g("%s For DOWNLOAD_FIRST_ON_WIFI_THEN_ON_ANY_NETWORK policy, the download_first_on_wifi_period_secs must be > 0", "DataFileGroupValidator");
                                break block49;
                            }
                            if (cqq.s(var8_9.b) || (var2_11 = a.t(var7_6.j)) == 0 || var2_11 != 3) break block57;
                            cyr.g("%s For AllowedReaders ALL_APPS policy, the device should be migrated to new key", "DataFileGroupValidator");
                        }
                        var8_9.m.e(1020, var7_6.d, var7_6.f, var7_6.s, var7_6.t);
                        var1_1 = hhk.K(false);
                        break block51;
                    }
                    var1_1 = var7_6.o;
                    var6_14 = var1_1.iterator();
                    while (var6_14.hasNext()) {
                        var2_11 = a.w(((ctf)var6_14.next()).f);
                        if (var2_11 == 0 || var2_11 != 2) continue;
                        var6_14 = gzx.g(var1_1.size());
                        var11_15 = var1_1.iterator();
                        while (var11_15.hasNext()) {
                            var12_16 = (ctf)var11_15.next();
                            var2_11 = var3_12 = a.w(var12_16.f);
                            if (var3_12 == 0) {
                                var2_11 = 1;
                            }
                            if (var2_11 - 1 != 0) {
                                var10_10 = (hwp)var12_16.C(5);
                                var10_10.x((hwv)var12_16);
                                var13_17 = var12_16.d;
                                var1_1 = cye.b();
                                if (var1_1 == null) {
                                    var1_1 = "";
                                } else {
                                    var13_17 = (Iterator<E>)var13_17.getBytes();
                                    var1_1.update((byte[])var13_17, 0, ((Iterator<E>)var13_17).length);
                                    var1_1 = cye.a(var1_1.digest());
                                }
                                if (cqq.aa((ctf)var12_16)) {
                                    if (!var10_10.b.B()) {
                                        var10_10.u();
                                    }
                                    var12_16 = (ctf)var10_10.b;
                                    var12_16.b |= 64;
                                    var12_16.i = var1_1;
                                } else {
                                    if (!var10_10.b.B()) {
                                        var10_10.u();
                                    }
                                    var12_16 = (ctf)var10_10.b;
                                    var12_16.b |= 16;
                                    var12_16.g = var1_1;
                                }
                                var1_1 = (ctf)var10_10.b;
                                cyr.d("FileId %s does not have checksum. Generated checksum from url %s", var1_1.c, var1_1.g);
                                var6_14.h((ctf)var10_10.o());
                                continue;
                            }
                            var6_14.h(var12_16);
                        }
                        var1_1 = var6_14.g();
                        break block50;
                    }
                    var1_1 = gzx.o((Collection)var1_1);
                }
                var6_14 = (hwp)var7_6.C(5);
                var6_14.x((hwv)var7_6);
                if (!var6_14.b.B()) {
                    var6_14.u();
                }
                ((cth)var6_14.b).o = hyp.b;
                if (!var6_14.b.B()) {
                    var6_14.u();
                }
                var10_10 = (cth)var6_14.b;
                var7_6 = var10_10.o;
                if (!var7_6.c()) {
                    var10_10.o = hwv.s((hxk)var7_6);
                }
                hvc.g((Iterable)var1_1, var10_10.o);
                var12_16 = (cth)var6_14.o();
                var11_15 = var8_9.c;
                var5_7 = cqq.af(cqq.V((cth)var12_16));
                var10_10 = this.c;
                if (var5_7) ** GOTO lbl197
                if (!var11_15.t(var10_10.d)) ** GOTO lbl193
                var1_1 = var6_14 = hhk.K(null);
                if (!inw.a.b().h()) ** GOTO lbl201
                var1_1 = var7_6 = var12_16.m;
                if (var7_6 != null) ** GOTO lbl182
                var1_1 = ctj.a;
lbl182:
                // 2 sources

                if ((var2_11 = a.w(var1_1.f)) != 0) break block58;
                var1_1 = var6_14;
                ** GOTO lbl201
            }
            var1_1 = var6_14;
            if (var2_11 != 2) ** GOTO lbl201
            try {
                block59: {
                    var1_1 = var11_15.c.h((ctq)var10_10);
                    var6_14 = new cwd(var11_15, (ctq)var10_10, (cth)var12_16, 0);
                    var1_1 = var11_15.q((hpn)var1_1, (hny)var6_14);
                    break block59;
lbl193:
                    // 1 sources

                    cyr.i("%s: Trying to add group %s for uninstalled app %s.", new Object[]{"FileGroupManager", var10_10.c, var10_10.d});
                    cwj.z(1042, var11_15.i, (cth)var12_16);
                    var1_1 = new cxq();
                    throw var1_1;
lbl197:
                    // 1 sources

                    cyr.h("%s: Trying to add expired group %s.", "FileGroupManager", var10_10.c);
                    cwj.z(1048, var11_15.i, (cth)var12_16);
                    var1_1 = new cvr();
                    throw var1_1;
                }
                var6_14 = dah.e((hpn)var1_1);
                var1_1 = new cwd(var11_15, (ctq)var10_10, (cth)var12_16, 2);
                var6_14 = var6_14.g((hny)var1_1, var11_15.e);
                var1_1 = new cwd(var11_15, (ctq)var10_10, (cth)var12_16, 3);
                var1_1 = dah.e(var6_14.g((hny)var1_1, var11_15.e));
                var6_14 = new cwd((Object)var8_9, (hwv)var10_10, (Object)var9_8, 19);
                var1_1 = var1_1.g((hny)var6_14, var8_9.i);
                var6_14 = new cwt(0);
                var1_1 = var1_1.f((gte)var6_14, var8_9.i);
                break block51;
            }
            catch (IOException var1_2) {
                cyr.h("%s %s", "MDDManager", var1_2.getClass());
                var8_9.f.a();
                var1_1 = hhk.J(var1_2);
                break block51;
            }
            catch (cvi var1_3) {
            }
            catch (cxq var1_4) {
            }
            catch (cvr var1_5) {
                // empty catch block
            }
            cyr.n("%s %s", "MDDManager", var1_1.getClass());
            var1_1 = hhk.J((Throwable)var1_1);
        }
        return var1_1;
    }
}

