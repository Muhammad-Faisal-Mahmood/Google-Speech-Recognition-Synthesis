/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.DeniedByServerException
 *  android.media.MediaCodec$CryptoException
 *  android.media.MediaDrm$MediaDrmStateException
 *  android.media.MediaDrmResetException
 *  android.media.NotProvisionedException
 *  android.media.metrics.NetworkEvent$Builder
 *  android.media.metrics.PlaybackErrorEvent$Builder
 *  android.media.metrics.PlaybackStateEvent$Builder
 *  android.os.SystemClock
 *  android.system.ErrnoException
 *  android.system.OsConstants
 *  android.util.SparseArray
 */
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackStateEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.SparseArray;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

public final class akf
implements afs {
    public final akl a;
    public final aes b;

    public /* synthetic */ akf(akl akl2, aes aes2) {
        this.a = akl2;
        this.b = aes2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void a(Object var1_1, ads var2_2) {
        block64: {
            block87: {
                block88: {
                    block65: {
                        block63: {
                            block86: {
                                block85: {
                                    block84: {
                                        block83: {
                                            block82: {
                                                block78: {
                                                    block81: {
                                                        block80: {
                                                            block72: {
                                                                block67: {
                                                                    block69: {
                                                                        block79: {
                                                                            block70: {
                                                                                block73: {
                                                                                    block77: {
                                                                                        block76: {
                                                                                            block75: {
                                                                                                block74: {
                                                                                                    block71: {
                                                                                                        block68: {
                                                                                                            block66: {
                                                                                                                var15_3 = (ako)var1_1;
                                                                                                                var1_1 = new SparseArray(var2_2.b());
                                                                                                                var6_4 = 0;
                                                                                                                for (var3_5 = 0; var3_5 < var2_2.b(); ++var3_5) {
                                                                                                                    var16_6 = this.a;
                                                                                                                    var4_7 = var2_2.a(var3_5);
                                                                                                                    var16_6 = (akc)var16_6.c.get(var4_7);
                                                                                                                    abr.i(var16_6);
                                                                                                                    var1_1.append(var4_7, var16_6);
                                                                                                                }
                                                                                                                if (wa.z(var2_2) == 0) break block64;
                                                                                                                for (var3_5 = 0; var3_5 < wa.z(var2_2); ++var3_5) {
                                                                                                                    var4_7 = var2_2.a(var3_5);
                                                                                                                    var16_6 = wa.y(var4_7, (SparseArray)var1_1);
                                                                                                                    if (var4_7 == 0) {
                                                                                                                        var15_3.b.h((akc)var16_6);
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    if (var4_7 == 11) {
                                                                                                                        var15_3.b.g((akc)var16_6, var15_3.i);
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    var15_3.b.f((akc)var16_6);
                                                                                                                }
                                                                                                                var13_8 = SystemClock.elapsedRealtime();
                                                                                                                if (wa.x(0, var2_2)) {
                                                                                                                    var16_6 = wa.y(0, (SparseArray)var1_1);
                                                                                                                    if (var15_3.h != null) {
                                                                                                                        var15_3.c(var16_6.b, var16_6.d);
                                                                                                                    }
                                                                                                                }
                                                                                                                var16_6 = this.b;
                                                                                                                var5_9 = 2;
                                                                                                                if (wa.x(2, var2_2) && var15_3.h != null) {
                                                                                                                    var18_10 = var16_6.h().b;
                                                                                                                    var7_11 = var18_10.size();
                                                                                                                    block13: for (var3_5 = 0; var3_5 < var7_11; ++var3_5) {
                                                                                                                        var19_14 = (afc)var18_10.get(var3_5);
                                                                                                                        var4_7 = 0;
                                                                                                                        while (true) {
                                                                                                                            var8_12 = var19_14.a;
                                                                                                                            if (var4_7 > 0) continue block13;
                                                                                                                            if (var19_14.c[var4_7]) {
                                                                                                                                var17_13 = var19_14.b.a((int)var4_7).s;
                                                                                                                            }
                                                                                                                            ++var4_7;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                if (wa.x(1011, var2_2)) {
                                                                                                                    ++var15_3.o;
                                                                                                                }
                                                                                                                if ((var17_13 = var15_3.l) == null) break block65;
                                                                                                                var18_10 = var15_3.a;
                                                                                                                if (var17_13.a != 1001) break block66;
                                                                                                                var3_5 = 20;
                                                                                                                var4_7 = var6_4;
                                                                                                                break block63;
                                                                                                            }
                                                                                                            var19_14 = (ail)var17_13;
                                                                                                            var4_7 = var19_14.c == 1 ? 1 : 0;
                                                                                                            var7_11 = var19_14.g;
                                                                                                            var19_14 = var17_13.getCause();
                                                                                                            abr.i(var19_14);
                                                                                                            if (!(var19_14 instanceof IOException)) break block67;
                                                                                                            if (!(var19_14 instanceof ahf)) break block68;
                                                                                                            var4_7 = ((ahf)var19_14).c;
                                                                                                            var3_5 = 5;
                                                                                                            break block63;
                                                                                                        }
                                                                                                        if (var19_14 instanceof ahe || var19_14 instanceof aem) break block69;
                                                                                                        var9_15 = var19_14 instanceof ahd;
                                                                                                        if (var9_15 || var19_14 instanceof ahm) break block70;
                                                                                                        if (var17_13.a != 1002) break block71;
                                                                                                        var3_5 = 21;
                                                                                                        break block72;
                                                                                                    }
                                                                                                    if (!(var19_14 instanceof alb)) break block73;
                                                                                                    var18_10 = var19_14.getCause();
                                                                                                    abr.i(var18_10);
                                                                                                    if (!(var18_10 instanceof MediaDrm.MediaDrmStateException)) break block74;
                                                                                                    var4_7 = agf.f(((MediaDrm.MediaDrmStateException)var18_10).getDiagnosticInfo());
                                                                                                    var3_5 = ako.a(var4_7);
                                                                                                    break block63;
                                                                                                }
                                                                                                var3_5 = agf.a;
                                                                                                if (!(var18_10 instanceof MediaDrmResetException)) break block75;
                                                                                                var3_5 = 27;
                                                                                                break block72;
                                                                                            }
                                                                                            if (!(var18_10 instanceof NotProvisionedException)) break block76;
                                                                                            var3_5 = 24;
                                                                                            break block72;
                                                                                        }
                                                                                        if (!(var18_10 instanceof DeniedByServerException)) break block77;
                                                                                        var3_5 = 29;
                                                                                        break block72;
                                                                                    }
                                                                                    if (var18_10 instanceof ali) break block78;
                                                                                    var3_5 = var18_10 instanceof ala ? 28 : 30;
                                                                                    break block72;
                                                                                }
                                                                                if (var19_14 instanceof aha && var19_14.getCause() instanceof FileNotFoundException) {
                                                                                    var18_10 = var19_14.getCause();
                                                                                    abr.i(var18_10);
                                                                                    var18_10 = var18_10.getCause();
                                                                                    var9_15 = var18_10 instanceof ErrnoException;
                                                                                    var3_5 = var4_7 = 31;
                                                                                    if (var9_15) {
                                                                                        var3_5 = var4_7;
                                                                                        if (((ErrnoException)var18_10).errno == OsConstants.EACCES) {
                                                                                            var3_5 = 32;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    var3_5 = 9;
                                                                                }
                                                                                break block72;
                                                                            }
                                                                            if (jle.g((Context)var18_10).e() != 1) break block79;
                                                                            var3_5 = 3;
                                                                            break block72;
                                                                        }
                                                                        var18_10 = var19_14.getCause();
                                                                        if (var18_10 instanceof UnknownHostException) {
                                                                            var4_7 = 0;
                                                                            var3_5 = 6;
                                                                        } else if (var18_10 instanceof SocketTimeoutException) {
                                                                            var4_7 = 0;
                                                                            var3_5 = 7;
                                                                        } else if (var9_15 && ((ahd)var19_14).b == 1) {
                                                                            var4_7 = 0;
                                                                            var3_5 = 4;
                                                                        } else {
                                                                            var4_7 = 0;
                                                                            var3_5 = 8;
                                                                        }
                                                                        break block63;
                                                                    }
                                                                    var4_7 = 0;
                                                                    var3_5 = 11;
                                                                    break block63;
                                                                }
                                                                if (var4_7 == 0) break block80;
                                                                var3_5 = var6_4 = 35;
                                                                if (var7_11 == 0) break block72;
                                                                if (var7_11 != 1) break block80;
                                                                var3_5 = var6_4;
                                                            }
lbl140:
                                                            // 7 sources

                                                            while (true) {
                                                                var4_7 = 0;
                                                                break block63;
                                                                break;
                                                            }
                                                        }
                                                        if (var4_7 == 0 || var7_11 != 3) break block81;
                                                        var3_5 = 15;
                                                        ** GOTO lbl140
                                                    }
                                                    if (var4_7 == 0 || var7_11 != 2) break block82;
                                                }
                                                var3_5 = 23;
                                                ** GOTO lbl140
                                            }
                                            if (!(var19_14 instanceof aly)) break block83;
                                            var4_7 = agf.f(((aly)var19_14).d);
                                            var3_5 = 13;
                                            break block63;
                                        }
                                        var9_15 = var19_14 instanceof alw;
                                        var3_5 = 14;
                                        if (!var9_15) break block84;
                                        var4_7 = ((alw)var19_14).a;
                                        var3_5 = 14;
                                        break block63;
                                    }
                                    if (var19_14 instanceof OutOfMemoryError) ** GOTO lbl140
                                    if (!(var19_14 instanceof akv)) break block85;
                                    var18_10 = (akv)var19_14;
                                    var3_5 = 17;
                                    ** GOTO lbl140
                                }
                                if (!(var19_14 instanceof akw)) break block86;
                                var18_10 = (akw)var19_14;
                                var3_5 = 18;
                                ** GOTO lbl140
                            }
                            if (var19_14 instanceof MediaCodec.CryptoException) {
                                var4_7 = ((MediaCodec.CryptoException)var19_14).getErrorCode();
                                var3_5 = ako.a(var4_7);
                            } else {
                                var3_5 = 22;
                                ** continue;
                            }
                        }
                        ut$$ExternalSyntheticApiModelOutline0.m(var15_3.c, ut$$ExternalSyntheticApiModelOutline0.m(ut$$ExternalSyntheticApiModelOutline0.m(ut$$ExternalSyntheticApiModelOutline0.m$1(ut$$ExternalSyntheticApiModelOutline0.m(ut$$ExternalSyntheticApiModelOutline0.m(new PlaybackErrorEvent.Builder(), var13_8 - var15_3.d), var3_5), var4_7), (Exception)var17_13)));
                        var15_3.p = true;
                        var15_3.l = null;
                    }
                    if (!wa.x(2, var2_2)) break block87;
                    var17_13 = var16_6.h();
                    var12_16 = var17_13.a(2);
                    var11_17 = var17_13.a(1);
                    var9_15 = var10_18 = var17_13.a(3);
                    if (var12_16) break block88;
                    var9_15 = var10_18;
                    if (var11_17) break block88;
                    if (!var10_18) break block87;
                    var9_15 = true;
                }
                if (!var12_16) {
                    var15_3.f(var13_8, null);
                }
                if (!var11_17) {
                    var15_3.d(var13_8, null);
                }
                if (!var9_15) {
                    var15_3.e(var13_8, null);
                }
            }
            if (var15_3.h(var15_3.q)) {
                var17_13 = var15_3.q.c;
            }
            if (var15_3.h(var15_3.r)) {
                var17_13 = var15_3.r;
                var18_10 = var17_13.c;
                var3_5 = var17_13.a;
                var15_3.d(var13_8, (adu)var18_10);
                var15_3.r = null;
            }
            if (var15_3.h(var15_3.s)) {
                var18_10 = var15_3.s;
                var17_13 = var18_10.c;
                var3_5 = var18_10.a;
                var15_3.e(var13_8, (adu)var17_13);
                var15_3.s = null;
            }
            switch (jle.g(var15_3.a).e()) {
                default: {
                    var3_5 = 1;
                    break;
                }
                case 10: {
                    var3_5 = 7;
                    break;
                }
                case 9: {
                    var3_5 = 8;
                    break;
                }
                case 7: {
                    var3_5 = 3;
                    break;
                }
                case 5: {
                    var3_5 = 6;
                    break;
                }
                case 4: {
                    var3_5 = 5;
                    break;
                }
                case 3: {
                    var3_5 = 4;
                    break;
                }
                case 2: {
                    var3_5 = 2;
                    break;
                }
                case 1: {
                    var3_5 = 9;
                    break;
                }
                case 0: {
                    var3_5 = 0;
                }
            }
            if (var3_5 != var15_3.k) {
                var15_3.k = var3_5;
                ut$$ExternalSyntheticApiModelOutline0.m(var15_3.c, ut$$ExternalSyntheticApiModelOutline0.m(ut$$ExternalSyntheticApiModelOutline0.m(ut$$ExternalSyntheticApiModelOutline0.m(new NetworkEvent.Builder(), var3_5), var13_8 - var15_3.d)));
            }
            if (var16_6.d() != 2) {
                var15_3.m = false;
            }
            var17_13 = (aiy)var16_6;
            var17_13.t();
            if (var17_13.o.g == null) {
                var15_3.n = false;
            } else if (wa.x(10, var2_2)) {
                var15_3.n = true;
            }
            var3_5 = var16_6.d();
            if (var15_3.m) {
                var3_5 = 5;
            } else if (var15_3.n) {
                var3_5 = 13;
            } else if (var3_5 == 4) {
                var3_5 = 11;
            } else if (var3_5 == 2) {
                var4_7 = var15_3.j;
                var3_5 = var5_9;
                if (var4_7 != 0) {
                    var3_5 = var5_9;
                    if (var4_7 != 2) {
                        var3_5 = var4_7 == 12 ? var5_9 : (!var16_6.l() ? 7 : (var16_6.e() != 0 ? 10 : 6));
                    }
                }
            } else {
                var3_5 = var3_5 == 3 ? (!var16_6.l() ? 4 : (var16_6.e() != 0 ? 9 : 3)) : (var3_5 == 1 && var15_3.j != 0 ? 12 : var15_3.j);
            }
            if (var15_3.j != var3_5) {
                var15_3.j = var3_5;
                var15_3.p = true;
                ut$$ExternalSyntheticApiModelOutline0.m(var15_3.c, ut$$ExternalSyntheticApiModelOutline0.m(ut$$ExternalSyntheticApiModelOutline0.m(ut$$ExternalSyntheticApiModelOutline0.m(new PlaybackStateEvent.Builder(), var15_3.j), var13_8 - var15_3.d)));
            }
            if (wa.x(1028, var2_2)) {
                var15_3.b.e(wa.y(1028, (SparseArray)var1_1));
            }
        }
    }
}

