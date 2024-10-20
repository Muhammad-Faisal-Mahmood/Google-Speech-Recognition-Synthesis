/*
 * Decompiled with CFR 0.152.
 */
import com.android.car.ui.recyclerview.DefaultScrollBar;

public final class blx
extends kh {
    final DefaultScrollBar a;

    public blx(DefaultScrollBar defaultScrollBar) {
        this.a = defaultScrollBar;
    }

    @Override
    public final void onChanged() {
        DefaultScrollBar.-$$Nest$mclearCachedHeights(this.a);
        DefaultScrollBar.-$$Nest$mupdatePaginationButtons(this.a);
    }

    @Override
    public final void onItemRangeChanged(int n2, int n3) {
        DefaultScrollBar.-$$Nest$mclearCachedHeights(this.a);
        DefaultScrollBar.-$$Nest$mupdatePaginationButtons(this.a);
    }

    @Override
    public final void onItemRangeChanged(int n2, int n3, Object object) {
        DefaultScrollBar.-$$Nest$mclearCachedHeights(this.a);
        DefaultScrollBar.-$$Nest$mupdatePaginationButtons(this.a);
    }

    @Override
    public final void onItemRangeInserted(int n2, int n3) {
        DefaultScrollBar.-$$Nest$mclearCachedHeights(this.a);
        DefaultScrollBar.-$$Nest$mupdatePaginationButtons(this.a);
    }

    @Override
    public final void onItemRangeMoved(int n2, int n3, int n4) {
        DefaultScrollBar.-$$Nest$mclearCachedHeights(this.a);
        DefaultScrollBar.-$$Nest$mupdatePaginationButtons(this.a);
    }

    @Override
    public final void onItemRangeRemoved(int n2, int n3) {
        DefaultScrollBar.-$$Nest$mclearCachedHeights(this.a);
        DefaultScrollBar.-$$Nest$mupdatePaginationButtons(this.a);
    }
}

