/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.RemoteException
 *  android.util.Log
 */
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.apps.speech.tts.googletts.audio.AndroidDecoder;
import j$.util.Collection$_EL;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeoutException;

public final class brk
implements gte {
    public final Object a;
    private final int b;

    public /* synthetic */ brk(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final Object apply(Object var1_1) {
        var2_3 = this.b;
        var5_4 = false;
        var6_5 = false;
        switch (var2_3) {
            default: {
                var4_6 = var5_4;
                if (!((Boolean)var1_1).booleanValue()) break;
                var4_6 = var5_4;
                if (!((Boolean)this.a).booleanValue()) break;
                var4_6 = true;
                break;
            }
            case 19: {
                var4_7 = var6_5;
                if (((Boolean)var1_1).booleanValue()) {
                    var4_7 = var6_5;
                    if (((Boolean)this.a).booleanValue()) {
                        var4_7 = true;
                    }
                }
                return var4_7;
            }
            case 18: {
                return (hac)Collection$_EL.stream((List)var1_1).collect(gye.a(new bpf(14), new bof(this.a, 9)));
            }
            case 17: {
                var10_10 = ((List)var1_1).iterator();
                block24: while (true) {
                    var9_19 = this.a;
                    if (!var10_10.hasNext()) break;
                    var1_1 = ((cxr)var10_10.next()).b;
                    var11_30 = var1_1.o.iterator();
                    while (true) {
                        if (!var11_30.hasNext()) continue block24;
                        var12_36 /* !! */  = (ctf)var11_30.next();
                        var2_3 = var3_18 = a.t(var1_1.j);
                        if (var3_18 == 0) {
                            var2_3 = 1;
                        }
                        var12_36 /* !! */  = crh.l(var12_36 /* !! */ , var2_3);
                        ((hat)var9_19).j(var12_36 /* !! */ );
                    }
                    break;
                }
                return ((hat)var9_19).g();
            }
            case 16: {
                var4_8 = (Boolean)var1_1;
                var10_11 = this.a;
                var9_20 = ((cth)var10_11).c;
                var1_1 = var9_20;
                if (var9_20 == null) {
                    var1_1 = ctg.a;
                }
                var9_20 = (hwp)var1_1.C(5);
                var9_20.x((hwv)var1_1);
                if (!var9_20.b.B()) {
                    var9_20.u();
                }
                var1_1 = (ctg)var9_20.b;
                var1_1.b |= 64;
                var1_1.i = var4_8;
                var1_1 = (ctg)var9_20.o();
                var10_11 = (hwv)var10_11;
                var9_20 = (hwp)var10_11.C(5);
                var9_20.x((hwv)var10_11);
                if (!var9_20.b.B()) {
                    var9_20.u();
                }
                var10_11 = (cth)var9_20.b;
                var1_1.getClass();
                var10_11.c = var1_1;
                var10_11.b |= 1;
                return (cth)var9_20.o();
            }
            case 15: {
                var1_1 = (Void)var1_1;
                return this.a;
            }
            case 14: {
                var1_1 = (List)var1_1;
                this.a.addAll(var1_1);
                return null;
            }
            case 13: {
                var1_1 = (Uri)var1_1;
                if (var1_1 != null) {
                    this.a.add(var1_1);
                }
                return null;
            }
            case 12: {
                if (!((Boolean)var1_1).booleanValue()) {
                    ((cyu)((dmt)this.a).g).d(1036);
                    cyr.g("%s: Failed to remove expired groups!", "ExpirationHandler");
                }
                return null;
            }
            case 11: {
                var1_1 = (Void)var1_1;
                return (csg)((hwp)this.a).o();
            }
            case 10: {
                var1_1 = (csg)var1_1;
                var9_21 = this.a;
                if (var1_1 != null) {
                    ((gzs)var9_21).h(var1_1);
                }
                return var9_21;
            }
            case 9: {
                var1_1 = (cth)var1_1;
                return new cxs((cth)this.a, (cth)var1_1);
            }
            case 8: {
                var1_1 = (csg)var1_1;
                if (var1_1 != null) {
                    var13_40 = this.a;
                    var11_31 = cuq.k((csg)var1_1);
                    var9_22 = hls.a.l();
                    var10_12 = hmc.a.l();
                    if (!var10_12.b.B()) {
                        var10_12.u();
                    }
                    var12_37 /* !! */  = (hmc)var10_12.b;
                    var11_31.getClass();
                    var12_37 /* !! */ .c = var11_31;
                    var12_37 /* !! */ .b |= 1;
                    if (!var9_22.b.B()) {
                        var9_22.u();
                    }
                    var11_31 = ((cuq)var13_40).h;
                    var12_37 /* !! */  = (hls)var9_22.b;
                    var10_12 = (hmc)var10_12.o();
                    var10_12.getClass();
                    var12_37 /* !! */ .p = var10_12;
                    var12_37 /* !! */ .d |= 1;
                    var11_31.i(1071, var9_22, cqq.o());
                }
                return var1_1;
            }
            case 7: {
                var9_23 = (List)var1_1;
                var1_1 = new gzs();
                if (((ctb)this.a).a) {
                    var1_1.j((Iterable)var9_23);
                    var1_1 = var1_1.g();
                } else {
                    var9_23 = var9_23.iterator();
                    while (var9_23.hasNext()) {
                        var10_13 = (cxr)var9_23.next();
                        var11_32 /* !! */  = var10_13.a;
                        var11_32 /* !! */  = var10_13.b;
                        var1_1.h(var10_13);
                    }
                    var1_1 = var1_1.g();
                }
                return var1_1;
            }
            case 6: {
                var12_38 = (cap)var1_1;
                if (var12_38 != null) {
                    var10_14 = (cag)this.a;
                    var9_24 = ((ikp)var10_14.n.b).j;
                    var1_1 = var9_24;
                    if (var9_24 == null) {
                        var1_1 = ikr.a;
                    }
                    var9_24 = (hwp)var1_1.C(5);
                    var9_24.x((hwv)var1_1);
                    var11_33 = (hwr)var9_24;
                    var9_24 = ((ikp)var10_14.n.b).j;
                    var1_1 = var9_24;
                    if (var9_24 == null) {
                        var1_1 = ikr.a;
                    }
                    var9_24 = var1_1.e;
                    var1_1 = var9_24;
                    if (var9_24 == null) {
                        var1_1 = huz.a;
                    }
                    var9_24 = (hwp)var1_1.C(5);
                    var9_24.x((hwv)var1_1);
                    var1_1 = var12_38.b();
                    if (!var9_24.b.B()) {
                        var9_24.u();
                    }
                    var13_41 = (huz)var9_24.b;
                    var1_1.getClass();
                    var13_41.c = var1_1;
                    var12_38 = var12_38.a();
                    if (!var9_24.b.B()) {
                        var9_24.u();
                    }
                    var1_1 = (huz)var9_24.b;
                    var12_38.getClass();
                    var1_1.d = var12_38;
                    var1_1.b |= 1;
                    if (!var11_33.b.B()) {
                        var11_33.u();
                    }
                    var1_1 = (ikr)var11_33.b;
                    var9_24 = (huz)var9_24.o();
                    var9_24.getClass();
                    var1_1.e = var9_24;
                    var1_1.b |= 4;
                    var1_1 = (ikr)var11_33.o();
                    var9_24 = var10_14.n;
                    if (!var9_24.b.B()) {
                        var9_24.u();
                    }
                    var9_24 = (ikp)var9_24.b;
                    var1_1.getClass();
                    var9_24.j = var1_1;
                    var9_24.b |= 0x8000000;
                }
                return null;
            }
            case 5: {
                var1_1 = (ezj)var1_1;
                var10_15 = this.a;
                var9_25 = hpj.a;
                var10_15 = (byu)var10_15;
                var10_15.g.Q(var9_25, "LanguagePackSettings:installedPacks");
                var9_25 = hpj.a;
                var10_15.g.Q(var9_25, "LanguagePackSettings:supportedPacks");
                return var1_1.equals(ezg.a) ^ true;
            }
            case 4: {
                var1_1 = (Void)var1_1;
                var1_1 = this.a;
                var9_26 = hpj.a;
                var1_1 = (byu)var1_1;
                var1_1.g.Q(var9_26, "LanguagePackSettings:installedPacks");
                var9_26 = hpj.a;
                var1_1.g.Q(var9_26, "LanguagePackSettings:supportedPacks");
                return true;
            }
            case 3: {
                var1_1 = (List)var1_1;
                var9_27 = new HashMap<String, bsw>();
                var10_16 = var1_1.iterator();
                while (var10_16.hasNext()) {
                    var1_1 = this.a;
                    var11_34 = (String)var10_16.next();
                    ((heg)((heg)btj.a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataDownloader", "getAvailableVoicesInfo", 509, "VoiceDataDownloader.java")).u("getAvailableVoicesInfo %s", var11_34);
                    var12_39 = (btj)var1_1;
                    for (Object var1_1 : ((bud)var12_39.r.b).c) {
                        if (!var1_1.c.equals(var11_34)) continue;
                        ** GOTO lbl221
                    }
                    var1_1 = null;
lbl221:
                    // 2 sources

                    fxf.K(var1_1);
                    if (var1_1 == null || (var1_1.b & 1) == 0) ** GOTO lbl235
                    var5_4 = cab.d((buc)var1_1);
                    var13_42 = gtk.c(File.separatorChar).e(btj.f(var12_39.c), var1_1.c, new Object[0]);
                    var7_43 = var1_1.f;
                    var12_39 = var1_1.g.iterator();
                    while (var12_39.hasNext()) {
                        if (!cab.f((bub)var12_39.next())) continue;
                        var4_9 = false;
                        ** GOTO lbl232
                    }
                    var4_9 = true;
lbl232:
                    // 2 sources

                    var9_27.put(var11_34, new bsw((buc)var1_1, var7_43 * 1024L, var5_4 ^ true, var4_9, var13_42, gzx.o(brz.d((buc)var1_1))));
                    continue;
lbl235:
                    // 1 sources

                    ((heg)((heg)btj.a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataDownloader", "getAvailableVoicesInfo", 513, "VoiceDataDownloader.java")).u("Failed to get voice metadata for: %s", var11_34);
                }
                return var9_27;
            }
            case 2: {
                var1_1 = (TimeoutException)var1_1;
                ((heg)((heg)brq.a.h()).j("com/google/android/apps/speech/tts/googletts/audio/ExoPlayerDecoder", "decodeWithDataSource", 328, "ExoPlayerDecoder.java")).r("Decoder timed out");
                var9_28 = this.a;
                var1_1 = iim.f;
                ((brq)var9_28).b((iim)var1_1, "timeout");
                return null;
            }
            case 1: {
                var9_29 = this.a;
                var1_1 = (boz)var1_1;
                var10_17 = bqb.a;
                try {
                    var11_35 = ((bpq)var9_29).a();
                    var10_17 = var1_1.a();
                    box.c((Parcel)var10_17, var11_35);
                    var1_1 = var1_1.b(3, (Parcel)var10_17);
                    var2_3 = var1_1.readInt();
                    var1_1.recycle();
                    var1_1 = var2_3;
                }
                catch (RemoteException var1_2) {
                    Log.e((String)bqb.a, (String)"AiCore service failed to get feature status for ".concat(((bpq)var9_29).a), (Throwable)var1_2);
                    var1_1 = 0;
                }
                return var1_1;
            }
            case 0: {
                var1_1 = (IllegalArgumentException)var1_1;
                var1_1 = (AndroidDecoder)this.a;
                var1_1.jniDecoderStopped(var1_1.c, iim.b.g);
                var1_1.jniDecoderCompleted(var1_1.c);
                var1_1.directAudioBuffer.clear();
                return null;
            }
        }
        return var4_6;
    }
}

