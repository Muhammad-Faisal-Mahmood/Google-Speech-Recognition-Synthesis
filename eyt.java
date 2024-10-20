/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Parcelable
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 */
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.libraries.social.licenses.LicenseActivity;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;

public final class eyt
implements AdapterView.OnItemClickListener {
    public final Object a;
    private final int b;

    public /* synthetic */ eyt(eyu eyu2, int n2) {
        this.b = n2;
        this.a = eyu2;
    }

    public eyt(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public final void onItemClick(AdapterView object, View object2, int n2, long l2) {
        block5: {
            block6: {
                block7: {
                    fyg fyg2;
                    int n3;
                    block9: {
                        Object var7_6;
                        block8: {
                            n3 = this.b;
                            if (n3 == 0) break block5;
                            if (n3 == 1) break block6;
                            var7_6 = null;
                            object = n2 < 0 ? (!((jw)(object = ((fyg)((Object)this.a)).a)).u() ? null : ((jw)object).e.getSelectedItem()) : ((fyg)((Object)this.a)).getAdapter().getItem(n2);
                            fyg2 = (fyg)((Object)this.a);
                            fyg2.setText(fyg.a(fyg2, object), false);
                            fyg2 = ((fyg)((Object)this.a)).getOnItemClickListener();
                            if (fyg2 == null) break block7;
                            if (object2 == null) break block8;
                            object = object2;
                            n3 = n2;
                            if (n2 >= 0) break block9;
                        }
                        object = !((jw)(object = ((fyg)((Object)this.a)).a)).u() ? var7_6 : ((jw)object).e.getSelectedView();
                        object2 = ((fyg)((Object)this.a)).a;
                        n3 = ((jw)object2).o();
                        l2 = !((jw)object2).u() ? Long.MIN_VALUE : ((jw)object2).e.getSelectedItemId();
                    }
                    fyg2.onItemClick((AdapterView)((fyg)((Object)this.a)).a.e, (View)object, n3, l2);
                }
                ((fyg)((Object)this.a)).a.k();
                return;
            }
            ((hy)this.a).d.setSelection(n2);
            if (((hy)this.a).d.getOnItemClickListener() != null) {
                object = (hy)this.a;
                l2 = ((hy)object).b.getItemId(n2);
                ((hy)object).d.performItemClick((View)object2, n2, l2);
            }
            ((jw)this.a).k();
            return;
        }
        object2 = (eys)object.getItemAtPosition(n2);
        LicenseMenuActivity licenseMenuActivity = ((eyu)this.a).b;
        if (licenseMenuActivity != null) {
            object = new Intent((Context)licenseMenuActivity, LicenseActivity.class);
            object.putExtra("license", (Parcelable)object2);
            licenseMenuActivity.startActivity((Intent)object);
        }
    }
}

