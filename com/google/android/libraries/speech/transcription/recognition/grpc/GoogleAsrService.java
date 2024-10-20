/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Context
 *  android.content.Intent
 *  android.os.IBinder
 *  gqv
 */
package com.google.android.libraries.speech.transcription.recognition.grpc;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

public final class GoogleAsrService
extends fht {
    private boolean a;
    private final goi b = new goi(this);
    private boolean c;
    private bzo d;

    @Deprecated
    public GoogleAsrService() {
        fpk.c();
    }

    @Override
    public final IBinder onBind(Intent object) {
        gop gop2;
        goi goi2 = this.b;
        if (object != null && fxf.l(object) != null) {
            gop2 = gop.d(fxf.k((Context)goi2.a));
            jse.b(gop2);
        } else {
            gop2 = goo.a;
            jse.b(gop2);
        }
        Object object2 = goi2.a;
        Object object3 = object2.getClass();
        gpc gpc2 = gno.b();
        object3 = String.valueOf(((Class)object3).getName()).concat(".onBind");
        if (object == null) {
            object2 = fxf.m((Service)object2, (String)object3);
        } else {
            gpc gpc3 = fxf.l(object);
            if (gpc3 == null) {
                object2 = fxf.m((Service)object2, (String)object3);
            } else {
                gno.w(gpc3);
                object2 = new gnh(3);
            }
        }
        object2 = new gog(fxf.at(goi2.f("onBind"), gqv.a, gop2), (gpf)object2, gpc2);
        try {
            super.onBind((Intent)object);
            object = this.d;
            if (object != null) {
                if (!this.c) {
                    object = ((htu)object.a).a();
                    return object;
                }
                object = new IllegalStateException("peer() called after destroyed.");
                throw object;
            }
            object = new IllegalStateException("peer() called before initialized.");
            throw object;
        }
        finally {
            try {
                object2.close();
            }
            catch (Throwable throwable) {
                Throwable throwable2;
                throwable2.addSuppressed(throwable);
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void onCreate() {
        block20: {
            block21: {
                block22: {
                    var1_1 = this.b.c();
                    this.a = true;
                    fxf.A(this.getApplication() instanceof ghv);
                    if (this.d != null) break block20;
                    if (!this.a) break block21;
                    if (this.c) break block22;
                    var3_3 = fxf.aq("CreateComponent");
                    {
                        block23: {
                            catch (Throwable var2_11) {
                                throw var2_11;
                            }
                            try {
                                this.bn();
                            }
                            catch (Throwable var2_8) {
                                try {
                                    var3_3.close();
                                    throw var2_8;
                                }
                                catch (Throwable var3_5) {
                                    var2_8.addSuppressed(var3_5);
                                    throw var2_8;
                                }
                            }
                            {
                                var3_3.close();
                                var2_6 = fxf.aq("CreatePeer");
                            }
                            var4_12 = this.bn();
                            ** GOTO lbl31
                            {
                                catch (Throwable var3_4) {
                                    break block23;
                                }
lbl31:
                                // 1 sources

                                var7_14 /* !! */  = ((bre)var4_12).a;
                                var5_15 = (ScheduledExecutorService)((bre)var4_12).b.b.b();
                                var8_16 = (ive)((bre)var4_12).b.L.b();
                                var6_17 = gto.i((List)((bre)var4_12).b.M.b());
                                var3_3 = new htu(var7_14 /* !! */ , (ScheduledExecutorService)var5_15, var8_16, (gto)var6_17);
                                var6_17 = ((bre)var4_12).b;
                                var5_15 = var6_17.P.a;
                                var6_17 = (hpq)var6_17.d.b();
                                var4_12 = (iah)((AmbientModeSupport$AmbientController)((bre)var4_12).b.U().a.b()).g("com.google.android.apps.search.transcription.device 45420510").b();
                                idi.m(var4_12);
                                var7_14 /* !! */  = new bzo((htu)var3_3, (Context)var5_15, (hpq)var6_17, (iah)var4_12);
                                this.d = var7_14 /* !! */ ;
                                ** try [egrp 5[TRYBLOCK] [6 : 264->271)] { 
lbl44:
                                // 1 sources

                                var2_6.close();
                                break block20;
                                catch (ClassCastException var4_13) {}
                                {
                                    var3_3 = new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", var4_13);
                                    throw var3_3;
                                }
                            }
                        }
                        try {
                            var2_6.close();
                            throw var3_4;
                        }
                        catch (Throwable var2_7) {}
                        {
                            var3_4.addSuppressed(var2_7);
                            throw var3_4;
                        }
                    }
                }
                var2_9 = new IllegalStateException("createPeer() called after destroyed.");
                throw var2_9;
            }
            var2_10 = new IllegalStateException("createPeer() called outside of onCreate");
            throw var2_10;
        }
        super.onCreate();
        this.a = false;
        return;
lbl66:
        // 1 sources

        finally {
            try {
                var1_1.close();
            }
            catch (Throwable var1_2) {
                var2_11.addSuppressed(var1_2);
            }
        }
    }

    @Override
    public final void onDestroy() {
        gpf gpf2 = this.b.e();
        try {
            super.onDestroy();
            this.c = true;
            return;
        }
        finally {
            gpf2.close();
        }
    }
}

