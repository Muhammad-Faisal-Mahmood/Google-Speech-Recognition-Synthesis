/*
 * Decompiled with CFR 0.152.
 */
import android.support.v7.widget.RecyclerView;
import com.android.car.ui.recyclerview.DefaultScrollBar;

public final class bly
extends kt {
    final DefaultScrollBar a;

    public bly(DefaultScrollBar defaultScrollBar) {
        this.a = defaultScrollBar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int n2, int n3) {
        DefaultScrollBar.-$$Nest$mupdatePaginationButtons(this.a);
        DefaultScrollBar.-$$Nest$mcacheChildrenHeight(this.a, recyclerView.n);
    }
}

