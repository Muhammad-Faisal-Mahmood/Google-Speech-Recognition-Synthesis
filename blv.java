/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.android.car.ui.recyclerview.DefaultScrollBar;

public final class blv
implements View.OnClickListener {
    public final DefaultScrollBar a;

    public /* synthetic */ blv(DefaultScrollBar defaultScrollBar) {
        this.a = defaultScrollBar;
    }

    public final void onClick(View view) {
        this.a.lambda$initialize$1$com-android-car-ui-recyclerview-DefaultScrollBar(view);
    }
}

