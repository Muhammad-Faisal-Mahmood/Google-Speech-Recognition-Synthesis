/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.StatFs
 *  android.util.Pair
 */
import android.content.Context;
import android.net.Uri;
import android.os.StatFs;
import android.util.Pair;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class cyg
implements hny {
    public final ctq a;
    public final int b;
    public final long c;
    public final String d;
    public final Uri e;
    public final String f;
    public final int g;
    public final ctj h;
    public final int i;
    public final List j;
    public final hvi k;
    public final dmu l;

    public /* synthetic */ cyg(dmu dmu2, ctq ctq2, int n2, long l2, String string, Uri uri, String string2, int n3, ctj ctj2, int n4, List list, hvi hvi2) {
        this.l = dmu2;
        this.a = ctq2;
        this.b = n2;
        this.c = l2;
        this.d = string;
        this.e = uri;
        this.f = string2;
        this.g = n3;
        this.h = ctj2;
        this.i = n4;
        this.j = list;
        this.k = hvi2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn a(Object var1_1) {
        block52: {
            block47: {
                block48: {
                    block50: {
                        block49: {
                            var1_1 = (Void)var1_1;
                            var22_6 = this.e;
                            var1_1 = this.l;
                            var21_7 = this.f;
                            if (var21_7.startsWith("http") && ins.a.b().g() && !var21_7.startsWith("https")) {
                                cyr.h("%s: File url = %s is not secure", "MddFileDownloader", var21_7);
                                var1_1 = css.a();
                                var1_1.b = csr.s;
                                return hhk.J(var1_1.a());
                            }
                            try {
                                var10_8 = ((bmu)var1_1.a).u((Uri)var22_6);
                            }
                            catch (IOException var23_9) {
                                var10_8 = 0L;
                            }
                            var24_11 = var1_1.h;
                            var12_12 = (long)this.g - var10_8;
                            var20_13 = ins.a.b().h();
                            var23_10 = this.h;
                            var8_14 = -1;
                            if (!var20_13) break block47;
                            var25_15 = new hdq("inlinefile");
                            if (cqq.ab((String)var21_7, (hav)var25_15) && var12_12 == 0L) break block47;
                            var25_15 = new StatFs(((Context)var24_11).getFilesDir().getAbsolutePath());
                            var10_8 = var25_15.getBlockCount();
                            var18_16 = var25_15.getBlockSize();
                            var16_17 = var25_15.getAvailableBlocks();
                            var14_18 = var25_15.getBlockSize();
                            var6_19 = var10_8 * var18_16;
                            var2_21 = var4_20 = (double)Math.min(cqq.m() * var6_19, (float)((int)ins.a.b().b()));
                            if (var23_10 == null) break block48;
                            var7_23 = var9_22 = a.t(var23_10.c);
                            if (var9_22 == 0) {
                                var7_23 = 1;
                            }
                            if (--var7_23 == 1) ** GOTO lbl46
                            if (var7_23 == 2) break block49;
                            var2_21 = var4_20;
                            break block48;
                        }
                        var6_19 = Math.min(var6_19 * cqq.m(), (float)((int)ins.a.b().c()));
                        break block50;
lbl46:
                        // 1 sources

                        var6_19 = Math.min(var6_19 * cqq.m(), (float)((int)ins.a.b().d()));
                    }
                    var2_21 = var6_19;
                }
                if (!((double)(var16_17 * var14_18 - var12_12) > var2_21)) {
                    var1_1 = css.a();
                    var1_1.b = csr.t;
                    throw var1_1.a();
                }
            }
            var24_11 = this.a;
            if (cqq.n()) {
                var25_15 = var1_1.g;
                var26_24 = var1_1.i;
                var27_25 = ctl.a.l();
                if (!var27_25.b.B()) {
                    var27_25.u();
                }
                var29_26 = var27_25.b;
                var28_27 = (ctl)var29_26;
                var24_11.getClass();
                var28_27.c = var24_11;
                var28_27.b |= 1;
                if (!var29_26.B()) {
                    var27_25.u();
                }
                var10_8 = this.c;
                var28_27 = var27_25.b;
                var29_26 = var28_27;
                var29_26.b |= 2;
                var29_26.d = var10_8;
                if (!var28_27.B()) {
                    var27_25.u();
                }
                var28_27 = this.d;
                var30_28 = var27_25.b;
                var29_26 = (ctl)var30_28;
                var28_27.getClass();
                var29_26.b |= 4;
                var29_26.e = var28_27;
                if (!var30_28.B()) {
                    var27_25.u();
                }
                var7_23 = this.b;
                var28_27 = (ctl)var27_25.b;
                var28_27.b |= 8;
                var28_27.f = var7_23;
                var29_26 = (ctl)var27_25.o();
                var27_25 = ((dad)var25_15).b;
                synchronized (var27_25) {
                    if (!((dad)var25_15).c.containsKey(var29_26)) {
                        var28_27 = ((dad)var25_15).c;
                        var31_29 = new dac(((dad)var25_15).a, (cys)var26_24, (ctl)var29_26);
                        Objects.requireNonNull(((dad)var25_15).e);
                        var26_24 = new dab(0);
                        var30_28 = new fqn(var31_29, (fql)var26_24, 10L, TimeUnit.SECONDS);
                        var28_27.put(var29_26, var30_28);
                    }
                    ((dad)var25_15).d.put(var22_6, (fqn)((dad)var25_15).c.get(var29_26));
                }
            } else {
                cyr.m("%s: NetworkUsageMonitor is disabled", "MddFileDownloader");
            }
            if (((gto)var1_1.b).g()) {
                var25_15 = (daa)((gto)var1_1.b).c();
                var24_11 = var24_11.c;
                synchronized (daa.class) {
                    var25_15.b.put(var22_6, var24_11);
                }
            }
            var24_11 = new dbw(null, null);
            var24_11.i(-1);
            var7_23 = gzx.d;
            var24_11.h(hct.a);
            var24_11.f(hvi.a);
            if (var22_6 == null) throw new NullPointerException("Null fileUri");
            var24_11.d = var22_6;
            if (var21_7 == null) throw new NullPointerException("Null urlToDownload");
            var24_11.a = var21_7;
            if (var23_10 != null && (var7_23 = a.t(var23_10.d)) != 0 && var7_23 == 2) {
                var24_11.g(cuz.c);
            } else {
                var24_11.g(cuz.b);
            }
            var7_23 = this.i;
            if (var7_23 > 0) {
                var24_11.i(var7_23);
            }
            var22_6 = this.j;
            var21_7 = new gzs();
            var22_6 = var22_6.iterator();
            while (var22_6.hasNext()) {
                var23_10 = (ctk)var22_6.next();
                var21_7.h(Pair.create((Object)var23_10.b, (Object)var23_10.c));
            }
            var22_6 = this.k;
            var24_11.h(var21_7.g());
            var24_11.f((hvi)var22_6);
            var21_7 = (czh)var1_1.f.a();
            var1_1 = var24_11.a;
            if (var1_1 == null) throw new IllegalStateException("Property \"urlToDownload\" has not been set");
            if (var1_1.startsWith("inlinefile")) {
                fxf.r(false, "InlineDownloadParams must be set when using inlinefile: scheme");
                var24_11.g(cuz.a);
            }
            if (var24_11.c != 1 || (var22_6 = var24_11.d) == null || (var1_1 = var24_11.a) == null || (var23_10 = var24_11.e) == null || (var25_15 = var24_11.f) == null || (var26_24 = var24_11.h) == null) break block52;
            var7_23 = var24_11.b;
            var24_11 = (gto)var24_11.g;
            var26_24 = (hvi)var26_24;
            var25_15 = (gzx)var25_15;
            var23_10 = (cuz)var23_10;
            var22_6 = new cva((Uri)var22_6, (String)var1_1, (cuz)var23_10, var7_23, (gzx)var25_15, (gto)var24_11, (hvi)var26_24);
            var23_10 = var22_6.a.getLastPathSegment();
            fxf.K(var23_10);
            try {
                block51: {
                    block54: {
                        block53: {
                            var24_11 = var21_7.b;
                            var1_1 = var22_6.a;
                            var25_15 = var1_1.getScheme();
                            var7_23 = var25_15.hashCode();
                            if (var7_23 == -861391249) break block53;
                            if (var7_23 != 3143036) {
                                var7_23 = var8_14;
                                break block54;
                            } else {
                                var7_23 = var8_14;
                                if (var25_15.equals("file")) {
                                    var7_23 = 1;
                                }
                            }
                            break block54;
                        }
                        var7_23 = var8_14;
                        if (var25_15.equals("android")) {
                            var7_23 = 0;
                        }
                    }
                    if (var7_23 != 0) {
                        if (var7_23 == 1) {
                            var1_1 = fvc.I((Uri)var1_1);
                            break block51;
                        } else {
                            var21_7 = new fpz("Couldn't convert URI to path: ".concat(String.valueOf(String.valueOf(var1_1))));
                            throw var21_7;
                        }
                    }
                    var1_1 = fvc.L((Uri)var1_1, (Context)var24_11);
                }
                var1_1 = var1_1.getParentFile();
            }
            catch (IOException var1_4) {
                cyr.h("%s: The file uri is malformed, uri = %s", "OffroadFileDownloader", var22_6.a);
                var21_7 = css.a();
                var21_7.b = csr.x;
                var21_7.d = var1_4;
                return hhk.J(var21_7.a());
            }
            fxf.K(var1_1);
            try {
                var24_11 = var21_7.d;
                var25_15 = var22_6.a;
                var26_24 = new fqk(0);
                var24_11 = (djm)((bmu)var24_11).w((Uri)var25_15, (fpp)var26_24);
            }
            catch (IOException var1_3) {
                cyr.j(var1_3, "%s: Unable to create mobstore ResponseWriter for file %s", new Object[]{"OffroadFileDownloader", var22_6.a});
                var21_7 = css.a();
                var21_7.b = csr.y;
                var21_7.d = var1_3;
                return hhk.J(var21_7.a());
            }
            return kl.o(new cvd((czh)var21_7, (cva)var22_6, (File)var1_1, (String)var23_10, (djm)var24_11, 0));
        }
        var1_1 = new StringBuilder();
        if (var24_11.d == null) {
            var1_1.append(" fileUri");
        }
        if (var24_11.a == null) {
            var1_1.append(" urlToDownload");
        }
        if (var24_11.e == null) {
            var1_1.append(" downloadConstraints");
        }
        if (var24_11.c == 0) {
            var1_1.append(" trafficTag");
        }
        if (var24_11.f == null) {
            var1_1.append(" extraHttpHeaders");
        }
        if (var24_11.h != null) throw new IllegalStateException("Missing required properties:".concat(var1_1.toString()));
        var1_1.append(" customDownloaderMetadata");
        throw new IllegalStateException("Missing required properties:".concat(var1_1.toString()));
        catch (css var1_5) {
            cyr.h("%s: Not enough space to download file %s", "MddFileDownloader", var21_7);
            return hhk.J(var1_5);
        }
    }
}

