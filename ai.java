/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.BroadcastReceiver$PendingResult
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.util.Log
 *  android.util.Pair
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.wear.ambient.AmbientMode$AmbientCallback;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ai
implements Runnable {
    public final Object a;
    public final Object b;
    public final Object c;
    private final int d;

    public ai(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult, int n2) {
        this.d = n2;
        this.b = intent;
        this.a = context;
        this.c = pendingResult;
    }

    public ai(cef cef2, cec cec2, int n2) {
        this.d = n2;
        this.c = cec2;
        this.b = "ConnectionlessLifecycleHelper";
        this.a = cef2;
    }

    public /* synthetic */ ai(Object object, Object object2, Object object3, int n2) {
        this.d = n2;
        this.a = object;
        this.b = object2;
        this.c = object3;
    }

    public /* synthetic */ ai(Object object, Object object2, Object object3, int n2, byte[] byArray) {
        this.d = n2;
        this.b = object;
        this.a = object2;
        this.c = object3;
    }

    public /* synthetic */ ai(Object object, Object object2, Object object3, int n2, char[] cArray) {
        this.d = n2;
        this.c = object;
        this.b = object2;
        this.a = object3;
    }

    public /* synthetic */ ai(Object object, Object object2, Object object3, int n2, int[] nArray) {
        this.d = n2;
        this.c = object;
        this.a = object2;
        this.b = object3;
    }

    public /* synthetic */ ai(Object object, Object object2, Object object3, int n2, short[] sArray) {
        this.d = n2;
        this.a = object;
        this.c = object2;
        this.b = object3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        block60: {
            var5_1 = this.d;
            var10_2 = true;
            var15_3 = null;
            switch (var5_1) {
                default: {
                    var16_6 = (eeb)this.c;
                    if (var16_6.f.a != null) return;
                    var5_1 = 0;
                    break block60;
                }
                case 19: {
                    var15_3 = this.c;
                    var16_7 = this.b;
                    var17_25 = this.a;
                    try {
                        hhk.S((Future)var17_25);
                        Log.i((String)"PhenotypeBackgroundRecv", (String)a.ai((String)var16_7, "Successfully updated snapshot for "));
                        ** GOTO lbl26
                    }
                    catch (Throwable var16_8) {
                        ** GOTO lbl28
                    }
                    catch (ExecutionException var17_26) {
                        Log.w((String)"PhenotypeBackgroundRecv", (String)a.ai((String)var16_7, "Failed to update local snapshot for "), (Throwable)var17_26);
                    }
lbl26:
                    // 2 sources

                    ((BroadcastReceiver.PendingResult)var15_3).finish();
                    return;
lbl28:
                    // 1 sources

                    ((BroadcastReceiver.PendingResult)var15_3).finish();
                    throw var16_8;
                }
                case 18: {
                    var15_3 = this.a;
                    dsp.b(new dpw(this.c, var15_3, 4, null), (Executor)this.b);
                    return;
                }
                case 17: {
                    var15_3 = this.b;
                    var16_9 = this.c;
                    ((dhz)this.a).a((ddu)var16_9, var15_3);
                    return;
                }
                case 16: {
                    var15_3 = this.b;
                    var15_3 = new dba(this.c, var15_3, 6);
                    ((dgv)this.a).d.a((dau)var15_3);
                    return;
                }
                case 15: {
                    var16_10 = this.c;
                    var15_3 = this.b;
                    ((dmu)this.a).c((String)var15_3, (Uri)var16_10);
                    return;
                }
                case 14: {
                    var15_3 = this.b;
                    var16_11 = this.a;
                    ((djj)((czh)this.c).c).d((File)var16_11, (String)var15_3);
                    return;
                }
                case 13: {
                    var5_1 = crt.a;
                    if (((AtomicBoolean)this.b).compareAndSet(false, true) == false) return;
                    var15_3 = this.c;
                    ((Context)this.a).unregisterReceiver((BroadcastReceiver)var15_3);
                    return;
                }
                case 12: {
                    var16_12 = this.a;
                    var15_3 = this.b;
                    ((cmn)this.c).f((String)var15_3, (cmt)var16_12);
                    return;
                }
                case 11: {
                    var17_27 = (cef)this.a;
                    if (var17_27.a > 0) {
                        var16_13 = this.c;
                        var17_27 = var17_27.b;
                        if (var17_27 != null) {
                            var15_3 = var17_27.getBundle((String)this.b);
                        }
                        ((cec)var16_13).d((Bundle)var15_3);
                    }
                    if (((cef)this.a).a >= 2) {
                        ((cec)this.c).i();
                    }
                    if (((cef)this.a).a >= 3) {
                        ((cdt)this.c).k();
                    }
                    if (((cef)this.a).a < 4) return;
                    ((cec)this.c).j();
                    return;
                }
                case 10: {
                    var16_14 = (dvy)this.a;
                    var17_28 = ((gzx)var16_14.c).v();
                    while (var17_28.hasNext() != false) {
                        var15_3 = this.b;
                        var18_37 = (brw)var17_28.next();
                        var15_3 = var15_3 != null && var15_3.isEmpty() == false ? ((bxt)var15_3.get(var18_37.a)).a(var18_37.b) : null;
                        var1_36 = var18_37.e;
                        var3_41 = var16_14.a;
                        var5_1 = var15_3 != null ? var15_3.a(var18_37.c) : var18_37.c;
                        var6_42 = var15_3 != null ? var15_3.a(var18_37.d) : var18_37.d;
                        var15_3 = this.c;
                        var7_44 = (int)(var1_36 * var3_41);
                        ((bsj)var15_3).rangeStart(var7_44, var5_1, var6_42);
                    }
                    return;
                }
                case 9: {
                    var15_3 = this.c;
                    jse.e(var15_3, "$workDatabase");
                    var16_15 = this.b;
                    jse.e(var16_15, "$name");
                    var17_29 = ((WorkDatabase)var15_3).z();
                    var15_3 = auo.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
                    var15_3.g(1, (String)var16_15);
                    var16_15 = (bhw)var17_29;
                    var16_15.a.j();
                    var16_15 = wf.i(var16_15.a, (awr)var15_3, false);
                    var17_29 = new ArrayList(var16_15.getCount());
                    while (var16_15.moveToNext()) {
                        var17_29.add(var16_15.getString(0));
                    }
                    var16_15 = var17_29.iterator();
                    while (var16_15.hasNext() != false) {
                        var15_3 = this.a;
                        var17_29 = (String)var16_15.next();
                        AmbientMode$AmbientCallback.l((bdn)var15_3, (String)var17_29);
                    }
                    return;
                    finally {
                        var16_15.close();
                        var15_3.j();
                    }
                }
                case 8: {
                    try {
                        var9_46 = ((Intent)this.b).getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                        var10_2 = ((Intent)this.b).getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                        var12_50 = ((Intent)this.b).getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                        var11_51 = ((Intent)this.b).getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                        bbi.a();
                        var5_1 = ConstraintProxyUpdateReceiver.a;
                        bie.a((Context)this.a, ConstraintProxy.BatteryNotLowProxy.class, var9_46);
                        bie.a((Context)this.a, ConstraintProxy.BatteryChargingProxy.class, var10_2);
                        bie.a((Context)this.a, ConstraintProxy.StorageNotLowProxy.class, var12_50);
                        bie.a((Context)this.a, ConstraintProxy.NetworkStateProxy.class, var11_51);
                        return;
                    }
                    finally {
                        ((BroadcastReceiver.PendingResult)this.c).finish();
                    }
                }
                case 7: {
                    var15_3 = this.a;
                    ((bcn)((bxt)this.b).a).g((bzb)var15_3);
                    return;
                }
                case 6: {
                    var16_16 = this.a;
                    var15_3 = this.b;
                    var17_31 = this.c;
                    var9_47 = (Boolean)var15_3.get();
                }
                case 5: {
                    var9_48 = ((AtomicBoolean)this.a).get();
                    var15_3 = this.c;
                    var16_17 = this.b;
                    if (var9_48) {
                        return;
                    }
                    try {
                        var16_17 = var16_17.a();
                        ((po)var15_3).c(var16_17);
                        return;
                    }
                    catch (Throwable var16_18) {
                        ((po)var15_3).d(var16_18);
                        return;
                    }
                }
                case 4: {
                    var9_49 = ((AtomicBoolean)this.a).get();
                    var15_3 = this.c;
                    var16_19 = this.b;
                    if (var9_49) {
                        return;
                    }
                    try {
                        var16_19 = var16_19.a();
                        ((po)var15_3).c(var16_19);
                        return;
                    }
                    catch (Throwable var16_20) {
                        ((po)var15_3).d(var16_20);
                        return;
                    }
                }
                case 3: {
                    var15_3 = (Pair)this.c;
                    var5_1 = (Integer)var15_3.first;
                    var16_21 = (anc)var15_3.second;
                    var15_3 = ((ajn)this.a).a;
                    var17_32 = (hti)this.b;
                    var15_3.j.A(var5_1, var16_21, var17_32);
                    return;
                }
                case 2: {
                    var16_22 = ((gzs)this.b).g();
                    var18_39 = ((ajl)this.c).k;
                    var15_3 = var18_39.e;
                    abr.i(var15_3);
                    var17_33 = gzx.o(var16_22);
                    var18_39 = var18_39.b;
                    var18_39.b = var17_33;
                    if (!var16_22.isEmpty()) {
                        var17_33 = this.a;
                        var18_39.d = (anc)var16_22.get(0);
                        abr.i(var17_33);
                        var18_39.e = (anc)var17_33;
                    }
                    if (var18_39.c == null) {
                        var18_39.c = akk.b((aes)var15_3, var18_39.b, var18_39.d, var18_39.a);
                    }
                    var18_39.c(var15_3.g());
                    return;
                }
                case 1: {
                    var16_23 = this.b;
                    jse.e(var16_23, "$container");
                    var15_3 = (View)this.a;
                    ((ViewGroup)var16_23).endViewTransition((View)var15_3);
                    var15_3 = this.c;
                    ((ad)var15_3).a.a.f((cu)var15_3);
                    return;
                }
                case 0: {
                    var16_24 = ((cy)this.a).c;
                    var17_34 = ((cy)this.b).c;
                    var15_3 = (an)this.c;
                    cf.a(var16_24, var17_34, var15_3.f, var15_3.e, false);
                    return;
                }
            }
            catch (InterruptedException | ExecutionException var15_5) {
                var9_47 = var10_2;
            }
            var15_3 = ((bcn)var17_31).j;
            synchronized (var15_3) {
                var18_38 = ((dhl)var16_16).g();
                var19_52 = var18_38.a;
                if (((bcn)var17_31).e(var19_52) == var16_16) {
                    ((bcn)var17_31).d(var19_52);
                }
                bbi.a();
                var17_31.getClass().getSimpleName();
                var16_16 = ((bcn)var17_31).i.iterator();
                while (var16_16.hasNext() != false) {
                    ((bcc)var16_16.next()).a(var18_38, var9_47);
                }
                return;
            }
        }
        while (true) {
            var15_3 = (eft)this.a;
            var7_45 = var15_3.a;
            if (var5_1 >= var7_45) {
                ((heg)((heg)eeb.a.e().h(hfo.a, "ALT.BytesReceiverBuffer")).g(1, TimeUnit.SECONDS).j("com/google/android/libraries/search/audio/audiobuffer/AudioBytesReceiverAudioBuffer", "writeToBufferInternal", 140, "AudioBytesReceiverAudioBuffer.kt")).A("#audio# writing to buffer(%s), written(%d)", var16_6.h, var16_6.g.e);
                return;
            }
            var6_43 = var16_6.c;
            var17_35 = var16_6.b;
            var18_40 = var15_3.b(jse.l(var6_43, var7_45 - var5_1), var5_1, (eae)var17_35);
            var17_35 = var16_6.g;
            if (var18_40.c() != false) throw new IllegalArgumentException("Only successful reads can be part of the buffer");
            var8_54 = var18_40.a;
            var15_3 = var17_35.b;
            var6_43 = ((Object)var15_3).length;
            if (var8_54 > var6_43) throw new IllegalArgumentException("Bytes written should fit the buffer size");
            if (var8_54 == 0) {
                var15_3 = null;
            } else {
                var19_53 = this.b;
                var7_45 = var17_35.d;
                if ((var6_43 -= var7_45) > var8_54) {
                    System.arraycopy(var19_53, var5_1, var15_3, var7_45, var8_54);
                    var17_35.f = var18_40.a(var17_35.f + var18_40.a);
                    var15_3 = null;
                } else {
                    var15_3 = var18_40.b(var6_43, 0, var17_35.a);
                    var17_35.c = var15_3.b;
                    var17_35.f = var15_3.a(var17_35.f + var6_43);
                    System.arraycopy(var19_53, var5_1, var17_35.b, var17_35.d, var6_43);
                    var7_45 = var17_35.e + var6_43;
                    var20_56 = dox.g(dzn.a.l());
                    var15_3 = dox.f(dzm.a.l());
                    var15_3.d(hvu.q(var17_35.b));
                    var20_56.f(var15_3.c());
                    var20_56 = var20_56.e();
                    var15_3 = var17_35.b;
                    var13_55 = var7_45;
                    var15_3 = var17_35.a((dzn)var20_56, var7_45 - ((Object)var15_3).length, var13_55 - 1L);
                    var7_45 = var18_40.a;
                    var20_56 = var17_35.b;
                    System.arraycopy(var19_53, var6_43 + var5_1, var20_56, 0, var7_45 -= var6_43);
                    var17_35.f = var18_40.a(var17_35.f + var7_45);
                }
                var6_43 = var17_35.d;
                var7_45 = var18_40.a;
                var17_35.d = (var6_43 + var7_45) % var17_35.b.length;
                var17_35.c = var18_40.b;
                var17_35.e += var7_45;
            }
            var16_6.i.b = var16_6.g.e;
            if (var15_3 != null) {
                var16_6.c((dzn)var15_3);
            }
            var5_1 += var16_6.c;
        }
    }
}

