/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.LocaleList
 *  android.os.Looper
 *  android.os.SystemClock
 *  android.view.MotionEvent
 *  android.view.View
 */
import android.animation.Animator;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.List;

public final class ak
implements Runnable {
    public final Object a;
    private final int b;

    public /* synthetic */ ak(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public ak(Object object, int n2, byte[] byArray) {
        this.b = n2;
        this.a = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final void run() {
        var2_1 = this.b;
        var6_2 = null;
        switch (var2_1) {
            default: {
                var5_4 /* !! */  = ((jw)this.a).e;
                if (var5_4 /* !! */  == null || !var5_4 /* !! */ .isAttachedToWindow() || ((jw)this.a).e.getCount() <= ((jw)this.a).e.getChildCount()) break;
                var1_3 = ((jw)this.a).e.getChildCount();
                var5_4 /* !! */  = (jw)this.a;
                if (var1_3 > var5_4 /* !! */ .k) break;
                var5_4 /* !! */ .q.setInputMethodMode(2);
                ((jw)this.a).s();
                return;
            }
            case 19: {
                ((jw)this.a).q();
                return;
            }
            case 18: {
                var7_20 = (jg)this.a;
                var7_20.d();
                var5_5 = var7_20.c;
                if (var5_5.isEnabled() && !var5_5.isLongClickable() && var7_20.b()) {
                    var5_5.getParent().requestDisallowInterceptTouchEvent(true);
                    var3_23 = SystemClock.uptimeMillis();
                    var6_2 = MotionEvent.obtain((long)var3_23, (long)var3_23, (int)3, (float)0.0f, (float)0.0f, (int)0);
                    var5_5.onTouchEvent((MotionEvent)var6_2);
                    var6_2.recycle();
                    var7_20.d = true;
                }
                return;
            }
            case 17: {
                var5_6 = ((jg)this.a).c.getParent();
                if (var5_6 != null) {
                    var5_6.requestDisallowInterceptTouchEvent(true);
                }
                return;
            }
            case 16: {
                var6_2 = (jf)this.a;
                var1_3 = var6_2.q;
                if (var1_3 != 1) {
                    if (var1_3 != 2) {
                        return;
                    }
                } else {
                    var6_2.p.cancel();
                }
                var6_2.q = 3;
                var5_7 = var6_2.p;
                var5_7.setFloatValues(new float[]{((Float)var5_7.getAnimatedValue()).floatValue(), 0.0f});
                var6_2.p.setDuration(500L);
                var6_2.p.start();
                return;
            }
            case 15: {
                var5_8 = (jc)this.a;
                var5_8.b = null;
                var5_8.drawableStateChanged();
                return;
            }
            case 14: {
                ((ActionBarOverlayLayout)this.a).b();
                ((ActionBarOverlayLayout)this.a).i = var5_9 = ((ActionBarOverlayLayout)this.a).c.animate().translationY((float)(-((ActionBarOverlayLayout)this.a).c.getHeight())).setListener((Animator.AnimatorListener)((ActionBarOverlayLayout)this.a).j);
                return;
            }
            case 13: {
                ((ActionBarOverlayLayout)this.a).b();
                ((ActionBarOverlayLayout)this.a).i = var5_10 = ((ActionBarOverlayLayout)this.a).c.animate().translationY(0.0f).setListener((Animator.AnimatorListener)((ActionBarOverlayLayout)this.a).j);
                return;
            }
            case 12: {
                var5_11 = (eg)this.a;
                var5_11.s.showAtLocation((View)var5_11.r, 55, 0, 0);
                ((eg)this.a).C();
                if (((eg)this.a).L()) {
                    ((eg)this.a).r.setAlpha(0.0f);
                    var5_11 = (eg)this.a;
                    var6_2 = wj.t((View)var5_11.r);
                    var6_2.V(1.0f);
                    var5_11.M = var6_2;
                    ((eg)this.a).M.X(new du(this));
                    return;
                }
                ((eg)this.a).r.setAlpha(1.0f);
                ((eg)this.a).r.setVisibility(0);
                return;
            }
            case 11: {
                var5_12 = (eg)this.a;
                if ((var5_12.J & 1) != 0) {
                    var5_12.B(0);
                }
                var5_12 = (eg)this.a;
                if ((var5_12.J & 4096) != 0) {
                    var5_12.B(108);
                }
                var5_12 = (eg)this.a;
                var5_12.I = false;
                var5_12.J = 0;
                return;
            }
            case 10: {
                if (Build.VERSION.SDK_INT < 33) ** GOTO lbl113
                var7_21 = (Context)this.a;
                var8_24 = new ComponentName(var7_21, "android.support.v7.app.AppLocalesMetadataHolderService");
                if (var7_21.getPackageManager().getComponentEnabledSetting(var8_24) == 1) ** GOTO lbl113
                if (Build.VERSION.SDK_INT < 33) ** GOTO lbl103
                var9_25 = new ou(ds.f);
                do {
                    var5_13 = var6_2;
                    if (!var9_25.hasNext()) ** GOTO lbl100
                } while ((var5_13 = (ds)((WeakReference)var9_25.next()).get()) == null || (var5_13 = var5_13.a()) == null);
                var5_13 = var5_13.getSystemService("locale");
lbl100:
                // 2 sources

                if (var5_13 == null) ** GOTO lbl105
                var5_13 = tw.d(a$$ExternalSyntheticApiModelOutline0.m(a$$ExternalSyntheticApiModelOutline0.m(var5_13)));
                ** GOTO lbl106
lbl103:
                // 1 sources

                var5_13 = var6_2 = ds.c;
                if (var6_2 != null) ** GOTO lbl106
lbl105:
                // 2 sources

                var5_13 = tw.a;
lbl106:
                // 3 sources

                if (var5_13.g()) {
                    var6_2 = x.a(var7_21);
                    var5_13 = var7_21.getSystemService("locale");
                    if (var5_13 != null) {
                        var6_2 = ag$$ExternalSyntheticApiModelOutline1.m((String)var6_2);
                        a$$ExternalSyntheticApiModelOutline0.m(a$$ExternalSyntheticApiModelOutline0.m(var5_13), (LocaleList)var6_2);
                    }
                }
                var7_21.getPackageManager().setComponentEnabledSetting(var8_24, 1, 1);
lbl113:
                // 3 sources

                ds.e = true;
                return;
            }
            case 9: {
                ((by)this.a).af(true);
                return;
            }
            case 8: {
                var6_2 = ((by)this.a).i;
                var2_1 = var6_2.size();
                for (var1_3 = 0; var1_3 < var2_1; ++var1_3) {
                    var5_14 = (gpk)var6_2.get(var1_3);
                }
                return;
            }
            case 7: {
                if (!((cz)this.a).b.isEmpty()) {
                    ((cz)this.a).f();
                }
                return;
            }
            case 6: {
                ((be)this.a).o(false);
                return;
            }
            case 5: {
                var5_15 = this.a;
                var6_2 = (be)var5_15;
                if (var6_2.S != null && var6_2.k().s) {
                    if (var6_2.B == null) {
                        var6_2.k().s = false;
                        return;
                    }
                    if (Looper.myLooper() != var6_2.B.d.getLooper()) {
                        var6_2.B.d.postAtFrontOfQueue((Runnable)new ak(var5_15, 6, null));
                        return;
                    }
                    var6_2.o(true);
                }
                return;
            }
            case 4: {
                var5_16 = (be)this.a;
                var7_22 = var5_16.aa;
                var6_2 = var5_16.i;
                var7_22.b.b((Bundle)var6_2);
                var5_16.i = null;
                return;
            }
            case 3: {
                var5_17 = (at)this.a;
                var6_2 = var5_17.c;
                var5_17.a.onDismiss((DialogInterface)var6_2);
                return;
            }
            case 2: {
                var5_18 = this.a;
                var6_2 = ((an)var5_18).a.iterator();
                while (var6_2.hasNext()) {
                    ((ao)var6_2.next()).a.f((cu)var5_18);
                }
                return;
            }
            case 1: {
                cf.b((List)this.a, 4);
                return;
            }
            case 0: {
                var5_19 = (jqz)((jsj)this.a).a;
                if (var5_19 == null) break;
                var5_19.a();
            }
        }
    }
}

