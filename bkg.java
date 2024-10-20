/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnLayoutChangeListener
 */
import android.view.View;
import com.android.car.ui.baselayout.Insets;

public final class bkg
implements View.OnLayoutChangeListener {
    public final bkh a;

    public /* synthetic */ bkg(bkh bkh2) {
        this.a = bkh2;
    }

    public final void onLayoutChange(View object, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        if (n2 != n6 || n3 != n7 || n4 != n8 || n5 != n9) {
            object = this.a;
            n3 = bkh.d(object.b);
            n2 = bkh.d(object.a);
            Object object2 = object.b;
            n3 = Math.max(0, n3 - n2);
            n2 = bkh.b((View)object2);
            n4 = bkh.b(object.a);
            object2 = object.a;
            n5 = Math.max(0, n2 - n4);
            n2 = bkh.c((View)object2);
            n4 = bkh.c(object.b);
            object2 = object.a;
            n6 = Math.max(0, n2 - n4);
            n2 = bkh.a((View)object2);
            n4 = bkh.a(object.b);
            Object object3 = object.e;
            n4 = Math.max(0, n2 - n4);
            n2 = n3;
            if (object3 != null) {
                object2 = object.b;
                n2 = n3 + Math.max(0, bkh.a((View)object3) - bkh.d((View)object2));
            }
            object2 = object.f;
            n3 = n4;
            if (object2 != null) {
                n3 = n4 + Math.max(0, bkh.a(object.b) - bkh.d((View)object2));
            }
            object3 = object.c;
            n4 = n5;
            if (object3 != null) {
                object2 = object.b;
                n4 = n5 + Math.max(0, bkh.c((View)object3) - bkh.b((View)object2));
            }
            object2 = object.d;
            n5 = n6;
            if (object2 != null) {
                n5 = n6 + Math.max(0, bkh.c(object.b) - bkh.b((View)object2));
            }
            if (!((Insets)(object2 = new Insets(n4, n2, n5, n3))).equals(object.h)) {
                object.h = object2;
                object3 = object.g;
                if (object3 != null) {
                    object3.a((Insets)object2);
                    return;
                }
                object.a.setPadding(((Insets)object2).getLeft(), ((Insets)object2).getTop(), ((Insets)object2).getRight(), ((Insets)object2).getBottom());
            }
        }
    }
}

