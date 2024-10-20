/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.util.Log
 *  hom
 */
import android.net.Uri;
import android.util.Log;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class etv
extends jsf
implements jrk {
    final Object a;
    private final int b;

    public etv(int n2) {
        this.b = n2;
        this.a = "";
        super(1);
    }

    public etv(int n2, byte[] byArray) {
        this.b = n2;
        this.a = "    ";
        super(1);
    }

    public etv(Object object, int n2) {
        this.b = n2;
        this.a = object;
        super(1);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final /* synthetic */ Object a(Object var1_1) {
        var2_3 = this.b;
        var7_4 = "";
        var6_5 = null;
        var5_6 = true;
        var4_7 = true;
        switch (var2_3) {
            default: {
                var1_1 = (Throwable)var1_1;
                this.a.cancel(false);
                return jon.a;
            }
            case 19: {
                var1_1 = (Throwable)var1_1;
                this.a.bD(jon.a);
                return jon.a;
            }
            case 18: {
                var1_1 = (jsw)var1_1;
                jse.e(var1_1, "it");
                return jse.y((CharSequence)this.a, (jsw)var1_1);
            }
            case 17: {
                var1_1 = (String)var1_1;
                jse.e(var1_1, "it");
                if (jse.C((CharSequence)var1_1)) {
                    var2_3 = var1_1.length();
                    if (var2_3 < ((String)(var6_5 = this.a)).length()) {
                        return var6_5;
                    }
                } else {
                    var6_5 = this.a;
                    var1_1 = String.valueOf(var1_1);
                    var1_1 = ((String)var6_5).concat((String)var1_1);
                }
                return var1_1;
            }
            case 16: {
                var1_1 = (String)var1_1;
                jse.e(var1_1, "line");
                var1_1 = String.valueOf(var1_1);
                return ((String)this.a).concat((String)var1_1);
            }
            case 15: {
                var1_1 = var1_1 == this.a ? "(this Collection)" : String.valueOf(var1_1);
                return var1_1;
            }
            case 14: {
                var1_1 = (Exception)var1_1;
                jse.e(var1_1, "it");
                ((heg)((heg)((ghl)this.a).f.h()).i((Throwable)var1_1).j("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner$tryPurgeOldVersions$2", "invoke", 258, "StartupAfterPackageReplacedWithRetryRunner.kt")).r("Failed to purge old versions");
                return hpj.a;
            }
            case 13: {
                var1_1 = (Void)var1_1;
                var7_4 = new StringBuilder();
                var8_8 = new ArrayList<Long>();
                var7_4.append("SELECT * FROM ListenerSuccessfulRuns WHERE version_code = ?");
                var1_1 = this.a;
                var6_5 = (ghl)var1_1;
                var8_8.add(Long.valueOf(var6_5.d));
                var7_4 = fvc.R((StringBuilder)var7_4, var8_8);
                return new gre(var6_5.a().X((hth)var7_4)).a(new ghj(ghk.a, 0), var6_5.c).b().e(Exception.class, new ggk(new etv(var1_1, 10), 4), (Executor)hom.a);
            }
            case 12: {
                var1_1 = (Boolean)var1_1;
                jse.e(var1_1, "allSucceeded");
                if (var1_1.booleanValue()) {
                    var6_5 = (ghl)this.a;
                    var8_9 = var6_5.a();
                    var7_4 = new StringBuilder();
                    var1_1 = new ArrayList<E>();
                    var7_4.append("INSERT INTO AllListenersSucceededVersionTable (version_code) VALUES (?)");
                    var1_1.add(Long.valueOf(var6_5.d));
                    var1_1 = var8_9.Y(fvc.R((StringBuilder)var7_4, (ArrayList)var1_1));
                    jse.d(var1_1, "execSql(...)");
                } else {
                    var1_1 = hpj.a;
                }
                return var1_1;
            }
            case 11: {
                var1_1 = (Boolean)var1_1;
                jse.e(var1_1, "allSucceeded");
                if (var1_1.booleanValue()) {
                    var1_1 = hpj.a;
                } else {
                    var7_4 = this.a;
                    var1_1 = (ghl)var7_4;
                    var2_3 = var1_1.d;
                    var8_10 = var1_1.a();
                    var6_5 = new ghh(var2_3);
                    var1_1 = fxf.ak(fxf.ak(fxf.ak(fxf.af(((fsi)var8_10.a).b().b(gqk.e(new frw(var6_5, 2)), (Executor)hom.a).i(), Exception.class, new ghi(new etv(var7_4, 14), 1), (Executor)hom.a), new frm(new etv(var7_4, 13), 18), var1_1.b), new frm(new ezq(var7_4, var1_1.h, 7), 19), var1_1.b), new frm(new etv(var7_4, 12), 20), var1_1.b);
                }
                return var1_1;
            }
            case 10: {
                var1_1 = (Exception)var1_1;
                jse.e(var1_1, "it");
                ((heg)((heg)((ghl)this.a).f.h()).i((Throwable)var1_1).j("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner$getListenersPreviouslySucceededAtThisVersion$v$2", "invoke", 299, "StartupAfterPackageReplacedWithRetryRunner.kt")).r("Failed to get listeners previously succeeded at this version");
                return jpa.a;
            }
            case 9: {
                var1_1 = (Exception)var1_1;
                jse.e(var1_1, "it");
                ((heg)((heg)((ghl)this.a).f.h()).i((Throwable)var1_1).j("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner$didAllListenersAlreadySucceed$2", "invoke", 346, "StartupAfterPackageReplacedWithRetryRunner.kt")).r("Failed to get all listeners succeeded at this version");
                return false;
            }
            case 8: {
                var6_5 = (gft)var1_1;
                jse.e(var6_5, "metadata");
                var8_11 = var6_5.c;
                var7_4 = var6_5.a;
                var9_13 = this.a;
                try {
                    var1_1 = (String)((gfv)var9_13).l.a();
                    ** GOTO lbl120
                }
                catch (Throwable var1_2) {
                    Log.e((String)"MendelPackageState", (String)"Failed to get account name to commit for ".concat(String.valueOf(((gfv)var9_13).d)), (Throwable)var1_2);
                }
                catch (cqt var11_15) {
                    var1_1 = ((gfv)var9_13).d;
                    var10_17 = new StringBuilder("Getting account name to commit for ");
                    var10_17.append((String)var1_1);
                    var10_17.append(" would block");
                    Log.e((String)"MendelPackageState", (String)var10_17.toString(), (Throwable)var11_15);
                }
                var1_1 = null;
lbl120:
                // 2 sources

                if (var1_1 == null) ** GOTO lbl129
                var9_13 = ((gfv)var9_13).j.b();
                jse.e(var8_11, "commitProperties");
                if (jse.i(var1_1, "")) {
                    var1_1 = (gpm)var9_13;
                    var1_1.q((hvu)var7_4);
                    var1_1 = var1_1.p(var8_11);
                } else {
                    throw new IllegalStateException("DEVICE tier packages may only commit with LOGGED_OUT_USER");
lbl129:
                    // 1 sources

                    var1_1 = hhk.K(null);
                }
                fvc.v((hpn)var1_1, "Failed to commit to config");
                var7_4 = (gfv)this.a;
                var1_1 = var7_4.d;
                jse.e(var1_1, "subpackaged");
                var7_4.r.a.add(var1_1);
                var1_1 = this.a;
                if (Math.abs(cgw.p().toEpochMilli() - var6_5.b) > TimeUnit.DAYS.toMillis(1L)) {
                    var6_5 = (gfv)var1_1;
                    var1_1 = var6_5.k;
                    var6_5 = var6_5.b;
                    fvc.v(hhk.P(gqk.c((hnx)var1_1), (Executor)var6_5), "Failed to fetch after encountering old config");
                }
                jse.e(((gfv)this.a).o, "staticPackageName");
                return jon.a;
            }
            case 7: {
                var1_1 = (idq)var1_1;
                jse.e(var1_1, "it");
                jse.e(var1_1, "value");
                var6_5 = (hwp)((bzo)this.a).a;
                if (!var6_5.b.B()) {
                    var6_5.u();
                }
                var6_5 = (faq)var6_5.b;
                var7_4 = faq.a;
                var6_5.f = var1_1.m;
                var6_5.c |= 4;
                return jon.a;
            }
            case 6: {
                var1_1 = (gzx)var1_1;
                var6_5 = ezs.a;
                jse.b(var1_1);
                return crh.B(crh.C((gzm)var1_1, (faq)this.a));
            }
            case 5: {
                var1_1 = (Void)var1_1;
                return ((ezs)this.a).a();
            }
            case 4: {
                var1_1 = (idq)var1_1;
                jse.e(var1_1, "domain");
                if (var1_1 != this.a) {
                    var4_7 = false;
                }
                return var4_7;
            }
            case 3: {
                var1_1 = (RandomAccessFile)var1_1;
                jse.e(var1_1, "$this$runOpsSafely");
                var1_1.write((byte[])this.a);
                return jon.a;
            }
            case 2: {
                var1_1 = (etq)var1_1;
                jse.e(var1_1, "parent");
                var6_5 = this.a;
                if (var6_5.isEmpty()) {
                    var4_7 = var5_6;
                } else {
                    var6_5 = var6_5.iterator();
                    var4_7 = var5_6;
                    if (var6_5.hasNext()) {
                        var2_3 = ((etq)var6_5.next()).b;
                        var2_3 = var1_1.b;
                        var4_7 = false;
                    }
                }
                return var4_7;
            }
            case 1: {
                var1_1 = (Throwable)var1_1;
                this.a.cancel(false);
                return jon.a;
            }
            case 0: 
        }
        var10_18 = (eql)var1_1;
        jse.e(var10_18, "it");
        if (var10_18 instanceof eql) {
            block50: {
                var9_14 = (etw)this.a;
                for (Object var1_1 : var9_14.b) {
                    var8_12 = (ets)var1_1;
                    if (var10_18.a != var8_12.b) continue;
                    break block50;
                }
                var1_1 = null;
            }
            var11_16 = (ets)var1_1;
            if (var11_16 != null) {
                var1_1 = (heg)etw.a.f().h(hfo.a, "ALT.AudioRoutesRegy").j("com/google/android/libraries/search/audio/routing/registry/AudioRoutesRegistry", "enforceConcurrencyStateOnAudioSourcePreStart", 138, "AudioRoutesRegistry.kt");
                var3_19 = var10_18.a;
                var2_3 = var10_18.b.a;
                var8_12 = new StringBuilder("pre-start(route(");
                var8_12.append(var3_19);
                var8_12.append("), session(");
                var8_12.append(var2_3);
                var8_12.append("))");
                var1_1.C("#audio# enforcing routes concurrency state on event(%s) of %s", var8_12.toString(), var11_16.d.a());
                var12_20 = jns.f(new eal[]{eal.a, eal.c});
                var1_1 = var8_12 = eal.b(var11_16.d.b.d);
                if (var8_12 == null) {
                    var1_1 = eal.a;
                }
                if (var12_20.contains(var1_1) && var11_16.e.b.b != 6 && var10_18.c.c != 1999) {
                    var8_12 = var10_18.b.b;
                    jse.e(var8_12, "<this>");
                    var1_1 = var6_5;
                    if (var8_12.c == 13) {
                        var1_1 = (edg)var8_12.d;
                    }
                    var6_5 = var7_4;
                    if (var1_1 != null && (var6_5 = var1_1.c) == null) {
                        var6_5 = var7_4;
                    }
                    Uri.parse((String)var6_5);
                    var1_1 = var9_14.b;
                    var7_4 = new ArrayList<Object>();
                    var10_18 = var1_1.iterator();
                    while (var10_18.hasNext()) {
                        var8_12 = var10_18.next();
                        var1_1 = var6_5 = eal.b(((ets)var8_12).d.b.d);
                        if (var6_5 == null) {
                            var1_1 = eal.a;
                        }
                        if (var1_1 != eal.b) continue;
                        var7_4.add(var8_12);
                    }
                    for (Object var6_5 : var7_4) {
                        var9_14.d(var6_5.d, var6_5.b, ebg.z);
                    }
                }
            }
            return jon.a;
        }
        throw new joa();
    }
}

