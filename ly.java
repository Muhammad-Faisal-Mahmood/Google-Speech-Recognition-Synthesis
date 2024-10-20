/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  android.view.ViewGroup
 */
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.wear.ambient.AmbientMode$AmbientController;

public final class ly
implements fq {
    final ViewGroup a;
    private final int b;

    public ly(ViewGroup viewGroup, int n2) {
        this.b = n2;
        this.a = viewGroup;
    }

    @Override
    public final void F(fs fs2) {
        if (this.b != 0) {
            fq fq2 = ((ActionMenuView)this.a).d;
            if (fq2 != null) {
                fq2.F(fs2);
            }
            return;
        }
        if (!((Toolbar)this.a).a.l()) {
            ((Toolbar)this.a).z.e(fs2);
        }
    }

    @Override
    public final boolean J(fs object, MenuItem menuItem) {
        return this.b != 0 && (object = ((ActionMenuView)this.a).e) != null && ((Toolbar)((AmbientMode$AmbientController)object).a).z.f(menuItem);
    }
}

