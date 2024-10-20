/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Insets
 *  android.view.View
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.WindowInsets
 *  android.view.WindowInsets$Builder
 */
import android.graphics.Insets;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

public final class bkf
implements View.OnApplyWindowInsetsListener {
    public final boolean a;

    public /* synthetic */ bkf(boolean bl2) {
        this.a = bl2;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int n2;
        boolean bl2 = this.a;
        int n3 = n2 = sk$$ExternalSyntheticApiModelOutline1.m$4();
        if (!bl2) {
            n3 = n2 | sk$$ExternalSyntheticApiModelOutline1.m$3();
        }
        Insets insets = sk$$ExternalSyntheticApiModelOutline1.m(windowInsets, n3);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        marginLayoutParams.topMargin = dp$$ExternalSyntheticApiModelOutline0.m$1(insets);
        marginLayoutParams.leftMargin = dp$$ExternalSyntheticApiModelOutline0.m$3(insets);
        marginLayoutParams.bottomMargin = dp$$ExternalSyntheticApiModelOutline0.m$2(insets);
        marginLayoutParams.rightMargin = dp$$ExternalSyntheticApiModelOutline0.m(insets);
        view.setLayoutParams((ViewGroup.LayoutParams)marginLayoutParams);
        return view.onApplyWindowInsets(dp$$ExternalSyntheticApiModelOutline0.m(sk$$ExternalSyntheticApiModelOutline1.m(new WindowInsets.Builder(windowInsets), n3, dp$$ExternalSyntheticApiModelOutline0.m())));
    }
}

