/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Insets
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.WindowInsets$Builder
 *  android.widget.FrameLayout$LayoutParams
 */
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

final class dt
implements vk {
    final eg a;

    public dt(eg eg2) {
        this.a = eg2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final xn a(View view, xn object) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        Object object2;
        Object object3;
        block27: {
            int n8;
            int n9;
            ActionBarContextView actionBarContextView;
            block22: {
                Object object4;
                block26: {
                    Method method;
                    ViewGroup viewGroup;
                    Rect rect;
                    block21: {
                        block23: {
                            block24: {
                                block25: {
                                    object3 = object;
                                    object2 = this.a;
                                    n7 = ((xn)object).d();
                                    n6 = ((xn)object).d();
                                    actionBarContextView = ((eg)object2).r;
                                    n5 = 8;
                                    if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) break block23;
                                    actionBarContextView = (ViewGroup.MarginLayoutParams)((eg)object2).r.getLayoutParams();
                                    if (!((eg)object2).r.isShown()) break block24;
                                    if (((eg)object2).K == null) {
                                        ((eg)object2).K = new Rect();
                                        ((eg)object2).L = new Rect();
                                    }
                                    object4 = ((eg)object2).K;
                                    rect = ((eg)object2).L;
                                    object4.set(((xn)object).b(), ((xn)object).d(), ((xn)object).c(), ((xn)object).a());
                                    viewGroup = ((eg)object2).w;
                                    if (Build.VERSION.SDK_INT < 29) break block25;
                                    viewGroup = dp$$ExternalSyntheticApiModelOutline0.m(viewGroup.computeSystemWindowInsets(dp$$ExternalSyntheticApiModelOutline0.m(dp$$ExternalSyntheticApiModelOutline0.m(new WindowInsets.Builder(), dp$$ExternalSyntheticApiModelOutline0.m((Rect)object4))), rect));
                                    object4.set(dp$$ExternalSyntheticApiModelOutline0.m$3((Insets)viewGroup), dp$$ExternalSyntheticApiModelOutline0.m$1((Insets)viewGroup), dp$$ExternalSyntheticApiModelOutline0.m((Insets)viewGroup), dp$$ExternalSyntheticApiModelOutline0.m$2((Insets)viewGroup));
                                    break block26;
                                }
                                if (mi.a) break block21;
                                mi.a = true;
                                try {
                                    mi.b = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                                    if (!mi.b.isAccessible()) {
                                        mi.b.setAccessible(true);
                                    }
                                    break block21;
                                }
                                catch (NoSuchMethodException noSuchMethodException) {}
                            }
                            if (((ViewGroup.MarginLayoutParams)actionBarContextView).topMargin != 0) {
                                ((ViewGroup.MarginLayoutParams)actionBarContextView).topMargin = 0;
                                n9 = 1;
                                n4 = 0;
                                n8 = n6;
                                break block22;
                            } else {
                                n9 = 0;
                                n4 = 0;
                                n8 = n6;
                            }
                            break block22;
                        }
                        n3 = 0;
                        break block27;
                    }
                    if ((method = mi.b) != null) {
                        try {
                            method.invoke((Object)viewGroup, object4, rect);
                        }
                        catch (Exception exception) {}
                    }
                }
                n8 = ((Rect)object4).top;
                n9 = ((Rect)object4).left;
                n3 = ((Rect)object4).right;
                object4 = wb.a((View)((eg)object2).w);
                n4 = object4 == null ? 0 : ((xn)object4).b();
                n2 = object4 == null ? 0 : ((xn)object4).c();
                if (((ViewGroup.MarginLayoutParams)actionBarContextView).topMargin == n8 && ((ViewGroup.MarginLayoutParams)actionBarContextView).leftMargin == n9 && ((ViewGroup.MarginLayoutParams)actionBarContextView).rightMargin == n3) {
                    n3 = 0;
                } else {
                    ((ViewGroup.MarginLayoutParams)actionBarContextView).topMargin = n8;
                    ((ViewGroup.MarginLayoutParams)actionBarContextView).leftMargin = n9;
                    ((ViewGroup.MarginLayoutParams)actionBarContextView).rightMargin = n3;
                    n3 = 1;
                }
                if (n8 > 0 && ((eg)object2).x == null) {
                    ((eg)object2).x = new View(((eg)object2).k);
                    ((eg)object2).x.setVisibility(8);
                    object4 = new FrameLayout.LayoutParams(-1, ((ViewGroup.MarginLayoutParams)actionBarContextView).topMargin, 51);
                    ((FrameLayout.LayoutParams)object4).leftMargin = n4;
                    ((FrameLayout.LayoutParams)object4).rightMargin = n2;
                    ((eg)object2).w.addView(((eg)object2).x, -1, (ViewGroup.LayoutParams)object4);
                } else {
                    object4 = ((eg)object2).x;
                    if (object4 != null) {
                        object4 = (ViewGroup.MarginLayoutParams)object4.getLayoutParams();
                        if (((ViewGroup.MarginLayoutParams)object4).height != ((ViewGroup.MarginLayoutParams)actionBarContextView).topMargin || ((ViewGroup.MarginLayoutParams)object4).leftMargin != n4 || ((ViewGroup.MarginLayoutParams)object4).rightMargin != n2) {
                            ((ViewGroup.MarginLayoutParams)object4).height = ((ViewGroup.MarginLayoutParams)actionBarContextView).topMargin;
                            ((ViewGroup.MarginLayoutParams)object4).leftMargin = n4;
                            ((ViewGroup.MarginLayoutParams)object4).rightMargin = n2;
                            ((eg)object2).x.setLayoutParams((ViewGroup.LayoutParams)object4);
                        }
                    }
                }
                object4 = ((eg)object2).x;
                n2 = object4 != null ? 1 : 0;
                if (n2 != 0 && object4.getVisibility() != 0) {
                    object4 = ((eg)object2).x;
                    n4 = (object4.getWindowSystemUiVisibility() & 0x2000) != 0 ? ((eg)object2).k.getColor(2131099654) : ((eg)object2).k.getColor(2131099653);
                    object4.setBackgroundColor(n4);
                }
                n8 = n6;
                n9 = n3;
                n4 = n2;
                if (!((eg)object2).A) {
                    n8 = n6;
                    n9 = n3;
                    n4 = n2;
                    if (n2 != 0) {
                        n8 = 0;
                        n9 = n3;
                        n4 = n2;
                    }
                }
            }
            n6 = n8;
            n3 = n4;
            if (n9 != 0) {
                ((eg)object2).r.setLayoutParams((ViewGroup.LayoutParams)actionBarContextView);
                n6 = n8;
                n3 = n4;
            }
        }
        if ((object2 = ((eg)object2).x) != null) {
            n4 = 1 != n3 ? n5 : 0;
            object2.setVisibility(n4);
        }
        object2 = object3;
        if (n7 != n6) {
            n2 = ((xn)object).b();
            n4 = ((xn)object).c();
            n3 = ((xn)object).a();
            object = Build.VERSION.SDK_INT >= 30 ? new xe((xn)object3) : (Build.VERSION.SDK_INT >= 29 ? new xd((xn)object3) : new xc((xn)object3));
            ((xf)object).c(tg.d(n2, n6, n4, n3));
            object2 = ((xf)object).a();
        }
        return wj.e(view, (xn)object2);
    }
}

