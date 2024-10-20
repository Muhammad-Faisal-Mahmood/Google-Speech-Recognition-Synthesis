/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 */
import android.support.v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public final class fp
extends BaseAdapter {
    public final fs a;
    public boolean b;
    private int c = -1;
    private final boolean d;
    private final LayoutInflater e;
    private final int f;

    public fp(fs fs2, LayoutInflater layoutInflater, boolean bl2, int n2) {
        this.d = bl2;
        this.e = layoutInflater;
        this.a = fs2;
        this.f = n2;
        this.b();
    }

    public final fu a(int n2) {
        ArrayList arrayList = this.d ? this.a.e() : this.a.f();
        int n3 = this.c;
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
        Object object = this.a;
        fu fu2 = ((fs)object).i;
        if (fu2 != null) {
            object = ((fs)object).e();
            int n2 = ((ArrayList)object).size();
            for (int i2 = 0; i2 < n2; ++i2) {
                if ((fu)((ArrayList)object).get(i2) != fu2) continue;
                this.c = i2;
                return;
            }
        }
        this.c = -1;
    }

    public final int getCount() {
        ArrayList arrayList = this.d ? this.a.e() : this.a.f();
        if (this.c < 0) {
            return arrayList.size();
        }
        return arrayList.size() - 1;
    }

    public final long getItemId(int n2) {
        return n2;
    }

    public final View getView(int n2, View object, ViewGroup object2) {
        int n3 = 0;
        View view = object;
        if (object == null) {
            view = this.e.inflate(this.f, (ViewGroup)object2, false);
        }
        int n4 = this.a((int)n2).b;
        int n5 = n2 - 1;
        n5 = n5 >= 0 ? this.a((int)n5).b : n4;
        object = (ListMenuItemView)view;
        n5 = this.a.w() && n4 != n5 ? 1 : 0;
        object2 = object.b;
        if (object2 != null) {
            n5 = !object.d && n5 != 0 ? n3 : 8;
            object2.setVisibility(n5);
        }
        object2 = (gf)view;
        if (this.b) {
            object.e = true;
            object.c = true;
        }
        object2.f(this.a(n2));
        return view;
    }

    public final void notifyDataSetChanged() {
        this.b();
        super.notifyDataSetChanged();
    }
}

