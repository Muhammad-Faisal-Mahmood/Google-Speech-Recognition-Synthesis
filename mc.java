/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.Window$Callback
 */
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

final class mc
implements View.OnClickListener {
    final fg a;
    final me b;

    public mc(me me2) {
        this.b = me2;
        this.a = new fg(me2.a.getContext(), me2.c);
    }

    public final void onClick(View object) {
        object = this.b;
        Window.Callback callback = object.d;
        if (callback != null && object.e) {
            callback.onMenuItemSelected(0, (MenuItem)this.a);
        }
    }
}

