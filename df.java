/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ArrayAdapter
 */
import android.content.Context;
import android.support.v7.app.AlertController$RecycleListView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

final class df
extends ArrayAdapter {
    final AlertController$RecycleListView a;
    final di b;

    public df(di di2, Context context, int n2, CharSequence[] charSequenceArray, AlertController$RecycleListView alertController$RecycleListView) {
        this.b = di2;
        this.a = alertController$RecycleListView;
        super(context, n2, 16908308, (Object[])charSequenceArray);
    }

    public final View getView(int n2, View view, ViewGroup object) {
        di di2 = this.b;
        view = super.getView(n2, view, object);
        object = di2.s;
        if (object != null && object[n2] != false) {
            this.a.setItemChecked(n2, true);
        }
        return view;
    }
}

