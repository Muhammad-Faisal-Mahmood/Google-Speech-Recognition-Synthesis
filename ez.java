/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ActionMode
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.View
 */
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public final class ez
extends ActionMode {
    final Context a;
    final ew b;

    public ez(Context context, ew ew2) {
        this.a = context;
        this.b = ew2;
    }

    public final void finish() {
        this.b.f();
    }

    public final View getCustomView() {
        return this.b.c();
    }

    public final Menu getMenu() {
        ew ew2 = this.b;
        return new gh(this.a, (tr)ew2.a());
    }

    public final MenuInflater getMenuInflater() {
        return this.b.b();
    }

    public final CharSequence getSubtitle() {
        return this.b.d();
    }

    public final Object getTag() {
        return this.b.d;
    }

    public final CharSequence getTitle() {
        return this.b.e();
    }

    public final boolean getTitleOptionalHint() {
        return this.b.e;
    }

    public final void invalidate() {
        this.b.g();
    }

    public final boolean isTitleOptional() {
        return this.b.n();
    }

    public final void setCustomView(View view) {
        this.b.h(view);
    }

    public final void setSubtitle(int n2) {
        this.b.i(n2);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.b.j(charSequence);
    }

    public final void setTag(Object object) {
        this.b.d = object;
    }

    public final void setTitle(int n2) {
        this.b.k(n2);
    }

    public final void setTitle(CharSequence charSequence) {
        this.b.l(charSequence);
    }

    public final void setTitleOptionalHint(boolean bl2) {
        this.b.m(bl2);
    }
}

