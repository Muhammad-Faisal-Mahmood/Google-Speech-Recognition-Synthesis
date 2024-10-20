/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import j$.time.Duration;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.impl.CronetUrlRequest;

public final class kra
implements Runnable {
    final Object a;
    private final int b;

    public /* synthetic */ kra(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public kra(kom kom2, int n2) {
        this.b = n2;
        this.a = kom2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        var1_1 = this.b;
        var3_2 = 0;
        switch (var1_1) {
            default: {
                ((krr)this.a).a();
                return;
            }
            case 9: {
                var20_3 = this.a;
                try {
                    var17_5 = ((krq)var20_3).d;
                    var19_19 = var17_5.s;
                    var14_23 = var17_5.r;
                    var17_5 = var17_5.x;
                    if (var17_5 != null) {
                        var18_24 = var17_5.c();
                        var21_34 = ((krq)var20_3).d.x;
                        var17_5 = var21_34.d;
                        var2_35 = var21_34.a;
                        var16_36 = var21_34.c;
                    } else {
                        var18_24 = Collections.emptyMap();
                        var16_36 = false;
                        var2_35 = 0;
                        var17_5 = "";
                    }
                    if (var16_36) {
                        var10_37 = 0L;
                        var12_38 = 0L;
                    } else {
                        var21_34 = ((krq)var20_3).d.e.entrySet().iterator();
                        var6_39 = 0L;
                        while (var21_34.hasNext()) {
                            var23_42 = var21_34.next();
                            var22_41 = (String)var23_42.getKey();
                            var8_40 = var6_39;
                            if (var22_41 != null) {
                                var8_40 = var6_39 + (long)var22_41.length();
                            }
                            var22_41 = (String)var23_42.getValue();
                            var6_39 = var8_40;
                            if (var22_41 == null) continue;
                            var6_39 = var8_40 + (long)var22_41.length();
                        }
                        var12_38 = -1L;
                        var10_37 = var6_39;
                    }
                    if (var16_36) {
                        var6_39 = 0L;
                        var8_40 = 0L;
                    } else {
                        if (var18_24 == null) {
                            var6_39 = 0L;
                        } else {
                            var21_34 = var18_24.entrySet().iterator();
                            var8_40 = 0L;
                            block30: while (true) {
                                var6_39 = var8_40;
                                if (!var21_34.hasNext()) break;
                                var22_41 = (Map.Entry)var21_34.next();
                                var23_42 = (String)var22_41.getKey();
                                var6_39 = var8_40;
                                if (var23_42 != null) {
                                    var6_39 = var8_40 + (long)var23_42.length();
                                }
                                if (var22_41.getValue() == null) {
                                    var8_40 = var6_39;
                                    continue;
                                }
                                var22_41 = ((List)var22_41.getValue()).iterator();
                                while (true) {
                                    var8_40 = var6_39;
                                    if (var22_41.hasNext()) ** break;
                                    continue block30;
                                    var23_42 = (String)var22_41.next();
                                    if (var23_42 == null) continue;
                                    var6_39 += (long)var23_42.length();
                                }
                                break;
                            }
                        }
                        if (var18_24.containsKey("Content-Length")) {
                            var18_24 = (String)((List)var18_24.get("Content-Length")).get(0);
                            try {
                                var8_40 = Long.parseLong((String)var18_24);
                            }
                            catch (NumberFormatException var18_25) {
                                var8_40 = 0L;
                            }
                        } else {
                            var8_40 = -1L;
                        }
                    }
                    var21_34 = Duration.ofSeconds(0L);
                    var18_24 = Duration.ofSeconds(0L);
                    var1_1 = ((krq)var20_3).d.g.get();
                    if (var1_1 == 6) ** GOTO lbl94
                    if (var1_1 != 7) {
                        if (var1_1 != 8) {
                            var17_5 = new IllegalStateException(a.ah(var1_1, "Internal Cronet error: attempted to report metrics but current state (", ") is not a done state!"));
                            throw var17_5;
                        }
                        var1_1 = 3;
                    } else {
                        var1_1 = 1;
                    }
                    ** GOTO lbl95
lbl94:
                    // 1 sources

                    var1_1 = 2;
lbl95:
                    // 3 sources

                    var23_42 = ((krq)var20_3).d;
                    var4_43 = var23_42.v;
                    var5_44 = var23_42.u;
                    var20_3 = var23_42.y;
                    if (var20_3 != null) {
                        var3_2 = var20_3.g;
                    }
                    var22_41 = new Iterator<E>(var10_37, var12_38, var6_39, var8_40, var2_35, (Duration)var21_34, (Duration)var18_24, (String)var17_5, false, false, var1_1, var4_43, var5_44, var3_2, false, var23_42.w);
                    var19_19.d(var14_23, (kqv)var22_41);
                    return;
                }
                catch (RuntimeException var17_6) {
                    Log.i((String)krs.a, (String)"Error while trying to log CronetTrafficInfo: ", (Throwable)var17_6);
                    return;
                }
            }
            case 8: {
                var17_7 = (krs)this.a;
                var17_7.m = var17_7.o;
                var17_7.o = null;
                var17_7.l();
                return;
            }
            case 7: {
                var17_8 = (krs)this.a;
                ++var17_8.v;
                return;
            }
            case 6: {
                var17_9 = (krs)this.a;
                var18_26 = var17_9.n;
                if (var18_26 != null) {
                    try {
                        var18_26.close();
                    }
                    catch (IOException var18_27) {
                        var18_27.printStackTrace();
                    }
                    var17_9.n = null;
                }
                return;
            }
            case 5: {
                var17_10 = (krs)this.a;
                var18_28 = var17_10.m;
                var17_10.f.add(var18_28);
                var17_10.l();
                return;
            }
            case 4: {
                var17_11 = (krs)this.a;
                var18_29 = var17_11.y;
                if (var18_29 != null) {
                    try {
                        var18_29.h();
                    }
                    catch (IOException var18_30) {
                        Log.e((String)krs.a, (String)"Exception when closing OutputChannel", (Throwable)var18_30);
                    }
                }
                if ((var18_29 = var17_11.p) != null) {
                    var18_29.disconnect();
                    var17_11.p = null;
                }
                return;
            }
            case 3: {
                var17_12 = (krk)this.a;
                ++var17_12.g;
                return;
            }
            case 2: {
                try {
                    var18_31 = this.a;
                    var17_13 = ((CronetUrlRequest)var18_31).e;
                    var19_20 = ((CronetUrlRequest)var18_31).h;
                    var20_4 = ((CronetUrlRequest)var18_31).g;
                    var17_13.a((kpt)var18_31, var19_20, var20_4);
                }
                catch (Exception var17_14) {
                    ((CronetUrlRequest)this.a).i("onFailed", var17_14);
                }
                ((CronetUrlRequest)this.a).h();
                return;
            }
            case 1: {
                var17_15 = ((CronetUrlRequest)this.a).c;
                synchronized (var17_15) {
                    var18_32 = this.a;
                    if (((CronetUrlRequest)var18_32).m()) {
                        return;
                    }
                    ((CronetUrlRequest)var18_32).g(0);
                }
                try {
                    var17_15 = this.a;
                    var18_32 = ((CronetUrlRequest)var17_15).e;
                    var19_21 = ((CronetUrlRequest)var17_15).h;
                    var18_32.e((kpt)var17_15, var19_21);
                }
                catch (Exception var17_16) {
                    ((CronetUrlRequest)this.a).i("onSucceeded", var17_16);
                }
                ((CronetUrlRequest)this.a).h();
                return;
            }
            case 0: 
        }
        try {
            var17_17 = this.a;
            var19_22 = ((CronetUrlRequest)var17_17).e;
            var18_33 = ((CronetUrlRequest)var17_17).h;
            var19_22.f((kpt)var17_17, var18_33);
        }
        catch (Exception var17_18) {
            ((CronetUrlRequest)this.a).i("onCanceled", var17_18);
        }
        ((CronetUrlRequest)this.a).h();
    }
}

