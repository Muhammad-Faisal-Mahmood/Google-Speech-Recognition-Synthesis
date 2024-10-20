/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.AbsListView
 *  android.widget.ScrollView
 */
package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;

public class AppBarLayout$BaseBehavior
extends ftu {
    public int a;
    public fvc b;
    private int d;
    private ValueAnimator e;
    private fto f;
    private WeakReference g;

    public AppBarLayout$BaseBehavior() {
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static final View P(CoordinatorLayout coordinatorLayout) {
        int n2 = coordinatorLayout.getChildCount();
        for (int i2 = 0; i2 < n2; ++i2) {
            View view = coordinatorLayout.getChildAt(i2);
            if (!(((rz)view.getLayoutParams()).a instanceof AppBarLayout$ScrollingViewBehavior)) continue;
            return view;
        }
        return null;
    }

    private final void V(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        if (wj.a((View)coordinatorLayout) != null) {
            return;
        }
        wj.m((View)coordinatorLayout, new ftn(this, appBarLayout, coordinatorLayout));
    }

    private final void W(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        int n2;
        int n3;
        int n4;
        int n5;
        Object object;
        int n6;
        int n7;
        int n8;
        block15: {
            n8 = appBarLayout.e() + appBarLayout.getPaddingTop();
            n7 = ((ftu)this).J() - n8;
            int n9 = appBarLayout.getChildCount();
            for (n6 = 0; n6 < n9; ++n6) {
                object = appBarLayout.getChildAt(n6);
                n5 = object.getTop();
                n4 = object.getBottom();
                object = (ftp)object.getLayoutParams();
                n3 = n5;
                n2 = n4;
                if (AppBarLayout$BaseBehavior.X(object.a, 32)) {
                    n3 = n5 - object.topMargin;
                    n2 = n4 + object.bottomMargin;
                }
                if (n3 > (n4 = -n7) || n2 < n4) {
                    continue;
                }
                break block15;
            }
            n6 = -1;
        }
        if (n6 >= 0) {
            View view = appBarLayout.getChildAt(n6);
            object = (ftp)view.getLayoutParams();
            n5 = object.a;
            if ((n5 & 0x11) == 17) {
                n3 = -view.getTop();
                n4 = -view.getBottom();
                n2 = n3;
                if (n6 == 0) {
                    n2 = n3;
                    if (appBarLayout.getFitsSystemWindows()) {
                        n2 = n3;
                        if (view.getFitsSystemWindows()) {
                            n2 = n3 - appBarLayout.e();
                        }
                    }
                }
                if (AppBarLayout$BaseBehavior.X(n5, 2)) {
                    n6 = n4 + view.getMinimumHeight();
                    n3 = n2;
                } else {
                    n3 = n2;
                    n6 = n4;
                    if (AppBarLayout$BaseBehavior.X(n5, 5)) {
                        n6 = view.getMinimumHeight() + n4;
                        if (n7 < n6) {
                            n3 = n6;
                            n6 = n4;
                        } else {
                            n3 = n2;
                        }
                    }
                }
                n4 = n3;
                n2 = n6;
                if (AppBarLayout$BaseBehavior.X(n5, 32)) {
                    n4 = n3 + object.topMargin;
                    n2 = n6 - object.bottomMargin;
                }
                if (n7 < (n2 + n4) / 2) {
                    n4 = n2;
                }
                this.Y(coordinatorLayout, appBarLayout, rw.z(n4 + n8, -appBarLayout.f(), 0));
            }
        }
    }

    private static boolean X(int n2, int n3) {
        return (n2 & n3) == n3;
    }

    private final void Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int n2) {
        float f2 = Math.abs(((ftu)this).J() - n2);
        float f3 = Math.abs(0.0f);
        int n3 = f3 > 0.0f ? Math.round(f2 / f3 * 1000.0f) * 3 : (int)((f2 / (float)appBarLayout.getHeight() + 1.0f) * 150.0f);
        int n4 = ((ftu)this).J();
        if (n4 == n2) {
            coordinatorLayout = this.e;
            if (coordinatorLayout != null && coordinatorLayout.isRunning()) {
                this.e.cancel();
            }
            return;
        }
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator == null) {
            this.e = valueAnimator = new ValueAnimator();
            valueAnimator.setInterpolator(ftf.e);
            this.e.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new ftm(this, coordinatorLayout, appBarLayout));
        } else {
            valueAnimator.cancel();
        }
        this.e.setDuration((long)Math.min(n3, 600));
        this.e.setIntValues(new int[]{n4, n2});
        this.e.start();
    }

    private static final View Z(CoordinatorLayout coordinatorLayout) {
        int n2 = coordinatorLayout.getChildCount();
        for (int i2 = 0; i2 < n2; ++i2) {
            View view = coordinatorLayout.getChildAt(i2);
            if (!(view instanceof vg || view instanceof AbsListView || view instanceof ScrollView)) {
                continue;
            }
            return view;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static final void aa(CoordinatorLayout object, AppBarLayout appBarLayout, int n2, int n3, boolean bl2) {
        block15: {
            boolean bl3;
            Object object2;
            Object var11_10;
            int n4;
            block17: {
                block16: {
                    int n5;
                    int n6;
                    block14: {
                        n6 = Math.abs(n2);
                        int n7 = appBarLayout.getChildCount();
                        n4 = 0;
                        n5 = 0;
                        while (true) {
                            var11_10 = null;
                            if (n5 >= n7) break;
                            object2 = appBarLayout.getChildAt(n5);
                            if (n6 < object2.getTop() || n6 > object2.getBottom()) {
                                ++n5;
                                continue;
                            }
                            break block14;
                            break;
                        }
                        object2 = null;
                    }
                    if (object2 == null || ((n5 = ((ftp)object2.getLayoutParams()).a) & 1) == 0) break block16;
                    n6 = object2.getMinimumHeight();
                    bl3 = true;
                    if (n3 > 0 && (n5 & 0xC) != 0 ? -n2 >= object2.getBottom() - n6 - appBarLayout.e() : (n5 & 2) != 0 && -n2 >= object2.getBottom() - n6 - appBarLayout.e()) break block17;
                }
                bl3 = false;
            }
            if (appBarLayout.f) {
                bl3 = appBarLayout.m(AppBarLayout$BaseBehavior.Z((CoordinatorLayout)object));
            }
            bl3 = appBarLayout.l(bl3);
            if (!bl2) {
                if (!bl3) return;
                object = ((CoordinatorLayout)object).h.b(appBarLayout);
                object = object == null ? var11_10 : new ArrayList(object);
                object2 = object;
                if (object == null) {
                    object2 = Collections.emptyList();
                }
                n3 = object2.size();
                n2 = n4;
                while (n2 < n3) {
                    object = ((rz)((View)object2.get((int)n2)).getLayoutParams()).a;
                    if (object instanceof AppBarLayout$ScrollingViewBehavior) {
                        if (((AppBarLayout$ScrollingViewBehavior)object).d == 0) return;
                        break block15;
                    }
                    ++n2;
                }
                return;
            }
        }
        if (appBarLayout.getBackground() != null) {
            appBarLayout.getBackground().jumpToCurrentState();
        }
        if (appBarLayout.getForeground() != null) {
            appBarLayout.getForeground().jumpToCurrentState();
        }
        if (appBarLayout.getStateListAnimator() == null) return;
        appBarLayout.getStateListAnimator().jumpToCurrentState();
    }

    public boolean G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int n2, int n3) {
        boolean bl2;
        block4: {
            block5: {
                boolean bl3;
                bl2 = bl3 = false;
                if ((n2 & 2) == 0) break block4;
                if (appBarLayout.f || appBarLayout.e) break block5;
                bl2 = bl3;
                if (appBarLayout.f() == 0) break block4;
                bl2 = bl3;
                if (coordinatorLayout.getHeight() - view.getHeight() > appBarLayout.getHeight()) break block4;
            }
            bl2 = true;
        }
        if (bl2 && (coordinatorLayout = this.e) != null) {
            coordinatorLayout.cancel();
        }
        this.g = null;
        this.d = n3;
        return bl2;
    }

    @Override
    public final /* synthetic */ int I(View view) {
        return ((AppBarLayout)view).f();
    }

    @Override
    public final int J() {
        return this.T() + this.a;
    }

    final fto L(Parcelable parcelable, AppBarLayout appBarLayout) {
        int n2 = this.T();
        int n3 = appBarLayout.getChildCount();
        boolean bl2 = false;
        for (int i2 = 0; i2 < n3; ++i2) {
            View view = appBarLayout.getChildAt(i2);
            int n4 = view.getBottom() + n2;
            if (view.getTop() + n2 > 0 || n4 < 0) continue;
            Parcelable parcelable2 = parcelable;
            if (parcelable == null) {
                parcelable2 = yq.c;
            }
            parcelable = new fto(parcelable2);
            boolean bl3 = n2 == 0;
            parcelable.b = bl3;
            bl3 = !bl3 && -n2 >= appBarLayout.f();
            parcelable.a = bl3;
            parcelable.e = i2;
            bl3 = bl2;
            if (n4 == view.getMinimumHeight() + appBarLayout.e()) {
                bl3 = true;
            }
            parcelable.g = bl3;
            float f2 = view.getHeight();
            parcelable.f = (float)n4 / f2;
            return parcelable;
        }
        return null;
    }

    final void N(fto fto2, boolean bl2) {
        if (this.f != null && !bl2) {
            return;
        }
        this.f = fto2;
    }

    public final void Q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int n2, int[] nArray) {
        if (n2 != 0) {
            int n3;
            int n4;
            if (n2 < 0) {
                n4 = -appBarLayout.f();
                n3 = appBarLayout.b() + n4;
            } else {
                n4 = -appBarLayout.f();
                n3 = 0;
            }
            if (n4 != n3) {
                nArray[1] = this.R(coordinatorLayout, (View)appBarLayout, n2, n4, n3);
            }
        }
        if (appBarLayout.f) {
            appBarLayout.l(appBarLayout.m(view));
        }
    }
}

