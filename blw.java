/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnLayoutChangeListener
 */
import android.view.View;
import com.android.car.ui.recyclerview.DefaultScrollBar;

public final class blw
implements View.OnLayoutChangeListener {
    public final DefaultScrollBar a;

    public /* synthetic */ blw(DefaultScrollBar defaultScrollBar) {
        this.a = defaultScrollBar;
    }

    public final void onLayoutChange(View view, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        this.a.lambda$initialize$2$com-android-car-ui-recyclerview-DefaultScrollBar(view, n2, n3, n4, n5, n6, n7, n8, n9);
    }
}

