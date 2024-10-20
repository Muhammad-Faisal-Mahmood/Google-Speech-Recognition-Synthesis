/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import j$.util.Objects;

public final class ftr
implements vk {
    final CollapsingToolbarLayout a;

    public ftr(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.a = collapsingToolbarLayout;
    }

    @Override
    public final xn a(View object, xn xn2) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.a;
        object = true != collapsingToolbarLayout.getFitsSystemWindows() ? null : xn2;
        if (!Objects.equals(collapsingToolbarLayout.e, object)) {
            collapsingToolbarLayout.e = object;
            collapsingToolbarLayout.requestLayout();
        }
        return xn2.k();
    }
}

