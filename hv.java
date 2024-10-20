/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.graphics.drawable.Drawable
 *  android.util.Log
 *  android.widget.ListAdapter
 */
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;

final class hv
implements DialogInterface.OnClickListener,
ia {
    dn a;
    final ib b;
    private ListAdapter c;
    private CharSequence d;

    public hv(ib ib2) {
        this.b = ib2;
    }

    @Override
    public final int a() {
        return 0;
    }

    @Override
    public final int b() {
        return 0;
    }

    @Override
    public final Drawable c() {
        return null;
    }

    @Override
    public final CharSequence d() {
        return this.d;
    }

    @Override
    public final void e(ListAdapter listAdapter) {
        this.c = listAdapter;
    }

    @Override
    public final void f(Drawable drawable) {
        Log.e((String)"AppCompatSpinner", (String)"Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override
    public final void g(int n2) {
        Log.e((String)"AppCompatSpinner", (String)"Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final void h(int n2) {
        Log.e((String)"AppCompatSpinner", (String)"Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final void i(CharSequence charSequence) {
        this.d = charSequence;
    }

    @Override
    public final void j(int n2) {
        Log.e((String)"AppCompatSpinner", (String)"Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final void k() {
        dn dn2 = this.a;
        if (dn2 != null) {
            dn2.dismiss();
            this.a = null;
        }
    }

    @Override
    public final void l(int n2, int n3) {
        if (this.c == null) {
            return;
        }
        Object object = new dm(this.b.a);
        Object object2 = this.d;
        if (object2 != null) {
            ((dm)object).g((CharSequence)object2);
        }
        ListAdapter listAdapter = this.c;
        ib ib2 = this.b;
        object2 = ((dm)object).a;
        int n4 = ib2.getSelectedItemPosition();
        ((di)object2).p = listAdapter;
        ((di)object2).q = this;
        ((di)object2).v = n4;
        ((di)object2).u = true;
        this.a = object = ((dm)object).b();
        object = ((dn)object).a.f;
        object.setTextDirection(n2);
        object.setTextAlignment(n3);
        this.a.show();
    }

    public final void onClick(DialogInterface dialogInterface, int n2) {
        this.b.setSelection(n2);
        if (this.b.getOnItemClickListener() != null) {
            this.b.performItemClick(null, n2, this.c.getItemId(n2));
        }
        this.k();
    }

    @Override
    public final boolean u() {
        dn dn2 = this.a;
        if (dn2 != null) {
            return dn2.isShowing();
        }
        return false;
    }
}

