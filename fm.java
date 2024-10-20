/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.util.Log
 *  android.view.Gravity
 *  android.view.KeyEvent
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.View$OnKeyListener
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.FrameLayout
 *  android.widget.HeaderViewListAdapter
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.PopupWindow$OnDismissListener
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class fm
extends ga
implements View.OnKeyListener,
PopupWindow.OnDismissListener,
ge {
    public final Handler a;
    public final List b;
    final ViewTreeObserver.OnGlobalLayoutListener c;
    View d;
    ViewTreeObserver e;
    public boolean f;
    private final Context h;
    private final int i;
    private final int j;
    private final boolean k;
    private final List l = new ArrayList();
    private final View.OnAttachStateChangeListener m;
    private final jx n;
    private int o = 0;
    private int p = 0;
    private View q;
    private int r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private gd y;
    private PopupWindow.OnDismissListener z;

    public fm(Context context, View view, int n2, boolean bl2) {
        this.b = new ArrayList();
        this.c = new gj(this, 1);
        this.m = new fk(this, 0);
        this.n = new fl(this);
        this.h = context;
        this.q = view;
        this.j = n2;
        this.k = bl2;
        this.w = false;
        this.r = this.y();
        context = context.getResources();
        this.i = Math.max(context.getDisplayMetrics().widthPixels / 2, context.getDimensionPixelSize(2131165207));
        this.a = new Handler();
    }

    private final int y() {
        if (this.q.getLayoutDirection() == 1) {
            return 0;
        }
        return 1;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final void z(fs var1_1) {
        block30: {
            block26: {
                block29: {
                    block27: {
                        block28: {
                            block25: {
                                block22: {
                                    block24: {
                                        block23: {
                                            block21: {
                                                var10_2 = LayoutInflater.from((Context)this.h);
                                                var6_3 = new fp(var1_1, var10_2, this.k, 2131623947);
                                                if (!this.u() && this.w) {
                                                    var6_3.b = true;
                                                } else if (this.u()) {
                                                    var6_3.b = ga.w(var1_1);
                                                }
                                                var3_4 = fm.x((ListAdapter)var6_3, this.h, this.i);
                                                var9_5 = new jz(this.h, this.j);
                                                var9_5.b = this.n;
                                                var9_5.m = this;
                                                var9_5.v(this);
                                                var9_5.l = this.q;
                                                var9_5.j = this.p;
                                                var9_5.y();
                                                var9_5.x();
                                                var9_5.e((ListAdapter)var6_3);
                                                var9_5.r(var3_4);
                                                var9_5.j = this.p;
                                                if (this.b.size() <= 0) break block24;
                                                var6_3 = this.b;
                                                var7_6 /* !! */  = (dvy)var6_3.get(var6_3.size() - 1);
                                                var8_7 = (fs)var7_6 /* !! */ .c;
                                                var4_9 = var8_7.size();
                                                for (var2_10 = 0; var2_10 < var4_9; ++var2_10) {
                                                    var6_3 = var8_7.getItem(var2_10);
                                                    if (!var6_3.hasSubMenu() || var1_1 != var6_3.getSubMenu()) {
                                                        continue;
                                                    }
                                                    break block21;
                                                }
                                                var6_3 = null;
                                            }
                                            if (var6_3 == null) lbl-1000:
                                            // 3 sources

                                            {
                                                while (true) {
                                                    var6_3 = var7_6 /* !! */ ;
                                                    break block22;
                                                    break;
                                                }
                                            }
                                            var11_11 /* !! */  = var7_6 /* !! */ .d();
                                            var8_7 = var11_11 /* !! */ .getAdapter();
                                            if (var8_7 instanceof HeaderViewListAdapter) {
                                                var8_7 = (HeaderViewListAdapter)var8_7;
                                                var4_9 = var8_7.getHeadersCount();
                                                var8_7 = (fp)var8_7.getWrappedAdapter();
                                            } else {
                                                var8_7 = (fp)var8_7;
                                                var4_9 = 0;
                                            }
                                            var5_12 = var8_7.getCount();
                                            for (var2_10 = 0; var2_10 < var5_12; ++var2_10) {
                                                if (var6_3 != var8_7.a(var2_10)) {
                                                    continue;
                                                }
                                                break block23;
                                            }
                                            var2_10 = -1;
                                        }
                                        if (var2_10 == -1) ** GOTO lbl-1000
                                        var2_10 = var2_10 + var4_9 - var11_11 /* !! */ .getFirstVisiblePosition();
                                        var6_3 = var7_6 /* !! */ ;
                                        if (var2_10 < 0) break block22;
                                        if (var2_10 < var11_11 /* !! */ .getChildCount()) ** break;
                                        ** while (true)
                                        var8_7 = var11_11 /* !! */ .getChildAt(var2_10);
                                        var6_3 = var7_6 /* !! */ ;
                                        var7_6 /* !! */  = var8_7;
                                        break block25;
                                    }
                                    var6_3 = null;
                                }
                                var7_6 /* !! */  = null;
                            }
                            if (var7_6 /* !! */  == null) break block26;
                            if (Build.VERSION.SDK_INT <= 28) {
                                var8_7 = jz.a;
                                if (var8_7 != null) {
                                    try {
                                        var8_7.invoke((Object)var9_5.q, new Object[]{false});
                                    }
                                    catch (Exception var8_8) {
                                        Log.i((String)"MenuPopupWindow", (String)"Could not invoke setTouchModal() on PopupWindow. Oh well.");
                                    }
                                }
                            } else {
                                dp$$ExternalSyntheticApiModelOutline0.m(var9_5.q, false);
                            }
                            var9_5.q.setEnterTransition(null);
                            var8_7 = this.b;
                            var12_13 = ((dvy)var8_7.get(var8_7.size() - 1)).d();
                            var11_11 /* !! */  = (ListView)new int[2];
                            var12_13.getLocationOnScreen((int[])var11_11 /* !! */ );
                            var8_7 = new Rect();
                            this.d.getWindowVisibleDisplayFrame((Rect)var8_7);
                            var2_10 = !(this.r != 1 ? var11_11 /* !! */ [0] - var3_4 >= 0 : var11_11 /* !! */ [0] + var12_13.getWidth() + var3_4 > var8_7.right) ? 1 : 0;
                            this.r = var2_10;
                            var9_5.l = var7_6 /* !! */ ;
                            if ((this.p & 5) != 5) break block27;
                            if (var2_10 == 0) break block28;
                            var2_10 = var3_4;
                            break block29;
                        }
                        var3_4 = var7_6 /* !! */ .getWidth();
                        ** GOTO lbl-1000
                    }
                    if (var2_10 != 0) {
                        var2_10 = var7_6 /* !! */ .getWidth();
                    } else lbl-1000:
                    // 2 sources

                    {
                        var2_10 = -var3_4;
                    }
                }
                var9_5.g = var2_10;
                var9_5.i = true;
                var9_5.h = true;
                var9_5.j(0);
                break block30;
            }
            if (this.s) {
                var9_5.g = this.u;
            }
            if (this.t) {
                var9_5.j(this.v);
            }
            var9_5.t(this.g);
        }
        var7_6 /* !! */  = new dvy(var9_5, var1_1, this.r);
        this.b.add(var7_6 /* !! */ );
        var9_5.s();
        var7_6 /* !! */  = var9_5.e;
        var7_6 /* !! */ .setOnKeyListener(this);
        if (var6_3 == null && this.x && var1_1.e != null) {
            var6_3 = (FrameLayout)var10_2.inflate(2131623954, (ViewGroup)var7_6 /* !! */ , false);
            var8_7 = (TextView)var6_3.findViewById(16908310);
            var6_3.setEnabled(false);
            var8_7.setText(var1_1.e);
            var7_6 /* !! */ .addHeaderView((View)var6_3, null, false);
            var9_5.s();
        }
    }

    @Override
    public final ListView aQ() {
        if (this.b.isEmpty()) {
            return null;
        }
        List list = this.b;
        return ((dvy)list.get(list.size() - 1)).d();
    }

    @Override
    public final void c(fs fs2, boolean bl2) {
        int n2;
        int n3;
        block10: {
            n3 = this.b.size();
            for (n2 = 0; n2 < n3; ++n2) {
                if (fs2 != ((dvy)this.b.get((int)n2)).c) {
                    continue;
                }
                break block10;
            }
            n2 = -1;
        }
        if (n2 >= 0) {
            n3 = n2 + 1;
            if (n3 < this.b.size()) {
                ((fs)((dvy)this.b.get((int)n3)).c).i(false);
            }
            Object object = (dvy)this.b.remove(n2);
            ((fs)((dvy)object).c).m(this);
            if (this.f) {
                ((jz)((dvy)object).b).q.setExitTransition(null);
                ((jw)((dvy)object).b).q.setAnimationStyle(0);
            }
            ((jw)((dvy)object).b).k();
            n2 = this.b.size();
            this.r = n2 > 0 ? ((dvy)this.b.get((int)(n2 - 1))).a : this.y();
            if (n2 == 0) {
                this.k();
                object = this.y;
                if (object != null) {
                    object.a(fs2, true);
                }
                if ((fs2 = this.e) != null) {
                    if (fs2.isAlive()) {
                        this.e.removeGlobalOnLayoutListener(this.c);
                    }
                    this.e = null;
                }
                this.d.removeOnAttachStateChangeListener(this.m);
                this.z.onDismiss();
                return;
            }
            if (bl2) {
                ((fs)((dvy)this.b.get((int)0)).c).i(false);
            }
        }
    }

    @Override
    public final void d(gd gd2) {
        this.y = gd2;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final boolean f(gl gl2) {
        for (dvy dvy2 : this.b) {
            if (gl2 != dvy2.c) continue;
            dvy2.d().requestFocus();
            return true;
        }
        if (gl2.hasVisibleItems()) {
            this.j(gl2);
            gd gd2 = this.y;
            if (gd2 != null) {
                gd2.b(gl2);
            }
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            fm.v(((dvy)iterator.next()).d().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override
    public final void j(fs fs2) {
        fs2.h(this, this.h);
        if (this.u()) {
            this.z(fs2);
            return;
        }
        this.l.add(fs2);
    }

    @Override
    public final void k() {
        int n2 = this.b.size();
        if (n2 > 0) {
            int n3;
            dvy[] dvyArray = this.b.toArray(new dvy[n2]);
            while ((n3 = n2 - 1) >= 0) {
                dvy dvy2 = dvyArray[n3];
                n2 = n3;
                if (!((jw)dvy2.b).u()) continue;
                ((jw)dvy2.b).k();
                n2 = n3;
            }
        }
    }

    @Override
    public final void l(View view) {
        if (this.q != view) {
            this.q = view;
            this.p = Gravity.getAbsoluteGravity((int)this.o, (int)view.getLayoutDirection());
        }
    }

    @Override
    public final void m(boolean bl2) {
        this.w = bl2;
    }

    @Override
    public final void n(int n2) {
        if (this.o != n2) {
            this.o = n2;
            this.p = Gravity.getAbsoluteGravity((int)n2, (int)this.q.getLayoutDirection());
        }
    }

    @Override
    public final void o(int n2) {
        this.s = true;
        this.u = n2;
    }

    public final void onDismiss() {
        dvy dvy2;
        block3: {
            int n2 = this.b.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                dvy2 = (dvy)this.b.get(i2);
                if (((jw)dvy2.b).u()) {
                    continue;
                }
                break block3;
            }
            dvy2 = null;
        }
        if (dvy2 != null) {
            ((fs)dvy2.c).i(false);
        }
    }

    public final boolean onKey(View view, int n2, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && n2 == 82) {
            this.k();
            return true;
        }
        return false;
    }

    @Override
    public final void p(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override
    public final void q(boolean bl2) {
        this.x = bl2;
    }

    @Override
    public final void r(int n2) {
        this.t = true;
        this.v = n2;
    }

    @Override
    public final void s() {
        if (!this.u()) {
            View view;
            ViewTreeObserver viewTreeObserver = this.l.iterator();
            while (viewTreeObserver.hasNext()) {
                this.z((fs)viewTreeObserver.next());
            }
            this.l.clear();
            this.d = view = this.q;
            if (view != null) {
                viewTreeObserver = this.e;
                view = view.getViewTreeObserver();
                this.e = view;
                if (viewTreeObserver == null) {
                    view.addOnGlobalLayoutListener(this.c);
                }
                this.d.addOnAttachStateChangeListener(this.m);
            }
        }
    }

    @Override
    protected final boolean t() {
        return false;
    }

    @Override
    public final boolean u() {
        return this.b.size() > 0 && ((jw)((dvy)this.b.get((int)0)).b).u();
    }
}

