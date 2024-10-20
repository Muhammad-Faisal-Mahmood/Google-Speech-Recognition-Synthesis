/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.Menu
 *  android.view.MenuItem
 */
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

public final class ey
implements ev {
    public final ActionMode.Callback a;
    public final Context b;
    final ArrayList c;
    final pa d;

    public ey(Context context, ActionMode.Callback callback) {
        this.b = context;
        this.a = callback;
        this.c = new ArrayList();
        this.d = new pa();
    }

    @Override
    public final void a(ew ew2) {
        throw null;
    }

    @Override
    public final boolean b(ew ew2, MenuItem menuItem) {
        throw null;
    }

    @Override
    public final boolean c(ew ew2, Menu menu) {
        throw null;
    }

    @Override
    public final void d(ew ew2, Menu menu) {
        throw null;
    }

    public final ActionMode e(ew object) {
        int n2 = this.c.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ez ez2 = (ez)((Object)this.c.get(i2));
            if (ez2 == null || ez2.b != object) continue;
            return ez2;
        }
        object = new ez(this.b, (ew)object);
        this.c.add(object);
        return object;
    }

    public final Menu f(Menu menu) {
        Menu menu2 = (Menu)this.d.get(menu);
        if (menu2 == null) {
            menu2 = new gh(this.b, (tr)menu);
            this.d.put(menu, menu2);
            return menu2;
        }
        return menu2;
    }
}

