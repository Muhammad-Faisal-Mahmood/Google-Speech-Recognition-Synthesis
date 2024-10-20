/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Collection$_EL;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class fgj
implements hny {
    public final fgo a;
    public final idq b;

    public /* synthetic */ fgj(fgo fgo2, idq idq2) {
        this.a = fgo2;
        this.b = idq2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn a(Object var1_1) {
        block60: {
            block64: {
                block59: {
                    block63: {
                        block58: {
                            block61: {
                                block62: {
                                    var12_2 = (hac)var1_1;
                                    var10_3 = this.a;
                                    var1_1 = (fjm)var12_2.get(var10_3.k.b);
                                    fxf.K(var1_1);
                                    var14_4 = var1_1.d;
                                    ((heg)((heg)fgo.a.f()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "initializeSodaDetectionHandler", 463, "SodaSpeechRecognizer.java")).r("Initialize Soda with language pack directory");
                                    var6_5 = idt.a.l();
                                    var8_6 = fgo.b(var10_3.k);
                                    if (!var6_5.b.B()) {
                                        var6_5.u();
                                    }
                                    var7_7 = (idt)var6_5.b;
                                    var7_7.c = var8_6.E;
                                    var7_7.b |= 1;
                                    var2_8 = var10_3.k.f.ordinal();
                                    var3_9 = 3;
                                    if (var2_8 == 1) break block61;
                                    if (var2_8 == 2) break block62;
                                    if (var2_8 != 3) {
                                        if (var2_8 != 4) {
                                            ((heg)((heg)fgo.a.g()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "getIntegrationFlavor", 601, "SodaSpeechRecognizer.java")).r("Entrypoint unidentified");
                                            var2_8 = 1;
                                            break block58;
                                        } else {
                                            var2_8 = 6;
                                        }
                                        break block58;
                                    } else {
                                        var2_8 = 4;
                                    }
                                    break block58;
                                }
                                var2_8 = 3;
                                break block58;
                            }
                            var2_8 = 5;
                        }
                        if (!var6_5.b.B()) {
                            var6_5.u();
                        }
                        var7_7 = (idt)var6_5.b;
                        var7_7.d = var2_8 - 1;
                        var7_7.b |= 2;
                        var7_7 = var10_3.k;
                        var2_8 = var7_7.M;
                        if (var2_8 == 0) {
                            throw null;
                        }
                        var4_10 = var2_8 - 1;
                        if (var4_10 == 0) break block63;
                        if (var4_10 == 1) ** GOTO lbl-1000
                        var2_8 = var3_9;
                        if (var4_10 != 2) {
                            if (var4_10 != 3) {
                                ((heg)((heg)fgo.a.g()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "getIntegrationPreference", 620, "SodaSpeechRecognizer.java")).r("RecognizerMode unidentified");
                                var2_8 = 1;
                                break block59;
                            } else {
                                var2_8 = 2;
                            }
                        }
                        break block59;
                    }
                    if (!var7_7.i) {
                        var2_8 = var3_9;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var2_8 = 4;
                    }
                }
                if (!var6_5.b.B()) {
                    var6_5.u();
                }
                var7_7 = var6_5.b;
                var8_6 = (idt)var7_7;
                var8_6.e = var2_8 - 1;
                var8_6.b |= 4;
                var8_6 = var10_3.k;
                if (!var7_7.B()) {
                    var6_5.u();
                }
                var7_7 = var8_6.e;
                var8_6 = (idt)var6_5.b;
                var7_7.getClass();
                var8_6.b |= 8;
                var8_6.f = var7_7;
                var11_11 = (idt)var6_5.o();
                var6_5 = var10_3.o;
                var7_7 = var6_5.g() != false ? ((fge)var6_5.c()).a() : null;
                var10_3.u = var1_1.c;
                ((heg)((heg)fgo.a.c()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "initializeSodaDetectionHandler", 476, "SodaSpeechRecognizer.java")).A("Language pack directory: %s version: %d", var14_4, var10_3.u);
                var6_5 = (fjn)var10_3.q.b(new dti(20)).e(fjn.a);
                var8_6 = (var6_5.b & 2) != 0 ? var6_5.c : "";
                var10_3.l.e((fjm)var1_1, (fjn)var6_5);
                var5_12 = var10_3.h;
                var9_13 = iem.a;
                if (var5_12) {
                    var1_1 = new File(var10_3.t.getFilesDir(), "transcription");
                    if (!(var1_1.exists() || var1_1.mkdirs() || var1_1.exists())) {
                        ((heg)((heg)fgo.a.g()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "createAndGetTranscriptionDir", 1061, "SodaSpeechRecognizer.java")).r("Transcription directory not created");
                    }
                    var1_1 = var1_1.getPath();
                    var6_5 = iem.a.l();
                    var5_12 = var10_3.h;
                    if (!var6_5.b.B()) {
                        var6_5.u();
                    }
                    var13_14 = var6_5.b;
                    var9_13 = (iem)var13_14;
                    var9_13.b |= 1;
                    var9_13.c = var5_12;
                    if (!var13_14.B()) {
                        var6_5.u();
                    }
                    var13_14 = var9_13 = var6_5.b;
                    var1_1.getClass();
                    var13_14.b |= 2;
                    var13_14.d = var1_1;
                    var13_14 = var10_3.k;
                    if (!var9_13.B()) {
                        var6_5.u();
                    }
                    var9_13 = var13_14.e;
                    var13_14 = (iem)var6_5.b;
                    var13_14.b |= 4;
                    var13_14.e = "speech_service_".concat(String.valueOf(var9_13));
                    var9_13 = (iem)var6_5.o();
                    ((heg)((heg)fgo.a.f()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "initializeSodaDetectionHandler", 501, "SodaSpeechRecognizer.java")).u("soda_audio_dump_to_disk_enable audio path: %s", var1_1);
                }
                if (var10_3.y.k && var10_3.k.B.isPresent()) {
                    var6_5 = var10_3.k.B.get();
                    var13_14 = (fjm)var12_2.get("ag-AG");
                    var1_1 = var6_5;
                    if (var13_14 != null) {
                        ((heg)((heg)fgo.a.b()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "initializeSodaDetectionHandler", 510, "SodaSpeechRecognizer.java")).u("USM encoder LP path: %s", var13_14.d);
                        var6_5 = (hwv)var6_5;
                        var1_1 = (hwp)var6_5.C(5);
                        var1_1.x((hwv)var6_5);
                        var6_5 = var13_14.d;
                        if (!var1_1.b.B()) {
                            var1_1.u();
                        }
                        var13_14 = (iel)var1_1.b;
                        var6_5.getClass();
                        var13_14.b |= 2;
                        var13_14.d = var6_5;
                        var1_1 = (iel)var1_1.o();
                    }
                } else {
                    var1_1 = null;
                }
                var13_14 = cmy.a();
                var13_14.i((String)var14_4);
                var13_14.g(var10_3.k.q);
                var6_5 = var10_3.k;
                var5_12 = fgo.f((fgu)var6_5) != false ? false : var6_5.o;
                var6_5 = this.b;
                var13_14.c(var5_12);
                var13_14.b = var10_3.k.r.orElse(null);
                var13_14.e(var10_3.k.s);
                var13_14.a((idq)var6_5);
                var13_14.e = var10_3.k.b;
                var13_14.f = new fgn(var10_3, var10_3.p);
                var13_14.g = var11_11;
                var13_14.h = var10_3.k.v.orElse(null);
                var13_14.i = var10_3.k.z.orElse(null);
                if (var10_3.k.A.isEmpty()) {
                    var6_5 = Optional.empty();
                } else {
                    var6_5 = var10_3.k.A.get();
                    var14_4 = iew.a.l();
                    var6_5 = (ffl)var6_5;
                    var2_8 = var3_9 = a.t(var6_5.c);
                    if (var3_9 == 0) {
                        var2_8 = 1;
                    }
                    if (!var14_4.b.B()) {
                        var14_4.u();
                    }
                    var15_15 = var14_4.b;
                    var16_16 = (iew)var15_15;
                    var16_16.f = var2_8 - 1;
                    var16_16.b |= 4;
                    if (!var15_15.B()) {
                        var14_4.u();
                    }
                    var16_16 = var14_4.b;
                    var15_15 = var16_16;
                    var15_15.b |= 1;
                    var15_15.d = true;
                    var2_8 = var3_9 = a.w(var6_5.g);
                    if (var3_9 == 0) {
                        var2_8 = 1;
                    }
                    if (!var16_16.B()) {
                        var14_4.u();
                    }
                    var16_16 = var14_4.b;
                    var15_15 = (iew)var16_16;
                    var15_15.i = var2_8 - 1;
                    var15_15.b |= 32;
                    var2_8 = var6_5.e;
                    if (var2_8 > 0) {
                        if (!var16_16.B()) {
                            var14_4.u();
                        }
                        var15_15 = (iew)var14_4.b;
                        var15_15.b |= 8;
                        var15_15.g = var2_8;
                    }
                    if ((var2_8 = var6_5.f) > 0) {
                        if (!var14_4.b.B()) {
                            var14_4.u();
                        }
                        var15_15 = (iew)var14_4.b;
                        var15_15.b |= 16;
                        var15_15.h = var2_8;
                    }
                    var5_12 = var6_5.h;
                    if (!var14_4.b.B()) {
                        var14_4.u();
                    }
                    var6_5 = var14_4.b;
                    var15_15 = (iew)var6_5;
                    var15_15.b |= 128;
                    var15_15.k = var5_12;
                    var2_8 = a.w(var15_15.i);
                    if ((var2_8 == 0 || var2_8 == 1) && var15_15.g == 1) {
                        if (!var6_5.B()) {
                            var14_4.u();
                        }
                        var6_5 = (iew)var14_4.b;
                        var6_5.b |= 2;
                        var6_5.e = false;
                    }
                    if (var10_3.k.w.equals("smart_dictation")) {
                        if (!var14_4.b.B()) {
                            var14_4.u();
                        }
                        var15_15 = var14_4.b;
                        var6_5 = (iew)var15_15;
                        var6_5.i = 1;
                        var6_5.b |= 32;
                        if (!var15_15.B()) {
                            var14_4.u();
                        }
                        var6_5 = var14_4.b;
                        var15_15 = (iew)var6_5;
                        var15_15.b |= 8;
                        var15_15.g = 0;
                        if (!var6_5.B()) {
                            var14_4.u();
                        }
                        var6_5 = var14_4.b;
                        var15_15 = (iew)var6_5;
                        var15_15.b |= 16;
                        var15_15.h = 0;
                        if (!var6_5.B()) {
                            var14_4.u();
                        }
                        var6_5 = var14_4.b;
                        var15_15 = (iew)var6_5;
                        var15_15.b |= 64;
                        var15_15.j = false;
                        if (!var6_5.B()) {
                            var14_4.u();
                        }
                        var6_5 = (iew)var14_4.b;
                        var6_5.b |= 128;
                        var6_5.k = false;
                    }
                    var6_5 = ((ies)var10_3.k.z.get()).b;
                    var15_15 = ((ffl)var10_3.k.A.get()).d;
                    if (var6_5.isEmpty() && var15_15.isEmpty()) {
                        var6_5 = var12_2.k().k();
                        while (var6_5.hasNext()) {
                            var12_2 = (Map.Entry)var6_5.next();
                            if (((String)var12_2.getKey()).equals("ag-AG")) continue;
                            var14_4.R((String)var12_2.getKey(), ((fjm)var12_2.getValue()).d);
                        }
                        var6_5 = Optional.of((iew)var14_4.o());
                    } else {
                        if (var6_5.isEmpty()) {
                            var6_5 = new HashSet<String>((Collection<String>)var15_15);
                        } else if (var15_15.isEmpty()) {
                            var6_5 = new HashSet<E>(var6_5);
                        } else {
                            var6_5 = new HashSet<E>(var6_5);
                            var15_15 = Collection$_EL.stream((Collection)var15_15);
                            Objects.requireNonNull(var6_5);
                            var6_5 = (Set)var15_15.filter(new fai(var6_5, 12)).collect(Collectors.toCollection(new fes(2)));
                        }
                        var6_5.add(var10_3.k.b);
                        var15_15 = var6_5.iterator();
                        while (var15_15.hasNext()) {
                            var6_5 = (String)var15_15.next();
                            if (!var12_2.containsKey(var6_5)) continue;
                            var14_4.R((String)var6_5, Objects.requireNonNull((fjm)var12_2.get((Object)var6_5)).d);
                        }
                        var6_5 = Optional.of((iew)var14_4.o());
                    }
                }
                var13_14.k = var6_5.orElse(null);
                var13_14.l = var7_7;
                var13_14.f(var10_3.k.w);
                var13_14.h((String)var8_6);
                var13_14.j = var9_13;
                var5_12 = var10_3.y.n > 1;
                var13_14.b(var5_12);
                var13_14.d(var10_3.k.L);
                var13_14.m = (iel)var1_1;
                var13_14.p = (giu)((gtt)var10_3.r).a;
                var6_5 = var13_14.j(var10_3.z);
                var1_1 = var11_11.f;
                if (!var6_5.e) break block64;
                var9_13 = var6_5.g;
                var7_7 = var9_13.h;
                synchronized (var7_7) {
                    var8_6 = (hpn)var9_13.j.get(var1_1);
                    if (var8_6 == null) {
                        var1_1 = Optional.empty();
                        break block60;
                    } else if (var8_6.isDone()) {
                        var9_13.k.remove(var1_1);
                        var1_1 = (hpn)var9_13.j.remove(var1_1);
                        var1_1 = Optional.empty();
                        break block60;
                    } else {
                        var1_1 = Optional.of(var8_6);
                    }
                    break block60;
                }
            }
            var1_1 = Optional.empty();
        }
        if (var1_1.isPresent()) {
            ((heg)((heg)fgo.a.f()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "initializeSodaDetectionHandler", 544, "SodaSpeechRecognizer.java")).u("#initializeSodaDetectionHandler: waiting existing soda stopped for client %s.", var11_11.f);
        }
        return fxf.ak(var1_1.orElse(hpj.a), new fbk(var10_3, var6_5, 5), var10_3.c);
    }
}

