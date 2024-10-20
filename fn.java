/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 */
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public final class fn
extends BaseAdapter {
    final fo a;
    private int b;

    public fn(fo fo2) {
        this.a = fo2;
        this.b = -1;
        this.b();
    }

    public final fu a(int n2) {
        ArrayList arrayList = this.a.c.e();
        int n3 = this.b;
        int n4 = n2;
        if (n3 >= 0) {
            n4 = n2;
            if (n2 >= n3) {
                n4 = n2 + 1;
            }
        }
        return (fu)arrayList.get(n4);
    }

    final void b() {
        Object object = this.a.c;
        fu fu2 = ((fs)object).i;
        if (fu2 != null) {
            object = ((fs)object).e();
            int n2 = ((ArrayList)object).size();
            for (int i2 = 0; i2 < n2; ++i2) {
                if ((fu)((ArrayList)object).get(i2) != fu2) continue;
                this.b = i2;
                return;
            }
        }
        this.b = -1;
    }

    public final int getCount() {
        int n2 = this.a.c.e().size();
        if (this.b < 0) {
            return n2;
        }
        return n2 - 1;
    }

    public final long getItemId(int n2) {
        return n2;
    }

    public final View getView(int n2, View view, ViewGroup viewGroup) {
        View view2 = view;
        if (view == null) {
            view2 = this.a.b.inflate(2131623952, viewGroup, false);
        }
        ((gf)view2).f(this.a(n2));
        return view2;
    }

    public final void notifyDataSetChanged() {
        this.b();
        super.notifyDataSetChanged();
    }
}

