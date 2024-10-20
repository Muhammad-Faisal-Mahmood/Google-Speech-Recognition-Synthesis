/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.MenuItem
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ListView
 */
package android.support.v7.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.wear.ambient.AmbientDelegate;

public final class ExpandedMenuView
extends ListView
implements AdapterView.OnItemClickListener,
fr,
gg {
    private static final int[] a = new int[]{16842964, 16843049};
    private fs b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context object, AttributeSet attributeSet, int n2) {
        super((Context)object, attributeSet);
        this.setOnItemClickListener(this);
        object = AmbientDelegate.A((Context)object, attributeSet, a, n2, 0);
        if (((AmbientDelegate)object).x(0)) {
            this.setBackgroundDrawable(((AmbientDelegate)object).r(0));
        }
        if (((AmbientDelegate)object).x(1)) {
            this.setDivider(((AmbientDelegate)object).r(1));
        }
        ((AmbientDelegate)object).v();
    }

    @Override
    public final void a(fs fs2) {
        this.b = fs2;
    }

    @Override
    public final boolean b(fu fu2) {
        throw null;
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView object, View view, int n2, long l2) {
        object = (fu)this.getAdapter().getItem(n2);
        this.b.z((MenuItem)object, 0);
    }
}

