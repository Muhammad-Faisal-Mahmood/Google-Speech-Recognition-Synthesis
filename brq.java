/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  hom
 */
import android.content.Context;
import android.net.Uri;
import androidx.wear.ambient.AmbientMode$AmbientController;
import androidx.wear.ambient.WearableControllerProvider;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class brq
implements akx {
    public static final hei a = hei.m("com/google/android/apps/speech/tts/googletts/audio/ExoPlayerDecoder");
    public static final Uri b = new Uri.Builder().scheme("bytes").authority("audio").build();
    public final aiq c;
    public final gbs d;
    public final iku e;
    public final agk f;
    public int g;
    private final ScheduledExecutorService h;
    private final afj i;
    private brn j;
    private long k;
    private int l;
    private aeo m = aeo.a;

    public brq(Context object, gbs gbs2, ScheduledExecutorService object2, iku iku2) {
        this.d = gbs2;
        this.h = object2;
        this.e = iku2;
        this.i = new afj();
        this.j = new brp();
        new ahb();
        this.f = new agk((Context)object);
        object = new aio((Context)object, new bvr(this, (Context)object, 1));
        ((aio)object).b(gbs2.getLooper());
        abr.f(true);
        aii.b(1, 0, "bufferForPlaybackMs", "0");
        aii.b(1, 0, "bufferForPlaybackAfterRebufferMs", "0");
        aii.b(10000, 1, "minBufferMs", "bufferForPlaybackMs");
        aii.b(10000, 1, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        aii.b(10000, 10000, "maxBufferMs", "minBufferMs");
        abr.f(true);
        object2 = new aii(new apb(), 10000, 10000, 1, 1);
        abr.f(((aio)object).l ^ true);
        ((aio)object).f = new aim(object2, 0);
        this.c = ((aio)object).a();
        gbs2.post(new bpv(this, 6));
        this.g = 1;
    }

    public final hpn a(Uri object, agr object2, brn brn2, long l2) {
        int n2 = this.g;
        if (n2 != 0) {
            if (n2 != 1) {
                return hhk.J(new IllegalStateException("Decoder not ready to be called again yet"));
            }
            Object object3 = this.i;
            ((afj)object3).b = 1.0f;
            ((afj)object3).c = 1.0f;
            ((afj)object3).d = aff.a;
            Object object4 = aff.a;
            ((afj)object3).e = object4;
            ((afj)object3).f = object4;
            ((afj)object3).g = object4;
            ((afj)object3).j = afj.a;
            ((afj)object3).k = ((afj)object3).j.asShortBuffer();
            ((afj)object3).l = afj.a;
            ((afj)object3).h = false;
            ((afj)object3).i = null;
            ((afj)object3).m = 0L;
            ((afj)object3).n = 0L;
            this.j = brn2;
            this.k = 0L;
            this.g = 2;
            object2 = new bvp((agr)object2, 1);
            object3 = new AmbientMode$AmbientController(new bvq(1), null);
            object4 = new wb(null);
            object = wb.f(aef.a((Uri)object), (agq)object2, (AmbientMode$AmbientController)object3, (wb)object4);
            this.d.post(new aks((Object)this, object, 17, null));
            object = hph.q(kl.o(new bwo(this, 1)));
            object2 = this.h;
            return hno.f(hmv.f(((hph)object).r(l2, TimeUnit.MILLISECONDS, (ScheduledExecutorService)object2), TimeoutException.class, new brk(this, 2), (Executor)hom.a), new bte(this, brn2, 1, null), (Executor)hom.a);
        }
        throw null;
    }

    public final void b(iim object, String object2) {
        int n2 = this.g;
        if (n2 != 0) {
            if (n2 != 4 && n2 != 1) {
                if (object != iim.d && object != iim.c) {
                    ((heg)((heg)a.h()).j("com/google/android/apps/speech/tts/googletts/audio/ExoPlayerDecoder", "stopDecoder", 361, "ExoPlayerDecoder.java")).u("Decoder stopped with failure: %s", object2);
                } else {
                    ((heg)((heg)a.c()).j("com/google/android/apps/speech/tts/googletts/audio/ExoPlayerDecoder", "stopDecoder", 359, "ExoPlayerDecoder.java")).u("Decoder stopped with success: %s", object2);
                }
                n2 = this.g;
                if (n2 != 0) {
                    if (n2 != 3) {
                        ((heg)((heg)a.f()).j("com/google/android/apps/speech/tts/googletts/audio/ExoPlayerDecoder", "stopDecoder", 366, "ExoPlayerDecoder.java")).r("Forcing start callback");
                        this.j.d();
                    }
                    this.g = 4;
                    this.j.b((iim)object);
                    object2 = this.d;
                    object = this.c;
                    Objects.requireNonNull(object);
                    object2.post((Runnable)new bpv(object, 4));
                    return;
                }
                throw null;
            }
            object = (heg)((heg)a.f()).j("com/google/android/apps/speech/tts/googletts/audio/ExoPlayerDecoder", "stopDecoder", 354, "ExoPlayerDecoder.java");
            n2 = this.g;
            object2 = WearableControllerProvider.b(n2);
            if (n2 != 0) {
                object.u("Decoder is already stopped or reset, state=%s", object2);
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override
    public final int q(adu adu2) {
        if ("audio/raw".equals(adu2.o) && adu2.F == 2) {
            return 2;
        }
        return 0;
    }

    @Override
    public final aeo r() {
        return this.m;
    }

    @Override
    public final void s() {
        int n2 = this.g;
        if (n2 != 0) {
            if (n2 == 4) {
                ((heg)((heg)a.h()).j("com/google/android/apps/speech/tts/googletts/audio/ExoPlayerDecoder", "playToEndOfStream", 600, "ExoPlayerDecoder.java")).r("Already trying to stop, ignoring playToEndOfStream");
                return;
            }
            this.b(iim.c, "end_of_stream");
            return;
        }
        throw null;
    }

    @Override
    public final void t(aeo aeo2) {
        this.m = aeo2;
    }

    @Override
    public final boolean u() {
        int n2 = this.g;
        boolean bl2 = n2 == 4;
        if (n2 != 0) {
            return bl2;
        }
        throw null;
    }

    @Override
    public final boolean v(adu adu2) {
        return this.q(adu2) != 0;
    }

    @Override
    public final void w(adu object) {
        int n2 = this.g;
        if (n2 != 0) {
            Object object2;
            block11: {
                if (n2 != 2) {
                    heg heg2 = (heg)((heg)a.h()).j("com/google/android/apps/speech/tts/googletts/audio/ExoPlayerDecoder", "configure", 508, "ExoPlayerDecoder.java");
                    n2 = this.g;
                    object = WearableControllerProvider.b(n2);
                    if (n2 != 0) {
                        heg2.u("Unexpected configure() call, state=%s", object);
                        this.b(iim.b, "unexpected_configure_call");
                        return;
                    }
                    throw null;
                }
                if (((adu)object).D != 1) {
                    ((heg)((heg)a.h()).j("com/google/android/apps/speech/tts/googletts/audio/ExoPlayerDecoder", "configure", 514, "ExoPlayerDecoder.java")).r("Decoding multichannel audio not supported");
                    this.b(iim.e, "multichannel_audio_not_supported");
                    return;
                }
                this.l = ((adu)object).E;
                object = new aff(((adu)object).E, ((adu)object).D, ((adu)object).F);
                object2 = this.i;
                try {
                    aff aff2;
                    if (((aff)object).d != 2) break block11;
                    ((afj)object2).d = object;
                    ((afj)object2).e = aff2 = new aff(24000, ((aff)object).c, 2);
                    ((afj)object2).h = true;
                    object = this.i;
                    if (((afj)object).a()) {
                        ((afj)object).f = ((afj)object).d;
                        ((afj)object).g = ((afj)object).e;
                        if (((afj)object).h) {
                            object2 = ((afj)object).f;
                            ((afj)object).i = new afi(((aff)object2).b, ((aff)object2).c, ((afj)object).b, ((afj)object).c, ((afj)object).g.b);
                        } else {
                            object2 = ((afj)object).i;
                            if (object2 != null) {
                                ((afi)object2).k = 0;
                                ((afi)object2).m = 0;
                                ((afi)object2).o = 0;
                                ((afi)object2).p = 0;
                                ((afi)object2).q = 0;
                                ((afi)object2).r = 0;
                                ((afi)object2).s = 0;
                                ((afi)object2).t = 0;
                                ((afi)object2).u = 0;
                                ((afi)object2).v = 0;
                            }
                        }
                    }
                    ((afj)object).l = afj.a;
                    ((afj)object).m = 0L;
                    ((afj)object).n = 0L;
                    this.j.d();
                    this.g = 3;
                    return;
                }
                catch (afg afg2) {
                    a.as(a.g(), "Failed to configure SonicAudioProcessor with output format", "com/google/android/apps/speech/tts/googletts/audio/ExoPlayerDecoder", "configure", '\u0211', "ExoPlayerDecoder.java", afg2);
                    this.b(iim.b, "sonic_configure_failed");
                    return;
                }
            }
            object2 = new afg((aff)object);
            throw object2;
        }
        throw null;
    }

    @Override
    public final long x() {
        return this.k;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final boolean y(ByteBuffer var1_1) {
        block32: {
            block33: {
                block31: {
                    block34: {
                        block38: {
                            block37: {
                                block36: {
                                    block35: {
                                        var35_2 = brq.a;
                                        var33_3 = (heg)var35_2.c();
                                        var31_4 = "com/google/android/apps/speech/tts/googletts/audio/ExoPlayerDecoder";
                                        var32_5 = "handleBuffer";
                                        var34_6 = "ExoPlayerDecoder.java";
                                        ((heg)var33_3.j("com/google/android/apps/speech/tts/googletts/audio/ExoPlayerDecoder", "handleBuffer", 549, "ExoPlayerDecoder.java")).s("Decoder got new buffer of %d bytes", var1_1.remaining());
                                        var7_7 = this.g;
                                        if (var7_7 == 0) break block32;
                                        if (var7_7 == 4 || var7_7 == 1) break block33;
                                        if (var7_7 != 3) {
                                            ((heg)((heg)var35_2.h()).j("com/google/android/apps/speech/tts/googletts/audio/ExoPlayerDecoder", "handleBuffer", 560, "ExoPlayerDecoder.java")).r("Sink configure failed, sink cannot handle buffers, stopping");
                                            this.b(iim.b, "buffer_after_start_failed");
                                            return false;
                                        }
                                        var16_8 = this.k;
                                        var7_7 = var1_1.remaining();
                                        var8_9 = this.l;
                                        this.k = var16_8 += (long)(var7_7 * 1000000 / (var8_9 + var8_9));
                                        if (var16_8 > 10000000L) {
                                            this.b(iim.e, "max_audio_duration_exceeded");
                                            return false;
                                        }
                                        if (!this.i.a()) break block34;
                                        var33_3 = this.i;
                                        if (var1_1.hasRemaining()) break block35;
                                        var32_5 = "com/google/android/apps/speech/tts/googletts/audio/ExoPlayerDecoder";
                                        var33_3 = "handleBuffer";
                                        var1_1 = "ExoPlayerDecoder.java";
                                        ** GOTO lbl198
                                    }
                                    var35_2 = var33_3.i;
                                    abr.i(var35_2);
                                    var36_10 = var1_1.asShortBuffer();
                                    var9_11 = var1_1.remaining();
                                    var33_3.m += (long)var9_11;
                                    var7_7 = var36_10.remaining();
                                    var8_9 = var35_2.b;
                                    var7_7 /= var8_9;
                                    var35_2.j = var35_2.e(var35_2.j, var35_2.k, var7_7);
                                    var36_10.get(var35_2.j, var35_2.k * var35_2.b, ((var8_9 *= var7_7) + var8_9) / 2);
                                    var35_2.k = var14_12 = var35_2.k + var7_7;
                                    var13_13 /* !! */  = var35_2.m;
                                    var4_14 = var35_2.c / var35_2.d;
                                    var2_15 = var4_14;
                                    if (var2_15 > 1.00001 || var2_15 < 0.99999) break block36;
                                    var35_2.b(var35_2.j, 0, var14_12);
                                    var35_2.k = 0;
                                    break block37;
                                }
                                if (var14_12 >= var35_2.h) break block38;
                            }
                            var32_5 = "com/google/android/apps/speech/tts/googletts/audio/ExoPlayerDecoder";
                            var33_3 = "handleBuffer";
                            ** GOTO lbl136
                        }
                        var10_16 = 0;
                        while (true) {
                            block39: {
                                if ((var7_7 = var35_2.r) > 0) {
                                    var7_7 = Math.min(var35_2.h, var7_7);
                                    var35_2.b(var35_2.j, var10_16, var7_7);
                                    var35_2.r -= var7_7;
                                    var7_7 = var10_16 + var7_7;
                                } else {
                                    var36_10 = var35_2.j;
                                    var7_7 = var35_2.a;
                                    var8_9 = var7_7 > 4000 ? var7_7 / 4000 : 1;
                                    if (var35_2.b == 1 && var8_9 == 1) {
                                        var7_7 = var35_2.a((short[])var36_10, var10_16, var35_2.f, var35_2.g);
                                    } else {
                                        var35_2.c((short[])var36_10, var10_16, var8_9);
                                        var33_3 = var35_2.i;
                                        var11_19 = var35_2.f;
                                        var7_7 = var35_2.g / var8_9;
                                        var7_7 = var11_19 = var35_2.a((short[])var33_3, 0, var11_19 / var8_9, var7_7);
                                        if (var8_9 != 1) {
                                            var12_20 /* !! */  = var11_19 * var8_9;
                                            var15_21 = var8_9 * 4;
                                            var11_19 = var35_2.f;
                                            var8_9 = var12_20 /* !! */  - var15_21;
                                            var7_7 = var11_19;
                                            if (var8_9 >= var11_19) {
                                                var7_7 = var8_9;
                                            }
                                            var11_19 = var35_2.g;
                                            var8_9 = var12_20 /* !! */  += var15_21;
                                            if (var12_20 /* !! */  > var11_19) {
                                                var8_9 = var11_19;
                                            }
                                            if (var35_2.b == 1) {
                                                var7_7 = var35_2.a((short[])var36_10, var10_16, var7_7, var8_9);
                                            } else {
                                                var35_2.c((short[])var36_10, var10_16, 1);
                                                var7_7 = var35_2.a(var35_2.i, 0, var7_7, var8_9);
                                            }
                                        }
                                    }
                                    var12_20 /* !! */  = var35_2.u;
                                    var11_19 = var35_2.v;
                                    if (var12_20 /* !! */  == 0 || (var8_9 = var35_2.s) == 0 || var11_19 > var12_20 /* !! */  * 3 || var12_20 /* !! */  + var12_20 /* !! */  <= var35_2.t * 3) {
                                        var8_9 = var7_7;
                                    }
                                    var11_19 = var10_16 + var8_9;
                                    var35_2.t = var12_20 /* !! */ ;
                                    var35_2.s = var7_7;
                                    var5_17 = var8_9;
                                    if (var2_15 > 1.0) {
                                        var33_3 = var35_2.j;
                                        var6_18 = -1.0f + var4_14;
                                        if (var4_14 >= 2.0f) {
                                            var7_7 = (int)(var5_17 / var6_18);
                                        } else {
                                            var35_2.r = (int)(var5_17 * (2.0f - var4_14) / var6_18);
                                            var7_7 = var8_9;
                                        }
                                        var35_2.l = var35_2.e(var35_2.l, var35_2.m, var7_7);
                                        afi.d(var7_7, var35_2.b, var35_2.l, var35_2.m, (short[])var33_3, var10_16, (short[])var33_3, var11_19);
                                        var35_2.m += var7_7;
                                        var7_7 = var10_16 + (var8_9 + var7_7);
                                    } else {
                                        var36_10 = var35_2.j;
                                        var6_18 = 1.0f - var4_14;
                                        if (var4_14 < 0.5f) {
                                            var7_7 = (int)(var5_17 * var4_14 / var6_18);
                                        } else {
                                            var35_2.r = (int)(var5_17 * (var4_14 + var4_14 - 1.0f) / var6_18);
                                            var7_7 = var8_9;
                                        }
                                        var33_3 = var35_2.l;
                                        var15_21 = var35_2.m;
                                        var12_20 /* !! */  = var8_9 + var7_7;
                                        var35_2.l = var35_2.e((short[])var33_3, var15_21, var12_20 /* !! */ );
                                        var15_21 = var35_2.b;
                                        System.arraycopy(var36_10, var10_16 * var15_21, var35_2.l, var35_2.m * var15_21, var15_21 * var8_9);
                                        afi.d(var7_7, var35_2.b, var35_2.l, var35_2.m + var8_9, (short[])var36_10, var11_19, (short[])var36_10, var10_16);
                                        var35_2.m += var12_20 /* !! */ ;
                                        var7_7 = var10_16 + var7_7;
                                    }
                                }
                                if (var35_2.h + var7_7 <= var14_12) break block39;
                                var10_16 = var35_2.k - var7_7;
                                var33_3 = var35_2.j;
                                var8_9 = var35_2.b;
                                System.arraycopy(var33_3, var7_7 * var8_9, var33_3, 0, var8_9 * var10_16);
                                var35_2.k = var10_16;
                                var33_3 = var32_5;
                                var32_5 = var31_4;
lbl136:
                                // 2 sources

                                var4_14 = var35_2.d;
                                var4_14 = var35_2.e * var4_14;
                                if (var4_14 != 1.0f && var35_2.m != var13_13 /* !! */ ) {
                                    var7_7 = var35_2.a;
                                    var4_14 = (float)var7_7 / var4_14;
                                    var16_8 = var7_7;
                                    for (var18_22 = (long)var4_14; var18_22 != 0L && var16_8 != 0L && var18_22 % 2L == 0L && var16_8 % 2L == 0L; var18_22 /= 2L, var16_8 /= 2L) {
                                    }
                                    var8_9 = var35_2.m - var13_13 /* !! */ ;
                                    var35_2.n = var35_2.e(var35_2.n, var35_2.o, var8_9);
                                    var31_4 = var35_2.l;
                                    var7_7 = var35_2.b;
                                    System.arraycopy(var31_4, var13_13 /* !! */  * var7_7, var35_2.n, var35_2.o * var7_7, var7_7 * var8_9);
                                    var35_2.m = var13_13 /* !! */ ;
                                    var35_2.o += var8_9;
                                    var7_7 = var9_11;
                                    var31_4 = var34_6;
                                    for (var8_9 = 0; var8_9 < (var9_11 = (var10_16 = var35_2.o) - 1); ++var8_9) {
                                        while ((var22_24 = (long)(var9_11 = var35_2.p + 1)) * var18_22 > (var20_23 = (long)var35_2.q) * var16_8) {
                                            var35_2.l = var35_2.e(var35_2.l, var35_2.m, 1);
                                            for (var9_11 = 0; var9_11 < (var10_16 = var35_2.b); ++var9_11) {
                                                var34_6 = var35_2.l;
                                                var11_19 = var35_2.m;
                                                var36_10 = var35_2.n;
                                                var13_13 /* !! */  = var8_9 * var10_16 + var9_11;
                                                var12_20 /* !! */  = (int)var36_10[var13_13 /* !! */ ];
                                                var13_13 /* !! */  = (int)var36_10[var13_13 /* !! */  + var10_16];
                                                var28_27 = var35_2.q;
                                                var14_12 = var35_2.p;
                                                var26_26 = var14_12;
                                                var24_25 = (long)(var14_12 + 1) * var18_22;
                                                var20_23 = var12_20 /* !! */ ;
                                                var22_24 = var13_13 /* !! */ ;
                                                var26_26 = var24_25 - var26_26 * var18_22;
                                                var34_6[var11_19 * var10_16 + var9_11] = (short)(((var24_25 -= var28_27 * var16_8) * var20_23 + (var26_26 - var24_25) * var22_24) / var26_26);
                                            }
                                            ++var35_2.q;
                                            ++var35_2.m;
                                        }
                                        var35_2.p = var9_11;
                                        if (var22_24 != var16_8) continue;
                                        var35_2.p = 0;
                                        var30_28 = var20_23 == var18_22;
                                        abr.f(var30_28);
                                        var35_2.q = 0;
                                    }
                                    var34_6 = var31_4;
                                    var8_9 = var7_7;
                                    var31_4 = var34_6;
                                    if (var9_11 != 0) {
                                        var31_4 = var35_2.n;
                                        var8_9 = var35_2.b;
                                        System.arraycopy(var31_4, var9_11 * var8_9, var31_4, 0, (var10_16 - var9_11) * var8_9);
                                        var35_2.o -= var9_11;
                                        var8_9 = var7_7;
                                        var31_4 = var34_6;
                                    }
                                } else {
                                    var31_4 = "ExoPlayerDecoder.java";
                                    var8_9 = var9_11;
                                }
                                var1_1.position(var1_1.position() + var8_9);
                                var1_1 = var31_4;
lbl198:
                                // 2 sources

                                var34_6 = this.i;
                                var31_4 = var34_6.i;
                                if (var31_4 != null && (var9_11 = (var7_7 = var31_4.m * var31_4.b) + var7_7) > 0) {
                                    if (var34_6.j.capacity() < var9_11) {
                                        var34_6.j = ByteBuffer.allocateDirect(var9_11).order(ByteOrder.nativeOrder());
                                        var34_6.k = var34_6.j.asShortBuffer();
                                    } else {
                                        var34_6.j.clear();
                                        var34_6.k.clear();
                                    }
                                    var35_2 = var34_6.k;
                                    var7_7 = Math.min(var35_2.remaining() / var31_4.b, var31_4.m);
                                    var35_2.put(var31_4.l, 0, var31_4.b * var7_7);
                                    var31_4.m = var10_16 = var31_4.m - var7_7;
                                    var35_2 = var31_4.l;
                                    var8_9 = var31_4.b;
                                    System.arraycopy(var35_2, var7_7 * var8_9, var35_2, 0, var10_16 * var8_9);
                                    var34_6.n += (long)var9_11;
                                    var34_6.j.limit(var9_11);
                                    var34_6.l = var34_6.j;
                                }
                                var31_4 = var34_6.l;
                                var34_6.l = afj.a;
                                break block31;
                            }
                            var10_16 = var7_7;
                        }
                    }
                    var31_4 = (heg)var35_2.c();
                    var34_6 = "ExoPlayerDecoder.java";
                    var32_5 = "com/google/android/apps/speech/tts/googletts/audio/ExoPlayerDecoder";
                    var33_3 = "handleBuffer";
                    ((heg)var31_4.j("com/google/android/apps/speech/tts/googletts/audio/ExoPlayerDecoder", "handleBuffer", 583, "ExoPlayerDecoder.java")).r("Decoder will not resample");
                    var31_4 = var1_1;
                    var1_1 = var34_6;
                }
                if (!this.j.c(var31_4.asReadOnlyBuffer())) {
                    ((heg)((heg)brq.a.h()).j((String)var32_5, (String)var33_3, 588, (String)var1_1)).r("Decoder caller failed to process audio, stopping");
                    this.b(iim.b, "audio_available_callback_failed");
                    return false;
                }
                return true;
            }
            ((heg)((heg)var35_2.h()).j("com/google/android/apps/speech/tts/googletts/audio/ExoPlayerDecoder", "handleBuffer", 553, "ExoPlayerDecoder.java")).r("Stopped or reset sink ignoring new buffer");
            return false;
        }
        throw null;
    }
}

