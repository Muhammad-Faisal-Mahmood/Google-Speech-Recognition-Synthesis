/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.net.Uri
 *  gqv
 *  hom
 */
import android.content.Intent;
import android.net.Uri;
import androidx.work.WorkerParameters;
import j$.util.Collection$_EL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class fbk
implements hny {
    public final Object a;
    public final Object b;
    private final int c;

    public /* synthetic */ fbk(Object object, Object object2, int n2) {
        this.c = n2;
        this.a = object;
        this.b = object2;
    }

    public /* synthetic */ fbk(Object object, Object object2, int n2, byte[] byArray) {
        this.c = n2;
        this.b = object;
        this.a = object2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn a(Object var1_1) {
        var2_4 = this.c;
        var3_5 = -1L;
        switch (var2_4) {
            default: {
                var6_6 = (Exception)var1_1;
                var1_1 = this.a;
                if (!var1_1.isCancelled()) break;
                return var1_1;
            }
            case 17: {
                var7_23 = (List)var1_1;
                var1_1 = new ArrayList<E>();
                var6_7 = new HashSet<E>();
                var8_37 = var7_23.iterator();
                while (var8_37.hasNext()) {
                    var7_23 = (bbw)var8_37.next();
                    if (var7_23.b != bbv.a) continue;
                    var6_7.add(var7_23.d);
                }
                var6_7 = hav.n(var6_7).k();
                while (var6_7.hasNext() != false) {
                    var8_37 = this.a;
                    var7_23 = (baq)var6_7.next();
                    if (var8_37.contains(var7_23)) continue;
                    var8_37 = (glx)this.b;
                    var9_44 = glx.d((baq)var7_23, var8_37.c());
                    var7_23 = var8_37.c;
                    var8_37 = var7_23.b.a((String)var9_44);
                    var9_44 = new gcx(0);
                    var1_1.add(hno.f(((bmu)var7_23.g).R((hpn)var8_37, (hny)var9_44), new gtf(), (Executor)hom.a));
                }
                return hhk.Y((Iterable)var1_1).a(gqk.j(new dwp(10)), (Executor)hom.a);
            }
            case 16: {
                var1_1 = (Void)var1_1;
                var1_1 = this.b;
                return ((gls)this.a).c((WorkerParameters)var1_1);
            }
            case 15: {
                var1_1 = (Void)var1_1;
                var6_8 = (gls)this.a;
                var7_24 = var6_8.f;
                var1_1 = (glx)var6_8.c;
                if (var7_24.b() == false) return hpj.a;
                var7_24 = (WorkerParameters)this.b;
                if (var7_24.c.contains(gls.d(var1_1.c())) != false) return hpj.a;
                ((heg)((heg)gls.a.f()).j("com/google/apps/tiktok/sync/impl/workmanager/SyncPeriodicWorker", "maybeCancelThisWorkerIfItHasWrongMainProcessTag", 141, "SyncPeriodicWorker.java")).r("Cancelling Sync worker since it has the wrong tag");
                return var6_8.e.a(var7_24.a);
            }
            case 14: {
                var6_9 = (List)var1_1;
                var1_1 = new ArrayList<E>();
                var9_45 = var6_9.iterator();
                while (true) {
                    var8_38 = this.b;
                    var6_9 = this.a;
                    if (var9_45.hasNext() == false) return fxf.aB((Iterable)var1_1).C(new etu(var6_9, var8_38, 15), ((gls)var6_9).d);
                    var7_25 = (bbw)var9_45.next();
                    if (((WorkerParameters)var8_38).a.equals(var7_25.a)) continue;
                    var1_1.add(((gls)var6_9).e.a(var7_25.a));
                }
            }
            case 13: {
                var1_1 = (Void)var1_1;
                var8_39 = this.a;
                var6_10 = (glp)var8_39;
                var7_26 = var6_10.b;
                var1_1 = this.b;
                return fvd.d(hno.g(var7_26.c("com.google.apps.tiktok.sync.impl.workmanager.SyncWorker"), gqk.d(new fbk(var8_39, var1_1, 12)), var6_10.a), new dwp(6), (Executor)hom.a);
            }
            case 12: {
                var6_11 = (List)var1_1;
                var1_1 = new ArrayList<E>();
                var8_40 = var6_11.iterator();
                while (true) {
                    var6_11 = this.b;
                    var9_46 = this.a;
                    if (var8_40.hasNext() == false) return hhk.Y((Iterable)var1_1).b(gqk.c(new etu(var9_46, var6_11, 14)), ((glp)var9_46).a);
                    var7_27 = (bbw)var8_40.next();
                    if (((WorkerParameters)var6_11).a.equals(var7_27.a)) continue;
                    var1_1.add(((glp)var9_46).b.a(var7_27.a));
                }
            }
            case 11: {
                var1_1 = (Long)var1_1;
                var6_12 = this.a;
                var7_28 = this.b;
                var8_41 = (gld)var7_28;
                return fxf.an(var8_41.h((hpn)var6_12), new dcf(var7_28, var6_12, var1_1, 9), var8_41.b);
            }
            case 10: {
                var1_1 = (Void)var1_1;
                var6_13 = ((HashMap)this.a).keySet();
                var1_1 = ((gld)this.b).g;
                var6_13 = new czm(var1_1, var6_13, 20);
                return var1_1.d.bf((Callable)var6_13);
            }
            case 9: {
                var6_14 = (gjh)this.a;
                var7_29 = var6_14.a(var1_1);
                if (var7_29 == null) {
                    ((heg)((heg)gjh.a.g()).j("com/google/apps/tiktok/receiver/IntentFilterAcledReceiver", "handleUnorderedBroadcast", 244, "IntentFilterAcledReceiver.java")).r("Ordered receiver got unordered broadcast.");
                    return hhk.K(null);
                }
                var1_1 = (Intent)this.b;
                return var6_14.e(var7_29.a((Intent)var1_1), var7_29, (Intent)var1_1);
            }
            case 8: {
                var6_15 = this.b;
                var1_1 = (gfo)var1_1;
                jse.e(var6_15, "$snapshot");
                var6_15 = gqk.b(new fmi(var6_15, 18));
                return fxf.aj(((gfv)this.a).q.b((gte)var6_15, (Executor)hom.a), gqk.b(new fmi(var1_1, 19)), (Executor)hom.a);
            }
            case 7: {
                var8_42 = (duq)var1_1;
                var1_1 = goo.a;
                var6_16 = fxf.at("ConsistencyTierState.setNewValues", gqv.a, (gop)var1_1);
                var7_30 = this.b;
                var1_1 = this.a;
                try {
                    var9_47 /* !! */  = (geo)((gfl)var7_30).e.get(var1_1);
                    if (var9_47 /* !! */  == null) ** GOTO lbl-1000
                    var2_4 = var9_47 /* !! */ .ordinal();
                    if (var2_4 == 0) ** GOTO lbl123
                    if (var2_4 != 2) ** GOTO lbl-1000
                    var7_30 = ((gfl)var7_30).c;
                    jse.b(var8_42);
                    var1_1 = ((gpm)var7_30).r((String)var1_1, (duq)var8_42);
                    ** GOTO lbl128
lbl123:
                    // 1 sources

                    var9_47 /* !! */  = ((gfl)var7_30).d;
                    jse.b(var8_42);
                    var8_42 = ((gpm)var9_47 /* !! */ ).r((String)var1_1, (duq)var8_42);
                    var9_47 /* !! */  = new ffp(var7_30, var1_1, 4);
                    var1_1 = hno.f((hpn)var8_42, gqk.b((gte)var9_47 /* !! */ ), (Executor)hom.a);
lbl128:
                    // 2 sources

                    var6_16.a((hpn)var1_1);
                }
                catch (Throwable var1_2) {
                    try {
                        throw var1_2;
                    }
                    catch (Throwable var7_31) {
                        jsd.f(var6_16, var1_2);
                        throw var7_31;
                    }
                }
                jsd.f(var6_16, null);
                return var1_1;
lbl-1000:
                // 2 sources

                {
                    var1_1 = new UnsupportedOperationException();
                    throw var1_1;
                }
            }
            case 6: {
                var6_17 = this.b;
                var7_32 = (frp)var6_17;
                var7_32.c((Uri)hhk.S(var7_32.b), var1_1);
                var7_32 = var7_32.e;
                var8_43 = this.a;
                synchronized (var7_32) {
                    ((frp)var6_17).f = var8_43;
                    return hhk.K(var1_1);
                }
            }
            case 5: {
                var1_1 = (Void)var1_1;
                ((heg)((heg)fgo.a.f()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "initializeSodaDetectionHandler", 553, "SodaSpeechRecognizer.java")).r("SodaDetectionHandler.blockingReconnect");
                var7_33 = this.b;
                var6_18 = (cmz)var7_33;
                if (var6_18.e) {
                    var1_1 = var6_18.b();
                } else {
                    if (var6_18.g()) {
                        try {
                            ((heg)((heg)cmz.a.c()).j("com/google/android/libraries/assistant/soda/SodaDetectionHandler", "blockingReconnect", 322, "SodaDetectionHandler.java")).r("Trying to stop SODA if it is running");
                            ((cnd)((gtt)((cmz)var7_33).f).a).m();
                        }
                        catch (IllegalStateException var1_3) {
                            a.as(cmz.a.g(), "SODA failed to stop capturing; simply deleting SODA", "com/google/android/libraries/assistant/soda/SodaDetectionHandler", "blockingReconnect", '\u0145', "SodaDetectionHandler.java", var1_3);
                            ((heg)((heg)cmz.a.c()).j("com/google/android/libraries/assistant/soda/SodaDetectionHandler", "blockingReconnect", 326, "SodaDetectionHandler.java")).r("Deleting SODA due to failure in stopping capture.");
                            ((cnd)((gtt)var6_18.f).a).j();
                        }
                    }
                    if (var6_18.g() && !((cnd)((gtt)var6_18.f).a).r(var6_18.a())) {
                        var1_1 = var6_18.c;
                        if (var1_1 != null) {
                            ((cnd)((gtt)var6_18.f).a).l((cmt)var1_1);
                        } else {
                            ((heg)((heg)cmz.a.h()).j("com/google/android/libraries/assistant/soda/SodaDetectionHandler", "blockingReconnect", 337, "SodaDetectionHandler.java")).r("No soda callback provided. Events will not be reported back");
                        }
                        var1_1 = igr.a;
                    } else {
                        ((heg)((heg)cmz.a.f()).j("com/google/android/libraries/assistant/soda/SodaDetectionHandler", "blockingDisconnect", 296, "SodaDetectionHandler.java")).r("#blockingDisconnect");
                        if (var6_18.e) {
                            var6_18.g.f(var6_18.c(), var6_18.c);
                        } else if (var6_18.g()) {
                            ((heg)((heg)cmz.a.c()).j("com/google/android/libraries/assistant/soda/SodaDetectionHandler", "blockingDisconnect", 303, "SodaDetectionHandler.java")).r("Deleting SODA");
                            ((cnd)((gtt)var6_18.f).a).j();
                        }
                        var1_1 = var6_18.b();
                    }
                }
                if (var1_1 != igr.a) {
                    return hhk.J(new fec((igr)var1_1));
                }
                var1_1 = ((fgo)this.a).g;
                if (var1_1.b == -1L) {
                    var6_18.d();
                    return hhk.K(var7_33);
                } else {
                    var6_18.e((hwg)var1_1);
                }
                return hhk.K(var7_33);
            }
            case 4: {
                var1_1 = (Void)var1_1;
                var1_1 = this.b;
                return ((fbm)this.a).o((ezj)var1_1);
            }
            case 3: {
                var1_1 = (Void)var1_1;
                var1_1 = (hfk)((hfk)fbm.a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl", "getPackage", 382, "ZipfileLanguagePackSourceImpl.java");
                var6_19 = this.a;
                var1_1.u("MDD.getFileGroup(%s)", var6_19);
                var1_1 = new csy(null);
                var1_1.a(false);
                var1_1.e = true;
                var1_1.f = (byte)(var1_1.f | 2);
                if (var6_19 == null) throw new NullPointerException("Null groupName");
                var1_1.a = (String)var6_19;
                var1_1.a(true);
                if (var1_1.f == 3 && (var7_34 = var1_1.a) != null) {
                    var6_19 = this.b;
                    var1_1 = new csz(var7_34, var1_1.b, var1_1.c, var1_1.d, var1_1.e);
                    return ((fbm)var6_19).b.d((csz)var1_1);
                }
                var6_19 = new StringBuilder();
                if (var1_1.a == null) {
                    var6_19.append(" groupName");
                }
                if ((var1_1.f & 1) == 0) {
                    var6_19.append(" preserveZipDirectories");
                }
                if ((var1_1.f & 2) != 0) throw new IllegalStateException("Missing required properties:".concat(var6_19.toString()));
                var6_19.append(" verifyIsolatedStructure");
                throw new IllegalStateException("Missing required properties:".concat(var6_19.toString()));
            }
            case 2: {
                var5_48 = (Boolean)var1_1;
                var1_1 = this.b;
                if (var5_48) {
                    ((hfk)((hfk)fbm.a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl", "deletePackage", 348, "ZipfileLanguagePackSourceImpl.java")).u("Zipfile LP successfully removed from MDD: %s", var1_1);
                } else {
                    ((hfk)((hfk)fbm.a.h()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl", "deletePackage", 350, "ZipfileLanguagePackSourceImpl.java")).u("Zipfile LP not successfully removed from MDD. Did FileGroup exist? Descriptor: %s", var1_1);
                }
                var6_20 = (fbm)this.a;
                var1_1 = var6_20.b;
                return var6_20.c.b((cty)var1_1);
            }
            case 1: {
                var6_21 = Collection$_EL.stream((hav)var1_1);
                var7_35 = this.b;
                var1_1 = this.a;
                var6_21 = var6_21.map(new fbi(var1_1, var7_35, 0));
                var2_4 = gzx.d;
                return fxf.aB((gzx)var6_21.collect(gye.a)).B(new dwp(3), ((fbj)var1_1).e);
            }
            case 0: {
                var1_1 = (Void)var1_1;
                var1_1 = (ezj)this.b;
                var1_1 = fbf.a(var1_1.a.toLanguageTag(), var1_1.b);
                var6_22 = cuu.a();
                var6_22.b((String)var1_1);
                var6_22 = var6_22.a();
                ((hfk)((hfk)fbm.a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl", "deletePackage", 341, "ZipfileLanguagePackSourceImpl.java")).u("MDD.removeFileGroup(%s)", var1_1);
                return ((fbm)this.a).b.g((cuu)var6_22);
            }
        }
        var1_1 = (hkb)this.b;
        var2_4 = var1_1.g;
        var7_36 = TimeUnit.MILLISECONDS;
        var1_1.e.a((TimeUnit)var7_36);
        var7_36 = var1_1.c;
        if (var7_36.bo(var2_4) && var7_36.bo(var2_4)) {
            var3_5 = 0L;
        }
        if (var3_5 >= 0L && var1_1.d.a(var6_6)) {
            ((hfk)((hfk)ddd.a.l().i(var6_6)).j("com/google/android/libraries/micore/superpacks/packs/DownloadFetcher$1", "retryableExceptionCaught", 66, "DownloadFetcher.java")).r("Retriable exception caught");
            var1_1.d();
            return hhk.K(hkb.a);
        }
        ((hfk)((hfk)ddd.a.l().i(var6_6)).j("com/google/android/libraries/micore/superpacks/packs/DownloadFetcher$1", "terminalExceptionCaught", 72, "DownloadFetcher.java")).r("Terminal exception caught");
        var2_4 = var1_1.g;
        throw new hju(var6_6);
    }
}

