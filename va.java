/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.os.Build$VERSION
 *  android.view.MotionEvent
 *  android.view.VelocityTracker
 *  android.view.ViewConfiguration
 */
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import j$.util.Objects;

public final class va {
    private final Context a;
    private final vb b;
    private VelocityTracker c;
    private float d;
    private int e = -1;
    private int f = -1;
    private int g = -1;
    private final int[] h = new int[]{Integer.MAX_VALUE, 0};

    public va(Context context, vb vb2) {
        this.a = context;
        this.b = vb2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(MotionEvent var1_1, int var2_2) {
        block33: {
            block34: {
                block31: {
                    block32: {
                        var6_3 /* !! */  = var2_2;
                        var9_4 = var1_1 /* !! */ .getSource();
                        var8_5 = var1_1 /* !! */ .getDeviceId();
                        if (this.f == var9_4 && this.g == var8_5 && this.e == var6_3 /* !! */ ) {
                            var2_2 = 0;
                        } else {
                            var18_6 = this.a;
                            var16_7 /* !! */  = this.h;
                            var17_8 /* !! */  = ViewConfiguration.get((Context)var18_6);
                            var7_9 = var1_1 /* !! */ .getDeviceId();
                            var10_10 = var1_1 /* !! */ .getSource();
                            if (Build.VERSION.SDK_INT >= 34) {
                                var7_9 = mk$$ExternalSyntheticApiModelOutline0.m(var17_8 /* !! */ , var7_9, var6_3 /* !! */ , var10_10);
                            } else if (!vy.g(var7_9, var6_3 /* !! */ , var10_10)) {
                                var7_9 = 0x7FFFFFFF;
                            } else {
                                var19_11 = var18_6.getResources();
                                var7_9 = var10_10 == 0x400000 && var6_3 /* !! */  == 26 ? vy.f(var19_11, "config_viewMinRotaryEncoderFlingVelocity", "dimen") : -1;
                                Objects.requireNonNull(var17_8 /* !! */ );
                                var7_9 = vy.e(var19_11, var7_9, new wk(var17_8 /* !! */ , 0), 0x7FFFFFFF);
                            }
                            var16_7 /* !! */ [0] = var7_9;
                            var10_10 = var1_1 /* !! */ .getDeviceId();
                            var7_9 = var1_1 /* !! */ .getSource();
                            if (Build.VERSION.SDK_INT >= 34) {
                                var7_9 = mk$$ExternalSyntheticApiModelOutline0.m$1(var17_8 /* !! */ , var10_10, var6_3 /* !! */ , var7_9);
                            } else if (!vy.g(var10_10, var6_3 /* !! */ , var7_9)) {
                                var7_9 = -2147483648;
                            } else {
                                var18_6 = var18_6.getResources();
                                if (var7_9 == 0x400000 && var6_3 /* !! */  == 26) {
                                    var7_9 = vy.f((Resources)var18_6, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
                                    var2_2 = 26;
                                } else {
                                    var2_2 = var6_3 /* !! */ ;
                                    var7_9 = -1;
                                }
                                Objects.requireNonNull(var17_8 /* !! */ );
                                var7_9 = vy.e((Resources)var18_6, var7_9, new wk(var17_8 /* !! */ , 1), -2147483648);
                            }
                            var16_7 /* !! */ [1] = var7_9;
                            this.f = var9_4;
                            this.g = var8_5;
                            this.e = var6_3 /* !! */ ;
                            var6_3 /* !! */  = var2_2;
                            var2_2 = 1;
                        }
                        if (this.h[0] != 0x7FFFFFFF) break block32;
                        var1_1 /* !! */  = this.c;
                        if (var1_1 /* !! */  != null) {
                            var1_1 /* !! */ .recycle();
                            this.c = null;
                            return;
                        }
                        break block33;
                    }
                    if (this.c == null) {
                        this.c = VelocityTracker.obtain();
                    }
                    var16_7 /* !! */  = (int[])this.c;
                    var17_8 /* !! */  = vq.a;
                    var16_7 /* !! */ .addMovement(var1_1 /* !! */ );
                    if (Build.VERSION.SDK_INT < 34 && var1_1 /* !! */ .getSource() == 0x400000) {
                        if (!vq.a.containsKey(var16_7 /* !! */ )) {
                            vq.a.put(var16_7 /* !! */ , new vr());
                        }
                        var17_8 /* !! */  = (vr)vq.a.get(var16_7 /* !! */ );
                        var12_12 /* !! */  = var1_1 /* !! */ .getEventTime();
                        var7_9 = var8_5 = var17_8 /* !! */ .d;
                        if (var8_5 != 0) {
                            var7_9 = var8_5;
                            if (var12_12 /* !! */  - var17_8 /* !! */ .b[var17_8 /* !! */ .e] > 40L) {
                                var17_8 /* !! */ .d = 0;
                                var17_8 /* !! */ .c = 0.0f;
                                var7_9 = 0;
                            }
                        }
                        var17_8 /* !! */ .e = var8_5 = (var17_8 /* !! */ .e + 1) % 20;
                        if (var7_9 != 20) {
                            var17_8 /* !! */ .d = var7_9 + 1;
                        }
                        var17_8 /* !! */ .a[var8_5] = var1_1 /* !! */ .getAxisValue(26);
                        var17_8 /* !! */ .b[var17_8 /* !! */ .e] = var12_12 /* !! */ ;
                    }
                    var16_7 /* !! */ .computeCurrentVelocity(1000, 3.4028235E38f);
                    var1_1 /* !! */  = vq.a((VelocityTracker)var16_7 /* !! */ );
                    if (var1_1 /* !! */  == null) break block34;
                    var7_9 = var1_1 /* !! */ .d;
                    if (var7_9 < 2) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            var3_13 = 0.0f;
                            break block31;
                            break;
                        }
                    }
                    var8_5 = var1_1 /* !! */ .e;
                    var14_14 /* !! */  = var1_1 /* !! */ .b[var8_5];
                    var7_9 = (var8_5 + 20 - (var7_9 - 1)) % 20;
                    while (var14_14 /* !! */  - (var12_12 /* !! */  = (long)(var17_8 /* !! */  = (ViewConfiguration)var1_1 /* !! */ .b)[var7_9]) > 100L) {
                        --var1_1 /* !! */ .d;
                        var7_9 = (var7_9 + 1) % 20;
                    }
                    var8_5 = var1_1 /* !! */ .d;
                    if (var8_5 < 2) ** GOTO lbl-1000
                    if (var8_5 == 2) {
                        var14_14 /* !! */  = (long)var17_8 /* !! */ [var7_9 = (var7_9 + 1) % 20];
                        if (var12_12 /* !! */  != var14_14 /* !! */ ) ** break;
                        ** continue;
                        var3_13 = var1_1 /* !! */ .a[var7_9] / (float)(var14_14 /* !! */  - var12_12 /* !! */ );
                    } else {
                        var3_13 = 0.0f;
                        var9_4 = 0;
                        for (var8_5 = 0; var8_5 < var1_1 /* !! */ .d - 1; ++var8_5) {
                            var17_8 /* !! */  = (ViewConfiguration)var1_1 /* !! */ .b;
                            var10_10 = var8_5 + var7_9;
                            var11_17 = (var10_10 + 1) % 20;
                            var12_12 /* !! */  = (long)var17_8 /* !! */ [var10_10 % 20];
                            if (var17_8 /* !! */ [var11_17] == var12_12 /* !! */ ) continue;
                            var10_10 = var9_4 + 1;
                            var5_16 = vr.a(var3_13);
                            var4_15 = var1_1 /* !! */ .a[var11_17] / (float)(var1_1 /* !! */ .b[var11_17] - var12_12 /* !! */ );
                            var3_13 = var4_15 = var3_13 + (var4_15 - var5_16) * Math.abs(var4_15);
                            var9_4 = var10_10;
                            if (var10_10 != 1) continue;
                            var3_13 = var4_15 * 0.5f;
                            var9_4 = var10_10;
                        }
                        var3_13 = vr.a(var3_13);
                    }
                }
                var1_1 /* !! */ .c = var3_13 *= 1000.0f;
                if (var3_13 < -Math.abs(3.4028235E38f)) {
                    var1_1 /* !! */ .c = -Math.abs(3.4028235E38f);
                } else if (var1_1 /* !! */ .c > Math.abs(3.4028235E38f)) {
                    var1_1 /* !! */ .c = Math.abs(3.4028235E38f);
                }
            }
            var3_13 = Build.VERSION.SDK_INT >= 34 ? mk$$ExternalSyntheticApiModelOutline0.m((VelocityTracker)var16_7 /* !! */ , var6_3 /* !! */ ) : ((var1_1 /* !! */  = vq.a((VelocityTracker)var16_7 /* !! */ )) != null && var6_3 /* !! */  == 26 ? var1_1 /* !! */ .c : 0.0f);
            var4_15 = Math.signum(var3_13 *= this.b.a());
            if (var2_2 != 0 || var4_15 != Math.signum(this.d) && var4_15 != 0.0f) {
                this.b.b();
            }
            if (!((var4_15 = Math.abs(var3_13)) < (float)(var1_1 /* !! */  = (MotionEvent)this.h)[0])) {
                var6_3 /* !! */  = (int)var1_1 /* !! */ [1];
                var2_2 = -var6_3 /* !! */ ;
                var3_13 = Math.min(var3_13, (float)var6_3 /* !! */ );
                if (!this.b.c(var3_13 = Math.max((float)var2_2, var3_13))) {
                    var3_13 = 0.0f;
                }
                this.d = var3_13;
            }
        }
    }
}

