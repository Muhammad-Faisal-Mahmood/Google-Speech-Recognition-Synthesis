/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.car.ui.recyclerview.CarUiRecyclerView;

public final class bmb
extends RecyclerView {
    private final CarUiRecyclerView ac;

    public bmb(Context context, CarUiRecyclerView carUiRecyclerView) {
        super(context);
        this.ac = carUiRecyclerView;
    }

    @Override
    public final void M() {
        this.ac.invalidateItemDecorations();
    }

    @Override
    public final void Z(int n2) {
        this.ac.scrollToPosition(n2);
    }

    @Override
    public final void ab(kf kf2) {
        this.ac.setAdapter(kf2);
    }

    public final void focusableViewAvailable(View view) {
        this.ac.focusableViewAvailable(view);
    }

    @Override
    public final kf g() {
        return this.ac.getAdapter();
    }

    @Override
    public final void t(kl kl2) {
        this.ac.addItemDecoration(kl2);
    }
}

