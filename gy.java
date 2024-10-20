/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.SparseBooleanArray
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 */
import android.content.Context;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.ArrayList;

public final class gy
extends fi {
    gw g;
    public int h;
    public gx i;
    public gu j;
    public cdn k;
    final ef l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private boolean q;
    private final SparseBooleanArray r = new SparseBooleanArray();
    private AmbientMode$AmbientController s;

    public gy(Context context) {
        super(context);
        this.l = new ef(this, 2);
    }

    @Override
    public final View a(fu object, View object2, ViewGroup viewGroup) {
        Object object3 = ((fu)object).getActionView();
        int n2 = 0;
        if (object3 == null || ((fu)object).m()) {
            object2 = object2 instanceof gf ? (gf)object2 : (gf)this.d.inflate(2131623938, viewGroup, false);
            object2.f((fu)object);
            ActionMenuView actionMenuView = (ActionMenuView)this.f;
            object3 = (ActionMenuItemView)object2;
            object3.b = actionMenuView;
            if (this.s == null) {
                this.s = new AmbientMode$AmbientController(this);
            }
            object3.c = this.s;
            object3 = (View)object2;
        }
        if (((fu)object).o) {
            n2 = 8;
        }
        object3.setVisibility(n2);
        object = (ActionMenuView)viewGroup;
        object = object3.getLayoutParams();
        if (!(object instanceof hb)) {
            object3.setLayoutParams((ViewGroup.LayoutParams)ActionMenuView.n((ViewGroup.LayoutParams)object));
        }
        return object3;
    }

    @Override
    public final void b(Context context, fs fs2) {
        this.b = context;
        LayoutInflater.from((Context)this.b);
        this.c = fs2;
        fs2 = context.getResources();
        if (!this.n) {
            this.m = true;
        }
        this.o = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.h = kh.e(context);
        int n2 = this.o;
        if (this.m) {
            if (this.g == null) {
                this.g = new gw(this, this.a);
                int n3 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
                this.g.measure(n3, n3);
            }
            n2 -= this.g.getMeasuredWidth();
        } else {
            this.g = null;
        }
        this.p = n2;
        float f2 = fs2.getDisplayMetrics().density;
    }

    @Override
    public final void c(fs fs2, boolean bl2) {
        this.n();
        gd gd2 = this.e;
        if (gd2 != null) {
            gd2.a(fs2, bl2);
        }
    }

    @Override
    public final boolean e() {
        fu fu2;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        ViewGroup viewGroup;
        int n7;
        int n8;
        int n9;
        int n10;
        boolean bl2;
        Object object;
        block29: {
            block30: {
                object = this.c;
                bl2 = false;
                if (object != null) {
                    object = ((fs)object).f();
                    n10 = ((ArrayList)object).size();
                } else {
                    object = null;
                    n10 = 0;
                }
                n9 = this.h;
                n8 = this.p;
                n7 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
                viewGroup = (ViewGroup)this.f;
                n4 = n6 = (n5 = 0);
                n3 = n6;
                n6 = n9;
                for (n2 = 0; n2 < n10; ++n2) {
                    fu2 = (fu)((ArrayList)object).get(n2);
                    if (fu2.r()) {
                        ++n3;
                    } else if (fu2.q()) {
                        ++n4;
                    } else {
                        n5 = 1;
                    }
                    n9 = n6;
                    if (this.q) {
                        n9 = n6;
                        if (fu2.o) {
                            n9 = 0;
                        }
                    }
                    n6 = n9;
                }
                n2 = n6;
                if (!this.m) break block29;
                if (n5 != 0) break block30;
                n2 = n6;
                if (n4 + n3 <= n6) break block29;
            }
            n2 = n6 - 1;
        }
        n3 = n2 - n3;
        SparseBooleanArray sparseBooleanArray = this.r;
        sparseBooleanArray.clear();
        n6 = 0;
        n5 = n8;
        for (n9 = 0; n9 < n10; ++n9) {
            Object object2;
            fu2 = (fu)((ArrayList)object).get(n9);
            if (fu2.r()) {
                object2 = ((fi)this).a(fu2, null, viewGroup);
                object2.measure(n7, n7);
                n8 = object2.getMeasuredWidth();
                n2 = n5 - n8;
                n4 = n6;
                if (n6 == 0) {
                    n4 = n8;
                }
                if ((n6 = fu2.b) != 0) {
                    sparseBooleanArray.put(n6, true);
                }
                fu2.k(true);
                n6 = n4;
            } else if (fu2.q()) {
                int n11 = fu2.b;
                boolean bl3 = sparseBooleanArray.get(n11);
                if ((n3 > 0 || bl3) && n5 > 0) {
                    bl2 = true;
                }
                n2 = n5;
                n4 = n6;
                boolean bl4 = bl2;
                if (bl2) {
                    object2 = ((fi)this).a(fu2, null, viewGroup);
                    object2.measure(n7, n7);
                    n8 = object2.getMeasuredWidth();
                    n2 = n5 - n8;
                    n4 = n6;
                    if (n6 == 0) {
                        n4 = n8;
                    }
                    bl4 = n2 + n4 > 0;
                }
                if (bl4 && n11 != 0) {
                    sparseBooleanArray.put(n11, true);
                    n6 = n3;
                } else {
                    n6 = n3;
                    if (bl3) {
                        sparseBooleanArray.put(n11, false);
                        n5 = 0;
                        while (true) {
                            n6 = n3;
                            if (n5 >= n9) break;
                            object2 = (fu)((ArrayList)object).get(n5);
                            n6 = n3;
                            if (((fu)object2).b == n11) {
                                n6 = n3;
                                if (((fu)object2).o()) {
                                    n6 = n3 + 1;
                                }
                                ((fu)object2).k(false);
                            }
                            ++n5;
                            n3 = n6;
                        }
                    }
                }
                n3 = n6;
                if (bl4) {
                    n3 = n6 - 1;
                }
                fu2.k(bl4);
                bl2 = false;
                n6 = n4;
            } else {
                fu2.k(bl2);
                n2 = n5;
            }
            n5 = n2;
        }
        return true;
    }

    @Override
    public final boolean f(gl gl2) {
        boolean bl2 = gl2.hasVisibleItems();
        boolean bl3 = false;
        if (bl2) {
            int n2;
            int n3;
            Object object;
            Object object2 = gl2;
            while ((object = ((gl)object2).k) != this.c) {
                object2 = (gl)object;
            }
            fu fu2 = ((gl)object2).l;
            ViewGroup viewGroup = (ViewGroup)this.f;
            object = null;
            if (viewGroup == null) {
                object2 = object;
            } else {
                n3 = viewGroup.getChildCount();
                n2 = 0;
                while (true) {
                    object2 = object;
                    if (n2 >= n3 || (object2 = viewGroup.getChildAt(n2)) instanceof gf && ((gf)object2).a() == fu2) break;
                    ++n2;
                }
            }
            if (object2 == null) {
                return false;
            }
            object = gl2.l;
            n3 = gl2.size();
            n2 = 0;
            while (true) {
                bl2 = bl3;
                if (n2 >= n3) break;
                object = gl2.getItem(n2);
                if (object.isVisible() && object.getIcon() != null) {
                    bl2 = true;
                    break;
                }
                ++n2;
            }
            this.j = object2 = new gu(this, this.b, gl2, (View)object2);
            ((gc)object2).d(bl2);
            if (this.j.h()) {
                object = this.e;
                if (object != null) {
                    object2 = gl2;
                    if (gl2 == null) {
                        object2 = this.c;
                    }
                    object.b((fs)object2);
                }
                return true;
            }
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final void i() {
        var8_1 /* !! */  = (ViewGroup)this.f;
        var7_2 /* !! */  = null;
        var4_3 = 0;
        if (var8_1 /* !! */  != null) {
            var6_4 = this.c;
            if (var6_4 != null) {
                var6_4.k();
                var9_5 = this.c.f();
                var5_6 = var9_5.size();
                var3_7 = 0;
                var1_8 = 0;
                while (true) {
                    var2_9 = var1_8;
                    if (var3_7 < var5_6) {
                        var10_10 = (fu)var9_5.get(var3_7);
                        var2_9 = var1_8;
                        if (var10_10.o()) {
                            var11_11 = var8_1 /* !! */ .getChildAt(var1_8);
                            var6_4 = var11_11 instanceof gf != false ? ((gf)var11_11).a() : null;
                            var12_12 = this.a(var10_10, var11_11, var8_1 /* !! */ );
                            if (var10_10 != var6_4) {
                                var12_12.setPressed(false);
                                var12_12.jumpDrawablesToCurrentState();
                            }
                            if (var12_12 != var11_11) {
                                var6_4 = (ViewGroup)var12_12.getParent();
                                if (var6_4 != null) {
                                    var6_4.removeView(var12_12);
                                }
                                ((ViewGroup)this.f).addView(var12_12, var1_8);
                            }
                            var2_9 = var1_8 + 1;
                        }
                        ++var3_7;
                        var1_8 = var2_9;
                        continue;
                    }
                    break;
                }
            } else {
                var2_9 = 0;
            }
            while (var2_9 < var8_1 /* !! */ .getChildCount()) {
                if (var8_1 /* !! */ .getChildAt(var2_9) == this.g) {
                    ++var2_9;
                    continue;
                }
                var8_1 /* !! */ .removeViewAt(var2_9);
            }
        }
        ((View)this.f).requestLayout();
        var6_4 = this.c;
        if (var6_4 != null) {
            var6_4.k();
            var8_1 /* !! */  = var6_4.d;
            var2_9 = var8_1 /* !! */ .size();
            for (var1_8 = 0; var1_8 < var2_9; ++var1_8) {
                var6_4 = ((fu)var8_1 /* !! */ .get((int)var1_8)).p;
            }
        }
        var8_1 /* !! */  = this.c;
        var6_4 = var7_2 /* !! */ ;
        if (var8_1 /* !! */  != null) {
            var6_4 = var8_1 /* !! */ .e();
        }
        if (!this.m || var6_4 == null) ** GOTO lbl-1000
        var2_9 = var6_4.size();
        if (var2_9 == 1) {
            var1_8 = ((fu)var6_4.get((int)0)).o ^ 1;
        } else {
            var1_8 = var4_3;
            if (var2_9 > 0) {
                var1_8 = 1;
            }
        }
        if (var1_8 != 0) {
            if (this.g == null) {
                this.g = new gw(this, this.a);
            }
            if ((var6_4 = (ViewGroup)this.g.getParent()) != this.f) {
                if (var6_4 != null) {
                    var6_4.removeView((View)this.g);
                }
                var6_4 = (ActionMenuView)this.f;
                var7_2 /* !! */  = this.g;
                var8_1 /* !! */  = ActionMenuView.m();
                var8_1 /* !! */ .a = true;
                var6_4.addView((View)var7_2 /* !! */ , (ViewGroup.LayoutParams)var8_1 /* !! */ );
            }
        } else if ((var6_4 = this.g) != null && (var7_2 /* !! */  = var6_4.getParent()) == (var6_4 = this.f)) {
            ((ViewGroup)var6_4).removeView((View)this.g);
        }
        ((ActionMenuView)this.f).b = this.m;
    }

    public final void j(ActionMenuView actionMenuView) {
        this.f = actionMenuView;
        actionMenuView.a = this.c;
    }

    public final boolean k() {
        Object object;
        cdn cdn2 = this.k;
        if (cdn2 != null && (object = this.f) != null) {
            ((View)object).removeCallbacks((Runnable)cdn2);
            this.k = null;
            return true;
        }
        object = this.i;
        if (object != null) {
            ((gc)object).b();
            return true;
        }
        return false;
    }

    public final boolean l() {
        gx gx2 = this.i;
        return gx2 != null && gx2.g();
    }

    public final boolean m() {
        fs fs2;
        if (this.m && !this.l() && (fs2 = this.c) != null && this.f != null && this.k == null && !fs2.e().isEmpty()) {
            this.k = new cdn(this, new gx(this, this.b, this.c, (View)this.g), 1);
            ((View)this.f).post((Runnable)this.k);
            return true;
        }
        return false;
    }

    public final void n() {
        this.k();
        this.q();
    }

    public final void o() {
        this.q = true;
    }

    public final void p() {
        this.m = true;
        this.n = true;
    }

    public final void q() {
        gu gu2 = this.j;
        if (gu2 != null) {
            gu2.b();
        }
    }
}

