/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodecInfo$AudioCapabilities
 *  android.media.MediaCodecInfo$CodecCapabilities
 *  android.media.MediaCodecInfo$CodecProfileLevel
 *  android.util.Pair
 */
import android.media.MediaCodecInfo;
import android.util.Pair;
import j$.util.Objects;

public final class alx {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public alx(String string, String string2, String string3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        abr.i(string);
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = codecCapabilities;
        this.g = bl2;
        this.e = bl3;
        this.f = bl4;
        this.h = bl5;
        this.i = ael.e(string2);
    }

    private final void e(String string) {
        String string2 = agf.e;
        StringBuilder stringBuilder = new StringBuilder("NoSupport [");
        stringBuilder.append(string);
        stringBuilder.append("] [");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(this.b);
        stringBuilder.append("] [");
        stringBuilder.append(string2);
        stringBuilder.append("]");
        afx.g(stringBuilder.toString());
    }

    public final aif a(adu adu2, adu adu3) {
        int n2;
        block22: {
            int n3;
            block19: {
                Object object;
                block21: {
                    block20: {
                        n3 = true != Objects.equals(adu2.o, adu3.o) ? 8 : 0;
                        if (!this.i) break block19;
                        n2 = adu3.y;
                        if (!this.e) {
                            n2 = adu3.v;
                            n2 = adu3.w;
                        }
                        if (!adm.a(null)) break block20;
                        object = adu3.C;
                        n2 = n3;
                        if (adm.a(null)) break block21;
                    }
                    object = adu3.C;
                    n2 = n3;
                    if (!Objects.equals(null, null)) {
                        n2 = n3 | 0x800;
                    }
                }
                object = this.a;
                n3 = n2;
                if (agf.d.startsWith("SM-T230")) {
                    n3 = n2;
                    if ("OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(object)) {
                        n3 = n2;
                        if (!adu2.c(adu3)) {
                            n3 = n2 | 2;
                        }
                    }
                }
                n2 = n3;
                if (n3 == 0) {
                    object = this.a;
                    n3 = true != adu2.c(adu3) ? 2 : 3;
                    return new aif((String)object, adu2, adu3, n3, 0);
                }
                break block22;
            }
            n2 = n3;
            if (adu2.D != adu3.D) {
                n2 = n3 | 0x1000;
            }
            int n4 = n2;
            if (adu2.E != adu3.E) {
                n4 = n2 | 0x2000;
            }
            n3 = n4;
            if (adu2.F != adu3.F) {
                n3 = n4 | 0x4000;
            }
            if (n3 == 0 && "audio/mp4a-latm".equals(this.b)) {
                n2 = amj.a;
                Pair pair = afm.a(adu2);
                Pair pair2 = afm.a(adu3);
                if (pair != null && pair2 != null) {
                    n2 = (Integer)pair.first;
                    n4 = (Integer)pair2.first;
                    if (n2 == 42 && n4 == 42) {
                        return new aif(this.a, adu2, adu3, 3, 0);
                    }
                }
            }
            n2 = n3;
            if (!adu2.c(adu3)) {
                n2 = n3 | 0x20;
            }
            n3 = n2;
            if ("audio/opus".equals(this.b)) {
                n3 = n2 | 2;
            }
            n2 = n3;
            if (n3 == 0) {
                return new aif(this.a, adu2, adu3, 1, 0);
            }
        }
        return new aif(this.a, adu2, adu3, 0, n2);
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public final boolean b(adu var1_1, boolean var2_2) {
        block30: {
            block29: {
                block28: {
                    var4_3 = amj.a;
                    var14_4 /* !! */  = afm.a((adu)var1_1);
                    var15_5 = var1_1.o;
                    if (var15_5 == null || !var15_5.equals("video/mv-hevc") || !this.c.equals("video/hevc")) break block29;
                    var14_4 /* !! */  = var1_1.r;
                    for (var5_6 = 0; var5_6 < var14_4 /* !! */ .size(); ++var5_6) {
                        var15_5 = (byte[])var14_4 /* !! */ .get(var5_6);
                        var9_10 = ((Object)var15_5).length;
                        if (var9_10 <= 3) continue;
                        var16_14 = new boolean[3];
                        var17_15 = new gzs();
                        for (var4_3 = 0; var4_3 < (var7_8 = ((Object)var15_5).length); var4_3 += 3) {
                            block27: {
                                var10_11 = var7_8 - var4_3;
                                var13_13 = var10_11 >= 0;
                                abr.f(var13_13);
                                if (var10_11 == 0) ** GOTO lbl46
                                if (var16_14[0] != false) {
                                    agi.a((boolean[])var16_14);
                                    var4_3 -= 3;
                                } else if (var10_11 > 1 && var16_14[1] != false && var15_5[var4_3] == true) {
                                    agi.a((boolean[])var16_14);
                                    var4_3 -= 2;
                                } else if (var10_11 > 2 && var16_14[2] != false && var15_5[var4_3] == false && var15_5[var4_3 + 1] == true) {
                                    agi.a((boolean[])var16_14);
                                    --var4_3;
                                } else {
                                    var8_9 = var7_8 - 1;
                                    var4_3 += 2;
                                    while (var4_3 < var8_9) {
                                        var11_12 /* !! */  = var15_5[var4_3];
                                        var6_7 = var4_3;
                                        if ((var11_12 /* !! */  & 254) == 0 && var15_5[var6_7 = var4_3 - 2] == false && var15_5[var4_3 - 1] == false && var11_12 /* !! */  == true) {
                                            agi.a((boolean[])var16_14);
                                            var4_3 = var6_7;
                                            break block27;
                                        }
                                        var4_3 = var6_7 + 3;
                                    }
                                    var13_13 = var10_11 > 2 ? var15_5[var7_8 - 3] == false && var15_5[var7_8 - 2] == false && var15_5[var8_9] == true : (var10_11 == 2 ? var16_14[2] != false && var15_5[var7_8 - 2] == false && var15_5[var8_9] == true : var16_14[1] != false && var15_5[var8_9] == true);
                                    var16_14[0] = var13_13;
                                    var13_13 = var10_11 > 1 ? var15_5[var7_8 - 2] == false && var15_5[var8_9] == false : var16_14[2] != false && var15_5[var8_9] == false;
                                    var16_14[1] = var13_13;
                                    var13_13 = var15_5[var8_9] == false;
                                    var16_14[2] = var13_13;
lbl46:
                                    // 2 sources

                                    var4_3 = var7_8;
                                }
                            }
                            if (var4_3 == var7_8) continue;
                            var17_15.h(var4_3);
                        }
                        var17_15 = var17_15.g();
                        for (var4_3 = 0; var4_3 < ((hct)var17_15).c; ++var4_3) {
                            if ((Integer)var17_15.get(var4_3) + 3 >= var9_10) continue;
                            var16_14 = new apb((byte[])var15_5, (Integer)var17_15.get(var4_3) + 3, var9_10);
                            var16_14.g();
                            var8_9 = 6;
                            var7_8 = var16_14.f(6);
                            var6_7 = var16_14.f(6);
                            var16_14.f(3);
                            var18_16 = new agg(var7_8, var6_7);
                            if (var18_16.a != 33 || var18_16.b != 0) continue;
                            var16_14.h(4);
                            var11_12 /* !! */  = var16_14.f(3);
                            var16_14.g();
                            var14_4 /* !! */  = (Pair)new int[6];
                            var9_10 = var16_14.f(2);
                            var13_13 = var16_14.i();
                            var10_11 = var16_14.f(5);
                            var6_7 = 0;
                            for (var5_6 = 0; var5_6 < 32; ++var5_6) {
                                var4_3 = var6_7;
                                if (var16_14.i()) {
                                    var4_3 = var6_7 | 1 << var5_6;
                                }
                                var6_7 = var4_3;
                            }
                            for (var4_3 = 0; var4_3 < 6; ++var4_3) {
                                var14_4 /* !! */ [var4_3] = (Pair)var16_14.f(8);
                            }
                            var12_17 = var16_14.f(8);
                            var5_6 = 0;
                            for (var7_8 = 0; var7_8 < var11_12 /* !! */ ; ++var7_8) {
                                var4_3 = var5_6;
                                if (var16_14.i()) {
                                    var4_3 = var5_6 + 88;
                                }
                                var5_6 = var4_3;
                                if (!var16_14.i()) continue;
                                var5_6 = var4_3 + 8;
                            }
                            var16_14.h(var5_6);
                            if (var11_12 /* !! */  > 0) {
                                var4_3 = 8 - var11_12 /* !! */ ;
                                var16_14.h(var4_3 + var4_3);
                            }
                            var15_5 = new agh(var9_10, var13_13, var10_11, var6_7, (int[])var14_4 /* !! */ , var12_17);
                            var4_3 = var15_5.a;
                            var13_13 = var15_5.b;
                            var5_6 = var15_5.c;
                            var7_8 = var15_5.d;
                            var14_4 /* !! */  = (Pair)var15_5.e;
                            var6_7 = var15_5.f;
                            var15_5 = afm.a[var4_3];
                            var3_18 = true != var13_13 ? 'L' : 'H';
                            var15_5 = new StringBuilder(agf.r("hvc1.%s%d.%X.%c%d", new Object[]{var15_5, var5_6, var7_8, Character.valueOf(var3_18), var6_7}));
                            var4_3 = var8_9;
                            while (var4_3 > 0 && var14_4 /* !! */ [var5_6 = var4_3 - 1] == false) {
                                var4_3 = var5_6;
                            }
                            for (var5_6 = 0; var5_6 < var4_3; ++var5_6) {
                                var15_5.append(String.format(".%02X", new Object[]{(int)var14_4 /* !! */ [var5_6]}));
                            }
                            var14_4 /* !! */  = var15_5.toString();
                            break block28;
                        }
                    }
                    var14_4 /* !! */  = null;
                }
                if (var14_4 /* !! */  == null) {
                    var14_4 /* !! */  = null;
                } else {
                    var16_14 = agf.w(var14_4 /* !! */ .trim(), "\\.");
                    var15_5 = var1_1.C;
                    var14_4 /* !! */  = afm.b((String)var14_4 /* !! */ , (String[])var16_14, null);
                }
            }
            if (var14_4 /* !! */  == null) ** GOTO lbl145
            var4_3 = (Integer)var14_4 /* !! */ .first;
            var5_6 = (Integer)var14_4 /* !! */ .second;
            if ("video/dolby-vision".equals(var1_1.o)) {
                if ("video/avc".equals(this.b)) {
                    var4_3 = 8;
lbl130:
                    // 2 sources

                    while (true) {
                        var5_6 = 0;
                        break;
                    }
                } else if ("video/hevc".equals(this.b)) {
                    var4_3 = 2;
                    ** continue;
                }
            }
            var6_7 = var4_3;
            if (this.i) break block30;
            if (var4_3 != 42) ** GOTO lbl145
            var6_7 = 42;
        }
        var14_4 /* !! */  = (var14_4 /* !! */  = this.d) != null && var14_4 /* !! */ .profileLevels != null ? this.d.profileLevels : new MediaCodecInfo.CodecProfileLevel[]{};
        var4_3 = agf.a;
        for (Object var15_5 : var14_4 /* !! */ ) {
            if (var15_5.profile != var6_7 || var15_5.level < var5_6 && var2_2 || "video/hevc".equals(this.b) && var6_7 == 2 && ("sailfish".equals(agf.b) || "marlin".equals(agf.b))) continue;
lbl145:
            // 3 sources

            return true;
        }
        var1_1 = var1_1.k;
        var14_4 /* !! */  = this.c;
        var1_1 = new StringBuilder("codec.profileLevel, null, ");
        var1_1.append((String)var14_4 /* !! */ );
        this.e(var1_1.toString());
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean c(adu object) {
        boolean bl2 = this.d((adu)object);
        boolean bl3 = false;
        if (!bl2) {
            return bl3;
        }
        if (!this.b((adu)object, true)) {
            return bl3;
        }
        if (!this.i) {
            int n2;
            int n3;
            Object object2;
            int n4 = ((adu)object).E;
            if (n4 != -1) {
                object2 = this.d;
                if (object2 == null) {
                    this.e("sampleRate.caps");
                    return bl3;
                }
                if ((object2 = object2.getAudioCapabilities()) == null) {
                    this.e("sampleRate.aCaps");
                    return bl3;
                }
                if (!object2.isSampleRateSupported(n4)) {
                    this.e(a.af(n4, "sampleRate.support, "));
                    return bl3;
                }
            }
            if ((n3 = ((adu)object).D) == -1) return true;
            object = this.d;
            if (object == null) {
                this.e("channelCount.caps");
                return bl3;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = object.getAudioCapabilities();
            if (audioCapabilities == null) {
                this.e("channelCount.aCaps");
                return bl3;
            }
            object = this.a;
            object2 = this.b;
            n4 = n2 = audioCapabilities.getMaxInputChannelCount();
            if (n2 <= 1) {
                n4 = agf.a;
                if (n2 > 0) {
                    n4 = n2;
                } else {
                    n4 = n2;
                    if (!"audio/mpeg".equals(object2)) {
                        n4 = n2;
                        if (!"audio/3gpp".equals(object2)) {
                            n4 = n2;
                            if (!"audio/amr-wb".equals(object2)) {
                                n4 = n2;
                                if (!"audio/mp4a-latm".equals(object2)) {
                                    n4 = n2;
                                    if (!"audio/vorbis".equals(object2)) {
                                        n4 = n2;
                                        if (!"audio/opus".equals(object2)) {
                                            n4 = n2;
                                            if (!"audio/raw".equals(object2)) {
                                                n4 = n2;
                                                if (!"audio/flac".equals(object2)) {
                                                    n4 = n2;
                                                    if (!"audio/g711-alaw".equals(object2)) {
                                                        n4 = n2;
                                                        if (!"audio/g711-mlaw".equals(object2)) {
                                                            if ("audio/gsm".equals(object2)) {
                                                                n4 = n2;
                                                            } else {
                                                                n4 = "audio/ac3".equals(object2) ? 6 : ("audio/eac3".equals(object2) ? 16 : 30);
                                                                object2 = new StringBuilder("AssumedMaxChannelAdjustment: ");
                                                                ((StringBuilder)object2).append((String)object);
                                                                ((StringBuilder)object2).append(", [");
                                                                ((StringBuilder)object2).append(n2);
                                                                ((StringBuilder)object2).append(" to ");
                                                                ((StringBuilder)object2).append(n4);
                                                                ((StringBuilder)object2).append("]");
                                                                afx.e("MediaCodecInfo", ((StringBuilder)object2).toString());
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (n4 >= n3) return true;
            this.e(a.af(n3, "channelCount.support, "));
            return bl3;
        }
        int n5 = ((adu)object).v;
        return true;
    }

    public final boolean d(adu adu2) {
        return this.b.equals(adu2.o) || this.b.equals(amj.a(adu2));
        {
        }
    }

    public final String toString() {
        return this.a;
    }
}

