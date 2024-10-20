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

public final class ex
extends ew
implements fq {
    public final fs a;
    private final Context b;
    private final ActionBarContextView c;
    private final ev f;
    private WeakReference g;
    private boolean h;

    public ex(Context object, ActionBarContextView actionBarContextView, ev ev2) {
        this.b = object;
        this.c = actionBarContextView;
        this.f = ev2;
        object = new fs(actionBarContextView.getContext());
        ((fs)object).D();
        this.a = object;
        ((fs)object).b = this;
    }

    @Override
    public final void F(fs fs2) {
        this.g();
        this.c.n();
    }

    @Override
    public final boolean J(fs fs2, MenuItem menuItem) {
        return this.f.b(this, menuItem);
    }

    @Override
    public final Menu a() {
        return this.a;
    }

    @Override
    public final MenuInflater b() {
        return new fc(this.c.getContext());
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
        return this.c.h;
    }

    @Override
    public final CharSequence e() {
        return this.c.g;
    }

    @Override
    public final void f() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f.a(this);
    }

    @Override
    public final void g() {
        this.f.d(this, this.a);
    }

    @Override
    public final void h(View object) {
        this.c.j((View)object);
        object = object != null ? new WeakReference<View>((View)object) : null;
        this.g = object;
    }

    @Override
    public final void i(int n2) {
        this.j(this.b.getString(n2));
    }

    @Override
    public final void j(CharSequence charSequence) {
        this.c.k(charSequence);
    }

    @Override
    public final void k(int n2) {
        this.l(this.b.getString(n2));
    }

    @Override
    public final void l(CharSequence charSequence) {
        this.c.l(charSequence);
    }

    @Override
    public final void m(boolean bl2) {
        this.e = bl2;
        this.c.m(bl2);
    }

    @Override
    public final boolean n() {
        return this.c.j;
    }
}

