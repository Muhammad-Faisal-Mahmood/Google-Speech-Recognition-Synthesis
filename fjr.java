/*
 * Decompiled with CFR 0.152.
 */
public final class fjr
implements fjt {
    private static final hei a = hei.m("com/google/android/libraries/speech/transcription/recognition/s3response/FinalS3ResponseProcessor");
    private final boolean b;
    private final boolean c;

    public fjr(boolean bl2, boolean bl3) {
        this.b = bl2;
        this.c = bl3;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void a(idb var1_1, fgr var2_2) {
        block25: {
            block31: {
                block26: {
                    block28: {
                        block30: {
                            block29: {
                                block27: {
                                    var13_3 = iia.d;
                                    var1_1.h((gpm)var13_3);
                                    if (!var1_1.r.o((hwu)var13_3.a)) break block25;
                                    var13_3 = iia.d;
                                    var1_1.h((gpm)var13_3);
                                    var1_1 = var1_1.r.l((hwu)var13_3.a);
                                    var1_1 = var1_1 == null ? var13_3.d : var13_3.k(var1_1);
                                    var1_1 = (iia)var1_1;
                                    var5_4 = var1_1.b;
                                    if (var5_4 != 1) break block25;
                                    var18_5 = (icn)var1_1.c;
                                    var5_4 = var18_5.b;
                                    var1_1 = "com/google/android/libraries/speech/transcription/recognition/s3response/FinalS3ResponseProcessor";
                                    if ((var5_4 & 4) == 0) break block26;
                                    var14_6 = var13_3 = var18_5.d;
                                    if (var13_3 == null) {
                                        var14_6 = icp.a;
                                    }
                                    var15_7 = var14_6.c;
                                    ((heg)((heg)fjr.a.f().h(hfo.a, "FinalS3RespProcessor")).j("com/google/android/libraries/speech/transcription/recognition/s3response/FinalS3ResponseProcessor", "createFinalRecognitionResults", 56, "FinalS3ResponseProcessor.java")).s("Received a final result for a segment, %d hypothesis", var15_7.size());
                                    var19_8 = fex.a.l();
                                    var13_3 = var15_7.iterator();
                                    while (var13_3.hasNext()) {
                                        var20_12 = (icg)var13_3.next();
                                        var16_10 = var20_12.b;
                                        if (!var19_8.b.B()) {
                                            var19_8.u();
                                        }
                                        var17_11 = (fex)var19_8.b;
                                        var16_10.getClass();
                                        var17_11.c();
                                        var17_11.c.add(var16_10);
                                        var3_9 = var20_12.c;
                                        if (!var19_8.b.B()) {
                                            var19_8.u();
                                        }
                                        var16_10 = (fex)var19_8.b;
                                        var16_10.b();
                                        var16_10.d.g(var3_9);
                                    }
                                    if (this.b) break block27;
                                    var13_3 = var1_1;
                                    if (!this.c) break block28;
                                }
                                var13_3 = var1_1;
                                if (var15_7.isEmpty()) break block28;
                                var10_13 = var14_6.b;
                                var14_6 = (icg)var15_7.get(0);
                                var13_3 = var15_7 = var14_6.d;
                                if (var15_7 == null) {
                                    var13_3 = ibv.a;
                                }
                                if (var13_3.c.size() != 0) break block29;
                                ((heg)((heg)fjr.a.h().h(hfo.a, "FinalS3RespProcessor")).j("com/google/android/libraries/speech/transcription/recognition/s3response/FinalS3ResponseProcessor", "buildRecognitionParts", 78, "FinalS3ResponseProcessor.java")).r("Normalized word align is empty.");
                                var13_3 = var1_1;
                                break block28;
                            }
                            if (!this.c) break block30;
                            var13_3 = var15_7 = var14_6.d;
                            if (var15_7 == null) {
                                var13_3 = ibv.a;
                            }
                            var5_4 = var13_3.c.size();
                            var13_3 = var15_7 = var14_6.e;
                            if (var15_7 == null) {
                                var13_3 = ibx.a;
                            }
                            if (var5_4 == var13_3.b.size()) break block30;
                            var16_10 = (heg)((heg)fjr.a.g().h(hfo.a, "FinalS3RespProcessor")).j("com/google/android/libraries/speech/transcription/recognition/s3response/FinalS3ResponseProcessor", "buildRecognitionParts", 85, "FinalS3ResponseProcessor.java");
                            var13_3 = var15_7 = var14_6.d;
                            if (var15_7 == null) {
                                var13_3 = ibv.a;
                            }
                            var5_4 = var13_3.c.size();
                            var13_3 = var14_6 = var14_6.e;
                            if (var14_6 == null) {
                                var13_3 = ibx.a;
                            }
                            var16_10.v("[RS][S3] segment count in word align: %d and speaker align: %d is empty or didn't match.", var5_4, var13_3.b.size());
                            var13_3 = var1_1;
                            break block28;
                        }
                        var5_4 = 0;
                        var15_7 = "";
                        while (true) {
                            var16_10 = var13_3 = var14_6.d;
                            if (var13_3 == null) {
                                var16_10 = ibv.a;
                            }
                            var13_3 = var1_1;
                            if (var5_4 >= var16_10.c.size()) break;
                            var13_3 = var16_10 = var14_6.d;
                            if (var16_10 == null) {
                                var13_3 = ibv.a;
                            }
                            var20_12 = ((ibu)var13_3.c.get((int)var5_4)).c;
                            var13_3 = var16_10 = var14_6.e;
                            if (var16_10 == null) {
                                var13_3 = ibx.a;
                            }
                            if (var5_4 >= var13_3.b.size()) ** GOTO lbl-1000
                            var13_3 = var16_10 = var14_6.e;
                            if (var16_10 == null) {
                                var13_3 = ibx.a;
                            }
                            var13_3 = (ibw)var13_3.b.get(var5_4);
                            if (var13_3.b == 1) {
                                var13_3 = (String)var13_3.c;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var13_3 = "";
                            }
                            var16_10 = var14_6.d;
                            var17_11 = var16_10 == null ? ibv.a : var16_10;
                            var4_14 = var17_11.b;
                            var17_11 = var16_10;
                            if (var16_10 == null) {
                                var17_11 = ibv.a;
                            }
                            var3_9 = ((ibu)var17_11.c.get((int)var5_4)).b;
                            var16_10 = ffx.a.l();
                            if (!var16_10.b.B()) {
                                var16_10.u();
                            }
                            var17_11 = (ffx)var16_10.b;
                            var20_12.getClass();
                            var17_11.b();
                            var17_11.c.add(var20_12);
                            if (this.c) {
                                var17_11 = few.a.l();
                                if (!var17_11.b.B()) {
                                    var17_11.u();
                                }
                                var20_12 = (few)var17_11.b;
                                var13_3.getClass();
                                var20_12.b |= 1;
                                var20_12.c = var13_3;
                                var12_17 = var15_7.isEmpty() == false && var15_7.equals(var13_3) == false;
                                if (!var17_11.b.B()) {
                                    var17_11.u();
                                }
                                var15_7 = (few)var17_11.b;
                                var15_7.b |= 2;
                                var15_7.d = var12_17;
                                var17_11 = (few)var17_11.o();
                                if (!var16_10.b.B()) {
                                    var16_10.u();
                                }
                                var15_7 = (ffx)var16_10.b;
                                var17_11.getClass();
                                var15_7.f = var17_11;
                                var15_7.b |= 4;
                            }
                            if (this.b) {
                                var8_16 = (long)(var4_14 * 1000.0f * var3_9);
                                var6_15 = var10_13 / 1000L;
                                if (!var16_10.b.B()) {
                                    var16_10.u();
                                }
                                var15_7 = (ffx)var16_10.b;
                                var15_7.b |= 1;
                                var15_7.d = var6_15 + var8_16;
                            }
                            var19_8.J((ffx)var16_10.o());
                            ++var5_4;
                            var15_7 = var13_3;
                        }
                    }
                    var2_2.i((fex)var19_8.o());
                    break block31;
                }
                var13_3 = "com/google/android/libraries/speech/transcription/recognition/s3response/FinalS3ResponseProcessor";
            }
            var5_4 = a.v(var18_5.c);
            if (var5_4 != 0 && var5_4 == 2) {
                ((heg)((heg)fjr.a.f().h(hfo.a, "FinalS3RespProcessor")).j((String)var13_3, "process", 48, "FinalS3ResponseProcessor.java")).r("Received the final result for the recognition");
                var2_2.h();
            }
        }
    }
}

