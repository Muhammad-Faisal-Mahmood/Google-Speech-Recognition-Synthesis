/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.os.Build$VERSION
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver$OnPreDrawListener
 */
import android.animation.Animator;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

final class ayf
implements ViewTreeObserver.OnPreDrawListener,
View.OnAttachStateChangeListener {
    final ayc a;
    final ViewGroup b;

    public ayf(ayc ayc2, ViewGroup viewGroup) {
        this.a = ayc2;
        this.b = viewGroup;
    }

    private final void a() {
        this.b.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
        this.b.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean onPreDraw() {
        block33: {
            block35: {
                block34: {
                    this.a();
                    if (!ayg.b.remove(this.b)) break block33;
                    var11_1 = this.b;
                    var14_2 = ayg.a();
                    var12_3 = (ArrayList)var14_2.get(var11_1);
                    if (var12_3 == null) {
                        var11_1 = new ArrayList<E>();
                        var14_2.put(this.b, var11_1);
                        while (true) {
                            var13_4 = null;
                            var12_3 = var11_1;
                            var11_1 = var13_4;
                            break;
                        }
                    } else {
                        var11_1 = var12_3;
                        if (var12_3.size() <= 0) ** continue;
                        var11_1 = new ArrayList<E>(var12_3);
                    }
                    var12_3.add(this.a);
                    this.a.D(new aye(this, var14_2));
                    this.a.p(this.b, false);
                    if (var11_1 != null) {
                        var2_5 /* !! */  = var11_1.size();
                        for (var1_6 = 0; var1_6 < var2_5 /* !! */ ; ++var1_6) {
                            ((ayc)var11_1.get(var1_6)).w((View)this.b);
                        }
                    }
                    var13_4 = this.a;
                    var14_2 = this.b;
                    var13_4.i = new ArrayList<E>();
                    var13_4.j = new ArrayList<E>();
                    var17_7 = var13_4.e;
                    var11_1 = var13_4.f;
                    var16_8 = new ot((pa)var17_7.a);
                    var15_9 = new ot((pa)var11_1.a);
                    var1_6 = 0;
                    while (true) {
                        block32: {
                            var12_3 = var13_4.h;
                            if (var1_6 >= 4) break;
                            var2_5 /* !! */  = (int)var12_3[var1_6];
                            if (var2_5 /* !! */  != 1) {
                                if (var2_5 /* !! */  != 2) {
                                    if (var2_5 /* !! */  != 3) {
                                        if (var2_5 /* !! */  != 4) {
                                            var12_3 = var11_1;
                                            while (true) {
                                                var11_1 = var12_3;
                                                break block32;
                                                break;
                                            }
                                        }
                                        var12_3 = var17_7.c;
                                        var18_13 = var11_1.c;
                                        var19_14 = (ox)var12_3;
                                        var3_10 = var19_14.a();
                                        var2_5 /* !! */  = 0;
                                        while (true) {
                                            var12_3 = var11_1;
                                            if (var2_5 /* !! */  >= var3_10) ** continue;
                                            var22_17 /* !! */  = (View)var19_14.d(var2_5 /* !! */ );
                                            if (var22_17 /* !! */  != null && var13_4.C(var22_17 /* !! */ ) && (var12_3 = (View)((ox)var18_13).c(var5_12 = var19_14.b(var2_5 /* !! */ ))) != null && var13_4.C((View)var12_3)) {
                                                var20_15 = (aym)var16_8.get(var22_17 /* !! */ );
                                                var21_16 = (aym)var15_9.get(var12_3);
                                                if (var20_15 != null && var21_16 != null) {
                                                    var13_4.i.add(var20_15);
                                                    var13_4.j.add(var21_16);
                                                    var16_8.remove(var22_17 /* !! */ );
                                                    var15_9.remove(var12_3);
                                                }
                                            }
                                            ++var2_5 /* !! */ ;
                                        }
                                    }
                                    var19_14 = var17_7.b;
                                    var12_3 = var11_1;
                                    var18_13 = var12_3.b;
                                    var19_14 = (SparseArray)var19_14;
                                    var3_10 = var19_14.size();
                                    var2_5 /* !! */  = 0;
                                    while (true) {
                                        var11_1 = var12_3;
                                        if (var2_5 /* !! */  < var3_10) {
                                            var11_1 = (View)var19_14.valueAt(var2_5 /* !! */ );
                                            if (var11_1 != null && var13_4.C((View)var11_1) && (var20_15 = (View)((SparseArray)var18_13).get(var4_11 = var19_14.keyAt(var2_5 /* !! */ ))) != null && var13_4.C((View)var20_15)) {
                                                var21_16 = (aym)var16_8.get(var11_1);
                                                var22_17 /* !! */  = (aym)var15_9.get(var20_15);
                                                if (var21_16 != null && var22_17 /* !! */  != null) {
                                                    var13_4.i.add(var21_16);
                                                    var13_4.j.add(var22_17 /* !! */ );
                                                    var16_8.remove(var11_1);
                                                    var15_9.remove(var20_15);
                                                }
                                            }
                                            ++var2_5 /* !! */ ;
                                            continue;
                                        }
                                        break block32;
                                        break;
                                    }
                                }
                                var12_3 = var11_1;
                                var11_1 = var17_7.d;
                                var18_13 = var12_3.d;
                                var19_14 = (pa)var11_1;
                                var3_10 = var19_14.f;
                                var2_5 /* !! */  = 0;
                                while (true) {
                                    var11_1 = var12_3;
                                    if (var2_5 /* !! */  < var3_10) {
                                        var11_1 = (View)var19_14.g(var2_5 /* !! */ );
                                        if (var11_1 != null && var13_4.C((View)var11_1) && (var22_17 /* !! */  = (View)((pa)var18_13).get(var20_15 = (String)var19_14.d(var2_5 /* !! */ ))) != null && var13_4.C(var22_17 /* !! */ )) {
                                            var20_15 = (aym)var16_8.get(var11_1);
                                            var21_16 = (aym)var15_9.get(var22_17 /* !! */ );
                                            if (var20_15 != null && var21_16 != null) {
                                                var13_4.i.add(var20_15);
                                                var13_4.j.add(var21_16);
                                                var16_8.remove(var11_1);
                                                var15_9.remove(var22_17 /* !! */ );
                                            }
                                        }
                                        ++var2_5 /* !! */ ;
                                        continue;
                                    }
                                    break block32;
                                    break;
                                }
                            }
                            var12_3 = var11_1;
                            var2_5 /* !! */  = var16_8.f;
                            while (true) {
                                var11_1 = var12_3;
                                if (--var2_5 /* !! */  < 0) break;
                                var11_1 = (View)var16_8.d(var2_5 /* !! */ );
                                if (var11_1 == null || !var13_4.C((View)var11_1) || (var11_1 = (aym)var15_9.remove(var11_1)) == null || !var13_4.C(var11_1.b)) continue;
                                var18_13 = (aym)var16_8.e(var2_5 /* !! */ );
                                var13_4.i.add(var18_13);
                                var13_4.j.add(var11_1);
                            }
                        }
                        ++var1_6;
                    }
                    for (var1_6 = 0; var1_6 < var16_8.f; ++var1_6) {
                        var11_1 = (aym)var16_8.g(var1_6);
                        if (!var13_4.C(var11_1.b)) continue;
                        var13_4.i.add(var11_1);
                        var13_4.j.add(null);
                    }
                    for (var1_6 = 0; var1_6 < var15_9.f; ++var1_6) {
                        var11_1 = (aym)var15_9.g(var1_6);
                        if (!var13_4.C(var11_1.b)) continue;
                        var13_4.j.add(var11_1);
                        var13_4.i.add(null);
                    }
                    var17_7 = ayc.h();
                    var1_6 = var17_7.f;
                    var18_13 = var14_2.getWindowId();
                    var15_9 = new ArrayList<E>();
                    while (--var1_6 >= 0) {
                        var16_8 = (Animator)var17_7.d(var1_6);
                        if (var16_8 == null || (var20_15 = (axx)var17_7.get(var16_8)) == null || var20_15.a == null || !var18_13.equals(var20_15.d)) continue;
                        var21_16 = var20_15.c;
                        var22_17 /* !! */  = var20_15.a;
                        var11_1 = var22_17 /* !! */ ;
                        var19_14 = var13_4.l((View)var11_1, true);
                        var11_1 = var12_3 = var13_4.k((View)var11_1, true);
                        if (var19_14 == null) {
                            var11_1 = var12_3;
                            if (var12_3 == null) {
                                var11_1 = (aym)((pa)var13_4.f.a).get(var22_17 /* !! */ );
                            }
                        }
                        if (var19_14 == null && var11_1 == null || !((ayc)var20_15.e).B((aym)var21_16, (aym)var11_1)) continue;
                        var11_1 = var20_15.e;
                        var12_3 = (ayc)var11_1;
                        if (var12_3.j().q != null) {
                            var16_8.cancel();
                            var12_3.k.remove(var16_8);
                            var17_7.e(var1_6);
                            if (var12_3.k.size() != 0) continue;
                            var15_9.add(var11_1);
                            continue;
                        }
                        if (!var16_8.isRunning() && !var16_8.isStarted()) {
                            var17_7.e(var1_6);
                            continue;
                        }
                        var16_8.cancel();
                    }
                    for (var1_6 = 0; var1_6 < var15_9.size(); ++var1_6) {
                        var11_1 = (ayc)var15_9.get(var1_6);
                        var11_1.t((ayc)var11_1, ayb.c, false);
                        if (var11_1.m) continue;
                        var11_1.m = true;
                        var11_1.t((ayc)var11_1, ayb.b, false);
                    }
                    var13_4.r((ViewGroup)var14_2, var13_4.e, var13_4.f, var13_4.i, var13_4.j);
                    if (var13_4.q != null) break block34;
                    var13_4.x();
                    break block33;
                }
                if (Build.VERSION.SDK_INT < 34) break block33;
                var13_4.v();
                var12_3 = var13_4.q;
                var9_18 = var12_3.h();
                var11_1 = var12_3.f;
                var7_19 = var12_3.a;
                var5_12 = 0L;
                if (var9_18 == 0L) {
                    var5_12 = 1L;
                }
                var11_1.y(var5_12, var7_19);
                var12_3.a = var5_12;
                var11_1 = var13_4.q;
                var11_1.b = true;
                var1_6 = var11_1.d;
                if (var1_6 != 1) break block35;
                var11_1.d = 0;
                var11_1.i();
                break block33;
            }
            if (var1_6 != 2) break block33;
            var11_1.d = 0;
            var11_1.j(var11_1.e);
        }
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View object) {
        this.a();
        ayg.b.remove(this.b);
        object = (ArrayList)ayg.a().get(this.b);
        if (object != null && ((ArrayList)object).size() > 0) {
            int n2 = object.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                ((ayc)object.get(i2)).w((View)this.b);
            }
        }
        this.a.q(true);
    }
}

