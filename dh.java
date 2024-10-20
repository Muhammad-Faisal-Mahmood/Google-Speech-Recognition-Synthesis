/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 */
import android.content.DialogInterface;
import android.support.v7.app.AlertController$RecycleListView;
import android.view.View;
import android.widget.AdapterView;

final class dh
implements AdapterView.OnItemClickListener {
    final AlertController$RecycleListView a;
    final dl b;
    final di c;

    public dh(di di2, AlertController$RecycleListView alertController$RecycleListView, dl dl2) {
        this.c = di2;
        this.a = alertController$RecycleListView;
        this.b = dl2;
    }

    public final void onItemClick(AdapterView object, View object2, int n2, long l2) {
        object = this.c.s;
        if (object != null) {
            object[n2] = (AdapterView)this.a.isItemChecked(n2);
        }
        di di2 = this.c;
        object = this.b;
        object2 = this.a;
        di2.w.onClick((DialogInterface)object.b, n2, object2.isItemChecked(n2));
    }
}

