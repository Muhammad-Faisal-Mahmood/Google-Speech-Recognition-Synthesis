/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodecInfo
 *  android.util.Pair
 */
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class amj {
    public static final int a = 0;
    private static final HashMap b = new HashMap();

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String a(adu adu2) {
        Pair pair;
        if ("audio/eac3-joc".equals(adu2.o)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(adu2.o) && (pair = afm.a(adu2)) != null) {
            int n2 = (Integer)pair.first;
            if (n2 == 16 || n2 == 256) return "video/hevc";
            if (n2 == 512) {
                return "video/avc";
            }
            if (n2 == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(adu2.o)) return "video/hevc";
        return null;
    }

    public static void b(List list, ami ami2) {
        Collections.sort(list, new bvk(ami2, 1));
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List c(String var0, boolean var1_4) {
        synchronized (amj.class) {
            var11_5 = new amf((String)var0, var1_4);
            var10_6 = (List)amj.b.get(var11_5);
            if (var10_6 != null) {
                return var10_6;
            }
            var13_7 = new amh(var1_4);
            try {
                var14_8 = new ArrayList<Object>();
                var12_9 = var11_5.a;
                var13_7.a();
                var2_10 = var13_7.a.length;
                for (var3_11 = 0; var3_11 < var2_10; ++var3_11) {
                    block33: {
                        block37: {
                            block35: {
                                block36: {
                                    var13_7.a();
                                    var16_19 = var13_7.a[var3_11];
                                    if (agf.a >= 29 && dp$$ExternalSyntheticApiModelOutline0.m$1((MediaCodecInfo)var16_19)) continue;
                                    var15_18 = var16_19.getName();
                                    if (var16_19.isEncoder()) continue;
                                    for (Object var10_6 : var16_19.getSupportedTypes()) {
                                        if (!var10_6.equalsIgnoreCase(var12_9)) {
                                            continue;
                                        }
                                        break block33;
                                    }
                                    if (!var12_9.equals("video/dolby-vision")) break block35;
                                    if (!"OMX.MS.HEVCDV.Decoder".equals(var15_18)) break block36;
                                    var10_6 = "video/hevcdv";
                                    break block33;
                                }
                                if (!"OMX.RTK.video.decoder".equals(var15_18) && !"OMX.realtek.video.decoder.tunneled".equals(var15_18)) ** GOTO lbl-1000
                                var10_6 = "video/dv_hevc";
                                break block33;
                            }
                            if (!var12_9.equals("video/mv-hevc")) break block37;
                            if (!"c2.qti.mvhevc.decoder".equals(var15_18)) ** GOTO lbl-1000
                            var10_6 = "video/x-mvhevc";
                            break block33;
                        }
                        if (var12_9.equals("audio/alac") && "OMX.lge.alac.decoder".equals(var15_18)) {
                            var10_6 = "audio/x-lg-alac";
                        } else if (var12_9.equals("audio/flac") && "OMX.lge.flac.decoder".equals(var15_18)) {
                            var10_6 = "audio/x-lg-flac";
                        } else if (var12_9.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(var15_18)) {
                            var10_6 = "audio/lg-ac3";
                        } else lbl-1000:
                        // 3 sources

                        {
                            var10_6 = null;
                        }
                    }
                    if (var10_6 == null) continue;
                }
            }
            catch (Exception var0_3) {
                var10_6 = new amg(var0_3);
                throw var10_6;
            }
            {
                block34: {
                    var17_20 = var16_19.getCapabilitiesForType((String)var10_6);
                    var17_20.isFeatureSupported("tunneled-playback");
                    if (var17_20.isFeatureRequired("tunneled-playback")) continue;
                    var7_15 = var17_20.isFeatureSupported("secure-playback");
                    var6_14 = var17_20.isFeatureRequired("secure-playback");
                    if (!var11_5.b) {
                        if (var6_14) continue;
                    } else {
                        if (!var7_15) continue;
                        var7_15 = true;
                    }
                    var6_14 = agf.a >= 29 ? dp$$ExternalSyntheticApiModelOutline0.m$2((MediaCodecInfo)var16_19) : amj.e((MediaCodecInfo)var16_19, var12_9) == false;
                    amj.e((MediaCodecInfo)var16_19, var12_9);
                    if (agf.a >= 29) {
                        dp$$ExternalSyntheticApiModelOutline0.m$3((MediaCodecInfo)var16_19);
                    } else if (!(var16_19 = fxf.T(var16_19.getName())).startsWith("omx.google.") && !var16_19.startsWith("c2.android.")) {
                        var16_19.startsWith("c2.google.");
                    }
                    if (var11_5.b != var7_15) continue;
                    var7_15 = var17_20 != null && var17_20.isFeatureSupported("adaptive-playback") != false;
                    if (var17_20 != null) {
                        var17_20.isFeatureSupported("tunneled-playback");
                    }
                    var8_16 = var17_20 != null && var17_20.isFeatureSupported("secure-playback") != false;
                    var9_17 = agf.a >= 35 && var17_20 != null && (var9_17 = var17_20.isFeatureSupported("detached-surface")) != false;
                    try {
                        var16_19 = new alx(var15_18, var12_9, (String)var10_6, var17_20, var6_14, var7_15, var8_16, var9_17);
                        var14_8.add(var16_19);
                        continue;
                    }
                    catch (Exception var0_1) {
                        break block34;
                    }
                    catch (Exception var0_2) {
                        // empty catch block
                    }
                }
                afx.b("MediaCodecUtil", a.aq((String)var10_6, var15_18, "Failed to query codec ", " (", ")"));
                throw var0;
            }
            if (var1_4 && var14_8.isEmpty()) {
                var2_10 = agf.a;
            }
            if ("audio/raw".equals(var0)) {
                var2_10 = agf.a;
                var0 = new amd();
                amj.b(var14_8, (ami)var0);
            }
            if (agf.a < 32 && var14_8.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((alx)var14_8.get((int)0)).a)) {
                var14_8.add((alx)var14_8.remove(0));
            }
            var0 = gzx.o(var14_8);
            amj.b.put(var11_5, var0);
            return var0;
        }
    }

    public static List d(adu object, boolean bl2) {
        List list = amj.c(((adu)object).o, bl2);
        if ((object = amj.a((adu)object)) == null) {
            int n2 = gzx.d;
            object = hct.a;
        } else {
            object = amj.c((String)object, bl2);
        }
        gzs gzs2 = new gzs();
        gzs2.j(list);
        gzs2.j((Iterable)object);
        return gzs2.g();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean e(MediaCodecInfo object, String string) {
        if (agf.a >= 29) {
            return dp$$ExternalSyntheticApiModelOutline0.m((MediaCodecInfo)object);
        }
        boolean bl2 = ael.c(string);
        boolean bl3 = true;
        if (bl2) {
            return true;
        }
        if (((String)(object = fxf.T(object.getName()))).startsWith("arc.")) {
            return false;
        }
        bl2 = bl3;
        if (((String)object).startsWith("omx.google.")) return bl2;
        bl2 = bl3;
        if (((String)object).startsWith("omx.ffmpeg.")) return bl2;
        if (((String)object).startsWith("omx.sec.")) {
            bl2 = bl3;
            if (((String)object).contains(".sw.")) return bl2;
        }
        bl2 = bl3;
        if (((String)object).equals("omx.qcom.video.decoder.hevcswvdec")) return bl2;
        bl2 = bl3;
        if (((String)object).startsWith("c2.android.")) return bl2;
        bl2 = bl3;
        if (((String)object).startsWith("c2.google.")) return bl2;
        if (((String)object).startsWith("omx.")) return false;
        if (((String)object).startsWith("c2.")) return false;
        return bl3;
    }
}

