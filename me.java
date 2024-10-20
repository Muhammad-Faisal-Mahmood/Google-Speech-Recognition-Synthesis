/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window$Callback
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.wear.ambient.AmbientDelegate;

public final class me {
    public final Toolbar a;
    public int b;
    CharSequence c;
    public Window.Callback d;
    public boolean e;
    public gy f;
    private View g;
    private Drawable h;
    private Drawable i;
    private Drawable j;
    private boolean k;
    private CharSequence l;
    private CharSequence m;
    private int n = 0;
    private final Drawable o;

    public me(Toolbar toolbar) {
        this.a = toolbar;
        this.c = toolbar.t;
        this.l = toolbar.u;
        boolean bl2 = this.c != null;
        this.k = bl2;
        this.j = toolbar.e();
        Context context = toolbar.getContext();
        Object object = er.a;
        Object object2 = null;
        object = AmbientDelegate.A(context, null, (int[])object, 2130968584, 0);
        context = ((AmbientDelegate)object).r(15);
        this.o = context;
        CharSequence charSequence = ((AmbientDelegate)object).t(27);
        if (!TextUtils.isEmpty((CharSequence)charSequence)) {
            this.d(charSequence);
        }
        if (!TextUtils.isEmpty((CharSequence)(charSequence = ((AmbientDelegate)object).t(25)))) {
            this.l = charSequence;
            if ((this.b & 8) != 0) {
                toolbar.u(charSequence);
            }
        }
        if ((charSequence = ((AmbientDelegate)object).r(20)) != null) {
            this.c((Drawable)charSequence);
        }
        if ((charSequence = ((AmbientDelegate)object).r(17)) != null) {
            this.h = charSequence;
            this.k();
        }
        if (this.j == null && context != null) {
            this.j = context;
            this.j();
        }
        this.b(((AmbientDelegate)object).m(10, 0));
        int n2 = ((AmbientDelegate)object).p(9, 0);
        if (n2 != 0) {
            context = LayoutInflater.from((Context)toolbar.getContext()).inflate(n2, (ViewGroup)toolbar, false);
            charSequence = this.g;
            if (charSequence != null && (this.b & 0x10) != 0) {
                toolbar.removeView((View)charSequence);
            }
            this.g = context;
            if (context != null && (this.b & 0x10) != 0) {
                toolbar.addView((View)context);
            }
            this.b(this.b | 0x10);
        }
        if ((n2 = ((AmbientDelegate)object).o(13, 0)) > 0) {
            context = toolbar.getLayoutParams();
            context.height = n2;
            toolbar.setLayoutParams((ViewGroup.LayoutParams)context);
        }
        int n3 = ((AmbientDelegate)object).k(7, -1);
        n2 = ((AmbientDelegate)object).k(3, -1);
        if (n3 >= 0 || n2 >= 0) {
            n3 = Math.max(n3, 0);
            n2 = Math.max(n2, 0);
            toolbar.k();
            toolbar.s.a(n3, n2);
        }
        if ((n2 = ((AmbientDelegate)object).p(28, 0)) != 0) {
            context = toolbar.getContext();
            toolbar.l = n2;
            charSequence = toolbar.b;
            if (charSequence != null) {
                charSequence.setTextAppearance(context, n2);
            }
        }
        if ((n2 = ((AmbientDelegate)object).p(26, 0)) != 0) {
            charSequence = toolbar.getContext();
            toolbar.m = n2;
            context = toolbar.c;
            if (context != null) {
                context.setTextAppearance((Context)charSequence, n2);
            }
        }
        if ((n2 = ((AmbientDelegate)object).p(22, 0)) != 0) {
            toolbar.t(n2);
        }
        ((AmbientDelegate)object).v();
        if (this.n != 2132017153) {
            this.n = 2132017153;
            if (TextUtils.isEmpty((CharSequence)toolbar.h())) {
                n2 = this.n;
                if (n2 != 0) {
                    object2 = this.a().getString(n2);
                }
                this.m = object2;
                this.i();
            }
        }
        this.m = toolbar.h();
        object2 = new mc(this);
        toolbar.m();
        toolbar.d.setOnClickListener((View.OnClickListener)object2);
    }

    private final void h(CharSequence charSequence) {
        this.c = charSequence;
        if ((this.b & 8) != 0) {
            this.a.v(charSequence);
            if (this.k) {
                wj.n(this.a.getRootView(), charSequence);
            }
        }
    }

    private final void i() {
        if ((this.b & 4) != 0) {
            if (TextUtils.isEmpty((CharSequence)this.m)) {
                Toolbar toolbar = this.a;
                int n2 = this.n;
                CharSequence charSequence = n2 != 0 ? toolbar.getContext().getText(n2) : null;
                toolbar.p(charSequence);
                return;
            }
            this.a.p(this.m);
        }
    }

    private final void j() {
        if ((this.b & 4) != 0) {
            Toolbar toolbar = this.a;
            Drawable drawable = this.j;
            if (drawable == null) {
                drawable = this.o;
            }
            toolbar.q(drawable);
            return;
        }
        this.a.q(null);
    }

    private final void k() {
        Drawable drawable;
        block4: {
            block2: {
                block3: {
                    Drawable drawable2;
                    int n2 = this.b;
                    if ((n2 & 2) == 0) break block2;
                    if ((n2 & 1) == 0) break block3;
                    drawable = drawable2 = this.i;
                    if (drawable2 != null) break block4;
                }
                drawable = this.h;
                break block4;
            }
            drawable = null;
        }
        this.a.o(drawable);
    }

    public final Context a() {
        return this.a.getContext();
    }

    public final void b(int n2) {
        int n3 = this.b ^ n2;
        this.b = n2;
        if (n3 != 0) {
            View view;
            if ((n3 & 4) != 0) {
                if ((n2 & 4) != 0) {
                    this.i();
                }
                this.j();
            }
            if ((n3 & 3) != 0) {
                this.k();
            }
            if ((n3 & 8) != 0) {
                if ((n2 & 8) != 0) {
                    this.a.v(this.c);
                    this.a.u(this.l);
                } else {
                    this.a.v(null);
                    this.a.u(null);
                }
            }
            if ((n3 & 0x10) != 0 && (view = this.g) != null) {
                if ((n2 & 0x10) != 0) {
                    this.a.addView(view);
                    return;
                }
                this.a.removeView(view);
            }
        }
    }

    public final void c(Drawable drawable) {
        this.i = drawable;
        this.k();
    }

    public final void d(CharSequence charSequence) {
        this.k = true;
        this.h(charSequence);
    }

    public final void e(int n2) {
        this.a.setVisibility(n2);
    }

    public final void f(CharSequence charSequence) {
        if (!this.k) {
            this.h(charSequence);
        }
    }

    public final bzb g(int n2, long l2) {
        float f2 = n2 == 0 ? 1.0f : 0.0f;
        bzb bzb2 = wj.t((View)this.a);
        bzb2.V(f2);
        bzb2.W(l2);
        bzb2.X(new md(this, n2));
        return bzb2;
    }
}

