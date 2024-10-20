/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Build$VERSION
 *  android.os.SystemClock
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewPropertyAnimator
 *  android.view.animation.AnimationUtils
 */
import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

public final class kd
implements Runnable {
    final Object a;
    private final int b;

    public kd(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public /* synthetic */ kd(Object object, int n2, byte[] byArray) {
        this.b = n2;
        this.a = object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        var5_1 = this.b;
        var4_2 = 0;
        switch (var5_1) {
            default: {
                var4_2 = agf.a;
                var17_3 = ((aiv)((bxt)this.a).b).a.q;
                var17_3.u(var17_3.t(), 1009, new aki(2));
                return;
            }
            case 19: {
                var4_2 = agf.a;
                var17_4 = ((aiv)((bxt)this.a).b).a.q;
                var17_4.u(var17_4.t(), 1029, new aki(3));
                return;
            }
            case 18: {
                var4_2 = agf.a;
                var17_5 = ((aiv)((bxt)this.a).b).a.q;
                var17_5.u(var17_5.t(), 1007, new akd(3));
                return;
            }
            case 17: {
                var17_6 = (akl)this.a;
                var17_6.u(var17_6.q(), 1028, new akd(2));
                var17_6.d.d();
                return;
            }
            case 16: {
                var17_7 = this.a;
                try {
                    ajd.f((aju)var17_7);
                    return;
                }
                catch (ail var17_8) {
                    afx.c("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", var17_8);
                    throw new RuntimeException(var17_8);
                }
            }
            case 15: {
                var17_9 = ((abn)this.a).b;
                synchronized (var17_9) {
                    var19_21 = ((abn)this.a).g;
                    var18_27 = this.a;
                    ((abn)var18_27).g = var20_35 = abn.a;
                }
                ((abn)this.a).g(var19_21);
                return;
            }
            case 14: {
                var17_10 = ((yx)this.a).h;
                var18_28 = var17_10.a;
                ((yx)var18_28).d = var7_39 = SystemClock.uptimeMillis();
                var18_28 = (yx)var17_10.a;
                var7_39 = var18_28.d;
                var9_42 = SystemClock.uptimeMillis();
                for (var4_2 = 0; var4_2 < var18_28.b.size(); ++var4_2) {
                    var20_36 = (zh)var18_28.b.get(var4_2);
                    if (var20_36 == null) continue;
                    var19_22 = (Long)var18_28.a.get(var20_36);
                    if (var19_22 != null) {
                        if (var19_22.longValue() >= var9_42) continue;
                        var18_28.a.remove(var20_36);
                    }
                    var20_36.b(var7_39);
                }
                if (var18_28.e) {
                    var4_2 = var18_28.b.size();
                    while ((var5_1 = var4_2 - 1) >= 0) {
                        var4_2 = var5_1;
                        if (var18_28.b.get(var5_1) != null) continue;
                        var18_28.b.remove(var5_1);
                        var4_2 = var5_1;
                    }
                    if (var18_28.b.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        var19_22 = var18_28.g;
                        a$$ExternalSyntheticApiModelOutline0.m(var19_22.a);
                        var19_22.a = null;
                    }
                    var18_28.e = false;
                }
                if (((yx)var17_10.a).b.size() <= 0) return;
                var17_10 = (yx)var17_10.a;
                var17_10.i.n(var17_10.c);
                return;
            }
            case 13: {
                ((yt)this.a).f(0);
                return;
            }
            case 12: {
                var17_11 = (yh)this.a;
                if (!var17_11.e) {
                    return;
                }
                if (var17_11.c) {
                    var17_11.c = false;
                    var17_11 = var17_11.a;
                    var17_11.e = var7_40 = AnimationUtils.currentAnimationTimeMillis();
                    var17_11.g = -1L;
                    var17_11.f = var7_40;
                    var17_11.h = 0.5f;
                }
                var17_11 = ((yh)this.a).a;
                if (var17_11.g > 0L && AnimationUtils.currentAnimationTimeMillis() > var17_11.g + (long)var17_11.i || !((yh)this.a).b()) {
                    ((yh)this.a).e = false;
                    return;
                }
                var19_23 = (yh)this.a;
                if (var19_23.d) {
                    var19_23.d = false;
                    var7_40 = SystemClock.uptimeMillis();
                    var18_29 /* !! */  = MotionEvent.obtain((long)var7_40, (long)var7_40, (int)3, (float)0.0f, (float)0.0f, (int)0);
                    var19_23.b.onTouchEvent(var18_29 /* !! */ );
                    var18_29 /* !! */ .recycle();
                }
                if (var17_11.f == 0L) throw new RuntimeException("Cannot compute scroll delta before calling start()");
                var9_43 = AnimationUtils.currentAnimationTimeMillis();
                var1_45 = var17_11.a(var9_43);
                var7_40 = var17_11.f;
                var17_11.f = var9_43;
                var2_46 = var17_11.d;
                var3_47 = var9_43 - var7_40;
                ((yh)this.a).f.scrollListBy((int)(var3_47 * (-4.0f * var1_45 * var1_45 + var1_45 * 4.0f) * var2_46));
                var18_29 /* !! */  = this.a;
                var17_11 = wj.a;
                ((yh)var18_29 /* !! */ ).b.postOnAnimation((Runnable)this);
                return;
            }
            case 11: {
                var17_12 = ((bzb)this.a).a;
                if (var17_12 == null) return;
                ((tb)var17_12).b();
                return;
            }
            case 10: {
                ((tb)this.a).b();
                return;
            }
            case 9: {
                var22_48 = this.a;
                var17_13 = (Activity)var22_48;
                if (var17_13.isFinishing() != false) return;
                if (Build.VERSION.SDK_INT >= 28) {
                    var17_13.recreate();
                    return;
                }
                if (sg.a() && sg.f == null || sg.e == null && sg.d == null) break;
                try {
                    var20_37 = sg.c.get(var22_48);
                    if (var20_37 == null || (var21_49 = sg.b.get(var22_48)) == null) break;
                    var18_30 = ((Activity)var22_48).getApplication();
                    var19_24 = new sf((Activity)var22_48);
                    var18_30.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)var19_24);
                    var23_52 = sg.g;
                    var24_53 = new aj((Object)var19_24, var20_37, 12, null);
                    var23_52.post((Runnable)var24_53);
                }
                catch (Throwable var18_34) {
                    break;
                }
                try {
                    if (sg.a()) {
                        var23_52 = sg.f;
                        var22_48 = false;
                        var23_52.invoke(var21_49, new Object[]{var20_37, null, null, 0, var22_48, null, null, var22_48, var22_48});
                        return;
                    } else {
                        ((Activity)var22_48).recreate();
                    }
                    return;
                }
                finally {
                    var20_37 = sg.g;
                    var21_49 = new aj((Object)var18_30, (Object)var19_24, 13, null);
                    var20_37.post((Runnable)var21_49);
                }
            }
            case 8: {
                ms.e((ms)this.a);
                return;
            }
            case 7: {
                var17_14 = this.a;
                try {
                    mr.x((mr)var17_14);
                    return;
                }
                catch (NullPointerException var17_15) {
                    if (jse.i(var17_15.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference") == false) throw var17_15;
                    return;
                }
                catch (IllegalStateException var17_16) {
                    if (jse.i(var17_16.getMessage(), "Can not perform this action after onSaveInstanceState") == false) throw var17_16;
                }
                return;
            }
            case 6: {
                var18_31 = (mo)this.a;
                var17_17 = var18_31.a;
                if (var17_17 == null) return;
                var17_17.run();
                var18_31.a = null;
                return;
            }
            case 5: {
                ((mr)this.a).invalidateOptionsMenu();
                return;
            }
            case 4: {
                ((Toolbar)this.a).z();
                return;
            }
            case 3: {
                var17_18 = (Toolbar)this.a;
                var18_32 = var17_18.w;
                var5_1 = var18_32.size();
                while (true) {
                    if (var4_2 >= var5_1) {
                        var19_25 = var17_18.f();
                        var18_32 = var17_18.i();
                        var17_18.z.d((Menu)var19_25, var17_18.g());
                        var19_25 = var17_18.i();
                        var19_25.removeAll(var18_32);
                        var17_18.w = var19_25;
                        return;
                    }
                    var19_25 = (MenuItem)var18_32.get(var4_2);
                    var17_18.f().removeItem(var19_25.getItemId());
                    ++var4_2;
                }
            }
            case 2: {
                ((StaggeredGridLayoutManager)this.a).K();
                return;
            }
            case 1: {
                var17_19 = (RecyclerView)this.a;
                if (var17_19.u == false) return;
                if (var17_19.isLayoutRequested()) {
                    return;
                }
                var17_19 = (RecyclerView)this.a;
                if (!var17_19.s) {
                    var17_19.requestLayout();
                    return;
                }
                if (var17_19.w) {
                    var17_19.v = true;
                    return;
                }
                var17_19.z();
                return;
            }
            case 0: {
                var17_20 = ((RecyclerView)this.a).F;
                if (var17_20 == null) ** GOTO lbl302
                var15_54 = var17_20.b.isEmpty();
                var14_55 = var17_20.d.isEmpty();
                var16_56 = var17_20.e.isEmpty();
                var5_1 = var16_56 ^ 1;
                var13_57 = var17_20.c.isEmpty();
                var4_2 = var5_1;
                if (!var15_54) ** GOTO lbl238
                var4_2 = var5_1;
                if (!var14_55) ** GOTO lbl238
                var4_2 = var5_1;
                if (!var13_57) ** GOTO lbl238
                if (var16_56 != 0) ** GOTO lbl302
                var4_2 = 1;
lbl238:
                // 4 sources

                var20_38 = var17_20.b;
                var6_58 = var20_38.size();
                var5_1 = 0;
                while (true) {
                    var7_41 = 120L;
                    if (var5_1 >= var6_58) break;
                    var21_51 = (lg)var20_38.get(var5_1);
                    var18_33 = var21_51.itemView;
                    var19_26 /* !! */  = var18_33.animate();
                    var17_20.k.add(var21_51);
                    var19_26 /* !! */ .setDuration(120L).alpha(0.0f).setListener((Animator.AnimatorListener)new ip((kk)var17_20, var21_51, var19_26 /* !! */ , (View)var18_33)).start();
                    ++var5_1;
                }
                var17_20.b.clear();
                if (!var14_55) {
                    var19_26 /* !! */  = new ArrayList();
                    var19_26 /* !! */ .addAll(var17_20.d);
                    var17_20.g.add(var19_26 /* !! */ );
                    var17_20.d.clear();
                    var18_33 = new aj(var17_20, (Object)var19_26 /* !! */ , 8, null);
                    if (!var15_54) {
                        var19_26 /* !! */  = ((iv)var19_26 /* !! */ .get((int)0)).a.itemView;
                        var20_38 = wj.a;
                        var19_26 /* !! */ .postOnAnimationDelayed((Runnable)var18_33, 120L);
                    } else {
                        var18_33.run();
                    }
                }
                if (var4_2 != 0) {
                    var19_26 /* !! */  = new ArrayList<E>();
                    var19_26 /* !! */ .addAll(var17_20.e);
                    var17_20.h.add(var19_26 /* !! */ );
                    var17_20.e.clear();
                    var18_33 = new aj(var17_20, (Object)var19_26 /* !! */ , 9, null);
                    if (!var15_54) {
                        var20_38 = ((iu)var19_26 /* !! */ .get((int)0)).a.itemView;
                        var19_26 /* !! */  = (ViewPropertyAnimator)wj.a;
                        var20_38.postOnAnimationDelayed((Runnable)var18_33, 120L);
                    } else {
                        var18_33.run();
                    }
                }
                if (!var13_57) {
                    var18_33 = new ArrayList<E>();
                    var18_33.addAll(var17_20.c);
                    var17_20.f.add(var18_33);
                    var17_20.c.clear();
                    var17_20 = new aj(var17_20, var18_33, 10, null);
                    if (var15_54 && var14_55 && var4_2 == 0) {
                        var17_20.run();
                    } else {
                        if (!(var15_54 ^ true)) {
                            var7_41 = 0L;
                        }
                        var11_59 = 250L;
                        var9_44 = var14_55 == false ? 250L : 0L;
                        if (var4_2 == 0) {
                            var11_59 = 0L;
                        }
                        var9_44 = Math.max(var9_44, var11_59);
                        var18_33 = ((lg)var18_33.get((int)0)).itemView;
                        var19_26 /* !! */  = (ViewPropertyAnimator)wj.a;
                        var18_33.postOnAnimationDelayed((Runnable)var17_20, var7_41 + var9_44);
                    }
                }
lbl302:
                // 6 sources

                ((RecyclerView)this.a).R = false;
                return;
            }
        }
        var17_13.recreate();
    }
}

