/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 */
import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

public final class ep
extends ew
implements fq {
    public final fs a;
    public ev b;
    final eq c;
    private final Context f;
    private WeakReference g;

    public ep(eq object, Context context, ev ev2) {
        this.c = object;
        this.f = context;
        this.b = ev2;
        object = new fs(context);
        ((fs)object).D();
        this.a = object;
        ((fs)object).b = this;
    }

    @Override
    public final void F(fs fs2) {
        if (this.b == null) {
            return;
        }
        this.g();
        this.c.d.n();
    }

    @Override
    public final boolean J(fs object, MenuItem menuItem) {
        object = this.b;
        if (object != null) {
            return object.b(this, menuItem);
        }
        return false;
    }

    @Override
    public final Menu a() {
        return this.a;
    }

    @Override
    public final MenuInflater b() {
        return new fc(this.f);
    }

    @Override
    public final View c() {
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            return (View)weakReference.get();
        }
        return null;
    }

    @Override
    public final CharSequence d() {
        return this.c.d.h;
    }

    @Override
    public final CharSequence e() {
        return this.c.d.g;
    }

    @Override
    public final void f() {
        Object object = this.c;
        if (((eq)object).f != this) {
            return;
        }
        if (!eq.l(((eq)object).k, false)) {
            ((eq)object).g = this;
            ((eq)object).h = this.b;
        } else {
            this.b.a(this);
        }
        this.b = null;
        this.c.i(false);
        object = this.c.d;
        if (((ActionBarContextView)((Object)object)).i == null) {
            ((ActionBarContextView)((Object)object)).i();
        }
        object = this.c;
        ((eq)object).b.k(((eq)object).m);
        this.c.f = null;
    }

    @Override
    public final void g() {
        if (this.c.f != this) {
            return;
        }
        this.a.s();
        try {
            this.b.d(this, this.a);
            return;
        }
        finally {
            this.a.r();
        }
    }

    @Override
    public final void h(View view) {
        this.c.d.j(view);
        this.g = new WeakReference<View>(view);
    }

    @Override
    public final void i(int n2) {
        this.j(this.c.a.getResources().getString(n2));
    }

    @Override
    public final void j(CharSequence charSequence) {
        this.c.d.k(charSequence);
    }

    @Override
    public final void k(int n2) {
        this.l(this.c.a.getResources().getString(n2));
    }

    @Override
    public final void l(CharSequence charSequence) {
        this.c.d.l(charSequence);
    }

    @Override
    public final void m(boolean bl2) {
        this.e = bl2;
        this.c.d.m(bl2);
    }

    @Override
    public final boolean n() {
        return this.c.d.j;
    }
}

