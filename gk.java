/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.view.Gravity
 *  android.view.KeyEvent
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.View$OnKeyListener
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.FrameLayout
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.PopupWindow$OnDismissListener
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;

final class gk
extends ga
implements PopupWindow.OnDismissListener,
AdapterView.OnItemClickListener,
View.OnKeyListener,
ge {
    final jz a;
    final ViewTreeObserver.OnGlobalLayoutListener b = new gj(this, 0);
    View c;
    ViewTreeObserver d;
    private final Context e;
    private final fs f;
    private final fp h;
    private final boolean i;
    private final int j;
    private final int k;
    private final View.OnAttachStateChangeListener l = new fk(this, 2);
    private PopupWindow.OnDismissListener m;
    private View n;
    private gd o;
    private boolean p;
    private boolean q;
    private int r;
    private int s = 0;
    private boolean t;

    public gk(Context context, fs fs2, View view, int n2, boolean bl2) {
        this.e = context;
        this.f = fs2;
        this.i = bl2;
        this.h = new fp(fs2, LayoutInflater.from((Context)context), bl2, 2131623955);
        this.k = n2;
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.n = view;
        this.a = new jz(context, n2);
        fs2.h(this, context);
    }

    @Override
    public final ListView aQ() {
        return this.a.e;
    }

    @Override
    public final void c(fs fs2, boolean bl2) {
        if (fs2 == this.f) {
            this.k();
            gd gd2 = this.o;
            if (gd2 != null) {
                gd2.a(fs2, bl2);
            }
        }
    }

    @Override
    public final void d(gd gd2) {
        this.o = gd2;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final boolean f(gl gl2) {
        block5: {
            Object object;
            block6: {
                if (!gl2.hasVisibleItems()) break block5;
                gc gc2 = new gc(this.e, gl2, this.c, this.i, this.k);
                gc2.e(this.o);
                gc2.d(ga.w(gl2));
                gc2.c = this.m;
                this.m = null;
                this.f.i(false);
                object = this.a;
                int n2 = ((jw)object).g;
                int n3 = ((jw)object).b();
                int n4 = n2;
                if ((Gravity.getAbsoluteGravity((int)this.s, (int)this.n.getLayoutDirection()) & 7) == 5) {
                    n4 = n2 + this.n.getWidth();
                }
                if (gc2.g()) break block6;
                if (gc2.a == null) break block5;
                gc2.f(n4, n3, true, true);
            }
            if ((object = this.o) != null) {
                object.b(gl2);
            }
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        this.q = false;
        fp fp2 = this.h;
        if (fp2 != null) {
            fp2.notifyDataSetChanged();
        }
    }

    @Override
    public final void j(fs fs2) {
    }

    @Override
    public final void k() {
        if (this.u()) {
            this.a.k();
        }
    }

    @Override
    public final void l(View view) {
        this.n = view;
    }

    @Override
    public final void m(boolean bl2) {
        this.h.b = bl2;
    }

    @Override
    public final void n(int n2) {
        this.s = n2;
    }

    @Override
    public final void o(int n2) {
        this.a.g = n2;
    }

    public final void onDismiss() {
        this.p = true;
        this.f.close();
        ViewTreeObserver viewTreeObserver = this.d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.d = this.c.getViewTreeObserver();
            }
            this.d.removeGlobalOnLayoutListener(this.b);
            this.d = null;
        }
        this.c.removeOnAttachStateChangeListener(this.l);
        viewTreeObserver = this.m;
        if (viewTreeObserver != null) {
            viewTreeObserver.onDismiss();
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
        this.m = onDismissListener;
    }

    @Override
    public final void q(boolean bl2) {
        this.t = bl2;
    }

    @Override
    public final void r(int n2) {
        this.a.j(n2);
    }

    @Override
    public final void s() {
        Object object;
        if (this.u()) {
            return;
        }
        if (!this.p && (object = this.n) != null) {
            ViewTreeObserver viewTreeObserver;
            this.c = object;
            this.a.v(this);
            object = this.a;
            object.m = this;
            object.y();
            object = this.c;
            Object object2 = this.d;
            this.d = viewTreeObserver = object.getViewTreeObserver();
            if (object2 == null) {
                viewTreeObserver.addOnGlobalLayoutListener(this.b);
            }
            object.addOnAttachStateChangeListener(this.l);
            object2 = this.a;
            object2.l = object;
            object2.j = this.s;
            if (!this.q) {
                this.r = gk.x((ListAdapter)this.h, this.e, this.j);
                this.q = true;
            }
            this.a.r(this.r);
            this.a.x();
            this.a.t(this.g);
            this.a.s();
            object = this.a.e;
            object.setOnKeyListener((View.OnKeyListener)this);
            if (this.t && this.f.e != null) {
                object2 = (FrameLayout)LayoutInflater.from((Context)this.e).inflate(2131623954, (ViewGroup)object, false);
                viewTreeObserver = (TextView)object2.findViewById(16908310);
                if (viewTreeObserver != null) {
                    viewTreeObserver.setText(this.f.e);
                }
                object2.setEnabled(false);
                object.addHeaderView((View)object2, null, false);
            }
            this.a.e((ListAdapter)this.h);
            this.a.s();
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override
    public final boolean u() {
        return !this.p && this.a.u();
    }
}

