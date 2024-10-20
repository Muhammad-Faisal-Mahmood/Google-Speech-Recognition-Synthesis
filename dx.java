/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ActionMode
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.View
 */
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

final class dx
implements ev {
    final eg a;
    private final ev b;

    public dx(eg eg2, ev ev2) {
        this.a = eg2;
        this.b = ev2;
    }

    @Override
    public final void a(ew object) {
        Object object2 = (ey)this.b;
        ((ey)object2).a.onDestroyActionMode(((ey)object2).e((ew)object));
        object = this.a;
        if (((eg)object).s != null) {
            ((eg)object).l.getDecorView().removeCallbacks(this.a.t);
        }
        object = this.a;
        if (((eg)object).r != null) {
            ((eg)object).C();
            object2 = this.a;
            object = wj.t((View)((eg)object2).r);
            ((bzb)object).V(0.0f);
            ((eg)object2).M = object;
            this.a.M.X(new dw(this));
        }
        object2 = this.a;
        object = ((eg)object2).m;
        if (object != null) {
            object.q(((eg)object2).q);
        }
        object = this.a;
        ((eg)object).q = null;
        vy.d((View)((eg)object).w);
        this.a.G();
    }

    @Override
    public final boolean b(ew ew2, MenuItem menuItem) {
        ey ey2 = (ey)this.b;
        ew2 = ey2.e(ew2);
        menuItem = new fz(ey2.b, (ts)menuItem);
        return ey2.a.onActionItemClicked((ActionMode)ew2, menuItem);
    }

    @Override
    public final boolean c(ew ew2, Menu menu) {
        ey ey2 = (ey)this.b;
        return ey2.a.onCreateActionMode(ey2.e(ew2), ey2.f(menu));
    }

    @Override
    public final void d(ew ew2, Menu menu) {
        vy.d((View)this.a.w);
        ey ey2 = (ey)this.b;
        ey2.a.onPrepareActionMode(ey2.e(ew2), ey2.f(menu));
    }
}

