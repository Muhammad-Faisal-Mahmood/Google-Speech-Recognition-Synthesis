/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gqv
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import com.google.android.libraries.speech.modelmanager.languagepack.ui.DownloadActivity;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import j$.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public final class fbx
implements Runnable {
    public final Object a;
    public final Object b;
    public final Object c;
    private final int d;

    public /* synthetic */ fbx(fby fby2, Optional optional, hpr hpr2, int n2) {
        this.d = n2;
        this.a = fby2;
        this.b = optional;
        this.c = hpr2;
    }

    public /* synthetic */ fbx(goi goi2, gds gds2, geg geg2, int n2) {
        this.d = n2;
        this.b = goi2;
        this.a = gds2;
        this.c = geg2;
    }

    public /* synthetic */ fbx(Object object, Object object2, Object object3, int n2) {
        this.d = n2;
        this.b = object;
        this.c = object2;
        this.a = object3;
    }

    public /* synthetic */ fbx(Object object, Object object2, Object object3, int n2, byte[] byArray) {
        this.d = n2;
        this.a = object;
        this.c = object2;
        this.b = object3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        switch (this.d) {
            default: {
                var5_1 = ((hsm)this.a).b();
                var6_25 = this.b;
                var5_1.c((String)this.c, (Throwable)var6_25);
                return;
            }
            case 19: {
                var5_2 = (ProtoParsers$InternalDontUse)((gsj)this.c).b;
                ((heg)((heg)((heg)DownloadActivity.k.h()).i((Throwable)this.b)).j("com/google/android/libraries/speech/modelmanager/languagepack/ui/DownloadActivity$1", "onFailure", 130, "DownloadActivity.java")).r("#onFailure");
                ((DownloadActivity)((AmbientModeSupport$AmbientController)this.a).a).finish();
                return;
            }
            case 18: {
                var5_3 = this.c;
                var1_48 = ((gsj)var5_3).a;
                var6_26 = (gsi)this.a;
                var6_26.a(new fbx((AmbientModeSupport$AmbientController)pc.a(var6_26.a, var1_48), var5_3, this.b, 15, null));
                return;
            }
            case 17: {
                var5_4 = this.c;
                var1_49 = ((gsj)var5_4).a;
                var6_27 = (gsi)this.a;
                var6_27.a(new fbx((AmbientModeSupport$AmbientController)pc.a(var6_27.a, var1_49), var5_4, this.b, 19, null));
                return;
            }
            case 16: {
                var5_5 = (gsi)this.a;
                var6_28 = var5_5.c;
                if (var6_28 == null) return;
                if (!var6_28.V()) {
                    if (var6_28.w != false) return;
                    var6_28 = this.c;
                    if (var5_5.b.remove(var6_28) == false) return;
                    this.b.run();
                    return;
                }
                var5_5.e = true;
                return;
            }
            case 15: {
                var5_6 = (ProtoParsers$InternalDontUse)((gsj)this.c).b;
                var5_6 = (ProtoParsers$InternalDontUse)this.b;
                ((heg)((heg)DownloadActivity.k.f()).j("com/google/android/libraries/speech/modelmanager/languagepack/ui/DownloadActivity$1", "onSuccess", 123, "DownloadActivity.java")).u("#onSuccess: %s", var5_6);
                ((DownloadActivity)((AmbientModeSupport$AmbientController)this.a).a).finish();
                return;
            }
            case 14: {
                var6_29 = this.b;
                var5_7 = this.c;
                ((gld)this.a).l((gli)var5_7, (hpn)var6_29);
                return;
            }
            case 13: {
                var5_8 = this.b;
                var6_30 = this.c;
                ((gjq)this.a).b((fvc)var6_30, (iwx)var5_8);
                return;
            }
            case 12: {
                var9_52 = this.a;
                var6_31 = this.b;
                var5_9 = (gem)var6_31;
                var8_55 = var5_9.g;
                var7_61 = this.c;
                if (var8_55.h(var9_52) == false) return;
                fpk.c();
                try {
                    try {
                        hhk.S((Future)((bzb)var9_52).a);
                        var8_55 = ((gee)var7_61).f.b;
                        var8_55 = ((gem)var6_31).d;
                        if (((gee)var7_61).a((gee)var8_55)) {
                            if (((gem)var6_31).f.d == false) return;
                            if (((gem)var6_31).h() == false) return;
                            fxf.B(((gem)var6_31).f.e.g(), "Completed load, fetch is still open, and the callbacks didn't receive data. This is an impossible state.");
                            gem.f((gdn)((gem)var6_31).f.c);
                            ((gem)var6_31).f = var7_61 = ((gem)var6_31).f.a(false);
                            return;
                        }
                        var8_55 = (gee)var7_61;
                        ((gem)var6_31).d((gee)var8_55);
                        var8_55 = ((gem)var6_31).k;
                        var9_52 = hhk.K(null);
                        var11_75 = ((gee)var7_61).f.b;
                        var10_76 = ((gem)var6_31).j;
                        var7_61 = ((gem)var6_31).a;
                        var8_55.O((hpn)var9_52, var11_75, geb.a, gto.i(var10_76), (Executor)var7_61);
                        return;
                    }
                    catch (ExecutionException var7_62) {
                        var7_63 = var7_62.getCause();
                        ((gem)var6_31).g(var7_63);
                        return;
                    }
                }
                catch (Throwable var6_32) {}
                var5_9.b.execute(new ffd(var6_32, 14));
                return;
            }
            case 11: {
                var7_64 = this.a;
                var6_33 = this.c;
                var5_10 = this.b;
                var6_33 = new fbx(var5_10, var6_33, var7_64, 12);
                ((gem)var5_10).a.execute((Runnable)var6_33);
                return;
            }
            case 10: {
                fpk.c();
                var7_65 = this.c;
                var6_34 = this.b;
                var5_11 = (gem)var6_34;
                fxf.B(var7_65.equals(var5_11.d) ^ true, "The same LoadTask was processed twice.");
                var8_56 = this.a;
                var9_53 = (ivu)var8_56;
                fxf.A(var9_53.i().isDone());
                if (var5_11.h.h(var8_56) == false) return;
                if (var9_53.i().isCancelled() != false) return;
                try {
                    try {
                        var9_53 = ((gem)var6_34).d;
                        if (!((gee)var7_65).a((gee)var9_53)) ** GOTO lbl113
                        ((ivu)var8_56).j();
                        ** GOTO lbl141
lbl113:
                        // 1 sources

                        if (((ivu)var8_56).i().isCancelled()) ** GOTO lbl141
                        var9_53 = ((ivu)var8_56).h();
                        var1_50 = ((gem)var6_34).e.b.a(((gee)var7_65).e, (gdo)var9_53, ((gee)var7_65).b() ^ true) - 1;
                        if (var1_50 == 0) ** GOTO lbl134
                        if (var1_50 == 1) ** GOTO lbl127
                        var8_56 = (ivu)var8_56;
                        ((gem)var6_34).i((gee)var7_65, (ivu)var8_56);
                        if (((gee)var7_65).b()) {
                            var7_65 = new gdv();
                            var7_65.addSuppressed(gqq.c());
                            ((gem)var6_34).g((Throwable)var7_65);
                        } else {
                            ((gem)var6_34).c((gee)var7_65);
                        }
                        ** GOTO lbl141
lbl127:
                        // 1 sources

                        var8_56 = (ivu)var8_56;
                        ((gem)var6_34).i((gee)var7_65, (ivu)var8_56);
                        if (((gem)var6_34).f.d && ((gem)var6_34).h()) {
                            fxf.B(((gem)var6_34).f.e.g(), "Completed load, fetch is still open, and the callbacks didn't receive data. This is an impossible state.");
                            gem.f((gdn)((gem)var6_34).f.c);
                            ((gem)var6_34).f = var7_65 = ((gem)var6_34).f.a(false);
                        }
                        ** GOTO lbl141
lbl134:
                        // 1 sources

                        ((ivu)var8_56).j();
                        if (((gee)var7_65).b()) {
                            var7_65 = new gdv();
                            var7_65.addSuppressed(gqq.c());
                            ((gem)var6_34).g((Throwable)var7_65);
                        } else {
                            ((gem)var6_34).c((gee)var7_65);
                        }
lbl141:
                        // 7 sources

                        if (((gem)var6_34).f.d == false) return;
                        if (((gem)var6_34).h() == false) return;
                        fxf.B(((gem)var6_34).f.e.g(), "Completed load, fetch is still open, and the callbacks didn't receive data. This is an impossible state.");
                        gem.f((gdn)((gem)var6_34).f.c);
                        ((gem)var6_34).f = var7_65 = ((gem)var6_34).f.a(false);
                        return;
                    }
                    catch (gej var7_66) {
                        var7_67 = var7_66.getCause();
                        ((gem)var6_34).g(var7_67);
                        return;
                    }
                }
                catch (Throwable var6_35) {}
                var5_11.b.execute(new ffd(var6_35, 15));
                return;
            }
            case 9: {
                var7_68 = this.a;
                var6_36 = this.c;
                var5_12 = this.b;
                var6_36 = new fbx(var5_12, var6_36, var7_68, 10);
                ((gem)var5_12).a.execute((Runnable)var6_36);
                return;
            }
            case 8: {
                var5_13 = ((goi)this.b).b;
                var7_69 = new gdq();
                var6_37 = this.c;
                var8_57 = (gds)this.a;
                ((gel)var5_13).a(var8_57, var7_69, (geg)var6_37);
                return;
            }
            case 7: {
                var5_14 = (gby)this.a;
                var4_78 = var5_14.e;
                var6_38 = this.b;
                if (var4_78 == false) return;
                var7_70 = this.c;
                if (var5_14.c.remove(var7_70) == false) return;
                var8_58 = (gbv)var5_14.b.a(((gca)var7_70).a);
                var5_14 = fxf.at("onFailure FuturesMixin", gqv.a, goo.a);
                try {
                    var8_58.a(((gca)var7_70).d, (Throwable)var6_38);
                    return;
                }
                finally {
                    var5_14.close();
                }
            }
            case 6: {
                var5_16 = (gby)this.a;
                var4_79 = var5_16.e;
                var7_71 = this.b;
                if (var4_79 == false) return;
                var6_40 = this.c;
                if (var5_16.c.remove(var6_40) == false) return;
                var8_59 = (gbv)var5_16.b.a(((gca)var6_40).a);
                var5_16 = fxf.at("onSuccess FuturesMixin", gqv.a, goo.a);
                try {
                    var8_59.c(((gca)var6_40).d, var7_71);
                    return;
                }
                finally {
                    var5_16.close();
                }
            }
            case 5: {
                var6_42 = this.b;
                var5_18 = this.c;
                gax.b((hpn)this.a, (String)var5_18, (Object[])var6_42);
                return;
            }
            case 4: {
                var6_43 = (heg)((heg)fjj.a.c()).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionSession", "onError", 366, "RecognitionSession.java");
                var5_19 = (fjj)this.b;
                var6_43.u("[%s] onError.throttle send error to client.", var5_19.g);
                var5_19.l.f((fiq)this.c);
                var5_19.l.e();
                var6_43 = var5_19.g;
                var5_19.f.n((String)var6_43, (fef)this.a);
                var5_19.h = false;
                return;
            }
            case 3: {
                var6_44 = this.b;
                var5_20 = this.c;
                fgo.d((hpn)this.a, (String)var5_20, (Object[])var6_44);
                return;
            }
            case 2: {
                var6_45 = ((fff)this.a).a;
                var7_72 = this.b;
                var5_21 = this.c;
                var6_45.c.e((fjm)var5_21, (fjn)var7_72);
                return;
            }
            case 1: {
                ((heg)evi.a.c().h(hfo.a, "ALT.GrpcARCRespSender").j("com/google/android/libraries/search/audio/service/impl/StreamListeningSessionResponseSender$startInternal$1$4", "invokeSuspend$lambda$0", 109, "StreamListeningSessionResponseSender.kt")).r("#audio# sending MIC audio accessor to the remote client");
                var8_60 = (dzi)this.c.a().c();
                var2_80 = ewj.d((eae)this.a);
                var7_73 = new byte[var2_80];
                var1_51 = 0;
                while (true) {
                    try {
                        var5_22 = var8_60.a((byte[])var7_73, var1_51, 0, var2_80);
                    }
                    catch (Throwable var5_23) {
                        var5_22 = jns.aj(var5_23);
                    }
                    var6_46 = this.b;
                    var9_54 = joe.a(var5_22);
                    if (var9_54 != null) {
                        ((heg)((heg)evi.a.h().h(hfo.a, "ALT.GrpcARCRespSender")).i((Throwable)var9_54).j("com/google/android/libraries/search/audio/service/impl/StreamListeningSessionResponseSender", "sendAudioAccessorBlocking", 267, "StreamListeningSessionResponseSender.kt")).r("#audio# Cannot read next audio data on behalf of the remote client, shutting down");
                        ((evi)var6_46).i((Throwable)var9_54);
                        return;
                    }
                    var3_81 = ((Number)var5_22).intValue();
                    if (var3_81 < 0) {
                        var8_60 = crh.X(eun.a.l());
                        var5_22 = dox.g(dzn.a.l());
                        var7_73 = dox.k(dzt.a.l());
                        var7_73.u(dzu.b);
                        var5_22.g(var7_73.t());
                        var8_60.J(var5_22.e());
                        var5_22 = var8_60.I();
                        ((evi)var6_46).f((eun)var5_22);
                        return;
                    }
                    if (var3_81 <= 0) continue;
                    var1_51 += var3_81;
                    var5_22 = crh.X(eun.a.l());
                    var10_77 = dox.g(dzn.a.l());
                    var9_54 = dox.f(dzm.a.l());
                    var9_54.d(hvu.s((byte[])var7_73, 0, var3_81));
                    var10_77.f(var9_54.c());
                    var5_22.J(var10_77.e());
                    if (joe.a(((evi)var6_46).f((eun)(var5_22 = var5_22.I()))) != null) break;
                }
                ((heg)evi.a.h().h(hfo.a, "ALT.GrpcARCRespSender").j("com/google/android/libraries/search/audio/service/impl/StreamListeningSessionResponseSender", "sendAudioAccessorBlocking", 286, "StreamListeningSessionResponseSender.kt")).r("#audio# Stopping sending bytes to the remote client");
                return;
            }
            case 0: 
        }
        var6_47 = this.b;
        var5_24 = this.a;
        var6_47 = new etu(var5_24, var6_47, 6, null);
        var7_74 = this.c;
        ((fby)var5_24).l.F((hnx)var6_47, (Executor)var7_74);
    }
}

