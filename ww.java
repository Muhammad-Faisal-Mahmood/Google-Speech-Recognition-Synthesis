/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.content.Context
 *  android.os.Trace
 *  android.util.Pair
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Trace;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.wear.ambient.AmbientModeSupport$AmbientCallback;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.logging.Level;

public final class ww
implements Runnable {
    final Object a;
    final Object b;
    final Object c;
    final Object d;
    private final int e;

    public /* synthetic */ ww(ajn ajn2, Pair pair, amv amv2, hti hti2, int n2) {
        this.e = n2;
        this.a = ajn2;
        this.d = pair;
        this.c = amv2;
        this.b = hti2;
    }

    public ww(View view, ilo ilo2, ws ws2, ValueAnimator valueAnimator, int n2) {
        this.e = n2;
        this.a = view;
        this.b = ilo2;
        this.c = ws2;
        this.d = valueAnimator;
    }

    public ww(awf awf2, Context context, String string, AmbientModeSupport$AmbientController ambientModeSupport$AmbientController, int n2) {
        this.e = n2;
        this.a = awf2;
        this.d = context;
        this.b = string;
        this.c = ambientModeSupport$AmbientController;
    }

    public /* synthetic */ ww(boe boe2, ViewTreeObserver.OnGlobalLayoutListener[] onGlobalLayoutListenerArray, Runnable[] runnableArray, Runnable[] runnableArray2, int n2) {
        this.e = n2;
        this.d = boe2;
        this.a = onGlobalLayoutListenerArray;
        this.c = runnableArray;
        this.b = runnableArray2;
    }

    public ww(fl fl2, dvy dvy2, MenuItem menuItem, fs fs2, int n2) {
        this.e = n2;
        this.d = fl2;
        this.a = dvy2;
        this.b = menuItem;
        this.c = fs2;
    }

    public /* synthetic */ ww(goi goi2, gds gds2, gec gec2, geg geg2, int n2) {
        this.e = n2;
        this.b = goi2;
        this.d = gds2;
        this.a = gec2;
        this.c = geg2;
    }

    public ww(Object object, iyh iyh2, jck jck2, iwx iwx2, int n2) {
        this.e = n2;
        this.a = iyh2;
        this.c = jck2;
        this.d = iwx2;
        this.b = object;
    }

    public /* synthetic */ ww(String string, jqz jqz2, abo abo2, po po2, int n2) {
        this.e = n2;
        this.c = string;
        this.b = jqz2;
        this.a = abo2;
        this.d = po2;
    }

    public /* synthetic */ ww(List list, bgs bgs2, bam bam2, WorkDatabase workDatabase, int n2) {
        this.e = n2;
        this.b = list;
        this.c = bgs2;
        this.d = bam2;
        this.a = workDatabase;
    }

    public /* synthetic */ ww(Level level, Throwable throwable, String string, Object[] objectArray, int n2) {
        this.e = n2;
        this.c = level;
        this.a = throwable;
        this.d = string;
        this.b = objectArray;
    }

    public ww(jbi jbi2, iyh iyh2, jck jck2, iwx iwx2, int n2) {
        this.e = n2;
        this.a = iyh2;
        this.b = jck2;
        this.d = iwx2;
        this.c = jbi2;
    }

    public ww(jjm jjm2, jjk jjk2, jjl jjl2, Object object, int n2) {
        this.e = n2;
        this.d = jjk2;
        this.a = jjl2;
        this.b = object;
        this.c = jjm2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        switch (this.e) {
            default: {
                var3_1 = this.c;
                synchronized (var3_1) {
                    break;
                }
            }
            case 13: {
                jid.x((jid)this.b);
                var5_19 = this.d;
                var3_2 = this.c;
                var4_31 = this.a;
                ((jid)this.b).v.a((iyh)var4_31, (jck)var3_2, (iwx)var5_19);
                return;
            }
            case 12: {
                var3_3 = this.d;
                var4_32 = this.c;
                var5_20 = this.a;
                ((jdh)this.b).a.a((iyh)var5_20, (jck)var4_32, (iwx)var3_3);
                return;
            }
            case 11: {
                var3_4 = this.d;
                var4_33 = this.b;
                var5_21 = this.a;
                ((jbi)this.c).j((iyh)var5_21, (jck)var4_33, (iwx)var3_4);
                return;
            }
            case 10: {
                var4_34 = ((goi)this.b).b;
                var6_45 = new gdp((gec)this.a);
                var5_22 = this.c;
                var3_5 = (gds)this.d;
                ((gel)var4_34).a(var3_5, var6_45, (geg)var5_22);
                return;
            }
            case 9: {
                var3_6 = this.c;
                var4_35 = (heg)((heg)dum.a.l((Level)var3_6).i((Throwable)this.a)).j("com/google/android/libraries/phenotype/client/Phlogger", "logInternal", 49, "Phlogger.java");
                var3_6 = this.b;
                var4_35.L((String)this.d, (Object[])var3_6);
                return;
            }
            case 8: {
                try {
                    var3_7 = this.a;
                    var5_23 = this.d;
                    var4_36 = (String)this.b;
                    var5_23 = (Context)var5_23;
                    ((awf)var3_7).o((Context)var5_23, var4_36);
                    var3_7 = this.c;
                    ((heg)((heg)bwp.a.c()).j("com/google/android/apps/speech/tts/googletts/service/NativeLibraryLoader$1", "success", 44, "NativeLibraryLoader.java")).r("Native library loading succeeded");
                    ((po)((AmbientModeSupport$AmbientController)var3_7).a).c(null);
                    return;
                }
                catch (boo var3_8) {
                    ((AmbientModeSupport$AmbientController)this.c).a(var3_8);
                    return;
                }
                catch (UnsatisfiedLinkError var3_9) {
                    ((AmbientModeSupport$AmbientController)this.c).a(var3_9);
                    return;
                }
            }
            case 7: {
                var5_24 = this.d;
                var5_24.toString();
                if (AmbientModeSupport$AmbientCallback.n((boe)var5_24)) {
                    var3_10 = this.b;
                    var4_37 = this.c;
                    AmbientModeSupport$AmbientCallback.i((boe)var5_24, (ViewTreeObserver.OnGlobalLayoutListener[])this.a, (Runnable[])var4_37, (Runnable[])var3_10);
                }
                return;
            }
            case 6: {
                var3_11 = this.b;
                var1_51 = bcr.a;
                var4_38 = var3_11.iterator();
                while (true) {
                    if (!var4_38.hasNext()) {
                        var4_38 = this.a;
                        bcr.a((bam)this.d, (WorkDatabase)var4_38, (List)var3_11);
                        return;
                    }
                    var5_25 = this.c;
                    ((bcp)var4_38.next()).b(((bgs)var5_25).a);
                }
            }
            case 5: {
                var4_39 = this.d;
                var3_12 = this.a;
                var5_26 = this.b;
                var6_46 = this.c;
                var2_56 = yj.o();
                if (var2_56) {
                    yj.m((String)var6_46);
                }
                try {
                    var5_26.a();
                    var5_26 = bbp.a;
                    ((abo)var3_12).h(var5_26);
                    var5_26 = bbp.a;
                    ((po)var4_39).c(var5_26);
                }
                catch (Throwable var6_47) {
                    try {
                        var5_26 = new bbm(var6_47);
                        ((abo)var3_12).h(var5_26);
                        ((po)var4_39).d(var6_47);
                    }
                    catch (Throwable var3_13) {
                        ** GOTO lbl104
                    }
                }
                if (var2_56) {
                    Trace.endSection();
                }
                return;
lbl104:
                // 1 sources

                if (var2_56) {
                    Trace.endSection();
                }
                throw var3_13;
            }
            case 4: {
                var3_14 /* !! */  = (Pair)this.d;
                var1_52 = (Integer)var3_14 /* !! */ .first;
                var4_40 = (anc)var3_14 /* !! */ .second;
                var5_27 = ((ajn)this.a).a;
                var6_48 = this.b;
                var3_14 /* !! */  = (amv)this.c;
                var6_48 = (hti)var6_48;
                var5_27.j.C(var1_52, var4_40, (amv)var3_14 /* !! */ , (hti)var6_48);
                return;
            }
            case 3: {
                var3_15 /* !! */  = (Pair)this.d;
                var1_53 = (Integer)var3_15 /* !! */ .first;
                var3_15 /* !! */  = (anc)var3_15 /* !! */ .second;
                var5_28 = ((ajn)this.a).a;
                var6_49 = this.b;
                var4_41 = (amv)this.c;
                var6_49 = (hti)var6_49;
                var5_28.j.E(var1_53, (anc)var3_15 /* !! */ , var4_41, (hti)var6_49);
                return;
            }
            case 2: {
                var3_16 /* !! */  = (Pair)this.d;
                var1_54 = (Integer)var3_16 /* !! */ .first;
                var3_16 /* !! */  = (anc)var3_16 /* !! */ .second;
                var5_29 = ((ajn)this.a).a;
                var6_50 = this.b;
                var4_42 = (amv)this.c;
                var6_50 = (hti)var6_50;
                var5_29.j.B(var1_54, (anc)var3_16 /* !! */ , var4_42, (hti)var6_50);
                return;
            }
            case 1: {
                var3_17 = this.a;
                if (var3_17 != null) {
                    ((fl)this.d).a.f = true;
                    ((fs)((dvy)var3_17).c).i(false);
                    ((fl)this.d).a.f = false;
                }
                if ((var3_17 = this.b).isEnabled() && var3_17.hasSubMenu()) {
                    ((fs)this.c).z((MenuItem)var3_17, 4);
                }
                return;
            }
            case 0: {
                var4_43 = this.a;
                var5_30 = this.b;
                var3_18 = (ws)this.c;
                var5_30 = (ilo)var5_30;
                wy.f((View)var4_43, (ilo)var5_30, var3_18);
                ((ValueAnimator)this.d).start();
                return;
            }
        }
        {
            var1_55 = ((jjk)this.d).b;
            if (var1_55 == 0) {
                try {
                    this.a.b(this.b);
                }
                finally {
                    ((jjm)this.c).a.remove(this.a);
                    if (((jjm)this.c).a.isEmpty()) {
                        ((jjm)this.c).b.shutdown();
                        jjm.c((jjm)this.c);
                    }
                }
            }
            return;
        }
    }
}

