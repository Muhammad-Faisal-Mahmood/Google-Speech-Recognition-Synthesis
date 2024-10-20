/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.FrameLayout
 *  android.widget.HeaderViewListAdapter
 *  android.widget.ListAdapter
 *  android.widget.PopupWindow$OnDismissListener
 */
import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

abstract class ga
implements AdapterView.OnItemClickListener,
gi,
ge {
    public Rect g;

    protected static fp v(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (fp)((HeaderViewListAdapter)listAdapter).getWrappedAdapter();
        }
        return (fp)listAdapter;
    }

    protected static boolean w(fs fs2) {
        boolean bl2;
        int n2 = fs2.size();
        boolean bl3 = false;
        int n3 = 0;
        while (true) {
            bl2 = bl3;
            if (n3 >= n2) break;
            MenuItem menuItem = fs2.getItem(n3);
            if (menuItem.isVisible() && menuItem.getIcon() != null) {
                bl2 = true;
                break;
            }
            ++n3;
        }
        return bl2;
    }

    protected static int x(ListAdapter listAdapter, Context context, int n2) {
        int n3 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
        int n4 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
        int n5 = listAdapter.getCount();
        int n6 = 0;
        int n7 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i2 = 0; i2 < n5; ++i2) {
            int n8 = listAdapter.getItemViewType(i2);
            int n9 = n8 != n7 ? n8 : n7;
            if (n8 != n7) {
                view = null;
            }
            FrameLayout frameLayout2 = frameLayout;
            if (frameLayout == null) {
                frameLayout2 = new FrameLayout(context);
            }
            view = listAdapter.getView(i2, view, (ViewGroup)frameLayout2);
            view.measure(n3, n4);
            n8 = view.getMeasuredWidth();
            if (n8 >= n2) {
                return n2;
            }
            n7 = n6;
            if (n8 > n6) {
                n7 = n8;
            }
            n6 = n7;
            n7 = n9;
            frameLayout = frameLayout2;
        }
        return n6;
    }

    @Override
    public final void b(Context context, fs fs2) {
    }

    @Override
    public final boolean g(fu fu2) {
        return false;
    }

    @Override
    public final boolean h(fu fu2) {
        return false;
    }

    public abstract void j(fs var1);

    public abstract void l(View var1);

    public abstract void m(boolean var1);

    public abstract void n(int var1);

    public abstract void o(int var1);

    public final void onItemClick(AdapterView object, View view, int n2, long l2) {
        view = (ListAdapter)object.getAdapter();
        object = ga.v((ListAdapter)view).a;
        view = (MenuItem)view.getItem(n2);
        n2 = true != this.t() ? 4 : 0;
        ((fs)object).A((MenuItem)view, this, n2);
    }

    public abstract void p(PopupWindow.OnDismissListener var1);

    public abstract void q(boolean var1);

    public abstract void r(int var1);

    protected boolean t() {
        return true;
    }
}

