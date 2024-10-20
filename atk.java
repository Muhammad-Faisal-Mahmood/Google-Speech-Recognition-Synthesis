/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 */
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.preference.Preference;

final class atk
extends us {
    final atl a;

    public atk(atl atl2) {
        this.a = atl2;
    }

    @Override
    public final void b(View object, xv xv2) {
        this.a.e.b((View)object, xv2);
        RecyclerView recyclerView = this.a.d;
        int n2 = recyclerView.c((View)object);
        object = recyclerView.g();
        if (object instanceof ate && (object = ((ate)object).e(n2)) != null) {
            ((Preference)object).onInitializeAccessibilityNodeInfo(xv2);
        }
    }

    @Override
    public final boolean h(View view, int n2, Bundle bundle) {
        return this.a.e.h(view, n2, bundle);
    }
}

