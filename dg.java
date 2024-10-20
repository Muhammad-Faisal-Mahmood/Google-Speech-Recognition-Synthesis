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
import android.view.View;
import android.widget.AdapterView;

final class dg
implements AdapterView.OnItemClickListener {
    final dl a;
    final di b;

    public dg(di di2, dl dl2) {
        this.b = di2;
        this.a = dl2;
    }

    public final void onItemClick(AdapterView object, View view, int n2, long l2) {
        object = this.a;
        this.b.q.onClick((DialogInterface)object.b, n2);
        if (!this.b.u) {
            this.a.b.dismiss();
        }
    }
}

