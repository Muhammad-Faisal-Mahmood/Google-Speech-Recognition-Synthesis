/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface$OnDismissListener
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.WindowManager$LayoutParams
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ListAdapter
 */
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;

public final class fo
implements AdapterView.OnItemClickListener,
ge {
    Context a;
    public LayoutInflater b;
    fs c;
    public ExpandedMenuView d;
    public gd e;
    public fn f;

    public fo(Context context) {
        this.a = context;
        this.b = LayoutInflater.from((Context)context);
    }

    public final ListAdapter a() {
        if (this.f == null) {
            this.f = new fn(this);
        }
        return this.f;
    }

    @Override
    public final void b(Context object, fs fs2) {
        if (this.a != null) {
            this.a = object;
            if (this.b == null) {
                this.b = LayoutInflater.from((Context)object);
            }
        }
        this.c = fs2;
        object = this.f;
        if (object != null) {
            object.notifyDataSetChanged();
        }
    }

    @Override
    public final void c(fs fs2, boolean bl2) {
        gd gd2 = this.e;
        if (gd2 != null) {
            gd2.a(fs2, bl2);
        }
    }

    @Override
    public final void d(gd gd2) {
        throw null;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final boolean f(gl gl2) {
        if (!gl2.hasVisibleItems()) {
            return false;
        }
        gd gd2 = new ft(gl2);
        fs fs2 = ((ft)gd2).a;
        dm dm2 = new dm(fs2.a);
        ((ft)gd2).c = new fo(dm2.a());
        Object object = ((ft)gd2).c;
        ((fo)object).e = gd2;
        ((ft)gd2).a.g((ge)object);
        ListAdapter listAdapter = ((ft)gd2).c.a();
        object = dm2.a;
        ((di)object).p = listAdapter;
        ((di)object).q = gd2;
        listAdapter = fs2.g;
        if (listAdapter != null) {
            ((di)object).e = listAdapter;
        } else {
            dm2.c(fs2.f);
            dm2.g(fs2.e);
        }
        dm2.a.n = gd2;
        ((ft)gd2).b = dm2.b();
        ((ft)gd2).b.setOnDismissListener((DialogInterface.OnDismissListener)gd2);
        fs2 = ((ft)gd2).b.getWindow().getAttributes();
        ((WindowManager.LayoutParams)fs2).type = 1003;
        ((WindowManager.LayoutParams)fs2).flags |= 0x20000;
        ((ft)gd2).b.show();
        gd2 = this.e;
        if (gd2 != null) {
            gd2.b(gl2);
        }
        return true;
    }

    @Override
    public final boolean g(fu fu2) {
        return false;
    }

    @Override
    public final boolean h(fu fu2) {
        return false;
    }

    @Override
    public final void i() {
        fn fn2 = this.f;
        if (fn2 != null) {
            fn2.notifyDataSetChanged();
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int n2, long l2) {
        this.c.A(this.f.a(n2), this, 0);
    }
}

