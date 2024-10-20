/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.CompoundButton
 */
import android.view.View;
import android.widget.CompoundButton;

public final class bup
implements View.OnClickListener {
    public final Object a;
    public final Object b;
    private final int c;

    public /* synthetic */ bup(Object object, Object object2, int n2) {
        this.c = n2;
        this.a = object;
        this.b = object2;
    }

    public final void onClick(View object) {
        if (this.c != 0) {
            int n2 = blh.q;
            ((CompoundButton)this.a).toggle();
            object = this.b;
            if (object != null) {
                ((eky)object).b();
            }
            return;
        }
        object = ((bvj)this.b).c;
        ((but)this.a).a.F((String)object);
    }
}

