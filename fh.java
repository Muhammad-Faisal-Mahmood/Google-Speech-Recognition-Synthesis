/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.support.v7.view.menu.ActionMenuItemView;
import android.view.View;
import androidx.wear.ambient.AmbientMode$AmbientController;

public final class fh
extends jg {
    final ActionMenuItemView a;

    public fh(ActionMenuItemView actionMenuItemView) {
        this.a = actionMenuItemView;
        super((View)actionMenuItemView);
    }

    @Override
    public final gi a() {
        Object object = this.a.c;
        if (object != null && (object = ((gy)((AmbientMode$AmbientController)object).a).j) != null) {
            return ((gc)object).a();
        }
        return null;
    }

    @Override
    public final boolean b() {
        ActionMenuItemView actionMenuItemView = this.a;
        Object object = actionMenuItemView.b;
        return object != null && object.b(actionMenuItemView.a) && (object = this.a()) != null && object.u();
    }
}

