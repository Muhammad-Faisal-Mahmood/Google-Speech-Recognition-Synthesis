/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnLayoutChangeListener
 */
import android.view.View;
import com.android.car.ui.baselayout.Insets;

final class bkh {
    public final View a;
    public final View b;
    public final View c;
    public final View d;
    public final View e;
    public final View f;
    public bju g;
    public Insets h = new Insets();

    public bkh(View view, View view2) {
        View view3;
        View view4;
        View view5;
        View view6;
        this.a = view2;
        this.b = view6 = bnv.i(view, 2131427467);
        this.c = view5 = view.findViewWithTag((Object)"car_ui_left_inset");
        this.d = view4 = view.findViewWithTag((Object)"car_ui_right_inset");
        this.e = view3 = view.findViewWithTag((Object)"car_ui_top_inset");
        this.f = view = view.findViewWithTag((Object)"car_ui_bottom_inset");
        bkg bkg2 = new bkg(this);
        if (view5 != null) {
            view5.addOnLayoutChangeListener((View.OnLayoutChangeListener)bkg2);
        }
        if (view4 != null) {
            view4.addOnLayoutChangeListener((View.OnLayoutChangeListener)bkg2);
        }
        if (view3 != null) {
            view3.addOnLayoutChangeListener((View.OnLayoutChangeListener)bkg2);
        }
        if (view != null) {
            view.addOnLayoutChangeListener((View.OnLayoutChangeListener)bkg2);
        }
        view2.addOnLayoutChangeListener((View.OnLayoutChangeListener)bkg2);
        view6.addOnLayoutChangeListener((View.OnLayoutChangeListener)bkg2);
    }

    public static int a(View view) {
        int[] nArray = new int[2];
        view.getLocationOnScreen(nArray);
        return nArray[1] + view.getHeight();
    }

    public static int b(View view) {
        int[] nArray = new int[2];
        view.getLocationOnScreen(nArray);
        return nArray[0];
    }

    public static int c(View view) {
        int[] nArray = new int[2];
        view.getLocationOnScreen(nArray);
        return nArray[0] + view.getWidth();
    }

    public static int d(View view) {
        int[] nArray = new int[2];
        view.getLocationOnScreen(nArray);
        return nArray[1];
    }
}

